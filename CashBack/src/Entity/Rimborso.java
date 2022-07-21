package Entity;

public class Rimborso {

	private float importo;
	private Programma Prog;
	private CittadinoRegistrato Cittadino;
	
	public float getImporto() {
		return importo;
	}

	public void setImporto(float importo) {
		this.importo = importo;
	}

	public Rimborso(float importo,Programma programma) {
		super();
		this.importo = importo;
		this.Prog=programma;
		programma.AssociaRimborso(this);
	}
	
	public Rimborso() {
		super();
	}

	public void associaCittadino(CittadinoRegistrato citt) {
		
		this.Cittadino=citt;
	}
	
}