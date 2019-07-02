package model;

public class RedesSociais {

	long codigo;
	long id_curso;
	String cpf_funcionario;
	String url;
	String descricao;

	public RedesSociais(long codigo, long id_curso, String cpf_funcionario, String url, String descricao) {
		super();
		this.codigo = codigo;
		this.id_curso = id_curso;
		this.cpf_funcionario = cpf_funcionario;
		this.url = url;
		this.descricao = descricao;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getId_curso() {
		return id_curso;
	}

	public void setId_curso(long id_curso) {
		this.id_curso = id_curso;
	}

	public String getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(String cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
