
package com.br.teste.ws.imc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.br.teste.ws.imc package. 
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

    private final static QName _GetImcResponse_QNAME = new QName("http://imc.ws.teste.br.com/", "getImcResponse");
    private final static QName _GetSexo_QNAME = new QName("http://imc.ws.teste.br.com/", "getSexo");
    private final static QName _GetSexoResponse_QNAME = new QName("http://imc.ws.teste.br.com/", "getSexoResponse");
    private final static QName _GetImc_QNAME = new QName("http://imc.ws.teste.br.com/", "getImc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.br.teste.ws.imc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImc }
     * 
     */
    public GetImc createGetImc() {
        return new GetImc();
    }

    /**
     * Create an instance of {@link GetSexoResponse }
     * 
     */
    public GetSexoResponse createGetSexoResponse() {
        return new GetSexoResponse();
    }

    /**
     * Create an instance of {@link GetSexo }
     * 
     */
    public GetSexo createGetSexo() {
        return new GetSexo();
    }

    /**
     * Create an instance of {@link GetImcResponse }
     * 
     */
    public GetImcResponse createGetImcResponse() {
        return new GetImcResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.ws.teste.br.com/", name = "getImcResponse")
    public JAXBElement<GetImcResponse> createGetImcResponse(GetImcResponse value) {
        return new JAXBElement<GetImcResponse>(_GetImcResponse_QNAME, GetImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSexo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.ws.teste.br.com/", name = "getSexo")
    public JAXBElement<GetSexo> createGetSexo(GetSexo value) {
        return new JAXBElement<GetSexo>(_GetSexo_QNAME, GetSexo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSexoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.ws.teste.br.com/", name = "getSexoResponse")
    public JAXBElement<GetSexoResponse> createGetSexoResponse(GetSexoResponse value) {
        return new JAXBElement<GetSexoResponse>(_GetSexoResponse_QNAME, GetSexoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.ws.teste.br.com/", name = "getImc")
    public JAXBElement<GetImc> createGetImc(GetImc value) {
        return new JAXBElement<GetImc>(_GetImc_QNAME, GetImc.class, null, value);
    }

}
