package viaggio;

import java.io.Serializable;

public class MessageWrapper implements Serializable{
    private int id;
    private String utente;

    public MessageWrapper(int id, String utente) {
        this.id = id;
        this.utente = utente;
    }

    public int getId() {
        return id;
    }

    public String getUtente() {
        return utente;
    }
    
}
