package Entity;

import java.util.ArrayList;

import Stub.StubCartaCredito;
import Stub.StubCittadinoRegistrato;
import Stub.StubRegistrazione;



public class CartaDiCredito {

	private int numero;
	private String dataScadenza;
	public ArrayList<Acquisto> Acquisti=new ArrayList<Acquisto>();

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
	
	public float Get_importo()
	{	float importo=0;
	
		for(int i=0;i<this.Acquisti.size();i++)
		{
			importo+=this.Acquisti.get(i).getImporto();
		}
		return importo;
	}

	public CartaDiCredito() {
		super();
	}

	public ArrayList<Acquisto> getAcquisti() {
		return Acquisti;
	}

	public void setAcquisti(ArrayList<Acquisto> acquisti) {
		Acquisti = acquisti;
	}

	public int Get_acquisti() {
		// TODO - implement CartaDiCredito.Get_acquisti
		throw new UnsupportedOperationException();
	}


	
	/*CartaDiCredito(int numero,String dataScadenza){
		StubCartaCredito SC1=new StubCartaCredito(numero,dataScadenza);
		this.numero=SC1.getNumero();
		this.dataScadenza=SC1.getDataScadenza();
		//Acquisti=new ArrayList<Acquisto>();
		
		for(int i=0;i<SC1.Acquisti.size();i++) {
			Acquisto A1= new Acquisto();
			A1.setImporto(SC1.Acquisti.get(i).getImporto());
			A1.setData(SC1.Acquisti.get(i).getData());
			Acquisti.add(A1);
		}*/
	
	
	

} //end class