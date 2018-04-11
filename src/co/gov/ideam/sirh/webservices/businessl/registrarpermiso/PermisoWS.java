
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permisoWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permisoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadRecursoOtorgado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permisoWS", propOrder = {
    "cantidadRecursoOtorgado",
    "fechaExpedicion",
    "fechaVencimiento",
    "numExpediente",
    "numResolucion",
    "tipoPermiso"
})
public class PermisoWS {

    protected Double cantidadRecursoOtorgado;
    protected String fechaExpedicion;
    protected String fechaVencimiento;
    protected String numExpediente;
    protected String numResolucion;
    protected String tipoPermiso;

    /**
     * Gets the value of the cantidadRecursoOtorgado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidadRecursoOtorgado() {
        return cantidadRecursoOtorgado;
    }

    /**
     * Sets the value of the cantidadRecursoOtorgado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidadRecursoOtorgado(Double value) {
        this.cantidadRecursoOtorgado = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the numExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumExpediente() {
        return numExpediente;
    }

    /**
     * Sets the value of the numExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumExpediente(String value) {
        this.numExpediente = value;
    }

    /**
     * Gets the value of the numResolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumResolucion() {
        return numResolucion;
    }

    /**
     * Sets the value of the numResolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumResolucion(String value) {
        this.numResolucion = value;
    }

    /**
     * Gets the value of the tipoPermiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPermiso() {
        return tipoPermiso;
    }

    /**
     * Sets the value of the tipoPermiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPermiso(String value) {
        this.tipoPermiso = value;
    }

}
