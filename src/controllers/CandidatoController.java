package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Candidato;
import utils.RepositorioBancoDados;

public class CandidatoController extends RepositorioBancoDados {

	public void inserir(Candidato candidato) {
		executarUpdate("insert into candidato(cpf, nome, telefone, email, data_candidato) values('" + candidato.getCpf() + "','" + candidato.getNome() + "','" + candidato.getTelefone() + "', '" + candidato.getEmail() + "','" + candidato.getData() + "');");
	}

	public Candidato buscar(String cpf) {
		Candidato candidato = null;
		ResultSet rs = null;
		rs = executarConsulta("select * from candidato where cpf='" + cpf + "';");

		try {
			if (rs.next()) {
				candidato = new Candidato(rs.getString("cpf"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email"), rs.getString("data_candidato"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidato;

	}

	public void update(Candidato candidato) {
		executarUpdate("update candidato set nome='" + candidato.getNome() + "', telefone='" + candidato.getTelefone() + "', email='" + candidato.getEmail() + "', data_candidato='" + candidato.getData() + "'  where cpf = '" + candidato.getCpf() + "';");
	}

	public void delete(String cpf) {
		executarUpdate("DELETE FROM candidato WHERE cpf = '" + cpf + "';");
	}
}
