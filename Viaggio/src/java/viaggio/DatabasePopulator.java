package viaggio;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.EmbeddedDataSource", // EmbeddedDataSource anziché EmbeddedSource
        name = "java:global/jdbc/EsameDS",
        user = "OK", password = "OK",
        databaseName = "EsameDB",
        properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    private ViaggioEJB ejb;
    private Viaggio v1, v2, v3;
    
    @PostConstruct
    private void populateDB(){
        // Modifica: Occorre istanziare un LocalDate per formattare Date
        LocalDate ldate = LocalDate.of(2024, 2, 20);
        Date datap = Date.valueOf(ldate); // Valore da passare
        
        // Modifica: le liste di stringhe contenenti i passeggeri sono passate con Array.asList()  
        v1 = new Viaggio(1, "Luca Bianchi", "Milano", "Napoli", datap, 0, Arrays.asList("Daniele", "Marco", "Alfonso", "Salvatore"));
        v2 = new Viaggio(2, "Sara Rossi", "Roma", "Milano", datap, 3, Arrays.asList("Matilda"));
        v3 = new Viaggio(3, "Daniele Verdi", "Salerno", "Napoli", datap, 4, Arrays.asList(new String[0]));
            
        ejb.aggiungiViaggio(v1);
        ejb.aggiungiViaggio(v2);
        ejb.aggiungiViaggio(v3);        
    }
    
    @PreDestroy
    private void clearDB(){
        ejb.rimuoviViaggio(v1);
        ejb.rimuoviViaggio(v2);
        ejb.rimuoviViaggio(v3);
    }
}
