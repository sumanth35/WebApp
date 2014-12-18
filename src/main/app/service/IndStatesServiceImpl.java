package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for IndStates entities
 * 
 */

@Service("IndStatesService")
@Transactional
public class IndStatesServiceImpl implements IndStatesService {

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
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

	/**
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Instantiates a new IndStatesServiceImpl.
	 *
	 */
	public IndStatesServiceImpl() {
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesRecipientLocations(Integer stateId, RecipientLocation related_recipientlocations) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		RecipientLocation existingrecipientLocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations.getRecipientLocationId());

		// copy into the existing record to preserve existing relationships
		if (existingrecipientLocations != null) {
			existingrecipientLocations.setRecipientLocationId(related_recipientlocations.getRecipientLocationId());
			existingrecipientLocations.setRecipientFirstName(related_recipientlocations.getRecipientFirstName());
			existingrecipientLocations.setRecipientMiddleName(related_recipientlocations.getRecipientMiddleName());
			existingrecipientLocations.setRecipientLastName(related_recipientlocations.getRecipientLastName());
			existingrecipientLocations.setRecipientSuffix(related_recipientlocations.getRecipientSuffix());
			existingrecipientLocations.setRecipientTitle(related_recipientlocations.getRecipientTitle());
			existingrecipientLocations.setAddressLine1(related_recipientlocations.getAddressLine1());
			existingrecipientLocations.setAddressLine2(related_recipientlocations.getAddressLine2());
			existingrecipientLocations.setAddressLine3(related_recipientlocations.getAddressLine3());
			existingrecipientLocations.setEmail(related_recipientlocations.getEmail());
			existingrecipientLocations.setContactNumber(related_recipientlocations.getContactNumber());
			existingrecipientLocations.setFax(related_recipientlocations.getFax());
			existingrecipientLocations.setZipCode5(related_recipientlocations.getZipCode5());
			existingrecipientLocations.setZipCode4(related_recipientlocations.getZipCode4());
			existingrecipientLocations.setCreatedOn(related_recipientlocations.getCreatedOn());
			existingrecipientLocations.setCreatedBy(related_recipientlocations.getCreatedBy());
			existingrecipientLocations.setModifiedOn(related_recipientlocations.getModifiedOn());
			existingrecipientLocations.setModifiedBy(related_recipientlocations.getModifiedBy());
			related_recipientlocations = existingrecipientLocations;
		} else {
			related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
			recipientLocationDAO.flush();
		}

		related_recipientlocations.setIndStates(indstates);
		indstates.getRecipientLocations().add(related_recipientlocations);
		related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
		recipientLocationDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesCountries(Integer stateId, Countries related_countries) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
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

		indstates.setCountries(related_countries);
		related_countries.getIndStateses().add(indstates);
		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesRecipientLocations(Integer indstates_stateId, Integer related_recipientlocations_recipientLocationId) {
		RecipientLocation related_recipientlocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_recipientlocations.setIndStates(null);
		indstates.getRecipientLocations().remove(related_recipientlocations);

		recipientLocationDAO.remove(related_recipientlocations);
		recipientLocationDAO.flush();

		return indstates;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesIndDistricts(Integer stateId, IndDistrict related_inddistricts) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		IndDistrict existingindDistricts = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistricts.getDistrictId());

		// copy into the existing record to preserve existing relationships
		if (existingindDistricts != null) {
			existingindDistricts.setDistrictId(related_inddistricts.getDistrictId());
			existingindDistricts.setDistrictName(related_inddistricts.getDistrictName());
			existingindDistricts.setDistrictAbbr(related_inddistricts.getDistrictAbbr());
			existingindDistricts.setCreatedBy(related_inddistricts.getCreatedBy());
			existingindDistricts.setCreatedOn(related_inddistricts.getCreatedOn());
			existingindDistricts.setModifiedOn(related_inddistricts.getModifiedOn());
			existingindDistricts.setModifiedBy(related_inddistricts.getModifiedBy());
			related_inddistricts = existingindDistricts;
		} else {
			related_inddistricts = indDistrictDAO.store(related_inddistricts);
			indDistrictDAO.flush();
		}

