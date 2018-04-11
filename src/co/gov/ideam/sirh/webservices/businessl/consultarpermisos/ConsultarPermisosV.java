
package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for consultarPermisosV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarPermisosV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadrecursootorgado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cedulacatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigotipoidentificacion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="direccionpredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoinfotecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaexpedicion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechavencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAutoridad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iddeptopredio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identificacionpersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idmunicipiopredio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="infotecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculainmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrepredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numexpediente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numresolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerapellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primernombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonsocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipopermiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipopersona" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPermisosV", propOrder = {
    "autoridad",
    "cantidadrecursootorgado",
    "cedulacatastral",
    "codigotipoidentificacion",
    "direccionpredio",
    "estadoinfotecnica",
    "fechaexpedicion",
    "fechavencimiento",
    "id",
    "idAutoridad",
    "iddeptopredio",
    "identificacionpersona",
    "idmunicipiopredio",
    "infotecnica",
    "matriculainmobiliaria",
    "nombrepredio",
    "numexpediente",
    "numresolucion",
    "primerapellido",
    "primernombre",
    "razonsocial",
    "tipopermiso",
    "tipopersona"
})
public class ConsultarPermisosV {

    protected String autoridad;
    protected Double cantidadrecursootorgado;
    protected String cedulacatastral;
    protected Long codigotipoidentificacion;
    protected String direccionpredio;
    protected String estadoinfotecnica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaexpedicion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechavencimiento;
    protected Long id;
    protected Long idAutoridad;
    protected Long iddeptopredio;
    protected String identificacionpersona;
    protected Long idmunicipiopredio;
    protected String infotecnica;
    protected String matriculainmobiliaria;
    protected String nombrepredio;
    protected String numexpediente;
    protected String numresolucion;
    protected String primerapellido;
    protected String primernombre;
    protected String razonsocial;
    protected String tipopermiso;
    protected Long tipopersona;

    /**
     * Gets the value of the autoridad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoridad() {
        return autoridad;
    }

    /**
     * Sets the value of the autoridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoridad(String value) {
        this.autoridad = value;
    }

    /**
     * Gets the value of the cantidadrecursootorgado property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidadrecursootorgado() {
        return cantidadrecursootorgado;
    }

    /**
     * Sets the value of the cantidadrecursootorgado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidadrecursootorgado(Double value) {
        this.cantidadrecursootorgado = value;
    }

    /**
     * Gets the value of the cedulacatastral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulacatastral() {
        return cedulacatastral;
    }

    /**
     * Sets the value of the cedulacatastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulacatastral(String value) {
        this.cedulacatastral = value;
    }

    /**
     * Gets the value of the codigotipoidentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigotipoidentificacion() {
        return codigotipoidentificacion;
    }

    /**
     * Sets the value of the codigotipoidentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigotipoidentificacion(Long value) {
        this.codigotipoidentificacion = value;
    }

    /**
     * Gets the value of the direccionpredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionpredio() {
        return direccionpredio;
    }

    /**
     * Sets the value of the direccionpredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionpredio(String value) {
        this.direccionpredio = value;
    }

    /**
     * Gets the value of the estadoinfotecnica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoinfotecnica() {
        return estadoinfotecnica;
    }

    /**
     * Sets the value of the estadoinfotecnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoinfotecnica(String value) {
        this.estadoinfotecnica = value;
    }

    /**
     * Gets the value of the fechaexpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaexpedicion() {
        return fechaexpedicion;
    }

    /**
     * Sets the value of the fechaexpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaexpedicion(XMLGregorianCalendar value) {
        this.fechaexpedicion = value;
    }

    /**
     * Gets the value of the fechavencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechavencimiento() {
        return fechavencimiento;
    }

    /**
     * Sets the value of the fechavencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechavencimiento(XMLGregorianCalendar value) {
        this.fechavencimiento = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idAutoridad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAutoridad() {
        return idAutoridad;
    }

    /**
     * Sets the value of the idAutoridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAutoridad(Long value) {
        this.idAutoridad = value;
    }

    /**
     * Gets the value of the iddeptopredio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddeptopredio() {
        return iddeptopredio;
    }

    /**
     * Sets the value of the iddeptopredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddeptopredio(Long value) {
        this.iddeptopredio = value;
    }

    /**
     * Gets the value of the identificacionpersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionpersona() {
        return identificacionpersona;
    }

    /**
     * Sets the value of the identificacionpersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionpersona(String value) {
        this.identificacionpersona = value;
    }

    /**
     * Gets the value of the idmunicipiopredio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdmunicipiopredio() {
        return idmunicipiopredio;
    }

    /**
     * Sets the value of the idmunicipiopredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdmunicipiopredio(Long value) {
        this.idmunicipiopredio = value;
    }

    /**
     * Gets the value of the infotecnica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfotecnica() {
        return infotecnica;
    }

    /**
     * Sets the value of the infotecnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfotecnica(String value) {
        this.infotecnica = value;
    }

    /**
     * Gets the value of the matriculainmobiliaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculainmobiliaria() {
        return matriculainmobiliaria;
    }

    /**
     * Sets the value of the matriculainmobiliaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculainmobiliaria(String value) {
        this.matriculainmobiliaria = value;
    }

    /**
     * Gets the value of the nombrepredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepredio() {
        return nombrepredio;
    }

    /**
     * Sets the value of the nombrepredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepredio(String value) {
        this.nombrepredio = value;
    }

    /**
     * Gets the value of the numexpediente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumexpediente() {
        return numexpediente;
    }

    /**
     * Sets the value of the numexpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumexpediente(String value) {
        this.numexpediente = value;
    }

    /**
     * Gets the value of the numresolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumresolucion() {
        return numresolucion;
    }

    /**
     * Sets the value of the numresolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumresolucion(String value) {
        this.numresolucion = value;
    }

    /**
     * Gets the value of the primerapellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerapellido() {
        return primerapellido;
    }

    /**
     * Sets the value of the primerapellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerapellido(String value) {
        this.primerapellido = value;
    }

    /**
     * Gets the value of the primernombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimernombre() {
        return primernombre;
    }

    /**
     * Sets the value of the primernombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimernombre(String value) {
        this.primernombre = value;
    }

    /**
     * Gets the value of the razonsocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocial() {
        return razonsocial;
    }

    /**
     * Sets the value of the razonsocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocial(String value) {
        this.razonsocial = value;
    }

    /**
     * Gets the value of the tipopermiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipopermiso() {
        return tipopermiso;
    }

    /**
     * Sets the value of the tipopermiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipopermiso(String value) {
        this.tipopermiso = value;
    }

    /**
     * Gets the value of the tipopersona property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipopersona() {
        return tipopersona;
    }

    /**
     * Sets the value of the tipopersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipopersona(Long value) {
        this.tipopersona = value;
    }

}
