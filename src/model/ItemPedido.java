package model;

public class ItemPedido {

	long codigo_produto;
	long codigo_pedido;
	int qtd_solicitada;

	public ItemPedido(long codigo_produto, long codigo_pedido, int qtd_solicitada) {
		super();
		this.codigo_produto = codigo_produto;
		this.codigo_pedido = codigo_pedido;
		this.qtd_solicitada = qtd_solicitada;
	}

	public long getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(long codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public long getCodigo_pedido() {
		return codigo_pedido;
	}

	public void setCodigo_pedido(long codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}

	public int getQtd_solicitada() {
		return qtd_solicitada;
	}

	public void setQtd_solicitada(int qtd_solicitada) {
		this.qtd_solicitada = qtd_solicitada;
	}

}
