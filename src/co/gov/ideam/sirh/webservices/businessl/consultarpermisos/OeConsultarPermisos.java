
package co.gov.ideam.sirh.webservices.businessl.consultarpermisos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oeConsultarPermisos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oeConsultarPermisos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAutoridadAmbiental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtroConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oeConsultarPermisos", propOrder = {
    "codAutoridadAmbiental",
    "fechaFin",
    "fechaInicio",
    "filtroConsulta"
})
public class OeConsultarPermisos {

    protected String codAutoridadAmbiental;
    protected String fechaFin;
    protected String fechaInicio;
    protected String filtroConsulta;

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
     * Gets the value of the fechaFin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets the value of the fechaFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Gets the value of the fechaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets the value of the fechaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Gets the value of the filtroConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroConsulta() {
        return filtroConsulta;
    }

    /**
     * Sets the value of the filtroConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroConsulta(String value) {
        this.filtroConsulta = value;
    }

}
