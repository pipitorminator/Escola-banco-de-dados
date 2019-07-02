package model;

public class AlunoOfertaDisciplina {

	long id_disciplina;
	long id_periodo;
	String cpf_aluno;
	String data_matricula;
	double media_final;
	public AlunoOfertaDisciplina(long id_disciplina, long id_periodo, String cpf_aluno, String data_matricula, double media_final) {
		super();
		this.id_disciplina = id_disciplina;
		this.id_periodo = id_periodo;
		this.cpf_aluno = cpf_aluno;
		this.data_matricula = data_matricula;
		this.media_final = media_final;
	}
	public long getId_disciplina() {
		return id_disciplina;
	}
	public void setId_disciplina(long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}
	public long getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(long id_periodo) {
		this.id_periodo = id_periodo;
	}
	public String getCpf_aluno() {
		return cpf_aluno;
	}
	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}
	public String getData_matricula() {
		return data_matricula;
	}
	public void setData_matricula(String data_matricula) {
		this.data_matricula = data_matricula;
	}
	public double getMedia_final() {
		return media_final;
	}
	public void setMedia_final(double media_final) {
		this.media_final = media_final;
	}
	
	
}
