package repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IRepositorioUsuario;
import model.Aluno;
import model.Usuario;
import utils.RepositorioBancoDados;

public class RepositorioUsuario extends RepositorioBancoDados implements IRepositorioUsuario {

	@Override
	public void inserir(Usuario usuario) {
		executarUpdate("insert into usuario(cpf, nome, sexo, telefone, email, senha, cep, numero) VALUES ('" + usuario.getCpf() + ", " + usuario.getNome() + ", " + usuario.getSexo() + ", " + usuario.getTelefone() + ", " + usuario.getEmail() + ", " + usuario.getSenha() + ", " + usuario.getCep() + ", " + usuario.getNumero() + "'");

	}

	@Override
	public void remover(String cpf) {
		executarUpdate("DELETE FROM usuario WHERE cpf = '" + cpf + "'");
	}

	@Override
	public boolean existe(String cpf) {
		boolean retorno = false;

		if (this.buscar(cpf) != null) {
			retorno = true;
		}

		return retorno;
	}

	@Override
	public Usuario buscar(String cpf) {
		Usuario usuario = null;
		ResultSet rs = null;
		try {
			rs = super.executarConsulta("SELECT * FROM aluno a WHERE a.cpf = '" + cpf + "'" );
			
			if (rs.next()) {
				usuario = new Usuario(rs.getString("cpf"),rs.getString("cep") ,rs.getString("nome") ,rs.getString("sexo") ,rs.getString("telefone") ,rs.getString("telefone_secundario") ,rs.getInt("numero") ,rs.getString("email") ,rs.getString("senha") ,rs.getString("status") );
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs);
		}
		return usuario;
	}

}
