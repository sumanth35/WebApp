package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.RecipientLocation;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for UsCities entities
 * 
 */
public interface UsCitiesService {

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public UsCities saveUsCitiesVendorLocationses(Integer cityId, VendorLocations related_vendorlocationses);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public UsCities saveUsCitiesRecipientLocations(Integer cityId_1, RecipientLocation related_recipientlocations);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public UsCities deleteUsCitiesUsStates(Integer uscities_cityId, Integer related_usstates_stateId);

	/**
	 * Return a count of all UsCities entity
	 * 
	 */
	public Integer countUsCitiess();

	/**
	 * Load an existing UsCities entity
	 * 
	 */
	public Set<UsCities> loadUsCitiess();

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public UsCities deleteUsCitiesVendorLocationses(Integer uscities_cityId_1, Integer related_vendorlocationses_locationId);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public UsCities deleteUsCitiesVendorOrganizationses(Integer uscities_cityId_2, Integer related_vendororganizationses_organizationId);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public void saveUsCities(UsCities uscities);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public void deleteUsCities(UsCities uscities_1);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public UsCities deleteUsCitiesUsCounties(Integer uscities_cityId_3, Integer related_uscounties_countyId);

	/**
	 * Return all UsCities entity
	 * 
	 */
	public List<UsCities> findAllUsCitiess(Integer startResult, Integer maxRows);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public UsCities saveUsCitiesVendorOrganizationses(Integer cityId_2, VendorOrganizations related_vendororganizationses);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public UsCities deleteUsCitiesRecipientLocations(Integer uscities_cityId_4, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public UsCities saveUsCitiesCustomerProfiles(Integer cityId_3, CustomerProfile related_customerprofiles);

	/**
	 */
	public UsCities findUsCitiesByPrimaryKey(Integer cityId_4);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public UsCities deleteUsCitiesCustomerProfiles(Integer uscities_cityId_5, Integer related_customerprofiles_customerId);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public UsCities saveUsCitiesUsCounties(Integer cityId_5, UsCounties related_uscounties);

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public UsCities saveUsCitiesUsStates(Integer cityId_6, UsStates related_usstates);
}