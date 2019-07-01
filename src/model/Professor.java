package model;

public class Professor {

	String cpf;
	String cpf_funcionario;

	public Professor(String cpf, String cpf_funcionario) {
		super();
		this.cpf = cpf;
		this.cpf_funcionario = cpf_funcionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(String cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

}
