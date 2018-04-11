
package co.gov.ideam.integracion.snif.webservices.funcionarios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.ideam.integracion.snif.webservices.funcionarios package. 
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

    private final static QName _ConsultarFuncionariosAutoridad_QNAME = new QName("http://funcionarios.webservices.snif.integracion.ideam.gov.co/", "consultarFuncionariosAutoridad");
    private final static QName _ConsultarFuncionariosAutoridadResponse_QNAME = new QName("http://funcionarios.webservices.snif.integracion.ideam.gov.co/", "consultarFuncionariosAutoridadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.ideam.integracion.snif.webservices.funcionarios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarFuncionariosAutoridad }
     * 
     */
    public ConsultarFuncionariosAutoridad createConsultarFuncionariosAutoridad() {
        return new ConsultarFuncionariosAutoridad();
    }

    /**
     * Create an instance of {@link ConsultarFuncionariosAutoridadResponse }
     * 
     */
    public ConsultarFuncionariosAutoridadResponse createConsultarFuncionariosAutoridadResponse() {
        return new ConsultarFuncionariosAutoridadResponse();
    }

    /**
     * Create an instance of {@link OsConsultarFuncionarios }
     * 
     */
    public OsConsultarFuncionarios createOsConsultarFuncionarios() {
        return new OsConsultarFuncionarios();
    }

    /**
     * Create an instance of {@link OeConsultarFuncionarios }
     * 
     */
    public OeConsultarFuncionarios createOeConsultarFuncionarios() {
        return new OeConsultarFuncionarios();
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionariosAutoridad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://funcionarios.webservices.snif.integracion.ideam.gov.co/", name = "consultarFuncionariosAutoridad")
    public JAXBElement<ConsultarFuncionariosAutoridad> createConsultarFuncionariosAutoridad(ConsultarFuncionariosAutoridad value) {
        return new JAXBElement<ConsultarFuncionariosAutoridad>(_ConsultarFuncionariosAutoridad_QNAME, ConsultarFuncionariosAutoridad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionariosAutoridadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://funcionarios.webservices.snif.integracion.ideam.gov.co/", name = "consultarFuncionariosAutoridadResponse")
    public JAXBElement<ConsultarFuncionariosAutoridadResponse> createConsultarFuncionariosAutoridadResponse(ConsultarFuncionariosAutoridadResponse value) {
        return new JAXBElement<ConsultarFuncionariosAutoridadResponse>(_ConsultarFuncionariosAutoridadResponse_QNAME, ConsultarFuncionariosAutoridadResponse.class, null, value);
    }

}
