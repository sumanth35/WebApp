package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;

/**
 * Spring service that handles CRUD requests for RecipientLocation entities
 * 
 */
public interface RecipientLocationService {

	/**
	 * Return a count of all RecipientLocation entity
	 * 
	 */
	public Integer countRecipientLocations();

	/**
	 */
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationIndCities(Integer recipientlocation_recipientLocationId, Integer related_indcities_cityId);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationIndDistrict(Integer recipientLocationId_1, IndDistrict related_inddistrict);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationUsStates(Integer recipientlocation_recipientLocationId_1, Integer related_usstates_stateId);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationUsCounties(Integer recipientLocationId_2, UsCounties related_uscounties);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationCountries(Integer recipientLocationId_3, Countries related_countries);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationUsCities(Integer recipientlocation_recipientLocationId_2, Integer related_uscities_cityId);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationUsCities(Integer recipientLocationId_4, UsCities related_uscities);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationIndDistrict(Integer recipientlocation_recipientLocationId_3, Integer related_inddistrict_districtId);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationIndStates(Integer recipientlocation_recipientLocationId_4, Integer related_indstates_stateId);

	/**
	 * Return all RecipientLocation entity
	 * 
	 */
	public List<RecipientLocation> findAllRecipientLocations(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationUsCounties(Integer recipientlocation_recipientLocationId_5, Integer related_uscounties_countyId);

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationShipmentDetailses(Integer recipientLocationId_5, ShipmentDetails related_shipmentdetailses);

	/**
	 * Load an existing RecipientLocation entity
	 * 
	 */
	public Set<RecipientLocation> loadRecipientLocations();

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationIndCities(Integer recipientLocationId_6, IndCities related_indcities);

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationCountries(Integer recipientlocation_recipientLocationId_6, Integer related_countries_countryId);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationIndStates(Integer recipientLocationId_7, IndStates related_indstates);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public void saveRecipientLocation(RecipientLocation recipientlocation);

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	public RecipientLocation deleteRecipientLocationShipmentDetailses(Integer recipientlocation_recipientLocationId_7, Integer related_shipmentdetailses_shipmentId);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public void deleteRecipientLocation(RecipientLocation recipientlocation_1);

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public RecipientLocation saveRecipientLocationUsStates(Integer recipientLocationId_8, UsStates related_usstates);
}