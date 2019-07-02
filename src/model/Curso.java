package model;

public class Curso {

	long codigo;
	long id_unidade;
	String cpf_adm;
	String nome;
	String data_criacao;
	String horario_funcionamento;

	public Curso(long codigo, long id_unidade, String cpf_adm, String nome, String data_criacao, String horario_funcionamento) {
		super();
		this.codigo = codigo;
		this.id_unidade = id_unidade;
		this.cpf_adm = cpf_adm;
		this.nome = nome;
		this.data_criacao = data_criacao;
		this.horario_funcionamento = horario_funcionamento;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getId_unidade() {
		return id_unidade;
	}

	public void setId_unidade(long id_unidade) {
		this.id_unidade = id_unidade;
	}

	public String getCpf_adm() {
		return cpf_adm;
	}

	public void setCpf_adm(String cpf_adm) {
		this.cpf_adm = cpf_adm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}

	public String getHorario_funcionamento() {
		return horario_funcionamento;
	}

	public void setHorario_funcionamento(String horario_funcionamento) {
		this.horario_funcionamento = horario_funcionamento;
	}

}
