package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.AlunoOfertaDisciplina;
import utils.RepositorioBancoDados;

public class OfertaDisciplinaController extends RepositorioBancoDados {

	public void inserir(AlunoOfertaDisciplina OfertaDisciplina) {
		executarUpdate("insert into aluno_oferta_disciplina (id_disciplina, id_periodo, cpf, data_matricula) values(" + OfertaDisciplina.getId_disciplina() + "," + OfertaDisciplina.getId_periodo() + ",'" + OfertaDisciplina.getCpf_aluno() + "','" + OfertaDisciplina.getData_matricula() + "');");
	}

	public void delete(String id_disciplina, String id_periodo, String cpf) {
		executarUpdate("DELETE FROM aluno_oferta_disciplina WHERE id_disciplina =" + id_disciplina + "  and id_periodo =" + id_periodo + " and cpf = '" + cpf + "';");
	}

	public AlunoOfertaDisciplina buscar(String id_disciplina, String id_periodo, String cpf) {
		AlunoOfertaDisciplina alunoOfertaDisciplina = null;
		ResultSet rs = null;
		rs = executarConsulta("SELECT * FROM aluno_oferta_disciplina where id_disciplina = " + id_disciplina + " and id_periodo=" + id_periodo + " and cpf= '" + cpf + "';");
		try {
			if (rs.next()) {
				alunoOfertaDisciplina = new AlunoOfertaDisciplina(rs.getLong("id_disciplina"), rs.getLong("id_periodo"), rs.getString("cpf"), rs.getString("data_matricula"), rs.getDouble("media_final"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunoOfertaDisciplina;
	}

	public void update(AlunoOfertaDisciplina aod) {
		executarUpdate("update aluno_oferta_disciplina set data_matricula='" + aod.getData_matricula() + "', media_final=" + aod.getMedia_final() + "  where cpf = '" + aod.getCpf_aluno() + "' and id_disciplina =" + aod.getId_disciplina() + " and id_periodo = " + aod.getId_periodo() + ";");
	}
}
