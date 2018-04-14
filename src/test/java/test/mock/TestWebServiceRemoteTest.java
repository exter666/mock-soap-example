package test.mock;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.xml.ws.Endpoint;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWebServiceRemoteTest {

    private static Endpoint endpoint;
    private static String url;

    @BeforeClass
    public static void beforeClass() throws Exception {
    	
		Properties property = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("application-test.properties").toURI());
		property.load(new FileInputStream(file));

		url = property.getProperty("url");
		
        endpoint = Endpoint.publish(url, new TestWebService());
    }

    @AfterClass
    public static void afterClass() throws Exception {
        endpoint.stop();
    }

    @Test
    public void testAddNoMockSetup() throws Exception {
    	
    	App.url = url;
        App.sendAll();
    }
}
