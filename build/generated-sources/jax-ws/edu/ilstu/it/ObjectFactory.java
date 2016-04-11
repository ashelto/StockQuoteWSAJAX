
package edu.ilstu.it;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.ilstu.it package. 
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

    private final static QName _GetStockPrice_QNAME = new QName("http://it.ilstu.edu/", "getStockPrice");
    private final static QName _GetStockPriceResponse_QNAME = new QName("http://it.ilstu.edu/", "getStockPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.ilstu.it
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStockPrice }
     * 
     */
    public GetStockPrice createGetStockPrice() {
        return new GetStockPrice();
    }

    /**
     * Create an instance of {@link GetStockPriceResponse }
     * 
     */
    public GetStockPriceResponse createGetStockPriceResponse() {
        return new GetStockPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.ilstu.edu/", name = "getStockPrice")
    public JAXBElement<GetStockPrice> createGetStockPrice(GetStockPrice value) {
        return new JAXBElement<GetStockPrice>(_GetStockPrice_QNAME, GetStockPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.ilstu.edu/", name = "getStockPriceResponse")
    public JAXBElement<GetStockPriceResponse> createGetStockPriceResponse(GetStockPriceResponse value) {
        return new JAXBElement<GetStockPriceResponse>(_GetStockPriceResponse_QNAME, GetStockPriceResponse.class, null, value);
    }

}
