package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Almoxarifado;
import utils.RepositorioBancoDados;

public class AlmoxaridadoController extends RepositorioBancoDados {

	public Almoxarifado buscar(String cpf) {
		Almoxarifado almoxarifado = null;
		ResultSet rs = null;
		rs = executarConsulta("select * from almoxarifado where cpf='" + cpf + "';");
		try {
			if (rs.next()) {
				almoxarifado = new Almoxarifado(rs.getLong("id"), rs.getString("cpf"), rs.getString("local_almoxarifado"), rs.getInt("numero_de_itens"), rs.getString("descricao"), rs.getString("tipo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(almoxarifado);
		return almoxarifado;
	}

	public void delete(String cpf) {
		executarUpdate("delete from almoxarifado where cpf='" + cpf + "';");
	}

	public void update(Almoxarifado almoxarifado) {
		executarUpdate("update almoxarifado set local_almoxarifado='" + almoxarifado.getLocal() + "', numero_de_itens=" + almoxarifado.getNumero_de_itens() + " , descricao='" + almoxarifado.getDescricao() + "', tipo='" + almoxarifado.getTipo() + "'  where cpf =" + almoxarifado.getCpf_secretaria() + " ;");
	}

	public void cadastrar(Almoxarifado almoxarifado) {
		executarUpdate("insert into almoxarifado(local_almoxarifado, numero_de_itens,descricao,tipo,cpf)values('" + almoxarifado.getLocal() + "'," + almoxarifado.getNumero_de_itens() + ",'" + almoxarifado.getDescricao() + "','" + almoxarifado.getTipo() + "','" + almoxarifado.getCpf_secretaria() + "');");
	}

	public ArrayList<String> buscarCPF() {
		ArrayList<String> list = new ArrayList<>();
		ResultSet rs = null;

		rs = executarConsulta("select * from secretaria;");

		try {
			while (rs.next()) {
				list.add(rs.getString("cpf"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
