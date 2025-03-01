package viaggiojmsclient;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import viaggio.MessageWrapper;

public class ViaggioJMSClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Viaggio da aggiornare (ID): ");
        int id = s.nextInt();
        System.out.println("Utente da rimuovere: ");
        s.nextLine();
        String utente = s.nextLine();
        
        MessageWrapper msg = new MessageWrapper(id, utente);
        
        try(JMSContext jmsCtx = cf.createContext()){
            jmsCtx.createProducer().send(topic, msg);
        }
    }
}
