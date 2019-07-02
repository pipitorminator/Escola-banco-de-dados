package model;

public class Filial {

	long cnpj;
	long cnpj_empresa;
	String razao_social;
	String nome_fantasia;

	public Filial(long cnpj, long cnpj_empresa, String razao_social, String nome_fantasia) {
		super();
		this.cnpj = cnpj;
		this.cnpj_empresa = cnpj_empresa;
		this.razao_social = razao_social;
		this.nome_fantasia = nome_fantasia;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public long getCnpj_empresa() {
		return cnpj_empresa;
	}

	public void setCnpj_empresa(long cnpj_empresa) {
		this.cnpj_empresa = cnpj_empresa;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

}
