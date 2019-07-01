package model;

public class CandidatoVestibular {

	String cpf;
	String cpf_candidato;
	long codigo_vestibular;
	String data;
	double nota;
	String situacao;

	public CandidatoVestibular(String cpf, String cpf_candidato, long codigo_vestibular, String data, double nota, String situacao) {
		super();
		this.cpf = cpf;
		this.cpf_candidato = cpf_candidato;
		this.codigo_vestibular = codigo_vestibular;
		this.data = data;
		this.nota = nota;
		this.situacao = situacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf_candidato() {
		return cpf_candidato;
	}

	public void setCpf_candidato(String cpf_candidato) {
		this.cpf_candidato = cpf_candidato;
	}

	public long getCodigo_vestibular() {
		return codigo_vestibular;
	}

	public void setCodigo_vestibular(long codigo_vestibular) {
		this.codigo_vestibular = codigo_vestibular;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
