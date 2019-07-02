package model;

public class Assunto {

	long codigo;
	long codigo_assunto;
	String descricao;

	public Assunto(long codigo, long codigo_assunto, String descricao) {
		super();
		this.codigo = codigo;
		this.codigo_assunto = codigo_assunto;
		this.descricao = descricao;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getCodigo_assunto() {
		return codigo_assunto;
	}

	public void setCodigo_assunto(long codigo_assunto) {
		this.codigo_assunto = codigo_assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
