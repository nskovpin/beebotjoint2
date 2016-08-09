
package ru.atconsulting.bigdata.services.glassfish.trouble;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.atconsulting.bigdata.client.glassfish.trouble package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.atconsulting.bigdata.client.glassfish.trouble
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TTInfo }
     * 
     */
    public TTInfo createTTInfo() {
        return new TTInfo();
    }

    /**
     * Create an instance of {@link TechnologyInfo }
     * 
     */
    public TechnologyInfo createTechnologyInfo() {
        return new TechnologyInfo();
    }

    /**
     * Create an instance of {@link GetTTInfoByCoordinateResponse }
     * 
     */
    public GetTTInfoByCoordinateResponse createGetTTInfoByCoordinateResponse() {
        return new GetTTInfoByCoordinateResponse();
    }

    /**
     * Create an instance of {@link GetTTInfoByCoordinateRequest }
     * 
     */
    public GetTTInfoByCoordinateRequest createGetTTInfoByCoordinateRequest() {
        return new GetTTInfoByCoordinateRequest();
    }

    /**
     * Create an instance of {@link Technologies }
     * 
     */
    public Technologies createTechnologies() {
        return new Technologies();
    }

    /**
     * Create an instance of {@link GetTTInfoByCoordinateFault }
     * 
     */
    public GetTTInfoByCoordinateFault createGetTTInfoByCoordinateFault() {
        return new GetTTInfoByCoordinateFault();
    }

    /**
     * Create an instance of {@link TTInfo.TT }
     * 
     */
    public TTInfo.TT createTTInfoTT() {
        return new TTInfo.TT();
    }

    /**
     * Create an instance of {@link TechnologyInfo.Technology }
     * 
     */
    public TechnologyInfo.Technology createTechnologyInfoTechnology() {
        return new TechnologyInfo.Technology();
    }

}
