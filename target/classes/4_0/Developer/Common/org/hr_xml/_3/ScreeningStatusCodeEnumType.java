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
 * <p>Java class for ScreeningStatusCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningStatusCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Fulfilled"/>
 *     &lt;enumeration value="Delayed"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Adjudicated"/>
 *     &lt;enumeration value="Disputed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningStatusCodeEnumType", namespace = "http://www.hr-xml.org/3")
@XmlEnum
public enum ScreeningStatusCodeEnumType {


    /**
     * Indicates the screening has just been received and may or may not
     * 					yet be in progress. Equivalent to "Ordered Created".
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * Indicates that the order is in progress or a result is still pending.
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Indicates that the customer affirmatively canceled the order.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Indicates that order has been closed, usually because it
     * 					  was not possible to fulfill it.
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * Completed contracted services regardless of whether there is result content.
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * Completed contracted services with result content provided.
     * 
     */
    @XmlEnumValue("Fulfilled")
    FULFILLED("Fulfilled"),

    /**
     * Indicates that the order fulfillment is delayed. This may be
     * 					due to information required from the customer or search subject or
     * 					could be due to requirements or a situation associated with a record
     * 					source.
     * 
     */
    @XmlEnumValue("Delayed")
    DELAYED("Delayed"),

    /**
     * Indicates that the customer or designated representative has suspended or
     * 					put the screening order on hold.
     * 
     */
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),

    /**
     * Indicates that an error was found in the payload. 
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * Indicates that customer needs to take further action on the result content.
     * 
     */
    @XmlEnumValue("Adjudicated")
    ADJUDICATED("Adjudicated"),

    /**
     * Indicates that the candidate is disputing the results.
     * 
     */
    @XmlEnumValue("Disputed")
    DISPUTED("Disputed");
    private final String value;

    ScreeningStatusCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningStatusCodeEnumType fromValue(String v) {
        for (ScreeningStatusCodeEnumType c: ScreeningStatusCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
