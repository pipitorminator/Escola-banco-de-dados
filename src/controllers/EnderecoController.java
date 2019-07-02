package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Endereco;
import utils.RepositorioBancoDados;

public class EnderecoController extends RepositorioBancoDados {

	public void inserir(Endereco endereco) {
		executarUpdate("insert into endereco (cep, pais, estado, cidade, bairro, rua) values('" + endereco.getCep() + "', '" + endereco.getPais() + "', '" + endereco.getEstado() + "', '" + endereco.getCidade() + "', '" + endereco.getBairro() + "', '" + endereco.getRua() + "');");
	}

	public void alterarCepUsuario(String cepAntigo, String cepNovo) {
		executarUpdate("update usuario set cep='" + cepNovo + "' where cep= '" + cepAntigo + "';");
	}

	public Endereco buscar(String cpf) {
		Endereco endereco = null;
		ResultSet rs = null;

		rs = executarConsulta("select e.cep, e.rua, e.bairro, e.cidade, e.estado, e.pais from endereco e join usuario u where cpf = '" + cpf + "' and u.cep = e.cep;");
		try {
			if (rs.next()) {
				endereco = new Endereco(rs.getString("cep"), rs.getString("rua"), rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("pais"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return endereco;
	}
}
