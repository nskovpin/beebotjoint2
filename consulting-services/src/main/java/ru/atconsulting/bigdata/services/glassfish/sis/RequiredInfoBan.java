
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredInfoBan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfoBan">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="customerInfo"/>
 *     &lt;enumeration value="ctnList"/>
 *     &lt;enumeration value="ctnListInfo"/>
 *     &lt;enumeration value="ctnListCount"/>
 *     &lt;enumeration value="customerProperties"/>
 *     &lt;enumeration value="subscription"/>
 *     &lt;enumeration value="fillPattern"/>
 *     &lt;enumeration value="banHierarchy"/>
 *     &lt;enumeration value="ctnImsiByBan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfoBan")
@XmlEnum
public enum RequiredInfoBan {

    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("customerInfo")
    CUSTOMER_INFO("customerInfo"),
    @XmlEnumValue("ctnList")
    CTN_LIST("ctnList"),
    @XmlEnumValue("ctnListInfo")
    CTN_LIST_INFO("ctnListInfo"),
    @XmlEnumValue("ctnListCount")
    CTN_LIST_COUNT("ctnListCount"),
    @XmlEnumValue("customerProperties")
    CUSTOMER_PROPERTIES("customerProperties"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription"),
    @XmlEnumValue("fillPattern")
    FILL_PATTERN("fillPattern"),
    @XmlEnumValue("banHierarchy")
    BAN_HIERARCHY("banHierarchy"),
    @XmlEnumValue("ctnImsiByBan")
    CTN_IMSI_BY_BAN("ctnImsiByBan");
    private final String value;

    RequiredInfoBan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfoBan fromValue(String v) {
        for (RequiredInfoBan c: RequiredInfoBan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
