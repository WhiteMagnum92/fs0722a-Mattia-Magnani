package esercizio3pt2;

public class Pt2 {

	public static void main(String[] args) {
		
		submit(0);
		submit(1);
		submit(2);
		submit(3);
		submit(7);

	}

	public static void submit(int n) {
		switch(n) {
		case 0:
			System.out.println("Numero inserito: zero");
			break;
		case 1:
			System.out.println("Numero inserito: uno");
			break;
		case 2:
			System.out.println("Numero inserito: due");
			break;
		case 3:
			System.out.println("Numero inserito: tre");
			break;
		default:
			System.out.println("Errore: inserisci un numero compreso tra 0 e 3");
		}
	}
	
}
