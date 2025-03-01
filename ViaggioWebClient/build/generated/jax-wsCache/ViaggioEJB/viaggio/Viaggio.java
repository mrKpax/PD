
package viaggio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per viaggio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="viaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conducente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datap" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponibili" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utenti" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viaggio", propOrder = {
    "conducente",
    "datap",
    "destinazione",
    "disponibili",
    "id",
    "partenza",
    "utenti"
})
public class Viaggio {

    protected String conducente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datap;
    protected String destinazione;
    protected int disponibili;
    protected int id;
    protected String partenza;
    @XmlElement(nillable = true)
    protected List<String> utenti;

    /**
     * Recupera il valore della proprietà conducente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConducente() {
        return conducente;
    }

    /**
     * Imposta il valore della proprietà conducente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConducente(String value) {
        this.conducente = value;
    }

    /**
     * Recupera il valore della proprietà datap.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatap() {
        return datap;
    }

    /**
     * Imposta il valore della proprietà datap.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatap(XMLGregorianCalendar value) {
        this.datap = value;
    }

    /**
     * Recupera il valore della proprietà destinazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinazione() {
        return destinazione;
    }

    /**
     * Imposta il valore della proprietà destinazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinazione(String value) {
        this.destinazione = value;
    }

    /**
     * Recupera il valore della proprietà disponibili.
     * 
     */
    public int getDisponibili() {
        return disponibili;
    }

    /**
     * Imposta il valore della proprietà disponibili.
     * 
     */
    public void setDisponibili(int value) {
        this.disponibili = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà partenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartenza() {
        return partenza;
    }

    /**
     * Imposta il valore della proprietà partenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartenza(String value) {
        this.partenza = value;
    }

    /**
     * Gets the value of the utenti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utenti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtenti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUtenti() {
        if (utenti == null) {
            utenti = new ArrayList<String>();
        }
        return this.utenti;
    }

}
