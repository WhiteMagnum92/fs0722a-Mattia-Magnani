package esercizio2;

public class Sim {
	
	String numeroTelefono;
	double creditoDisponibile;
	chiamata[] chiamate;
	
	public Sim(String numeroTelefono) {
		
		this.numeroTelefono = numeroTelefono;
		this.creditoDisponibile = 0;
		this.chiamate = new chiamata[5];
		this.stampaUltime5Chiamate();
		
	}
	public void stampaDatiSim() {
		System.out.println("Sim" + this.numeroTelefono);
		System.out.println("Credito Disponibile" + this.creditoDisponibile);
	}
	public void stampaUltime5Chiamate() {
		System.out.println("chiamata 1:" + this.chiamate[0]);
		System.out.println("chiamata 2:" + this.chiamate[1]);
		System.out.println("chiamata 3:" + this.chiamate[2]);
		System.out.println("chiamata 4:" + this.chiamate[3]);
		System.out.println("chiamata 5:" + this.chiamate[4]);
	}
	
}
