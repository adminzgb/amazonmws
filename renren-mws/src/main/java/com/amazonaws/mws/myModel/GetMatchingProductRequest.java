
package com.amazonaws.mws.myModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.amazonaws.mws.model.ASINList;
import com.amazonaws.mws.model.IdList;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeedSubmissionIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList" minOccurs="0"/>
 *         &lt;element name="MaxCount" type="{http://mws.amazonaws.com/doc/2009-01-01/}Count" minOccurs="0"/>
 *         &lt;element name="FeedTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/>
 *         &lt;element name="FeedProcessingStatusList" type="{http://mws.amazonaws.com/doc/2009-01-01/}StatusList" minOccurs="0"/>
 *         &lt;element name="SubmittedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubmittedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ASINList" , "mwsAuthToken","sellerId" })
@XmlRootElement(name = "GetMatchingProduct")
public class GetMatchingProductRequest {

	@XmlElement(name = "SellerId")
	protected String sellerId;
	@XmlSchemaType(name = "ASINList")
	protected ASINList ASINList;
	@XmlElement(name = "MWSAuthToken")
	protected String mwsAuthToken;

	/**
	 * Default constructor
	 * 
	 */
	public GetMatchingProductRequest() {
		super();
	}

	/**
	 * Value constructor
	 * 
	 */
	public GetMatchingProductRequest(final String sellerId, final ASINList ASINList) {
		this(sellerId, ASINList, null);
	}

	public GetMatchingProductRequest(final String sellerId, final ASINList ASINList, final String mwsAuthToken) {
		this.sellerId = sellerId;
		this.ASINList = ASINList;
		this.mwsAuthToken = mwsAuthToken;
	}

	/**
	 * Gets the value of the marketplace property.
	 * 
	 *  See {@link #setMarketplace(String)}
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * Sets the value of the marketplace property.
	 * 
	 *  Not used anymore. MWS ignores this parameter, but it is left
	 *             in here for backwards compatibility.
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSellerId(String value) {
		this.sellerId = value;
	}

	/**
	 *  See {@link #setMarketplace(String)}
	 */
	public boolean isSetSellerId() {
		return (this.sellerId != null);
	}

	/**
	 * Gets the value of the merchant property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public ASINList getASINList() {
		return ASINList;
	}

	/**
	 * Sets the value of the merchant property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setASINList(ASINList value) {
		this.ASINList = value;
	}

	public boolean isSetASINList() {
		return (this.ASINList != null);
	}

	/**
	 * Gets the value of the feedSubmissionIdList property.
	 * 
	 * @return possible object is {@link IdList }
	 * 
	 */
	public String getMwsAuthToken() {
		return mwsAuthToken;
	}

	/**
	 * Sets the value of the feedSubmissionIdList property.
	 * 
	 * @param value
	 *            allowed object is {@link IdList }
	 * 
	 */
	public void setMwsAuthToken(String mwsAuthToken) {
		this.mwsAuthToken = mwsAuthToken;
	}

	public boolean isSetMwsAuthToken() {
		return (this.mwsAuthToken != null);
	}

	
	/**
	 * Sets the value of the Marketplace property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductRequest withSellerId(String value) {
		setSellerId(value);
		return this;
	}

	/**
	 * Sets the value of the Merchant property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductRequest withASINList(ASINList value) {
		setASINList(value);
		return this;
	}

	/**
	 * Sets the value of the MWSAuthToken property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductRequest withMWSAuthToken(String value) {
		setMwsAuthToken(value);
		return this;
	}

	/**
	 *
	 * JSON fragment representation of this object
	 *
	 * @return JSON fragment for this object. Name for outer object expected to
	 *         be set by calling method. This fragment returns inner properties
	 *         representation only
	 *
	 */
	protected String toJSONFragment() {
		StringBuffer json = new StringBuffer();
		boolean first = true;
		if (isSetSellerId()) {
			if (!first)
				json.append(", ");
			json.append(quoteJSON("SellerId"));
			json.append(" : ");
			json.append(quoteJSON(getSellerId()));
			first = false;
		}
		if (isSetASINList()) {
			if (!first)
				json.append(", ");
			json.append("\"ASINList\" : {");
			ASINList asinList = getASINList();
			json.append(asinList.toJSONFragment());
			json.append("}");
			first = false;
		}
		
		if (isSetMwsAuthToken()) {
			if (!first)
				json.append(", ");
			json.append(quoteJSON("MWSAuthToken"));
			json.append(" : ");
			json.append(quoteJSON(getMwsAuthToken()));
			first = false;
		}
		return json.toString();
	}

	/**
	 *
	 * Quote JSON string
	 */
	private String quoteJSON(String string) {
		StringBuffer sb = new StringBuffer();
		sb.append("\"");
		int length = string.length();
		for (int i = 0; i < length; ++i) {
			char c = string.charAt(i);
			switch (c) {
			case '"':
				sb.append("\\\"");
				break;
			case '\\':
				sb.append("\\\\");
				break;
			case '/':
				sb.append("\\/");
				break;
			case '\b':
				sb.append("\\b");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			default:
				if (c < ' ') {
					sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
				} else {
					sb.append(c);
				}
			}
		}
		sb.append("\"");
		return sb.toString();
	}

}
