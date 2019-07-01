package model;

public class ItemAlmoxarifado {

	long codigo;
	long id_almoxarifado;
	String corredor;
	String prateleira;
	int qtd_min;
	int qtd_atual;

	public ItemAlmoxarifado(long codigo, long id_almoxarifado, String corredor, String prateleira, int qtd_min, int qtd_atual) {
		super();
		this.codigo = codigo;
		this.id_almoxarifado = id_almoxarifado;
		this.corredor = corredor;
		this.prateleira = prateleira;
		this.qtd_min = qtd_min;
		this.qtd_atual = qtd_atual;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getId_almoxarifado() {
		return id_almoxarifado;
	}

	public void setId_almoxarifado(long id_almoxarifado) {
		this.id_almoxarifado = id_almoxarifado;
	}

	public String getCorredor() {
		return corredor;
	}

	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}

	public String getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(String prateleira) {
		this.prateleira = prateleira;
	}

	public int getQtd_min() {
		return qtd_min;
	}

	public void setQtd_min(int qtd_min) {
		this.qtd_min = qtd_min;
	}

	public int getQtd_atual() {
		return qtd_atual;
	}

	public void setQtd_atual(int qtd_atual) {
		this.qtd_atual = qtd_atual;
	}

}
