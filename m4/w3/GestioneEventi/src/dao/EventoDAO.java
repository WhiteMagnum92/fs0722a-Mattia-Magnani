package dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Evento;
import utils.JpaUtil;

public class EventoDAO {
	
	static Logger log = LoggerFactory.getLogger(EventoDAO.class);
	
	public void save(Evento e) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		}catch (Exception ex){
			em.getTransaction().rollback();
			log.error(ex.getMessage());
		} finally {
			em.close();
		}
	}
	
	public Evento getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			return em.find(Evento.class, id);
		} finally {
			em.close();
		}
		
	}
	
	public void delete(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.remove(e);
			em.remove(em.contains(e) ? e : em.merge(e)); // serve per evitare l'errore di presenza o meno nell'entity manager(gli sichiede se e presente o meno)
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public void refresh(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.refresh(e);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}
