
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="federalRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalOperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorCode", propOrder = {
    "phoneNumber",
    "federalRegionCode",
    "federalOperatorCode",
    "federalOperatorName",
    "operatorName"
})
public class OperatorCode {

    @XmlElement(required = true)
    protected String phoneNumber;
    protected String federalRegionCode;
    protected String federalOperatorCode;
    protected String federalOperatorName;
    protected String operatorName;

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

}
