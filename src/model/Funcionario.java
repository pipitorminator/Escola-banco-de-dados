package model;

public class Funcionario {
	String cpf;
	String cpf_user;
	long id_boni;
	long id_unidade;
	double salario;
	String dt_contratacao;
	String dt_fim_contratacao;

	public Funcionario(String cpf, String cpf_user, long id_boni, long id_unidade, double salario, String dt_contratacao, String dt_fim_contratacao) {
		super();
		this.cpf = cpf;
		this.cpf_user = cpf_user;
		this.id_boni = id_boni;
		this.id_unidade = id_unidade;
		this.salario = salario;
		this.dt_contratacao = dt_contratacao;
		this.dt_fim_contratacao = dt_fim_contratacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf_user() {
		return cpf_user;
	}

	public void setCpf_user(String cpf_user) {
		this.cpf_user = cpf_user;
	}

	public long getId_boni() {
		return id_boni;
	}

	public void setId_boni(long id_boni) {
		this.id_boni = id_boni;
	}

	public long getId_unidade() {
		return id_unidade;
	}

	public void setId_unidade(long id_unidade) {
		this.id_unidade = id_unidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDt_contratacao() {
		return dt_contratacao;
	}

	public void setDt_contratacao(String dt_contratacao) {
		this.dt_contratacao = dt_contratacao;
	}

	public String getDt_fim_contratacao() {
		return dt_fim_contratacao;
	}

	public void setDt_fim_contratacao(String dt_fim_contratacao) {
		this.dt_fim_contratacao = dt_fim_contratacao;
	}

}
