package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipologia")
public abstract class CatalogoBibliotecario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="ISBN")
	private Integer isbn;
	
	@Column (name="Titolo")
	private String  titolo;
	
	@Column (name="Anno_Pubblicazione")
	private Integer annoPubblicazione;
	
	@Column (name="N_Pagine")
	private Integer numeroPagine;
	
	public CatalogoBibliotecario() {
		super();
	}

	public Integer getIsbn() {
		return isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return " isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine ;
	}
	
	

}
