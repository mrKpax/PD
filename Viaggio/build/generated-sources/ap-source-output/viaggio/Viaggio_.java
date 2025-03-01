package viaggio;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2025-02-22T20:27:23")
@StaticMetamodel(Viaggio.class)
public class Viaggio_ { 

    public static volatile SingularAttribute<Viaggio, List> utenti;
    public static volatile SingularAttribute<Viaggio, String> conducente;
    public static volatile SingularAttribute<Viaggio, String> partenza;
    public static volatile SingularAttribute<Viaggio, Date> datap;
    public static volatile SingularAttribute<Viaggio, Integer> disponibili;
    public static volatile SingularAttribute<Viaggio, Integer> id;
    public static volatile SingularAttribute<Viaggio, String> destinazione;

}