package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.ProdutorRef;
import utils.RepositorioBancoDados;

public class ProdutoController extends RepositorioBancoDados {

	public void cadastrar(ProdutorRef produto) {
		executarUpdate("insert into produto_ref(descricao, unidade,cod_barra,marca, tipo, preco_unit) values('" + produto.getDescricao() + "'," + produto.getUnidade() + ",'" + produto.getCod_barras() + "','" + produto.getMarca() + "','" + produto.getTipo() + "','" + produto.getPreco_unit() + "');");

	}

	public ProdutorRef buscar(String codigobarras) {
		ProdutorRef produto = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("SELECT * FROM produto_ref WHERE cod_barra = '" + codigobarras + "'");

			if (rs.next()) {
				produto = new ProdutorRef(rs.getLong("cod"), rs.getString("descricao"), rs.getString("unidade"), rs.getString("cod_barra"), rs.getDouble("preco_unit"), rs.getString("marca"), rs.getString("tipo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
		return produto;

	}
	
	public void remover(String codigobarra) {
		executarUpdate("DELETE FROM produto_ref WHERE cod_barra = '" + codigobarra + "'");
	}
}
