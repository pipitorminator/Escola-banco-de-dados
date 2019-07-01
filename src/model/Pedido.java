package model;

public class Pedido {

	long codigo;
	String cpf_funcionario;
	String data;
	String dt_atend;
	String status;

	public Pedido(long codigo, String cpf_funcionario, String data, String dt_atend, String status) {
		super();
		this.codigo = codigo;
		this.cpf_funcionario = cpf_funcionario;
		this.data = data;
		this.dt_atend = dt_atend;
		this.status = status;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(String cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDt_atend() {
		return dt_atend;
	}

	public void setDt_atend(String dt_atend) {
		this.dt_atend = dt_atend;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
