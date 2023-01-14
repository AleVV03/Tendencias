
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ecuacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ecuacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor_ec1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor_ec2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ecuacion", propOrder = {
    "valorEc1",
    "valorEc2"
})
public class Ecuacion {

    @XmlElement(name = "valor_ec1")
    protected int valorEc1;
    @XmlElement(name = "valor_ec2")
    protected int valorEc2;

    /**
     * Obtiene el valor de la propiedad valorEc1.
     * 
     */
    public int getValorEc1() {
        return valorEc1;
    }

    /**
     * Define el valor de la propiedad valorEc1.
     * 
     */
    public void setValorEc1(int value) {
        this.valorEc1 = value;
    }

    /**
     * Obtiene el valor de la propiedad valorEc2.
     * 
     */
    public int getValorEc2() {
        return valorEc2;
    }

    /**
     * Define el valor de la propiedad valorEc2.
     * 
     */
    public void setValorEc2(int value) {
        this.valorEc2 = value;
    }

}
