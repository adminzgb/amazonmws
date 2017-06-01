//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:35 PM GMT+08:00 
//


package com.amazonaws.mws.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LowestOfferListingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LowestOfferListingList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowestOfferListing" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestOfferListingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowestOfferListingList", propOrder = {
    "lowestOfferListing"
})
public class LowestOfferListingList {

    @XmlElement(name = "LowestOfferListing")
    protected List<LowestOfferListingType> lowestOfferListing;

    /**
     * Gets the value of the lowestOfferListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowestOfferListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowestOfferListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowestOfferListingType }
     * 
     * 
     */
    public List<LowestOfferListingType> getLowestOfferListing() {
        if (lowestOfferListing == null) {
            lowestOfferListing = new ArrayList<LowestOfferListingType>();
        }
        return this.lowestOfferListing;
    }

}