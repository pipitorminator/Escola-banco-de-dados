package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Boleto;
import utils.RepositorioBancoDados;

public class BoletoController extends RepositorioBancoDados {

	public void inserir(Boleto b) {
		executarUpdate("insert into boleto(carteira, data_venc,num,valor,data_emissao,codigo_do_banco,codigo_matricula) values('" + b.getCarteira() + "','" + b.getData_venc() + "'," + b.getNumero() + "," + b.getValor() + ",'" + b.getData_emisao() + "','" + b.getCodigo_banco() + "'," + b.getCodigo_matricula() + ");");

	}

	public Boleto buscar(String codigo) {
		Boleto boleto = null;
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from boleto where codigo ='" + codigo + "'");
			if (rs.next()) {
				boleto = new Boleto(1L, rs.getString("codigo_do_banco"), rs.getLong("codigo_matricula"), rs.getString("carteira"), rs.getString("data_venc"), "0", rs.getInt("num"), rs.getDouble("valor"), rs.getString("data_emissao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return boleto;
	}

	public void deletar(String codigo) {
		executarUpdate("DELETE FROM boleto WHERE codigo='" + codigo + "'");

	}

	public void update(Boleto b) {

		executarUpdate("update boleto set carteira= '" + b.getCarteira() + "', data_venc= '" + b.getData_venc() + "', num=" + b.getNumero() + ", valor=" + b.getValor() + ", data_emissao='" + b.getData_emisao() + "', codigo_do_banco = '" + b.getCodigo_banco() + "' where codigo = '" + b.getCodigo() + "';");
	}

}
