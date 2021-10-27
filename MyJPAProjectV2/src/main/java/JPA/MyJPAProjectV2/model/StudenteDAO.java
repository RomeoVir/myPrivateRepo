package JPA.MyJPAProjectV2.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudenteDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAProjectV2");

	// Scrivere su DB
	EntityManager em = emf.createEntityManager();

	public void writeStudente() {
		try {
			Studente studente1 = new Studente("Alfredo", "Mamaino", 3);
			Studente studente2 = new Studente("Sangu", "Yammi", 9);
			Studente studente3 = new Studente("Salino", "Franchissimo", 7);
			Studente studente4 = new Studente("Alberto", "Alberti", 8);

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();

			em.persist(studente1);
			em.persist(studente2);
			em.persist(studente3);
			em.persist(studente4);
			transaction.commit();
			
			System.out.println("Fine Commit Studenti.");
			
		} finally {
			// em.close();
		}

	}

	// Leggere su DB
	public void getStudente() {
		try {
			long id = 1;
			for (int i = 0; i < 10; i++, id++) {
				Studente studente = em.find(Studente.class, id);
				System.out.println("Lettura: " + studente.toString());
			}
		} finally {
			System.out.println("Lettura componenti completata. ");
		}
	}

	// Elimina da DB
	public void deleteStudente() {
		try {
			Studente studente = em.find(Studente.class, (long) 3);
			System.out.println("Rimozione: " + studente.toString());
			em.remove(studente);
		} finally {
			em.close();
		}
	}

	// Aggiornare Dato su DB

	public void updateStudente() {
		try {
			Studente studente = em.find(Studente.class, (long)3 );
			System.out.println("Dati studente da modificare: " + studente.toString());
			studente.setVoto(6);
			System.out.println("Modifica del voto: " + studente.getVoto());
			em.persist(studente);
			System.out.println("Dati studente modificato: " + studente.toString());
		}finally {
			
		}
	}

}
