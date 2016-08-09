
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PromisedPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromisedPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origPpServiceFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="origPpAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="grantExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="grantExpirationType" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="grantAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="grantActiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="awardedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromisedPayment", propOrder = {
    "origPpServiceFee",
    "origPpAmount",
    "grantExpiryDate",
    "grantExpirationType",
    "grantAmount",
    "grantActiveDate",
    "currency",
    "awardedAmount"
})
public class PromisedPayment {

    protected Double origPpServiceFee;
    protected Double origPpAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar grantExpiryDate;
    protected Byte grantExpirationType;
    protected Double grantAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar grantActiveDate;
    @XmlElement(required = true)
    protected String currency;
    protected Double awardedAmount;

    /**
     * Gets the value of the origPpServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrigPpServiceFee() {
        return origPpServiceFee;
    }

    /**
     * Sets the value of the origPpServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrigPpServiceFee(Double value) {
        this.origPpServiceFee = value;
    }

    /**
     * Gets the value of the origPpAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrigPpAmount() {
        return origPpAmount;
    }

    /**
     * Sets the value of the origPpAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrigPpAmount(Double value) {
        this.origPpAmount = value;
    }

    /**
     * Gets the value of the grantExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantExpiryDate() {
        return grantExpiryDate;
    }

    /**
     * Sets the value of the grantExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantExpiryDate(XMLGregorianCalendar value) {
        this.grantExpiryDate = value;
    }

    /**
     * Gets the value of the grantExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getGrantExpirationType() {
        return grantExpirationType;
    }

    /**
     * Sets the value of the grantExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setGrantExpirationType(Byte value) {
        this.grantExpirationType = value;
    }

    /**
     * Gets the value of the grantAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGrantAmount() {
        return grantAmount;
    }

    /**
     * Sets the value of the grantAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGrantAmount(Double value) {
        this.grantAmount = value;
    }

    /**
     * Gets the value of the grantActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantActiveDate() {
        return grantActiveDate;
    }

    /**
     * Sets the value of the grantActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantActiveDate(XMLGregorianCalendar value) {
        this.grantActiveDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the awardedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAwardedAmount() {
        return awardedAmount;
    }

    /**
     * Sets the value of the awardedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAwardedAmount(Double value) {
        this.awardedAmount = value;
    }

}
