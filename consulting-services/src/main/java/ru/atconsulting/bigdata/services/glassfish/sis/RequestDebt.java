
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RequestDebt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDebt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredInfo" type="{urn:gf-subscriber-info-service:xsd}requiredInfoDebt" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctn" type="{urn:gf-subscriber-info-service:xsd}ctn" />
 *       &lt;attribute name="monthlyFeeDay" type="{urn:gf-subscriber-info-service:xsd}MonthlyFeeDay" />
 *       &lt;attribute name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ext" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDebt", propOrder = {
    "requiredInfo"
})
public class RequestDebt {

    @XmlElement(required = true)
    protected List<RequiredInfoDebt> requiredInfo;
    @XmlAttribute(name = "ctn")
    protected String ctn;
    @XmlAttribute(name = "monthlyFeeDay")
    protected Short monthlyFeeDay;
    @XmlAttribute(name = "dateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    @XmlAttribute(name = "detail")
    protected Boolean detail;
    @XmlAttribute(name = "ext")
    protected Boolean ext;

    /**
     * Gets the value of the requiredInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredInfoDebt }
     * 
     * 
     */
    public List<RequiredInfoDebt> getRequiredInfo() {
        if (requiredInfo == null) {
            requiredInfo = new ArrayList<RequiredInfoDebt>();
        }
        return this.requiredInfo;
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
     * Gets the value of the monthlyFeeDay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMonthlyFeeDay() {
        return monthlyFeeDay;
    }

    /**
     * Sets the value of the monthlyFeeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMonthlyFeeDay(Short value) {
        this.monthlyFeeDay = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetail(Boolean value) {
        this.detail = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExt(Boolean value) {
        this.ext = value;
    }

}
