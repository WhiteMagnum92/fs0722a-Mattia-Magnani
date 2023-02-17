package prova.dbpostgresql;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestioneDb {
	
	static List<Utente> listaUtenti = new ArrayList<Utente>();

	public static void main(String[] args) {
		
		try {
			//crea una connection
			DbConnection db = new DbConnection();
			db.creaTabUtenti();
			//creo un utente e lo pusho nel db
			Utente u = new Utente(0, "Mario", "Rossi", "1/8/1999", 23, "m.rossi@email.com"); 
			//db.salvaUtente(u);
		
			listaUtenti = db.leggiUtenti();
			
			Utente ut = listaUtenti.get(0);
			ut.email = "mariolino.rossi@example.com";
			//db.modificaUtente(ut);
			
			Utente utd = db.leggiUtenteDaId(4);
			System.out.println(utd);
			
			/*for (Utente utente :listaUtenti) {
				System.out.println(utente);
			}*/
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

	}

}
