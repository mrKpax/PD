package viaggio;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    public void notify(@Observes Viaggio v){
        System.out.println("Posto liberato per il viaggio con ID " + v.getId());
    }
}
