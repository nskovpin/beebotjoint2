
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BalanceGrants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceGrants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceGrant" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="balanceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *                   &lt;element name="expirationType" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                   &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceGrants", propOrder = {
    "balanceGrant"
})
public class BalanceGrants implements Serializable {

    protected List<BalanceGrant> balanceGrant;

    /**
     * Gets the value of the balanceGrant property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceGrant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceGrant().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceGrants.BalanceGrant }
     *
     *
     */
    public List<BalanceGrant> getBalanceGrant() {
        if (balanceGrant == null) {
            balanceGrant = new ArrayList<BalanceGrant>();
        }
        return this.balanceGrant;
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
     *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="balanceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
     *         &lt;element name="expirationType" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
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
        "amount",
        "balanceId",
        "currencyCode",
        "expirationType",
        "activeDate",
        "expiryDate",
        "source",
        "status"
    })
    public static class BalanceGrant implements Serializable{

        protected Double amount;
        protected BigInteger balanceId;
        protected Short currencyCode;
        protected Byte expirationType;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar activeDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expiryDate;
        protected String source;
        protected Byte status;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAmount(Double value) {
            this.amount = value;
        }

        /**
         * Gets the value of the balanceId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBalanceId() {
            return balanceId;
        }

        /**
         * Sets the value of the balanceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBalanceId(BigInteger value) {
            this.balanceId = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setCurrencyCode(Short value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the expirationType property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getExpirationType() {
            return expirationType;
        }

        /**
         * Sets the value of the expirationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setExpirationType(Byte value) {
            this.expirationType = value;
        }

        /**
         * Gets the value of the activeDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActiveDate() {
            return activeDate;
        }

        /**
         * Sets the value of the activeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActiveDate(XMLGregorianCalendar value) {
            this.activeDate = value;
        }

        /**
         * Gets the value of the expiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpiryDate() {
            return expiryDate;
        }

        /**
         * Sets the value of the expiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpiryDate(XMLGregorianCalendar value) {
            this.expiryDate = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setStatus(Byte value) {
            this.status = value;
        }

    }

}
