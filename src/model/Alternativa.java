package model;

public class Alternativa {

	long id;
	String letra;
	String descricao;
	boolean eh_altern_correta;
	public Alternativa(long id, String letra, String descricao, boolean eh_altern_correta) {
		super();
		this.id = id;
		this.letra = letra;
		this.descricao = descricao;
		this.eh_altern_correta = eh_altern_correta;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isEh_altern_correta() {
		return eh_altern_correta;
	}
	public void setEh_altern_correta(boolean eh_altern_correta) {
		this.eh_altern_correta = eh_altern_correta;
	}

}
