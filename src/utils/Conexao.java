package utils;

import java.sql.Connection;
import java.sql.DriverManager;

import controllers.AlunoController;
import gui.Login;
import model.Aluno;

public class Conexao {

	public static void main(String[] args) {
		try {
			RepositorioBancoDados bancoDados = new RepositorioBancoDados();
			Connection c = bancoDados.getConnection();
			System.out.println("Conexao estabelecida!");
			
			Login login = new Login();
			login.setVisible(true);
			
		} catch (Exception e) {
			System.out.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
			return;
		}
	}
}
