package com.amazonaws.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Contants {

	public static final String ACCESS_KEY_ID = "AKIAJDQFOB6CWVKDKYXQ";

	public static final String SELLER_ID = "A1WUZSL0EJXK6U";

	public static final String SECRET_ACCESS_KEY = "+ZVwH6QnatKrmUbcFmULjQAIgGg1IzIK1BOWDcJU";

	public static final String APP_NAME = "QBMWS";

	public static final String APP_VERSION = "0.0.1";

	public static final String MWS_Auth_Token = "9179-4774-6469";

	public static final String MERCHANT_ID_CA = "A2EUQ1WTGCTBG2";

	public static final String MERCHANT_ID_COM = "ATVPDKIKX0DER";

	public static final String MERCHANT_ID_COM_MX = "A1AM78C64UM0Y8";

	public static final String MARKETPLACE_ID_CA = "A2EUQ1WTGCTBG2";

	public static final String MARKETPLACE_ID_US = "ATVPDKIKX0DER";

	public static final String FEED_TYPE = "ATVPDKIKX0DER";
	
	public static final String XMLNS_PATTERN = "xmlns([^ ]*)=([^ ]*)http([^>^\"]*)\"";

	/**
	 * Calculate content MD5 header values for feeds stored on disk.
	 */
	public static String computeContentMD5HeaderValue(FileInputStream fis)
			throws IOException, NoSuchAlgorithmException {

		DigestInputStream dis = new DigestInputStream(fis, MessageDigest.getInstance("MD5"));

		byte[] buffer = new byte[8192];
		while (dis.read(buffer) > 0)
			;

		String md5Content = new String(
				org.apache.commons.codec.binary.Base64.encodeBase64(dis.getMessageDigest().digest()));

		// Effectively resets the stream to be beginning of the file
		// via a FileChannel.
		fis.getChannel().position(0);

		return md5Content;
	}

	/**
	 * Calculate content MD5 header values for feeds.
	 */
	public static String computeContentMD5HeaderValue(InputStream inputStream)
			throws IOException, NoSuchAlgorithmException {

		DigestInputStream dis = new DigestInputStream(inputStream, MessageDigest.getInstance("MD5"));

		String md5Content = new String(
				org.apache.commons.codec.binary.Base64.encodeBase64(dis.getMessageDigest().digest()));

		return md5Content;
	}

	public static String getMD5(String str) throws Exception {
		try {
			// 生成一个MD5加密计算摘要
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 计算md5函数
			md.update(str.getBytes());
			// digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			// BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1, md.digest()).toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。
	 */
	public static InputStream readFileByBytes(String fileName) {
		File file = new File(fileName);
		InputStream in = null;
		System.out.println("以字节为单位读取文件内容，一次读一个字节：");
		// 一次读一个字节
		try {
			in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return in;
	}

	/**
	 * 显示输入流中还剩的字节数
	 */
	private static void showAvailableBytes(InputStream in) {
		try {
			System.out.println("当前字节输入流中的字节数为:" + in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
