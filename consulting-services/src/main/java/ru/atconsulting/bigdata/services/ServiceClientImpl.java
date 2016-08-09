package ru.atconsulting.bigdata.services;

import ru.atconsulting.bigdata.services.glassfish.Reason;
import ru.atconsulting.bigdata.services.glassfish.impl.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.Corebalance;
import ru.atconsulting.bigdata.services.glassfish.sis.Response;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.sis.answer.TypeStateSocs;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;
import ru.atconsulting.bigdata.services.tsms.domain.Token;
import ru.atconsulting.bigdata.services.tsms.impl.TsmsClient;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import java.util.Map;

/**
 * Created by NSkovpin on 14.07.2016.
 */
public class ServiceClientImpl implements ServiceClient{

    private ClientProperties clientProperties;

    public ClientProperties getClientProperties() {
        return clientProperties;
    }

    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    /**
     *
     * @param ctn - subscriberNo 7930..
     * @param username - tsms username
     * @param password - tsms password
     * @param url - service url
     * @return roamingInd, true - roaming, false - home
     * @throws JAXBException - cant parse response
     */
    public Boolean getLocationService(String ctn, String username, String password, String url) throws JAXBException {
        TsmsClient tsmsClient = new TsmsClient();
        return tsmsClient.getLocationService(ctn, username, password, url);
    }

