package Stub;

import java.util.ArrayList;
public class StubProgramma {
	private int codice;
	private String DataInizio;
	private String DataFine;
	private int numOperazioni;
	private int rimborso;
	private int tetto;
public ArrayList<StubRegistrazione> Registrazioni;	

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDataInizio() {
		return DataInizio;
	}

	public StubProgramma(int codice, String dataInizio, String dataFine, int numOperazioni, int rimborso, int tetto) {
		
		this.codice = codice;
		DataInizio = dataInizio;
		DataFine = dataFine;
		this.numOperazioni = numOperazioni;
		this.rimborso = rimborso;
		this.tetto = tetto;
		Registrazioni=new ArrayList<StubRegistrazione>();
		
		if(codice==1) {
		//StubCittadinoRegistrato C1= new StubCittadinoRegistrato("Mario","Rossi","MRSS9","mario.rossi@live.it");
		//StubCittadinoRegistrato C2= new StubCittadinoRegistrato("Alfonso","Conte","CNTLNS99","alfon.conte@studenti.unina.it");
		StubRegistrazione R1 =new StubRegistrazione("1234","1234");
		StubRegistrazione R2 =new StubRegistrazione("5678","5678");
		Registrazioni.add(R1);
		Registrazioni.add(R2);
	}
		else {
			
			
			//StubCittadinoRegistrato C1= new StubCittadinoRegistrato("Mario","Rossi","MRSS9","mario.rossi@live.it");
			//StubCittadinoRegistrato C2= new StubCittadinoRegistrato("Alfonso","Conte","CNTLNS99","alfon.conte@studenti.unina.it");
			StubRegistrazione R3 =new StubRegistrazione("ABCD","ABCD");
			StubRegistrazione R4 =new StubRegistrazione("EFGH","EFGH");
			Registrazioni.add(R3);
			Registrazioni.add(R4);
		}
	}
	public void setDataInizio(String dataInizio) {
		DataInizio = dataInizio;
	}

	public String getDataFine() {
		return DataFine;
	}

	public void setDataFine(String dataFine) {
		DataFine = dataFine;
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

	
	

	
	
	

}// end class
