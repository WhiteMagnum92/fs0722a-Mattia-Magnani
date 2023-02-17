package model;

public abstract class CatalogoBibliotecario {
	
	Integer isbn;
	String  titolo;
	Integer annoPubblicazione;
	Integer numeroPagine;
	
	public CatalogoBibliotecario() {
		super();
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
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
		return "CatalogoBibliotecario [isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
	

}