		related_inddistricts.setIndStates(indstates);
		indstates.getIndDistricts().add(related_inddistricts);
		related_inddistricts = indDistrictDAO.store(related_inddistricts);
		indDistrictDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesCountries(Integer indstates_stateId, Integer related_countries_countryId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);
		Countries related_countries = countriesDAO.findCountriesByPrimaryKey(related_countries_countryId, -1, -1);

		indstates.setCountries(null);
		related_countries.getIndStateses().remove(indstates);
		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		countriesDAO.remove(related_countries);
		countriesDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public void deleteIndStates(IndStates indstates) {
		indStatesDAO.remove(indstates);
		indStatesDAO.flush();
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesCustomerProfiles(Integer stateId, CustomerProfile related_customerprofiles) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		CustomerProfile existingcustomerProfiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles.getCustomerId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomerProfiles != null) {
			existingcustomerProfiles.setCustomerId(related_customerprofiles.getCustomerId());
			existingcustomerProfiles.setCustomerName(related_customerprofiles.getCustomerName());
			existingcustomerProfiles.setCustomerPassword(related_customerprofiles.getCustomerPassword());
			existingcustomerProfiles.setCustomerEmail(related_customerprofiles.getCustomerEmail());
			existingcustomerProfiles.setProfileStatus(related_customerprofiles.getProfileStatus());
			existingcustomerProfiles.setPhone1(related_customerprofiles.getPhone1());
			existingcustomerProfiles.setPhone2(related_customerprofiles.getPhone2());
			existingcustomerProfiles.setFirstName(related_customerprofiles.getFirstName());
			existingcustomerProfiles.setLastName(related_customerprofiles.getLastName());
			existingcustomerProfiles.setMiddleName(related_customerprofiles.getMiddleName());
			existingcustomerProfiles.setNameSuffix(related_customerprofiles.getNameSuffix());
			existingcustomerProfiles.setNameTitle(related_customerprofiles.getNameTitle());
			existingcustomerProfiles.setLastSuccessLogin(related_customerprofiles.getLastSuccessLogin());
			existingcustomerProfiles.setVisits(related_customerprofiles.getVisits());
			existingcustomerProfiles.setCreatedIp(related_customerprofiles.getCreatedIp());
			existingcustomerProfiles.setAddressLine1(related_customerprofiles.getAddressLine1());
			existingcustomerProfiles.setAddressLine2(related_customerprofiles.getAddressLine2());
			existingcustomerProfiles.setAddressLine3(related_customerprofiles.getAddressLine3());
			existingcustomerProfiles.setZipCode5(related_customerprofiles.getZipCode5());
			existingcustomerProfiles.setZipCode4(related_customerprofiles.getZipCode4());
			existingcustomerProfiles.setLastLoginIp(related_customerprofiles.getLastLoginIp());
			existingcustomerProfiles.setCreatedOn(related_customerprofiles.getCreatedOn());
			existingcustomerProfiles.setCreatedBy(related_customerprofiles.getCreatedBy());
			existingcustomerProfiles.setModifiedOn(related_customerprofiles.getModifiedOn());
			existingcustomerProfiles.setModifiedBy(related_customerprofiles.getModifiedBy());
			related_customerprofiles = existingcustomerProfiles;
		} else {
			related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
			customerProfileDAO.flush();
		}

