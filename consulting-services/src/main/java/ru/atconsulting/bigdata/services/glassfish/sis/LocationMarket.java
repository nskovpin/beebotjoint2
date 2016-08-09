
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for LocationMarket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationMarket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="market" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hlr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="neighbour" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "LocationMarket", propOrder = {
    "mcc",
    "mnc",
    "lac",
    "cid",
    "market"
})
public class LocationMarket implements Serializable {

    protected String mcc;
    protected String mnc;
    protected String lac;
    protected String cid;
    protected List<Market> market;

    /**
     * Gets the value of the mcc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMnc(String value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the lac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLac() {
        return lac;
    }

    /**
     * Sets the value of the lac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLac(String value) {
        this.lac = value;
    }

    /**
     * Gets the value of the cid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCid() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCid(String value) {
        this.cid = value;
    }

    /**
     * Gets the value of the market property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the market property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarket().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationMarket.Market }
     *
     *
     */
    public List<Market> getMarket() {
        if (market == null) {
            market = new ArrayList<Market>();
        }
        return this.market;
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
     *         &lt;element name="hlr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="neighbour" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "hlr",
        "code",
        "name",
        "neighbour"
    })
    public static class Market implements Serializable{

        @XmlElement(required = true)
        protected String hlr;
        @XmlElement(required = true)
        protected String code;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String neighbour;

        /**
         * Gets the value of the hlr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHlr() {
            return hlr;
        }

        /**
         * Sets the value of the hlr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHlr(String value) {
            this.hlr = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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
         * Gets the value of the neighbour property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNeighbour() {
            return neighbour;
        }

        /**
         * Sets the value of the neighbour property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNeighbour(String value) {
            this.neighbour = value;
        }

    }

}
