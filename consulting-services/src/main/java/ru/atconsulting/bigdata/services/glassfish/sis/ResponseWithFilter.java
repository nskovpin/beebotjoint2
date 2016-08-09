
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ResponseWithFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseWithFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctnListFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="pageTotal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ctnListElement" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ben" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ResponseWithFilter", propOrder = {
    "ctnListFilter"
})
public class ResponseWithFilter {

    protected ResponseWithFilter.CtnListFilter ctnListFilter;

    /**
     * Gets the value of the ctnListFilter property.
     *
     * @return
     *     possible object is
     *     {@link ResponseWithFilter.CtnListFilter }
     *
     */
    public ResponseWithFilter.CtnListFilter getCtnListFilter() {
        return ctnListFilter;
    }

    /**
     * Sets the value of the ctnListFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseWithFilter.CtnListFilter }
     *
     */
    public void setCtnListFilter(ResponseWithFilter.CtnListFilter value) {
        this.ctnListFilter = value;
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
     *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="pageTotal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ctnListElement" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ben" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "ban",
        "page",
        "pageTotal",
        "ctnListElement"
    })
    public static class CtnListFilter {

        protected String ban;
        @XmlElement(required = true)
        protected BigInteger page;
        protected BigInteger pageTotal;
        protected List<CtnListElement> ctnListElement;

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

        /**
         * Gets the value of the pageTotal property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getPageTotal() {
            return pageTotal;
        }

        /**
         * Sets the value of the pageTotal property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setPageTotal(BigInteger value) {
            this.pageTotal = value;
        }

        /**
         * Gets the value of the ctnListElement property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctnListElement property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtnListElement().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponseWithFilter.CtnListFilter.CtnListElement }
         *
         *
         */
        public List<CtnListElement> getCtnListElement() {
            if (ctnListElement == null) {
                ctnListElement = new ArrayList<CtnListElement>();
            }
            return this.ctnListElement;
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
         *         &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ben" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="soc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "ctn",
            "status",
            "ben",
            "imsi",
            "soc"
        })
        public static class CtnListElement {

            @XmlElement(required = true)
            protected String ctn;
            @XmlElement(required = true)
            protected String status;
            @XmlElement(required = true)
            protected String ben;
            protected String imsi;
            @XmlElement(required = true)
            protected String soc;

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
             * Gets the value of the ben property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBen() {
                return ben;
            }

            /**
             * Sets the value of the ben property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBen(String value) {
                this.ben = value;
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

        }

    }

}
