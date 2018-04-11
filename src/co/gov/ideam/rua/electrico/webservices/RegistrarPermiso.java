
package co.gov.ideam.rua.electrico.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrarPermiso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrarPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objetoEntrada" type="{http://webservices.electrico.rua.ideam.gov.co/}oeRegistrarPermiso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarPermiso", propOrder = {
    "objetoEntrada"
})
public class RegistrarPermiso {

    protected OeRegistrarPermiso objetoEntrada;

    /**
     * Gets the value of the objetoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link OeRegistrarPermiso }
     *     
     */
    public OeRegistrarPermiso getObjetoEntrada() {
        return objetoEntrada;
    }

    /**
     * Sets the value of the objetoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeRegistrarPermiso }
     *     
     */
    public void setObjetoEntrada(OeRegistrarPermiso value) {
        this.objetoEntrada = value;
    }

}
