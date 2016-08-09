package ru.atconsulting.bigdata.services;

import ru.atconsulting.bigdata.services.glassfish.moderncrm.*;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

/**
 * Created by NSkovpin on 15.06.2016.
 */
public interface ServiceClient {


    ClientProperties getClientProperties();

    Object getServiceResult(ServicesNames service, ClientProperties properties) throws JAXBException, ServiceException, DatatypeConfigurationException, IllegalUsageException_Exception, DataNotFoundException_Exception, GetTTInfoByCoordinateFault_Exception, InternalSystemErrorException_Exception;

}
