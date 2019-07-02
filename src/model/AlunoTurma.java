package model;

public class AlunoTurma {

	String cpf_aluno;
	long codigo_turma;

	public AlunoTurma(String cpf_aluno, long codigo_turma) {
		super();
		this.cpf_aluno = cpf_aluno;
		this.codigo_turma = codigo_turma;
	}

	public String getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public long getCodigo_turma() {
		return codigo_turma;
	}

	public void setCodigo_turma(long codigo_turma) {
		this.codigo_turma = codigo_turma;
	}

}
