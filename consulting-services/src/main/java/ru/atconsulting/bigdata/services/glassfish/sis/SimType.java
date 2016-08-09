
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for SimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ngpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="boxType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimType", propOrder = {
    "ngpType",
    "boxType",
    "product"
})
public class SimType implements Serializable {

    @XmlElement(required = true)
    protected String ngpType;
    @XmlElement(required = true)
    protected String boxType;
    @XmlElement(required = true)
    protected String product;

    /**
     * Gets the value of the ngpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgpType() {
        return ngpType;
    }

    /**
     * Sets the value of the ngpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgpType(String value) {
        this.ngpType = value;
    }

    /**
     * Gets the value of the boxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxType() {
        return boxType;
    }

    /**
     * Sets the value of the boxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxType(String value) {
        this.boxType = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

}
