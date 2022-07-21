package Stub;

import java.util.ArrayList;



public class StubCittadinoRegistrato {
	private String nome;
	private String cognome;
	private String CF;
	private String email;
	//public ArrayList<StubRimborso> Rimborsi=new ArrayList;
	public ArrayList<StubRegistrazione> Registrazioni;

	//public Object clone() {
		//StubCittadinoRegistrato Cr1= new StubCittadinoRegistrato(this.nome,this.cognome,this.CF,this.email);
	//	return Cr1;
	//}

	public StubCittadinoRegistrato(String nome, String cognome, String cF, String email,StubRegistrazione R) {
		//Rimborsi = new ArrayList<StubRimborso>();
		this.nome = nome;
		this.cognome = cognome;
		CF = cF;
		this.email = email;
		Registrazioni = new ArrayList<StubRegistrazione>();
		Registrazioni.add(R);
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
