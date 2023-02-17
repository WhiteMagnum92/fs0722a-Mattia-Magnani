package model_SINGLE_TABLE;

import javax.persistence.Entity;

@Entity
public class Automobile extends Veicolo{
	
	private Integer nPorte;
	private String alimentazione;
	
	
	public Automobile() {
		super();
	}


	public Integer getnPorte() {
		return nPorte;
	}


	public void setnPorte(Integer nPorte) {
		this.nPorte = nPorte;
	}


	public String getAlimentazione() {
		return alimentazione;
	}


	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	
	
	

}
