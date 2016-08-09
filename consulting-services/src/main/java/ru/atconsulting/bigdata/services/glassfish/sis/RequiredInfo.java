
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requiredInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requiredInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="corebalance"/>
 *     &lt;enumeration value="balances"/>
 *     &lt;enumeration value="SOC"/>
 *     &lt;enumeration value="subscription"/>
 *     &lt;enumeration value="HLC"/>
 *     &lt;enumeration value="msisdn"/>
 *     &lt;enumeration value="availableBalances"/>
 *     &lt;enumeration value="type"/>
 *     &lt;enumeration value="state"/>
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="accumulators"/>
 *     &lt;enumeration value="SOCParameters"/>
 *     &lt;enumeration value="currencyCode"/>
 *     &lt;enumeration value="SOCbyFeature"/>
 *     &lt;enumeration value="SOCbyFeatureClass"/>
 *     &lt;enumeration value="customerInfoMNP"/>
 *     &lt;enumeration value="customerInfo"/>
 *     &lt;enumeration value="promisedPayments"/>
 *     &lt;enumeration value="subscriberOperatorInfo"/>
 *     &lt;enumeration value="ctnList"/>
 *     &lt;enumeration value="ctnListInfo"/>
 *     &lt;enumeration value="ctnListCount"/>
 *     &lt;enumeration value="startBalance"/>
 *     &lt;enumeration value="numberInfo"/>
 *     &lt;enumeration value="dataTrafficPackets"/>
 *     &lt;enumeration value="customerProperties"/>
 *     &lt;enumeration value="offers"/>
 *     &lt;enumeration value="platformId"/>
 *     &lt;enumeration value="baseFeaturesRef"/>
 *     &lt;enumeration value="passwordInfo"/>
 *     &lt;enumeration value="groupAccount"/>
 *     &lt;enumeration value="ctn"/>
 *     &lt;enumeration value="imsi"/>
 *     &lt;enumeration value="socIndicators"/>
 *     &lt;enumeration value="socIndicatorsInfo"/>
 *     &lt;enumeration value="bill"/>
 *     &lt;enumeration value="helloFee"/>
 *     &lt;enumeration value="reservedFunds"/>
 *     &lt;enumeration value="suspends"/>
 *     &lt;enumeration value="subContractInfo"/>
 *     &lt;enumeration value="customerProfile"/>
 *     &lt;enumeration value="registrationInfo"/>
 *     &lt;enumeration value="fillPattern"/>
 *     &lt;enumeration value="banHierarchy"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="locationMarket"/>
 *     &lt;enumeration value="balanceGrants"/>
 *     &lt;enumeration value="periodicCharges"/>
 *     &lt;enumeration value="pendingCharges"/>
 *     &lt;enumeration value="subscriberPolicies"/>
 *     &lt;enumeration value="socDetails"/>
 *     &lt;enumeration value="equipmentInfo"/>
 *     &lt;enumeration value="isEquipmentSupportLTE"/>
 *     &lt;enumeration value="simType"/>
 *     &lt;enumeration value="monthlyFee"/>
 *     &lt;enumeration value="infoPP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "requiredInfo")
@XmlEnum
public enum RequiredInfo {

