package model;

public class Unidade {

	long id;
	long cnpj_filial;
	String tipo;
	String nome;

	public Unidade(long id, long cnpj_filial, String tipo, String nome) {
		super();
		this.id = id;
		this.cnpj_filial = cnpj_filial;
		this.tipo = tipo;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCnpj_filial() {
		return cnpj_filial;
	}

	public void setCnpj_filial(long cnpj_filial) {
		this.cnpj_filial = cnpj_filial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
