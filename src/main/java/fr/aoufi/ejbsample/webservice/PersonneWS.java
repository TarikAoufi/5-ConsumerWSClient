
package fr.aoufi.ejbsample.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonneWS", targetNamespace = "http://webservice.ejbsample.aoufi.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonneWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveFromWebservice", targetNamespace = "http://webservice.ejbsample.aoufi.fr/", className = "fr.aoufi.ejbsample.webservice.SaveFromWebservice")
    @ResponseWrapper(localName = "saveFromWebserviceResponse", targetNamespace = "http://webservice.ejbsample.aoufi.fr/", className = "fr.aoufi.ejbsample.webservice.SaveFromWebserviceResponse")
    public void saveFromWebservice(
        @WebParam(name = "arg0", targetNamespace = "")
        Personne arg0);

}
