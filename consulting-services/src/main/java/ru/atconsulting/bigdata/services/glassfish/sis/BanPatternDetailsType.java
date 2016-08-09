
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BanPatternDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BanPatternDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrAptType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrStreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPlaceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrAptNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrHouseNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="buildingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrPrimaryLn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeTelno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BanPatternDetailsType", propOrder = {
    "linkType",
    "nameFormat",
    "firstName",
    "lastBusinessName",
    "additionalTitle",
    "nameTitle",
    "adrAptType",
    "adrStreetType",
    "adrPlaceType",
    "adrAptNm",
    "adrCountyName",
    "adrCity",
    "adrCountry",
    "adrHouseNo",
    "buildingType",
    "buildingNumber",
    "adrPostCode",
    "adrDistrict",
    "adrPrimaryLn",
    "homeTelno",
    "firstFaxNo",
    "emailAddr"
})
public class BanPatternDetailsType implements Serializable {

    protected String linkType;
    protected String nameFormat;
    protected String firstName;
    protected String lastBusinessName;
    protected String additionalTitle;
    protected String nameTitle;
    protected String adrAptType;
    protected String adrStreetType;
    protected String adrPlaceType;
    protected String adrAptNm;
    protected String adrCountyName;
    protected String adrCity;
    protected String adrCountry;
    protected List<String> adrHouseNo;
    protected String buildingType;
    protected String buildingNumber;
    protected String adrPostCode;
    protected String adrDistrict;
    protected String adrPrimaryLn;
    protected String homeTelno;
    protected String firstFaxNo;
    protected String emailAddr;

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the nameFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormat() {
        return nameFormat;
    }

    /**
     * Sets the value of the nameFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormat(String value) {
        this.nameFormat = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBusinessName() {
        return lastBusinessName;
    }

    /**
     * Sets the value of the lastBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBusinessName(String value) {
        this.lastBusinessName = value;
    }

    /**
     * Gets the value of the additionalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTitle() {
        return additionalTitle;
    }

    /**
     * Sets the value of the additionalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTitle(String value) {
        this.additionalTitle = value;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the adrAptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrAptType() {
        return adrAptType;
    }

    /**
     * Sets the value of the adrAptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrAptType(String value) {
        this.adrAptType = value;
    }

    /**
     * Gets the value of the adrStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrStreetType() {
        return adrStreetType;
    }

    /**
     * Sets the value of the adrStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrStreetType(String value) {
        this.adrStreetType = value;
    }

    /**
     * Gets the value of the adrPlaceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPlaceType() {
        return adrPlaceType;
    }

    /**
     * Sets the value of the adrPlaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPlaceType(String value) {
        this.adrPlaceType = value;
    }

    /**
     * Gets the value of the adrAptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrAptNm() {
        return adrAptNm;
    }

    /**
     * Sets the value of the adrAptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrAptNm(String value) {
        this.adrAptNm = value;
    }

    /**
     * Gets the value of the adrCountyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCountyName() {
        return adrCountyName;
    }

    /**
     * Sets the value of the adrCountyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCountyName(String value) {
        this.adrCountyName = value;
    }

    /**
     * Gets the value of the adrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCity() {
        return adrCity;
    }

    /**
     * Sets the value of the adrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCity(String value) {
        this.adrCity = value;
    }

    /**
     * Gets the value of the adrCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrCountry() {
        return adrCountry;
    }

    /**
     * Sets the value of the adrCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrCountry(String value) {
        this.adrCountry = value;
    }

    /**
     * Gets the value of the adrHouseNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrHouseNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrHouseNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrHouseNo() {
        if (adrHouseNo == null) {
            adrHouseNo = new ArrayList<String>();
        }
        return this.adrHouseNo;
    }

    /**
     * Gets the value of the buildingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingType(String value) {
        this.buildingType = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the adrPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPostCode() {
        return adrPostCode;
    }

    /**
     * Sets the value of the adrPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPostCode(String value) {
        this.adrPostCode = value;
    }

    /**
     * Gets the value of the adrDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrDistrict() {
        return adrDistrict;
    }

    /**
     * Sets the value of the adrDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrDistrict(String value) {
        this.adrDistrict = value;
    }

    /**
     * Gets the value of the adrPrimaryLn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrPrimaryLn() {
        return adrPrimaryLn;
    }

    /**
     * Sets the value of the adrPrimaryLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrPrimaryLn(String value) {
        this.adrPrimaryLn = value;
    }

    /**
     * Gets the value of the homeTelno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeTelno() {
        return homeTelno;
    }

    /**
     * Sets the value of the homeTelno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeTelno(String value) {
        this.homeTelno = value;
    }

    /**
     * Gets the value of the firstFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFaxNo() {
        return firstFaxNo;
    }

    /**
     * Sets the value of the firstFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFaxNo(String value) {
        this.firstFaxNo = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

}
