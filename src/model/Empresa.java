package model;

public class Empresa {

	long cnpj;
	String razao_social;

	public Empresa(long cnpj, String razao_social) {
		super();
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

}
