//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:35 PM GMT+08:00 
//


package com.amazonaws.mws.model.response;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariationChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationChildType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mws.amazonservices.com/schema/Products/2011-10-01}BaseRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flavor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GemType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GolfClubFlex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GolfClubLoft" type="{http://mws.amazonservices.com/schema/Products/2011-10-01/default.xsd}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="HandOrientation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDimensions" type="{http://mws.amazonservices.com/schema/Products/2011-10-01/default.xsd}DimensionType" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MetalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ProductTypeSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RingSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShaftMaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizePerPearl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalDiamondWeight" type="{http://mws.amazonservices.com/schema/Products/2011-10-01/default.xsd}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="TotalGemWeight" type="{http://mws.amazonservices.com/schema/Products/2011-10-01/default.xsd}DecimalWithUnits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationChildType", namespace = "http://mws.amazonservices.com/schema/Products/2011-10-01/default.xsd", propOrder = {
    "color",
    "edition",
    "flavor",
    "gemType",
    "golfClubFlex",
    "golfClubLoft",
    "handOrientation",
    "hardwarePlatform",
    "itemDimensions",
    "materialType",
    "metalType",
    "model",
    "operatingSystem",
    "packageQuantity",
    "productTypeSubcategory",
    "ringSize",
    "shaftMaterial",
    "scent",
    "size",
    "sizePerPearl",
    "totalDiamondWeight",
    "totalGemWeight"
})
public class VariationChildType
    extends BaseRelationshipType
{

    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Edition")
    protected String edition;
    @XmlElement(name = "Flavor")
    protected String flavor;
    @XmlElement(name = "GemType")
    protected List<String> gemType;
    @XmlElement(name = "GolfClubFlex")
    protected String golfClubFlex;
    @XmlElement(name = "GolfClubLoft")
    protected DecimalWithUnits golfClubLoft;
    @XmlElement(name = "HandOrientation")
    protected String handOrientation;
    @XmlElement(name = "HardwarePlatform")
    protected String hardwarePlatform;
    @XmlElement(name = "ItemDimensions")
    protected DimensionType itemDimensions;
    @XmlElement(name = "MaterialType")
    protected List<String> materialType;
    @XmlElement(name = "MetalType")
    protected String metalType;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "OperatingSystem")
    protected List<String> operatingSystem;
    @XmlElement(name = "PackageQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageQuantity;
    @XmlElement(name = "ProductTypeSubcategory")
    protected String productTypeSubcategory;
    @XmlElement(name = "RingSize")
    protected String ringSize;
    @XmlElement(name = "ShaftMaterial")
    protected String shaftMaterial;
    @XmlElement(name = "Scent")
    protected String scent;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "SizePerPearl")
    protected String sizePerPearl;
    @XmlElement(name = "TotalDiamondWeight")
    protected DecimalWithUnits totalDiamondWeight;
    @XmlElement(name = "TotalGemWeight")
    protected DecimalWithUnits totalGemWeight;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the flavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the value of the flavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavor(String value) {
        this.flavor = value;
    }

    /**
     * Gets the value of the gemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGemType() {
        if (gemType == null) {
            gemType = new ArrayList<String>();
        }
        return this.gemType;
    }

    /**
     * Gets the value of the golfClubFlex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGolfClubFlex() {
        return golfClubFlex;
    }

    /**
     * Sets the value of the golfClubFlex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGolfClubFlex(String value) {
        this.golfClubFlex = value;
    }

    /**
     * Gets the value of the golfClubLoft property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getGolfClubLoft() {
        return golfClubLoft;
    }

    /**
     * Sets the value of the golfClubLoft property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setGolfClubLoft(DecimalWithUnits value) {
        this.golfClubLoft = value;
    }

    /**
     * Gets the value of the handOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOrientation() {
        return handOrientation;
    }

    /**
     * Sets the value of the handOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOrientation(String value) {
        this.handOrientation = value;
    }

    /**
     * Gets the value of the hardwarePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * Sets the value of the hardwarePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Gets the value of the itemDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getItemDimensions() {
        return itemDimensions;
    }

    /**
     * Sets the value of the itemDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setItemDimensions(DimensionType value) {
        this.itemDimensions = value;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaterialType() {
        if (materialType == null) {
            materialType = new ArrayList<String>();
        }
        return this.materialType;
    }

    /**
     * Gets the value of the metalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalType() {
        return metalType;
    }

    /**
     * Sets the value of the metalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalType(String value) {
        this.metalType = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * Gets the value of the packageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Sets the value of the packageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageQuantity(BigInteger value) {
        this.packageQuantity = value;
    }

    /**
     * Gets the value of the productTypeSubcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeSubcategory() {
        return productTypeSubcategory;
    }

    /**
     * Sets the value of the productTypeSubcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeSubcategory(String value) {
        this.productTypeSubcategory = value;
    }

    /**
     * Gets the value of the ringSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSize() {
        return ringSize;
    }

    /**
     * Sets the value of the ringSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSize(String value) {
        this.ringSize = value;
    }

    /**
     * Gets the value of the shaftMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShaftMaterial() {
        return shaftMaterial;
    }

    /**
     * Sets the value of the shaftMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShaftMaterial(String value) {
        this.shaftMaterial = value;
    }

    /**
     * Gets the value of the scent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScent() {
        return scent;
    }

    /**
     * Sets the value of the scent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScent(String value) {
        this.scent = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizePerPearl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePerPearl() {
        return sizePerPearl;
    }

    /**
     * Sets the value of the sizePerPearl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePerPearl(String value) {
        this.sizePerPearl = value;
    }

    /**
     * Gets the value of the totalDiamondWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getTotalDiamondWeight() {
        return totalDiamondWeight;
    }

    /**
     * Sets the value of the totalDiamondWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setTotalDiamondWeight(DecimalWithUnits value) {
        this.totalDiamondWeight = value;
    }

    /**
     * Gets the value of the totalGemWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getTotalGemWeight() {
        return totalGemWeight;
    }

    /**
     * Sets the value of the totalGemWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setTotalGemWeight(DecimalWithUnits value) {
        this.totalGemWeight = value;
    }

}