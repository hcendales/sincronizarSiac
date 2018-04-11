
package co.gov.ideam.sirh.webservices.businessl.consultarfuncionarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliasUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccionCorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionario", propOrder = {
    "aliasUsuario",
    "codigoTipoIdentificacion",
    "direccionCorreoElectronico",
    "identificacionPersona",
    "nombreFuncionario"
})
public class Funcionario {

    protected String aliasUsuario;
    protected int codigoTipoIdentificacion;
    protected String direccionCorreoElectronico;
    protected String identificacionPersona;
    protected String nombreFuncionario;

    /**
     * Gets the value of the aliasUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasUsuario() {
        return aliasUsuario;
    }

    /**
     * Sets the value of the aliasUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasUsuario(String value) {
        this.aliasUsuario = value;
    }

    /**
     * Gets the value of the codigoTipoIdentificacion property.
     * 
     */
    public int getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    /**
     * Sets the value of the codigoTipoIdentificacion property.
     * 
     */
    public void setCodigoTipoIdentificacion(int value) {
        this.codigoTipoIdentificacion = value;
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
     * Gets the value of the nombreFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    /**
     * Sets the value of the nombreFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFuncionario(String value) {
        this.nombreFuncionario = value;
    }

}
