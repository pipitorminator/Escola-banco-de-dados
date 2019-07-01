package model;

public class CandidatoCurso {

	String cpf_candidato;
	long codigo_curso;
	String data;

	public CandidatoCurso(String cpf_candidato, long codigo_curso, String data) {
		super();
		this.cpf_candidato = cpf_candidato;
		this.codigo_curso = codigo_curso;
		this.data = data;
	}

	public String getCpf_candidato() {
		return cpf_candidato;
	}

	public void setCpf_candidato(String cpf_candidato) {
		this.cpf_candidato = cpf_candidato;
	}

	public long getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(long codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
