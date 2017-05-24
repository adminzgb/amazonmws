package io.renren.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-22 23:11:09
 */
public class MwsSellerEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private String id;
	//用户ID
	private Long userId;
	//
	private String accessKeyId;
	//
	private String sellerId;
	//secret_access_key
	private String secretAccessKey;
	//APP_NAME
	private String appName;
	//APP_VERSION
	private String appVersion;
	//MWS_AUTH_TOKEN
	private String mwsAuthToken;
	//MARKETPLACE_ID_CA
	private String marketplaceIdCa;
	//MARKETPLACE_ID_US
	private String marketplaceIdUs;
	//MERCHANT_ID_CA
	private String merchantIdCa;
	//MERCHANT_ID_COM
	private String maerchantIdCom;
	//MERCHANT_ID_COM_MX
	private String maerchantIdComMx;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}
	/**
	 * 获取：
	 */
	public String getAccessKeyId() {
		return accessKeyId;
	}
	/**
	 * 设置：
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	/**
	 * 获取：
	 */
	public String getSellerId() {
		return sellerId;
	}
	/**
	 * 设置：secret_access_key
	 */
	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}
	/**
	 * 获取：secret_access_key
	 */
	public String getSecretAccessKey() {
		return secretAccessKey;
	}
	/**
	 * 设置：APP_NAME
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * 获取：APP_NAME
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * 设置：APP_VERSION
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	/**
	 * 获取：APP_VERSION
	 */
	public String getAppVersion() {
		return appVersion;
	}
	/**
	 * 设置：MWS_AUTH_TOKEN
	 */
	public void setMwsAuthToken(String mwsAuthToken) {
		this.mwsAuthToken = mwsAuthToken;
	}
	/**
	 * 获取：MWS_AUTH_TOKEN
	 */
	public String getMwsAuthToken() {
		return mwsAuthToken;
	}
	/**
	 * 设置：MARKETPLACE_ID_CA
	 */
	public void setMarketplaceIdCa(String marketplaceIdCa) {
		this.marketplaceIdCa = marketplaceIdCa;
	}
	/**
	 * 获取：MARKETPLACE_ID_CA
	 */
	public String getMarketplaceIdCa() {
		return marketplaceIdCa;
	}
	/**
	 * 设置：MARKETPLACE_ID_US
	 */
	public void setMarketplaceIdUs(String marketplaceIdUs) {
		this.marketplaceIdUs = marketplaceIdUs;
	}
	/**
	 * 获取：MARKETPLACE_ID_US
	 */
	public String getMarketplaceIdUs() {
		return marketplaceIdUs;
	}
	/**
	 * 设置：MERCHANT_ID_CA
	 */
	public void setMerchantIdCa(String merchantIdCa) {
		this.merchantIdCa = merchantIdCa;
	}
	/**
	 * 获取：MERCHANT_ID_CA
	 */
	public String getMerchantIdCa() {
		return merchantIdCa;
	}
	/**
	 * 设置：MERCHANT_ID_COM
	 */
	public void setMaerchantIdCom(String maerchantIdCom) {
		this.maerchantIdCom = maerchantIdCom;
	}
	/**
	 * 获取：MERCHANT_ID_COM
	 */
	public String getMaerchantIdCom() {
		return maerchantIdCom;
	}
	/**
	 * 设置：MERCHANT_ID_COM_MX
	 */
	public void setMaerchantIdComMx(String maerchantIdComMx) {
		this.maerchantIdComMx = maerchantIdComMx;
	}
	/**
	 * 获取：MERCHANT_ID_COM_MX
	 */
	public String getMaerchantIdComMx() {
		return maerchantIdComMx;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
