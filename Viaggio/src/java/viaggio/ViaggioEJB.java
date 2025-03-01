package viaggio;

import java.util.Date;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
@WebService
public class ViaggioEJB implements ViaggioEJBRemote {
    
    @Inject
    private EntityManager em;

    @Override
    public void aggiungiViaggio(Viaggio v) {
        em.persist(v);
    }

    @Override
    public void rimuoviViaggio(Viaggio v) {
        em.remove(em.merge(v));
    }

    @Override
    public Viaggio aggiornaViaggio(Viaggio v) {
        return em.merge(v); // Aggiunto il return
    }

    @Override
    public List<Viaggio> trovaDestinazione(String destinazione) {
        TypedQuery<Viaggio> query = em.createNamedQuery(Viaggio.TROVA_DESTINAZIONE, Viaggio.class);
        query.setParameter("destinazione", destinazione);
        return query.getResultList();
    }

    @Override
    public List<Viaggio> trovaData(Date datap) {
        TypedQuery<Viaggio> query = em.createNamedQuery(Viaggio.TROVA_DATA, Viaggio.class);
        query.setParameter("datap", datap);
        return query.getResultList();
    }

    @Override
    public List<Viaggio> trovaLiberi() {
        TypedQuery<Viaggio> query = em.createNamedQuery(Viaggio.TROVA_LIBERI, Viaggio.class);
        return query.getResultList();
    }

    @Override
    public int trovaNDisponibili() {
        // Modifica: la funzione ottiene un tipo Long dalla query
        TypedQuery<Long> query = em.createNamedQuery(Viaggio.TROVA_NDISPONIBILI, Long.class);
        return query.getSingleResult().intValue(); //.intValue() per ottenere un valore int
    }

    @Override
    public Viaggio trovaId(int id) {
        TypedQuery<Viaggio> query = em.createNamedQuery(Viaggio.TROVA_ID, Viaggio.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
