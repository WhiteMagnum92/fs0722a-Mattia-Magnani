package model;

public class Rivista extends CatalogoBibliotecario {
	
	Periodicita periodicita;

	public Rivista() {
		super();
	
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + "]";
	}
	
	
	

}
