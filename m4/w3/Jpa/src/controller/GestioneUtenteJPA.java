package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Utente;

public class GestioneUtenteJPA {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa"); // oggetto che collega il db
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		try {
			Utente u = new Utente();
			u.setNome("Mario");
			u.setCognome("Rossi");
			u.setEmail("m.rossi@example.com");

			aggiungiUtente(u);
		} catch (Exception e) {

		} finally {
			em.close();
			emf.close();
		}

	}

	private static void aggiungiUtente(Utente u) {

		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto nel DB!");

	}

	private static Utente leggiUtente(int id) {

		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);
		em.getTransaction().commit();
		return u;

	}

	private static void modificaUtente(Utente u) {

		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Utente modificato nel DB!");
	}

	private static void eliminaUtente(Utente u) {

		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("Utente eliminato nel DB!");
	}

}
