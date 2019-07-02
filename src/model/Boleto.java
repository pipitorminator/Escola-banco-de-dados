package model;

public class Boleto {

	long codigo;
	String codigo_banco;
	long codigo_matricula;
	String carteira;
	String data_venc;
	String status;
	int numero;
	double valor;
	String data_emisao;

	public Boleto(long codigo, String codigo_banco, long codigo_matricula, String carteira, String data_venc, String status, int numero, double valor, String data_emisao) {
		super();
		this.codigo = codigo;
		this.codigo_banco = codigo_banco;
		this.codigo_matricula = codigo_matricula;
		this.carteira = carteira;
		this.data_venc = data_venc;
		this.status = status;
		this.numero = numero;
		this.valor = valor;
		this.data_emisao = data_emisao;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCodigo_banco() {
		return codigo_banco;
	}

	public void setCodigo_banco(String codigo_banco) {
		this.codigo_banco = codigo_banco;
	}

	public long getCodigo_matricula() {
		return codigo_matricula;
	}

	public void setCodigo_matricula(long codigo_matricula) {
		this.codigo_matricula = codigo_matricula;
	}

	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public String getData_venc() {
		return data_venc;
	}

	public void setData_venc(String data_venc) {
		this.data_venc = data_venc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData_emisao() {
		return data_emisao;
	}

	public void setData_emisao(String data_emisao) {
		this.data_emisao = data_emisao;
	}

}
