
package sw;

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
@WebService(name = "Service", targetNamespace = "http://sw/")
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
    @RequestWrapper(localName = "hello", targetNamespace = "http://sw/", className = "sw.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sw/", className = "sw.HelloResponse")
    @Action(input = "http://sw/Service/helloRequest", output = "http://sw/Service/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param password
     * @param usuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Iniciar_seccion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Iniciar_seccion", targetNamespace = "http://sw/", className = "sw.IniciarSeccion")
    @ResponseWrapper(localName = "Iniciar_seccionResponse", targetNamespace = "http://sw/", className = "sw.IniciarSeccionResponse")
    @Action(input = "http://sw/Service/Iniciar_seccionRequest", output = "http://sw/Service/Iniciar_seccionResponse")
    public String iniciarSeccion(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Password", targetNamespace = "")
        String password);

    /**
     * 
     * @param usuario
     * @param saldo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "UpdateSaldo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateSaldo", targetNamespace = "http://sw/", className = "sw.UpdateSaldo")
    @ResponseWrapper(localName = "UpdateSaldoResponse", targetNamespace = "http://sw/", className = "sw.UpdateSaldoResponse")
    @Action(input = "http://sw/Service/UpdateSaldoRequest", output = "http://sw/Service/UpdateSaldoResponse")
    public Integer updateSaldo(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "saldo", targetNamespace = "")
        int saldo);

    /**
     * 
     * @param password
     * @param repeat
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "RegitrarUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RegitrarUsuario", targetNamespace = "http://sw/", className = "sw.RegitrarUsuario")
    @ResponseWrapper(localName = "RegitrarUsuarioResponse", targetNamespace = "http://sw/", className = "sw.RegitrarUsuarioResponse")
    @Action(input = "http://sw/Service/RegitrarUsuarioRequest", output = "http://sw/Service/RegitrarUsuarioResponse")
    public Boolean regitrarUsuario(
        @WebParam(name = "Usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "Password", targetNamespace = "")
        String password,
        @WebParam(name = "repeat", targetNamespace = "")
        int repeat);

}