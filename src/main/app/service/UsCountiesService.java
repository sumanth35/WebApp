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
 * Spring service that handles CRUD requests for UsCounties entities
 * 
 */
public interface UsCountiesService {

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public UsCounties saveUsCountiesVendorLocationses(Integer countyId, VendorLocations related_vendorlocationses);

	/**
	 */
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId_1);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public UsCounties saveUsCountiesUsCitieses(Integer countyId_2, UsCities related_uscitieses);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public UsCounties deleteUsCountiesUsCitieses(Integer uscounties_countyId, Integer related_uscitieses_cityId);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public UsCounties deleteUsCountiesVendorOrganizationses(Integer uscounties_countyId_1, Integer related_vendororganizationses_organizationId);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public UsCounties deleteUsCountiesVendorLocationses(Integer uscounties_countyId_2, Integer related_vendorlocationses_locationId);

	/**
	 * Return all UsCounties entity
	 * 
	 */
	public List<UsCounties> findAllUsCountiess(Integer startResult, Integer maxRows);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public void saveUsCounties(UsCounties uscounties);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public UsCounties deleteUsCountiesUsStates(Integer uscounties_countyId_3, Integer related_usstates_stateId);

	/**
	 * Return a count of all UsCounties entity
	 * 
	 */
	public Integer countUsCountiess();

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public UsCounties deleteUsCountiesRecipientLocations(Integer uscounties_countyId_4, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public UsCounties saveUsCountiesCustomerProfiles(Integer countyId_3, CustomerProfile related_customerprofiles);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public UsCounties deleteUsCountiesCustomerProfiles(Integer uscounties_countyId_5, Integer related_customerprofiles_customerId);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public UsCounties saveUsCountiesVendorOrganizationses(Integer countyId_4, VendorOrganizations related_vendororganizationses);

	/**
	 * Load an existing UsCounties entity
	 * 
	 */
	public Set<UsCounties> loadUsCountiess();

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public UsCounties saveUsCountiesUsStates(Integer countyId_5, UsStates related_usstates);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public void deleteUsCounties(UsCounties uscounties_1);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public UsCounties saveUsCountiesRecipientLocations(Integer countyId_6, RecipientLocation related_recipientlocations);
}