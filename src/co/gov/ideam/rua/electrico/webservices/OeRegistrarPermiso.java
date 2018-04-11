
package co.gov.ideam.rua.electrico.webservices;

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
 *         &lt;element name="actividadCIIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAutoridadAmbiental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacionRepLegal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="direccionCorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDeptoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDeptoPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMunicipioCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMunicipioPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numExpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombreRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellidoRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombreRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoFijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPermiso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumenArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "actividadCIIU",
    "cedulaCatastral",
    "celular",
    "codAutoridadAmbiental",
    "codigoTipoIdentificacion",
    "codigoTipoIdentificacionRepLegal",
    "direccionCorreoElectronico",
    "direccionCorrespondencia",
    "direccionPredio",
    "fechaExpedicion",
    "fechaVencimiento",
    "idDeptoCorrespondencia",
    "idDeptoPredio",
    "idMunicipioCorrespondencia",
    "idMunicipioPredio",
    "identificacionPersona",
    "identificacionRepLegal",
    "matriculaInmobiliaria",
    "nombrePredio",
    "numExpediente",
    "numResolucion",
    "primerApellido",
    "primerApellidoRepLegal",
    "primerNombre",
    "primerNombreRepLegal",
    "razonSocial",
    "segundoApellido",
    "segundoApellidoRepLegal",
    "segundoNombre",
    "segundoNombreRepLegal",
    "telefonoFijo",
    "tipoPermiso",
    "tipoPersona",
    "unidad",
    "volumenArea"
})
public class OeRegistrarPermiso {

    protected String actividadCIIU;
    protected String cedulaCatastral;
    protected String celular;
    protected String codAutoridadAmbiental;
    protected Long codigoTipoIdentificacion;
    protected Long codigoTipoIdentificacionRepLegal;
    protected String direccionCorreoElectronico;
    protected String direccionCorrespondencia;
    protected String direccionPredio;
    protected String fechaExpedicion;
    protected String fechaVencimiento;
    protected String idDeptoCorrespondencia;
    protected String idDeptoPredio;
    protected String idMunicipioCorrespondencia;
    protected String idMunicipioPredio;
    protected String identificacionPersona;
    protected String identificacionRepLegal;
    protected String matriculaInmobiliaria;
    protected String nombrePredio;
    protected String numExpediente;
    protected String numResolucion;
    protected String primerApellido;
    protected String primerApellidoRepLegal;
    protected String primerNombre;
    protected String primerNombreRepLegal;
    protected String razonSocial;
    protected String segundoApellido;
    protected String segundoApellidoRepLegal;
    protected String segundoNombre;
    protected String segundoNombreRepLegal;
    protected String telefonoFijo;
    protected Long tipoPermiso;
    protected Long tipoPersona;
    protected String unidad;
    protected Integer volumenArea;

    /**
     * Gets the value of the actividadCIIU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadCIIU() {
        return actividadCIIU;
    }

    /**
     * Sets the value of the actividadCIIU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadCIIU(String value) {
        this.actividadCIIU = value;
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
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
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
     * Gets the value of the codigoTipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    /**
     * Sets the value of the codigoTipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTipoIdentificacion(Long value) {
        this.codigoTipoIdentificacion = value;
    }

    /**
     * Gets the value of the codigoTipoIdentificacionRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTipoIdentificacionRepLegal() {
        return codigoTipoIdentificacionRepLegal;
    }

    /**
     * Sets the value of the codigoTipoIdentificacionRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTipoIdentificacionRepLegal(Long value) {
        this.codigoTipoIdentificacionRepLegal = value;
    }

    /**
     * Gets the value of the direccionCorreoElectronico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCorreoElectronico() {
        return direccionCorreoElectronico;
    }

    /**
     * Sets the value of the direccionCorreoElectronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCorreoElectronico(String value) {
        this.direccionCorreoElectronico = value;
    }

    /**
     * Gets the value of the direccionCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCorrespondencia() {
        return direccionCorrespondencia;
    }

    /**
     * Sets the value of the direccionCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCorrespondencia(String value) {
        this.direccionCorrespondencia = value;
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
     * Gets the value of the idDeptoCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeptoCorrespondencia() {
        return idDeptoCorrespondencia;
    }

    /**
     * Sets the value of the idDeptoCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeptoCorrespondencia(String value) {
        this.idDeptoCorrespondencia = value;
    }

    /**
     * Gets the value of the idDeptoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDeptoPredio() {
        return idDeptoPredio;
    }

    /**
     * Sets the value of the idDeptoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDeptoPredio(String value) {
        this.idDeptoPredio = value;
    }

    /**
     * Gets the value of the idMunicipioCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMunicipioCorrespondencia() {
        return idMunicipioCorrespondencia;
    }

    /**
     * Sets the value of the idMunicipioCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMunicipioCorrespondencia(String value) {
        this.idMunicipioCorrespondencia = value;
    }

    /**
     * Gets the value of the idMunicipioPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMunicipioPredio() {
        return idMunicipioPredio;
    }

    /**
     * Sets the value of the idMunicipioPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMunicipioPredio(String value) {
        this.idMunicipioPredio = value;
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
     * Gets the value of the identificacionRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionRepLegal() {
        return identificacionRepLegal;
    }

    /**
     * Sets the value of the identificacionRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionRepLegal(String value) {
        this.identificacionRepLegal = value;
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
     * Gets the value of the primerApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Sets the value of the primerApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Gets the value of the primerApellidoRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellidoRepLegal() {
        return primerApellidoRepLegal;
    }

    /**
     * Sets the value of the primerApellidoRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellidoRepLegal(String value) {
        this.primerApellidoRepLegal = value;
    }

    /**
     * Gets the value of the primerNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Sets the value of the primerNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Gets the value of the primerNombreRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombreRepLegal() {
        return primerNombreRepLegal;
    }

    /**
     * Sets the value of the primerNombreRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombreRepLegal(String value) {
        this.primerNombreRepLegal = value;
    }

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the segundoApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Sets the value of the segundoApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Gets the value of the segundoApellidoRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellidoRepLegal() {
        return segundoApellidoRepLegal;
    }

    /**
     * Sets the value of the segundoApellidoRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellidoRepLegal(String value) {
        this.segundoApellidoRepLegal = value;
    }

    /**
     * Gets the value of the segundoNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Sets the value of the segundoNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Gets the value of the segundoNombreRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombreRepLegal() {
        return segundoNombreRepLegal;
    }

    /**
     * Sets the value of the segundoNombreRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombreRepLegal(String value) {
        this.segundoNombreRepLegal = value;
    }

    /**
     * Gets the value of the telefonoFijo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     * Sets the value of the telefonoFijo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoFijo(String value) {
        this.telefonoFijo = value;
    }

    /**
     * Gets the value of the tipoPermiso property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoPermiso() {
        return tipoPermiso;
    }

    /**
     * Sets the value of the tipoPermiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoPermiso(Long value) {
        this.tipoPermiso = value;
    }

    /**
     * Gets the value of the tipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Sets the value of the tipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoPersona(Long value) {
        this.tipoPersona = value;
    }

    /**
     * Gets the value of the unidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Sets the value of the unidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Gets the value of the volumenArea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolumenArea() {
        return volumenArea;
    }

    /**
     * Sets the value of the volumenArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolumenArea(Integer value) {
        this.volumenArea = value;
    }

}
