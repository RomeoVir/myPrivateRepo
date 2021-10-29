package JPA.MyJPAProjectV2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import JPA.MyJPAProjectV2.model.ereditarieta.Aereo;
import JPA.MyJPAProjectV2.model.ereditarieta.Automobile;
import JPA.MyJPAProjectV2.model.ereditarieta.MezzoAMotore;

public class App {
	public static void main(String[] args) {
		System.out.println("Inizio JPA!");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAProjectV2");

		// Scrivere su DB
		EntityManager em = emf.createEntityManager();

		// PROGRAMMA 1
		//////////////////////////////////////////////////////////////////////////////////////
		// Indirizzo
//	        
//			Indirizzo indirizzo1 = new Indirizzo("Garessio", 78, "Via dei campi");
//			Indirizzo indirizzo2 = new Indirizzo("Napoli", 2, "Via mandasdo");
//			Indirizzo indirizzo3 = new Indirizzo("Roma", 7, "Via quinditino");
//			Indirizzo indirizzo4 = new Indirizzo("Mondovi", 5, "Via Garibaldi");
//			
//			EntityTransaction transaction = em.getTransaction();
//			transaction.begin();
//	
//			em.persist(indirizzo1);
//			em.persist(indirizzo2);
//			em.persist(indirizzo3);
//			em.persist(indirizzo4);
//			transaction.commit();
//			
//			//Studenti 
//			
//			Studente studente1 = new Studente("Alfredo", "Mamaino", 3, indirizzo1);
//			Studente studente2 = new Studente("Sangu", "Yammi", 9, indirizzo2);
//			Studente studente3 = new Studente("Salino", "Franchissimo", 7, indirizzo3);
//			Studente studente4 = new Studente("Alberto", "Alberti", 8, indirizzo1);
//	
//			EntityTransaction transaction2 = em.getTransaction();
//			transaction.begin();
//	
//			em.persist(studente1);
//			em.persist(studente2);
//			em.persist(studente3);
//			em.persist(studente4);
//			transaction2.commit();
//			
//			System.out.println("Fine Commit Studenti.");
//	        
		// api.writeStudente();
		// api.deleteStudente();
		// api.updateStudente();
		// studente.getStudente();
		// indirizzo.writeIndirizzo();
//			try {
//				long id = 1;
//				for (int i = 0; i < 10; i++, id++) {
//					Studente studente = em.find(Studente.class, id);
//					System.out.println("Lettura: " + studente.toString());
//				}
//			} finally {
//				System.out.println("Lettura componenti. ");
//			}
		//////////////////////////////////////////////////////////////////////////////////////

		// PROGRAMMA 2
		//////////////////////////////////////////////////////////////////////////////////////

//		Aereo aereo1 = new Aereo(1976, 2, "Stuca");
//		Aereo aereo2 = new Aereo(1986, 2, "Bombardier");
//		Aereo aereo3 = new Aereo(2020, 2, "EuroFighter");
//		Automobile auto1 = new Automobile(2020, 4, "Opel Zaffira");
//		Automobile auto2 = new Automobile(2018, 4, "Opel Merida");
//		EntityTransaction transaction = em.getTransaction();
//		transaction.begin();
//		em.persist(aereo1);
//		em.persist(aereo2);
//		em.persist(aereo3);
//		em.persist(auto1);
//		em.persist(auto2);
//		transaction.commit();
//		System.out.println("Fine Commit.");

		//////////////////////////////////////////////////////////////////////////////////////

		// PROGRAMMA 3
		//////////////////////////////////////////////////////////////////////////////////////

		Aereo aereo1 = new Aereo(1976, 2, "Stuca");
		Aereo aereo2 = new Aereo(1986, 2, "Bombardier");
		Aereo aereo3 = new Aereo(2020, 2, "EuroFighter");
		Automobile auto1 = new Automobile(2020, 4, "Opel Zaffira");
		Automobile auto2 = new Automobile(2018, 4, "Opel Merida");
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(aereo1);
		em.persist(aereo2);
		em.persist(aereo3);
		em.persist(auto1);
		em.persist(auto2);
		transaction.commit();
		System.out.println("Fine Commit.");

		List<MezzoAMotore> risultatoQuery = new ArrayList<>();
		
//		// Query inline	/////////////////////////////////////////////////////
//
//		try {
//			Query query = em.createQuery("SELECT a FROM mezzoamotore a WHERE a.modello LIKE :modello ");
//			query.setParameter("modello", "Opel%");
//			risultatoQuery = query.getResultList();
//			System.out.println("Fine Query!");
//			System.out.println("Numero di elementi dentro alla lista:" + risultatoQuery.size());
//
//		} finally {
//
//		}
	
		//  NamedQuery	/////////////////////////////////////////////////////

		try {
			Query query = em.createNamedQuery("mezzoModello");
			query.setParameter("modello", "Stuca");
			risultatoQuery = query.getResultList();
			System.out.println("Fine NamedQuery!");
			System.out.println("Numero di elementi dentro alla lista:" + risultatoQuery.size());
			System.out.println(risultatoQuery.toString());

		} finally {

		}

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAProjectV2");
//
//		// Scrivere su DB
//		EntityManager em = emf.createEntityManager();

		// Entity manager creato
		System.out.println("Fine JPA!");
	}
}
