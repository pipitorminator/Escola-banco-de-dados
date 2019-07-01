package model;

public class PacoteMatricula {

	long id;
	long codigo_curso;
	String descricao;
	String dt_inicio;
	String taxas_juros_dia;
	String tipo;
	String validade_meses;

	public PacoteMatricula(long id, long codigo_curso, String descricao, String dt_inicio, String taxas_juros_dia, String tipo, String validade_meses) {
		super();
		this.id = id;
		this.codigo_curso = codigo_curso;
		this.descricao = descricao;
		this.dt_inicio = dt_inicio;
		this.taxas_juros_dia = taxas_juros_dia;
		this.tipo = tipo;
		this.validade_meses = validade_meses;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(long codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(String dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public String getTaxas_juros_dia() {
		return taxas_juros_dia;
	}

	public void setTaxas_juros_dia(String taxas_juros_dia) {
		this.taxas_juros_dia = taxas_juros_dia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValidade_meses() {
		return validade_meses;
	}

	public void setValidade_meses(String validade_meses) {
		this.validade_meses = validade_meses;
	}

}
