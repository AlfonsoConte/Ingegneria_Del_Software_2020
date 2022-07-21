package Stub;




public class StubAcquisto {
	private String data;
	private float importo;
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getImporto() {
		return importo;
	}

	public void setImporto(float importo) {
		this.importo = importo;
	}



	public StubAcquisto(String data, float importo) {
		
		this.data =data;
		this.importo = importo;
		
	}

}
