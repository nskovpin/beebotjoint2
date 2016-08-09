package ru.atconsulting.bigdata.services.tsms.domain;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by NSkovpin on 30.06.2016.
 */
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseTsms implements Serializable{

    @XmlAttribute
    private String type;

    @XmlAttribute
    private String code;

    @XmlElement(name = "HOME_OPERATOR_NAME")
    private String homeOperatorName;

    @XmlElement(name = "HOME_COUNTRY_NAME")
    private String homeCountryName;

    @XmlElement(name = "VLR_MARKET_CODE")
    private String vlrMarketCode;

    @XmlElement(name = "IMSI")
    private String imsi;

    @XmlElement(name = "VIS_OPERATOR_NAME")
    private String visOperatorName;

    @XmlElement(name = "HOME_COUNTRY_CODE")
    private String homeCountryCode;

    @XmlElement(name = "HOME_OPERATOR_CODE")
    private String homeOperatorCode;

    @XmlElement(name = "VIS_COUNTRY_NAME")
    private String visCountryName;

    @XmlElement(name = "NUMBER_SMS_SENT")
    private String numberSmsSent;

    @XmlElement(name = "VIS_OPERATOR_CODE")
    private String visOperatorCode;

    @XmlElement(name = "DATE_OUT")
    private String dateOut;

    @XmlElement(name = "VIS_COUNTRY_CODE")
    private String visCountryCode;

    @XmlElement(name = "DATE_LAST")
    private String dateLast;

    @XmlElement(name = "DATE_IN")
    private String dateIn;

    @XmlElement(name = "VLR_LOCATION")
    private String vlrLocation;

    @XmlElement(name = "MSISDN")
    private String msisdn;

    @XmlElement(name = "VLR_BRANCH")
    private String vlrBranch;

    @XmlElement(name = "TYPE")
    private String typeElement;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateLast() {
        return dateLast;
    }

    public void setDateLast(String dateLast) {
        this.dateLast = dateLast;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getHomeCountryCode() {
        return homeCountryCode;
    }

    public void setHomeCountryCode(String homeCountryCode) {
        this.homeCountryCode = homeCountryCode;
    }

    public String getHomeCountryName() {
        return homeCountryName;
    }

    public void setHomeCountryName(String homeCountryName) {
        this.homeCountryName = homeCountryName;
    }

    public String getHomeOperatorCode() {
        return homeOperatorCode;
    }

    public void setHomeOperatorCode(String homeOperatorCode) {
        this.homeOperatorCode = homeOperatorCode;
    }

    public String getHomeOperatorName() {
        return homeOperatorName;
    }

    public void setHomeOperatorName(String homeOperatorName) {
        this.homeOperatorName = homeOperatorName;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getNumberSmsSent() {
        return numberSmsSent;
    }

    public void setNumberSmsSent(String numberSmsSent) {
        this.numberSmsSent = numberSmsSent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeElement() {
        return typeElement;
    }

    public void setTypeElement(String typeElement) {
        this.typeElement = typeElement;
    }

    public String getVisCountryCode() {
        return visCountryCode;
    }

    public void setVisCountryCode(String visCountryCode) {
        this.visCountryCode = visCountryCode;
    }

    public String getVisCountryName() {
        return visCountryName;
    }

    public void setVisCountryName(String visCountryName) {
        this.visCountryName = visCountryName;
    }

    public String getVisOperatorCode() {
        return visOperatorCode;
    }

    public void setVisOperatorCode(String visOperatorCode) {
        this.visOperatorCode = visOperatorCode;
    }

    public String getVisOperatorName() {
        return visOperatorName;
    }

    public void setVisOperatorName(String visOperatorName) {
        this.visOperatorName = visOperatorName;
    }

    public String getVlrBranch() {
        return vlrBranch;
    }

    public void setVlrBranch(String vlrBranch) {
        this.vlrBranch = vlrBranch;
    }

    public String getVlrLocation() {
        return vlrLocation;
    }

    public void setVlrLocation(String vlrLocation) {
        this.vlrLocation = vlrLocation;
    }

    public String getVlrMarketCode() {
        return vlrMarketCode;
    }

    public void setVlrMarketCode(String vlrMarketCode) {
        this.vlrMarketCode = vlrMarketCode;
    }
}
