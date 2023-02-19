package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="N_Tessera")
	private Integer nTessera;  
   
    @Column (name="Nome")
	private String nome;
    
    @Column (name="Cognome")
	private String cognome;
    
    @Column (name="Data_Nascita")
	private Date dataNascita;
    
   

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
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Integer getnTessera() {
		return nTessera;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", Cognome=" + cognome + ", dataNascita=" + dataNascita + ", nTessera="
				+ nTessera + "]";
	}


}
