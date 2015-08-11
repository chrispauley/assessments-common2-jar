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
 * <p>Java class for CourtLevelTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CourtLevelTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="CountyCity"/>
 *     &lt;enumeration value="FederalBankruptcy"/>
 *     &lt;enumeration value="FederalCivil"/>
 *     &lt;enumeration value="FederalCriminal"/>
 *     &lt;enumeration value="Statewide"/>
 *     &lt;enumeration value="Tertiary"/>
 *     &lt;enumeration value="Municipalities"/>
 *     &lt;enumeration value="Providences"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CourtLevelTypeCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum CourtLevelTypeCodeEnumType {

    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("County")
    COUNTY("County"),

    /**
     * Sometimes referred to as nationwide.
     * 
     */
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("CountyCity")
    COUNTY_CITY("CountyCity"),
    @XmlEnumValue("FederalBankruptcy")
    FEDERAL_BANKRUPTCY("FederalBankruptcy"),
    @XmlEnumValue("FederalCivil")
    FEDERAL_CIVIL("FederalCivil"),
    @XmlEnumValue("FederalCriminal")
    FEDERAL_CRIMINAL("FederalCriminal"),
    @XmlEnumValue("Statewide")
    STATEWIDE("Statewide"),
    @XmlEnumValue("Tertiary")
    TERTIARY("Tertiary"),
    @XmlEnumValue("Municipalities")
    MUNICIPALITIES("Municipalities"),

    /**
     * Act of providence is an accident against which ordinary skill and foresight could not guard. This is synonymous to act of God. For certain acts no one can be held responsible.
     * 
     */
    @XmlEnumValue("Providences")
    PROVIDENCES("Providences");
    private final String value;

    CourtLevelTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CourtLevelTypeCodeEnumType fromValue(String v) {
        for (CourtLevelTypeCodeEnumType c: CourtLevelTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}