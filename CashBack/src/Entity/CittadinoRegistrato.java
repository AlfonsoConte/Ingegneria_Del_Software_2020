package Entity;

import java.util.ArrayList;

public class CittadinoRegistrato {

	private String nome;
	private String cognome;
	private String CF;
	private String email;
	private ArrayList<Rimborso> Rimborsi=new ArrayList<Rimborso>();
	private ArrayList<Registrazione> Registrazioni;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public CittadinoRegistrato() {
		super();
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
	public ArrayList<Rimborso> getRimborsi() {
		return Rimborsi;
	}
	public void setRimborsi(ArrayList<Rimborso> rimborsi) {
		Rimborsi = rimborsi;
	}
	public ArrayList<Registrazione> getRegistrazioni() {
		return Registrazioni;
	}
	public void setRegistrazioni(ArrayList<Registrazione> registrazioni) {
		Registrazioni = registrazioni;
	}
	public void AssociaRimborso(Rimborso rimborso) {
		this.Rimborsi.add(rimborso);
	}

}