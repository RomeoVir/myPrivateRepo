package draft.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QueryClassSQL extends ConnectionDB {
	// Gestione Connessioni

	public Connection connection;
	public String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		// Inizializzo i manager
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myproject");
//		EntityManager em = factory.createEntityManager();
//
//		try {
//			em.getTransaction().begin();
//			//em.persist(p); // Salvataggio
//			em.getTransaction().commit();
//		} finally {
//			em.close();
//			factory.close();
//		}
		
		Class.forName("org.postgresql.Driver");

		//Url di connessione
		String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";

		Connection connection = DriverManager.getConnection(connectionUrl);

		System.out.println("Collegato");
		
		//Query string
		String selectNumeroStudenti = "SELECT * FROM studenti";
		
		//Preparo statement
		Statement statement = connection.createStatement();
		
		//
		ResultSet result = statement.executeQuery(selectNumeroStudenti);
		
		while (result.next()) {
			System.out.println(""+ result.getString("nome"));
		}
	}
	
	
	
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

//	public Connection getConnection() throws SQLException {
//		if (connection == null || connection.isClosed()) {
//			connection = DriverManager.getConnection(connectionUrl);
//		}
//		return connection;
//	}
//
//	public void closeConnection() throws SQLException {
//		if (connection != null || !connection.isClosed()) {
//			connection.close();
//		}
//	}
//
//	public PreparedStatement getPreparedStatement(String parametricQuery) throws SQLException {
//		if (connection == null) {
//			throw new IllegalStateException(
//					"non si puo' creare un prepared statement senza aver prima creato la connessione");
//		}
//		return connection.prepareStatement(parametricQuery);
//	}
}
