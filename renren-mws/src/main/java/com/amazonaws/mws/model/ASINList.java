package com.amazonaws.mws.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASINList", propOrder = { "ASIN" })
public class ASINList {

	@XmlElement(name = "ASIN", required = true)
	protected List<String> ASIN;

	/**
	 * Default constructor
	 * 
	 */
	public ASINList() {
		super();
	}

	/**
	 * Value constructor
	 * 
	 */
	public ASINList(final List<String> ASIN) {
		this.ASIN = ASIN;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the id property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getASIN() {
		if (ASIN == null) {
			ASIN = new ArrayList<String>();
		}
		return this.ASIN;
	}

	public boolean isSetASIN() {
		return ((this.ASIN != null) && (!this.ASIN.isEmpty()));
	}

	public void unsetASIN() {
		this.ASIN = null;
	}

	/**
	 * Sets the value of the Id property.
	 * 
	 * @param values
	 * @return this instance
	 */
	public ASINList withASIN(String... values) {
		for (String value : values) {
			getASIN().add(value);
		}
		return this;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param id
	 *            allowed object is {@link String }
	 * 
	 */
	public void setASIN(List<String> ASIN) {
		this.ASIN = ASIN;
	}

	/**
	 * 
	 * XML fragment representation of this object
	 * 
	 * @return XML fragment for this object. Name for outer tag expected to be
	 *         set by calling method. This fragment returns inner properties
	 *         representation only
	 */
	protected String toXMLFragment() {
		StringBuffer xml = new StringBuffer();
		java.util.List<String> ASINList = getASIN();
		for (String ASIN : ASINList) {
			xml.append("<ASIN>");
			xml.append(escapeXML(ASIN));
			xml.append("</ASIN>");
		}
		return xml.toString();
	}

	/**
	 * 
	 * Escape XML special characters
	 */
	private String escapeXML(String string) {
		StringBuffer sb = new StringBuffer();
		int length = string.length();
		for (int i = 0; i < length; ++i) {
			char c = string.charAt(i);
			switch (c) {
			case '&':
				sb.append("&amp;");
				break;
			case '<':
				sb.append("&lt;");
				break;
			case '>':
				sb.append("&gt;");
				break;
			case '\'':
				sb.append("&#039;");
				break;
			case '"':
				sb.append("&quot;");
				break;
			default:
				sb.append(c);
			}
		}
		return sb.toString();
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
	public String toJSONFragment() {
		StringBuffer json = new StringBuffer();
		boolean first = true;
		if (isSetASIN()) {
			if (!first)
				json.append(", ");
			json.append("\"ASIN\" : [");
			java.util.List<String> idList = getASIN();
			for (String id : idList) {
				if (idList.indexOf(id) > 0)
					json.append(", ");
				json.append(quoteJSON(id));
			}
			json.append("]");
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
