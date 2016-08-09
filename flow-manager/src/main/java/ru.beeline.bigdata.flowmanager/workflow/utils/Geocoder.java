package ru.beeline.bigdata.flowmanager.workflow.utils;

import com.sun.tools.javac.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Main class which is used for handling geocoding tasks.
 * Performs all needed steps to get final address for usage
 * in Flow-manager
 * <p>
 * Created by aleksandrlazarenko on 12.07.16.
 * lazarenko.ale@gmail.com
 * telegram: @alexlazarenko
 */
public class Geocoder {

    // TODO: return phrase with coordinates in tuple

    private static final String API_URL = "https://geocode-maps.yandex.ru/1.x/?format=json&geocode=";
    private static Geocoder instance;

    private Geocoder() {
    }

    /**
     * Singleton accessor
     *
     * @return instance of the class
     */
    public static Geocoder getInstance() {
        if (instance == null)
            instance = new Geocoder();
        return instance;
    }

    public static void main(String... str) throws Exception {
        Geocoder coder = Geocoder.getInstance();
        coder.findAddress("Одинцово, Маковского 2");
    }

    /**
     * Receive address from the given response string
     *
     * @param urlResponse - string with url response
     * @return pair with precise address and coords or null, if there is no such address and coordinates
     */
    private Pair<String, Pair<Double, Double>> receiveAddress(String urlResponse) {

        // Parsing json
        JSONObject geoObject = new JSONObject(urlResponse);

        // Getting response
        JSONObject responseJson = (JSONObject) geoObject.get("response");

        // Getting objects
        JSONObject geoObjCollection = (JSONObject) responseJson.get("GeoObjectCollection");

        // Getting collection of objects
        JSONArray featureMember = (JSONArray) geoObjCollection.get("featureMember");

        // Checking if we have any results
        if (featureMember.length() == 0)
            return null;

        // Getting first object
        JSONObject firstObject = (JSONObject) featureMember.get(0);

        // Parsing first
        geoObject = (JSONObject) firstObject.get("GeoObject");

        // Getting out country and city
        String description = geoObject.getString("description");

        // Getting out coordinates
        JSONObject point = (JSONObject) geoObject.get("Point");
        String coords = point.getString("pos");

        // Parsing them
        String[] longlat = coords.split(" ");
        Double longitude = Double.parseDouble(longlat[0]);
        Double latitude = Double.parseDouble(longlat[1]);

        // Getting out info about street
        String name = geoObject.getString("name");

        return new Pair<>(name + ", " + description, new Pair<>(longitude, latitude));
    }

    /**
     * Finds the address using users input longitude and latitude
     *
     * @param longitude - longitude coordinate
     * @param latitude  - latitude coordinate
     * @return precise address or null if nothing has been found
     * @throws Exception
     */
    public Pair<String, Pair<Double, Double>> findAddress(Double longitude, Double latitude) throws Exception {

        // Making url
        String url = API_URL + longitude + ',' + latitude;

        // Getting response
        String response = sendGet(url);

        return receiveAddress(response);
    }

    /**
     * Finds the address using users input string
     *
     * @param str - string with address, received from user
     * @return precise address or null if nothing has been found
     * @throws Exception
     */
    public Pair<String, Pair<Double, Double>> findAddress(String str) throws Exception {

        // Making url
        String url = API_URL + str;

        // Getting response
        String response = sendGet(url);

        return receiveAddress(response);
    }

    /**
     * Sends http get request
     *
     * @param url - target url
     * @return string with response
     * @throws Exception
     */
    private String sendGet(String url) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        int responseCode = con.getResponseCode();

        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();

    }
}
