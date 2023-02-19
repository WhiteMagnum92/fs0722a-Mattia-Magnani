package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Rivista")
public class Rivista extends CatalogoBibliotecario {
	
	@Column (name="Periodicita")
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Rivista() {
		super();
	
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita +  super.toString() + "]";
	}

	

	
	
	

}
