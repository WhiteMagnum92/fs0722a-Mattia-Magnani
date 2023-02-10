package progetto;

import java.util.HashSet;
import java.util.Set;

public abstract class Collezione {

	Integer iSBN;
	String titolo;
	Integer annoPubblicazione;
	Integer numeroPagine;
	 static Set<Integer> iSBNset = new HashSet<>();
	
	public Collezione() {
		
	}
	public Collezione(Integer iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
	
		this.iSBN = iSBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}


	public Integer getiSBN() {
		return iSBN;
	}


	public void setiSBN(Integer iSBN) {
		this.iSBN = iSBN;
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
		if(annoPubblicazione <= 0) {
	        throw new IllegalArgumentException("l'anno di pubblicazione deve essere maggiore di 0");
	    }
		this.annoPubblicazione = annoPubblicazione;
	}


	public Integer getNumeroPagine() {
		return numeroPagine;
	}


	public void setNumeroPagine(Integer numeroPagine) {
		if(numeroPagine<=0) {
			 throw new IllegalArgumentException("Il numero di pagine deve essere superiore a 0");
			
		}
		this.numeroPagine = numeroPagine;
	}

	public void setISBN(int iSBN) {
        if(iSBNset.contains(iSBN)){
            throw new IllegalArgumentException("ISBN gia presente, inserirne uno diverso");
        }
        iSBNset.add(iSBN);
        this.iSBN = iSBN;
    }
	
	
}
