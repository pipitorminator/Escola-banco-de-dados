package model;

public class AvaliacaoQuestao {

	long codigo_avaliacao;
	long id_questao;

	public AvaliacaoQuestao(long codigo_avaliacao, long id_questao) {
		super();
		this.codigo_avaliacao = codigo_avaliacao;
		this.id_questao = id_questao;
	}

	public long getCodigo_avaliacao() {
		return codigo_avaliacao;
	}

	public void setCodigo_avaliacao(long codigo_avaliacao) {
		this.codigo_avaliacao = codigo_avaliacao;
	}

	public long getId_questao() {
		return id_questao;
	}

	public void setId_questao(long id_questao) {
		this.id_questao = id_questao;
	}

}
