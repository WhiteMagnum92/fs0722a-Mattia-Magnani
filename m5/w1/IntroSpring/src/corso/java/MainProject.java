package corso.java;

import java.util.ArrayList;
import java.util.List;

public class MainProject {

	public static void main(String[] args) {
		
		Telefono telefono = new Telefono("Iphone", "+39 123.3456789" );
		Persona p = new Persona ("Mario Rossi", telefono);
		
		List<Navigatore> nav = new ArrayList <Navigatore>();
		
		nav.add(telefono);

	}

}
