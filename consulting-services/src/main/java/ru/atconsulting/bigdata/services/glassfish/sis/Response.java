
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balances" type="{urn:gf-subscriber-info-service:xsd}balances" minOccurs="0"/>
 *         &lt;element name="corebalance" type="{urn:gf-subscriber-info-service:xsd}corebalance" minOccurs="0"/>
 *         &lt;element name="subscription" type="{urn:gf-subscriber-info-service:xsd}subscription" minOccurs="0"/>
 *         &lt;element name="SOCs" type="{urn:gf-subscriber-info-service:xsd}SOCs" minOccurs="0"/>
 *         &lt;element name="HLC" type="{urn:gf-subscriber-info-service:xsd}HLC" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableBalances" type="{urn:gf-subscriber-info-service:xsd}availableBalances" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource" type="{urn:gf-subscriber-info-service:xsd}resource" minOccurs="0"/>
 *         &lt;element name="accumulators" type="{urn:gf-subscriber-info-service:xsd}accumulators" minOccurs="0"/>
 *         &lt;element name="soc" type="{urn:gf-subscriber-info-service:xsd}SOC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerInfo" type="{urn:gf-subscriber-info-service:xsd}CustomerInfo" minOccurs="0"/>
 *         &lt;element name="promisedPayments" type="{urn:gf-subscriber-info-service:xsd}PromisedPayments" minOccurs="0"/>
 *         &lt;element name="subscriberOperatorInfo" type="{urn:gf-subscriber-info-service:xsd}SubscriberOperatorInfo" minOccurs="0"/>
 *         &lt;element name="ctnList" type="{urn:gf-subscriber-info-service:xsd}CtnList" minOccurs="0"/>
 *         &lt;element name="ctnListInfo" type="{urn:gf-subscriber-info-service:xsd}CtnListInfo" minOccurs="0"/>
 *         &lt;element name="ctnListCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberInfo" type="{urn:gf-subscriber-info-service:xsd}SubscriberNumber" minOccurs="0"/>
 *         &lt;element name="dataTrafficPackets" type="{urn:gf-subscriber-info-service:xsd}dataTrafficPackets" minOccurs="0"/>
 *         &lt;element name="customerProperties" type="{urn:gf-subscriber-info-service:xsd}CustomerProperties" minOccurs="0"/>
 *         &lt;element name="offers" type="{urn:gf-subscriber-info-service:xsd}Offers" minOccurs="0"/>
 *         &lt;element name="platformId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseFeaturesRef" type="{urn:gf-subscriber-info-service:xsd}BaseFeaturesRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupAccount" type="{urn:gf-subscriber-info-service:xsd}GroupAccount" minOccurs="0"/>
 *         &lt;element name="socIndicators" type="{urn:gf-subscriber-info-service:xsd}SocIndicators" minOccurs="0"/>
 *         &lt;element name="socIndicatorsInfo" type="{urn:gf-subscriber-info-service:xsd}SocIndicatorsInfo" minOccurs="0"/>
 *         &lt;element name="bill" type="{urn:gf-subscriber-info-service:xsd}Bill" minOccurs="0"/>
 *         &lt;element name="imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helloFee" type="{urn:gf-subscriber-info-service:xsd}HelloFee" minOccurs="0"/>
 *         &lt;element name="startBalance" type="{urn:gf-subscriber-info-service:xsd}StartBalance" minOccurs="0"/>
 *         &lt;element name="reservedFunds" type="{urn:gf-subscriber-info-service:xsd}ReservedFunds" minOccurs="0"/>
 *         &lt;element name="suspends" type="{urn:gf-subscriber-info-service:xsd}suspends" minOccurs="0"/>
 *         &lt;element name="subContractInfo" type="{urn:gf-subscriber-info-service:xsd}SubContractInfo" minOccurs="0"/>
 *         &lt;element name="customerProfile" type="{urn:gf-subscriber-info-service:xsd}CustomerProfile" minOccurs="0"/>
 *         &lt;element name="registrationInfo" type="{urn:gf-subscriber-info-service:xsd}RegistrationInfo" minOccurs="0"/>
 *         &lt;element name="fillPattern" type="{urn:gf-subscriber-info-service:xsd}FillPatternType" minOccurs="0"/>
 *         &lt;element name="banHierarchy" type="{urn:gf-subscriber-info-service:xsd}BanHierarchy" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:gf-subscriber-info-service:xsd}Location" minOccurs="0"/>
 *         &lt;element name="locationMarket" type="{urn:gf-subscriber-info-service:xsd}LocationMarket" minOccurs="0"/>
 *         &lt;element name="balanceGrants" type="{urn:gf-subscriber-info-service:xsd}BalanceGrants" minOccurs="0"/>
 *         &lt;element name="periodicCharges" type="{urn:gf-subscriber-info-service:xsd}PeriodicCharges" minOccurs="0"/>
 *         &lt;element name="pendingCharges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriberPolicies" type="{urn:gf-subscriber-info-service:xsd}SubscriberPolicies" minOccurs="0"/>
 *         &lt;element name="socDetails" type="{urn:gf-subscriber-info-service:xsd}SocDetails" minOccurs="0"/>
 *         &lt;element name="equipmentInfo" type="{urn:gf-subscriber-info-service:xsd}EquipmentInfo" minOccurs="0"/>
 *         &lt;element name="simType" type="{urn:gf-subscriber-info-service:xsd}SimType" minOccurs="0"/>
 *         &lt;element name="isEquipmentSupportLTE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monthlyFee" type="{urn:gf-subscriber-info-service:xsd}MonthlyFee" minOccurs="0"/>
 *         &lt;element name="infoPP" type="{urn:gf-subscriber-info-service:xsd}InfoPP" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ctn" type="{urn:gf-subscriber-info-service:xsd}ctn" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "balances",
    "corebalance",
    "subscription",
    "soCs",
    "hlc",
    "msisdn",
    "availableBalances",
    "type",
    "state",
    "resource",
    "accumulators",
    "soc",
    "currencyCode",
    "customerInfo",
    "promisedPayments",
    "subscriberOperatorInfo",
    "ctnList",
    "ctnListInfo",
    "ctnListCount",
    "numberInfo",
    "dataTrafficPackets",
    "customerProperties",
    "offers",
    "platformId",
    "passwordInfo",
    "baseFeaturesRef",
    "groupAccount",
    "socIndicators",
    "socIndicatorsInfo",
    "bill",
    "imsi",
    "ctn",
    "helloFee",
    "startBalance",
    "reservedFunds",
    "suspends",
    "subContractInfo",
    "customerProfile",
    "registrationInfo",
    "fillPattern",
    "banHierarchy",
    "location",
    "locationMarket",
    "balanceGrants",
    "periodicCharges",
    "pendingCharges",
    "subscriberPolicies",
    "socDetails",
    "equipmentInfo",
    "simType",
    "isEquipmentSupportLTE",
    "monthlyFee",
    "infoPP"
})
public class Response implements Serializable{

