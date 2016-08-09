/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.AccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FinAccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ServiceIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SiteIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.TopicRequest;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateInteractionRequest", propOrder={"interactionTitle", "direction", "type", "media", "reporterAccountIdent", "reporterServiceIdent", "reporterFinAccountIdent", "sessionId", "notes", "topics", "dealerFinAccountIdent", "interactionTerritory", "startDate", "endDate"})
public class CreateInteractionRequest {
    protected String interactionTitle;
    @XmlElement(required=true)
    protected BigInteger direction;
    @XmlElement(required=true)
    protected String type;
    @XmlElement(required=true)
    protected String media;
    protected AccountIdent reporterAccountIdent;
    protected ServiceIdent reporterServiceIdent;
    protected FinAccountIdent reporterFinAccountIdent;
    protected String sessionId;
    protected String notes;
    @XmlElement(required=true)
    protected List<TopicRequest> topics;
    protected FinAccountIdent dealerFinAccountIdent;
    protected SiteIdent interactionTerritory;
    @XmlElement(required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar endDate;

    public String getInteractionTitle() {
        return this.interactionTitle;
    }

    public void setInteractionTitle(String value) {
        this.interactionTitle = value;
    }

    public BigInteger getDirection() {
        return this.direction;
    }

    public void setDirection(BigInteger value) {
        this.direction = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getMedia() {
        return this.media;
    }

    public void setMedia(String value) {
        this.media = value;
    }

    public AccountIdent getReporterAccountIdent() {
        return this.reporterAccountIdent;
    }

    public void setReporterAccountIdent(AccountIdent value) {
        this.reporterAccountIdent = value;
    }

    public ServiceIdent getReporterServiceIdent() {
        return this.reporterServiceIdent;
    }

    public void setReporterServiceIdent(ServiceIdent value) {
        this.reporterServiceIdent = value;
    }

    public FinAccountIdent getReporterFinAccountIdent() {
        return this.reporterFinAccountIdent;
    }

    public void setReporterFinAccountIdent(FinAccountIdent value) {
        this.reporterFinAccountIdent = value;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String value) {
        this.sessionId = value;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

    public List<TopicRequest> getTopics() {
        if (this.topics == null) {
            this.topics = new ArrayList<TopicRequest>();
        }
        return this.topics;
    }

    public FinAccountIdent getDealerFinAccountIdent() {
        return this.dealerFinAccountIdent;
    }

    public void setDealerFinAccountIdent(FinAccountIdent value) {
        this.dealerFinAccountIdent = value;
    }

    public SiteIdent getInteractionTerritory() {
        return this.interactionTerritory;
    }

    public void setInteractionTerritory(SiteIdent value) {
        this.interactionTerritory = value;
    }

    public XMLGregorianCalendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public XMLGregorianCalendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }
}

