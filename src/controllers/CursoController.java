package controllers;

import java.sql.ResultSet;
import java.util.ArrayList;

import utils.RepositorioBancoDados;

public class CursoController extends RepositorioBancoDados {

	public ArrayList<String> todosCursos() {
		ArrayList<String> cursos = new ArrayList<>();
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from curso");
			while (rs.next()) {
				cursos.add(rs.getString("codigo") + " - " + rs.getString("nome"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return cursos;
	}

}
