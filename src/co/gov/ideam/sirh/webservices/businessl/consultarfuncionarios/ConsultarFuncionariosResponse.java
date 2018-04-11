
package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarFuncionariosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarFuncionariosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarios" type="{http://consultarFuncionarios.businessl.webservices.sirh.ideam.gov.co/}osConsultarFuncionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarFuncionariosResponse", propOrder = {
    "funcionarios"
})
public class ConsultarFuncionariosResponse {

    protected OsConsultarFuncionarios funcionarios;

    /**
     * Gets the value of the funcionarios property.
     * 
     * @return
     *     possible object is
     *     {@link OsConsultarFuncionarios }
     *     
     */
    public OsConsultarFuncionarios getFuncionarios() {
        return funcionarios;
    }

    /**
     * Sets the value of the funcionarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsConsultarFuncionarios }
     *     
     */
    public void setFuncionarios(OsConsultarFuncionarios value) {
        this.funcionarios = value;
    }

}
