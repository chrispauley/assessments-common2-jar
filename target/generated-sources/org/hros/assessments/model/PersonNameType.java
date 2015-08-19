//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.19 at 01:19:30 PM EDT 
//


package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * 				Various uses and options are supported. 
 * 				
 * 				The person name model is intended to be useful across many cultural contexts.
 * 				The ordering and presentation of given names and family names may vary by 
 * 				cultural custom. 
 * 
 * 				A person name can be represented as a formatted string "Mr. John L Smith III, Phd" or 
 * 				represented as discretely fielded data or both.
 * 				
 * 				An option to present a name in an alternative "alphabet" or script is supported. For
 * 				example the same name might be presented using Roman, Kanji, Arabic, or
 * 				other character sets. Note the term "script" versus "character set" is used so as not 
 * 				to confuse this issue with concepts such as "character encoding". 
 * 				
 * 			
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}PersonNameBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateScriptPersonName" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scriptCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "alternateScriptPersonName",
    "userArea"
})
public class PersonNameType
    extends PersonNameBaseType
{

    @XmlElement(name = "AlternateScriptPersonName")
    protected List<Object> alternateScriptPersonName;
    @XmlElement(name = "UserArea")
    protected Object userArea;
    @XmlAttribute(name = "scriptCode")
    protected String scriptCode;

    /**
     * Gets the value of the alternateScriptPersonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateScriptPersonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateScriptPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAlternateScriptPersonName() {
        if (alternateScriptPersonName == null) {
            alternateScriptPersonName = new ArrayList<Object>();
        }
        return this.alternateScriptPersonName;
    }

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUserArea(Object value) {
        this.userArea = value;
    }

    /**
     * Gets the value of the scriptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptCode() {
        return scriptCode;
    }

    /**
     * Sets the value of the scriptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptCode(String value) {
        this.scriptCode = value;
    }

}