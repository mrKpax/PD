package viaggio;

import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ViaggioEJBRemote {
    void aggiungiViaggio(Viaggio v);
    void rimuoviViaggio(Viaggio v);
    Viaggio aggiornaViaggio(Viaggio v);
    
    List<Viaggio> trovaDestinazione(String destinazione);
    List<Viaggio> trovaData(Date datap);
    List<Viaggio> trovaLiberi();
    int trovaNDisponibili();
    Viaggio trovaId(int id);
}
