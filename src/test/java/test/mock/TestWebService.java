package test.mock;

import javax.jws.WebService;

import org.example.newwsdlfile.NewWSDLFile;

@WebService(endpointInterface = "org.example.newwsdlfile.NewWSDLFile", 
targetNamespace = "http://www.example.org/NewWSDLFile/", 
serviceName = "NewWSDLFile")
public class TestWebService implements NewWSDLFile {

	public String newOperation(String in) {
		// TODO Auto-generated method stub
		String result;
		switch (in) {
		case "1":
			result = "2";
			break;
		default:
			result = "4";
			break;
		}
		return result;
	}
}
