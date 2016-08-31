
package fr.aoufi.ejbsample.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.aoufi.ejbsample.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveFromWebservice_QNAME = new QName("http://webservice.ejbsample.aoufi.fr/", "saveFromWebservice");
    private final static QName _SaveFromWebserviceResponse_QNAME = new QName("http://webservice.ejbsample.aoufi.fr/", "saveFromWebserviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.treeptik.ejbsample.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveFromWebserviceResponse }
     * 
     */
    public SaveFromWebserviceResponse createSaveFromWebserviceResponse() {
        return new SaveFromWebserviceResponse();
    }

    /**
     * Create an instance of {@link SaveFromWebservice }
     * 
     */
    public SaveFromWebservice createSaveFromWebservice() {
        return new SaveFromWebservice();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFromWebservice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ejbsample.aoufi.fr/", name = "saveFromWebservice")
    public JAXBElement<SaveFromWebservice> createSaveFromWebservice(SaveFromWebservice value) {
        return new JAXBElement<SaveFromWebservice>(_SaveFromWebservice_QNAME, SaveFromWebservice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFromWebserviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ejbsample.aoufi.fr/", name = "saveFromWebserviceResponse")
    public JAXBElement<SaveFromWebserviceResponse> createSaveFromWebserviceResponse(SaveFromWebserviceResponse value) {
        return new JAXBElement<SaveFromWebserviceResponse>(_SaveFromWebserviceResponse_QNAME, SaveFromWebserviceResponse.class, null, value);
    }

}
