package parte2;

import java.util.Scanner;

public class Pt2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		kmPerLt();

	}
	
	public static void kmPerLt() {
		try {
			System.out.print("Inserisci i kilometri percorsi: ");
			int km = Integer.parseInt(sc.nextLine());
			System.out.print("Inserisci i litri di benzina consumati: ");
			int lt = Integer.parseInt(sc.nextLine());
			if (lt != (int) lt || km != (int) km) {
				throw new NumberFormatException();
			}
			double kmPLt;
			if (lt == 0) {
				throw new ArithmeticException();
			}
			kmPLt = km / lt;
			System.out.println("Hai consumato un litro ogni " + kmPLt + "km.");

		} catch (NumberFormatException ex) {
			System.out.println("Inserisci un numero!!!");
			System.out.println("Reboot");
			kmPerLt();
		} catch (ArithmeticException ex) {
			System.out.println("Non e possibile aver consumato 0 litri!!!");
			System.out.println("Reboot");
			kmPerLt();
		}

	}

}
