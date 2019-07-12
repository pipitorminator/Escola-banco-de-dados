package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Disciplina;
import model.OfertaDisciplina;
import utils.RepositorioBancoDados;

public class ProfOfertaController extends RepositorioBancoDados {

	public ArrayList<String> buscarprof() {
		ArrayList<String> prof = new ArrayList<>();
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from professor;");
			while (rs.next()) {
				prof.add(rs.getString("cpf"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return prof;
	}

	public ArrayList<OfertaDisciplina> buscardisc(String cpf) {
		ArrayList<OfertaDisciplina> disc = new ArrayList<>();
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from oferta_disciplina where cpf=" + cpf + "");
			while (rs.next()) {
				OfertaDisciplina ofertaDisciplina = new OfertaDisciplina(rs.getLong("id_disciplina"), rs.getLong("id_periodo"), rs.getString("cpf"), rs.getString("ativo"), rs.getString("dia_1"), rs.getString("dia_2"), rs.getString("hora_1"), rs.getString("hora_2"));
				disc.add(ofertaDisciplina);
			}
		} catch (Exception e) {
		}

		return disc;
	}

	public String disciplinas(long l) {
		String disc = null;
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from disciplina where id=" + l + "");
			while (rs.next()) {
				disc = (rs.getString("id") + " - " + rs.getString("nome"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return disc;
	}

	public String periodos(String id) {
		String disc = null;
		ResultSet rs = null;

		try {
			rs = executarConsulta("select * from periodo_letivo where id_periodo=" + id + "");
			while (rs.next()) {
				disc = (rs.getString("id_periodo"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return disc;
	}

	public OfertaDisciplina oferta(String id_dis, String id_per) {
		OfertaDisciplina ofertaDisciplina = null;
		ResultSet rs = null;
		rs = executarConsulta("select * from oferta_disciplina where id_disciplina =" + id_dis + " and id_periodo=" + id_per + " ;");
		try {
			if (rs.next()) {
				ofertaDisciplina = new OfertaDisciplina(rs.getLong("id_disciplina"), rs.getLong("id_periodo"), rs.getString("cpf"), rs.getString("ativo"), rs.getString("dia_1"), rs.getString("dia_2"), rs.getString("hora_1"), rs.getString("hora_2"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ofertaDisciplina;
	}

	public void update(OfertaDisciplina o) {
		executarUpdate("update oferta_disciplina set dia_1='" + o.getDia1() + "', dia_2='" + o.getDia2() + "', hora_1='" + o.getHora1() + "', hora_2='" + o.getHora2() + "' where id_disciplina= " + o.getId_disciplina() + " and id_periodo= " + o.getId_periodo() + ";");
	}

	public void salvar(OfertaDisciplina o) {
		executarUpdate("insert into oferta_disciplina (id_disciplina, id_periodo, dia_1, dia_2, hora_1, hora_2, cpf) values (" + o.getId_disciplina() + "," + o.getId_periodo() + ",'" + o.getDia1() + "','" + o.getDia2() + "','" + o.getHora1() + "','" + o.getHora2() + "','" + o.getCpf_prof() + "');");

	}

	public void delete(String idDis, String idPer) {
		executarUpdate("DELETE FROM oferta_disciplina WHERE id_disciplina = " + idDis + " and id_periodo= " + idPer + ";");
	}

}
