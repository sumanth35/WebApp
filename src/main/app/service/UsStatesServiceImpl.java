package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.RecipientLocation;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for UsStates entities
 * 
 */

@Service("UsStatesService")
@Transactional
public class UsStatesServiceImpl implements UsStatesService {

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
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

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
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Instantiates a new UsStatesServiceImpl.
	 *
	 */
	public UsStatesServiceImpl() {
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesCountries(Integer usstates_stateId, Integer related_countries_countryId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);
		Countries related_countries = countriesDAO.findCountriesByPrimaryKey(related_countries_countryId, -1, -1);

		usstates.setCountries(null);
		related_countries.getUsStateses().remove(usstates);
		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		countriesDAO.remove(related_countries);
		countriesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesCustomerProfiles(Integer usstates_stateId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_customerprofiles.setUsStates(null);
		usstates.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return usstates;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesUsCitieses(Integer stateId, UsCities related_uscitieses) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
		UsCities existingusCitieses = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscitieses.getCityId());

		// copy into the existing record to preserve existing relationships
		if (existingusCitieses != null) {
			existingusCitieses.setCityId(related_uscitieses.getCityId());
			existingusCitieses.setCityName(related_uscitieses.getCityName());
			existingusCitieses.setCityAbbr(related_uscitieses.getCityAbbr());
			existingusCitieses.setCreatedBy(related_uscitieses.getCreatedBy());
			existingusCitieses.setCreatedOn(related_uscitieses.getCreatedOn());
			existingusCitieses.setModifiedBy(related_uscitieses.getModifiedBy());
			existingusCitieses.setModifiedOn(related_uscitieses.getModifiedOn());
			related_uscitieses = existingusCitieses;
		} else {
			related_uscitieses = usCitiesDAO.store(related_uscitieses);
			usCitiesDAO.flush();
		}

		related_uscitieses.setUsStates(usstates);
		usstates.getUsCitieses().add(related_uscitieses);
		related_uscitieses = usCitiesDAO.store(related_uscitieses);
		usCitiesDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesUsCitieses(Integer usstates_stateId, Integer related_uscitieses_cityId) {
		UsCities related_uscitieses = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscitieses_cityId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_uscitieses.setUsStates(null);
		usstates.getUsCitieses().remove(related_uscitieses);

		usCitiesDAO.remove(related_uscitieses);
		usCitiesDAO.flush();

		return usstates;
	}

	/**
	 * Load an existing UsStates entity
	 * 
	 */
	@Transactional
	public Set<UsStates> loadUsStatess() {
		return usStatesDAO.findAllUsStatess();
	}

	/**
	 */
	@Transactional
	public UsStates findUsStatesByPrimaryKey(Integer stateId) {
		return usStatesDAO.findUsStatesByPrimaryKey(stateId);
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesVendorLocationses(Integer stateId, VendorLocations related_vendorlocationses) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
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

		related_vendorlocationses.setUsStates(usstates);
		usstates.getVendorLocationses().add(related_vendorlocationses);
		related_vendorlocationses = vendorLocationsDAO.store(related_vendorlocationses);
		vendorLocationsDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesCountries(Integer stateId, Countries related_countries) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
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

		usstates.setCountries(related_countries);
		related_countries.getUsStateses().add(usstates);
		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		return usstates;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesCustomerProfiles(Integer stateId, CustomerProfile related_customerprofiles) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
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

		related_customerprofiles.setUsStates(usstates);
		usstates.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesVendorOrganizationses(Integer usstates_stateId, Integer related_vendororganizationses_organizationId) {
		VendorOrganizations related_vendororganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_vendororganizationses.setUsStates(null);
		usstates.getVendorOrganizationses().remove(related_vendororganizationses);

		vendorOrganizationsDAO.remove(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		return usstates;
	}

	/**
	 * Return all UsStates entity
	 * 
	 */
	@Transactional
	public List<UsStates> findAllUsStatess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<UsStates>(usStatesDAO.findAllUsStatess(startResult, maxRows));
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesVendorOrganizationses(Integer stateId, VendorOrganizations related_vendororganizationses) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
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

		related_vendororganizationses.setUsStates(usstates);
		usstates.getVendorOrganizationses().add(related_vendororganizationses);
		related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesUsCountieses(Integer usstates_stateId, Integer related_uscountieses_countyId) {
		UsCounties related_uscountieses = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscountieses_countyId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_uscountieses.setUsStates(null);
		usstates.getUsCountieses().remove(related_uscountieses);

		usCountiesDAO.remove(related_uscountieses);
		usCountiesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public void deleteUsStates(UsStates usstates) {
		usStatesDAO.remove(usstates);
		usStatesDAO.flush();
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesRecipientLocations(Integer stateId, RecipientLocation related_recipientlocations) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
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

		related_recipientlocations.setUsStates(usstates);
		usstates.getRecipientLocations().add(related_recipientlocations);
		related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
		recipientLocationDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesVendorLocationses(Integer usstates_stateId, Integer related_vendorlocationses_locationId) {
		VendorLocations related_vendorlocationses = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_vendorlocationses.setUsStates(null);
		usstates.getVendorLocationses().remove(related_vendorlocationses);

		vendorLocationsDAO.remove(related_vendorlocationses);
		vendorLocationsDAO.flush();

		return usstates;
	}

	/**
	 * Return a count of all UsStates entity
	 * 
	 */
	@Transactional
	public Integer countUsStatess() {
		return ((Long) usStatesDAO.createQuerySingleResult("select count(o) from UsStates o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public void saveUsStates(UsStates usstates) {
		UsStates existingUsStates = usStatesDAO.findUsStatesByPrimaryKey(usstates.getStateId());

		if (existingUsStates != null) {
			if (existingUsStates != usstates) {
				existingUsStates.setStateId(usstates.getStateId());
				existingUsStates.setStateName(usstates.getStateName());
				existingUsStates.setStateAbbr(usstates.getStateAbbr());
				existingUsStates.setCreatedBy(usstates.getCreatedBy());
				existingUsStates.setCreatedOn(usstates.getCreatedOn());
				existingUsStates.setModifiedOn(usstates.getModifiedOn());
				existingUsStates.setModifiedBy(usstates.getModifiedBy());
			}
			usstates = usStatesDAO.store(existingUsStates);
		} else {
			usstates = usStatesDAO.store(usstates);
		}
		usStatesDAO.flush();
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public UsStates deleteUsStatesRecipientLocations(Integer usstates_stateId, Integer related_recipientlocations_recipientLocationId) {
		RecipientLocation related_recipientlocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId, -1, -1);

		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		related_recipientlocations.setUsStates(null);
		usstates.getRecipientLocations().remove(related_recipientlocations);

		recipientLocationDAO.remove(related_recipientlocations);
		recipientLocationDAO.flush();

		return usstates;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public UsStates saveUsStatesUsCountieses(Integer stateId, UsCounties related_uscountieses) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateId, -1, -1);
		UsCounties existingusCountieses = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscountieses.getCountyId());

		// copy into the existing record to preserve existing relationships
		if (existingusCountieses != null) {
			existingusCountieses.setCountyId(related_uscountieses.getCountyId());
			existingusCountieses.setCountyName(related_uscountieses.getCountyName());
			existingusCountieses.setCountyAbbr(related_uscountieses.getCountyAbbr());
			existingusCountieses.setCreatedOn(related_uscountieses.getCreatedOn());
			existingusCountieses.setCreatedBy(related_uscountieses.getCreatedBy());
			existingusCountieses.setModifiedOn(related_uscountieses.getModifiedOn());
			existingusCountieses.setModifiedBy(related_uscountieses.getModifiedBy());
			related_uscountieses = existingusCountieses;
		} else {
			related_uscountieses = usCountiesDAO.store(related_uscountieses);
			usCountiesDAO.flush();
		}

		related_uscountieses.setUsStates(usstates);
		usstates.getUsCountieses().add(related_uscountieses);
		related_uscountieses = usCountiesDAO.store(related_uscountieses);
		usCountiesDAO.flush();

		usstates = usStatesDAO.store(usstates);
		usStatesDAO.flush();

		return usstates;
	}
}
