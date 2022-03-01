package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entry {
	public static void main(String[] args) {
		EntityManagerFactory	emf;
		EntityManager			em;
		
		emf = Persistence.createEntityManagerFactory("disco");
		em = emf.createEntityManager();
		
		em.close();
		emf.close();
	}
}
