
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrarPermisoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrarPermisoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrarPermiso" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}osRegistrarPermiso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarPermisoResponse", propOrder = {
    "registrarPermiso"
})
public class RegistrarPermisoResponse {

    @XmlElement(name = "RegistrarPermiso")
    protected OsRegistrarPermiso registrarPermiso;

    /**
     * Gets the value of the registrarPermiso property.
     * 
     * @return
     *     possible object is
     *     {@link OsRegistrarPermiso }
     *     
     */
    public OsRegistrarPermiso getRegistrarPermiso() {
        return registrarPermiso;
    }

    /**
     * Sets the value of the registrarPermiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsRegistrarPermiso }
     *     
     */
    public void setRegistrarPermiso(OsRegistrarPermiso value) {
        this.registrarPermiso = value;
    }

}
