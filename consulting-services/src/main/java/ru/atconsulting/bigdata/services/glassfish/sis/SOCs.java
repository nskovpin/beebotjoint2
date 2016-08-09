
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SOCs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOCs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOC" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="monthlyFee" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="subscrFee" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="monthlyFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="subscrFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="descriptionLat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "SOCs", propOrder = {
    "soc"
})
public class SOCs implements Serializable {

    @XmlElement(name = "SOC")
    protected List<SOC> soc;

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
     *    getSOC().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOCs.SOC }
     *
     *
     */
    public List<SOC> getSOC() {
        if (soc == null) {
            soc = new ArrayList<SOC>();
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="monthlyFee" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="subscrFee" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="monthlyFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="subscrFeeUSD" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="descriptionLat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class SOC {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "description")
        protected String description;
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
        @XmlAttribute(name = "type")
        protected String type;

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
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
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

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
