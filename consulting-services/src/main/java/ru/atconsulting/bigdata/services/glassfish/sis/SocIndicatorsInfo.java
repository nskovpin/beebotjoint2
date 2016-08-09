
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SocIndicatorsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocIndicatorsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soc" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="offers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="supplementaryOffer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="primaryOffer" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="periodicCharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                                       &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="accumulators" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="accumulator" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="nextReset" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="basePackageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="currentDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="futureDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                       &lt;element name="lowSpeedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="restOfPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "SocIndicatorsInfo", propOrder = {
    "soc"
})
public class SocIndicatorsInfo implements Serializable {

    @XmlElement(required = true)
    protected List<Soc> soc;

    /**
     * Gets the value of the soc property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soc property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoc().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocIndicatorsInfo.Soc }
     *
     *
     */
    public List<Soc> getSoc() {
        if (soc == null) {
            soc = new ArrayList<Soc>();
        }
        return this.soc;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="offers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="supplementaryOffer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="primaryOffer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="periodicCharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *                             &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="accumulators" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="accumulator" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="nextReset" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="basePackageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="currentDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="futureDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                             &lt;element name="lowSpeedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="restOfPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "name",
        "offers",
        "periodicCharges",
        "accumulators"
    })
    public static class Soc implements Serializable{

        @XmlElement(required = true)
        protected String name;
        protected SocIndicatorsInfo.Soc.Offers offers;
        protected SocIndicatorsInfo.Soc.PeriodicCharges periodicCharges;
        protected SocIndicatorsInfo.Soc.Accumulators accumulators;

        /**
         * Gets the value of the name property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the offers property.
         *
         * @return
         *     possible object is
         *     {@link SocIndicatorsInfo.Soc.Offers }
         *
         */
        public SocIndicatorsInfo.Soc.Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         *
         * @param value
         *     allowed object is
         *     {@link SocIndicatorsInfo.Soc.Offers }
         *
         */
        public void setOffers(SocIndicatorsInfo.Soc.Offers value) {
            this.offers = value;
        }

        /**
         * Gets the value of the periodicCharges property.
         *
         * @return
         *     possible object is
         *     {@link SocIndicatorsInfo.Soc.PeriodicCharges }
         *
         */
        public SocIndicatorsInfo.Soc.PeriodicCharges getPeriodicCharges() {
            return periodicCharges;
        }

        /**
         * Sets the value of the periodicCharges property.
         *
         * @param value
         *     allowed object is
         *     {@link SocIndicatorsInfo.Soc.PeriodicCharges }
         *
         */
        public void setPeriodicCharges(SocIndicatorsInfo.Soc.PeriodicCharges value) {
            this.periodicCharges = value;
        }

        /**
         * Gets the value of the accumulators property.
         *
         * @return
         *     possible object is
         *     {@link SocIndicatorsInfo.Soc.Accumulators }
         *
         */
        public SocIndicatorsInfo.Soc.Accumulators getAccumulators() {
            return accumulators;
        }

        /**
         * Sets the value of the accumulators property.
         *
         * @param value
         *     allowed object is
         *     {@link SocIndicatorsInfo.Soc.Accumulators }
         *
         */
        public void setAccumulators(SocIndicatorsInfo.Soc.Accumulators value) {
            this.accumulators = value;
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
         *         &lt;element name="accumulator" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="nextReset" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="basePackageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="currentDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="futureDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *                   &lt;element name="lowSpeedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="restOfPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "accumulator"
        })
        public static class Accumulators {

            protected List<Accumulator> accumulator;

            /**
             * Gets the value of the accumulator property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accumulator property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccumulator().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SocIndicatorsInfo.Soc.Accumulators.Accumulator }
             *
             *
             */
            public List<Accumulator> getAccumulator() {
                if (accumulator == null) {
                    accumulator = new ArrayList<Accumulator>();
                }
                return this.accumulator;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="nextReset" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="basePackageValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="currentDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="futureDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
             *         &lt;element name="lowSpeedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="restOfPackage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
                "name",
                "nextReset",
                "unitType",
                "periodType",
                "basePackageValue",
                "currentDiscount",
                "futureDiscount",
                "lowSpeedFlag",
                "restOfPackage"
            })
            public static class Accumulator {

                @XmlElement(required = true)
                protected String name;
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar nextReset;
                protected String unitType;
                protected String periodType;
                protected Double basePackageValue;
                protected Double currentDiscount;
                protected Double futureDiscount;
                protected Boolean lowSpeedFlag;
                protected Double restOfPackage;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the nextReset property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getNextReset() {
                    return nextReset;
                }

                /**
                 * Sets the value of the nextReset property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setNextReset(XMLGregorianCalendar value) {
                    this.nextReset = value;
                }

                /**
                 * Gets the value of the unitType property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUnitType() {
                    return unitType;
                }

                /**
                 * Sets the value of the unitType property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUnitType(String value) {
                    this.unitType = value;
                }

                /**
                 * Gets the value of the periodType property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPeriodType() {
                    return periodType;
                }

                /**
                 * Sets the value of the periodType property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPeriodType(String value) {
                    this.periodType = value;
                }

                /**
                 * Gets the value of the basePackageValue property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *
                 */
                public Double getBasePackageValue() {
                    return basePackageValue;
                }

                /**
                 * Sets the value of the basePackageValue property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *
                 */
                public void setBasePackageValue(Double value) {
                    this.basePackageValue = value;
                }

                /**
                 * Gets the value of the currentDiscount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *
                 */
                public Double getCurrentDiscount() {
                    return currentDiscount;
                }

                /**
                 * Sets the value of the currentDiscount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *
                 */
                public void setCurrentDiscount(Double value) {
                    this.currentDiscount = value;
                }

                /**
                 * Gets the value of the futureDiscount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *
                 */
                public Double getFutureDiscount() {
                    return futureDiscount;
                }

                /**
                 * Sets the value of the futureDiscount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *
                 */
                public void setFutureDiscount(Double value) {
                    this.futureDiscount = value;
                }

                /**
                 * Gets the value of the lowSpeedFlag property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *
                 */
                public Boolean isLowSpeedFlag() {
                    return lowSpeedFlag;
                }

                /**
                 * Sets the value of the lowSpeedFlag property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *
                 */
                public void setLowSpeedFlag(Boolean value) {
                    this.lowSpeedFlag = value;
                }

                /**
                 * Gets the value of the restOfPackage property.
                 *
                 * @return
                 *     possible object is
                 *     {@link Double }
                 *
                 */
                public Double getRestOfPackage() {
                    return restOfPackage;
                }

                /**
                 * Sets the value of the restOfPackage property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Double }
                 *
                 */
                public void setRestOfPackage(Double value) {
                    this.restOfPackage = value;
                }

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
         *         &lt;element name="supplementaryOffer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="primaryOffer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "supplementaryOffer",
            "primaryOffer"
        })
        public static class Offers {

            protected List<SupplementaryOffer> supplementaryOffer;
            protected List<PrimaryOffer> primaryOffer;

            /**
             * Gets the value of the supplementaryOffer property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the supplementaryOffer property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSupplementaryOffer().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SocIndicatorsInfo.Soc.Offers.SupplementaryOffer }
             *
             *
             */
            public List<SupplementaryOffer> getSupplementaryOffer() {
                if (supplementaryOffer == null) {
                    supplementaryOffer = new ArrayList<SupplementaryOffer>();
                }
                return this.supplementaryOffer;
            }

            /**
             * Gets the value of the primaryOffer property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the primaryOffer property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPrimaryOffer().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SocIndicatorsInfo.Soc.Offers.PrimaryOffer }
             *
             *
             */
            public List<PrimaryOffer> getPrimaryOffer() {
                if (primaryOffer == null) {
                    primaryOffer = new ArrayList<PrimaryOffer>();
                }
                return this.primaryOffer;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            @XmlType(name = "", propOrder = {
                "name",
                "activeDate",
                "state",
                "periodicCharge"
            })
            public static class PrimaryOffer {

                @XmlElement(required = true)
                protected String name;
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar activeDate;
                protected String state;
                protected List<PeriodicCharge> periodicCharge;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
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
                 * Gets the value of the state property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setState(String value) {
                    this.state = value;
                }

                /**
                 * Gets the value of the periodicCharge property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the periodicCharge property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPeriodicCharge().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SocIndicatorsInfo.Soc.Offers.PrimaryOffer.PeriodicCharge }
                 *
                 *
                 */
                public List<PeriodicCharge> getPeriodicCharge() {
                    if (periodicCharge == null) {
                        periodicCharge = new ArrayList<PeriodicCharge>();
                    }
                    return this.periodicCharge;
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
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "name",
                    "amount",
                    "nextApplyDate",
                    "activeDate",
                    "periodType"
                })
                public static class PeriodicCharge {

                    @XmlElement(required = true)
                    protected String name;
                    protected double amount;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar nextApplyDate;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar activeDate;
                    @XmlElement(required = true)
                    protected String periodType;

                    /**
                     * Gets the value of the name property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     *
                     */
                    public double getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     *
                     */
                    public void setAmount(double value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the nextApplyDate property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getNextApplyDate() {
                        return nextApplyDate;
                    }

                    /**
                     * Sets the value of the nextApplyDate property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setNextApplyDate(XMLGregorianCalendar value) {
                        this.nextApplyDate = value;
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
                     * Gets the value of the periodType property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPeriodType() {
                        return periodType;
                    }

                    /**
                     * Sets the value of the periodType property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPeriodType(String value) {
                        this.periodType = value;
                    }

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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            @XmlType(name = "", propOrder = {
                "name",
                "activeDate",
                "state",
                "periodicCharge"
            })
            public static class SupplementaryOffer {

                @XmlElement(required = true)
                protected String name;
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar activeDate;
                protected String state;
                protected List<PeriodicCharge> periodicCharge;

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
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
                 * Gets the value of the state property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setState(String value) {
                    this.state = value;
                }

                /**
                 * Gets the value of the periodicCharge property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the periodicCharge property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPeriodicCharge().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SocIndicatorsInfo.Soc.Offers.SupplementaryOffer.PeriodicCharge }
                 *
                 *
                 */
                public List<PeriodicCharge> getPeriodicCharge() {
                    if (periodicCharge == null) {
                        periodicCharge = new ArrayList<PeriodicCharge>();
                    }
                    return this.periodicCharge;
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
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="activeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "name",
                    "amount",
                    "nextApplyDate",
                    "activeDate",
                    "periodType"
                })
                public static class PeriodicCharge {

                    @XmlElement(required = true)
                    protected String name;
                    protected double amount;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar nextApplyDate;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar activeDate;
                    @XmlElement(required = true)
                    protected String periodType;

                    /**
                     * Gets the value of the name property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     *
                     */
                    public double getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     *
                     */
                    public void setAmount(double value) {
                        this.amount = value;
                    }

                    /**
                     * Gets the value of the nextApplyDate property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getNextApplyDate() {
                        return nextApplyDate;
                    }

                    /**
                     * Sets the value of the nextApplyDate property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setNextApplyDate(XMLGregorianCalendar value) {
                        this.nextApplyDate = value;
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
                     * Gets the value of the periodType property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPeriodType() {
                        return periodType;
                    }

                    /**
                     * Sets the value of the periodType property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPeriodType(String value) {
                        this.periodType = value;
                    }

                }

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
         *         &lt;element name="periodicCharge" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
         *                   &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "periodicCharge"
        })
        public static class PeriodicCharges {

            protected List<PeriodicCharge> periodicCharge;

            /**
             * Gets the value of the periodicCharge property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the periodicCharge property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPeriodicCharge().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SocIndicatorsInfo.Soc.PeriodicCharges.PeriodicCharge }
             *
             *
             */
            public List<PeriodicCharge> getPeriodicCharge() {
                if (periodicCharge == null) {
                    periodicCharge = new ArrayList<PeriodicCharge>();
                }
                return this.periodicCharge;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
             *         &lt;element name="nextApplyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "name",
                "amount",
                "nextApplyDate",
                "periodType"
            })
            public static class PeriodicCharge {

                @XmlElement(required = true)
                protected String name;
                protected Float amount;
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar nextApplyDate;
                protected String periodType;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setAmount(Float value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the nextApplyDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getNextApplyDate() {
                    return nextApplyDate;
                }

                /**
                 * Sets the value of the nextApplyDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setNextApplyDate(XMLGregorianCalendar value) {
                    this.nextApplyDate = value;
                }

                /**
                 * Gets the value of the periodType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPeriodType() {
                    return periodType;
                }

                /**
                 * Sets the value of the periodType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPeriodType(String value) {
                    this.periodType = value;
                }

            }

        }

    }

}
