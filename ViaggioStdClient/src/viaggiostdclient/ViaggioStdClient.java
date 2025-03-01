package viaggiostdclient;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import viaggio.Viaggio;
import viaggio.ViaggioEJBRemote;

public class ViaggioStdClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        // Aggiunto il cast (ViaggioEJBRemote)
        ViaggioEJBRemote ejb = (ViaggioEJBRemote) ctx.lookup("java:global/Viaggio/ViaggioEJB!viaggio.ViaggioEJBRemote");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Destinazione da ricercare:");
        String destinazione = s.nextLine();
        
        List<Viaggio> list = ejb.trovaDestinazione(destinazione);
    
        for(Viaggio v: list)
            System.out.println(v);
    }
    
}
