package logTest;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainProject {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(MainProject.class);
		
		// log.info("Test logger!");
		// log.error("test error!");
		// log.debug("test debug");
		// log.warn("warniing test!");
		
		Collection<String> c = new ArrayList <String>();
		// Non memorizza l'ordine in cui sono memorizzati gli elementi
		// Non definisce se ci possono essere valori duplicati
		// Non puo contenere valori primitivi 
		// Se  voglio valori primitivi devo wrapparli dentro alla classe
		
		//se voglio aggiungere elementi alla classe
		
		c.add("Primo elemento");
		
		// se voglio svuotare tutto
		
		c.clear();
		
		//se voglio vedere se un elemento e contenuto nella collection e ritorna un bool
		
		c.contains("Primo elemento");
		
		//controlla se la collection e vuota ritorna un bool
		
		c.isEmpty();
		
		//per rmuovere un elemento
		
		c.remove("Primo elemento");
		
		c.size();

	}

}
