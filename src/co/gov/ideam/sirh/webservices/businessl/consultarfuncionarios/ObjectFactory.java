
package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios package. 
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

    private final static QName _ConsultarFuncionarios_QNAME = new QName("http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/", "consultarFuncionarios");
    private final static QName _ConsultarFuncionariosResponse_QNAME = new QName("http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/", "consultarFuncionariosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarFuncionariosResponse }
     * 
     */
    public ConsultarFuncionariosResponse createConsultarFuncionariosResponse() {
        return new ConsultarFuncionariosResponse();
    }

    /**
     * Create an instance of {@link ConsultarFuncionarios }
     * 
     */
    public ConsultarFuncionarios createConsultarFuncionarios() {
        return new ConsultarFuncionarios();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/", name = "consultarFuncionarios")
    public JAXBElement<ConsultarFuncionarios> createConsultarFuncionarios(ConsultarFuncionarios value) {
        return new JAXBElement<ConsultarFuncionarios>(_ConsultarFuncionarios_QNAME, ConsultarFuncionarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/", name = "consultarFuncionariosResponse")
    public JAXBElement<ConsultarFuncionariosResponse> createConsultarFuncionariosResponse(ConsultarFuncionariosResponse value) {
        return new JAXBElement<ConsultarFuncionariosResponse>(_ConsultarFuncionariosResponse_QNAME, ConsultarFuncionariosResponse.class, null, value);
    }

}
