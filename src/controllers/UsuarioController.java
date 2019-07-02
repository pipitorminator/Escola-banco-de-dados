package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;
import utils.RepositorioBancoDados;

public class UsuarioController extends RepositorioBancoDados {

	public void inserir(Usuario u) {
		executarUpdate("insert into usuario(cpf, nome, sexo, telefone, email, senha, cep, numero) values ('" + u.getCpf() + "', '" + u.getNome() + "', '" + u.getSexo() + "', '" + u.getTelefone() + "', '" + u.getEmail() + "', '" + u.getSenha() + "', '" + u.getCep() + "','" + u.getNumero() + "');");
	}

	public Usuario buscar(String cpf) {
		Usuario usuario = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select * from usuario u join aluno a on a.cpf = '" + cpf + "'and u.cpf = '" + cpf + "';");
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"), rs.getString("cep"), rs.getString("nome"), rs.getString("sexo"), rs.getString("telefone"), rs.getString("telefone_secundario"), rs.getInt("numero"), rs.getString("email"), rs.getString("senha"), rs.getString("ativo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return usuario;
	}
}
