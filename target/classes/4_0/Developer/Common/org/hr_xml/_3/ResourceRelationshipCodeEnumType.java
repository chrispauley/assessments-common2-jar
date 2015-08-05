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
 * <p>Java class for ResourceRelationshipCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceRelationshipCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="VendorEmployee"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceRelationshipCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ResourceRelationshipCodeEnumType {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("VendorEmployee")
    VENDOR_EMPLOYEE("VendorEmployee"),

    /**
     * In most contexts, based on applicable law or common law principles, a resource is classified as either an employee or a "vendor employee" (a contractor, self-employed, or employee of another party). The "Other" value might be used in circumstances such as where the resource might be a non-paid "Customer Employee" or other resource that is neither an employee nor vendor employee.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceRelationshipCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceRelationshipCodeEnumType fromValue(String v) {
        for (ResourceRelationshipCodeEnumType c: ResourceRelationshipCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}