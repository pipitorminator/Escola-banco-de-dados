package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Boleto;
import utils.RepositorioBancoDados;

public class BoletoController extends RepositorioBancoDados {

	public void inserir(Boleto b) {
		executarUpdate("insert into boleto(carteira, data_venc,num,valor,data_emissao,codigo_do_banco,codigo_matricula) values('" + b.getCarteira() + "','" + b.getData_venc() + "'," + b.getNumero() + "," + b.getValor() + ",'" + b.getData_emisao() + "','" + b.getCodigo_banco() + "'," + b.getCodigo_matricula() + ");");

	}

	public Boleto buscar(String codigo_matricula) {
		Boleto boleto = null;
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from boleto where codigo_matricula ='" + codigo_matricula + "'");
			if (rs.next()) {
				boleto = new Boleto(1L, rs.getString("codigo_do_banco"), rs.getLong("codigo_matricula"), rs.getString("carteira"), rs.getString("data_venc"), "0", rs.getInt("num"), rs.getDouble("valor"), rs.getString("data_emissao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return boleto;
	}

}
