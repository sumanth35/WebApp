package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.Products;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;

/**
 * Spring service that handles CRUD requests for VendorLocations entities
 * 
 */
public interface VendorLocationsService {

	/**
	 * Save an existing Products entity
	 * 
	 */
	public VendorLocations saveVendorLocationsProductses(Integer locationId, Products related_productses);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public VendorLocations saveVendorLocationsIndDistrict(Integer locationId_1, IndDistrict related_inddistrict);

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public void deleteVendorLocations(VendorLocations vendorlocations);

	/**
	 * Return a count of all VendorLocations entity
	 * 
	 */
	public Integer countVendorLocationss();

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsIndCities(Integer vendorlocations_locationId, Integer related_indcities_cityId);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public VendorLocations saveVendorLocationsIndCities(Integer locationId_2, IndCities related_indcities);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public VendorLocations saveVendorLocationsIndStates(Integer locationId_3, IndStates related_indstates);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsIndDistrict(Integer vendorlocations_locationId_1, Integer related_inddistrict_districtId);

	/**
	 */
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId_4);

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsCartItemses(Integer vendorlocations_locationId_2, Integer related_cartitemses_cartItemId);

	/**
	 * Return all VendorLocations entity
	 * 
	 */
	public List<VendorLocations> findAllVendorLocationss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public VendorLocations saveVendorLocationsUsCities(Integer locationId_5, UsCities related_uscities);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public void saveVendorLocations(VendorLocations vendorlocations_1);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsIndStates(Integer vendorlocations_locationId_3, Integer related_indstates_stateId);

	/**
	 * Load an existing VendorLocations entity
	 * 
	 */
	public Set<VendorLocations> loadVendorLocationss();

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsUsCities(Integer vendorlocations_locationId_4, Integer related_uscities_cityId);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsProductses(Integer vendorlocations_locationId_5, Integer related_productses_productId);

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public VendorLocations saveVendorLocationsUsStates(Integer locationId_6, UsStates related_usstates);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public VendorLocations saveVendorLocationsUsCounties(Integer locationId_7, UsCounties related_uscounties);

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public VendorLocations saveVendorLocationsCartItemses(Integer locationId_8, CartItems related_cartitemses);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsUsCounties(Integer vendorlocations_locationId_6, Integer related_uscounties_countyId);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public VendorLocations deleteVendorLocationsUsStates(Integer vendorlocations_locationId_7, Integer related_usstates_stateId);
}