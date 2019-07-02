package model;

public class AssuntoAvalia {

	long codigo_assunto;
	long codigo_avaliacao;

	public AssuntoAvalia(long codigo_assunto, long codigo_avaliacao) {
		super();
		this.codigo_assunto = codigo_assunto;
		this.codigo_avaliacao = codigo_avaliacao;
	}

	public long getCodigo_assunto() {
		return codigo_assunto;
	}

	public void setCodigo_assunto(long codigo_assunto) {
		this.codigo_assunto = codigo_assunto;
	}

	public long getCodigo_avaliacao() {
		return codigo_avaliacao;
	}

	public void setCodigo_avaliacao(long codigo_avaliacao) {
		this.codigo_avaliacao = codigo_avaliacao;
	}

}
