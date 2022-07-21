package Stub;


import java.util.ArrayList;



public class StubCartaCredito {

	private int numero;
	private String dataScadenza;
	public ArrayList<StubAcquisto> Acquisti=new ArrayList<StubAcquisto>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	public StubCartaCredito(int numero, String dataScadenza) {
		if(numero==1) {
		this.numero = 1;
		this.dataScadenza = dataScadenza;
		//Acquisti= new ArrayList<StubAcquisto>();
		StubAcquisto A1= new StubAcquisto("12/03/2020",17);
		StubAcquisto A2= new StubAcquisto("22/07/2020",43);
		StubAcquisto A3= new StubAcquisto("01/12/2020",27);
		Acquisti.add(A1);
		Acquisti.add(A2);
		Acquisti.add(A3);
		}
	
		if(numero==2) {
		this.numero = 2;
		this.dataScadenza = dataScadenza;
		//Acquisti= new ArrayList<StubAcquisto>();
		StubAcquisto B1= new StubAcquisto("01/01/2019",15);
		StubAcquisto B2= new StubAcquisto("10/10/2020",3);
		StubAcquisto B3= new StubAcquisto("31/12/2020",200);
		StubAcquisto B4= new StubAcquisto("18/06/2020",150);
		Acquisti.add(B1);
		Acquisti.add(B2);
		Acquisti.add(B3);
		Acquisti.add(B4);
		}
		if(numero==3) {
			this.numero = 3;
			this.dataScadenza = dataScadenza;
			//Acquisti= new ArrayList<StubAcquisto>();
			StubAcquisto C1= new StubAcquisto("03/06/2020",250);
			StubAcquisto C2= new StubAcquisto("10/12/2020",10);
			StubAcquisto C3= new StubAcquisto("03/06/2019",30);
			StubAcquisto C4= new StubAcquisto("16/06/2019",80);
			this.Acquisti.add(C1);
			this.Acquisti.add(C2);
			this.Acquisti.add(C3);
			this.Acquisti.add(C4);
			}
		 if(numero==4){
			this.numero=numero;
			this.dataScadenza= dataScadenza;
			StubAcquisto C7 = new StubAcquisto("12/04/2019",20);
			StubAcquisto C8 = new StubAcquisto("07/07/2019",50);
			Acquisti.add(C7);
			Acquisti.add(C8);
		}
}
	
}	
