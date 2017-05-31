//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:35 PM GMT+08:00 
//


package com.amazonaws.mws.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyBoxPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyBoxPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LandedPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/>
 *         &lt;element name="ListingPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/>
 *         &lt;element name="Shipping" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/>
 *         &lt;element name="Points" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Points" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="condition" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyBoxPriceType", propOrder = {
    "landedPrice",
    "listingPrice",
    "shipping",
    "points"
})
public class BuyBoxPriceType {

    @XmlElement(name = "LandedPrice", required = true)
    protected MoneyType landedPrice;
    @XmlElement(name = "ListingPrice", required = true)
    protected MoneyType listingPrice;
    @XmlElement(name = "Shipping", required = true)
    protected MoneyType shipping;
    @XmlElement(name = "Points")
    protected Points points;
    @XmlAttribute(name = "condition", required = true)
    protected String condition;

    /**
     * Gets the value of the landedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getLandedPrice() {
        return landedPrice;
    }

    /**
     * Sets the value of the landedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setLandedPrice(MoneyType value) {
        this.landedPrice = value;
    }

    /**
     * Gets the value of the listingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getListingPrice() {
        return listingPrice;
    }

    /**
     * Sets the value of the listingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setListingPrice(MoneyType value) {
        this.listingPrice = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setShipping(MoneyType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Points }
     *     
     */
    public Points getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Points }
     *     
     */
    public void setPoints(Points value) {
        this.points = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
