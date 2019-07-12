package controllers;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Disciplina;
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

	public ArrayList<String> disciplinas(String curso) {
		ArrayList<String> disc = new ArrayList<>();
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from disciplina where curso=" + curso + "");
			while (rs.next()) {
				disc.add(rs.getString("id") + " - " + rs.getString("nome"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return disc;
	}

	public Disciplina editardisc(String id) {
		Disciplina disciplina = null;
		ResultSet rs = null;
		try {
			rs = executarConsulta("select * from disciplina where id = " + id + "");
			if (rs.next()) {
				disciplina = new Disciplina(rs.getLong("id"), rs.getLong("codigo"), rs.getLong("id_disci_requisito"), rs.getLong("curso"), rs.getString("nome"), rs.getString("ementa"), rs.getInt("num_creditos"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return disciplina;

	}

	public void delete(String id) {
		executarUpdate("delete from disciplina where id = " + id + "");
	}

	public void salvar(Disciplina d) {
		executarUpdate("insert into disciplina (nome, ementa, num_creditos, codigo, curso) values('" + d.getNome() + "','" + d.getEmenta() + "', " + d.getNum_creditos() + "," + d.getCodigo_area_conhecimento() + "," + d.getCodigo_curso() + ");");
	}

	public void update(Disciplina d) {
		executarUpdate("update disciplina set nome='" + d.getNome() + "', ementa='" + d.getEmenta() + "', num_creditos=" + d.getNum_creditos() + "  where id =" + d.getId() + " ;");
	}

}
