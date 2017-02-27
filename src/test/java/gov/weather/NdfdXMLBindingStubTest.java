package gov.weather;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringReader;

import static org.junit.Assert.*;

/**
 * Created by student on 2/27/17.
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCodeTest() throws Exception {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            NdfdXMLBindingStub binding = (NdfdXMLBindingStub)
                    new NdfdXMLLocator().getndfdXMLPort();

            String result = binding.latLonListZipCode("53711");
            DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(result));

            assertEquals("Result did not match expected value", "???", dwml.getLatLonList());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}