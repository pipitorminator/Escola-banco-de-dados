package controllers;

import model.AlunoAvaliacaoOfertaDisciplina;
import utils.RepositorioBancoDados;

public class AvaliacaoController extends RepositorioBancoDados {

	public void inserir(AlunoAvaliacaoOfertaDisciplina ofertaDisciplina) {
		executarUpdate("insert into aluno_avaliacao_oferta_disciplina (id_disciplina, id_periodo, cpf, codigo, nota) values(" + ofertaDisciplina.getId_disciplina() + "," + ofertaDisciplina.getId_periodo() + ",'" + ofertaDisciplina.getCpf_aluno() + "'," + ofertaDisciplina.getCodigo_avaliacao() + "," + ofertaDisciplina.getNota() + ");");

	}
}
