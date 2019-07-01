package model;

public class Avaliacao {

	long codigo;
	int numero_questoes;
	String obs;
	String status;
	String tipo;

	public Avaliacao(long codigo, int numero_questoes, String obs, String status, String tipo) {
		super();
		this.codigo = codigo;
		this.numero_questoes = numero_questoes;
		this.obs = obs;
		this.status = status;
		this.tipo = tipo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public int getNumero_questoes() {
		return numero_questoes;
	}

	public void setNumero_questoes(int numero_questoes) {
		this.numero_questoes = numero_questoes;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
