
package co.gov.ideam.integracion.snif.webservices.funcionarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarFuncionariosAutoridadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarFuncionariosAutoridadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://funcionarios.webservices.snif.integracion.ideam.gov.co/}osConsultarFuncionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarFuncionariosAutoridadResponse", propOrder = {
    "_return"
})
public class ConsultarFuncionariosAutoridadResponse {

    @XmlElement(name = "return")
    protected OsConsultarFuncionarios _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OsConsultarFuncionarios }
     *     
     */
    public OsConsultarFuncionarios getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsConsultarFuncionarios }
     *     
     */
    public void setReturn(OsConsultarFuncionarios value) {
        this._return = value;
    }

}
