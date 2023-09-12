/**
 * @author Amy Miles
 * CIS 175 - Fall 2023
 * Sep 11, 2023
 */

package model;

public class Sighting {
	
	private int id;
	private String species;
	private String gender;
	private String county;
	
	//default no-arg constructor
	public Sighting(){
		
	}	
	
	/**
	 * constructor with params
	 * @param species to be set
	 * @param gender to be set
	 * @param county to be set
	 */
	public Sighting(String species, String gender, String county) {
		this.species =  species;
		this.gender = gender;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	
	public String returnSightingList() {
		return this.species + " " + this.gender + " " + this.county;
	}
	
	
	
	
	
	
	
	
	
	
	
}
