
package ru.atconsulting.bigdata.services.glassfish.sis;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SubscriberHistory", targetNamespace = "urn:gf-subscriber-info-service:wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SubscriberHistory {


    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.generated.ResponseHistory
     * @throws ServiceException
     */
    @WebMethod(operationName = "SubscriberHistory")
    @WebResult(name = "responseHistory", targetNamespace = "urn:gf-subscriber-info-service:xsd", partName = "response")
    public ResponseHistory subscriberHistory(
            @WebParam(name = "requestHistory", targetNamespace = "urn:gf-subscriber-info-service:xsd", partName = "request")
            RequestHistory request)
        throws ServiceException
    ;

}
