
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oeRegistrarPermiso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oeRegistrarPermiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permiso" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}permisoWS" minOccurs="0"/>
 *         &lt;element name="predio" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}predioWS" minOccurs="0"/>
 *         &lt;element name="representanteLegal" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}representanteWS" minOccurs="0"/>
 *         &lt;element name="usuarioAgua" type="{http://registrarPermiso.businessl.webservices.sirh.ideam.gov.co/}usuarioAguaWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oeRegistrarPermiso", propOrder = {
    "origen",
    "permiso",
    "predio",
    "representanteLegal",
    "usuarioAgua"
})
public class OeRegistrarPermiso {

    protected String origen;
    protected PermisoWS permiso;
    protected PredioWS predio;
    protected RepresentanteWS representanteLegal;
    protected UsuarioAguaWS usuarioAgua;

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the permiso property.
     * 
     * @return
     *     possible object is
     *     {@link PermisoWS }
     *     
     */
    public PermisoWS getPermiso() {
        return permiso;
    }

    /**
     * Sets the value of the permiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermisoWS }
     *     
     */
    public void setPermiso(PermisoWS value) {
        this.permiso = value;
    }

    /**
     * Gets the value of the predio property.
     * 
     * @return
     *     possible object is
     *     {@link PredioWS }
     *     
     */
    public PredioWS getPredio() {
        return predio;
    }

    /**
     * Sets the value of the predio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredioWS }
     *     
     */
    public void setPredio(PredioWS value) {
        this.predio = value;
    }

    /**
     * Gets the value of the representanteLegal property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentanteWS }
     *     
     */
    public RepresentanteWS getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * Sets the value of the representanteLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentanteWS }
     *     
     */
    public void setRepresentanteLegal(RepresentanteWS value) {
        this.representanteLegal = value;
    }

    /**
     * Gets the value of the usuarioAgua property.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioAguaWS }
     *     
     */
    public UsuarioAguaWS getUsuarioAgua() {
        return usuarioAgua;
    }

    /**
     * Sets the value of the usuarioAgua property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioAguaWS }
     *     
     */
    public void setUsuarioAgua(UsuarioAguaWS value) {
        this.usuarioAgua = value;
    }

}
