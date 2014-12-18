package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for Countries entities
 * 
 */
public interface CountriesService {

	/**
	 */
	public Countries findCountriesByPrimaryKey(Integer countryId);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public Countries deleteCountriesIndStateses(Integer countries_countryId, Integer related_indstateses_stateId);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public Countries saveCountriesVendorOrganizationses(Integer countryId_1, VendorOrganizations related_vendororganizationses);

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public void deleteCountries(Countries countries);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public Countries deleteCountriesVendorOrganizationses(Integer countries_countryId_1, Integer related_vendororganizationses_organizationId);

	/**
	 * Return all Countries entity
	 * 
	 */
	public List<Countries> findAllCountriess(Integer startResult, Integer maxRows);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public Countries saveCountriesRecipientLocations(Integer countryId_2, RecipientLocation related_recipientlocations);

	/**
	 * Load an existing Countries entity
	 * 
	 */
	public Set<Countries> loadCountriess();

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public Countries saveCountriesUsStateses(Integer countryId_3, UsStates related_usstateses);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public Countries deleteCountriesRecipientLocations(Integer countries_countryId_2, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Return a count of all Countries entity
	 * 
	 */
	public Integer countCountriess();

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public Countries saveCountriesIndStateses(Integer countryId_4, IndStates related_indstateses);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public Countries deleteCountriesUsStateses(Integer countries_countryId_3, Integer related_usstateses_stateId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public Countries saveCountriesCustomerProfiles(Integer countryId_5, CustomerProfile related_customerprofiles);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public Countries deleteCountriesCustomerProfiles(Integer countries_countryId_4, Integer related_customerprofiles_customerId);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public void saveCountries(Countries countries_1);
}