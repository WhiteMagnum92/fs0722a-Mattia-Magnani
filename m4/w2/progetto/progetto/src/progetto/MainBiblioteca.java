package progetto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainBiblioteca {

	static List<Riviste> listaRiviste = new ArrayList<>();
	static List<Libri> listaLibri = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// AUTOMAZIONE DA SCANNER

		System.out.println("Aggiungere libro o rivista alla collezione?");
		String build = sc.next();
		if (build.equals("libro")) {
			creaLibro();
		} else if (build.equals("rivista")) {
			creaRivista();
		} else {
			return;
		}
		System.out.println("Aggiungere libro o rivista alla collezione?");
		String build1 = sc.next();
		if (build1.equals("libro")) {
			creaLibro();
		} else if (build1.equals("rivista")) {
			creaRivista();
		} else {
			return;
		}
		
		/* QUA CI DOVEVA ESSERE ANCHE LA PARTE DOVE SI IMPLEMENTAVANO GLI ALTRI METODI MA SONO LENTO 
		  E NON HO FATTO IN TEMPO, IN PIU JAVA NON AIUTA XD */

	}

	// METODO PER CREARE UNA RIVISTA
	private static void creaRivista() {

		Riviste r1 = new Riviste();

		System.out.println("Inserire il titolo della rivista: ");
		try {
			String titoloRivista = sc.next();
			r1.setTitolo(titoloRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il titolo non è valido: " + e.getMessage());
		}
		System.out.println("Inserire il codice ISBN univoco: ");
		try {
			int ISBNrivista = Integer.parseInt(sc.next());
			r1.setiSBN(ISBNrivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il codice ISBN non è valido: " + e.getMessage());
		}

		System.out.println("Inserire l'anno di pubblicazione: ");
		try {
			int annoRivista = Integer.parseInt(sc.next());
			r1.setAnnoPubblicazione(annoRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("L'anno di pubblicazione non è valido: " + e.getMessage());
		}

		System.out.println("Inserire il numero di pagine: ");
		try {
			int pagineRivista = Integer.parseInt(sc.next());
			r1.setNumeroPagine(pagineRivista);
		} catch (IllegalArgumentException e) {
			System.out.println("Il numero di pagine non è valido: " + e.getMessage());
		}

		System.out.println("Inserire la periodicità della rivista (settimanale, mensile o semestrale)");
		String periodicita = sc.next();

		switch (periodicita) {
		case "settimanale":
			r1.setPeriodicita(Periodicita.SETTIMANALE);
			break;
		case "mensile":
			r1.setPeriodicita(Periodicita.MENSILE);
			break;
		case "semestrale":
			r1.setPeriodicita(Periodicita.SEMESTRALE);
			break;
		}

		listaRiviste.add(r1);
		System.out.println("Rivista creata con successo");
	}

	// METODO PER CREARE UN LIBRO
	private static void creaLibro() {

		Libri l1 = new Libri();

		System.out.println("Inserisci il titolo del libro: ");
		try {
			String titoloLibro = sc.next();
			l1.setTitolo(titoloLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("Il titolo non è valido: " + e.getMessage());
		}
		System.out.println("Inserire il codice ISBN univoco: ");
		try {
			int ISBNlibro = Integer.parseInt(sc.next());
			l1.setISBN(ISBNlibro);
		} catch (NumberFormatException e) {
			System.out.println("Il codice ISBN non è valido: " + e.getMessage());
		}

		System.out.println("Inserire l'autore: ");
		try {
			String autoreLibro = sc.next();
			l1.setAutore(autoreLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("L'autore del libro non è valido: " + e.getMessage());
		}

		System.out.println("Inserire la tipologia: ");
		try {
			String genereLibro = sc.next();
			l1.setGenere(genereLibro);
		} catch (IllegalArgumentException e) {
			System.out.println("La tipologia non è valida: " + e.getMessage());
		}

		System.out.println("Inserire l'anno di pubblicazione: ");
		try {
			int annoLibro = Integer.parseInt(sc.next());
			l1.setAnnoPubblicazione(annoLibro);
		} catch (NumberFormatException e) {
			System.out.println("l'anno di pubblicazione non è valido: " + e.getMessage());
		}
		System.out.println("Inserire il numero di pagine: ");
		try {
			int pagineLibro = Integer.parseInt(sc.next());
			l1.setNumeroPagine(pagineLibro);
		} catch (NumberFormatException e) {
			System.out.println("Il numero di pagine non è valido: " + e.getMessage());
		}

		listaLibri.add(l1);
		System.out.println("Libro creato  con successo");
	}

	// METODO PER ELIMINARE RIVISTA TRAMITE ISBN
	private static void eliminaRivista() {

		System.out.println("Inserire ISBN rivista da eliminare: ");
		int isbnRivista = Integer.parseInt(sc.next());

		List<Riviste> stream = listaRiviste.stream().filter(r -> r.getiSBN() == isbnRivista)
				.collect(Collectors.toList());

		listaLibri.remove(stream);
		System.out.println("Rivista" + isbnRivista + "eliminata");
	}

	// METODO PER ELIMINARE LIBRO TRAMITE ISBN
	private static void eliminaLibro() {

		System.out.println("Inserire ISBN libro da eliminare: ");
		int isbnLibro = Integer.parseInt(sc.next());

		List<Libri> stream = listaLibri.stream().filter(l -> l.getiSBN() == isbnLibro).collect(Collectors.toList());

		listaLibri.remove(stream);
		System.out.println("Libro" + isbnLibro + "eliminato");
	}

	// METODO PER CERCARE RIVISTA TRAMITE ISBN
	private static void cercaIsbnRivista() {

		System.out.println("Inserire ISBN rivista da cercare: ");
		int isbnRivista = Integer.parseInt(sc.next());

		List<Riviste> stream = listaRiviste.stream().filter(r -> r.getiSBN() == isbnRivista)
				.collect(Collectors.toList());

		stream.forEach(r -> System.out.println(r));

	}

	// METODO PER CERCARE LIBRO TRAMITE ISBN
	private static void cercaIsbnLibro() {

		System.out.println("Inserire ISBN libro da cercare: ");
		int isbnLibro = Integer.parseInt(sc.next());

		List<Libri> stream = listaLibri.stream().filter(l -> l.getiSBN() == isbnLibro).collect(Collectors.toList());

		stream.forEach(l -> System.out.println(l));

	}

	// METODO PER CERCARE RIVISTA TRAMITE ANNO
	private static void cercaAnnoRivista() {

		System.out.println("Inserire l'anno di pubblicazione della rivista da cercare: ");
		int annoRivista = Integer.parseInt(sc.next());

		List<Riviste> stream = listaRiviste.stream().filter(r -> r.getAnnoPubblicazione() == annoRivista)
				.collect(Collectors.toList());

		stream.forEach(r -> System.out.println(r));

	}

    // METODO PER CERCARE LIBRO TRAMITE ANNO
	private static void cercaAnnoLibro() {

		System.out.println("Inserire l'anno di pubblicazione del libro da cercare: ");
		int annoRicerca = Integer.parseInt(sc.next());

		List<Libri> stream = listaLibri.stream().filter(l -> l.getAnnoPubblicazione() == annoRicerca)
				.collect(Collectors.toList());

		stream.forEach(l -> System.out.println(l));
	}

	// METODO PER CERCARE LIBRO TRAMITE AUTORE
	private static void cercaAutoreLibro() {

		System.out.println("Inserire l'autore del libro da cercare: ");
		String autoreRicerca = sc.next();

		List<Libri> stream = listaLibri.stream().filter(l -> l.getAutore() == autoreRicerca)
				.collect(Collectors.toList());

		stream.forEach(l -> System.out.println(l));
	}

}
