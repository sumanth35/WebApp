package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

/**
 * Spring service that handles CRUD requests for VendorOrganizations entities
 * 
 */
public interface VendorOrganizationsService {

	/**
	 * Load an existing VendorOrganizations entity
	 * 
	 */
	public Set<VendorOrganizations> loadVendorOrganizationss();

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsIndStates(Integer vendororganizations_organizationId, Integer related_indstates_stateId);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsUsStates(Integer vendororganizations_organizationId_1, Integer related_usstates_stateId);

	/**
	 */
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId);

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsCountries(Integer vendororganizations_organizationId_2, Integer related_countries_countryId);

	/**
	 * Return all VendorOrganizations entity
	 * 
	 */
	public List<VendorOrganizations> findAllVendorOrganizationss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsCountries(Integer organizationId_1, Countries related_countries);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public void saveVendorOrganizations(VendorOrganizations vendororganizations);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsIndCities(Integer vendororganizations_organizationId_3, Integer related_indcities_cityId);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsIndDistrict(Integer vendororganizations_organizationId_4, Integer related_inddistrict_districtId);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsIndStates(Integer organizationId_2, IndStates related_indstates);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsUsCounties(Integer vendororganizations_organizationId_5, Integer related_uscounties_countyId);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public VendorOrganizations deleteVendorOrganizationsUsCities(Integer vendororganizations_organizationId_6, Integer related_uscities_cityId);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsIndCities(Integer organizationId_3, IndCities related_indcities);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsUsCities(Integer organizationId_4, UsCities related_uscities);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsUsCounties(Integer organizationId_5, UsCounties related_uscounties);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public void deleteVendorOrganizations(VendorOrganizations vendororganizations_1);

	/**
	 * Return a count of all VendorOrganizations entity
	 * 
	 */
	public Integer countVendorOrganizationss();

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsIndDistrict(Integer organizationId_6, IndDistrict related_inddistrict);

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public VendorOrganizations saveVendorOrganizationsUsStates(Integer organizationId_7, UsStates related_usstates);
}