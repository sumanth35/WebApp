package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for IndStates entities
 * 
 */
public interface IndStatesService {

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public IndStates saveIndStatesRecipientLocations(Integer stateId, RecipientLocation related_recipientlocations);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public IndStates saveIndStatesCountries(Integer stateId_1, Countries related_countries);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public IndStates deleteIndStatesRecipientLocations(Integer indstates_stateId, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public IndStates saveIndStatesIndDistricts(Integer stateId_2, IndDistrict related_inddistricts);

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public IndStates deleteIndStatesCountries(Integer indstates_stateId_1, Integer related_countries_countryId);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public void deleteIndStates(IndStates indstates);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public IndStates saveIndStatesCustomerProfiles(Integer stateId_3, CustomerProfile related_customerprofiles);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public IndStates deleteIndStatesVendorOrganizationses(Integer indstates_stateId_2, Integer related_vendororganizationses_organizationId);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public IndStates deleteIndStatesIndCitieses(Integer indstates_stateId_3, Integer related_indcitieses_cityId);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public IndStates deleteIndStatesCustomerProfiles(Integer indstates_stateId_4, Integer related_customerprofiles_customerId);

	/**
	 * Return a count of all IndStates entity
	 * 
	 */
	public Integer countIndStatess();

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public void saveIndStates(IndStates indstates_1);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public IndStates saveIndStatesVendorLocationses(Integer stateId_4, VendorLocations related_vendorlocationses);

	/**
	 */
	public IndStates findIndStatesByPrimaryKey(Integer stateId_5);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public IndStates deleteIndStatesVendorLocationses(Integer indstates_stateId_5, Integer related_vendorlocationses_locationId);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public IndStates saveIndStatesIndCitieses(Integer stateId_6, IndCities related_indcitieses);

	/**
	 * Return all IndStates entity
	 * 
	 */
	public List<IndStates> findAllIndStatess(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public IndStates deleteIndStatesIndDistricts(Integer indstates_stateId_6, Integer related_inddistricts_districtId);

	/**
	 * Load an existing IndStates entity
	 * 
	 */
	public Set<IndStates> loadIndStatess();

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public IndStates saveIndStatesVendorOrganizationses(Integer stateId_7, VendorOrganizations related_vendororganizationses);
}