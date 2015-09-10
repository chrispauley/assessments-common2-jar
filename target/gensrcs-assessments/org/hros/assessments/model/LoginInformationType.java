//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.10 at 01:41:03 PM EDT 
//


package org.hros.assessments.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information to enable a user to gain access to
 * 				a
 * 				system. This is typically a user name and password, but may include
 * 				other access credentials.
 * 				Authentication information for the sender
 * 				of an HR-XML BOD would generally would be handled a higher level --
 * 				such as the security header of a SOAP envelope. The purpose of this
 * 				type is where such login information needs to be communicated
 * 				between
 * 				trading partners. Examples include system provisioning
 * 				scenarios as well
 * 				as assessment scenarios where an order
 * 				acknowledgement would return a credential for the assessment subject
 * 				to use in gaining access to a test.
 * 			
 * 
 * <p>Java class for LoginInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessCredential" type="{}AccessCredentialType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInformationType", propOrder = {
    "userID",
    "accessCredential"
})
public class LoginInformationType {

    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "AccessCredential")
    protected List<AccessCredentialType> accessCredential;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the accessCredential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessCredential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessCredential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessCredentialType }
     * 
     * 
     */
    public List<AccessCredentialType> getAccessCredential() {
        if (accessCredential == null) {
            accessCredential = new ArrayList<AccessCredentialType>();
        }
        return this.accessCredential;
    }

}