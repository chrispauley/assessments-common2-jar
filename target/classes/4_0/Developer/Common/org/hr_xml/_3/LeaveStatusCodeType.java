//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 03:07:29 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Indicates whether the reported or instance of leave is currently active or a inactive.
 * 
 * <p>Java class for LeaveStatusCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaveStatusCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.hr-xml.org/3>ActiveStatusEnumType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaveStatusCodeType", propOrder = {
    "value"
})
public class LeaveStatusCodeType {

    @XmlValue
    protected ActiveStatusEnumType value;

    /**
     * Used to indicate an active or inactive status for an associated entity, record, or condition.
     * 
     * @return
     *     possible object is
     *     {@link ActiveStatusEnumType }
     *     
     */
    public ActiveStatusEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveStatusEnumType }
     *     
     */
    public void setValue(ActiveStatusEnumType value) {
        this.value = value;
    }

}