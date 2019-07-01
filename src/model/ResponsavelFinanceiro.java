package model;

public class ResponsavelFinanceiro {

	String cpf_aluno;
	String nome;
	String parentesco;
	String telefone;
	String email;

	public ResponsavelFinanceiro(String cpf_aluno, String nome, String parentesco, String telefone, String email) {
		super();
		this.cpf_aluno = cpf_aluno;
		this.nome = nome;
		this.parentesco = parentesco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
