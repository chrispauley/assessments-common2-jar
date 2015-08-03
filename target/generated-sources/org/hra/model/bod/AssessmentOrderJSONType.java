//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 11:25:30 AM EDT 
//


package org.hra.model.bod;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentOrderJSONType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentOrderJSONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JobTitleID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExternalApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalPersonID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalJobReqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnURL" type="{}URIType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{}IdentifierType"/&gt;
 *         &lt;element name="RedirectURL" type="{}URIType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="majorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minorVersionID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="systemEnvironmentCode" type="{http://www.w3.org/2001/XMLSchema}string" default="Development" /&gt;
 *       &lt;attribute name="releaseID" type="{http://www.w3.org/2001/XMLSchema}string" default="4.0" /&gt;
 *       &lt;attribute name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" default="en" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentOrderJSONType", propOrder = {
    "clientID",
    "clientPwd",
    "customerName",
    "assessmentID",
    "jobTitleID",
    "firstName",
    "lastName",
    "email",
    "externalApplicationID",
    "externalPersonID",
    "externalJobReqID",
    "orderID",
    "returnURL",
    "documentSequence",
    "packageID",
    "redirectURL"
})
public class AssessmentOrderJSONType {

    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClientPwd")
    protected String clientPwd;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "AssessmentID", required = true)
    protected String assessmentID;
    @XmlElement(name = "JobTitleID", required = true)
    protected String jobTitleID;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "ExternalApplicationID")
    protected String externalApplicationID;
    @XmlElement(name = "ExternalPersonID")
    protected String externalPersonID;
    @XmlElement(name = "ExternalJobReqID")
    protected String externalJobReqID;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "ReturnURL")
    @XmlSchemaType(name = "anyURI")
    protected String returnURL;
    @XmlElement(name = "DocumentSequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentSequence;
    @XmlElement(name = "PackageID", required = true)
    protected IdentifierType packageID;
    @XmlElement(name = "RedirectURL")
    @XmlSchemaType(name = "anyURI")
    protected String redirectURL;
    @XmlAttribute(name = "majorVersionID")
    protected String majorVersionID;
    @XmlAttribute(name = "minorVersionID")
    protected String minorVersionID;
    @XmlAttribute(name = "systemEnvironmentCode")
    protected String systemEnvironmentCode;
    @XmlAttribute(name = "releaseID")
    protected String releaseID;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPwd() {
        return clientPwd;
    }

    /**
     * Sets the value of the clientPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPwd(String value) {
        this.clientPwd = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the assessmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentID() {
        return assessmentID;
    }

    /**
     * Sets the value of the assessmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentID(String value) {
        this.assessmentID = value;
    }

    /**
     * Gets the value of the jobTitleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitleID() {
        return jobTitleID;
    }

    /**
     * Sets the value of the jobTitleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitleID(String value) {
        this.jobTitleID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the externalApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalApplicationID() {
        return externalApplicationID;
    }

    /**
     * Sets the value of the externalApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalApplicationID(String value) {
        this.externalApplicationID = value;
    }

    /**
     * Gets the value of the externalPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPersonID() {
        return externalPersonID;
    }

    /**
     * Sets the value of the externalPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPersonID(String value) {
        this.externalPersonID = value;
    }

    /**
     * Gets the value of the externalJobReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalJobReqID() {
        return externalJobReqID;
    }

    /**
     * Sets the value of the externalJobReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalJobReqID(String value) {
        this.externalJobReqID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the documentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSequence() {
        return documentSequence;
    }

    /**
     * Sets the value of the documentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSequence(BigInteger value) {
        this.documentSequence = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPackageID(IdentifierType value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the redirectURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectURL() {
        return redirectURL;
    }

    /**
     * Sets the value of the redirectURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectURL(String value) {
        this.redirectURL = value;
    }

    /**
     * Gets the value of the majorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorVersionID() {
        return majorVersionID;
    }

    /**
     * Sets the value of the majorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorVersionID(String value) {
        this.majorVersionID = value;
    }

    /**
     * Gets the value of the minorVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorVersionID() {
        return minorVersionID;
    }

    /**
     * Sets the value of the minorVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorVersionID(String value) {
        this.minorVersionID = value;
    }

    /**
     * Gets the value of the systemEnvironmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemEnvironmentCode() {
        if (systemEnvironmentCode == null) {
            return "Development";
        } else {
            return systemEnvironmentCode;
        }
    }

    /**
     * Sets the value of the systemEnvironmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemEnvironmentCode(String value) {
        this.systemEnvironmentCode = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        if (releaseID == null) {
            return "4.0";
        } else {
            return releaseID;
        }
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        if (languageCode == null) {
            return "en";
        } else {
            return languageCode;
        }
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
