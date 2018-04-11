
package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.ideam.sirh.webservices.businessl.consultarpermisos package. 
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

    private final static QName _ConsultarPermisos_QNAME = new QName("http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/", "ConsultarPermisos");
    private final static QName _ConsultarPermisosResponse_QNAME = new QName("http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/", "ConsultarPermisosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.ideam.sirh.webservices.businessl.consultarpermisos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPermisosResponse }
     * 
     */
    public ConsultarPermisosResponse createConsultarPermisosResponse() {
        return new ConsultarPermisosResponse();
    }

    /**
     * Create an instance of {@link ConsultarPermisos }
     * 
     */
    public ConsultarPermisos createConsultarPermisos() {
        return new ConsultarPermisos();
    }

    /**
     * Create an instance of {@link OeConsultarPermisos }
     * 
     */
    public OeConsultarPermisos createOeConsultarPermisos() {
        return new OeConsultarPermisos();
    }

    /**
     * Create an instance of {@link ConsultarPermisosV }
     * 
     */
    public ConsultarPermisosV createConsultarPermisosV() {
        return new ConsultarPermisosV();
    }

    /**
     * Create an instance of {@link OsConsultarPermisos }
     * 
     */
    public OsConsultarPermisos createOsConsultarPermisos() {
        return new OsConsultarPermisos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPermisos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/", name = "ConsultarPermisos")
    public JAXBElement<ConsultarPermisos> createConsultarPermisos(ConsultarPermisos value) {
        return new JAXBElement<ConsultarPermisos>(_ConsultarPermisos_QNAME, ConsultarPermisos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPermisosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/", name = "ConsultarPermisosResponse")
    public JAXBElement<ConsultarPermisosResponse> createConsultarPermisosResponse(ConsultarPermisosResponse value) {
        return new JAXBElement<ConsultarPermisosResponse>(_ConsultarPermisosResponse_QNAME, ConsultarPermisosResponse.class, null, value);
    }

}
