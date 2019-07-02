package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.RepositorioBancoDados;

public class DisciplinaController extends RepositorioBancoDados {

	public ArrayList<String> buscar(String cpf)  {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select d.nome from disciplina d join oferta_disciplina o where o.id_disciplina = d.id and o.cpf = '" + cpf + "';");
		
		try {
			while(rs.next()) {
				list.add(rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
