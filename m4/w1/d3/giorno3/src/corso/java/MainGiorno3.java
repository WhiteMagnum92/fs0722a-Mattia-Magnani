package corso.java;

import java.util.Scanner;

public class MainGiorno3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il nome: ");
		String nome = sc.nextLine();
		System.out.print("Inserisci il cognome: ");
		String cognome = sc.nextLine();
		System.out.print("Inserisci il eta: ");
		int eta = Integer.parseInt(sc.nextLine());
		
		if(eta > 18) {
			
			System.out.print("Ciao"+ " " + nome + " " + cognome);
			
		} else if (eta > 16) {
			
			System.out.println("Ciao"+ " " + nome + " " + cognome + " " +"Devi essere accompagnato");
		
		} else {
			
			System.out.println("Non puoi entrare!");
		}
		
		System.out.println("Fine");

	}

}
