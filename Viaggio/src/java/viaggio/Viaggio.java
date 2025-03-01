package viaggio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import static viaggio.Viaggio.TROVA_DATA;
import static viaggio.Viaggio.TROVA_DESTINAZIONE;
import static viaggio.Viaggio.TROVA_ID;
import static viaggio.Viaggio.TROVA_LIBERI;
import static viaggio.Viaggio.TROVA_NDISPONIBILI;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_DESTINAZIONE, query = "SELECT v FROM Viaggio v WHERE v.destinazione = :destinazione"),
    @NamedQuery(name = TROVA_ID, query = "SELECT v FROM Viaggio v WHERE v.id = :id"),
    @NamedQuery(name = TROVA_DATA, query = "SELECT v FROM Viaggio v WHERE v.datap = :datap"),
    @NamedQuery(name = TROVA_LIBERI, query = "SELECT v FROM Viaggio v WHERE v.disponibili > 0"),
    @NamedQuery(name = TROVA_NDISPONIBILI, query = "SELECT COUNT(v) FROM Viaggio v WHERE v.disponibili > 0"), // COUNT(v) anziché COUNT v
})
@XmlRootElement
public class Viaggio implements Serializable{
    public static final String TROVA_DESTINAZIONE = "Viaggio.trovaDestinazione";
    public static final String TROVA_DATA = "Viaggio.trovaData";
    public static final String TROVA_LIBERI = "Viaggio.trovaLiberi";
    public static final String TROVA_NDISPONIBILI = "Viaggio.trovaNDisponibili";
    public static final String TROVA_ID = "Viaggio.trovaID";
    
    @Id
    private int id;
    private String conducente;
    private String partenza;
    private String destinazione;
    private Date datap;
    private int disponibili;
    private List<String> utenti; //Rimosso [disponibili]

    public Viaggio() {
    }

    public Viaggio(int id, String conducente, String partenza, String destinazione, Date datap, int disponibili, List<String> utenti) {
        this.id = id;
        this.conducente = conducente;
        this.partenza = partenza;
        this.destinazione = destinazione;
        this.datap = datap;
        this.disponibili = disponibili;
        this.utenti = utenti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConducente() {
        return conducente;
    }

    public void setConducente(String conducente) {
        this.conducente = conducente;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public Date getDatap() {
        return datap;
    }

    public void setDatap(Date datap) {
        this.datap = datap;
    }

    public int getDisponibili() {
        return disponibili;
    }

    public void setDisponibili(int disponibili) {
        this.disponibili = disponibili;
    }

    public List<String> getUtenti() {
        return utenti;
    }

    public void setUtenti(List<String> utenti) {
        this.utenti = utenti;
    }

    @Override
    public String toString() {
        return "Viaggio{" + "id=" + id + ", conducente=" + conducente + ", partenza=" + partenza + ", destinazione=" + destinazione + ", datap=" + datap + ", disponibili=" + disponibili + ", utenti=" + utenti + '}';
    }
    
}
