package test.mock;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.example.newwsdlfile.NewWSDLFile;

/**
 * Hello mock!
 *
 */
public class App {

	public static String url;

	public static void main(String[] args) throws Exception {

		init();
		
		sendAll();

	}
	
	public static void init() throws Exception {
		Properties property = new Properties();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		File file = new File(classLoader.getResource("application.properties").toURI());
		property.load(new FileInputStream(file));

		url = property.getProperty("url");
		
		System.out.println("url:" + url);
	}
	
	public static void sendAll() throws Exception {
		System.out.println("1:" + send("1"));
		System.out.println("2:" + send("2"));
		System.out.println("ttt:" + send("ttt"));
	}

	public static String send(String str) throws Exception {

		URL wsdlUrl = new URL(url + "?wsdl");
		QName serviceName = new QName("http://www.example.org/NewWSDLFile/", "NewWSDLFile");
		Service service = Service.create(wsdlUrl, serviceName);

		NewWSDLFile port = service.getPort(NewWSDLFile.class);

		return port.newOperation(str);

	}
}
