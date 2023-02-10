package progetto;

public class Libri extends Collezione {

	String autore;
	String genere;

	public Libri() {

	}

	public Libri(Integer iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

}
