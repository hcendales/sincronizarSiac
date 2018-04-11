
package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarPermisos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPermisos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/}oeConsultarPermisos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPermisos", propOrder = {
    "arg0"
})
public class ConsultarPermisos {

    protected OeConsultarPermisos arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link OeConsultarPermisos }
     *     
     */
    public OeConsultarPermisos getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeConsultarPermisos }
     *     
     */
    public void setArg0(OeConsultarPermisos value) {
        this.arg0 = value;
    }

}
