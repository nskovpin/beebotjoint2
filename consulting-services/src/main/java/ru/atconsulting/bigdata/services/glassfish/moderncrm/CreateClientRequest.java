/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CompanyInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.HeadquartersInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.PrimaryContactInfo;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateClientRequest", propOrder={"clientType", "inn", "headquartersInfo", "companyInfo", "primaryContactInfo", "infoSource", "salesRep", "serviceManager", "description"})
public class CreateClientRequest {
    @XmlElement(required=true)
    protected String clientType;
    protected String inn;
    protected HeadquartersInfo headquartersInfo;
    protected CompanyInfo companyInfo;
    protected PrimaryContactInfo primaryContactInfo;
    protected String infoSource;
    protected String salesRep;
    protected String serviceManager;
    protected String description;

    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String value) {
        this.clientType = value;
    }

    public String getInn() {
        return this.inn;
    }

    public void setInn(String value) {
        this.inn = value;
    }

    public HeadquartersInfo getHeadquartersInfo() {
        return this.headquartersInfo;
    }

    public void setHeadquartersInfo(HeadquartersInfo value) {
        this.headquartersInfo = value;
    }

    public CompanyInfo getCompanyInfo() {
        return this.companyInfo;
    }

    public void setCompanyInfo(CompanyInfo value) {
        this.companyInfo = value;
    }

    public PrimaryContactInfo getPrimaryContactInfo() {
        return this.primaryContactInfo;
    }

    public void setPrimaryContactInfo(PrimaryContactInfo value) {
        this.primaryContactInfo = value;
    }

    public String getInfoSource() {
        return this.infoSource;
    }

    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    public String getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(String value) {
        this.salesRep = value;
    }

    public String getServiceManager() {
        return this.serviceManager;
    }

    public void setServiceManager(String value) {
        this.serviceManager = value;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String value) {
        this.description = value;
    }
}

