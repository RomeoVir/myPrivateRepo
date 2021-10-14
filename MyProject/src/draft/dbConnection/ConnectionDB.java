package draft.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	public static void getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		// Url di connessione
		String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";

		Connection connection = DriverManager.getConnection(connectionUrl);

		System.out.println("Collegato");

	}

	private static void driver() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Trovato");
		} catch (ClassNotFoundException e) {
			System.out.println("Non trovato");
		}

		System.out.println("Finito");
	}

}