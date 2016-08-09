
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SubscriberPolicies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberPolicies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberPolicy" type="{urn:gf-subscriber-info-service:xsd}SubscriberPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activeSession" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionParams" type="{urn:gf-subscriber-info-service:xsd}SessionParams" minOccurs="0"/>
 *         &lt;element name="suspendParams" type="{urn:gf-subscriber-info-service:xsd}SuspendParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberPolicies", propOrder = {
    "subscriberPolicy",
    "activeSession",
    "sessionParams",
    "suspendParams"
})
public class SubscriberPolicies implements Serializable {

    @XmlElement(nillable = true)
    protected List<SubscriberPolicy> subscriberPolicy;
    protected int activeSession;
    @XmlElementRef(name = "sessionParams", namespace = "urn:gf-subscriber-info-service:xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SessionParams> sessionParams;
    @XmlElementRef(name = "suspendParams", namespace = "urn:gf-subscriber-info-service:xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<SuspendParams> suspendParams;

    /**
     * Gets the value of the subscriberPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberPolicy }
     * 
     * 
     */
    public List<SubscriberPolicy> getSubscriberPolicy() {
        if (subscriberPolicy == null) {
            subscriberPolicy = new ArrayList<SubscriberPolicy>();
        }
        return this.subscriberPolicy;
    }

    /**
     * Gets the value of the activeSession property.
     * 
     */
    public int getActiveSession() {
        return activeSession;
    }

    /**
     * Sets the value of the activeSession property.
     * 
     */
    public void setActiveSession(int value) {
        this.activeSession = value;
    }

    /**
     * Gets the value of the sessionParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SessionParams }{@code >}
     *     
     */
    public JAXBElement<SessionParams> getSessionParams() {
        return sessionParams;
    }

    /**
     * Sets the value of the sessionParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SessionParams }{@code >}
     *     
     */
    public void setSessionParams(JAXBElement<SessionParams> value) {
        this.sessionParams = value;
    }

    /**
     * Gets the value of the suspendParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SuspendParams }{@code >}
     *     
     */
    public JAXBElement<SuspendParams> getSuspendParams() {
        return suspendParams;
    }

    /**
     * Sets the value of the suspendParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SuspendParams }{@code >}
     *     
     */
    public void setSuspendParams(JAXBElement<SuspendParams> value) {
        this.suspendParams = value;
    }

}
