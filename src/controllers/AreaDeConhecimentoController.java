package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AreaDeConhecimento;
import utils.RepositorioBancoDados;

public class AreaDeConhecimentoController extends RepositorioBancoDados {

	public void inserir(AreaDeConhecimento areaDeConhecimento) {
		executarUpdate("insert into area_conhecimento(descricao, cod) values ('" + areaDeConhecimento.getDescricao() + "'," + areaDeConhecimento.getCodigo_assunto() + ");");
	}

	public AreaDeConhecimento buscar(String codigo) {
		AreaDeConhecimento areaDeConhecimento = null;
		ResultSet rs = null;
		rs = executarConsulta("select * from area_conhecimento where codigo=" + codigo + "");
		try {
			if (rs.next()) {
				areaDeConhecimento = new AreaDeConhecimento(rs.getLong("codigo"), rs.getLong("cod"), rs.getString("descricao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return areaDeConhecimento;

	}

	public void update(AreaDeConhecimento areaDeConhecimento) {

		executarUpdate("update area_conhecimento set descricao = '" + areaDeConhecimento.getDescricao() + "', cod=" + areaDeConhecimento.getCodigo_assunto() + " where codigo = " + areaDeConhecimento.getCodigo() + "");

	}

	public void deletar(String codigo) {
		executarUpdate("delete from area_conhecimento where codigo= " + codigo + "");
	}
	
	public ArrayList<String> buscarAll() {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from assunto;");

		try {
			while (rs.next()) {
				list.add(rs.getString("cod") + " - " + rs.getString("descricao"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
