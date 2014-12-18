package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CountriesDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.ShipmentDetailsDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for RecipientLocation entities
 * 
 */

@Service("RecipientLocationService")
@Transactional
public class RecipientLocationServiceImpl implements RecipientLocationService {

	/**
	 * DAO injected by Spring that manages Countries entities
	 * 
	 */
	@Autowired
	private CountriesDAO countriesDAO;

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
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

	/**
	 * DAO injected by Spring that manages ShipmentDetails entities
	 * 
	 */
	@Autowired
	private ShipmentDetailsDAO shipmentDetailsDAO;

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
	 * Instantiates a new RecipientLocationServiceImpl.
	 *
	 */
	public RecipientLocationServiceImpl() {
	}

	/**
	 * Return a count of all RecipientLocation entity
	 * 
	 */
	@Transactional
	public Integer countRecipientLocations() {
		return ((Long) recipientLocationDAO.createQuerySingleResult("select count(o) from RecipientLocation o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId) {
		return recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId);
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationIndCities(Integer recipientlocation_recipientLocationId, Integer related_indcities_cityId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		IndCities related_indcities = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId, -1, -1);

		recipientlocation.setIndCities(null);
		related_indcities.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		indCitiesDAO.remove(related_indcities);
		indCitiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationIndDistrict(Integer recipientLocationId, IndDistrict related_inddistrict) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setIndDistrict(related_inddistrict);
		related_inddistrict.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationUsStates(Integer recipientlocation_recipientLocationId, Integer related_usstates_stateId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		UsStates related_usstates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId, -1, -1);

		recipientlocation.setUsStates(null);
		related_usstates.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		usStatesDAO.remove(related_usstates);
		usStatesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationUsCounties(Integer recipientLocationId, UsCounties related_uscounties) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setUsCounties(related_uscounties);
		related_uscounties.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationCountries(Integer recipientLocationId, Countries related_countries) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setCountries(related_countries);
		related_countries.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationUsCities(Integer recipientlocation_recipientLocationId, Integer related_uscities_cityId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		UsCities related_uscities = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId, -1, -1);

		recipientlocation.setUsCities(null);
		related_uscities.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		usCitiesDAO.remove(related_uscities);
		usCitiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationUsCities(Integer recipientLocationId, UsCities related_uscities) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setUsCities(related_uscities);
		related_uscities.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationIndDistrict(Integer recipientlocation_recipientLocationId, Integer related_inddistrict_districtId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		IndDistrict related_inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId, -1, -1);

		recipientlocation.setIndDistrict(null);
		related_inddistrict.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		indDistrictDAO.remove(related_inddistrict);
		indDistrictDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationIndStates(Integer recipientlocation_recipientLocationId, Integer related_indstates_stateId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		IndStates related_indstates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId, -1, -1);

		recipientlocation.setIndStates(null);
		related_indstates.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		indStatesDAO.remove(related_indstates);
		indStatesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Return all RecipientLocation entity
	 * 
	 */
	@Transactional
	public List<RecipientLocation> findAllRecipientLocations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<RecipientLocation>(recipientLocationDAO.findAllRecipientLocations(startResult, maxRows));
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationUsCounties(Integer recipientlocation_recipientLocationId, Integer related_uscounties_countyId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		UsCounties related_uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId, -1, -1);

		recipientlocation.setUsCounties(null);
		related_uscounties.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		usCountiesDAO.remove(related_uscounties);
		usCountiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationShipmentDetailses(Integer recipientLocationId, ShipmentDetails related_shipmentdetailses) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
		ShipmentDetails existingshipmentDetailses = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses.getShipmentId());

		// copy into the existing record to preserve existing relationships
		if (existingshipmentDetailses != null) {
			existingshipmentDetailses.setShipmentId(related_shipmentdetailses.getShipmentId());
			existingshipmentDetailses.setShipmentCarrier(related_shipmentdetailses.getShipmentCarrier());
			existingshipmentDetailses.setTrackingNumber(related_shipmentdetailses.getTrackingNumber());
			existingshipmentDetailses.setExpectedDelivery(related_shipmentdetailses.getExpectedDelivery());
			existingshipmentDetailses.setCreatedOn(related_shipmentdetailses.getCreatedOn());
			existingshipmentDetailses.setCreatedBy(related_shipmentdetailses.getCreatedBy());
			existingshipmentDetailses.setModifiedOn(related_shipmentdetailses.getModifiedOn());
			existingshipmentDetailses.setModifiedBy(related_shipmentdetailses.getModifiedBy());
			existingshipmentDetailses.setStatus(related_shipmentdetailses.getStatus());
			related_shipmentdetailses = existingshipmentDetailses;
		} else {
			related_shipmentdetailses = shipmentDetailsDAO.store(related_shipmentdetailses);
			shipmentDetailsDAO.flush();
		}

		related_shipmentdetailses.setRecipientLocation(recipientlocation);
		recipientlocation.getShipmentDetailses().add(related_shipmentdetailses);
		related_shipmentdetailses = shipmentDetailsDAO.store(related_shipmentdetailses);
		shipmentDetailsDAO.flush();

		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		return recipientlocation;
	}

