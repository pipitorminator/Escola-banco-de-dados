package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Curso;
import model.Disciplina;
import utils.RepositorioBancoDados;

public class DisciplinaController extends RepositorioBancoDados {

	public ArrayList<String> buscar(String cpf) {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select d.nome from disciplina d join oferta_disciplina o where o.id_disciplina = d.id and o.cpf = '" + cpf + "';");

		try {
			while (rs.next()) {
				list.add(rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<String> buscarPeriodos() {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from periodo_letivo;");

		try {
			while (rs.next()) {
				list.add(rs.getString("id_periodo") + " - " + rs.getString("ano"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<Disciplina> buscarDisciplina(String idCurso) {
		ArrayList<Disciplina> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from disciplina where curso=" + idCurso + ";");

		try {
			while (rs.next()) {
				Disciplina disciplina = new Disciplina(rs.getLong("id"), rs.getLong("codigo"), rs.getLong("id_disci_requisito"), rs.getLong("curso"), rs.getString("nome"), rs.getString("ementa"), rs.getInt("num_creditos"));
				list.add(disciplina);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<String> buscarTodasDisciplinas() {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from disciplina;");

		try {
			while (rs.next()) {
				list.add(rs.getString("id") + " - " + rs.getString("nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
