
package ru.atconsulting.bigdata.services.glassfish.trouble;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CaseToTroubleTicketService", targetNamespace = "urn:gf-case-to-trouble:service:wsdl", wsdlLocation = "http://ms-glass018:5678/CasetoTTGetTT?wsdl")
public class CaseToTroubleTicketService
    extends Service
{

    private final static URL CASETOTROUBLETICKETSERVICE_WSDL_LOCATION;
    private final static WebServiceException CASETOTROUBLETICKETSERVICE_EXCEPTION;
    private final static QName CASETOTROUBLETICKETSERVICE_QNAME = new QName("urn:gf-case-to-trouble:service:wsdl", "CaseToTroubleTicketService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ms-glass018:5678/CasetoTTGetTT?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CASETOTROUBLETICKETSERVICE_WSDL_LOCATION = url;
        CASETOTROUBLETICKETSERVICE_EXCEPTION = e;
    }

    public CaseToTroubleTicketService() {
        super(__getWsdlLocation(), CASETOTROUBLETICKETSERVICE_QNAME);
    }

    public CaseToTroubleTicketService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CASETOTROUBLETICKETSERVICE_QNAME, features);
    }

    public CaseToTroubleTicketService(URL wsdlLocation) {
        super(wsdlLocation, CASETOTROUBLETICKETSERVICE_QNAME);
    }

    public CaseToTroubleTicketService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CASETOTROUBLETICKETSERVICE_QNAME, features);
    }

    public CaseToTroubleTicketService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CaseToTroubleTicketService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CaseToTroubleTicketInterface
     */
    @WebEndpoint(name = "CaseToTroubleTicketPort")
    public CaseToTroubleTicketInterface getCaseToTroubleTicketPort() {
        return super.getPort(new QName("urn:gf-case-to-trouble:service:wsdl", "CaseToTroubleTicketPort"), CaseToTroubleTicketInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CaseToTroubleTicketInterface
     */
    @WebEndpoint(name = "CaseToTroubleTicketPort")
    public CaseToTroubleTicketInterface getCaseToTroubleTicketPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:gf-case-to-trouble:service:wsdl", "CaseToTroubleTicketPort"), CaseToTroubleTicketInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CASETOTROUBLETICKETSERVICE_EXCEPTION!= null) {
            throw CASETOTROUBLETICKETSERVICE_EXCEPTION;
        }
        return CASETOTROUBLETICKETSERVICE_WSDL_LOCATION;
    }

}
