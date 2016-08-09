
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
@WebService(name = "SubscriberDebt", targetNamespace = "urn:gf-subscriber-info-service:wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SubscriberDebt {


    /**
     * 
     * @param request
     * @return
     *     returns ru.atconsulting.bigdata.client.glassfish.generated.ResponseDebt
     * @throws ServiceException
     */
    @WebMethod(operationName = "SubscriberDebt")
    @WebResult(name = "responseDebt", targetNamespace = "urn:gf-subscriber-info-service:xsd", partName = "response")
    public ResponseDebt subscriberDebt(
            @WebParam(name = "requestDebt", targetNamespace = "urn:gf-subscriber-info-service:xsd", partName = "request")
            RequestDebt request)
        throws ServiceException
    ;

}