package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RepositorioBancoDados {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/gerenciamentodecurso?useTimezone=true&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "senha";
	
	protected Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USUARIO, SENHA);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	protected void close(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage()); 
			}
		}
	}

	protected void close(Statement statement) {
		if (statement != null) {
			try {
				close(statement.getConnection());
				statement.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	protected void close(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
				close(resultSet.getStatement());
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
	
	protected void executarUpdate(String sql) {
		Statement stmt = null;
		Connection con = null;
		try {
			System.out.println("Comando Executado: " + sql);
			con = getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			close(stmt);
		}
	}
	
	protected PreparedStatement prepareStatement(String sql) {
		try {
			return getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	protected ResultSet executarConsulta(String sql) {
		Statement stmt = null;
		Connection con = null;
		try {
			System.out.println("Consulta Executada: " + sql);
			con = getConnection();
			stmt = con.createStatement();
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
