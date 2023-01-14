
package sv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "http://sv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sv/", className = "sv.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sv/", className = "sv.HelloResponse")
    @Action(input = "http://sv/Service/helloRequest", output = "http://sv/Service/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param valor
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Euro_Dollar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Euro_Dollar", targetNamespace = "http://sv/", className = "sv.EuroDollar")
    @ResponseWrapper(localName = "Euro_DollarResponse", targetNamespace = "http://sv/", className = "sv.EuroDollarResponse")
    @Action(input = "http://sv/Service/Euro_DollarRequest", output = "http://sv/Service/Euro_DollarResponse")
    public String euroDollar(
        @WebParam(name = "Valor", targetNamespace = "")
        Double valor);

    /**
     * 
     * @param password
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://sv/", className = "sv.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://sv/", className = "sv.LoginResponse")
    @Action(input = "http://sv/Service/LoginRequest", output = "http://sv/Service/LoginResponse")
    public Boolean login(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param numero1
     * @param numero2
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "OperacionMate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "OperacionMate", targetNamespace = "http://sv/", className = "sv.OperacionMate")
    @ResponseWrapper(localName = "OperacionMateResponse", targetNamespace = "http://sv/", className = "sv.OperacionMateResponse")
    @Action(input = "http://sv/Service/OperacionMateRequest", output = "http://sv/Service/OperacionMateResponse")
    public String operacionMate(
        @WebParam(name = "numero_1", targetNamespace = "")
        int numero1,
        @WebParam(name = "numero_2", targetNamespace = "")
        int numero2);

    /**
     * 
     * @param parameter
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Comparacion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Comparacion", targetNamespace = "http://sv/", className = "sv.Comparacion")
    @ResponseWrapper(localName = "ComparacionResponse", targetNamespace = "http://sv/", className = "sv.ComparacionResponse")
    @Action(input = "http://sv/Service/ComparacionRequest", output = "http://sv/Service/ComparacionResponse")
    public String comparacion(
        @WebParam(name = "parameter", targetNamespace = "")
        int parameter);

    /**
     * 
     * @param valorEc2
     * @param valorEc1
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Ecuacion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Ecuacion", targetNamespace = "http://sv/", className = "sv.Ecuacion")
    @ResponseWrapper(localName = "EcuacionResponse", targetNamespace = "http://sv/", className = "sv.EcuacionResponse")
    @Action(input = "http://sv/Service/EcuacionRequest", output = "http://sv/Service/EcuacionResponse")
    public String ecuacion(
        @WebParam(name = "valor_ec1", targetNamespace = "")
        int valorEc1,
        @WebParam(name = "valor_ec2", targetNamespace = "")
        int valorEc2);

    /**
     * 
     * @param parametroS
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FormulaSuma")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FormulaSuma", targetNamespace = "http://sv/", className = "sv.FormulaSuma")
    @ResponseWrapper(localName = "FormulaSumaResponse", targetNamespace = "http://sv/", className = "sv.FormulaSumaResponse")
    @Action(input = "http://sv/Service/FormulaSumaRequest", output = "http://sv/Service/FormulaSumaResponse")
    public String formulaSuma(
        @WebParam(name = "parametro_S", targetNamespace = "")
        int parametroS);

    /**
     * 
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Diccionario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Diccionario", targetNamespace = "http://sv/", className = "sv.Diccionario")
    @ResponseWrapper(localName = "DiccionarioResponse", targetNamespace = "http://sv/", className = "sv.DiccionarioResponse")
    @Action(input = "http://sv/Service/DiccionarioRequest", output = "http://sv/Service/DiccionarioResponse")
    public String diccionario(
        @WebParam(name = "key", targetNamespace = "")
        String key);

    /**
     * 
     * @param exponente
     * @param base
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Potencia")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Potencia", targetNamespace = "http://sv/", className = "sv.Potencia")
    @ResponseWrapper(localName = "PotenciaResponse", targetNamespace = "http://sv/", className = "sv.PotenciaResponse")
    @Action(input = "http://sv/Service/PotenciaRequest", output = "http://sv/Service/PotenciaResponse")
    public Double potencia(
        @WebParam(name = "base", targetNamespace = "")
        double base,
        @WebParam(name = "exponente", targetNamespace = "")
        double exponente);

    /**
     * 
     * @param opcion
     * @param num1
     * @param num2
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Operacione_Basicas")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Operacione_Basicas", targetNamespace = "http://sv/", className = "sv.OperacioneBasicas")
    @ResponseWrapper(localName = "Operacione_BasicasResponse", targetNamespace = "http://sv/", className = "sv.OperacioneBasicasResponse")
    @Action(input = "http://sv/Service/Operacione_BasicasRequest", output = "http://sv/Service/Operacione_BasicasResponse")
    public String operacioneBasicas(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2,
        @WebParam(name = "Opcion", targetNamespace = "")
        Integer opcion);

    /**
     * 
     * @param t
     * @param v
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Movimiento_Uniforme")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Movimiento_Uniforme", targetNamespace = "http://sv/", className = "sv.MovimientoUniforme")
    @ResponseWrapper(localName = "Movimiento_UniformeResponse", targetNamespace = "http://sv/", className = "sv.MovimientoUniformeResponse")
    @Action(input = "http://sv/Service/Movimiento_UniformeRequest", output = "http://sv/Service/Movimiento_UniformeResponse")
    public String movimientoUniforme(
        @WebParam(name = "v", targetNamespace = "")
        int v,
        @WebParam(name = "t", targetNamespace = "")
        int t);

}
