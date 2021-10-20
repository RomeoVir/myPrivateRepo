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

public class QueryClassSQL {
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

		// Url di connessione
		String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";

		Connection connection = DriverManager.getConnection(connectionUrl);

		System.out.println("Collegato");

		// Lettura dati
		// Creo statement
		Statement statement = connection.createStatement();

		// Seleziono tabella
		String selectTable = "SELECT * FROM studenti";

		// Assegno il resultSet
		ResultSet result = statement.executeQuery(selectTable);

		nomeStudenti(result);

		// Esecuzione di una query

		// E' buona norma disattivare l'autocommit ed eseguirlo successivamente
		connection.setAutoCommit(false);

		// Preparo statement
		String insert = "INSERT INTO base.studenti( id, nome, cognome, voto)" + "VALUES (?,?,?,?)";
		PreparedStatement prepareInsert = connection.prepareStatement(insert);

		String delete = "DELETE FROM base.studenti where id = ?";
		PreparedStatement prepareDelete = connection.prepareStatement(delete);

		updateStudenti(prepareInsert);
		deleteStudenti(prepareDelete);
		
		//Commit delle modifiche effettuate
		connection.commit();
		
		
		//Stampo tutti gli elementi presenti in tabella
		infoStudenti(connection);

		// Chiudo connessioni e libero le risorse
		try {
			connection.close();
			statement.close();
			prepareInsert.close();
			prepareDelete.close();
			System.out.println("Connessioni chiuse correttamente");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void deleteStudenti(PreparedStatement prepareDelete) throws SQLException {
		prepareDelete.setInt(1, 7);
		prepareDelete.executeUpdate();
	}

	private static void updateStudenti(PreparedStatement prepareInsert) throws SQLException {

		prepareInsert.setInt(1, 7); // ID
		prepareInsert.setString(2, "Silvia"); // Nome
		prepareInsert.setString(3, "Manfredi"); // Cognome
		prepareInsert.setInt(4, 6); // Voto
		prepareInsert.executeUpdate();
	}

	private static void nomeStudenti(ResultSet result) throws SQLException {

		while (result.next()) {
			System.out.println("" + result.getString("nome"));
		}
	}

	private static void infoStudenti(Connection connection) throws SQLException {

		Statement statement = connection.createStatement();

		// Seleziono tabella
		String selectTable = "SELECT * FROM studenti";

		// Assegno il resultSet
		ResultSet result = statement.executeQuery(selectTable);
		while (result.next()) {
			System.out.println(result.getString("id") + " " + result.getString("nome") + " "
					+ result.getString("cognome") + " " + result.getString("voto"));
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
