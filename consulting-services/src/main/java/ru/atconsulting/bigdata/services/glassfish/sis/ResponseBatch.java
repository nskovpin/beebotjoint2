
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ResponseBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberInfo" type="{urn:gf-subscriber-info-service:xsd}SubscriberNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="areCtnsOnBan" type="{urn:gf-subscriber-info-service:xsd}AreCTNsOnBan" minOccurs="0"/>
 *         &lt;element name="operatorCode" type="{urn:gf-subscriber-info-service:xsd}OperatorCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operatorIds" type="{urn:gf-subscriber-info-service:xsd}OperatorIds" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBatch", propOrder = {
    "numberInfo",
    "areCtnsOnBan",
    "operatorCode",
    "operatorIds"
})
public class ResponseBatch {

    protected List<SubscriberNumber> numberInfo;
    protected AreCTNsOnBan areCtnsOnBan;
    protected List<OperatorCode> operatorCode;
    protected OperatorIds operatorIds;

    /**
     * Gets the value of the numberInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberNumber }
     * 
     * 
     */
    public List<SubscriberNumber> getNumberInfo() {
        if (numberInfo == null) {
            numberInfo = new ArrayList<SubscriberNumber>();
        }
        return this.numberInfo;
    }

    /**
     * Gets the value of the areCtnsOnBan property.
     * 
     * @return
     *     possible object is
     *     {@link AreCTNsOnBan }
     *     
     */
    public AreCTNsOnBan getAreCtnsOnBan() {
        return areCtnsOnBan;
    }

    /**
     * Sets the value of the areCtnsOnBan property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreCTNsOnBan }
     *     
     */
    public void setAreCtnsOnBan(AreCTNsOnBan value) {
        this.areCtnsOnBan = value;
    }

    /**
     * Gets the value of the operatorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorCode }
     * 
     * 
     */
    public List<OperatorCode> getOperatorCode() {
        if (operatorCode == null) {
            operatorCode = new ArrayList<OperatorCode>();
        }
        return this.operatorCode;
    }

    /**
     * Gets the value of the operatorIds property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorIds }
     *     
     */
    public OperatorIds getOperatorIds() {
        return operatorIds;
    }

    /**
     * Sets the value of the operatorIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorIds }
     *     
     */
    public void setOperatorIds(OperatorIds value) {
        this.operatorIds = value;
    }

}
