package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	
	public void deleteSighting(Sighting toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Sighting> typedQuery = em.createQuery("select s from	Sighting s where s.species = :selectedSpecies and s.county = :selectedCounty", Sighting.class);
		
		//Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedSpecies", toDelete.getSpecies());
		typedQuery.setParameter("selectedCounty", toDelete.getCounty());
		//we only want one result
		typedQuery.setMaxResults(1);
		//get the result and save it into a new list item
		Sighting result = typedQuery.getSingleResult();
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		}
}
