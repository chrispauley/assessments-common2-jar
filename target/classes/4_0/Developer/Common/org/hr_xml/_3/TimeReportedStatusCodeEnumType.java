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
 * <p>Java class for TimeReportedStatusCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeReportedStatusCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Changed"/>
 *     &lt;enumeration value="Unchanged"/>
 *     &lt;enumeration value="Void"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeReportedStatusCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum TimeReportedStatusCodeEnumType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Changed")
    CHANGED("Changed"),
    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),
    @XmlEnumValue("Void")
    VOID("Void");
    private final String value;

    TimeReportedStatusCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeReportedStatusCodeEnumType fromValue(String v) {
        for (TimeReportedStatusCodeEnumType c: TimeReportedStatusCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
