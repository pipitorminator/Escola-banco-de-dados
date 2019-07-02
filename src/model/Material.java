package model;

public class Material {
	long id;
	String descricao;
	String url;
	String assunto;
	String tipo;

	public Material(long id, String descricao, String url, String assunto, String tipo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.url = url;
		this.assunto = assunto;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
