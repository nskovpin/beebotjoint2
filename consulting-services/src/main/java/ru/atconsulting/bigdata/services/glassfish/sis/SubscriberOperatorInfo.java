
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SubscriberOperatorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberOperatorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="federalOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="federalOperatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="federalRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberOperatorInfo", propOrder = {
    "federalOperatorCode",
    "federalOperatorName",
    "federalRegionCode",
    "federalRegionName",
    "operatorName",
    "phoneNumber",
    "regionName",
    "operatorId"
})
public class SubscriberOperatorInfo implements Serializable {

    @XmlElement(required = true)
    protected String federalOperatorCode;
    @XmlElement(required = true)
    protected String federalOperatorName;
    protected String federalRegionCode;
    protected String federalRegionName;
    protected String operatorName;
    protected String phoneNumber;
    protected String regionName;
    @XmlElement(required = true)
    protected String operatorId;

    /**
     * Gets the value of the federalOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalOperatorCode() {
        return federalOperatorCode;
    }

    /**
     * Sets the value of the federalOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalOperatorCode(String value) {
        this.federalOperatorCode = value;
    }

    /**
     * Gets the value of the federalOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalOperatorName() {
        return federalOperatorName;
    }

    /**
     * Sets the value of the federalOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalOperatorName(String value) {
        this.federalOperatorName = value;
    }

    /**
     * Gets the value of the federalRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalRegionCode() {
        return federalRegionCode;
    }

    /**
     * Sets the value of the federalRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalRegionCode(String value) {
        this.federalRegionCode = value;
    }

    /**
     * Gets the value of the federalRegionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalRegionName() {
        return federalRegionName;
    }

    /**
     * Sets the value of the federalRegionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalRegionName(String value) {
        this.federalRegionName = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the operatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * Sets the value of the operatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

}
