package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.RecipientLocation;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for UsStates entities
 * 
 */
public interface UsStatesService {

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public UsStates deleteUsStatesCountries(Integer usstates_stateId, Integer related_countries_countryId);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public UsStates deleteUsStatesCustomerProfiles(Integer usstates_stateId_1, Integer related_customerprofiles_customerId);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public UsStates saveUsStatesUsCitieses(Integer stateId, UsCities related_uscitieses);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public UsStates deleteUsStatesUsCitieses(Integer usstates_stateId_2, Integer related_uscitieses_cityId);

	/**
	 * Load an existing UsStates entity
	 * 
	 */
	public Set<UsStates> loadUsStatess();

	/**
	 */
	public UsStates findUsStatesByPrimaryKey(Integer stateId_1);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public UsStates saveUsStatesVendorLocationses(Integer stateId_2, VendorLocations related_vendorlocationses);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public UsStates saveUsStatesCountries(Integer stateId_3, Countries related_countries);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public UsStates saveUsStatesCustomerProfiles(Integer stateId_4, CustomerProfile related_customerprofiles);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public UsStates deleteUsStatesVendorOrganizationses(Integer usstates_stateId_3, Integer related_vendororganizationses_organizationId);

	/**
	 * Return all UsStates entity
	 * 
	 */
	public List<UsStates> findAllUsStatess(Integer startResult, Integer maxRows);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public UsStates saveUsStatesVendorOrganizationses(Integer stateId_5, VendorOrganizations related_vendororganizationses);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public UsStates deleteUsStatesUsCountieses(Integer usstates_stateId_4, Integer related_uscountieses_countyId);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public void deleteUsStates(UsStates usstates);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public UsStates saveUsStatesRecipientLocations(Integer stateId_6, RecipientLocation related_recipientlocations);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public UsStates deleteUsStatesVendorLocationses(Integer usstates_stateId_5, Integer related_vendorlocationses_locationId);

	/**
	 * Return a count of all UsStates entity
	 * 
	 */
	public Integer countUsStatess();

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public void saveUsStates(UsStates usstates_1);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public UsStates deleteUsStatesRecipientLocations(Integer usstates_stateId_6, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public UsStates saveUsStatesUsCountieses(Integer stateId_7, UsCounties related_uscountieses);
}