    @XmlEnumValue("corebalance")
    COREBALANCE("corebalance"),
    @XmlEnumValue("balances")
    BALANCES("balances"),
    SOC("SOC"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription"),
    HLC("HLC"),
    @XmlEnumValue("msisdn")
    MSISDN("msisdn"),
    @XmlEnumValue("availableBalances")
    AVAILABLE_BALANCES("availableBalances"),
    @XmlEnumValue("type")
    TYPE("type"),
    @XmlEnumValue("state")
    STATE("state"),
    @XmlEnumValue("resource")
    RESOURCE("resource"),
    @XmlEnumValue("accumulators")
    ACCUMULATORS("accumulators"),
    @XmlEnumValue("SOCParameters")
    SOC_PARAMETERS("SOCParameters"),
    @XmlEnumValue("currencyCode")
    CURRENCY_CODE("currencyCode"),
    @XmlEnumValue("SOCbyFeature")
    SO_CBY_FEATURE("SOCbyFeature"),
    @XmlEnumValue("SOCbyFeatureClass")
    SO_CBY_FEATURE_CLASS("SOCbyFeatureClass"),
    @XmlEnumValue("customerInfoMNP")
    CUSTOMER_INFO_MNP("customerInfoMNP"),
    @XmlEnumValue("customerInfo")
    CUSTOMER_INFO("customerInfo"),
    @XmlEnumValue("promisedPayments")
    PROMISED_PAYMENTS("promisedPayments"),
    @XmlEnumValue("subscriberOperatorInfo")
    SUBSCRIBER_OPERATOR_INFO("subscriberOperatorInfo"),
    @XmlEnumValue("ctnList")
    CTN_LIST("ctnList"),
    @XmlEnumValue("ctnListInfo")
    CTN_LIST_INFO("ctnListInfo"),
    @XmlEnumValue("ctnListCount")
    CTN_LIST_COUNT("ctnListCount"),
    @XmlEnumValue("startBalance")
    START_BALANCE("startBalance"),
    @XmlEnumValue("numberInfo")
    NUMBER_INFO("numberInfo"),
    @XmlEnumValue("dataTrafficPackets")
    DATA_TRAFFIC_PACKETS("dataTrafficPackets"),
    @XmlEnumValue("customerProperties")
    CUSTOMER_PROPERTIES("customerProperties"),
    @XmlEnumValue("offers")
    OFFERS("offers"),
    @XmlEnumValue("platformId")
    PLATFORM_ID("platformId"),
    @XmlEnumValue("baseFeaturesRef")
    BASE_FEATURES_REF("baseFeaturesRef"),
    @XmlEnumValue("passwordInfo")
    PASSWORD_INFO("passwordInfo"),
    @XmlEnumValue("groupAccount")
    GROUP_ACCOUNT("groupAccount"),
    @XmlEnumValue("ctn")
    CTN("ctn"),
    @XmlEnumValue("imsi")
    IMSI("imsi"),
    @XmlEnumValue("socIndicators")
    SOC_INDICATORS("socIndicators"),
    @XmlEnumValue("socIndicatorsInfo")
    SOC_INDICATORS_INFO("socIndicatorsInfo"),
    @XmlEnumValue("bill")
    BILL("bill"),
    @XmlEnumValue("helloFee")
    HELLO_FEE("helloFee"),
    @XmlEnumValue("reservedFunds")
    RESERVED_FUNDS("reservedFunds"),
    @XmlEnumValue("suspends")
    SUSPENDS("suspends"),
    @XmlEnumValue("subContractInfo")
    SUB_CONTRACT_INFO("subContractInfo"),
    @XmlEnumValue("customerProfile")
    CUSTOMER_PROFILE("customerProfile"),
    @XmlEnumValue("registrationInfo")
    REGISTRATION_INFO("registrationInfo"),
    @XmlEnumValue("fillPattern")
    FILL_PATTERN("fillPattern"),
    @XmlEnumValue("banHierarchy")
    BAN_HIERARCHY("banHierarchy"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("locationMarket")
    LOCATION_MARKET("locationMarket"),
    @XmlEnumValue("balanceGrants")
    BALANCE_GRANTS("balanceGrants"),
    @XmlEnumValue("periodicCharges")
    PERIODIC_CHARGES("periodicCharges"),
    @XmlEnumValue("pendingCharges")
    PENDING_CHARGES("pendingCharges"),
    @XmlEnumValue("subscriberPolicies")
    SUBSCRIBER_POLICIES("subscriberPolicies"),
    @XmlEnumValue("socDetails")
    SOC_DETAILS("socDetails"),
    @XmlEnumValue("equipmentInfo")
    EQUIPMENT_INFO("equipmentInfo"),
    @XmlEnumValue("isEquipmentSupportLTE")
    IS_EQUIPMENT_SUPPORT_LTE("isEquipmentSupportLTE"),
    @XmlEnumValue("simType")
    SIM_TYPE("simType"),
    @XmlEnumValue("monthlyFee")
    MONTHLY_FEE("monthlyFee"),
    @XmlEnumValue("infoPP")
    INFO_PP("infoPP");
    private final String value;

    RequiredInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredInfo fromValue(String v) {
        for (RequiredInfo c: RequiredInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
