
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredInfoFTTB.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoFTTB">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ctn"/>
 *     &lt;enumeration value="marketCode"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="promisedPayment"/>
 *     &lt;enumeration value="balance"/>
 *     &lt;enumeration value="billingCycle"/>
 *     &lt;enumeration value="customerProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoFTTB")
@XmlEnum
public enum RequiredInfoFTTB {

    @XmlEnumValue("ctn")
    CTN("ctn"),
    @XmlEnumValue("marketCode")
    MARKET_CODE("marketCode"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("promisedPayment")
    PROMISED_PAYMENT("promisedPayment"),
    @XmlEnumValue("balance")
    BALANCE("balance"),
    @XmlEnumValue("billingCycle")
    BILLING_CYCLE("billingCycle"),
    @XmlEnumValue("customerProfile")
    CUSTOMER_PROFILE("customerProfile");
    private final String value;

    RequiredInfoFTTB(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoFTTB fromValue(String v) {
        for (RequiredInfoFTTB c: RequiredInfoFTTB.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
