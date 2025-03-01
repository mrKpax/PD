package viaggiowebclient;

public class ViaggioWebClient {

    public static void main(String[] args) {
        System.out.println("Numero viaggi con almeno 1 posto disponibile: ");
        int n = trovaNDisponibili();
        System.out.println(n);
    }

    private static Integer trovaNDisponibili() {
        viaggio.ViaggioEJBService service = new viaggio.ViaggioEJBService();
        viaggio.ViaggioEJB port = service.getViaggioEJBPort();
        return port.trovaNDisponibili();
    }
    
}
