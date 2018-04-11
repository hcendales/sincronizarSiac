
package co.gov.ideam.rua.electrico.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vwRuaFuncionarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vwRuaFuncionarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliasusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigotipoidentificacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="direccioncorreoelectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionpersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrefuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vwRuaFuncionarios", propOrder = {
    "aliasusuario",
    "codigotipoidentificacion",
    "direccioncorreoelectronico",
    "identificacionpersona",
    "nombrefuncionario"
})
public class VwRuaFuncionarios {

    protected String aliasusuario;
    protected long codigotipoidentificacion;
    protected String direccioncorreoelectronico;
    protected String identificacionpersona;
    protected String nombrefuncionario;

    /**
     * Gets the value of the aliasusuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasusuario() {
        return aliasusuario;
    }

    /**
     * Sets the value of the aliasusuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasusuario(String value) {
        this.aliasusuario = value;
    }

    /**
     * Gets the value of the codigotipoidentificacion property.
     * 
     */
    public long getCodigotipoidentificacion() {
        return codigotipoidentificacion;
    }

    /**
     * Sets the value of the codigotipoidentificacion property.
     * 
     */
    public void setCodigotipoidentificacion(long value) {
        this.codigotipoidentificacion = value;
    }

    /**
     * Gets the value of the direccioncorreoelectronico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccioncorreoelectronico() {
        return direccioncorreoelectronico;
    }

    /**
     * Sets the value of the direccioncorreoelectronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccioncorreoelectronico(String value) {
        this.direccioncorreoelectronico = value;
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
     * Gets the value of the nombrefuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrefuncionario() {
        return nombrefuncionario;
    }

    /**
     * Sets the value of the nombrefuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrefuncionario(String value) {
        this.nombrefuncionario = value;
    }

}
