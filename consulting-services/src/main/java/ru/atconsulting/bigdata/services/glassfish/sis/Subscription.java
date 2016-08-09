
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tariffSOC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="desctiption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="monthlyFee" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="subscrFee" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="monthlyFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="subscrFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="descriptionLat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arpu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initActivationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription", propOrder = {
    "ban",
    "banStatus",
    "subStatus",
    "tariffSOC",
    "accountType",
    "marketCode",
    "arpu",
    "initActivationDate"
})
public class Subscription implements Serializable {

    protected String ban;
    protected String banStatus;
    protected String subStatus;
    protected Subscription.TariffSOC tariffSOC;
    protected String accountType;
    protected String marketCode;
    protected String arpu;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initActivationDate;

    /**
     * Gets the value of the ban property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBan() {
        return ban;
    }

    /**
     * Sets the value of the ban property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBan(String value) {
        this.ban = value;
    }

    /**
     * Gets the value of the banStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanStatus() {
        return banStatus;
    }

    /**
     * Sets the value of the banStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanStatus(String value) {
        this.banStatus = value;
    }

    /**
     * Gets the value of the subStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the tariffSOC property.
     *
     * @return
     *     possible object is
     *     {@link Subscription.TariffSOC }
     *
     */
    public Subscription.TariffSOC getTariffSOC() {
        return tariffSOC;
    }

    /**
     * Sets the value of the tariffSOC property.
     *
     * @param value
     *     allowed object is
     *     {@link Subscription.TariffSOC }
     *
     */
    public void setTariffSOC(Subscription.TariffSOC value) {
        this.tariffSOC = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
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
     * Gets the value of the arpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArpu() {
        return arpu;
    }

    /**
     * Sets the value of the arpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArpu(String value) {
        this.arpu = value;
    }

    /**
     * Gets the value of the initActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitActivationDate() {
        return initActivationDate;
    }

    /**
     * Sets the value of the initActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitActivationDate(XMLGregorianCalendar value) {
        this.initActivationDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="desctiption" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="monthlyFee" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="subscrFee" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="monthlyFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="subscrFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="descriptionLat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TariffSOC {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "desctiption")
        protected String desctiption;
        @XmlAttribute(name = "monthlyFee")
        protected Double monthlyFee;
        @XmlAttribute(name = "subscrFee")
        protected Double subscrFee;
        @XmlAttribute(name = "monthlyFeeUSD")
        protected Double monthlyFeeUSD;
        @XmlAttribute(name = "subscrFeeUSD")
        protected Double subscrFeeUSD;
        @XmlAttribute(name = "categoryId")
        protected String categoryId;
        @XmlAttribute(name = "descriptionLat")
        protected String descriptionLat;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the desctiption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesctiption() {
            return desctiption;
        }

        /**
         * Sets the value of the desctiption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesctiption(String value) {
            this.desctiption = value;
        }

        /**
         * Gets the value of the monthlyFee property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMonthlyFee() {
            return monthlyFee;
        }

        /**
         * Sets the value of the monthlyFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMonthlyFee(Double value) {
            this.monthlyFee = value;
        }

        /**
         * Gets the value of the subscrFee property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSubscrFee() {
            return subscrFee;
        }

        /**
         * Sets the value of the subscrFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSubscrFee(Double value) {
            this.subscrFee = value;
        }

        /**
         * Gets the value of the monthlyFeeUSD property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMonthlyFeeUSD() {
            return monthlyFeeUSD;
        }

        /**
         * Sets the value of the monthlyFeeUSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMonthlyFeeUSD(Double value) {
            this.monthlyFeeUSD = value;
        }

        /**
         * Gets the value of the subscrFeeUSD property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSubscrFeeUSD() {
            return subscrFeeUSD;
        }

        /**
         * Sets the value of the subscrFeeUSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSubscrFeeUSD(Double value) {
            this.subscrFeeUSD = value;
        }

        /**
         * Gets the value of the categoryId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryId() {
            return categoryId;
        }

        /**
         * Sets the value of the categoryId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryId(String value) {
            this.categoryId = value;
        }

        /**
         * Gets the value of the descriptionLat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptionLat() {
            return descriptionLat;
        }

        /**
         * Sets the value of the descriptionLat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptionLat(String value) {
            this.descriptionLat = value;
        }

    }

}
