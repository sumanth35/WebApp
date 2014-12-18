package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.ProductsRatingDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.UserRoleDAO;

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

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for CustomerProfile entities
 * 
 */

@Service("CustomerProfileService")
@Transactional
public class CustomerProfileServiceImpl implements CustomerProfileService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

	/**
	 * DAO injected by Spring that manages Countries entities
	 * 
	 */
	@Autowired
	private CountriesDAO countriesDAO;

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

	/**
	 * DAO injected by Spring that manages IndCities entities
	 * 
	 */
	@Autowired
	private IndCitiesDAO indCitiesDAO;

	/**
	 * DAO injected by Spring that manages IndDistrict entities
	 * 
	 */
	@Autowired
	private IndDistrictDAO indDistrictDAO;

	/**
	 * DAO injected by Spring that manages IndStates entities
	 * 
	 */
	@Autowired
	private IndStatesDAO indStatesDAO;

	/**
	 * DAO injected by Spring that manages ProductsRating entities
	 * 
	 */
	@Autowired
	private ProductsRatingDAO productsRatingDAO;

	/**
	 * DAO injected by Spring that manages UsCities entities
	 * 
	 */
	@Autowired
	private UsCitiesDAO usCitiesDAO;

	/**
	 * DAO injected by Spring that manages UsCounties entities
	 * 
	 */
	@Autowired
	private UsCountiesDAO usCountiesDAO;

	/**
	 * DAO injected by Spring that manages UsStates entities
	 * 
	 */
	@Autowired
	private UsStatesDAO usStatesDAO;

	/**
	 * DAO injected by Spring that manages UserRole entities
	 * 
	 */
	@Autowired
	private UserRoleDAO userRoleDAO;

	/**
	 * Instantiates a new CustomerProfileServiceImpl.
	 *
	 */
	public CustomerProfileServiceImpl() {
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileCartItemses(Integer customerId, CartItems related_cartitemses) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		CartItems existingcartItemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses.getCartItemId());

		// copy into the existing record to preserve existing relationships
		if (existingcartItemses != null) {
			existingcartItemses.setCartItemId(related_cartitemses.getCartItemId());
			existingcartItemses.setProductTitle(related_cartitemses.getProductTitle());
			existingcartItemses.setProductCost(related_cartitemses.getProductCost());
			existingcartItemses.setProductQuantity(related_cartitemses.getProductQuantity());
			existingcartItemses.setStatus(related_cartitemses.getStatus());
			existingcartItemses.setCreatedOn(related_cartitemses.getCreatedOn());
			existingcartItemses.setCreatedBy(related_cartitemses.getCreatedBy());
			existingcartItemses.setModifiedOn(related_cartitemses.getModifiedOn());
			existingcartItemses.setModifiedBy(related_cartitemses.getModifiedBy());
			related_cartitemses = existingcartItemses;
		} else {
			related_cartitemses = cartItemsDAO.store(related_cartitemses);
			cartItemsDAO.flush();
		}

		related_cartitemses.setCustomerProfile(customerprofile);
		customerprofile.getCartItemses().add(related_cartitemses);
		related_cartitemses = cartItemsDAO.store(related_cartitemses);
		cartItemsDAO.flush();

		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileIndDistrict(Integer customerId, IndDistrict related_inddistrict) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		IndDistrict existingindDistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict.getDistrictId());

		// copy into the existing record to preserve existing relationships
		if (existingindDistrict != null) {
			existingindDistrict.setDistrictId(related_inddistrict.getDistrictId());
			existingindDistrict.setDistrictName(related_inddistrict.getDistrictName());
			existingindDistrict.setDistrictAbbr(related_inddistrict.getDistrictAbbr());
			existingindDistrict.setCreatedBy(related_inddistrict.getCreatedBy());
			existingindDistrict.setCreatedOn(related_inddistrict.getCreatedOn());
			existingindDistrict.setModifiedOn(related_inddistrict.getModifiedOn());
			existingindDistrict.setModifiedBy(related_inddistrict.getModifiedBy());
			related_inddistrict = existingindDistrict;
		} else {
			related_inddistrict = indDistrictDAO.store(related_inddistrict);
			indDistrictDAO.flush();
		}

		customerprofile.setIndDistrict(related_inddistrict);
		related_inddistrict.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileCountries(Integer customerId, Countries related_countries) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		Countries existingcountries = countriesDAO.findCountriesByPrimaryKey(related_countries.getCountryId());

		// copy into the existing record to preserve existing relationships
		if (existingcountries != null) {
			existingcountries.setCountryId(related_countries.getCountryId());
			existingcountries.setCountryName(related_countries.getCountryName());
			existingcountries.setCountryCode(related_countries.getCountryCode());
			existingcountries.setCountryAbbr(related_countries.getCountryAbbr());
			existingcountries.setCreatedOn(related_countries.getCreatedOn());
			existingcountries.setCreatedBy(related_countries.getCreatedBy());
			existingcountries.setModifiedOn(related_countries.getModifiedOn());
			existingcountries.setModifiedBy(related_countries.getModifiedBy());
			related_countries = existingcountries;
		} else {
			related_countries = countriesDAO.store(related_countries);
			countriesDAO.flush();
		}

		customerprofile.setCountries(related_countries);
		related_countries.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileIndDistrict(Integer customerprofile_customerId, Integer related_inddistrict_districtId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		IndDistrict related_inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId, -1, -1);

		customerprofile.setIndDistrict(null);
		related_inddistrict.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		indDistrictDAO.remove(related_inddistrict);
		indDistrictDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileUsStates(Integer customerId, UsStates related_usstates) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		UsStates existingusStates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates.getStateId());

		// copy into the existing record to preserve existing relationships
		if (existingusStates != null) {
			existingusStates.setStateId(related_usstates.getStateId());
			existingusStates.setStateName(related_usstates.getStateName());
			existingusStates.setStateAbbr(related_usstates.getStateAbbr());
			existingusStates.setCreatedBy(related_usstates.getCreatedBy());
			existingusStates.setCreatedOn(related_usstates.getCreatedOn());
			existingusStates.setModifiedOn(related_usstates.getModifiedOn());
			existingusStates.setModifiedBy(related_usstates.getModifiedBy());
			related_usstates = existingusStates;
		} else {
			related_usstates = usStatesDAO.store(related_usstates);
			usStatesDAO.flush();
		}

		customerprofile.setUsStates(related_usstates);
		related_usstates.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileProductsRatings(Integer customerId, ProductsRating related_productsratings) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		ProductsRating existingproductsRatings = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings.getProductRatingId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsRatings != null) {
			existingproductsRatings.setProductRatingId(related_productsratings.getProductRatingId());
			existingproductsRatings.setProductRating(related_productsratings.getProductRating());
			existingproductsRatings.setCreatedOn(related_productsratings.getCreatedOn());
			existingproductsRatings.setCreatedBy(related_productsratings.getCreatedBy());
			existingproductsRatings.setModifiedOn(related_productsratings.getModifiedOn());
			existingproductsRatings.setModifiedBy(related_productsratings.getModifiedBy());
			related_productsratings = existingproductsRatings;
		} else {
			related_productsratings = productsRatingDAO.store(related_productsratings);
			productsRatingDAO.flush();
		}

		related_productsratings.setCustomerProfile(customerprofile);
		customerprofile.getProductsRatings().add(related_productsratings);
		related_productsratings = productsRatingDAO.store(related_productsratings);
		productsRatingDAO.flush();

		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileIndStates(Integer customerprofile_customerId, Integer related_indstates_stateId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		IndStates related_indstates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId, -1, -1);

		customerprofile.setIndStates(null);
		related_indstates.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		indStatesDAO.remove(related_indstates);
		indStatesDAO.flush();

		return customerprofile;
	}

	/**
	 */
	@Transactional
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId) {
		return customerProfileDAO.findCustomerProfileByPrimaryKey(customerId);
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileIndCities(Integer customerId, IndCities related_indcities) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		IndCities existingindCities = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities.getCityId());

		// copy into the existing record to preserve existing relationships
		if (existingindCities != null) {
			existingindCities.setCityId(related_indcities.getCityId());
			existingindCities.setCityName(related_indcities.getCityName());
			existingindCities.setCityAbbr(related_indcities.getCityAbbr());
			existingindCities.setCreatedOn(related_indcities.getCreatedOn());
			existingindCities.setCreatedBy(related_indcities.getCreatedBy());
			existingindCities.setModifiedOn(related_indcities.getModifiedOn());
			existingindCities.setModifiedBy(related_indcities.getModifiedBy());
			related_indcities = existingindCities;
		} else {
			related_indcities = indCitiesDAO.store(related_indcities);
			indCitiesDAO.flush();
		}

		customerprofile.setIndCities(related_indcities);
		related_indcities.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public void saveCustomerProfile(CustomerProfile customerprofile) {
		CustomerProfile existingCustomerProfile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile.getCustomerId());

		if (existingCustomerProfile != null) {
			if (existingCustomerProfile != customerprofile) {
				existingCustomerProfile.setCustomerId(customerprofile.getCustomerId());
				existingCustomerProfile.setCustomerName(customerprofile.getCustomerName());
				existingCustomerProfile.setCustomerPassword(customerprofile.getCustomerPassword());
				existingCustomerProfile.setCustomerEmail(customerprofile.getCustomerEmail());
				existingCustomerProfile.setProfileStatus(customerprofile.getProfileStatus());
				existingCustomerProfile.setPhone1(customerprofile.getPhone1());
				existingCustomerProfile.setPhone2(customerprofile.getPhone2());
				existingCustomerProfile.setFirstName(customerprofile.getFirstName());
				existingCustomerProfile.setLastName(customerprofile.getLastName());
				existingCustomerProfile.setMiddleName(customerprofile.getMiddleName());
				existingCustomerProfile.setNameSuffix(customerprofile.getNameSuffix());
				existingCustomerProfile.setNameTitle(customerprofile.getNameTitle());
				existingCustomerProfile.setLastSuccessLogin(customerprofile.getLastSuccessLogin());
				existingCustomerProfile.setVisits(customerprofile.getVisits());
				existingCustomerProfile.setCreatedIp(customerprofile.getCreatedIp());
				existingCustomerProfile.setAddressLine1(customerprofile.getAddressLine1());
				existingCustomerProfile.setAddressLine2(customerprofile.getAddressLine2());
				existingCustomerProfile.setAddressLine3(customerprofile.getAddressLine3());
				existingCustomerProfile.setZipCode5(customerprofile.getZipCode5());
				existingCustomerProfile.setZipCode4(customerprofile.getZipCode4());
				existingCustomerProfile.setLastLoginIp(customerprofile.getLastLoginIp());
				existingCustomerProfile.setCreatedOn(customerprofile.getCreatedOn());
				existingCustomerProfile.setCreatedBy(customerprofile.getCreatedBy());
				existingCustomerProfile.setModifiedOn(customerprofile.getModifiedOn());
				existingCustomerProfile.setModifiedBy(customerprofile.getModifiedBy());
			}
			customerprofile = customerProfileDAO.store(existingCustomerProfile);
		} else {
			customerprofile = customerProfileDAO.store(customerprofile);
		}
		customerProfileDAO.flush();
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileUserRole(Integer customerprofile_customerId, Integer related_userrole_userRoleId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		UserRole related_userrole = userRoleDAO.findUserRoleByPrimaryKey(related_userrole_userRoleId, -1, -1);

		customerprofile.setUserRole(null);
		related_userrole.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_userrole = userRoleDAO.store(related_userrole);
		userRoleDAO.flush();

		userRoleDAO.remove(related_userrole);
		userRoleDAO.flush();

		return customerprofile;
	}

	/**
	 * Return a count of all CustomerProfile entity
	 * 
	 */
	@Transactional
	public Integer countCustomerProfiles() {
		return ((Long) customerProfileDAO.createQuerySingleResult("select count(o) from CustomerProfile o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileProductsRatings(Integer customerprofile_customerId, Integer related_productsratings_productRatingId) {
		ProductsRating related_productsratings = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings_productRatingId, -1, -1);

		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		related_productsratings.setCustomerProfile(null);
		customerprofile.getProductsRatings().remove(related_productsratings);

		productsRatingDAO.remove(related_productsratings);
		productsRatingDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileUserRole(Integer customerId, UserRole related_userrole) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		UserRole existinguserRole = userRoleDAO.findUserRoleByPrimaryKey(related_userrole.getUserRoleId());

		// copy into the existing record to preserve existing relationships
		if (existinguserRole != null) {
			existinguserRole.setUserRoleId(related_userrole.getUserRoleId());
			existinguserRole.setUserRoleName(related_userrole.getUserRoleName());
			existinguserRole.setUserRoleDescription(related_userrole.getUserRoleDescription());
			existinguserRole.setCreatedOn(related_userrole.getCreatedOn());
			existinguserRole.setCreatedBy(related_userrole.getCreatedBy());
			existinguserRole.setModifiedOn(related_userrole.getModifiedOn());
			existinguserRole.setModifiedBy(related_userrole.getModifiedBy());
			related_userrole = existinguserRole;
		} else {
			related_userrole = userRoleDAO.store(related_userrole);
			userRoleDAO.flush();
		}

		customerprofile.setUserRole(related_userrole);
		related_userrole.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_userrole = userRoleDAO.store(related_userrole);
		userRoleDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileUsStates(Integer customerprofile_customerId, Integer related_usstates_stateId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		UsStates related_usstates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId, -1, -1);

		customerprofile.setUsStates(null);
		related_usstates.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		usStatesDAO.remove(related_usstates);
		usStatesDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileIndStates(Integer customerId, IndStates related_indstates) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		IndStates existingindStates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates.getStateId());

		// copy into the existing record to preserve existing relationships
		if (existingindStates != null) {
			existingindStates.setStateId(related_indstates.getStateId());
			existingindStates.setStateName(related_indstates.getStateName());
			existingindStates.setStateAbbr(related_indstates.getStateAbbr());
			existingindStates.setCreatedBy(related_indstates.getCreatedBy());
			existingindStates.setCreatedOn(related_indstates.getCreatedOn());
			existingindStates.setModifiedOn(related_indstates.getModifiedOn());
			existingindStates.setModifiedBy(related_indstates.getModifiedBy());
			related_indstates = existingindStates;
		} else {
			related_indstates = indStatesDAO.store(related_indstates);
			indStatesDAO.flush();
		}

		customerprofile.setIndStates(related_indstates);
		related_indstates.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileUsCounties(Integer customerId, UsCounties related_uscounties) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		UsCounties existingusCounties = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties.getCountyId());

		// copy into the existing record to preserve existing relationships
		if (existingusCounties != null) {
			existingusCounties.setCountyId(related_uscounties.getCountyId());
			existingusCounties.setCountyName(related_uscounties.getCountyName());
			existingusCounties.setCountyAbbr(related_uscounties.getCountyAbbr());
			existingusCounties.setCreatedOn(related_uscounties.getCreatedOn());
			existingusCounties.setCreatedBy(related_uscounties.getCreatedBy());
			existingusCounties.setModifiedOn(related_uscounties.getModifiedOn());
			existingusCounties.setModifiedBy(related_uscounties.getModifiedBy());
			related_uscounties = existingusCounties;
		} else {
			related_uscounties = usCountiesDAO.store(related_uscounties);
			usCountiesDAO.flush();
		}

		customerprofile.setUsCounties(related_uscounties);
		related_uscounties.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public void deleteCustomerProfile(CustomerProfile customerprofile) {
		customerProfileDAO.remove(customerprofile);
		customerProfileDAO.flush();
	}

	/**
	 * Return all CustomerProfile entity
	 * 
	 */
	@Transactional
	public List<CustomerProfile> findAllCustomerProfiles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<CustomerProfile>(customerProfileDAO.findAllCustomerProfiles(startResult, maxRows));
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileUsCounties(Integer customerprofile_customerId, Integer related_uscounties_countyId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		UsCounties related_uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId, -1, -1);

		customerprofile.setUsCounties(null);
		related_uscounties.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		usCountiesDAO.remove(related_uscounties);
		usCountiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Load an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public Set<CustomerProfile> loadCustomerProfiles() {
		return customerProfileDAO.findAllCustomerProfiles();
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileCartItemses(Integer customerprofile_customerId, Integer related_cartitemses_cartItemId) {
		CartItems related_cartitemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId, -1, -1);

		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		related_cartitemses.setCustomerProfile(null);
		customerprofile.getCartItemses().remove(related_cartitemses);

		cartItemsDAO.remove(related_cartitemses);
		cartItemsDAO.flush();

		return customerprofile;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public CustomerProfile saveCustomerProfileUsCities(Integer customerId, UsCities related_uscities) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerId, -1, -1);
		UsCities existingusCities = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities.getCityId());

		// copy into the existing record to preserve existing relationships
		if (existingusCities != null) {
			existingusCities.setCityId(related_uscities.getCityId());
			existingusCities.setCityName(related_uscities.getCityName());
			existingusCities.setCityAbbr(related_uscities.getCityAbbr());
			existingusCities.setCreatedBy(related_uscities.getCreatedBy());
			existingusCities.setCreatedOn(related_uscities.getCreatedOn());
			existingusCities.setModifiedBy(related_uscities.getModifiedBy());
			existingusCities.setModifiedOn(related_uscities.getModifiedOn());
			related_uscities = existingusCities;
		} else {
			related_uscities = usCitiesDAO.store(related_uscities);
			usCitiesDAO.flush();
		}

		customerprofile.setUsCities(related_uscities);
		related_uscities.getCustomerProfiles().add(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileIndCities(Integer customerprofile_customerId, Integer related_indcities_cityId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		IndCities related_indcities = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId, -1, -1);

		customerprofile.setIndCities(null);
		related_indcities.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		indCitiesDAO.remove(related_indcities);
		indCitiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileUsCities(Integer customerprofile_customerId, Integer related_uscities_cityId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		UsCities related_uscities = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId, -1, -1);

		customerprofile.setUsCities(null);
		related_uscities.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		usCitiesDAO.remove(related_uscities);
		usCitiesDAO.flush();

		return customerprofile;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public CustomerProfile deleteCustomerProfileCountries(Integer customerprofile_customerId, Integer related_countries_countryId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);
		Countries related_countries = countriesDAO.findCountriesByPrimaryKey(related_countries_countryId, -1, -1);

		customerprofile.setCountries(null);
		related_countries.getCustomerProfiles().remove(customerprofile);
		customerprofile = customerProfileDAO.store(customerprofile);
		customerProfileDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		countriesDAO.remove(related_countries);
		countriesDAO.flush();

		return customerprofile;
	}
}
