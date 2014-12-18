package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for IndCities entities
 * 
 */
public interface IndCitiesService {

	/**
	 * Return all IndCities entity
	 * 
	 */
	public List<IndCities> findAllIndCitiess(Integer startResult, Integer maxRows);

	/**
	 * Load an existing IndCities entity
	 * 
	 */
	public Set<IndCities> loadIndCitiess();

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public IndCities deleteIndCitiesIndDistrict(Integer indcities_cityId, Integer related_inddistrict_districtId);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public IndCities saveIndCitiesIndDistrict(Integer cityId, IndDistrict related_inddistrict);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public IndCities deleteIndCitiesCustomerProfiles(Integer indcities_cityId_1, Integer related_customerprofiles_customerId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public IndCities saveIndCitiesCustomerProfiles(Integer cityId_1, CustomerProfile related_customerprofiles);

	/**
	 * Return a count of all IndCities entity
	 * 
	 */
	public Integer countIndCitiess();

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public IndCities deleteIndCitiesIndStates(Integer indcities_cityId_2, Integer related_indstates_stateId);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public IndCities deleteIndCitiesRecipientLocations(Integer indcities_cityId_3, Integer related_recipientlocations_recipientLocationId);

	/**
	 */
	public IndCities findIndCitiesByPrimaryKey(Integer cityId_2);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public IndCities saveIndCitiesVendorLocationses(Integer cityId_3, VendorLocations related_vendorlocationses);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public IndCities saveIndCitiesVendorOrganizationses(Integer cityId_4, VendorOrganizations related_vendororganizationses);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public IndCities saveIndCitiesIndStates(Integer cityId_5, IndStates related_indstates);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public IndCities saveIndCitiesRecipientLocations(Integer cityId_6, RecipientLocation related_recipientlocations);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public IndCities deleteIndCitiesVendorLocationses(Integer indcities_cityId_4, Integer related_vendorlocationses_locationId);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public void deleteIndCities(IndCities indcities);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public void saveIndCities(IndCities indcities_1);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public IndCities deleteIndCitiesVendorOrganizationses(Integer indcities_cityId_5, Integer related_vendororganizationses_organizationId);
}