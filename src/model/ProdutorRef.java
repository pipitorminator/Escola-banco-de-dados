package model;

public class ProdutorRef {

	long codigo;
	String descricao;
	String unidade;
	String cod_barras;
	double preco_unit;
	String marca;
	String tipo;

	public ProdutorRef(long codigo, String descricao, String unidade, String cod_barras, double preco_unit, String marca, String tipo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.cod_barras = cod_barras;
		this.preco_unit = preco_unit;
		this.marca = marca;
		this.tipo = tipo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getCod_barras() {
		return cod_barras;
	}

	public void setCod_barras(String cod_barras) {
		this.cod_barras = cod_barras;
	}

	public double getPreco_unit() {
		return preco_unit;
	}

	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
