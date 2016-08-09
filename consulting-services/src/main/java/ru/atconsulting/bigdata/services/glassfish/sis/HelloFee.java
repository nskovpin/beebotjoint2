
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for HelloFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HelloFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionFee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="future" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contentFee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="future" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelloFee", propOrder = {
    "subscriptionFee",
    "contentFee",
    "returnCode"
})
public class HelloFee implements Serializable {

    @XmlElement(required = true)
    protected HelloFee.SubscriptionFee subscriptionFee;
    @XmlElement(required = true)
    protected HelloFee.ContentFee contentFee;
    @XmlElement(required = true)
    protected String returnCode;

    /**
     * Gets the value of the subscriptionFee property.
     *
     * @return
     *     possible object is
     *     {@link HelloFee.SubscriptionFee }
     *
     */
    public HelloFee.SubscriptionFee getSubscriptionFee() {
        return subscriptionFee;
    }

    /**
     * Sets the value of the subscriptionFee property.
     *
     * @param value
     *     allowed object is
     *     {@link HelloFee.SubscriptionFee }
     *
     */
    public void setSubscriptionFee(HelloFee.SubscriptionFee value) {
        this.subscriptionFee = value;
    }

    /**
     * Gets the value of the contentFee property.
     *
     * @return
     *     possible object is
     *     {@link HelloFee.ContentFee }
     *
     */
    public HelloFee.ContentFee getContentFee() {
        return contentFee;
    }

    /**
     * Sets the value of the contentFee property.
     *
     * @param value
     *     allowed object is
     *     {@link HelloFee.ContentFee }
     *
     */
    public void setContentFee(HelloFee.ContentFee value) {
        this.contentFee = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
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
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="future" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "current",
        "future"
    })
    public static class ContentFee implements Serializable{

        @XmlElement(required = true)
        protected String current;
        @XmlElement(required = true)
        protected String future;

        /**
         * Gets the value of the current property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrent() {
            return current;
        }

        /**
         * Sets the value of the current property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrent(String value) {
            this.current = value;
        }

        /**
         * Gets the value of the future property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuture() {
            return future;
        }

        /**
         * Sets the value of the future property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuture(String value) {
            this.future = value;
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
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="future" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "current",
        "future"
    })
    public static class SubscriptionFee implements Serializable{

        @XmlElement(required = true)
        protected String current;
        @XmlElement(required = true)
        protected String future;

        /**
         * Gets the value of the current property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrent() {
            return current;
        }

        /**
         * Sets the value of the current property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrent(String value) {
            this.current = value;
        }

        /**
         * Gets the value of the future property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuture() {
            return future;
        }

        /**
         * Sets the value of the future property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuture(String value) {
            this.future = value;
        }

    }

}
