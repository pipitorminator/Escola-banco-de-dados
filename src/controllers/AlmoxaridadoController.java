package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Almoxarifado;
import utils.RepositorioBancoDados;

public class AlmoxaridadoController extends RepositorioBancoDados{

	public Almoxarifado buscar(String cpf) {
		Almoxarifado almoxarifado = null;
		ResultSet rs = null;
		rs = executarConsulta("select * from almoxarifado where cpf='" + cpf +"';");
		try {
			if (rs.next()) {
				almoxarifado = new Almoxarifado(rs.getLong("id"), rs.getString("cpf"), rs.getString("local_almoxarifado"),rs.getInt("numero_de_itens"), rs.getString("descricao"), rs.getString("tipo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(almoxarifado);
		return almoxarifado;
	}
}
