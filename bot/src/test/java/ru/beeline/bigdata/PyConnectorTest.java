package ru.beeline.bigdata;

import org.junit.Test;
import ru.beeline.bigdata.bot.utils.PyConnector;

import static org.junit.Assert.*;

/**
 * Testing connection with model
 *
 * Created by aleksandrlazarenko on 16.07.16.
 */
public class PyConnectorTest {
    @Test
    public void testMobInternetFlow() throws Exception {
        String flow = PyConnector.getInstance().getWorkflow("У меня не работает мобильный интернет");
        assertEquals(flow, "Проблемы с мобильным интернетом");
    }

    @Test
    public void testMVPFlow() throws Exception {
        String flow = PyConnector.getInstance().getWorkflow("Как мне перейти от вас в мегафон");
        assertEquals(flow, "Проблемы с переходом к другому оператору");
    }

    @Test
    public void testChangePlanFlow() throws Exception {
        String flow = PyConnector.getInstance().getWorkflow("Как мне сменить тариф");
        assertEquals(flow, "Проблемы со сменой тарифа");
    }

    @Test
    public void testMoneyFlow() throws Exception {
        String flow = PyConnector.getInstance().getWorkflow("За что списали деньги");
        assertEquals(flow, "Проблема со списанием средств");
    }
}