
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ResponseFTTB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseFTTB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promisedPayment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="customerProfile" type="{urn:gf-subscriber-info-service:xsd}CustomerProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseFTTB", propOrder = {
    "ctn",
    "marketCode",
    "status",
    "promisedPayment",
    "balance",
    "billingCycle",
    "customerProfile"
})
public class ResponseFTTB {

    protected String ctn;
    protected String marketCode;
    protected String status;
    protected ResponseFTTB.PromisedPayment promisedPayment;
    protected String balance;
    protected ResponseFTTB.BillingCycle billingCycle;
    protected CustomerProfile customerProfile;

    /**
     * Gets the value of the ctn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtn() {
        return ctn;
    }

    /**
     * Sets the value of the ctn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtn(String value) {
        this.ctn = value;
    }

    /**
     * Gets the value of the marketCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the promisedPayment property.
     *
     * @return
     *     possible object is
     *     {@link ResponseFTTB.PromisedPayment }
     *
     */
    public ResponseFTTB.PromisedPayment getPromisedPayment() {
        return promisedPayment;
    }

    /**
     * Sets the value of the promisedPayment property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseFTTB.PromisedPayment }
     *
     */
    public void setPromisedPayment(ResponseFTTB.PromisedPayment value) {
        this.promisedPayment = value;
    }

    /**
     * Gets the value of the balance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the billingCycle property.
     *
     * @return
     *     possible object is
     *     {@link ResponseFTTB.BillingCycle }
     *
     */
    public ResponseFTTB.BillingCycle getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseFTTB.BillingCycle }
     *
     */
    public void setBillingCycle(ResponseFTTB.BillingCycle value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfile }
     *     
     */
    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfile }
     *     
     */
    public void setCustomerProfile(CustomerProfile value) {
        this.customerProfile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endDate"
    })
    public static class BillingCycle {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status"
    })
    public static class PromisedPayment {

        @XmlElement(required = true)
        protected String status;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
