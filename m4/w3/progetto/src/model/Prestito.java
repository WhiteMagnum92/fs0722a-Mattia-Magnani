package model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Prestito implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
    @JoinColumn(name = "id_Utente")
	Utente utente;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne
    @JoinColumn(name = "id_Catalogo")
	CatalogoBibliotecario elementoPrestato;
	
	@Column (name="Data_Prestito")
	Date inizioPrestito;
	
	@Column (name="Data_Prevista")
	Date restituzionePrevista;
	
	@Column (name="Data_Restituzione")
	Date restituzionEffettiva;
	
	public Prestito() {
		super();
		
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public CatalogoBibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(CatalogoBibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public Date getInizioPrestito() {
		return inizioPrestito;
	}

	public void setInizioPrestito(Date inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
		Calendar cal = Calendar.getInstance();
        cal.setTime(inizioPrestito);
        cal.add(Calendar.DATE, 30); 
        restituzionePrevista= cal.getTime();
		
	}

	public Date getRestituzionEffettiva() {
		return restituzionEffettiva;
	}

	public void setRestituzionEffettiva(Date restituzionEffettiva) {
		this.restituzionEffettiva = restituzionEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [utente=" + utente + ", elementoPrestato=" + elementoPrestato + ", inizioPrestito="
				+ inizioPrestito + ", restituzionePrevista=" + restituzionePrevista + ", restituzionEffettiva="
				+ restituzionEffettiva + "]";
	}
	
	

}