    /**
     *
     * @param username - tsms username
     * @param password - tsms password
     * @param url - service url
     * @return Token object
     * @throws JAXBException - cant parse response
     */
    public Token getLocationToken(String username, String password, String url) throws JAXBException {
        TsmsClient tsmsClient = new TsmsClient();
        return tsmsClient.getToken(username, password, url);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @return pilotInd, true - prepaid, false - postpaid
     * @throws ServiceException - bad request or glassfish failed
     */
    public Boolean getTypeService(String ctn, String username, String password, String url) throws ServiceException {
        GlassfishSisSoapClient glassfishSisSoapClient = new GlassfishSisSoapClient();
        return glassfishSisSoapClient.getTypeService(ctn, username, password, url);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @return type, state, SOCs\SOC - in object
     * @throws ServiceException - bad request or glassfish failed
     */
    public TypeStateSocs getTypeStateSocsService(String ctn, String username, String password, String url) throws ServiceException {
        GlassfishSisSoapClient glassfishSisSoapClient = new GlassfishSisSoapClient();
        return glassfishSisSoapClient.getTypeStateSocsService(ctn, username, password, url);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @param period - count of days. If this parameter is null than, it will use default value (14)
     * @param reasonList - Reason object list - from file
     * @return caseInd (None or Closed or ClosedInPeriod or Open)
     * @throws DataNotFoundException_Exception - glassfish cant find information with this ctn
     * @throws IllegalUsageException_Exception - request to glassfish is wrong
     * @throws InternalSystemErrorException_Exception - request is good, but glassfish failed with own exception
     */
    public String getCaseListResponseService(String ctn, String username,
                                              String password, String url, Integer period, List<Reason> reasonList) throws DataNotFoundException_Exception, IllegalUsageException_Exception, InternalSystemErrorException_Exception {
        GlassfishCrmSoapClient glassfishCrmSoapClient = new GlassfishCrmSoapClient();
        return glassfishCrmSoapClient.getCaseListResponseService(ctn, username, password, url, period, reasonList);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @param period - count of days.
     * @return intrxnInd (false - there is 0 appeals)
     * @throws IllegalUsageException_Exception - request to glassfish is wrong
     * @throws DatatypeConfigurationException
     * @throws InternalSystemErrorException_Exception - request is good, but glassfish failed with own exception
     */
    public Boolean getLastInteractionsService(String ctn, String username,
                                              String password, String url, Integer period) throws IllegalUsageException_Exception, DatatypeConfigurationException, InternalSystemErrorException_Exception {
        GlassfishCrmSoapClient glassfishCrmSoapClient = new GlassfishCrmSoapClient();
        return glassfishCrmSoapClient.getLastInteractionsService(ctn, username, password, url, period);
    }

    /**
     *
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @param latitude - latitude
     * @param longitude - longitude
     * @return TTInd (false - doesnt find incidents)
     * @throws DatatypeConfigurationException
     * @throws GetTTInfoByCoordinateFault_Exception
     */
    public Boolean getTroubleIndService(String username, String password, String url,
                                        String latitude, String longitude) throws DatatypeConfigurationException, GetTTInfoByCoordinateFault_Exception {
        GlassfishTroubleSoapClient glassfishTroubleSoapClient = new GlassfishTroubleSoapClient();
        return glassfishTroubleSoapClient.getTroubleIndService(username, password, url, latitude, longitude);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @param note - param for request
     * @param reasonCode1 - param for request
     * @param reasonCode2 - param for request
     * @param result  - param for request
     * @return interactionId
     * @throws ServiceException
     * @throws DatatypeConfigurationException
     * @throws InternalSystemErrorException_Exception
     * @throws IllegalUsageException_Exception
     */
    public String createInteractionResponseService(String ctn, String username,
                    String password, String url,
                    String note, String reasonCode1,
                    String reasonCode2, String result) throws ServiceException, DatatypeConfigurationException, InternalSystemErrorException_Exception, IllegalUsageException_Exception {
        GlassfishCrmSoapClient glassfishCrmSoapClient = new GlassfishCrmSoapClient();
        return glassfishCrmSoapClient.createInteractionResponseService(ctn, username, password, url, note, reasonCode1, reasonCode2, result);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @param requiredInfoList - which fields will be in response (for example: corebalance, type, state)
     * @return Response object
     * @throws ServiceException
     */
    public Response getSubscriberInfoResponse(String ctn, String username,
                                              String password, String url, List<String> requiredInfoList) throws ServiceException {
        GlassfishSisSoapClient glassfishSisSoapClient = new GlassfishSisSoapClient();
        return glassfishSisSoapClient.getSubscriberInfoResponse(username, password, url, ctn, requiredInfoList);
    }

    /**
     *
     * @param ctn - subscriberNo 930..
     * @param username - glassfish username
     * @param password - glassfish password
     * @param url - service url
     * @return Corebalance object
     */
    public Corebalance getCoreBalance(String ctn, String username,
                                      String password, String url) throws ServiceException {
        GlassfishSisSoapClient glassfishSisSoapClient = new GlassfishSisSoapClient();
        return glassfishSisSoapClient.getCoreBalance(ctn, username, password, url);
    }

    public Object getServiceResult(ServicesNames service, ClientProperties properties) throws ServiceException, InternalSystemErrorException_Exception, DatatypeConfigurationException, IllegalUsageException_Exception, DataNotFoundException_Exception, GetTTInfoByCoordinateFault_Exception, JAXBException {
        ServicesNamesImpl servicesNamesImpl = ServicesNamesImpl.valueOf(service.getServiceName());
        Object result = null;

        String name = properties.getProperty(GlassfishParams.name.name());
        String password = properties.getProperty(GlassfishParams.password.name());
        String url = properties.getProperty(GlassfishParams.url.name());
        String ctn = properties.getProperty(GlassfishParams.ctn.name());
        Map<String, ?> paramsMap = properties.getAdditionalParams();


        switch (servicesNamesImpl) {
            case SubscribeInfoBindingPort:
                List<String> paramLists = (List<String>) paramsMap.get(GlassfishParams.list_params.name());
                result = getSubscriberInfoResponse(ctn, name, password, url, paramLists);
                break;
            case SubscriberCoreBalance:
                result = getCoreBalance(ctn, name, password, url);
                break;
            case SubscriberType:
                result = getTypeService(ctn, name, password, url);
                break;
            case SubscriberTypeStateSOCs:
                result = getTypeStateSocsService(ctn, name, password, url);
                break;
            case CreateInteraction:
                String reason1 = properties.getProperty(GlassfishParams.reason1.name());
                String reason2 = properties.getProperty(GlassfishParams.reason2.name());
                String note = properties.getProperty(GlassfishParams.note.name());
                String resultParam = properties.getProperty(GlassfishParams.result.name());
                result = createInteractionResponseService(ctn, name, password, url, note, reason1, reason2, resultParam);
                break;
            case CaseList:
                List<Reason> reasonsLists = (List<Reason>) paramsMap.get(GlassfishParams.list_reasons.name());
                String periodStr = properties.getProperty(GlassfishParams.period.name());
                Integer period = periodStr != null ? new Integer(periodStr): null;
                result = getCaseListResponseService(ctn, name, password, url, period, reasonsLists);
                break;
            case LastInteractions:
                String periodStrD = properties.getProperty(GlassfishParams.period.name());
                Integer periodD = periodStrD != null ? new Integer(periodStrD): null;
                result = getLastInteractionsService(ctn, name, password, url, periodD);
                break;
            case TroubleTicket:
                String lat = properties.getProperty(GlassfishParams.latitude.name());
                String lon = properties.getProperty(GlassfishParams.longitude.name());
                result = getTroubleIndService(name, password, url, lat, lon);
                break;
            case LocationService:
                String nameTsms = properties.getProperty(TsmsParams.username.name());
                result = getLocationService(ctn, nameTsms, password, url);
                break;
            case TokenService:
                result = getLocationToken(name, password, url);
                break;
        }
        return result;
    }

}
