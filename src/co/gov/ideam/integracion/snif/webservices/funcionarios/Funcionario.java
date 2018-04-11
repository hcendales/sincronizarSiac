
package co.gov.ideam.integracion.snif.webservices.funcionarios;

import java.math.BigInteger;
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
 *         &lt;element name="aliasUsuarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAutoridadAmbiental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dieccionCorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
    "aliasUsuarios",
    "clave",
    "codAutoridadAmbiental",
    "codigoTipoIdentificacion",
    "dieccionCorreoElectronico",
    "estado",
    "identificacionPersona",
    "nombreFuncionario"
})
public class Funcionario {

    protected String aliasUsuarios;
    protected String clave;
    protected String codAutoridadAmbiental;
    protected String codigoTipoIdentificacion;
    protected String dieccionCorreoElectronico;
    protected String estado;
    protected BigInteger identificacionPersona;
    protected String nombreFuncionario;

    /**
     * Gets the value of the aliasUsuarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasUsuarios() {
        return aliasUsuarios;
    }

    /**
     * Sets the value of the aliasUsuarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasUsuarios(String value) {
        this.aliasUsuarios = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
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
     * Gets the value of the dieccionCorreoElectronico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieccionCorreoElectronico() {
        return dieccionCorreoElectronico;
    }

    /**
     * Sets the value of the dieccionCorreoElectronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieccionCorreoElectronico(String value) {
        this.dieccionCorreoElectronico = value;
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
     * Gets the value of the identificacionPersona property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Sets the value of the identificacionPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificacionPersona(BigInteger value) {
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
