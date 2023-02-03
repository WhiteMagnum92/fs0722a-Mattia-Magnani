package esercitazione4;

public class MainGestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente op1 = new Dipendente("mat:111",Dipartimento.PRODUZIONE);
		Dipendente op2 = new Dipendente("mat:222",Dipartimento.PRODUZIONE);
		Dipendente imp = new Dipendente("mat:333", 1200,40,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
		Dipendente dir = new Dipendente("mat:666", 2200,50,Livello.DIRIGENTE,Dipartimento.VENDITE);
		
		System.out.println(" ");
		op1.promuovi();
		imp.promuovi();
		System.out.println(" ");
		op1.stampaDatiDipendente();
		op2.stampaDatiDipendente();
		imp.stampaDatiDipendente();
		dir.stampaDatiDipendente();
		System.out.println(" ");
		Dipendente.calcolaPagaPlus(op1, 5);
		Dipendente.calcolaPagaPlus(op2, 5);
		Dipendente.calcolaPagaPlus(imp, 5);
		Dipendente.calcolaPagaPlus(dir, 5);

	}

}
