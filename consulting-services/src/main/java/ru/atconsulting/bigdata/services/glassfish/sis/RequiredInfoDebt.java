
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredInfoDebt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoDebt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="debt"/>
 *     &lt;enumeration value="debtPC"/>
 *     &lt;enumeration value="debtPP"/>
 *     &lt;enumeration value="debtRBT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoDebt")
@XmlEnum
public enum RequiredInfoDebt {

    @XmlEnumValue("debt")
    DEBT("debt"),
    @XmlEnumValue("debtPC")
    DEBT_PC("debtPC"),
    @XmlEnumValue("debtPP")
    DEBT_PP("debtPP"),
    @XmlEnumValue("debtRBT")
    DEBT_RBT("debtRBT");
    private final String value;

    RequiredInfoDebt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoDebt fromValue(String v) {
        for (RequiredInfoDebt c: RequiredInfoDebt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
