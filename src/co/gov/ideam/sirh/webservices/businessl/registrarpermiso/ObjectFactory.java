
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.ideam.sirh.webservices.businessl.registrarpermiso package. 
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

    private final static QName _RegistrarPermisoResponse_QNAME = new QName("http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/", "RegistrarPermisoResponse");
    private final static QName _RegistrarPermiso_QNAME = new QName("http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/", "RegistrarPermiso");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.ideam.sirh.webservices.businessl.registrarpermiso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarPermiso }
     * 
     */
    public RegistrarPermiso createRegistrarPermiso() {
        return new RegistrarPermiso();
    }

    /**
     * Create an instance of {@link RegistrarPermisoResponse }
     * 
     */
    public RegistrarPermisoResponse createRegistrarPermisoResponse() {
        return new RegistrarPermisoResponse();
    }

    /**
     * Create an instance of {@link PredioWS }
     * 
     */
    public PredioWS createPredioWS() {
        return new PredioWS();
    }

    /**
     * Create an instance of {@link OsRegistrarPermiso }
     * 
     */
    public OsRegistrarPermiso createOsRegistrarPermiso() {
        return new OsRegistrarPermiso();
    }

    /**
     * Create an instance of {@link OeRegistrarPermiso }
     * 
     */
    public OeRegistrarPermiso createOeRegistrarPermiso() {
        return new OeRegistrarPermiso();
    }

    /**
     * Create an instance of {@link UsuarioAguaWS }
     * 
     */
    public UsuarioAguaWS createUsuarioAguaWS() {
        return new UsuarioAguaWS();
    }

    /**
     * Create an instance of {@link PermisoWS }
     * 
     */
    public PermisoWS createPermisoWS() {
        return new PermisoWS();
    }

    /**
     * Create an instance of {@link RepresentanteWS }
     * 
     */
    public RepresentanteWS createRepresentanteWS() {
        return new RepresentanteWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPermisoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/", name = "RegistrarPermisoResponse")
    public JAXBElement<RegistrarPermisoResponse> createRegistrarPermisoResponse(RegistrarPermisoResponse value) {
        return new JAXBElement<RegistrarPermisoResponse>(_RegistrarPermisoResponse_QNAME, RegistrarPermisoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPermiso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/", name = "RegistrarPermiso")
    public JAXBElement<RegistrarPermiso> createRegistrarPermiso(RegistrarPermiso value) {
        return new JAXBElement<RegistrarPermiso>(_RegistrarPermiso_QNAME, RegistrarPermiso.class, null, value);
    }

}
