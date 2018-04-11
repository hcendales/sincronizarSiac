
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrarPermiso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrarPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}oeRegistrarPermiso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarPermiso", propOrder = {
    "arg0"
})
public class RegistrarPermiso {

    protected OeRegistrarPermiso arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link OeRegistrarPermiso }
     *     
     */
    public OeRegistrarPermiso getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OeRegistrarPermiso }
     *     
     */
    public void setArg0(OeRegistrarPermiso value) {
        this.arg0 = value;
    }

}
