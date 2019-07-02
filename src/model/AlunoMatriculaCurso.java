package model;

public class AlunoMatriculaCurso {

	long codigo;
	long codigo_curso;
	String cpf_aluno;
	String data_inicio;
	String data_fim;
	String status;
	String doc_contrato;
	String obs;

	public AlunoMatriculaCurso(long codigo, long codigo_curso, String cpf_aluno, String data_inicio, String data_fim, String status, String doc_contrato, String obs) {
		super();
		this.codigo = codigo;
		this.codigo_curso = codigo_curso;
		this.cpf_aluno = cpf_aluno;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.status = status;
		this.doc_contrato = doc_contrato;
		this.obs = obs;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(long codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public String getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoc_contrato() {
		return doc_contrato;
	}

	public void setDoc_contrato(String doc_contrato) {
		this.doc_contrato = doc_contrato;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
