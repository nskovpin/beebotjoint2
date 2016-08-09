
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for InfoPP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoPP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffSOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDefaultTariffSOC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoPP", propOrder = {
    "tariffSOC",
    "isDefaultTariffSOC"
})
public class InfoPP implements Serializable {

    @XmlElement(required = true)
    protected String tariffSOC;
    protected boolean isDefaultTariffSOC;

    /**
     * Gets the value of the tariffSOC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffSOC() {
        return tariffSOC;
    }

    /**
     * Sets the value of the tariffSOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffSOC(String value) {
        this.tariffSOC = value;
    }

    /**
     * Gets the value of the isDefaultTariffSOC property.
     * 
     */
    public boolean isIsDefaultTariffSOC() {
        return isDefaultTariffSOC;
    }

    /**
     * Sets the value of the isDefaultTariffSOC property.
     * 
     */
    public void setIsDefaultTariffSOC(boolean value) {
        this.isDefaultTariffSOC = value;
    }

}
