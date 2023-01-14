
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FormulaSuma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FormulaSuma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro_S" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormulaSuma", propOrder = {
    "parametroS"
})
public class FormulaSuma {

    @XmlElement(name = "parametro_S")
    protected int parametroS;

    /**
     * Obtiene el valor de la propiedad parametroS.
     * 
     */
    public int getParametroS() {
        return parametroS;
    }

    /**
     * Define el valor de la propiedad parametroS.
     * 
     */
    public void setParametroS(int value) {
        this.parametroS = value;
    }

}
