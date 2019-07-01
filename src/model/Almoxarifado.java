package model;

public class Almoxarifado {

	long id;
	String cpf_secretaria;
	String local;
	int numero_de_itens;
	String descricao;
	String tipo;

	public Almoxarifado(long id, String cpf_secretaria, String local, int numero_de_itens, String descricao, String tipo) {
		super();
		this.id = id;
		this.cpf_secretaria = cpf_secretaria;
		this.local = local;
		this.numero_de_itens = numero_de_itens;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf_secretaria() {
		return cpf_secretaria;
	}

	public void setCpf_secretaria(String cpf_secretaria) {
		this.cpf_secretaria = cpf_secretaria;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getNumero_de_itens() {
		return numero_de_itens;
	}

	public void setNumero_de_itens(int numero_de_itens) {
		this.numero_de_itens = numero_de_itens;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
