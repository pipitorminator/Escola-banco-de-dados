package controllers;

import java.util.ArrayList;

import model.Aluno;
import model.ResponsavelFinanceiro;
import model.Turma;
import model.Usuario;
import repositorios.RepositorioAluno;

public class AlunoController {

	private RepositorioAluno repositorioAluno;

	public AlunoController(RepositorioAluno repositorioAluno) {

		this.repositorioAluno = repositorioAluno;
	}

	public ArrayList<String> buscarTodosAlunos() {
		return repositorioAluno.buscarTodosAlunos();
	}

	public void cadastrar(Aluno aluno) throws Exception {

		if (!repositorioAluno.existe(aluno.getCpf_user())) {
			repositorioAluno.inserir(aluno);
		} else {
			throw new Exception("Erro: Já existe uma aluno com o cpf informado!");
		}

	}

	public void remover(String cpf) throws Exception {

		if (this.repositorioAluno.existe(cpf)) {
			repositorioAluno.remover(cpf);

		} else {
			throw new Exception("Erro: Conta informada não existe no cadastro de contas.");
		}
	}

	public Aluno consultar(String cpf) {
		return repositorioAluno.consultar(cpf);
	}

	public boolean existe(String cpf) {
		return repositorioAluno.existe(cpf);
	}

	public Usuario loginAluno(String cpf, String senha) {

		return repositorioAluno.loginAluno(cpf, senha);

	}

	public ResponsavelFinanceiro getResponsavel(String cpf) {

		return repositorioAluno.getResponsavel(cpf);
	}

	public String getNomeCurso(String cpf) {

		return repositorioAluno.getNomeCurso(cpf);
	}

	public ArrayList<String> getNomeDisciplina(String cpf) {

		return repositorioAluno.getNomeDisciplina(cpf);
	}
}
