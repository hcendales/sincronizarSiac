
package co.gov.ideam.rua.electrico.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oeFuncionarios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oeFuncionarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAutoridadAmbiental" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oeFuncionarios", propOrder = {
    "codAutoridadAmbiental"
})
public class OeFuncionarios {

    protected String codAutoridadAmbiental;

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

}
