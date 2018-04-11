
package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarFuncionarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarFuncionarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/}oeConsultarFuncionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarFuncionarios", propOrder = {
    "arg0"
})
public class ConsultarFuncionarios {

    protected OeConsultarFuncionarios arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link OeConsultarFuncionarios }
     *     
     */
    public OeConsultarFuncionarios getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeConsultarFuncionarios }
     *     
     */
    public void setArg0(OeConsultarFuncionarios value) {
        this.arg0 = value;
    }

}
