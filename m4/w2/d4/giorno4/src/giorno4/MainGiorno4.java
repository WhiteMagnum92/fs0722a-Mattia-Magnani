package giorno4;

public class MainGiorno4 {

	public static void main(String[] args) {
	
		//Soluzione 1
		//ClasseConcreta c = new ClasseConcreta();
		//stampaMessaggio(c);
		
		//Soluzione 2 
		//stampaMessaggio(new ClasseConcreta());
		
		//Soluzione3 (classe anonima...definisco e utilizzo)
		stampaMessaggio(new IMessage() {

			@Override
			public String getMessage() {
				
				return "ClasseAnonima message";
			}
			
		});

	}
	
	public static void stampaMessaggio(IMessage m) {
		
		System.out.println(m.getMessage());
		
	}

}
