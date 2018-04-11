
package co.gov.ideam.snif.integracion.webservices.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarPermisos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarPermisos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objetoEntrada" type="{http://consultarPermisos.webservices.integracion.snif.ideam.gov.co/}oeConsultarPermisos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPermisos", propOrder = {
    "objetoEntrada"
})
public class ConsultarPermisos {

    protected OeConsultarPermisos objetoEntrada;

    /**
     * Gets the value of the objetoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link OeConsultarPermisos }
     *     
     */
    public OeConsultarPermisos getObjetoEntrada() {
        return objetoEntrada;
    }

    /**
     * Sets the value of the objetoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeConsultarPermisos }
     *     
     */
    public void setObjetoEntrada(OeConsultarPermisos value) {
        this.objetoEntrada = value;
    }

}
