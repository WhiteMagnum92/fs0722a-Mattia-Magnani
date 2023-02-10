package parte3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RegistroPresenze {
	
	static List<Presenza> listaPresenze = new ArrayList<Presenza>();
    static File file = new File ("presenze/listaPresenze.txt");

	public static void main(String[] args) {
		
		

	}
	
	public static void salvaPresenze(List<Presenza> listaPresenze) {
		
		String presenzaTxt = "";
		for(Presenza p : listaPresenze) {
			
			presenzaTxt += (p.getNome()+ " " + p.getCognome() + "@" + p.getNumero() + "#");
			
		}
		
	}
	
	public static void leggiPresenze() {
		
		
		
	}

}
