
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IniciarSeccionResponse_QNAME = new QName("http://sw/", "Iniciar_seccionResponse");
    private final static QName _RegitrarUsuario_QNAME = new QName("http://sw/", "RegitrarUsuario");
    private final static QName _UpdateSaldo_QNAME = new QName("http://sw/", "UpdateSaldo");
    private final static QName _RegitrarUsuarioResponse_QNAME = new QName("http://sw/", "RegitrarUsuarioResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _IniciarSeccion_QNAME = new QName("http://sw/", "Iniciar_seccion");
    private final static QName _UpdateSaldoResponse_QNAME = new QName("http://sw/", "UpdateSaldoResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IniciarSeccion }
     * 
     */
    public IniciarSeccion createIniciarSeccion() {
        return new IniciarSeccion();
    }

    /**
     * Create an instance of {@link UpdateSaldoResponse }
     * 
     */
    public UpdateSaldoResponse createUpdateSaldoResponse() {
        return new UpdateSaldoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link IniciarSeccionResponse }
     * 
     */
    public IniciarSeccionResponse createIniciarSeccionResponse() {
        return new IniciarSeccionResponse();
    }

    /**
     * Create an instance of {@link RegitrarUsuario }
     * 
     */
    public RegitrarUsuario createRegitrarUsuario() {
        return new RegitrarUsuario();
    }

    /**
     * Create an instance of {@link UpdateSaldo }
     * 
     */
    public UpdateSaldo createUpdateSaldo() {
        return new UpdateSaldo();
    }

    /**
     * Create an instance of {@link RegitrarUsuarioResponse }
     * 
     */
    public RegitrarUsuarioResponse createRegitrarUsuarioResponse() {
        return new RegitrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSeccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Iniciar_seccionResponse")
    public JAXBElement<IniciarSeccionResponse> createIniciarSeccionResponse(IniciarSeccionResponse value) {
        return new JAXBElement<IniciarSeccionResponse>(_IniciarSeccionResponse_QNAME, IniciarSeccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegitrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "RegitrarUsuario")
    public JAXBElement<RegitrarUsuario> createRegitrarUsuario(RegitrarUsuario value) {
        return new JAXBElement<RegitrarUsuario>(_RegitrarUsuario_QNAME, RegitrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "UpdateSaldo")
    public JAXBElement<UpdateSaldo> createUpdateSaldo(UpdateSaldo value) {
        return new JAXBElement<UpdateSaldo>(_UpdateSaldo_QNAME, UpdateSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegitrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "RegitrarUsuarioResponse")
    public JAXBElement<RegitrarUsuarioResponse> createRegitrarUsuarioResponse(RegitrarUsuarioResponse value) {
        return new JAXBElement<RegitrarUsuarioResponse>(_RegitrarUsuarioResponse_QNAME, RegitrarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSeccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Iniciar_seccion")
    public JAXBElement<IniciarSeccion> createIniciarSeccion(IniciarSeccion value) {
        return new JAXBElement<IniciarSeccion>(_IniciarSeccion_QNAME, IniciarSeccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "UpdateSaldoResponse")
    public JAXBElement<UpdateSaldoResponse> createUpdateSaldoResponse(UpdateSaldoResponse value) {
        return new JAXBElement<UpdateSaldoResponse>(_UpdateSaldoResponse_QNAME, UpdateSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
