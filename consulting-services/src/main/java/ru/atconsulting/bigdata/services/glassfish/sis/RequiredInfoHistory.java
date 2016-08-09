
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for requiredInfoHistory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoHistory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="payments"/>
 *     &lt;enumeration value="interacts"/>
 *     &lt;enumeration value="events"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoHistory")
@XmlEnum
public enum RequiredInfoHistory implements Serializable {

    @XmlEnumValue("payments")
    PAYMENTS("payments"),
    @XmlEnumValue("interacts")
    INTERACTS("interacts"),
    @XmlEnumValue("events")
    EVENTS("events");
    private final String value;

    RequiredInfoHistory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoHistory fromValue(String v) {
        for (RequiredInfoHistory c: RequiredInfoHistory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
