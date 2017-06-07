
package com.amazonaws.mws.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonaws.mws.model.IdList;
import com.amazonaws.mws.model.StatusList;
import com.amazonaws.mws.model.TypeList;

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
 *         &lt;element name="ReportRequestIdList" type="{http://mws.amazonaws.com/doc/2009-01-01/}IdList" minOccurs="0"/>
 *         &lt;element name="ReportTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/>
 *         &lt;element name="ReportProcessingStatusList" type="{http://mws.amazonaws.com/doc/2009-01-01/}StatusList" minOccurs="0"/>
 *         &lt;element name="MaxCount" type="{http://mws.amazonaws.com/doc/2009-01-01/}Count" minOccurs="0"/>
 *         &lt;element name="RequestedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "idList", "idType","marketplaceId",  "mwsAuthToken", "SellerId" })
@XmlRootElement(name = "GetMatchingProductForIdRequest")
public class GetMatchingProductForIdRequest {

	@XmlElement(name = "SellerId", required = true)
	protected String sellerId;
	@XmlElement(name = "MarketplaceId", required = true)
	protected String marketplaceId;
	@XmlElement(name = "idType", required = true)
	protected String idType;
	@XmlElement(name = "IdList")
	protected IdList idList;
	@XmlElement(name = "MWSAuthToken")
	protected String mwsAuthToken;

	/**
	 * Default constructor
	 * 
	 */
	public GetMatchingProductForIdRequest() {
		super();
	}

	/**
	 * Value constructor
	 * 
	 */
	public GetMatchingProductForIdRequest(final String sellerId, final String marketplaceId, final String idType,
			final IdList idList) {
		this(sellerId, marketplaceId, idType, idList, null);
	}

	public GetMatchingProductForIdRequest(final String sellerId, final String marketplaceId, final String idType,
			final IdList idList, final String mwsAuthToken) {
		this.sellerId = sellerId;
		this.marketplaceId = marketplaceId;
		this.idType = idType;
		this.idList = idList;
		this.mwsAuthToken = mwsAuthToken;
	}

	/**
	 * Gets the value of the merchant property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * Sets the value of the merchant property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSellerId(String value) {
		this.sellerId = value;
	}

	public boolean isSetSellerId() {
		return (this.sellerId != null);
	}

	public boolean isSetMarketplaceId() {
		return (this.marketplaceId != null);
	}

	public boolean isSetIdType() {
		return (this.idType != null);
	}

	public boolean isSetIdList() {
		return (this.idList != null);
	}


	public String getMarketplaceId() {
		return marketplaceId;
	}

	public void setMarketplaceId(String marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public IdList getIdList() {
		return idList;
	}

	public void setIdList(IdList idList) {
		this.idList = idList;
	}

	public String getMwsAuthToken() {
		return mwsAuthToken;
	}

	public void setMwsAuthToken(String mwsAuthToken) {
		this.mwsAuthToken = mwsAuthToken;
	}

	/**
	 * Gets the value of the mwsAuthToken property.
	 * 
	 * possible object is {@link String}
	 */
	public String getMWSAuthToken() {
		return mwsAuthToken;
	}

	/**
	 * Sets the value of the mwsAuthToken property
	 * 
	 * @param authTokenValue
	 *            allowed object is {@link String}
	 */
	public void setMWSAuthToken(String authTokenValue) {
		this.mwsAuthToken = authTokenValue;
	}

	public boolean isSetMWSAuthToken() {
		return (this.mwsAuthToken != null);
	}

	/**
	 * Sets the value of the Merchant property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductForIdRequest withSellerId(String value) {
		setSellerId(value);
		return this;
	}

	/**
	 * Sets the value of the MWSAuthToken property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductForIdRequest withMWSAuthToken(String value) {
		setMWSAuthToken(value);
		return this;
	}

	/**
	 * Sets the value of the ReportRequestIdList property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductForIdRequest withMarketplaceId(String marketplaceId) {
		setMarketplaceId(marketplaceId);
		return this;
	}

	/**
	 * Sets the value of the ReportTypeList property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductForIdRequest withIdType(String idType) {
		setIdType(idType);
		return this;
	}

	/**
	 * Sets the value of the ReportProcessingStatusList property.
	 * 
	 * @param value
	 * @return this instance
	 */
	public GetMatchingProductForIdRequest withIdList(IdList idList) {
		setIdList(idList);
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
		if (isSetMarketplaceId()) {
			if (!first)
				json.append(", ");
			json.append(quoteJSON("MarketplaceId"));
			json.append(" : ");
			json.append(quoteJSON(getMarketplaceId()));
			first = false;
		}
		if (isSetIdType()) {
			if (!first)
				json.append(", ");
			json.append(quoteJSON("IdType"));
			json.append(" : ");
			json.append(getIdType());
			first = false;
		}
		if (isSetIdList()) {
			 if (!first) json.append(", ");
	            json.append("\"IdList\" : {");
	            IdList idList = getIdList();
	            json.append(idList.toJSONFragment());
	            json.append("}");
	            first = false;
		}
		if (isSetMWSAuthToken()) {
			if (!first)
				json.append(", ");
			json.append(quoteJSON("MWSAuthToken"));
			json.append(" : ");
			json.append(quoteJSON(getMWSAuthToken()));
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
