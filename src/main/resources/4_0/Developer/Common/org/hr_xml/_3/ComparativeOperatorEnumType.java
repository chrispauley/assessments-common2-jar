//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:08:51 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparativeOperatorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparativeOperatorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="LessThanOrEqualTo"/>
 *     &lt;enumeration value="GreaterThanOrEqualTo"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="NotEqualTo"/>
 *     &lt;enumeration value="NotLessThan"/>
 *     &lt;enumeration value="NotGreaterThan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparativeOperatorEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ComparativeOperatorEnumType {

    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo"),
    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("NotEqualTo")
    NOT_EQUAL_TO("NotEqualTo"),
    @XmlEnumValue("NotLessThan")
    NOT_LESS_THAN("NotLessThan"),
    @XmlEnumValue("NotGreaterThan")
    NOT_GREATER_THAN("NotGreaterThan");
    private final String value;

    ComparativeOperatorEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparativeOperatorEnumType fromValue(String v) {
        for (ComparativeOperatorEnumType c: ComparativeOperatorEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}