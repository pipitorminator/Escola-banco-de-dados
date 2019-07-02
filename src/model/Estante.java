package model;

public class Estante {

	String corredor;
	String prateleira;

	public Estante(String corredor, String prateleira) {
		super();
		this.corredor = corredor;
		this.prateleira = prateleira;
	}

	public String getCorredor() {
		return corredor;
	}

	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}

	public String getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(String prateleira) {
		this.prateleira = prateleira;
	}

}
