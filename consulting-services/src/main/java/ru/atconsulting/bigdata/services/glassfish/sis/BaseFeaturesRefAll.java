
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BaseFeaturesRefAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFeaturesRefAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseFeaturesRef" type="{urn:gf-subscriber-info-service:xsd}BaseFeaturesRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFeaturesRefAll", propOrder = {
    "baseFeaturesRef"
})
public class BaseFeaturesRefAll implements Serializable {

    protected List<BaseFeaturesRef> baseFeaturesRef;

    /**
     * Gets the value of the baseFeaturesRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseFeaturesRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseFeaturesRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseFeaturesRef }
     * 
     * 
     */
    public List<BaseFeaturesRef> getBaseFeaturesRef() {
        if (baseFeaturesRef == null) {
            baseFeaturesRef = new ArrayList<BaseFeaturesRef>();
        }
        return this.baseFeaturesRef;
    }

}
