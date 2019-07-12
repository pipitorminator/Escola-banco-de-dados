package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			rs = super.executarConsulta("select * from usuario where cpf = '" + cpf + "';");
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"), rs.getString("cep"), rs.getString("nome"), rs.getString("sexo"), rs.getString("telefone"), rs.getString("telefone_secundario"), rs.getInt("numero"), rs.getString("email"), rs.getString("senha"), rs.getString("ativo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return usuario;
	}

	public void remover(String cpf) {
		executarUpdate("DELETE FROM usuario WHERE cpf = '" + cpf + "'");
	}

	public void update(Usuario usuario) {
		executarUpdate("update usuario set nome= '" + usuario.getNome() + "', sexo= '" + usuario.getSexo() + "', telefone='" + usuario.getTelefone() + "', cep='" + usuario.getCep() + "', numero=" + usuario.getNumero() + ", email = '" + usuario.getEmail() + "' where cpf = '" + usuario.getCpf() + "';");

	}

	public ArrayList<String> buscarCEP() {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from endereco;");

		try {
			while (rs.next()) {
				list.add(rs.getString("cep"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

}
