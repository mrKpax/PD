package viaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class ViaggioMDB implements MessageListener{
    
    @Inject
    private ViaggioEJB ejb;
    
    @Inject
    Event<Viaggio> event;
    
    @Inject @Libero
    Event<Viaggio> liberoEvent;
    
    @Override
    public void onMessage(Message message){
        try {
            MessageWrapper msg = message.getBody(MessageWrapper.class);
            int id = msg.getId();
            String utente = msg.getUtente();
            
            Viaggio v = ejb.trovaId(id);
            v.setDisponibili(v.getDisponibili() + 1); // +1 anziché -1
            
            if (v.getUtenti().contains(utente)){
                List<String> lUtenti = new ArrayList<>(v.getUtenti()); //Si usa ArrayList per poter modificare
                lUtenti.remove(utente); // Poichè .remove() restituisce un booleano, l'operazione è stata splittata
                v.setUtenti(lUtenti);

            }
                        
            ejb.aggiornaViaggio(v);
            
            if(v.getDisponibili() == 1) // ==1 e non ==3 poiché si effettua il controllo sui posti liberi
                liberoEvent.fire(v);
            else
                event.fire(v);
            
        } catch (JMSException ex) {
            Logger.getLogger(ViaggioMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
