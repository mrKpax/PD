package viaggio;

import javax.enterprise.event.Observes;

public class LiberoNotification {
    public void notify(@Observes @Libero Viaggio v){
        System.out.println("Attenzione: Viaggio di nuovo disponibile per prenotazioni");
    }
}
