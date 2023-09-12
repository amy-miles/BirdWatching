package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Sighting;

public class SightingHelper {

	static EntityManagerFactory emfactory =	Persistence.createEntityManagerFactory("BirdWatching");
	
	public void
	insertSighting(Sighting s) {
		EntityManager em = emfactory.createEntityManager();
		 em.getTransaction().begin();
		 em.persist(s);
		 em.getTransaction().commit();
		 em.close();
	}
	
	public List<Sighting> showAllSightings(){
		EntityManager em = emfactory.createEntityManager();
		List<Sighting> allSightings = em.createQuery("SELECT s FROM Sighting s").getResultList();
		return allSightings;
		}
	
	
}
