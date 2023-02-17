package model_SINGLE_TABLE;

import javax.persistence.Entity;

@Entity
public class Moto extends Veicolo {
	
	private Integer nPosti;
	private Integer cilindrata;
	
	public Moto() {
		super();
		
	}

	public Integer getnPosti() {
		return nPosti;
	}

	public void setnPosti(Integer nPosti) {
		this.nPosti = nPosti;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
	

}
