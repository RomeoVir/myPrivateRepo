package JPA.MyJPAProjectV2;

import JPA.MyJPAProjectV2.model.API;
import JPA.MyJPAProjectV2.model.IndirizzoAPI;


public class App {
	public static void main(String[] args) {
		System.out.println("Inizio JPA!");
		
		
        API api = new API();
        IndirizzoAPI indirizzo = new IndirizzoAPI();
        //api.writeStudente();
        //api.deleteStudente();
        //api.updateStudente();
        //api.getStudente();
        indirizzo.writeIndirizzo();
        
        
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAProjectV2");
//
//		// Scrivere su DB
//		EntityManager em = emf.createEntityManager();
		
		//Entity manager creato
		System.out.println("Fine JPA!");
	}
}
