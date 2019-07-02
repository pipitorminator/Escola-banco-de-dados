package repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Aluno;
import model.ResponsavelFinanceiro;
import model.Usuario;
import utils.RepositorioBancoDados;

public class RepositorioAluno extends RepositorioBancoDados {

	public void inserir(Aluno aluno) {
		executarUpdate("insert into aluno(cpf) VALUES ('" + aluno.getCpf_user() + "' )");
	}

	public void remover(String cpf) {
		executarUpdate("DELETE FROM aluno WHERE cpf = '" + cpf + "'");
	}

	public boolean existe(String cpf) {
		boolean retorno = false;

		if (this.consultar(cpf) != null) {
			retorno = true;
		}

		return retorno;
	}

	public Aluno consultar(String cpf) {
		Aluno aluno = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("SELECT * FROM aluno a WHERE a.cpf = '" + cpf + "'");

			if (rs.next()) {
				aluno = new Aluno(rs.getString("cpf"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
		return aluno;
	}

	public Usuario loginAluno(String cpf, String senha) {

		Usuario usuario = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select * from usuario u join aluno a on a.cpf = '" + cpf + "'and u.cpf = '" + cpf + "' and u.senha = '" + senha + "';");
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"), rs.getString("cep"), rs.getString("nome"), rs.getString("sexo"), rs.getString("telefone"), rs.getString("telefone_secundario"), rs.getInt("numero"), rs.getString("email"), rs.getString("senha"), rs.getString("ativo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return usuario;
	}

	public ResponsavelFinanceiro getResponsavel(String cpf) {

		ResponsavelFinanceiro financeiro = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select * from responsavel_financeiro where cpf_aluno = '" + cpf + "'");
			if (rs.next()) {
				financeiro = new ResponsavelFinanceiro(rs.getString("cpf_aluno"), rs.getString("nome"), rs.getString("parentesco"), rs.getString("telefone"), rs.getString("email"));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return financeiro;
	}

	public String getNomeCurso(String cpf) {
		String nome = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select c.nome from curso c join aluno_matricula_curso a on a.cpf = '" + cpf + "' and a.codigo = c.codigo;");
			if (rs.next()) {
				nome = rs.getString("nome");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return nome;
	}

	public ArrayList<String> getNomeDisciplina(String cpf) {
		ArrayList<String> listDisciplina = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select d.nome from aluno_oferta_disciplina a join disciplina d where a.cpf = '" + cpf + "' and d.id = a.id_disciplina;");
			while (rs.next()) {
				listDisciplina.add(rs.getString("nome"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return listDisciplina;

	}

}
