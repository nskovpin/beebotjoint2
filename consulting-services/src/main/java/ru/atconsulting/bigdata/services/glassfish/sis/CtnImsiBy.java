
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CtnImsiBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtnImsiBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctnImsi" type="{urn:gf-subscriber-info-service:xsd}CtnImsi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtnImsiBy", propOrder = {
    "ctnImsi"
})
public class CtnImsiBy implements Serializable {

    protected List<CtnImsi> ctnImsi;

    /**
     * Gets the value of the ctnImsi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctnImsi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtnImsi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtnImsi }
     * 
     * 
     */
    public List<CtnImsi> getCtnImsi() {
        if (ctnImsi == null) {
            ctnImsi = new ArrayList<CtnImsi>();
        }
        return this.ctnImsi;
    }

}