		related_customerprofiles.setIndStates(indstates);
		indstates.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesVendorOrganizationses(Integer indstates_stateId, Integer related_vendororganizationses_organizationId) {
		VendorOrganizations related_vendororganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_vendororganizationses.setIndStates(null);
		indstates.getVendorOrganizationses().remove(related_vendororganizationses);

		vendorOrganizationsDAO.remove(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesIndCitieses(Integer indstates_stateId, Integer related_indcitieses_cityId) {
		IndCities related_indcitieses = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcitieses_cityId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_indcitieses.setIndStates(null);
		indstates.getIndCitieses().remove(related_indcitieses);

		indCitiesDAO.remove(related_indcitieses);
		indCitiesDAO.flush();

		return indstates;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesCustomerProfiles(Integer indstates_stateId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_customerprofiles.setIndStates(null);
		indstates.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return indstates;
	}

	/**
	 * Return a count of all IndStates entity
	 * 
	 */
	@Transactional
	public Integer countIndStatess() {
		return ((Long) indStatesDAO.createQuerySingleResult("select count(o) from IndStates o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public void saveIndStates(IndStates indstates) {
		IndStates existingIndStates = indStatesDAO.findIndStatesByPrimaryKey(indstates.getStateId());

		if (existingIndStates != null) {
			if (existingIndStates != indstates) {
				existingIndStates.setStateId(indstates.getStateId());
				existingIndStates.setStateName(indstates.getStateName());
				existingIndStates.setStateAbbr(indstates.getStateAbbr());
				existingIndStates.setCreatedBy(indstates.getCreatedBy());
				existingIndStates.setCreatedOn(indstates.getCreatedOn());
				existingIndStates.setModifiedOn(indstates.getModifiedOn());
				existingIndStates.setModifiedBy(indstates.getModifiedBy());
			}
			indstates = indStatesDAO.store(existingIndStates);
		} else {
			indstates = indStatesDAO.store(indstates);
		}
		indStatesDAO.flush();
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesVendorLocationses(Integer stateId, VendorLocations related_vendorlocationses) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		VendorLocations existingvendorLocationses = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses.getLocationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorLocationses != null) {
			existingvendorLocationses.setLocationId(related_vendorlocationses.getLocationId());
			existingvendorLocationses.setLocationName(related_vendorlocationses.getLocationName());
			existingvendorLocationses.setLocationAdminFirstName(related_vendorlocationses.getLocationAdminFirstName());
			existingvendorLocationses.setLocationAdminMiddleName(related_vendorlocationses.getLocationAdminMiddleName());
			existingvendorLocationses.setLocationAdminLastName(related_vendorlocationses.getLocationAdminLastName());
			existingvendorLocationses.setLocationAdminSuffix(related_vendorlocationses.getLocationAdminSuffix());
			existingvendorLocationses.setStatus(related_vendorlocationses.getStatus());
			existingvendorLocationses.setPhone1(related_vendorlocationses.getPhone1());
			existingvendorLocationses.setPhone2(related_vendorlocationses.getPhone2());
			existingvendorLocationses.setFax(related_vendorlocationses.getFax());
			existingvendorLocationses.setEmail(related_vendorlocationses.getEmail());
			existingvendorLocationses.setAddressLine1(related_vendorlocationses.getAddressLine1());
			existingvendorLocationses.setAddressLine2(related_vendorlocationses.getAddressLine2());
			existingvendorLocationses.setAddressLine3(related_vendorlocationses.getAddressLine3());
			existingvendorLocationses.setZipCode5(related_vendorlocationses.getZipCode5());
			existingvendorLocationses.setCreatedBy(related_vendorlocationses.getCreatedBy());
			existingvendorLocationses.setCreatedOn(related_vendorlocationses.getCreatedOn());
			existingvendorLocationses.setModifiedBy(related_vendorlocationses.getModifiedBy());
			existingvendorLocationses.setModifiedOn(related_vendorlocationses.getModifiedOn());
			existingvendorLocationses.setZipCode4(related_vendorlocationses.getZipCode4());
			related_vendorlocationses = existingvendorLocationses;
		} else {
			related_vendorlocationses = vendorLocationsDAO.store(related_vendorlocationses);
			vendorLocationsDAO.flush();
		}

		related_vendorlocationses.setIndStates(indstates);
		indstates.getVendorLocationses().add(related_vendorlocationses);
		related_vendorlocationses = vendorLocationsDAO.store(related_vendorlocationses);
		vendorLocationsDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}

	/**
	 */
	@Transactional
	public IndStates findIndStatesByPrimaryKey(Integer stateId) {
		return indStatesDAO.findIndStatesByPrimaryKey(stateId);
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesVendorLocationses(Integer indstates_stateId, Integer related_vendorlocationses_locationId) {
		VendorLocations related_vendorlocationses = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_vendorlocationses.setIndStates(null);
		indstates.getVendorLocationses().remove(related_vendorlocationses);

		vendorLocationsDAO.remove(related_vendorlocationses);
		vendorLocationsDAO.flush();

		return indstates;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesIndCitieses(Integer stateId, IndCities related_indcitieses) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		IndCities existingindCitieses = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcitieses.getCityId());

		// copy into the existing record to preserve existing relationships
		if (existingindCitieses != null) {
			existingindCitieses.setCityId(related_indcitieses.getCityId());
			existingindCitieses.setCityName(related_indcitieses.getCityName());
			existingindCitieses.setCityAbbr(related_indcitieses.getCityAbbr());
			existingindCitieses.setCreatedOn(related_indcitieses.getCreatedOn());
			existingindCitieses.setCreatedBy(related_indcitieses.getCreatedBy());
			existingindCitieses.setModifiedOn(related_indcitieses.getModifiedOn());
			existingindCitieses.setModifiedBy(related_indcitieses.getModifiedBy());
			related_indcitieses = existingindCitieses;
		} else {
			related_indcitieses = indCitiesDAO.store(related_indcitieses);
			indCitiesDAO.flush();
		}

		related_indcitieses.setIndStates(indstates);
		indstates.getIndCitieses().add(related_indcitieses);
		related_indcitieses = indCitiesDAO.store(related_indcitieses);
		indCitiesDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}

	/**
	 * Return all IndStates entity
	 * 
	 */
	@Transactional
	public List<IndStates> findAllIndStatess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<IndStates>(indStatesDAO.findAllIndStatess(startResult, maxRows));
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public IndStates deleteIndStatesIndDistricts(Integer indstates_stateId, Integer related_inddistricts_districtId) {
		IndDistrict related_inddistricts = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistricts_districtId, -1, -1);

		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		related_inddistricts.setIndStates(null);
		indstates.getIndDistricts().remove(related_inddistricts);

		indDistrictDAO.remove(related_inddistricts);
		indDistrictDAO.flush();

		return indstates;
	}

	/**
	 * Load an existing IndStates entity
	 * 
	 */
	@Transactional
	public Set<IndStates> loadIndStatess() {
		return indStatesDAO.findAllIndStatess();
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public IndStates saveIndStatesVendorOrganizationses(Integer stateId, VendorOrganizations related_vendororganizationses) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateId, -1, -1);
		VendorOrganizations existingvendorOrganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses.getOrganizationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorOrganizationses != null) {
			existingvendorOrganizationses.setOrganizationId(related_vendororganizationses.getOrganizationId());
			existingvendorOrganizationses.setOrganizationBusinessName(related_vendororganizationses.getOrganizationBusinessName());
			existingvendorOrganizationses.setOrganizationTypeId(related_vendororganizationses.getOrganizationTypeId());
			existingvendorOrganizationses.setContactPersonFirstName(related_vendororganizationses.getContactPersonFirstName());
			existingvendorOrganizationses.setContactPersonMiddleName(related_vendororganizationses.getContactPersonMiddleName());
			existingvendorOrganizationses.setContactPersonLastName(related_vendororganizationses.getContactPersonLastName());
			existingvendorOrganizationses.setContactPersonSuffix(related_vendororganizationses.getContactPersonSuffix());
			existingvendorOrganizationses.setPhone1(related_vendororganizationses.getPhone1());
			existingvendorOrganizationses.setPhone2(related_vendororganizationses.getPhone2());
			existingvendorOrganizationses.setFax(related_vendororganizationses.getFax());
			existingvendorOrganizationses.setEmail(related_vendororganizationses.getEmail());
			existingvendorOrganizationses.setAddressLine1(related_vendororganizationses.getAddressLine1());
			existingvendorOrganizationses.setAddressLine2(related_vendororganizationses.getAddressLine2());
			existingvendorOrganizationses.setAddressLine3(related_vendororganizationses.getAddressLine3());
			existingvendorOrganizationses.setStatus(related_vendororganizationses.getStatus());
			existingvendorOrganizationses.setZipCode5(related_vendororganizationses.getZipCode5());
			existingvendorOrganizationses.setCreatedOn(related_vendororganizationses.getCreatedOn());
			existingvendorOrganizationses.setCreatedBy(related_vendororganizationses.getCreatedBy());
			existingvendorOrganizationses.setModifiedOn(related_vendororganizationses.getModifiedOn());
			existingvendorOrganizationses.setModifiedBy(related_vendororganizationses.getModifiedBy());
			existingvendorOrganizationses.setZipCode4(related_vendororganizationses.getZipCode4());
			related_vendororganizationses = existingvendorOrganizationses;
		} else {
			related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
			vendorOrganizationsDAO.flush();
		}

		related_vendororganizationses.setIndStates(indstates);
		indstates.getVendorOrganizationses().add(related_vendororganizationses);
		related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		indstates = indStatesDAO.store(indstates);
		indStatesDAO.flush();

		return indstates;
	}
}
