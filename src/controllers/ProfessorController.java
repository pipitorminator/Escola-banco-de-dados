package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Aluno;
import model.Professor;
import model.Usuario;
import utils.RepositorioBancoDados;

public class ProfessorController extends RepositorioBancoDados {

	public Usuario loginProfessor(String cpf, String senha) {

		Usuario usuario = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select * from usuario u join professor a on a.cpf = '" + cpf + "'and u.cpf = '" + cpf + "' and u.senha = '" + senha + "';");
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"), rs.getString("cep"), rs.getString("nome"), rs.getString("sexo"), rs.getString("telefone"), rs.getString("telefone_secundario"), rs.getInt("numero"), rs.getString("email"), rs.getString("senha"), rs.getString("ativo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return usuario;
	}

	public void inserir(Professor professor) {
		executarUpdate("insert into professor(cpf) VALUES ('" + professor.getCpf() + "' )");
	}
}
