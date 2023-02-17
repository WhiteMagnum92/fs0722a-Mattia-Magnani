package model;

public class Libro extends CatalogoBibliotecario{
	
	String autore;
	String genere;
	
	public Libro() {
		super();

	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + "]";
	}
	
}
