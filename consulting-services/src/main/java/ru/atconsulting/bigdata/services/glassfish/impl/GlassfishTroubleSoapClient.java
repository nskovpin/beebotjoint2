package ru.atconsulting.bigdata.services.glassfish.impl;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.services.glassfish.trouble.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by NSkovpin on 11.07.2016.
 */
public class GlassfishTroubleSoapClient {

    public static final String STATUS = "TDONE";
    public static final String PRIORITY = "1";
    public static final String DEFAULT_LAT_LON = "0";

    private GetTTInfoByCoordinateResponse getTroubleTicketByCoordinate(String name, String password, String url,
                                                                       String lon, String lat) throws DatatypeConfigurationException, GetTTInfoByCoordinateFault_Exception {

        long milliSeconds = System.currentTimeMillis();
        DateTime currentTime = new DateTime(milliSeconds);
        DateTime startTime = currentTime.minusDays(3);

        XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(startTime.toGregorianCalendar());
        XMLGregorianCalendar endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(currentTime.toGregorianCalendar());


        CaseToTroubleTicketService caseToTroubleTicketService = new CaseToTroubleTicketService();
        CaseToTroubleTicketInterface caseToTroubleTicketInterface = caseToTroubleTicketService.getCaseToTroubleTicketPort();

        GetTTInfoByCoordinateRequest ttInfoByCoordinateRequest = new GetTTInfoByCoordinateRequest();
        ttInfoByCoordinateRequest.setLongitude((lon == null) ? new BigDecimal(DEFAULT_LAT_LON) : new BigDecimal(lon));
        ttInfoByCoordinateRequest.setLatitude((lon == null) ? new BigDecimal(DEFAULT_LAT_LON) : new BigDecimal(lat));
        ttInfoByCoordinateRequest.setDateStart(startDate);
        ttInfoByCoordinateRequest.setDateEnd(endDate);

        Helper.setProperCredentialsAndUrl((BindingProvider) caseToTroubleTicketInterface, name, password, url);

        return caseToTroubleTicketInterface.getTTInfoByCoordinate(ttInfoByCoordinateRequest);
    }

    public Boolean getTroubleIndService(String name, String password, String url,
                                        String lon, String lat) throws DatatypeConfigurationException, GetTTInfoByCoordinateFault_Exception {
        GetTTInfoByCoordinateResponse responseTrouble = getTroubleTicketByCoordinate(name, password, url, lat, lon);

        List<TTInfo> t = responseTrouble.getTTInfo();

        if (responseTrouble != null && responseTrouble.getTTInfo() != null) {
            for (TTInfo ttInfo : responseTrouble.getTTInfo()) {

                if (ttInfo.getTT() != null) {
                    for (TTInfo.TT tt : ttInfo.getTT()) {
                        if (tt.getPriority().equals(PRIORITY) && tt.getStatus().equals(STATUS)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
