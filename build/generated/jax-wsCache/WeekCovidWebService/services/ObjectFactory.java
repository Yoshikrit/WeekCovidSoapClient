
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindAllWeekCovid_QNAME = new QName("http://services/", "findAllWeekCovid");
    private final static QName _Weekcovid_QNAME = new QName("http://services/", "weekcovid");
    private final static QName _FindAllWeekCovidResponse_QNAME = new QName("http://services/", "findAllWeekCovidResponse");
    private final static QName _InsertWeekCovid_QNAME = new QName("http://services/", "insertWeekCovid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Weekcovid }
     * 
     */
    public Weekcovid createWeekcovid() {
        return new Weekcovid();
    }

    /**
     * Create an instance of {@link FindAllWeekCovid }
     * 
     */
    public FindAllWeekCovid createFindAllWeekCovid() {
        return new FindAllWeekCovid();
    }

    /**
     * Create an instance of {@link InsertWeekCovid }
     * 
     */
    public InsertWeekCovid createInsertWeekCovid() {
        return new InsertWeekCovid();
    }

    /**
     * Create an instance of {@link FindAllWeekCovidResponse }
     * 
     */
    public FindAllWeekCovidResponse createFindAllWeekCovidResponse() {
        return new FindAllWeekCovidResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllWeekCovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllWeekCovid")
    public JAXBElement<FindAllWeekCovid> createFindAllWeekCovid(FindAllWeekCovid value) {
        return new JAXBElement<FindAllWeekCovid>(_FindAllWeekCovid_QNAME, FindAllWeekCovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weekcovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "weekcovid")
    public JAXBElement<Weekcovid> createWeekcovid(Weekcovid value) {
        return new JAXBElement<Weekcovid>(_Weekcovid_QNAME, Weekcovid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllWeekCovidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllWeekCovidResponse")
    public JAXBElement<FindAllWeekCovidResponse> createFindAllWeekCovidResponse(FindAllWeekCovidResponse value) {
        return new JAXBElement<FindAllWeekCovidResponse>(_FindAllWeekCovidResponse_QNAME, FindAllWeekCovidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertWeekCovid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertWeekCovid")
    public JAXBElement<InsertWeekCovid> createInsertWeekCovid(InsertWeekCovid value) {
        return new JAXBElement<InsertWeekCovid>(_InsertWeekCovid_QNAME, InsertWeekCovid.class, null, value);
    }

}
