package Entity;

import java.util.ArrayList;
import java.lang.NumberFormatException;

public class ElencoProgrammi {
	private ArrayList<Programma> Programmi;


	public Programma RicercaProgramma(int Codice){
		
		Programma P1=new Programma();
		P1.setCodice(Codice);
		int posizione;
		posizione=this.Programmi.indexOf(P1);
		if(posizione==-1) return null;
		else return Programmi.get(posizione);
		
		
	}

	
	public Rimborso RichiediRimborso(int Codice, String id, String password) {
		Programma programma; //DA incorporare a quello dopo.
		
		programma=this.RicercaProgramma(Codice);
		Registrazione registrazione;
		registrazione=programma.ricercaRegistrazione(id, password); //Da incorporare
		float rimb=programma.calcolaRimborso(registrazione);
		Rimborso R1=programma.creaRimborso(rimb,programma);
		CittadinoRegistrato Citt= new CittadinoRegistrato();
		Citt=registrazione.getCittadino();
		Citt.AssociaRimborso(R1);
		R1.associaCittadino(Citt);
		return R1;
		
	}


	public String VerificaRimborso(int Codice, String id, String password) {
		
		Programma programma;
		String Risposta=null;
		
		programma=this.RicercaProgramma(Codice);
	
		if(programma==null) Risposta="Programma non Trovato";
		else {
			 Registrazione registrazione;
			 registrazione=programma.ricercaRegistrazione(id, password);
			 if(registrazione==null) Risposta= "Registrazione non Trovata";
			 else {
				 if(!programma.verificaData())Risposta="Programma ancora in corso";
				 else {
					 if(!this.Verifica_operazioni(registrazione, programma)) Risposta="Numero Acquisti non sufficiente";
				
				 }
			 }
		}
		
		return Risposta;
	}
	
	public boolean Verifica_operazioni(Registrazione R,Programma P) {
		
		
		if (R.Get_acquisti()>=P.getNumOperazioni())return true;
		else return false;
		
	}



	public ElencoProgrammi() {
		Programmi=new ArrayList<Programma>();
		Programma P1=new Programma(1,"10/06/2018","01/09/2020",3,10,150);
		Programma P2=new Programma(2,"02/02/2020","20/12/2020",5,15,200);
		this.Programmi.add(P2);
		this.Programmi.add(P1);
	}
	
}