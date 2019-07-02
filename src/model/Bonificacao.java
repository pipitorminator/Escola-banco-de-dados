package model;

public class Bonificacao {

	long id;
	double valor;
	String data;
	String descricao;

	public Bonificacao(long id, double valor, String data, String descricao) {
		super();
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
