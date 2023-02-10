package progetto;

public class Riviste extends Collezione {
	
	Periodicita periodicita;
	
	public Riviste() {
		
	}

	public Riviste(Integer iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			Periodicita periodicita) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	
	
}
