//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 03:34:40 PM EST 
//


package org.hros.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayRateIntervalCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayRateIntervalCodeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Hour"/&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="TwoWeeks"/&gt;
 *     &lt;enumeration value="FourWeeks"/&gt;
 *     &lt;enumeration value="HalfMonth"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *     &lt;enumeration value="TwoMonths"/&gt;
 *     &lt;enumeration value="Quarter"/&gt;
 *     &lt;enumeration value="SeasonalTerm"/&gt;
 *     &lt;enumeration value="Year"/&gt;
 *     &lt;enumeration value="QuarterTo Date"/&gt;
 *     &lt;enumeration value="YearToDate"/&gt;
 *     &lt;enumeration value="Once"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayRateIntervalCodeList")
@XmlEnum
public enum PayRateIntervalCodeList {

    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),
    @XmlEnumValue("FourWeeks")
    FOUR_WEEKS("FourWeeks"),
    @XmlEnumValue("HalfMonth")
    HALF_MONTH("HalfMonth"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("TwoMonths")
    TWO_MONTHS("TwoMonths"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("SeasonalTerm")
    SEASONAL_TERM("SeasonalTerm"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("QuarterTo Date")
    QUARTER_TO_DATE("QuarterTo Date"),
    @XmlEnumValue("YearToDate")
    YEAR_TO_DATE("YearToDate"),
    @XmlEnumValue("Once")
    ONCE("Once");
    private final String value;

    PayRateIntervalCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayRateIntervalCodeList fromValue(String v) {
        for (PayRateIntervalCodeList c: PayRateIntervalCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
