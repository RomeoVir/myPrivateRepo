package draft.dbConnection.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class scaricaStudenti {

	private static List<Studente> scaricaStudenti() {
		List<Studente> listaStudenti = new ArrayList<>();
		try {
			String connectionUrl = "jdbc:postgresql://localhost:5432/myproject?currentSchema=base&user=postgres&password=epicode";
			Connection connection = DriverManager.getConnection(connectionUrl);

			// Seleziono tabella
			String selectTable = "SELECT * FROM studenti";

			PreparedStatement prepare = connection.prepareStatement(selectTable);

			ResultSet result = prepare.executeQuery();

			while (result.next()) {
				Studente studenteDB = new Studente();
				studenteDB.setId(result.getInt("id"));
				studenteDB.setNome(result.getString("nome"));
				studenteDB.setCognome(result.getString("cognome"));
				studenteDB.setVoto(result.getInt("voto"));

				listaStudenti.add(studenteDB);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Numero di elementi dentro alla lista:" + listaStudenti.size());
		
		return listaStudenti;

	}

}
