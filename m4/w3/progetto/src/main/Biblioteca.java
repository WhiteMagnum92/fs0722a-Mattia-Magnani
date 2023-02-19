package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.CatalogoBibliotecario;
import model.Libro;
import model.Periodicita;
import model.Prestito;
import model.Rivista;
import model.Utente;

public class Biblioteca {

	static Logger log = LoggerFactory.getLogger(Biblioteca.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progetto");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		try {

			/*
			 * Libro l= new Libro(); l.setAnnoPubblicazione(2020); l.setAutore("pippo");
			 * l.setGenere("fantasy"); l.setNumeroPagine(2344); l.setTitolo("pluto");
			 * aggiungiElemento(l);
			 * 
			 * Utente u = new Utente(); u.setCognome("Manuzzi"); u.setNome("Bumbo"); String
			 * dateString = "27/07/1992"; SimpleDateFormat format = new
			 * SimpleDateFormat("dd/MM/yyyy"); u.setDataNascita(format.parse(dateString));
			 * aggiungiUtente(u);
			 * 
			 * Prestito p = new Prestito(); dateString = "01/01/2023";
			 * p.setInizioPrestito(format.parse(dateString)); p.setElementoPrestato(l);
			 * p.setUtente(u); creaPrestito(p);
			 */
			 
		} catch (Exception e) {
			em.getTransaction().rollback();

		} finally {
			em.close();
			emf.close();
		}

	}

	// METODO PER SALVARE UTENTE NEL DB
	private static void aggiungiUtente(Utente utente) {

		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		log.info("Elemento aggiunto nel DB!");

	}

	// METODO PER SALVARE UNA RIVISTA O UN LIBRO NEL DB
	private static void aggiungiElemento(CatalogoBibliotecario e) {

		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		log.info("Elemento aggiunto nel DB!");

	}

	// METODO PER ELIMINARE UNA RIVISTA O UN LIBRO NEL DB TRAMITE ISBN
	private static void eliminaElemento(Integer isbn) {

		CatalogoBibliotecario e = ricercaIsbn(isbn);
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		log.info("Elemento eliminato nel DB!");

	}

	// METODO PER RICERCARE UN UTENTE NEL DB
	private static Utente ricercaUtente(Integer n) {

		Utente u = em.find(Utente.class, n);
		return u;

	}

	// METODO PER CREARE UN PRESTITO NEL DB
	private static void creaPrestito(Prestito p) {

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		log.info("Prestito salvato nel DB!");

	}

	// METODO PER RICERCARE LIBRO O RIVISTA TRAMITE ISBN
	private static CatalogoBibliotecario ricercaIsbn(Integer isbn) {

		CatalogoBibliotecario e = em.find(CatalogoBibliotecario.class, isbn);
		return e;

	}

	// METODO PER RICERCARE LIBRI O RIVISTE TRAMITE ANNO DI PUBBLICAZIONE
	private static List<CatalogoBibliotecario> ricercaAnnoPubblicazione(Integer anno) {

		Query query = em.createQuery("SELECT * FROM CatalogoBibliotecario WHERE anno_pubblicazione = :annoPubblicazione");
		query.setParameter("annoPubblicazione", anno);
		List<CatalogoBibliotecario> results = query.getResultList();
		return results;

	}

	// METODO PER RICERCARE LIBRI
	private static List<Libro> ricercaAutore(String autore) {

		Query query = em
				.createQuery("SELECT l FROM CatalogoBibliotecario l WHERE tipologia='Libro' AND autore = :autore");
		query.setParameter("autore", autore);
		List<Libro> results = query.getResultList();
		return results;

	}

	// METDO PER RICERCARE RIVISTE O LIBRI TRAMITE TITOLO
	private static List<CatalogoBibliotecario> ricercaTitolo(String titolo) {

		Query query = em.createQuery("SELECT l FROM CatalogoBibliotecario l WHERE titolo LIKE :titolo");
		query.setParameter("titolo", "%" + titolo + "%");
		List<CatalogoBibliotecario> results = query.getResultList();
		return results;

	}

	// METDO PER RICERCARE PRESTITI NON ANCORA RESTITUITI
	private static List<Prestito> ricercaPrestito(Integer n) {

		Query query = em.createQuery("SELECT * FROM Prestito WHERE id_utente=:id_utente AND data_restituzione IS NULL");
		query.setParameter("id_utente", n);
		List<Prestito> results = query.getResultList();
		return results;

	}

	// METODO PER RICERCARE PRESTITI SCADUTI E NON ANCORA RESTITUITI
	private static List<Prestito> ricercaPrestitiScaduti() {

		Query query = em.createQuery("SELECT * FROM Prestito WHERE data_restituzione IS NULL AND data_prevista < :today");
		query.setParameter("today", LocalDate.now());
		List<Prestito> results = query.getResultList();
		return results;

	}

}
