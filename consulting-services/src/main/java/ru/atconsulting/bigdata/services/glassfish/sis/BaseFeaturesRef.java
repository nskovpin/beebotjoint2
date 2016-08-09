
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for BaseFeaturesRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFeaturesRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseFeaturesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inclusionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFeaturesRef", propOrder = {
    "soc",
    "baseFeaturesName",
    "inclusionType"
})
public class BaseFeaturesRef implements Serializable {

    @XmlElement(name = "SOC")
    protected String soc;
    protected String baseFeaturesName;
    protected String inclusionType;

    /**
     * Gets the value of the soc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOC() {
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
    public void setSOC(String value) {
        this.soc = value;
    }

    /**
     * Gets the value of the baseFeaturesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFeaturesName() {
        return baseFeaturesName;
    }

    /**
     * Sets the value of the baseFeaturesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFeaturesName(String value) {
        this.baseFeaturesName = value;
    }

    /**
     * Gets the value of the inclusionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionType() {
        return inclusionType;
    }

    /**
     * Sets the value of the inclusionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionType(String value) {
        this.inclusionType = value;
    }

}
