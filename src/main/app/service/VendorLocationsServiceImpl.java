package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorLocationsDAO;

import main.app.domain.CartItems;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.Products;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for VendorLocations entities
 * 
 */

@Service("VendorLocationsService")
@Transactional
public class VendorLocationsServiceImpl implements VendorLocationsService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

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
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * Instantiates a new VendorLocationsServiceImpl.
	 *
	 */
	public VendorLocationsServiceImpl() {
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsProductses(Integer locationId, Products related_productses) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
		Products existingproductses = productsDAO.findProductsByPrimaryKey(related_productses.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingproductses != null) {
			existingproductses.setProductId(related_productses.getProductId());
			existingproductses.setProductTitle(related_productses.getProductTitle());
			existingproductses.setSalesPrice(related_productses.getSalesPrice());
			existingproductses.setCostPrice(related_productses.getCostPrice());
			existingproductses.setDiscountPrice(related_productses.getDiscountPrice());
			existingproductses.setPercentageDiscount(related_productses.getPercentageDiscount());
			existingproductses.setCreatedOn(related_productses.getCreatedOn());
			existingproductses.setCreatedBy(related_productses.getCreatedBy());
			existingproductses.setModifiedOn(related_productses.getModifiedOn());
			existingproductses.setModifiedBy(related_productses.getModifiedBy());
			existingproductses.setStatus(related_productses.getStatus());
			existingproductses.setQuantity(related_productses.getQuantity());
			related_productses = existingproductses;
		} else {
			related_productses = productsDAO.store(related_productses);
			productsDAO.flush();
		}

		related_productses.setVendorLocations(vendorlocations);
		vendorlocations.getProductses().add(related_productses);
		related_productses = productsDAO.store(related_productses);
		productsDAO.flush();

		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsIndDistrict(Integer locationId, IndDistrict related_inddistrict) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setIndDistrict(related_inddistrict);
		related_inddistrict.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		return vendorlocations;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public void deleteVendorLocations(VendorLocations vendorlocations) {
		vendorLocationsDAO.remove(vendorlocations);
		vendorLocationsDAO.flush();
	}

	/**
	 * Return a count of all VendorLocations entity
	 * 
	 */
	@Transactional
	public Integer countVendorLocationss() {
		return ((Long) vendorLocationsDAO.createQuerySingleResult("select count(o) from VendorLocations o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsIndCities(Integer vendorlocations_locationId, Integer related_indcities_cityId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		IndCities related_indcities = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId, -1, -1);

		vendorlocations.setIndCities(null);
		related_indcities.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		indCitiesDAO.remove(related_indcities);
		indCitiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsIndCities(Integer locationId, IndCities related_indcities) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setIndCities(related_indcities);
		related_indcities.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsIndStates(Integer locationId, IndStates related_indstates) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setIndStates(related_indstates);
		related_indstates.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsIndDistrict(Integer vendorlocations_locationId, Integer related_inddistrict_districtId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		IndDistrict related_inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId, -1, -1);

		vendorlocations.setIndDistrict(null);
		related_inddistrict.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		indDistrictDAO.remove(related_inddistrict);
		indDistrictDAO.flush();

		return vendorlocations;
	}

	/**
	 */
	@Transactional
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId) {
		return vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId);
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsCartItemses(Integer vendorlocations_locationId, Integer related_cartitemses_cartItemId) {
		CartItems related_cartitemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId, -1, -1);

		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		related_cartitemses.setVendorLocations(null);
		vendorlocations.getCartItemses().remove(related_cartitemses);

		cartItemsDAO.remove(related_cartitemses);
		cartItemsDAO.flush();

		return vendorlocations;
	}

	/**
	 * Return all VendorLocations entity
	 * 
	 */
	@Transactional
	public List<VendorLocations> findAllVendorLocationss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<VendorLocations>(vendorLocationsDAO.findAllVendorLocationss(startResult, maxRows));
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsUsCities(Integer locationId, UsCities related_uscities) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setUsCities(related_uscities);
		related_uscities.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public void saveVendorLocations(VendorLocations vendorlocations) {
		VendorLocations existingVendorLocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations.getLocationId());

		if (existingVendorLocations != null) {
			if (existingVendorLocations != vendorlocations) {
				existingVendorLocations.setLocationId(vendorlocations.getLocationId());
				existingVendorLocations.setLocationName(vendorlocations.getLocationName());
				existingVendorLocations.setLocationAdminFirstName(vendorlocations.getLocationAdminFirstName());
				existingVendorLocations.setLocationAdminMiddleName(vendorlocations.getLocationAdminMiddleName());
				existingVendorLocations.setLocationAdminLastName(vendorlocations.getLocationAdminLastName());
				existingVendorLocations.setLocationAdminSuffix(vendorlocations.getLocationAdminSuffix());
				existingVendorLocations.setStatus(vendorlocations.getStatus());
				existingVendorLocations.setPhone1(vendorlocations.getPhone1());
				existingVendorLocations.setPhone2(vendorlocations.getPhone2());
				existingVendorLocations.setFax(vendorlocations.getFax());
				existingVendorLocations.setEmail(vendorlocations.getEmail());
				existingVendorLocations.setAddressLine1(vendorlocations.getAddressLine1());
				existingVendorLocations.setAddressLine2(vendorlocations.getAddressLine2());
				existingVendorLocations.setAddressLine3(vendorlocations.getAddressLine3());
				existingVendorLocations.setZipCode5(vendorlocations.getZipCode5());
				existingVendorLocations.setCreatedBy(vendorlocations.getCreatedBy());
				existingVendorLocations.setCreatedOn(vendorlocations.getCreatedOn());
				existingVendorLocations.setModifiedBy(vendorlocations.getModifiedBy());
				existingVendorLocations.setModifiedOn(vendorlocations.getModifiedOn());
				existingVendorLocations.setZipCode4(vendorlocations.getZipCode4());
			}
			vendorlocations = vendorLocationsDAO.store(existingVendorLocations);
		} else {
			vendorlocations = vendorLocationsDAO.store(vendorlocations);
		}
		vendorLocationsDAO.flush();
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsIndStates(Integer vendorlocations_locationId, Integer related_indstates_stateId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		IndStates related_indstates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId, -1, -1);

		vendorlocations.setIndStates(null);
		related_indstates.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		indStatesDAO.remove(related_indstates);
		indStatesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Load an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public Set<VendorLocations> loadVendorLocationss() {
		return vendorLocationsDAO.findAllVendorLocationss();
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsUsCities(Integer vendorlocations_locationId, Integer related_uscities_cityId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		UsCities related_uscities = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId, -1, -1);

		vendorlocations.setUsCities(null);
		related_uscities.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		usCitiesDAO.remove(related_uscities);
		usCitiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsProductses(Integer vendorlocations_locationId, Integer related_productses_productId) {
		Products related_productses = productsDAO.findProductsByPrimaryKey(related_productses_productId, -1, -1);

		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		related_productses.setVendorLocations(null);
		vendorlocations.getProductses().remove(related_productses);

		productsDAO.remove(related_productses);
		productsDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsUsStates(Integer locationId, UsStates related_usstates) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setUsStates(related_usstates);
		related_usstates.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsUsCounties(Integer locationId, UsCounties related_uscounties) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		vendorlocations.setUsCounties(related_uscounties);
		related_uscounties.getVendorLocationses().add(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public VendorLocations saveVendorLocationsCartItemses(Integer locationId, CartItems related_cartitemses) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationId, -1, -1);
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

		related_cartitemses.setVendorLocations(vendorlocations);
		vendorlocations.getCartItemses().add(related_cartitemses);
		related_cartitemses = cartItemsDAO.store(related_cartitemses);
		cartItemsDAO.flush();

		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		return vendorlocations;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsUsCounties(Integer vendorlocations_locationId, Integer related_uscounties_countyId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		UsCounties related_uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId, -1, -1);

		vendorlocations.setUsCounties(null);
		related_uscounties.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		usCountiesDAO.remove(related_uscounties);
		usCountiesDAO.flush();

		return vendorlocations;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public VendorLocations deleteVendorLocationsUsStates(Integer vendorlocations_locationId, Integer related_usstates_stateId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);
		UsStates related_usstates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId, -1, -1);

		vendorlocations.setUsStates(null);
		related_usstates.getVendorLocationses().remove(vendorlocations);
		vendorlocations = vendorLocationsDAO.store(vendorlocations);
		vendorLocationsDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		usStatesDAO.remove(related_usstates);
		usStatesDAO.flush();

		return vendorlocations;
	}
}
