
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MonthlyFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isMonthlyFee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="monthlyFeeDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "MonthlyFee", propOrder = {
    "isMonthlyFee",
    "monthlyFeeDay",
    "items"
})
public class MonthlyFee implements Serializable {

    protected boolean isMonthlyFee;
    protected String monthlyFeeDay;
    protected MonthlyFee.Items items;

    /**
     * Gets the value of the isMonthlyFee property.
     *
     */
    public boolean isIsMonthlyFee() {
        return isMonthlyFee;
    }

    /**
     * Sets the value of the isMonthlyFee property.
     *
     */
    public void setIsMonthlyFee(boolean value) {
        this.isMonthlyFee = value;
    }

    /**
     * Gets the value of the monthlyFeeDay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonthlyFeeDay() {
        return monthlyFeeDay;
    }

    /**
     * Sets the value of the monthlyFeeDay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonthlyFeeDay(String value) {
        this.monthlyFeeDay = value;
    }

    /**
     * Gets the value of the items property.
     *
     * @return
     *     possible object is
     *     {@link MonthlyFee.Items }
     *
     */
    public MonthlyFee.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     *
     * @param value
     *     allowed object is
     *     {@link MonthlyFee.Items }
     *
     */
    public void setItems(MonthlyFee.Items value) {
        this.items = value;
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
     *         &lt;element name="item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
        "item"
    })
    public static class Items implements Serializable{

        @XmlElement(required = true)
        protected List<Item> item;

        /**
         * Gets the value of the item property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonthlyFee.Items.Item }
         *
         *
         */
        public List<Item> getItem() {
            if (item == null) {
                item = new ArrayList<Item>();
            }
            return this.item;
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
         *         &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
            "soc",
            "amount"
        })
        public static class Item implements Serializable{

            @XmlElement(required = true)
            protected String soc;
            protected double amount;

            /**
             * Gets the value of the soc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoc() {
                return soc;
            }

            /**
             * Sets the value of the soc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoc(String value) {
                this.soc = value;
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

        }

    }

}
