package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Endereco;
import utils.RepositorioBancoDados;

public class EnderecoController extends RepositorioBancoDados {

	public void inserir(Endereco endereco) {
		executarUpdate("insert into endereco (cep, pais, estado, cidade, bairro, rua) values('" + endereco.getCep() + "', '" + endereco.getPais() + "', '" + endereco.getEstado() + "', '" + endereco.getCidade() + "', '" + endereco.getBairro() + "', '" + endereco.getRua() + "');");
	}

	public void alterarCepUsuario(String cpf, String cepNovo) {
		executarUpdate("update usuario set cep='" + cepNovo + "' where cpf= '" + cpf + "';");
	}

	public Endereco buscar(String cpf) {
		Endereco endereco = null;
		ResultSet rs = null;

		rs = executarConsulta("select e.cep, e.rua, e.bairro, e.cidade, e.estado, e.pais from endereco e join usuario u where u.cpf = '" + cpf + "' and u.cep = e.cep;");
		try {
			if (rs.next()) {
				endereco = new Endereco(rs.getString("cep"), rs.getString("rua"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("pais"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco;
	}

	public void delete(String cep) {
		executarUpdate("DELETE FROM endereco WHERE cep = '" + cep + "';");
	}

	public void update(Endereco e) {
		executarUpdate("update endereco set rua='" + e.getRua() + "', bairro='" + e.getBairro() + "', cidade='" + e.getCidade() + "', estado='" + e.getEstado() + "', pais='" + e.getPais() + "'  where cep = '" + e.getCep() + "';");
	
	}
}
