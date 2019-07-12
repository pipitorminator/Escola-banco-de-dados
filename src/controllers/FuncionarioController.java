package controllers;

import utils.RepositorioBancoDados;

public class FuncionarioController extends RepositorioBancoDados {

	public void inserir(String cpf) {
		executarUpdate("insert into funcionario(cpf, salario, dt_contratacao, id_unidade) values('" + cpf + "', 1200.40, '2000/01/01',1);");
	}

}
