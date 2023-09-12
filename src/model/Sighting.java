/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Sep 11, 2023
 */

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sightings")

public class Sighting {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="species")
	private String species;
	
	@Column(name="county")
	private String county;
	
	//default no-arg constructor
	public Sighting(){
		super();
	}	
	
	/**
	 * constructor with params
	 * @param species to be set	
	 * @param county to be set
	 */
	public Sighting(String species, String county) {
		super();
		this.species =  species;		
		this.county = county;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}


	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String returnSightingDetails() {
		return this.species + " " + this.county;
	}
	
	
	
	
	
	
	
	
	
	
	
}
