package model;

public class AlunoAvaliacaoOfertaDisciplina {

	long id_disciplina;
	String cpf_aluno;
	long id_periodo;
	long codigo_avaliacao;
	double nota;

	public AlunoAvaliacaoOfertaDisciplina(long id_disciplina, String cpf_aluno, long id_periodo, long codigo_avaliacao, double nota) {
		super();
		this.id_disciplina = id_disciplina;
		this.cpf_aluno = cpf_aluno;
		this.id_periodo = id_periodo;
		this.codigo_avaliacao = codigo_avaliacao;
		this.nota = nota;
	}

	public long getId_disciplina() {
		return id_disciplina;
	}

	public void setId_disciplina(long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}

	public String getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public long getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(long id_periodo) {
		this.id_periodo = id_periodo;
	}

	public long getCodigo_avaliacao() {
		return codigo_avaliacao;
	}

	public void setCodigo_avaliacao(long codigo_avaliacao) {
		this.codigo_avaliacao = codigo_avaliacao;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
