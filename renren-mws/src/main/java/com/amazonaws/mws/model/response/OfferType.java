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
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyingPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}PriceType"/>
 *         &lt;element name="RegularPrice" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}MoneyType"/>
 *         &lt;element name="FulfillmentChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemSubCondition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "buyingPrice",
    "regularPrice",
    "fulfillmentChannel",
    "itemCondition",
    "itemSubCondition",
    "sellerId",
    "sellerSKU"
})
public class OfferType {

    @XmlElement(name = "BuyingPrice", required = true)
    protected PriceType buyingPrice;
    @XmlElement(name = "RegularPrice", required = true)
    protected MoneyType regularPrice;
    @XmlElement(name = "FulfillmentChannel", required = true)
    protected String fulfillmentChannel;
    @XmlElement(name = "ItemCondition", required = true)
    protected String itemCondition;
    @XmlElement(name = "ItemSubCondition", required = true)
    protected String itemSubCondition;
    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name = "SellerSKU", required = true)
    protected String sellerSKU;

    /**
     * Gets the value of the buyingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * Sets the value of the buyingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setBuyingPrice(PriceType value) {
        this.buyingPrice = value;
    }

    /**
     * Gets the value of the regularPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getRegularPrice() {
        return regularPrice;
    }

    /**
     * Sets the value of the regularPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setRegularPrice(MoneyType value) {
        this.regularPrice = value;
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
     * Gets the value of the itemSubCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSubCondition() {
        return itemSubCondition;
    }

    /**
     * Sets the value of the itemSubCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSubCondition(String value) {
        this.itemSubCondition = value;
    }

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Sets the value of the sellerSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerSKU(String value) {
        this.sellerSKU = value;
    }

}
