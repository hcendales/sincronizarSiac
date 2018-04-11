
package co.gov.ideam.rua.electrico.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objetoEntrada" type="{http://webservices.electrico.rua.ideam.gov.co/}oeFuncionarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarios", propOrder = {
    "objetoEntrada"
})
public class Funcionarios {

    protected OeFuncionarios objetoEntrada;

    /**
     * Gets the value of the objetoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link OeFuncionarios }
     *     
     */
    public OeFuncionarios getObjetoEntrada() {
        return objetoEntrada;
    }

    /**
     * Sets the value of the objetoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeFuncionarios }
     *     
     */
    public void setObjetoEntrada(OeFuncionarios value) {
        this.objetoEntrada = value;
    }

}
