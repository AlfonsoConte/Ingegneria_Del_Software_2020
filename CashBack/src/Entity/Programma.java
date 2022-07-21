package Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import Stub.StubProgramma;

public class Programma {

	private int codice;
	private String dataInizio;
	private String dataFine;
	private int numOperazioni;
	private int rimborso;
	private int tetto;
	private ArrayList<Registrazione> Registrazioni=new ArrayList<Registrazione>();
	private ArrayList<Rimborso> Rimborsi=new ArrayList<Rimborso>();
	
	
	public boolean equals(Object o) {
		
		if(o==this) {
			return true;
		}
		
		if(!(o instanceof Programma)) {
			return false;
		}
		Programma P=(Programma) o;
		return this.codice==(P.codice);
		
	}
	public Programma() {
		
	}
	
	
	public int getCodice() {
		return codice;
	}


	public void setCodice(int codice) {
		this.codice = codice;
	}


	public String getDataInizio() {
		return dataInizio;
	}


	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}


	public String getDataFine() {
		return dataFine;
	}


	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}


	public int getNumOperazioni() {
		return numOperazioni;
	}


	public void setNumOperazioni(int numOperazioni) {
		this.numOperazioni = numOperazioni;
	}


	public int getRimborso() {
		return rimborso;
	}


	public void setRimborso(int rimborso) {
		this.rimborso = rimborso;
	}


	public int getTetto() {
		return tetto;
	}


	public void setTetto(int tetto) {
		this.tetto = tetto;
	}


	public ArrayList<Registrazione> getRegistrazioni() {
		return Registrazioni;
	}


	public void setRegistrazioni(ArrayList<Registrazione> registrazioni) {
		Registrazioni = registrazioni;
	}


	public ArrayList<Rimborso> getRimborsi() {
		return Rimborsi;
	}


	public void setRimborsi(ArrayList<Rimborso> rimborsi) {
		Rimborsi = rimborsi;
	}


	public Registrazione ricercaRegistrazione(String id, String password) {
		Registrazione R= new Registrazione();
		R.setId(id);
		R.setPassword(password);
		int posizione=this.Registrazioni.indexOf(R);
		if(posizione==-1) return null;
		else return Registrazioni.get(posizione);
	}

	
	public float calcolaRimborso(Registrazione Registr) {
		float totale=0;
	 
			totale=Registr.Get_importo();
			if(this.AggiornaImporto(totale)>this.tetto) return this.tetto;
			else return(this.AggiornaImporto(totale));
		}


	public Rimborso creaRimborso(float importo,Programma programma) {
		Rimborso R=new Rimborso(importo,programma);
		this.AssociaRimborso(R);
		return R;
		
	}
    public void AssociaRimborso(Rimborso rimborso) {
    	this.Rimborsi.add(rimborso);    	
    	
    }
	public boolean verificaData() {
		
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal  = Calendar.getInstance();
			try {
				cal.setTime(df.parse(this.dataFine));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Calendar today = Calendar.getInstance();
			if(today.compareTo(cal)>0) return true;
			
		    else  return false;	
	}

	public float AggiornaImporto(float tot) {
		
		return((tot*this.rimborso/100));
		
	}

	

	public Programma(int codice, String dataInizio, String dataFine, int numOperazioni, int rimborso, int tetto) {
		
			
		this.codice = codice;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.numOperazioni = numOperazioni;
		this.rimborso = rimborso;
		this.tetto = tetto;
		
		StubProgramma P=new StubProgramma(codice,dataInizio,dataFine,numOperazioni,rimborso,tetto);
		
		for(int i=0;i<P.Registrazioni.size();i++) {
			Registrazione R=new Registrazione();
			
			R.setId(P.Registrazioni.get(i).getId());
			R.setPassword(P.Registrazioni.get(i).getPassword());
			
			CittadinoRegistrato CR=new CittadinoRegistrato();
			CR.setCF(P.Registrazioni.get(i).getCittadino().getCF());
			CR.setNome(P.Registrazioni.get(i).getCittadino().getNome());
			CR.setCognome(P.Registrazioni.get(i).getCittadino().getCognome());
			CR.setEmail(P.Registrazioni.get(i).getCittadino().getEmail());
			R.setCittadino(CR);
			R.Carte = new ArrayList<CartaDiCredito>();
			for(int j=0;j<P.Registrazioni.get(i).Carte.size();j++)
			{
				CartaDiCredito C=new CartaDiCredito();
				C.setNumero(P.Registrazioni.get(i).Carte.get(j).getNumero());
				C.setDataScadenza(P.Registrazioni.get(i).Carte.get(j).getDataScadenza());
				//C.Acquisti=new ArrayList<Acquisto>();
				 for(int k=0;k<P.Registrazioni.get(i).Carte.get(j).Acquisti.size();k++)
				 {
					 Acquisto A=new Acquisto();
					 A.setCarta(C);
					 A.setData(P.Registrazioni.get(i).Carte.get(j).Acquisti.get(k).getData());
					 A.setImporto(P.Registrazioni.get(i).Carte.get(j).Acquisti.get(k).getImporto());
					 C.Acquisti.add(A);
				 }
				R.Carte.add(C);
			}
			
			
			Registrazioni.add(R);
			
		  }
		
		
		}
		
		
		
	}
	
	

	
	
	

