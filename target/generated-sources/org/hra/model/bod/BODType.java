//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.01 at 10:47:54 AM EDT 
//


package org.hra.model.bod;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The outcome of processing a specific BOD. Describes overall/summary outcome, plus the outcome of processing each noun of the BOD. Includes noun-specific error and/or warning messaages encountered during processing. May include summary and/or roll-up messages at the BOD level.
 * 
 * <p>Java class for BODType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalApplicationArea" type="{}ApplicationAreaType" minOccurs="0"/&gt;
 *         &lt;group ref="{}FreeFormTextGroup" minOccurs="0"/&gt;
 *         &lt;element name="BODFailureMessage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="BODSuccessMessage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PartialBODFailureMessage" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="UserArea" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BODType", propOrder = {
    "originalApplicationArea",
    "description",
    "note",
    "bodFailureMessage",
    "bodSuccessMessage",
    "partialBODFailureMessage",
    "userArea"
})
public class BODType {

    @XmlElement(name = "OriginalApplicationArea")
    protected ApplicationAreaType originalApplicationArea;
    @XmlElement(name = "Description")
    protected List<Object> description;
    @XmlElement(name = "Note")
    protected List<Object> note;
    @XmlElement(name = "BODFailureMessage")
    protected Object bodFailureMessage;
    @XmlElement(name = "BODSuccessMessage")
    protected Object bodSuccessMessage;
    @XmlElement(name = "PartialBODFailureMessage")
    protected Object partialBODFailureMessage;
    @XmlElement(name = "UserArea")
    protected Object userArea;

    /**
     * Gets the value of the originalApplicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAreaType }
     *     
     */
    public ApplicationAreaType getOriginalApplicationArea() {
        return originalApplicationArea;
    }

    /**
     * Sets the value of the originalApplicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAreaType }
     *     
     */
    public void setOriginalApplicationArea(ApplicationAreaType value) {
        this.originalApplicationArea = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDescription() {
        if (description == null) {
            description = new ArrayList<Object>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNote() {
        if (note == null) {
            note = new ArrayList<Object>();
        }
        return this.note;
    }

    /**
     * Gets the value of the bodFailureMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBODFailureMessage() {
        return bodFailureMessage;
    }

    /**
     * Sets the value of the bodFailureMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBODFailureMessage(Object value) {
        this.bodFailureMessage = value;
    }

    /**
     * Gets the value of the bodSuccessMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBODSuccessMessage() {
        return bodSuccessMessage;
    }

    /**
     * Sets the value of the bodSuccessMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBODSuccessMessage(Object value) {
        this.bodSuccessMessage = value;
    }

    /**
     * Gets the value of the partialBODFailureMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPartialBODFailureMessage() {
        return partialBODFailureMessage;
    }

    /**
     * Sets the value of the partialBODFailureMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPartialBODFailureMessage(Object value) {
        this.partialBODFailureMessage = value;
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

}