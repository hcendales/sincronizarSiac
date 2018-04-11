
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for representanteWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="representanteWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoIdentificacionRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDeptoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMunicipioCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="identificacionRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellidoRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombreRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellidoRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombreRepLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "representanteWS", propOrder = {
    "codigoTipoIdentificacionRepLegal",
    "direccionCorrespondencia",
    "idDeptoCorrespondencia",
    "idMunicipioCorrespondencia",
    "identificacionRepLegal",
    "primerApellidoRepLegal",
    "primerNombreRepLegal",
    "segundoApellidoRepLegal",
    "segundoNombreRepLegal"
})
public class RepresentanteWS {

    protected String codigoTipoIdentificacionRepLegal;
    protected String direccionCorrespondencia;
    protected Integer idDeptoCorrespondencia;
    protected Integer idMunicipioCorrespondencia;
    protected String identificacionRepLegal;
    protected String primerApellidoRepLegal;
    protected String primerNombreRepLegal;
    protected String segundoApellidoRepLegal;
    protected String segundoNombreRepLegal;

    /**
     * Gets the value of the codigoTipoIdentificacionRepLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoIdentificacionRepLegal() {
        return codigoTipoIdentificacionRepLegal;
    }

    /**
     * Sets the value of the codigoTipoIdentificacionRepLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoIdentificacionRepLegal(String value) {
        this.codigoTipoIdentificacionRepLegal = value;
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
     * Gets the value of the idDeptoCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDeptoCorrespondencia() {
        return idDeptoCorrespondencia;
    }

    /**
     * Sets the value of the idDeptoCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDeptoCorrespondencia(Integer value) {
        this.idDeptoCorrespondencia = value;
    }

    /**
     * Gets the value of the idMunicipioCorrespondencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMunicipioCorrespondencia() {
        return idMunicipioCorrespondencia;
    }

    /**
     * Sets the value of the idMunicipioCorrespondencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMunicipioCorrespondencia(Integer value) {
        this.idMunicipioCorrespondencia = value;
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

}
