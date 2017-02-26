package gov.weather;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student on 2/26/17.
 */
public class WeatherParametersTypeTest {
    @Test
    public void isMaxt() throws Exception {
        WeatherParametersType test = new WeatherParametersType();
        test.setMaxt(true);
        assertEquals("isMaxt Test failed", true, test.isMaxt());
    }

    @Test
    public void setMaxt() throws Exception {

    }

}