
package co.gov.ideam.integracion.snif.webservices.funcionarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarFuncionariosAutoridad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarFuncionariosAutoridad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objetoEntrada" type="{http://funcionarios.webservices.snif.integracion.ideam.gov.co/}oeConsultarFuncionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarFuncionariosAutoridad", propOrder = {
    "objetoEntrada"
})
public class ConsultarFuncionariosAutoridad {

    protected OeConsultarFuncionarios objetoEntrada;

    /**
     * Gets the value of the objetoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link OeConsultarFuncionarios }
     *     
     */
    public OeConsultarFuncionarios getObjetoEntrada() {
        return objetoEntrada;
    }

    /**
     * Sets the value of the objetoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeConsultarFuncionarios }
     *     
     */
    public void setObjetoEntrada(OeConsultarFuncionarios value) {
        this.objetoEntrada = value;
    }

}
