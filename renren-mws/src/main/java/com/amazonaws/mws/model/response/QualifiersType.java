//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:35 PM GMT+08:00 
//


package com.amazonaws.mws.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemSubcondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipsDomestically" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingTime" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}ShippingTimeType"/>
 *         &lt;element name="SellerPositiveFeedbackRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiersType", propOrder = {
    "itemCondition",
    "itemSubcondition",
    "fulfillmentChannel",
    "shipsDomestically",
    "shippingTime",
    "sellerPositiveFeedbackRating"
})
public class QualifiersType {

    @XmlElement(name = "ItemCondition", required = true)
    protected String itemCondition;
    @XmlElement(name = "ItemSubcondition", required = true)
    protected String itemSubcondition;
    @XmlElement(name = "FulfillmentChannel", required = true)
    protected String fulfillmentChannel;
    @XmlElement(name = "ShipsDomestically", required = true)
    protected String shipsDomestically;
    @XmlElement(name = "ShippingTime", required = true)
    protected ShippingTimeType shippingTime;
    @XmlElement(name = "SellerPositiveFeedbackRating", required = true)
    protected String sellerPositiveFeedbackRating;

    /**
     * Gets the value of the itemCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCondition() {
        return itemCondition;
    }

    /**
     * Sets the value of the itemCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCondition(String value) {
        this.itemCondition = value;
    }

    /**
     * Gets the value of the itemSubcondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSubcondition() {
        return itemSubcondition;
    }

    /**
     * Sets the value of the itemSubcondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSubcondition(String value) {
        this.itemSubcondition = value;
    }

    /**
     * Gets the value of the fulfillmentChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * Sets the value of the fulfillmentChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentChannel(String value) {
        this.fulfillmentChannel = value;
    }

    /**
     * Gets the value of the shipsDomestically property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipsDomestically() {
        return shipsDomestically;
    }

    /**
     * Sets the value of the shipsDomestically property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipsDomestically(String value) {
        this.shipsDomestically = value;
    }

    /**
     * Gets the value of the shippingTime property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingTimeType }
     *     
     */
    public ShippingTimeType getShippingTime() {
        return shippingTime;
    }

    /**
     * Sets the value of the shippingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTimeType }
     *     
     */
    public void setShippingTime(ShippingTimeType value) {
        this.shippingTime = value;
    }

    /**
     * Gets the value of the sellerPositiveFeedbackRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerPositiveFeedbackRating() {
        return sellerPositiveFeedbackRating;
    }

    /**
     * Sets the value of the sellerPositiveFeedbackRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerPositiveFeedbackRating(String value) {
        this.sellerPositiveFeedbackRating = value;
    }

}