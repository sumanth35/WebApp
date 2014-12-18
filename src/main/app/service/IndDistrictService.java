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
 * Spring service that handles CRUD requests for IndDistrict entities
 * 
 */
public interface IndDistrictService {

	/**
	 * Load an existing IndDistrict entity
	 * 
	 */
	public Set<IndDistrict> loadIndDistricts();

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public IndDistrict saveIndDistrictRecipientLocations(Integer districtId, RecipientLocation related_recipientlocations);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public void saveIndDistrict(IndDistrict inddistrict);

	/**
	 */
	public IndDistrict findIndDistrictByPrimaryKey(Integer districtId_1);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public IndDistrict saveIndDistrictIndStates(Integer districtId_2, IndStates related_indstates);

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	public IndDistrict saveIndDistrictVendorOrganizationses(Integer districtId_3, VendorOrganizations related_vendororganizationses);

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public IndDistrict deleteIndDistrictRecipientLocations(Integer inddistrict_districtId, Integer related_recipientlocations_recipientLocationId);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public IndDistrict deleteIndDistrictIndStates(Integer inddistrict_districtId_1, Integer related_indstates_stateId);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public IndDistrict deleteIndDistrictCustomerProfiles(Integer inddistrict_districtId_2, Integer related_customerprofiles_customerId);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public void deleteIndDistrict(IndDistrict inddistrict_1);

	/**
	 * Return all IndDistrict entity
	 * 
	 */
	public List<IndDistrict> findAllIndDistricts(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all IndDistrict entity
	 * 
	 */
	public Integer countIndDistricts();

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public IndDistrict saveIndDistrictVendorLocationses(Integer districtId_4, VendorLocations related_vendorlocationses);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public IndDistrict saveIndDistrictIndCitieses(Integer districtId_5, IndCities related_indcitieses);

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	public IndDistrict deleteIndDistrictVendorOrganizationses(Integer inddistrict_districtId_3, Integer related_vendororganizationses_organizationId);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public IndDistrict deleteIndDistrictVendorLocationses(Integer inddistrict_districtId_4, Integer related_vendorlocationses_locationId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public IndDistrict saveIndDistrictCustomerProfiles(Integer districtId_6, CustomerProfile related_customerprofiles);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public IndDistrict deleteIndDistrictIndCitieses(Integer inddistrict_districtId_5, Integer related_indcitieses_cityId);
}