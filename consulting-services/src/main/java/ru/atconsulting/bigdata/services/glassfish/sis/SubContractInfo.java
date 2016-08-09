
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for SubContractInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubContractInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesRepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchEffDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchExpDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cntrctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cntrctStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cntrctNumOfCtns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubContractInfo", propOrder = {
    "agreementNum",
    "applicationType",
    "salesEntityCode",
    "branchCode",
    "salesRep",
    "salesRepCode",
    "purchOrderId",
    "purchEffDt",
    "purchExpDt",
    "cntrctStatus",
    "cntrctStatusDate",
    "cntrctNumOfCtns",
    "registrationDate"
})
public class SubContractInfo implements Serializable {

    protected String agreementNum;
    protected String applicationType;
    protected String salesEntityCode;
    protected String branchCode;
    protected String salesRep;
    protected String salesRepCode;
    protected String purchOrderId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchEffDt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchExpDt;
    protected String cntrctStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cntrctStatusDate;
    protected String cntrctNumOfCtns;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;

    /**
     * Gets the value of the agreementNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNum() {
        return agreementNum;
    }

    /**
     * Sets the value of the agreementNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNum(String value) {
        this.agreementNum = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the salesEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesEntityCode() {
        return salesEntityCode;
    }

    /**
     * Sets the value of the salesEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesEntityCode(String value) {
        this.salesEntityCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRep(String value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the salesRepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepCode() {
        return salesRepCode;
    }

    /**
     * Sets the value of the salesRepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepCode(String value) {
        this.salesRepCode = value;
    }

    /**
     * Gets the value of the purchOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchOrderId() {
        return purchOrderId;
    }

    /**
     * Sets the value of the purchOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchOrderId(String value) {
        this.purchOrderId = value;
    }

    /**
     * Gets the value of the purchEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchEffDt() {
        return purchEffDt;
    }

    /**
     * Sets the value of the purchEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchEffDt(XMLGregorianCalendar value) {
        this.purchEffDt = value;
    }

    /**
     * Gets the value of the purchExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchExpDt() {
        return purchExpDt;
    }

    /**
     * Sets the value of the purchExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchExpDt(XMLGregorianCalendar value) {
        this.purchExpDt = value;
    }

    /**
     * Gets the value of the cntrctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctStatus() {
        return cntrctStatus;
    }

    /**
     * Sets the value of the cntrctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctStatus(String value) {
        this.cntrctStatus = value;
    }

    /**
     * Gets the value of the cntrctStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCntrctStatusDate() {
        return cntrctStatusDate;
    }

    /**
     * Sets the value of the cntrctStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCntrctStatusDate(XMLGregorianCalendar value) {
        this.cntrctStatusDate = value;
    }

    /**
     * Gets the value of the cntrctNumOfCtns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNumOfCtns() {
        return cntrctNumOfCtns;
    }

    /**
     * Sets the value of the cntrctNumOfCtns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNumOfCtns(String value) {
        this.cntrctNumOfCtns = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

}
