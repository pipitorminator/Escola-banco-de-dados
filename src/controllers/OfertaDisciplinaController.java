package controllers;

import model.AlunoOfertaDisciplina;
import utils.RepositorioBancoDados;

public class OfertaDisciplinaController extends RepositorioBancoDados {

	public void inserir(AlunoOfertaDisciplina OfertaDisciplina) {
		executarUpdate("insert into aluno_oferta_disciplina (id_disciplina, id_periodo, cpf, data_matricula) values(" + OfertaDisciplina.getId_disciplina() + "," + OfertaDisciplina.getId_periodo() + ",'" + OfertaDisciplina.getCpf_aluno() + "','" + OfertaDisciplina.getData_matricula() + "');");

	}
}
