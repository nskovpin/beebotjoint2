/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ModernCRMInterface;

@WebServiceClient(name="CRMOperationsSOAPService", targetNamespace="urn:gf-crmoperations:interface-soap", wsdlLocation="http://ms-glass004:6743/CRMOperationsUrl?wsdl")
public class CRMOperationsSOAPService
extends Service {
    private static final URL CRMOPERATIONSSOAPSERVICE_WSDL_LOCATION;
    private static final WebServiceException CRMOPERATIONSSOAPSERVICE_EXCEPTION;
    private static final QName CRMOPERATIONSSOAPSERVICE_QNAME;

    public CRMOperationsSOAPService() {
        super(CRMOperationsSOAPService.__getWsdlLocation(), CRMOPERATIONSSOAPSERVICE_QNAME);
    }

    public /* varargs */ CRMOperationsSOAPService(WebServiceFeature ... features) {
        super(CRMOperationsSOAPService.__getWsdlLocation(), CRMOPERATIONSSOAPSERVICE_QNAME, features);
    }

    public CRMOperationsSOAPService(URL wsdlLocation) {
        super(wsdlLocation, CRMOPERATIONSSOAPSERVICE_QNAME);
    }

    public /* varargs */ CRMOperationsSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, CRMOPERATIONSSOAPSERVICE_QNAME, features);
    }

    public CRMOperationsSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public /* varargs */ CRMOperationsSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name="ModernCRMInterfaceBindingPort")
    public ModernCRMInterface getModernCRMInterfaceBindingPort() {
        return (ModernCRMInterface)super.getPort(new QName("urn:gf-crmoperations:interface-soap", "ModernCRMInterfaceBindingPort"), ModernCRMInterface.class);
    }

    @WebEndpoint(name="ModernCRMInterfaceBindingPort")
    public /* varargs */ ModernCRMInterface getModernCRMInterfaceBindingPort(WebServiceFeature ... features) {
        return (ModernCRMInterface)super.getPort(new QName("urn:gf-crmoperations:interface-soap", "ModernCRMInterfaceBindingPort"), ModernCRMInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRMOPERATIONSSOAPSERVICE_EXCEPTION != null) {
            throw CRMOPERATIONSSOAPSERVICE_EXCEPTION;
        }
        return CRMOPERATIONSSOAPSERVICE_WSDL_LOCATION;
    }

    static {
        CRMOPERATIONSSOAPSERVICE_QNAME = new QName("urn:gf-crmoperations:interface-soap", "CRMOperationsSOAPService");
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ms-glass004:6743/CRMOperationsUrl?wsdl");
        }
        catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRMOPERATIONSSOAPSERVICE_WSDL_LOCATION = url;
        CRMOPERATIONSSOAPSERVICE_EXCEPTION = e;
    }
}

