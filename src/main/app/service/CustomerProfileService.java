package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.ProductsRating;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.UserRole;

/**
 * Spring service that handles CRUD requests for CustomerProfile entities
 * 
 */
public interface CustomerProfileService {

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileCartItemses(Integer customerId, CartItems related_cartitemses);

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileIndDistrict(Integer customerId_1, IndDistrict related_inddistrict);

	/**
	 * Save an existing Countries entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileCountries(Integer customerId_2, Countries related_countries);

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileIndDistrict(Integer customerprofile_customerId, Integer related_inddistrict_districtId);

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileUsStates(Integer customerId_3, UsStates related_usstates);

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileProductsRatings(Integer customerId_4, ProductsRating related_productsratings);

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileIndStates(Integer customerprofile_customerId_1, Integer related_indstates_stateId);

	/**
	 */
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId_5);

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileIndCities(Integer customerId_6, IndCities related_indcities);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public void saveCustomerProfile(CustomerProfile customerprofile);

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileUserRole(Integer customerprofile_customerId_2, Integer related_userrole_userRoleId);

	/**
	 * Return a count of all CustomerProfile entity
	 * 
	 */
	public Integer countCustomerProfiles();

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileProductsRatings(Integer customerprofile_customerId_3, Integer related_productsratings_productRatingId);

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileUserRole(Integer customerId_7, UserRole related_userrole);

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileUsStates(Integer customerprofile_customerId_4, Integer related_usstates_stateId);

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileIndStates(Integer customerId_8, IndStates related_indstates);

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileUsCounties(Integer customerId_9, UsCounties related_uscounties);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public void deleteCustomerProfile(CustomerProfile customerprofile_1);

	/**
	 * Return all CustomerProfile entity
	 * 
	 */
	public List<CustomerProfile> findAllCustomerProfiles(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileUsCounties(Integer customerprofile_customerId_5, Integer related_uscounties_countyId);

	/**
	 * Load an existing CustomerProfile entity
	 * 
	 */
	public Set<CustomerProfile> loadCustomerProfiles();

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileCartItemses(Integer customerprofile_customerId_6, Integer related_cartitemses_cartItemId);

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	public CustomerProfile saveCustomerProfileUsCities(Integer customerId_10, UsCities related_uscities);

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileIndCities(Integer customerprofile_customerId_7, Integer related_indcities_cityId);

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileUsCities(Integer customerprofile_customerId_8, Integer related_uscities_cityId);

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	public CustomerProfile deleteCustomerProfileCountries(Integer customerprofile_customerId_9, Integer related_countries_countryId);
}