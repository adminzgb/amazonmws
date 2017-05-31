package com.gbin.executor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.amazonaws.mws.model.response.ListMatchingProductsResponse;
import com.amazonaws.mws.model.response.ObjectFactory;

public class TestJaxb {

	@Test
	public void test() {
		try {
			final FileReader reader = new FileReader(new File("C:\\Users\\Administrator\\Desktop\\test.xml"));  
			JAXBContext jaxbC = JAXBContext.newInstance(ListMatchingProductsResponse.class);
			Unmarshaller us = jaxbC.createUnmarshaller();
			final SAXParserFactory sax = SAXParserFactory.newInstance();  
			sax.setNamespaceAware(false);// ºöÂÔÃüÃû¿Õ¼ä  
			final XMLReader xmlReader = sax.newSAXParser().getXMLReader();  
			final SAXSource saxSource = new SAXSource(xmlReader, new InputSource(reader));  
			ListMatchingProductsResponse object = (ListMatchingProductsResponse) us.unmarshal(saxSource);
			System.out.println(object.toString());
		} catch (JAXBException | FileNotFoundException | SAXException | ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testWithNameSpace() {
		try {
			final File reader = new File("C:\\Users\\Administrator\\Desktop\\test.xml");  
			JAXBContext jaxbC = JAXBContext.newInstance("com.amazonaws.mws.model.response",ObjectFactory.class.getClassLoader());
			Unmarshaller us = jaxbC.createUnmarshaller();
//			final SAXParserFactory sax = SAXParserFactory.newInstance();  
//			sax.setNamespaceAware(false);// ºöÂÔÃüÃû¿Õ¼ä  
//			final XMLReader xmlReader = sax.newSAXParser().getXMLReader();  
//			final SAXSource saxSource = new SAXSource(xmlReader, new InputSource(reader));  
			@SuppressWarnings("unchecked")
			JAXBElement<ListMatchingProductsResponse> object =  (JAXBElement<ListMatchingProductsResponse>) us.unmarshal(reader);
			ListMatchingProductsResponse response = object.getValue();
			System.out.println(response.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReplaceXmlns(){
		try {
			final FileReader reader = new FileReader(new File("C:\\Users\\Administrator\\Desktop\\test.xml"));
			int ch = 0;  
			StringBuffer strBuffer = new StringBuffer();
	        while((ch = reader.read()) != -1){  
//	            System.out.print((char)ch);  
	            strBuffer.append((char)ch);
	        }  
	        reader.close();  
	        String str = strBuffer.toString().replaceAll("xmlns([^ ]*)=([^ ]*)http([^>^\"]*)\"", "");
	        System.out.println("testreg=" + str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	

}

	
