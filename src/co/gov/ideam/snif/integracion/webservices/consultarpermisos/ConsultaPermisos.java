
package co.gov.ideam.snif.integracion.webservices.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaPermisos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaPermisos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAutoridadAmbiental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDeptoPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipioPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPermisos", propOrder = {
    "apellidoUsuario",
    "cedulaCatastral",
    "codAutoridadAmbiental",
    "codDeptoPredio",
    "codMunicipioPredio",
    "codigo",
    "codigoTipoIdentificacion",
    "direccionPredio",
    "estado",
    "fechaExpedicion",
    "fechaVencimiento",
    "identificacionPersona",
    "infoTecnica",
    "matriculaInmobiliaria",
    "nombrePredio",
    "nombreUsuario",
    "numExpediente",
    "numResolucion",
    "tipoPermiso",
    "tipoPersona"
})
public class ConsultaPermisos {

    protected String apellidoUsuario;
    protected String cedulaCatastral;
    protected String codAutoridadAmbiental;
    protected String codDeptoPredio;
    protected String codMunicipioPredio;
    protected Long codigo;
    protected String codigoTipoIdentificacion;
    protected String direccionPredio;
    protected String estado;
    protected String fechaExpedicion;
    protected String fechaVencimiento;
    protected String identificacionPersona;
    protected String infoTecnica;
    protected String matriculaInmobiliaria;
    protected String nombrePredio;
    protected String nombreUsuario;
    protected String numExpediente;
    protected String numResolucion;
    protected String tipoPermiso;
    protected String tipoPersona;

    /**
     * Gets the value of the apellidoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * Sets the value of the apellidoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoUsuario(String value) {
        this.apellidoUsuario = value;
    }

    /**
     * Gets the value of the cedulaCatastral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    /**
     * Sets the value of the cedulaCatastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastral(String value) {
        this.cedulaCatastral = value;
    }

    /**
     * Gets the value of the codAutoridadAmbiental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAutoridadAmbiental() {
        return codAutoridadAmbiental;
    }

    /**
     * Sets the value of the codAutoridadAmbiental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAutoridadAmbiental(String value) {
        this.codAutoridadAmbiental = value;
    }

    /**
     * Gets the value of the codDeptoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDeptoPredio() {
        return codDeptoPredio;
    }

    /**
     * Sets the value of the codDeptoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDeptoPredio(String value) {
        this.codDeptoPredio = value;
    }

    /**
     * Gets the value of the codMunicipioPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMunicipioPredio() {
        return codMunicipioPredio;
    }

    /**
     * Sets the value of the codMunicipioPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMunicipioPredio(String value) {
        this.codMunicipioPredio = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigo(Long value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the codigoTipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    /**
     * Sets the value of the codigoTipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoIdentificacion(String value) {
        this.codigoTipoIdentificacion = value;
    }

    /**
     * Gets the value of the direccionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionPredio() {
        return direccionPredio;
    }

    /**
     * Sets the value of the direccionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionPredio(String value) {
        this.direccionPredio = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
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
     * Gets the value of the identificacionPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Sets the value of the identificacionPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionPersona(String value) {
        this.identificacionPersona = value;
    }

    /**
     * Gets the value of the infoTecnica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoTecnica() {
        return infoTecnica;
    }

    /**
     * Sets the value of the infoTecnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoTecnica(String value) {
        this.infoTecnica = value;
    }

    /**
     * Gets the value of the matriculaInmobiliaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaInmobiliaria() {
        return matriculaInmobiliaria;
    }

    /**
     * Sets the value of the matriculaInmobiliaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaInmobiliaria(String value) {
        this.matriculaInmobiliaria = value;
    }

    /**
     * Gets the value of the nombrePredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePredio() {
        return nombrePredio;
    }

    /**
     * Sets the value of the nombrePredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePredio(String value) {
        this.nombrePredio = value;
    }

    /**
     * Gets the value of the nombreUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Sets the value of the nombreUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
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

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

}
