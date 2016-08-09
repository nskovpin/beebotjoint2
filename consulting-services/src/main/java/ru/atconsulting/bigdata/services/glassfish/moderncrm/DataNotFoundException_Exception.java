/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.ws.WebFault;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException;

@WebFault(name="dataNotFoundException", targetNamespace="urn:gf-crmoperations:types")
public class DataNotFoundException_Exception
extends Exception {
    private DataNotFoundException faultInfo;

    public DataNotFoundException_Exception(String message, DataNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public DataNotFoundException_Exception(String message, DataNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public DataNotFoundException getFaultInfo() {
        return this.faultInfo;
    }
}

