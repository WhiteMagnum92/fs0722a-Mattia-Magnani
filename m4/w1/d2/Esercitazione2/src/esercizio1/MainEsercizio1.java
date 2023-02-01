package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rettangolo r1 = new Rettangolo(5,10);
		Rettangolo r2 = new Rettangolo (7,12);
		
		stampaRettangolo(r1);
		
		stampaDueRettangoli(r1, r2);
		};
		
		public static void stampaRettangolo(Rettangolo r) {
			System.out.println("Area:" + r.calcolaArea());
			System.out.println("Perimetro:" + r.calcolaPerimetro());
		};
	
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		
		
		System.out.println("Area rettangolo 1:" + r1.calcolaArea());
		System.out.println("Perimetro rettangolo 1:" + r1.calcolaPerimetro());
		System.out.println("Area rettangolo 2:" + r2.calcolaArea());
		System.out.println("Perimetro rettangolo 2:" + r2.calcolaPerimetro());
		System.out.println("Somma area rettangoli:" + (r1.calcolaArea() + r2.calcolaArea()));
		System.out.println("Somma perimetri rettangoli:" + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
	}
	

}
