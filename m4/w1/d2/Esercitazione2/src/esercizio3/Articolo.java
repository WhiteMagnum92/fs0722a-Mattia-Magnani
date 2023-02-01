package esercizio3;

public class Articolo {
	
String codiceArticolo;
String descrizioneArticolo;
double prezzo;
int numeroPezziDisponibili;
static int numeroPezziDisponibiliMagazzino = 0;

public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibiliMagazzino) {
	super();
	this.codiceArticolo = codiceArticolo;
	this.descrizioneArticolo = descrizioneArticolo;
	this.prezzo = prezzo;
	this.numeroPezziDisponibili = numeroPezzi;
	numeroPezziDisponibiliMagazzino += numeroPezziDisponibiliMagazzino;
}

public static int numeroPezziTotali() {
	return numeroPezziDisponibiliMagazzino;
}

}
