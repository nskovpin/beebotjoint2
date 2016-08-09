
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PromisedPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromisedPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promisedPayment" type="{urn:gf-subscriber-info-service:xsd}PromisedPayment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromisedPayments", propOrder = {
    "promisedPayment"
})
public class PromisedPayments implements Serializable {

    @XmlElement(required = true)
    protected List<PromisedPayment> promisedPayment;

    /**
     * Gets the value of the promisedPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promisedPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromisedPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromisedPayment }
     * 
     * 
     */
    public List<PromisedPayment> getPromisedPayment() {
        if (promisedPayment == null) {
            promisedPayment = new ArrayList<PromisedPayment>();
        }
        return this.promisedPayment;
    }

}
