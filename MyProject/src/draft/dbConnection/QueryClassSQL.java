package draft.dbConnection;

import java.sql.SQLException;

public class QueryClassSQL {

	public static void main(String[] args) {
		try {
			ConnectionDB.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String selectNumeroStudenti= "SELECT * FROM studenti";
	}
}
