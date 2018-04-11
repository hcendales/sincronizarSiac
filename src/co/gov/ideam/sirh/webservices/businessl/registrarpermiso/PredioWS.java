
package co.gov.ideam.sirh.webservices.businessl.registrarpermiso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predioWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDeptoPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMunicipioPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="matriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predioWS", propOrder = {
    "cedulaCatastral",
    "direccionPredio",
    "idDeptoPredio",
    "idMunicipioPredio",
    "matriculaInmobiliaria",
    "nombrePredio"
})
public class PredioWS {

    protected String cedulaCatastral;
    protected String direccionPredio;
    protected Integer idDeptoPredio;
    protected Integer idMunicipioPredio;
    protected String matriculaInmobiliaria;
    protected String nombrePredio;

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
     * Gets the value of the idDeptoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDeptoPredio() {
        return idDeptoPredio;
    }

    /**
     * Sets the value of the idDeptoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDeptoPredio(Integer value) {
        this.idDeptoPredio = value;
    }

    /**
     * Gets the value of the idMunicipioPredio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMunicipioPredio() {
        return idMunicipioPredio;
    }

    /**
     * Sets the value of the idMunicipioPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMunicipioPredio(Integer value) {
        this.idMunicipioPredio = value;
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

}
