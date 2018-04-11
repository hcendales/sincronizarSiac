
package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarPermisosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPermisosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarPermisos" type="{http://consultarPermisos.businessl.webservices.sirh.ideam.gov.co/}osConsultarPermisos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPermisosResponse", propOrder = {
    "consultarPermisos"
})
public class ConsultarPermisosResponse {

    @XmlElement(name = "ConsultarPermisos")
    protected OsConsultarPermisos consultarPermisos;

    /**
     * Gets the value of the consultarPermisos property.
     * 
     * @return
     *     possible object is
     *     {@link OsConsultarPermisos }
     *     
     */
    public OsConsultarPermisos getConsultarPermisos() {
        return consultarPermisos;
    }

    /**
     * Sets the value of the consultarPermisos property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsConsultarPermisos }
     *     
     */
    public void setConsultarPermisos(OsConsultarPermisos value) {
        this.consultarPermisos = value;
    }

}