	/**
	 * Load an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public Set<RecipientLocation> loadRecipientLocations() {
		return recipientLocationDAO.findAllRecipientLocations();
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationIndCities(Integer recipientLocationId, IndCities related_indcities) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setIndCities(related_indcities);
		related_indcities.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationCountries(Integer recipientlocation_recipientLocationId, Integer related_countries_countryId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);
		Countries related_countries = countriesDAO.findCountriesByPrimaryKey(related_countries_countryId, -1, -1);

		recipientlocation.setCountries(null);
		related_countries.getRecipientLocations().remove(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		countriesDAO.remove(related_countries);
		countriesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationIndStates(Integer recipientLocationId, IndStates related_indstates) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setIndStates(related_indstates);
		related_indstates.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		return recipientlocation;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public void saveRecipientLocation(RecipientLocation recipientlocation) {
		RecipientLocation existingRecipientLocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation.getRecipientLocationId());

		if (existingRecipientLocation != null) {
			if (existingRecipientLocation != recipientlocation) {
				existingRecipientLocation.setRecipientLocationId(recipientlocation.getRecipientLocationId());
				existingRecipientLocation.setRecipientFirstName(recipientlocation.getRecipientFirstName());
				existingRecipientLocation.setRecipientMiddleName(recipientlocation.getRecipientMiddleName());
				existingRecipientLocation.setRecipientLastName(recipientlocation.getRecipientLastName());
				existingRecipientLocation.setRecipientSuffix(recipientlocation.getRecipientSuffix());
				existingRecipientLocation.setRecipientTitle(recipientlocation.getRecipientTitle());
				existingRecipientLocation.setAddressLine1(recipientlocation.getAddressLine1());
				existingRecipientLocation.setAddressLine2(recipientlocation.getAddressLine2());
				existingRecipientLocation.setAddressLine3(recipientlocation.getAddressLine3());
				existingRecipientLocation.setEmail(recipientlocation.getEmail());
				existingRecipientLocation.setContactNumber(recipientlocation.getContactNumber());
				existingRecipientLocation.setFax(recipientlocation.getFax());
				existingRecipientLocation.setZipCode5(recipientlocation.getZipCode5());
				existingRecipientLocation.setZipCode4(recipientlocation.getZipCode4());
				existingRecipientLocation.setCreatedOn(recipientlocation.getCreatedOn());
				existingRecipientLocation.setCreatedBy(recipientlocation.getCreatedBy());
				existingRecipientLocation.setModifiedOn(recipientlocation.getModifiedOn());
				existingRecipientLocation.setModifiedBy(recipientlocation.getModifiedBy());
			}
			recipientlocation = recipientLocationDAO.store(existingRecipientLocation);
		} else {
			recipientlocation = recipientLocationDAO.store(recipientlocation);
		}
		recipientLocationDAO.flush();
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public RecipientLocation deleteRecipientLocationShipmentDetailses(Integer recipientlocation_recipientLocationId, Integer related_shipmentdetailses_shipmentId) {
		ShipmentDetails related_shipmentdetailses = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses_shipmentId, -1, -1);

		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);

		related_shipmentdetailses.setRecipientLocation(null);
		recipientlocation.getShipmentDetailses().remove(related_shipmentdetailses);

		shipmentDetailsDAO.remove(related_shipmentdetailses);
		shipmentDetailsDAO.flush();

		return recipientlocation;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public void deleteRecipientLocation(RecipientLocation recipientlocation) {
		recipientLocationDAO.remove(recipientlocation);
		recipientLocationDAO.flush();
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public RecipientLocation saveRecipientLocationUsStates(Integer recipientLocationId, UsStates related_usstates) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
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

		recipientlocation.setUsStates(related_usstates);
		related_usstates.getRecipientLocations().add(recipientlocation);
		recipientlocation = recipientLocationDAO.store(recipientlocation);
		recipientLocationDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		return recipientlocation;
	}
}
