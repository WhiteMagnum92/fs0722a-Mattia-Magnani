package giorno2;

public class Veicolo {
	
	String modello; //definisco degli attributi
	String marca;
	String targa;
	String colore;
	int cilindrata;
	
	public Veicolo (String modello, String marca, String targa, String colore, int cilindrata) {
		this.modello = modello;
		this.marca = marca;
		this.targa = targa;
		this.colore = colore;
		this.cilindrata = cilindrata;
	}
	
	public void start() {
		System.out.println("Veicolo avviato"); //definisco dei metodi
		
	}
	public void stop() {
		System.out.println("Veicolo fermo");
		
	}
	public String info() {
		return this.marca + " " + this.modello + " " + this.targa + " " + this.colore + " " + this.cilindrata;
		
	}

}
