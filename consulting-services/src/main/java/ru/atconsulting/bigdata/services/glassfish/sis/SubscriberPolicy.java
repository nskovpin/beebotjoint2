
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SubscriberPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accumLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberPolicy", propOrder = {
    "policyName",
    "policyDesc",
    "active",
    "accumLimit",
    "imei",
    "updateTime"
})
public class SubscriberPolicy implements Serializable {

    protected String policyName;
    protected String policyDesc;
    protected int active;
    protected int accumLimit;
    protected String imei;
    protected long updateTime;

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the policyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyDesc() {
        return policyDesc;
    }

    /**
     * Sets the value of the policyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyDesc(String value) {
        this.policyDesc = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

    /**
     * Gets the value of the accumLimit property.
     * 
     */
    public int getAccumLimit() {
        return accumLimit;
    }

    /**
     * Sets the value of the accumLimit property.
     * 
     */
    public void setAccumLimit(int value) {
        this.accumLimit = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     */
    public long getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     */
    public void setUpdateTime(long value) {
        this.updateTime = value;
    }

}
