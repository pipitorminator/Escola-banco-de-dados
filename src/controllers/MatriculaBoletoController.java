package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Boleto;
import utils.RepositorioBancoDados;

public class MatriculaBoletoController extends RepositorioBancoDados {

	public ArrayList<String> alunos() {
		ArrayList<String> cpfs = new ArrayList<>();
		ResultSet rs = null;
		rs = executarConsulta("select * from aluno_matricula_curso;");
		try {
			while (rs.next()) {
				cpfs.add(rs.getString("codigo") + " - " + rs.getString("cpf"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cpfs;
	}

	public ArrayList<String> boletos(String codigo) {
		ArrayList<String> cpfs = new ArrayList<>();
		ResultSet rs = null;
		rs = executarConsulta("select * from boleto where codigo_matricula = " + codigo + ";");
		try {
			while (rs.next()) {
				cpfs.add(rs.getString("codigo") + " - " + rs.getString("data_emissao"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cpfs;
	}

	public Boleto buscar(String codigo) {
		Boleto boleto = null;
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from boleto where codigo ='" + codigo + "'");
			if (rs.next()) {
				boleto = new Boleto(rs.getLong("codigo"), rs.getString("codigo_do_banco"), rs.getLong("codigo_matricula"), rs.getString("carteira"), rs.getString("data_venc"), "0", rs.getInt("num"), rs.getDouble("valor"), rs.getString("data_emissao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return boleto;
	}

	public void inserir(Boleto b) {
		executarUpdate("insert into boleto(carteira, data_venc,num,valor,data_emissao,codigo_do_banco,codigo_matricula) values('" + b.getCarteira() + "','" + b.getData_venc() + "'," + b.getNumero() + "," + b.getValor() + ",'" + b.getData_emisao() + "','" + b.getCodigo_banco() + "'," + b.getCodigo_matricula() + ");");

	}

	public void deletar(String codigo) {
		executarUpdate("DELETE FROM boleto WHERE codigo='" + codigo + "'");

	}

	public void update(Boleto b) {
		executarUpdate("update boleto set carteira= '" + b.getCarteira() + "', data_venc= '" + b.getData_venc() + "', num=" + b.getNumero() + ", valor=" + b.getValor() + ", data_emissao='" + b.getData_emisao() + "', codigo_do_banco = '" + b.getCodigo_banco() + "' where codigo = '" + b.getCodigo() + "';");
	}

}
