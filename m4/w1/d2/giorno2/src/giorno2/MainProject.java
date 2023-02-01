package giorno2;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Veicolo v = new Veicolo();  // richiamo il constructor e istanzio un new veicolo
		v.marca = "Fiat";           // istanzio gli attributi, definendoli secondo le regole della classe
		v.modello = "500";
		v.colore = "nero";
		v.cilindrata = 1100;
		v.targa = "AB123CD";*/
		Veicolo v1 = new Veicolo("Fiat", "500","AB123CD", "Nero", 1100);
		
		System.out.println(v1.info());

	}

}
