//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.29 at 10:08:35 PM GMT+08:00 
//


package com.amazonaws.mws.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvalidParameterValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("InvalidParameterValue")
    INVALID_PARAMETER_VALUE("InvalidParameterValue");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}