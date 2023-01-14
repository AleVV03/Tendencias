
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Movimiento_Uniforme complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Movimiento_Uniforme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movimiento_Uniforme", propOrder = {
    "v",
    "t"
})
public class MovimientoUniforme {

    protected int v;
    protected int t;

    /**
     * Obtiene el valor de la propiedad v.
     * 
     */
    public int getV() {
        return v;
    }

    /**
     * Define el valor de la propiedad v.
     * 
     */
    public void setV(int value) {
        this.v = value;
    }

    /**
     * Obtiene el valor de la propiedad t.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Define el valor de la propiedad t.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

}
