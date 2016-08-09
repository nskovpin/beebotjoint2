
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for requiredInfoHierarchy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoHierarchy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ctnImsiByHierarchy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoHierarchy")
@XmlEnum
public enum RequiredInfoHierarchy implements Serializable {

    @XmlEnumValue("ctnImsiByHierarchy")
    CTN_IMSI_BY_HIERARCHY("ctnImsiByHierarchy");
    private final String value;

    RequiredInfoHierarchy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoHierarchy fromValue(String v) {
        for (RequiredInfoHierarchy c: RequiredInfoHierarchy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
