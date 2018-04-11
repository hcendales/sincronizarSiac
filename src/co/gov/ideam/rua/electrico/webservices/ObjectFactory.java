
package co.gov.ideam.rua.electrico.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.ideam.rua.electrico.webservices package. 
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

    private final static QName _FuncionariosResponse_QNAME = new QName("http://webservices.electrico.rua.ideam.gov.co/", "funcionariosResponse");
    private final static QName _Funcionarios_QNAME = new QName("http://webservices.electrico.rua.ideam.gov.co/", "funcionarios");
    private final static QName _VwRuaFuncionarios_QNAME = new QName("http://webservices.electrico.rua.ideam.gov.co/", "vwRuaFuncionarios");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.ideam.rua.electrico.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FuncionariosResponse }
     * 
     */
    public FuncionariosResponse createFuncionariosResponse() {
        return new FuncionariosResponse();
    }

    /**
     * Create an instance of {@link Funcionarios }
     * 
     */
    public Funcionarios createFuncionarios() {
        return new Funcionarios();
    }

    /**
     * Create an instance of {@link VwRuaFuncionarios }
     * 
     */
    public VwRuaFuncionarios createVwRuaFuncionarios() {
        return new VwRuaFuncionarios();
    }

    /**
     * Create an instance of {@link OeFuncionarios }
     * 
     */
    public OeFuncionarios createOeFuncionarios() {
        return new OeFuncionarios();
    }

    /**
     * Create an instance of {@link OsFuncionarios }
     * 
     */
    public OsFuncionarios createOsFuncionarios() {
        return new OsFuncionarios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncionariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.electrico.rua.ideam.gov.co/", name = "funcionariosResponse")
    public JAXBElement<FuncionariosResponse> createFuncionariosResponse(FuncionariosResponse value) {
        return new JAXBElement<FuncionariosResponse>(_FuncionariosResponse_QNAME, FuncionariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.electrico.rua.ideam.gov.co/", name = "funcionarios")
    public JAXBElement<Funcionarios> createFuncionarios(Funcionarios value) {
        return new JAXBElement<Funcionarios>(_Funcionarios_QNAME, Funcionarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VwRuaFuncionarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.electrico.rua.ideam.gov.co/", name = "vwRuaFuncionarios")
    public JAXBElement<VwRuaFuncionarios> createVwRuaFuncionarios(VwRuaFuncionarios value) {
        return new JAXBElement<VwRuaFuncionarios>(_VwRuaFuncionarios_QNAME, VwRuaFuncionarios.class, null, value);
    }

}
