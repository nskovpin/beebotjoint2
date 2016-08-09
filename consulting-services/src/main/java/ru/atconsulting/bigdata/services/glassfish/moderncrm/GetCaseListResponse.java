/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.CaseInfo;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="GetCaseListResponse", propOrder={"caseInfo"})
public class GetCaseListResponse {
    protected List<CaseInfo> caseInfo;

    public List<CaseInfo> getCaseInfo() {
        if (this.caseInfo == null) {
            this.caseInfo = new ArrayList<CaseInfo>();
        }
        return this.caseInfo;
    }
}

