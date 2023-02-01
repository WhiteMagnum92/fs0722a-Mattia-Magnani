package esercizio1;

public class Rettangolo {
	double altezza;
	double larghezza;
	
	//Costruttore
	public Rettangolo (double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		
		}
	public double calcolaArea() {
		return this.altezza*this.larghezza;
	};
	public double calcolaPerimetro() {
		return (this.altezza+this.larghezza)*2;
	};
	

}
