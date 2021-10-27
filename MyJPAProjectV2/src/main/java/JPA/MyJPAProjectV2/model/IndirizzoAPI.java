package JPA.MyJPAProjectV2.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class IndirizzoAPI {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAProjectV2");

	// Scrivere su DB
	EntityManager em = emf.createEntityManager();

	public void writeIndirizzo() {
		
		Indirizzo indirizzo1 = new Indirizzo("Garessio", 78);
		Indirizzo indirizzo2 = new Indirizzo("Napoli", 2);
		Indirizzo indirizzo3 = new Indirizzo("Roma", 7);
		Indirizzo indirizzo4 = new Indirizzo("Mondovi", 5);
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(indirizzo1);
		em.persist(indirizzo2);
		em.persist(indirizzo3);
		em.persist(indirizzo4);
		transaction.commit();
		
	}
	
	
}
