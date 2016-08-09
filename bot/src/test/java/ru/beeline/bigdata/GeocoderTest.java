package ru.beeline.bigdata;

import com.sun.tools.javac.util.Pair;
import ru.beeline.bigdata.bot.utils.Geocoder;

import static org.junit.Assert.*;

/**
 * Geocoder testing
 *
 * Created by aleksandrlazarenko on 15.07.16.
 */
public class GeocoderTest {



    @org.junit.Test
    public void findAddress() throws Exception {
        Pair<String, Pair<Double, Double>> address = Geocoder.getInstance().findAddress(37.611, 55.758);
        assertEquals("Тверская улица, 7, Москва, Россия", address.fst);
        assertEquals(37.611, address.snd.fst, 0.01);
        assertEquals(55.758, address.snd.snd, 0.01);
    }

    @org.junit.Test
    public void findAddress1() throws Exception {
        // Making url
        Geocoder geocoder = Geocoder.getInstance();

        // Getting response
        Pair<String, Pair<Double, Double>> address = geocoder.findAddress("Москва тверская 7");
        assertEquals("Тверская улица, 7, Москва, Россия", address.fst);
        assertEquals(37.611, address.snd.fst, 0.01);
        assertEquals(55.758, address.snd.snd, 0.01);
    }

    @org.junit.Test
    public void findAddress2() throws Exception {
        Geocoder geocoder = Geocoder.getInstance();

        // Сложно придумать нормальный адрес, которого нет
        Pair<String, Pair<Double, Double>> address = geocoder.findAddress("Хуйвинбинкс говноулица 777");
        assertEquals(address, null);
    }

}