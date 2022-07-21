package Entity;

public class Acquisto {

	private String data;
	private float importo;
	private CartaDiCredito Carta;
	public String getData() {
		return data;
	}
	
	
	public void setData(String data) {
		this.data = data;
	}
	public float getImporto() {
		return importo;
	}
	public Acquisto() {
		super();
	}


	public void setImporto(float importo) {
		this.importo = importo;
	}
	public Acquisto(String data, float importo, CartaDiCredito carta) {
		super();
		this.data = data;
		this.importo = importo;
		Carta = carta;
	}


	public CartaDiCredito getCarta() {
		return Carta;
	}
	public void setCarta(CartaDiCredito carta) {
		Carta = carta;
	}

}