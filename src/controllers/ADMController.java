package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;
import utils.RepositorioBancoDados;

public class ADMController extends RepositorioBancoDados {
	
	
	public Usuario loginADM(String cpf, String senha) {

		Usuario usuario = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("select * from usuario u join administrador a on a.cpf = '" + cpf + "'and u.cpf = '" + cpf + "' and u.senha = '" + senha + "';");
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"), rs.getString("cep"), rs.getString("nome"), rs.getString("sexo"), rs.getString("telefone"), rs.getString("telefone_secundario"), rs.getInt("numero"), rs.getString("email"), rs.getString("senha"), rs.getString("ativo"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return usuario;
	}
	

}
