package draft.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDB {
	public Connection connection;
	public String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";

//	public static void getConnection() throws ClassNotFoundException, SQLException {
//
//		Class.forName("org.postgresql.Driver");
//
//		// Url di connessione
//		String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";
//
//		Connection connection = DriverManager.getConnection(connectionUrl);
//
//		System.out.println("Collegato");
//
//	}
//
//	private static void driver() {
//		try {
//			Class.forName("org.postgresql.Driver");
//			System.out.println("Trovato");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Non trovato");
//		}
//
//		System.out.println("Finito");
//	}

	public Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(connectionUrl);
		}
		return connection;
	}

	public void closeConnection() throws SQLException {
		if (connection != null || !connection.isClosed()) {
			connection.close();
		}
	}

	public PreparedStatement getPreparedStatement(String parametricQuery) throws SQLException {
		if (connection == null) {
			throw new IllegalStateException(
					"non si puo' creare un prepared statement senza aver prima creato la connessione");
		}
		return connection.prepareStatement(parametricQuery);
	}

}