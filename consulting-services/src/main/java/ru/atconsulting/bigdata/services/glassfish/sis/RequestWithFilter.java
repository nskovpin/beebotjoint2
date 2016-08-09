
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigInteger;


/**
 * <p>Java class for RequestWithFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestWithFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctnListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="socFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ctn" type="{urn:gf-subscriber-info-service:xsd}ctn" />
 *       &lt;attribute name="imsi" type="{urn:gf-subscriber-info-service:xsd}imsi" />
 *       &lt;attribute name="ban" type="{urn:gf-subscriber-info-service:xsd}imsi" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestWithFilter", propOrder = {
    "ctnListFilter"
})
public class RequestWithFilter implements Serializable {

    protected RequestWithFilter.CtnListFilter ctnListFilter;
    @XmlAttribute(name = "ctn")
    protected String ctn;
    @XmlAttribute(name = "imsi")
    protected String imsi;
    @XmlAttribute(name = "ban")
    protected String ban;

    /**
     * Gets the value of the ctnListFilter property.
     *
     * @return
     *     possible object is
     *     {@link RequestWithFilter.CtnListFilter }
     *
     */
    public RequestWithFilter.CtnListFilter getCtnListFilter() {
        return ctnListFilter;
    }

    /**
     * Sets the value of the ctnListFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestWithFilter.CtnListFilter }
     *
     */
    public void setCtnListFilter(RequestWithFilter.CtnListFilter value) {
        this.ctnListFilter = value;
    }

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
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="socFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "socFilter",
        "active",
        "pageSize",
        "page"
    })
    public static class CtnListFilter implements Serializable{

        protected String socFilter;
        protected boolean active;
        @XmlElement(required = true)
        protected BigInteger pageSize;
        @XmlElement(required = true)
        protected BigInteger page;

        /**
         * Gets the value of the socFilter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSocFilter() {
            return socFilter;
        }

        /**
         * Sets the value of the socFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSocFilter(String value) {
            this.socFilter = value;
        }

        /**
         * Gets the value of the active property.
         * 
         */
        public boolean isActive() {
            return active;
        }

        /**
         * Sets the value of the active property.
         * 
         */
        public void setActive(boolean value) {
            this.active = value;
        }

        /**
         * Gets the value of the pageSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPageSize() {
            return pageSize;
        }

        /**
         * Sets the value of the pageSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPageSize(BigInteger value) {
            this.pageSize = value;
        }

        /**
         * Gets the value of the page property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPage() {
            return page;
        }

        /**
         * Sets the value of the page property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPage(BigInteger value) {
            this.page = value;
        }

    }

}
