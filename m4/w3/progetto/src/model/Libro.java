package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libro")
public class Libro extends CatalogoBibliotecario {
	
	@Column (name="Autore")
	private String autore;
	
	@Column (name="Genere")
	private String genere;
	
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
		return "Libro [autore=" + autore + ", genere=" + genere + super.toString() + "]";
	}

	
	
}
