package model;

import java.util.Date;

public class Utente {

	String nome;
	String Cognome;
	Date dataNascita;
	Long nTessera;

	public Utente() {
		super();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Long getnTessera() {
		return nTessera;
	}

	public void setnTessera(Long nTessera) {
		this.nTessera = nTessera;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", Cognome=" + Cognome + ", dataNascita=" + dataNascita + ", nTessera="
				+ nTessera + "]";
	}

}
