
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for RegistrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ben" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationInfo", propOrder = {
    "ban",
    "ben",
    "subStatus",
    "imsi",
    "registerInd"
})
public class RegistrationInfo implements Serializable {

    protected String ban;
    protected String ben;
    protected String subStatus;
    protected String imsi;
    protected String registerInd;

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
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
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
     * Gets the value of the registerInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterInd() {
        return registerInd;
    }

    /**
     * Sets the value of the registerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterInd(String value) {
        this.registerInd = value;
    }

}
