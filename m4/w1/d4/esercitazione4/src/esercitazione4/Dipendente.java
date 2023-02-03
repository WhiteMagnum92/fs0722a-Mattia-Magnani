package esercitazione4;

public class Dipendente {
	
	static public double stipendioBase=1000;
	 private String matricola;
	 private double stipendio;
	 private double importoOrarioStraordinario;
	 private Livello livello; 
	 private Dipartimento dipartimento;
	
	public Dipendente(String mat, Dipartimento dep) {
		this.matricola=mat;
		this.setDipartimento(dep);
		this.stipendio=Dipendente.stipendioBase;
		this.setImportoOrarioStraordinario(30);
		this.livello=Livello.OPERAIO;
	}
	
	public Dipendente(String mat, double x,double y,Livello a,Dipartimento b) {
		this.matricola=mat;
		this.stipendio=x;
		this.setImportoOrarioStraordinario(y);
		this.livello=a;
		this.setDipartimento(b);
	}
	
	

	public double getStipendio() {
		return stipendio;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public void stampaDatiDipendente() {
		System.out.println("Dipendente di livello "+this.livello+
				", dipartimento "+this.dipartimento+". Matricola: "
				+this.matricola+", stipendio mensile di "+this.stipendio+
				" e straordinari pagati "+this.importoOrarioStraordinario+"euro all'ora.");
	}
	
	public Livello promuovi() {
		switch(this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio=Dipendente.stipendioBase*(1.2);
			System.out.println("Dipendente "+this.matricola+" promosso. Nuovo stipendio:1200");
			return this.livello;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio=Dipendente.stipendioBase*(1.5);
			System.out.println("Dipendente "+this.matricola+" promosso. Nuovo stipendio:1500");
			return this.livello;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio=Dipendente.stipendioBase*(2);
			System.out.println("Dipendente "+this.matricola+" promosso. Nuovo stipendio:2000");
			return this.livello;
		case DIRIGENTE:
			System.out.println("ERRORE, NON ESISTE UN LIVELLO SUPERIORE A"
					+ " DIRIGENTE" + " RIMANGO IO IL PADRONE DELLA SITUA");
			return this.livello;
		default:
			System.out.println("ERROR");
			return this.livello;
		}		
	}
		
	public static double calcolaPaga(Dipendente tizio) {
		System.out.println("Stipendio mensile del dipendente "+tizio.livello+" "+tizio.matricola+": "+tizio.stipendio);
		return tizio.getStipendio();
	}
	
	public static double calcolaPagaPlus(Dipendente tizio,int h) {
		double stipendio = tizio.getImportoOrarioStraordinario()*h;
		double newStip = tizio.getStipendio()+stipendio;
		System.out.println("Stipendio mensile con "+h+" ore di straordinario: "+newStip);
		return newStip;
	}

}