    protected Balances balances;
    protected Corebalance corebalance;
    protected Subscription subscription;
    @XmlElement(name = "SOCs")
    protected SOCs soCs;
    @XmlElement(name = "HLC")
    protected HLC hlc;
    protected String msisdn;
    protected AvailableBalances availableBalances;
    protected String type;
    protected String state;
    protected Resource resource;
    protected Accumulators accumulators;
    protected List<SOC> soc;
    protected String currencyCode;
    protected CustomerInfo customerInfo;
    protected PromisedPayments promisedPayments;
    protected SubscriberOperatorInfo subscriberOperatorInfo;
    protected CtnList ctnList;
    protected CtnListInfo ctnListInfo;
    protected String ctnListCount;
    protected SubscriberNumber numberInfo;
    protected DataTrafficPackets dataTrafficPackets;
    protected CustomerProperties customerProperties;
    protected Offers offers;
    protected String platformId;
    protected String passwordInfo;
    protected List<BaseFeaturesRef> baseFeaturesRef;
    protected GroupAccount groupAccount;
    protected SocIndicators socIndicators;
    protected SocIndicatorsInfo socIndicatorsInfo;
    protected Bill bill;
    protected String imsi;
    protected String ctn;
    protected HelloFee helloFee;
    protected StartBalance startBalance;
    protected ReservedFunds reservedFunds;
    protected Suspends suspends;
    protected SubContractInfo subContractInfo;
    protected CustomerProfile customerProfile;
    protected RegistrationInfo registrationInfo;
    protected FillPatternType fillPattern;
    protected BanHierarchy banHierarchy;
    protected Location location;
    protected LocationMarket locationMarket;
    protected BalanceGrants balanceGrants;
    protected PeriodicCharges periodicCharges;
    protected Boolean pendingCharges;
    protected SubscriberPolicies subscriberPolicies;
    protected SocDetails socDetails;
    protected EquipmentInfo equipmentInfo;
    protected SimType simType;
    protected Boolean isEquipmentSupportLTE;
    protected MonthlyFee monthlyFee;
    protected InfoPP infoPP;
    @XmlAttribute(name = "ctn")
    protected String ctnAttribute;

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link Balances }
     *     
     */
    public Balances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balances }
     *     
     */
    public void setBalances(Balances value) {
        this.balances = value;
    }

    /**
     * Gets the value of the corebalance property.
     * 
     * @return
     *     possible object is
     *     {@link Corebalance }
     *     
     */
    public Corebalance getCorebalance() {
        return corebalance;
    }

    /**
     * Sets the value of the corebalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corebalance }
     *     
     */
    public void setCorebalance(Corebalance value) {
        this.corebalance = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the soCs property.
     * 
     * @return
     *     possible object is
     *     {@link SOCs }
     *     
     */
    public SOCs getSOCs() {
        return soCs;
    }

    /**
     * Sets the value of the soCs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOCs }
     *     
     */
    public void setSOCs(SOCs value) {
        this.soCs = value;
    }

    /**
     * Gets the value of the hlc property.
     * 
     * @return
     *     possible object is
     *     {@link HLC }
     *     
     */
    public HLC getHLC() {
        return hlc;
    }

    /**
     * Sets the value of the hlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HLC }
     *     
     */
    public void setHLC(HLC value) {
        this.hlc = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the availableBalances property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableBalances }
     *     
     */
    public AvailableBalances getAvailableBalances() {
        return availableBalances;
    }

    /**
     * Sets the value of the availableBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableBalances }
     *     
     */
    public void setAvailableBalances(AvailableBalances value) {
        this.availableBalances = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

    /**
     * Gets the value of the accumulators property.
     * 
     * @return
     *     possible object is
     *     {@link Accumulators }
     *     
     */
    public Accumulators getAccumulators() {
        return accumulators;
    }

    /**
     * Sets the value of the accumulators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accumulators }
     *     
     */
    public void setAccumulators(Accumulators value) {
        this.accumulators = value;
    }

    /**
     * Gets the value of the soc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SOC }
     * 
     * 
     */
    public List<SOC> getSoc() {
        if (soc == null) {
            soc = new ArrayList<SOC>();
        }
        return this.soc;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setCustomerInfo(CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the promisedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link PromisedPayments }
     *     
     */
    public PromisedPayments getPromisedPayments() {
        return promisedPayments;
    }

    /**
     * Sets the value of the promisedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromisedPayments }
     *     
     */
    public void setPromisedPayments(PromisedPayments value) {
        this.promisedPayments = value;
    }

    /**
     * Gets the value of the subscriberOperatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberOperatorInfo }
     *     
     */
    public SubscriberOperatorInfo getSubscriberOperatorInfo() {
        return subscriberOperatorInfo;
    }

    /**
     * Sets the value of the subscriberOperatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberOperatorInfo }
     *     
     */
    public void setSubscriberOperatorInfo(SubscriberOperatorInfo value) {
        this.subscriberOperatorInfo = value;
    }

    /**
     * Gets the value of the ctnList property.
     * 
     * @return
     *     possible object is
     *     {@link CtnList }
     *     
     */
    public CtnList getCtnList() {
        return ctnList;
    }

    /**
     * Sets the value of the ctnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnList }
     *     
     */
    public void setCtnList(CtnList value) {
        this.ctnList = value;
    }

    /**
     * Gets the value of the ctnListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CtnListInfo }
     *     
     */
    public CtnListInfo getCtnListInfo() {
        return ctnListInfo;
    }

    /**
     * Sets the value of the ctnListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtnListInfo }
     *     
     */
    public void setCtnListInfo(CtnListInfo value) {
        this.ctnListInfo = value;
    }

    /**
     * Gets the value of the ctnListCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtnListCount() {
        return ctnListCount;
    }

    /**
     * Sets the value of the ctnListCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtnListCount(String value) {
        this.ctnListCount = value;
    }

    /**
     * Gets the value of the numberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberNumber }
     *     
     */
    public SubscriberNumber getNumberInfo() {
        return numberInfo;
    }

    /**
     * Sets the value of the numberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberNumber }
     *     
     */
    public void setNumberInfo(SubscriberNumber value) {
        this.numberInfo = value;
    }

    /**
     * Gets the value of the dataTrafficPackets property.
     * 
     * @return
     *     possible object is
     *     {@link DataTrafficPackets }
     *     
     */
    public DataTrafficPackets getDataTrafficPackets() {
        return dataTrafficPackets;
    }

    /**
     * Sets the value of the dataTrafficPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTrafficPackets }
     *     
     */
    public void setDataTrafficPackets(DataTrafficPackets value) {
        this.dataTrafficPackets = value;
    }

    /**
     * Gets the value of the customerProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProperties }
     *     
     */
    public CustomerProperties getCustomerProperties() {
        return customerProperties;
    }

    /**
     * Sets the value of the customerProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProperties }
     *     
     */
    public void setCustomerProperties(CustomerProperties value) {
        this.customerProperties = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link Offers }
     *     
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offers }
     *     
     */
    public void setOffers(Offers value) {
        this.offers = value;
    }

    /**
     * Gets the value of the platformId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     * Sets the value of the platformId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformId(String value) {
        this.platformId = value;
    }

    /**
     * Gets the value of the passwordInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordInfo() {
        return passwordInfo;
    }

    /**
     * Sets the value of the passwordInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordInfo(String value) {
        this.passwordInfo = value;
    }

    /**
     * Gets the value of the baseFeaturesRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseFeaturesRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseFeaturesRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseFeaturesRef }
     * 
     * 
     */
    public List<BaseFeaturesRef> getBaseFeaturesRef() {
        if (baseFeaturesRef == null) {
            baseFeaturesRef = new ArrayList<BaseFeaturesRef>();
        }
        return this.baseFeaturesRef;
    }

    /**
     * Gets the value of the groupAccount property.
     * 
     * @return
     *     possible object is
     *     {@link GroupAccount }
     *     
     */
    public GroupAccount getGroupAccount() {
        return groupAccount;
    }

    /**
     * Sets the value of the groupAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupAccount }
     *     
     */
    public void setGroupAccount(GroupAccount value) {
        this.groupAccount = value;
    }

    /**
     * Gets the value of the socIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link SocIndicators }
     *     
     */
    public SocIndicators getSocIndicators() {
        return socIndicators;
    }

    /**
     * Sets the value of the socIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocIndicators }
     *     
     */
    public void setSocIndicators(SocIndicators value) {
        this.socIndicators = value;
    }

    /**
     * Gets the value of the socIndicatorsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SocIndicatorsInfo }
     *     
     */
    public SocIndicatorsInfo getSocIndicatorsInfo() {
        return socIndicatorsInfo;
    }

    /**
     * Sets the value of the socIndicatorsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocIndicatorsInfo }
     *     
     */
    public void setSocIndicatorsInfo(SocIndicatorsInfo value) {
        this.socIndicatorsInfo = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link Bill }
     *     
     */
    public Bill getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bill }
     *     
     */
    public void setBill(Bill value) {
        this.bill = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the ctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtn() {
        return ctn;
    }

    /**
     * Sets the value of the ctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtn(String value) {
        this.ctn = value;
    }

    /**
     * Gets the value of the helloFee property.
     * 
     * @return
     *     possible object is
     *     {@link HelloFee }
     *     
     */
    public HelloFee getHelloFee() {
        return helloFee;
    }

    /**
     * Sets the value of the helloFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelloFee }
     *     
     */
    public void setHelloFee(HelloFee value) {
        this.helloFee = value;
    }

    /**
     * Gets the value of the startBalance property.
     * 
     * @return
     *     possible object is
     *     {@link StartBalance }
     *     
     */
    public StartBalance getStartBalance() {
        return startBalance;
    }

    /**
     * Sets the value of the startBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartBalance }
     *     
     */
    public void setStartBalance(StartBalance value) {
        this.startBalance = value;
    }

    /**
     * Gets the value of the reservedFunds property.
     * 
     * @return
     *     possible object is
     *     {@link ReservedFunds }
     *     
     */
    public ReservedFunds getReservedFunds() {
        return reservedFunds;
    }

    /**
     * Sets the value of the reservedFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedFunds }
     *     
     */
    public void setReservedFunds(ReservedFunds value) {
        this.reservedFunds = value;
    }

    /**
     * Gets the value of the suspends property.
     * 
     * @return
     *     possible object is
     *     {@link Suspends }
     *     
     */
    public Suspends getSuspends() {
        return suspends;
    }

    /**
     * Sets the value of the suspends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suspends }
     *     
     */
    public void setSuspends(Suspends value) {
        this.suspends = value;
    }

    /**
     * Gets the value of the subContractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubContractInfo }
     *     
     */
    public SubContractInfo getSubContractInfo() {
        return subContractInfo;
    }

    /**
     * Sets the value of the subContractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubContractInfo }
     *     
     */
    public void setSubContractInfo(SubContractInfo value) {
        this.subContractInfo = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfile }
     *     
     */
    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfile }
     *     
     */
    public void setCustomerProfile(CustomerProfile value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the registrationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationInfo }
     *     
     */
    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    /**
     * Sets the value of the registrationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationInfo }
     *     
     */
    public void setRegistrationInfo(RegistrationInfo value) {
        this.registrationInfo = value;
    }

    /**
     * Gets the value of the fillPattern property.
     * 
     * @return
     *     possible object is
     *     {@link FillPatternType }
     *     
     */
    public FillPatternType getFillPattern() {
        return fillPattern;
    }

    /**
     * Sets the value of the fillPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillPatternType }
     *     
     */
    public void setFillPattern(FillPatternType value) {
        this.fillPattern = value;
    }

    /**
     * Gets the value of the banHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BanHierarchy }
     *     
     */
    public BanHierarchy getBanHierarchy() {
        return banHierarchy;
    }

    /**
     * Sets the value of the banHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanHierarchy }
     *     
     */
    public void setBanHierarchy(BanHierarchy value) {
        this.banHierarchy = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationMarket property.
     * 
     * @return
     *     possible object is
     *     {@link LocationMarket }
     *     
     */
    public LocationMarket getLocationMarket() {
        return locationMarket;
    }

    /**
     * Sets the value of the locationMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationMarket }
     *     
     */
    public void setLocationMarket(LocationMarket value) {
        this.locationMarket = value;
    }

    /**
     * Gets the value of the balanceGrants property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceGrants }
     *     
     */
    public BalanceGrants getBalanceGrants() {
        return balanceGrants;
    }

    /**
     * Sets the value of the balanceGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceGrants }
     *     
     */
    public void setBalanceGrants(BalanceGrants value) {
        this.balanceGrants = value;
    }

    /**
     * Gets the value of the periodicCharges property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicCharges }
     *     
     */
    public PeriodicCharges getPeriodicCharges() {
        return periodicCharges;
    }

    /**
     * Sets the value of the periodicCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicCharges }
     *     
     */
    public void setPeriodicCharges(PeriodicCharges value) {
        this.periodicCharges = value;
    }

    /**
     * Gets the value of the pendingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingCharges() {
        return pendingCharges;
    }

    /**
     * Sets the value of the pendingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingCharges(Boolean value) {
        this.pendingCharges = value;
    }

    /**
     * Gets the value of the subscriberPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberPolicies }
     *     
     */
    public SubscriberPolicies getSubscriberPolicies() {
        return subscriberPolicies;
    }

    /**
     * Sets the value of the subscriberPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberPolicies }
     *     
     */
    public void setSubscriberPolicies(SubscriberPolicies value) {
        this.subscriberPolicies = value;
    }

    /**
     * Gets the value of the socDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SocDetails }
     *     
     */
    public SocDetails getSocDetails() {
        return socDetails;
    }

    /**
     * Sets the value of the socDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocDetails }
     *     
     */
    public void setSocDetails(SocDetails value) {
        this.socDetails = value;
    }

    /**
     * Gets the value of the equipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInfo }
     *     
     */
    public EquipmentInfo getEquipmentInfo() {
        return equipmentInfo;
    }

    /**
     * Sets the value of the equipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInfo }
     *     
     */
    public void setEquipmentInfo(EquipmentInfo value) {
        this.equipmentInfo = value;
    }

    /**
     * Gets the value of the simType property.
     * 
     * @return
     *     possible object is
     *     {@link SimType }
     *     
     */
    public SimType getSimType() {
        return simType;
    }

    /**
     * Sets the value of the simType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimType }
     *     
     */
    public void setSimType(SimType value) {
        this.simType = value;
    }

    /**
     * Gets the value of the isEquipmentSupportLTE property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEquipmentSupportLTE() {
        return isEquipmentSupportLTE;
    }

    /**
     * Sets the value of the isEquipmentSupportLTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEquipmentSupportLTE(Boolean value) {
        this.isEquipmentSupportLTE = value;
    }

    /**
     * Gets the value of the monthlyFee property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyFee }
     *     
     */
    public MonthlyFee getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Sets the value of the monthlyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyFee }
     *     
     */
    public void setMonthlyFee(MonthlyFee value) {
        this.monthlyFee = value;
    }

    /**
     * Gets the value of the infoPP property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPP }
     *     
     */
    public InfoPP getInfoPP() {
        return infoPP;
    }

    /**
     * Sets the value of the infoPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPP }
     *     
     */
    public void setInfoPP(InfoPP value) {
        this.infoPP = value;
    }

    /**
     * Gets the value of the ctnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtnAttribute() {
        return ctnAttribute;
    }

    /**
     * Sets the value of the ctnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtnAttribute(String value) {
        this.ctnAttribute = value;
    }

}
