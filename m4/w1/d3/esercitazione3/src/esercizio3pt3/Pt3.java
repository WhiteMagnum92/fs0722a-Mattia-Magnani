package esercizio3pt3;

import java.util.Scanner;

public class Pt3 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

			submit();

	}
		
		public static void submit() {
			String str="";
			do {
			System.out.print("Inserisci una stringa: ");
			String str1 = sc.nextLine();
			String str2 = String.join(",", str1.split(""));
			System.out.println(str2);
			str=str1;
			}while(!str.equals("q"));
		}

}
