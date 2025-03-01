
package viaggio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the viaggio package. 
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

    private final static QName _AggiornaViaggioResponse_QNAME = new QName("http://viaggio/", "aggiornaViaggioResponse");
    private final static QName _TrovaLiberi_QNAME = new QName("http://viaggio/", "trovaLiberi");
    private final static QName _AggiungiViaggioResponse_QNAME = new QName("http://viaggio/", "aggiungiViaggioResponse");
    private final static QName _TrovaIdResponse_QNAME = new QName("http://viaggio/", "trovaIdResponse");
    private final static QName _TrovaDestinazioneResponse_QNAME = new QName("http://viaggio/", "trovaDestinazioneResponse");
    private final static QName _TrovaId_QNAME = new QName("http://viaggio/", "trovaId");
    private final static QName _RimuoviViaggioResponse_QNAME = new QName("http://viaggio/", "rimuoviViaggioResponse");
    private final static QName _TrovaLiberiResponse_QNAME = new QName("http://viaggio/", "trovaLiberiResponse");
    private final static QName _TrovaDataResponse_QNAME = new QName("http://viaggio/", "trovaDataResponse");
    private final static QName _AggiungiViaggio_QNAME = new QName("http://viaggio/", "aggiungiViaggio");
    private final static QName _TrovaData_QNAME = new QName("http://viaggio/", "trovaData");
    private final static QName _TrovaNDisponibili_QNAME = new QName("http://viaggio/", "trovaNDisponibili");
    private final static QName _TrovaDestinazione_QNAME = new QName("http://viaggio/", "trovaDestinazione");
    private final static QName _TrovaNDisponibiliResponse_QNAME = new QName("http://viaggio/", "trovaNDisponibiliResponse");
    private final static QName _RimuoviViaggio_QNAME = new QName("http://viaggio/", "rimuoviViaggio");
    private final static QName _Viaggio_QNAME = new QName("http://viaggio/", "viaggio");
    private final static QName _AggiornaViaggio_QNAME = new QName("http://viaggio/", "aggiornaViaggio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: viaggio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiornaViaggio }
     * 
     */
    public AggiornaViaggio createAggiornaViaggio() {
        return new AggiornaViaggio();
    }

    /**
     * Create an instance of {@link RimuoviViaggio }
     * 
     */
    public RimuoviViaggio createRimuoviViaggio() {
        return new RimuoviViaggio();
    }

    /**
     * Create an instance of {@link Viaggio }
     * 
     */
    public Viaggio createViaggio() {
        return new Viaggio();
    }

    /**
     * Create an instance of {@link TrovaDataResponse }
     * 
     */
    public TrovaDataResponse createTrovaDataResponse() {
        return new TrovaDataResponse();
    }

    /**
     * Create an instance of {@link AggiungiViaggio }
     * 
     */
    public AggiungiViaggio createAggiungiViaggio() {
        return new AggiungiViaggio();
    }

    /**
     * Create an instance of {@link TrovaData }
     * 
     */
    public TrovaData createTrovaData() {
        return new TrovaData();
    }

    /**
     * Create an instance of {@link TrovaNDisponibili }
     * 
     */
    public TrovaNDisponibili createTrovaNDisponibili() {
        return new TrovaNDisponibili();
    }

    /**
     * Create an instance of {@link TrovaDestinazione }
     * 
     */
    public TrovaDestinazione createTrovaDestinazione() {
        return new TrovaDestinazione();
    }

    /**
     * Create an instance of {@link TrovaNDisponibiliResponse }
     * 
     */
    public TrovaNDisponibiliResponse createTrovaNDisponibiliResponse() {
        return new TrovaNDisponibiliResponse();
    }

    /**
     * Create an instance of {@link RimuoviViaggioResponse }
     * 
     */
    public RimuoviViaggioResponse createRimuoviViaggioResponse() {
        return new RimuoviViaggioResponse();
    }

    /**
     * Create an instance of {@link TrovaLiberiResponse }
     * 
     */
    public TrovaLiberiResponse createTrovaLiberiResponse() {
        return new TrovaLiberiResponse();
    }

    /**
     * Create an instance of {@link TrovaDestinazioneResponse }
     * 
     */
    public TrovaDestinazioneResponse createTrovaDestinazioneResponse() {
        return new TrovaDestinazioneResponse();
    }

    /**
     * Create an instance of {@link TrovaId }
     * 
     */
    public TrovaId createTrovaId() {
        return new TrovaId();
    }

    /**
     * Create an instance of {@link AggiornaViaggioResponse }
     * 
     */
    public AggiornaViaggioResponse createAggiornaViaggioResponse() {
        return new AggiornaViaggioResponse();
    }

    /**
     * Create an instance of {@link TrovaLiberi }
     * 
     */
    public TrovaLiberi createTrovaLiberi() {
        return new TrovaLiberi();
    }

    /**
     * Create an instance of {@link AggiungiViaggioResponse }
     * 
     */
    public AggiungiViaggioResponse createAggiungiViaggioResponse() {
        return new AggiungiViaggioResponse();
    }

    /**
     * Create an instance of {@link TrovaIdResponse }
     * 
     */
    public TrovaIdResponse createTrovaIdResponse() {
        return new TrovaIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaViaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "aggiornaViaggioResponse")
    public JAXBElement<AggiornaViaggioResponse> createAggiornaViaggioResponse(AggiornaViaggioResponse value) {
        return new JAXBElement<AggiornaViaggioResponse>(_AggiornaViaggioResponse_QNAME, AggiornaViaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaLiberi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaLiberi")
    public JAXBElement<TrovaLiberi> createTrovaLiberi(TrovaLiberi value) {
        return new JAXBElement<TrovaLiberi>(_TrovaLiberi_QNAME, TrovaLiberi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiViaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "aggiungiViaggioResponse")
    public JAXBElement<AggiungiViaggioResponse> createAggiungiViaggioResponse(AggiungiViaggioResponse value) {
        return new JAXBElement<AggiungiViaggioResponse>(_AggiungiViaggioResponse_QNAME, AggiungiViaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaIdResponse")
    public JAXBElement<TrovaIdResponse> createTrovaIdResponse(TrovaIdResponse value) {
        return new JAXBElement<TrovaIdResponse>(_TrovaIdResponse_QNAME, TrovaIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaDestinazioneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaDestinazioneResponse")
    public JAXBElement<TrovaDestinazioneResponse> createTrovaDestinazioneResponse(TrovaDestinazioneResponse value) {
        return new JAXBElement<TrovaDestinazioneResponse>(_TrovaDestinazioneResponse_QNAME, TrovaDestinazioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaId")
    public JAXBElement<TrovaId> createTrovaId(TrovaId value) {
        return new JAXBElement<TrovaId>(_TrovaId_QNAME, TrovaId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RimuoviViaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "rimuoviViaggioResponse")
    public JAXBElement<RimuoviViaggioResponse> createRimuoviViaggioResponse(RimuoviViaggioResponse value) {
        return new JAXBElement<RimuoviViaggioResponse>(_RimuoviViaggioResponse_QNAME, RimuoviViaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaLiberiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaLiberiResponse")
    public JAXBElement<TrovaLiberiResponse> createTrovaLiberiResponse(TrovaLiberiResponse value) {
        return new JAXBElement<TrovaLiberiResponse>(_TrovaLiberiResponse_QNAME, TrovaLiberiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaDataResponse")
    public JAXBElement<TrovaDataResponse> createTrovaDataResponse(TrovaDataResponse value) {
        return new JAXBElement<TrovaDataResponse>(_TrovaDataResponse_QNAME, TrovaDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiViaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "aggiungiViaggio")
    public JAXBElement<AggiungiViaggio> createAggiungiViaggio(AggiungiViaggio value) {
        return new JAXBElement<AggiungiViaggio>(_AggiungiViaggio_QNAME, AggiungiViaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaData")
    public JAXBElement<TrovaData> createTrovaData(TrovaData value) {
        return new JAXBElement<TrovaData>(_TrovaData_QNAME, TrovaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaNDisponibili }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaNDisponibili")
    public JAXBElement<TrovaNDisponibili> createTrovaNDisponibili(TrovaNDisponibili value) {
        return new JAXBElement<TrovaNDisponibili>(_TrovaNDisponibili_QNAME, TrovaNDisponibili.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaDestinazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaDestinazione")
    public JAXBElement<TrovaDestinazione> createTrovaDestinazione(TrovaDestinazione value) {
        return new JAXBElement<TrovaDestinazione>(_TrovaDestinazione_QNAME, TrovaDestinazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaNDisponibiliResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "trovaNDisponibiliResponse")
    public JAXBElement<TrovaNDisponibiliResponse> createTrovaNDisponibiliResponse(TrovaNDisponibiliResponse value) {
        return new JAXBElement<TrovaNDisponibiliResponse>(_TrovaNDisponibiliResponse_QNAME, TrovaNDisponibiliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RimuoviViaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "rimuoviViaggio")
    public JAXBElement<RimuoviViaggio> createRimuoviViaggio(RimuoviViaggio value) {
        return new JAXBElement<RimuoviViaggio>(_RimuoviViaggio_QNAME, RimuoviViaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "viaggio")
    public JAXBElement<Viaggio> createViaggio(Viaggio value) {
        return new JAXBElement<Viaggio>(_Viaggio_QNAME, Viaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaViaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://viaggio/", name = "aggiornaViaggio")
    public JAXBElement<AggiornaViaggio> createAggiornaViaggio(AggiornaViaggio value) {
        return new JAXBElement<AggiornaViaggio>(_AggiornaViaggio_QNAME, AggiornaViaggio.class, null, value);
    }

}
