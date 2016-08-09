
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctnImsiByHierarchy" type="{urn:gf-subscriber-info-service:xsd}CtnImsiBy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHierarchy", propOrder = {
    "ctnImsiByHierarchy"
})
public class ResponseHierarchy {

    protected CtnImsiBy ctnImsiByHierarchy;

    /**
     * Gets the value of the ctnImsiByHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link CtnImsiBy }
     *     
     */
    public CtnImsiBy getCtnImsiByHierarchy() {
        return ctnImsiByHierarchy;
    }

    /**
     * Sets the value of the ctnImsiByHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnImsiBy }
     *     
     */
    public void setCtnImsiByHierarchy(CtnImsiBy value) {
        this.ctnImsiByHierarchy = value;
    }

}
