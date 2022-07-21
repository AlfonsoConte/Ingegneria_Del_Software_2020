package Stub;

import java.util.ArrayList;



public class StubRegistrazione {

	private String id;
	private String password;
	private StubCittadinoRegistrato Cittadino;
	public ArrayList<StubCartaCredito> Carte;
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
	public StubCittadinoRegistrato getCittadino() {
		return Cittadino;
	}
	public StubRegistrazione(String id, String password) {
		
		this.id = id;
		this.password = password;
		Carte= new ArrayList<StubCartaCredito>();
		
		if("1234".equals(id) && "1234".equals(password)) {
		
		StubCittadinoRegistrato CR= new StubCittadinoRegistrato("Alfonso","Conte","CNTLNS99","alfon.conte@studenti.unina.it",this);
		Cittadino = CR;
		
		StubCartaCredito C1=new StubCartaCredito(1,"03/23");
		StubCartaCredito C2=new StubCartaCredito(2,"23/27");
		Carte.add(C1);
		Carte.add(C2);
		}
		else if("5678".equals(id) && "5678".equals(password)) {
			
			StubCittadinoRegistrato CR= new StubCittadinoRegistrato("Mario","Rossi","MRROSS87","mario.rossi@live.it",this);
			Cittadino = CR;
			StubCartaCredito C1=new StubCartaCredito(1,"11/25");
			Carte.add(C1);	
		}
		else if("ABCD".equals(id) && "ABCD".equals(password)){
			
			StubCittadinoRegistrato CR= new StubCittadinoRegistrato("Antonio","Bruno","BRNNTA66","antonio.bruno@live.it",this);
			Cittadino = CR;
			StubCartaCredito C1=new StubCartaCredito(1,"11/25");
			StubCartaCredito C2=new StubCartaCredito(2,"03/23");
			Carte.add(C1);
			Carte.add(C2);
		}
		else {
			StubCittadinoRegistrato CR= new StubCittadinoRegistrato("Ciro","Esposito","STOCRO99","ciro.esposito@live.it",this);
			Cittadino = CR;
			StubCartaCredito C1=new StubCartaCredito(3,"01/22");
			StubCartaCredito C2=new StubCartaCredito(4,"05/29");
			Carte.add(C1);
			Carte.add(C2);
			
		}
	}
	
	
} // fine class
