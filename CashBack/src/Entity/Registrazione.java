package Entity;

import java.util.ArrayList;

import Stub.StubCartaCredito;
import Stub.StubRegistrazione;

public class Registrazione {

	private String id;
	private String password;
	private CittadinoRegistrato Cittadino;
	public ArrayList<CartaDiCredito> Carte;
	
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Registrazione)) return false;
		
		Registrazione R=(Registrazione) o;
		return ((this.id.equals(R.id)) && (this.password.equals(R.password)));
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public CittadinoRegistrato getCittadino() {
		return Cittadino;
	}

	public void setCittadino(CittadinoRegistrato cittadino) {
		Cittadino = cittadino;
	}

	public ArrayList<CartaDiCredito> getCarte() {
		return Carte;
	}

	public void setCarte(ArrayList<CartaDiCredito> carte) {
		Carte = carte;
	}

	public int Get_acquisti() {
		int acquisti_tot=0;
		for(int i=0;i<this.Carte.size();i++)
		{
			acquisti_tot=acquisti_tot+this.Carte.get(i).Acquisti.size();
		 
		}
		
		return acquisti_tot;
	}

	public float Get_importo() {
		int importo=0;
		for(int i=0;i<this.Carte.size();i++)
		{
			importo+=this.Carte.get(i).Get_importo();
		}
		return importo;
	}

	
	
/*	public Registrazione(String id,String password) {
		this.id=id;
		this.password=password;
		StubRegistrazione R1=new StubRegistrazione(id,password);
		ArrayList Carte= new ArrayList<CartaDiCredito>();
		for(int i=0;i<R1.Carte.size();i++) {
		  CartaDiCredito C= new CartaDiCredito();
		  C.setDataScadenza(R1.Carte.get(i).getDataScadenza());
		  C.setNumero(R1.Carte.get(i).getNumero());
		
		for(int j=0;j<R1.Carte.get(j).Acquisti.size();j++)
		  {
			Acquisto A= new Acquisto();
			A.setData(R1.Carte.get(j).Acquisti.get(j).getData());
			A.setImporto(R1.Carte.get(j).Acquisti.get(j).getImporto());
			A.setCarta(C);
			C.Acquisti.add(A);
		  }
		Carte.add(C);
		 }
		Cittadino.setCF(R1.getCittadino().getCF());
		Cittadino.setCognome(R1.getCittadino().getCognome());
		Cittadino.setEmail(R1.getCittadino().getEmail());
		Cittadino.setNome(R1.getCittadino().getNome());
		
	    }*/
	public Registrazione() {
	
	}
	
	
	

}