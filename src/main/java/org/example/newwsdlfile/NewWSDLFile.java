package org.example.newwsdlfile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-14T15:25:54.392+03:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.example.org/NewWSDLFile/", name = "NewWSDLFile")
@XmlSeeAlso({ObjectFactory.class})
public interface NewWSDLFile {

    @WebMethod(operationName = "NewOperation", action = "http://www.example.org/NewWSDLFile/NewOperation")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://www.example.org/NewWSDLFile/", className = "org.example.newwsdlfile.NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://www.example.org/NewWSDLFile/", className = "org.example.newwsdlfile.NewOperationResponse")
    @WebResult(name = "out", targetNamespace = "")
    public java.lang.String newOperation(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String in
    );
}
