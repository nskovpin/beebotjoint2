
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredInfoBatch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoBatch">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="numberInfo"/>
 *     &lt;enumeration value="areCtnsOnBan"/>
 *     &lt;enumeration value="operatorCode"/>
 *     &lt;enumeration value="operatorIds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoBatch")
@XmlEnum
public enum RequiredInfoBatch {

    @XmlEnumValue("numberInfo")
    NUMBER_INFO("numberInfo"),
    @XmlEnumValue("areCtnsOnBan")
    ARE_CTNS_ON_BAN("areCtnsOnBan"),
    @XmlEnumValue("operatorCode")
    OPERATOR_CODE("operatorCode"),
    @XmlEnumValue("operatorIds")
    OPERATOR_IDS("operatorIds");
    private final String value;

    RequiredInfoBatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoBatch fromValue(String v) {
        for (RequiredInfoBatch c: RequiredInfoBatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
