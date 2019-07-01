package model;

public class Aviso {
	long numero_aviso;
	String cpf_funcionario;
	String assunto;
	String texto;
	String data;
	String validade_dias;

	public Aviso(long numero_aviso, String cpf_funcionario, String assunto, String texto, String data, String validade_dias) {
		super();
		this.numero_aviso = numero_aviso;
		this.cpf_funcionario = cpf_funcionario;
		this.assunto = assunto;
		this.texto = texto;
		this.data = data;
		this.validade_dias = validade_dias;
	}

	public long getNumero_aviso() {
		return numero_aviso;
	}

	public void setNumero_aviso(long numero_aviso) {
		this.numero_aviso = numero_aviso;
	}

	public String getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(String cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getValidade_dias() {
		return validade_dias;
	}

	public void setValidade_dias(String validade_dias) {
		this.validade_dias = validade_dias;
	}

}
