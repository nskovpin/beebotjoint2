/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InteractionInfo;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="GetLastInteractionsResponse", propOrder={"interactionInfo"})
public class GetLastInteractionsResponse {
    protected List<InteractionInfo> interactionInfo;

    public List<InteractionInfo> getInteractionInfo() {
        if (this.interactionInfo == null) {
            this.interactionInfo = new ArrayList<InteractionInfo>();
        }
        return this.interactionInfo;
    }
}

