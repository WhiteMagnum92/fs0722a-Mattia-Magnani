package parte1;

import java.util.Random;

public class Pt1 {

	static int[] array = new int[5];

	public static void main(String[] args) {

		creaNumeroCasuale();

	}

	public static void creaNumeroCasuale() {
		
	
		Random r = new Random();
		
		for (int i=0; i < array.length; i++) {
			array[i] = r.nextInt(11);
		}
	}
	public static void stampaArray() {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
