package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Countries entities
 * 
 */

@Service("CountriesService")
@Transactional
public class CountriesServiceImpl implements CountriesService {

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
	 * DAO injected by Spring that manages UsStates entities
	 * 
	 */
	@Autowired
	private UsStatesDAO usStatesDAO;

	/**
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Instantiates a new CountriesServiceImpl.
	 *
	 */
	public CountriesServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Countries findCountriesByPrimaryKey(Integer countryId) {
		return countriesDAO.findCountriesByPrimaryKey(countryId);
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public Countries deleteCountriesIndStateses(Integer countries_countryId, Integer related_indstateses_stateId) {
		IndStates related_indstateses = indStatesDAO.findIndStatesByPrimaryKey(related_indstateses_stateId, -1, -1);

		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		related_indstateses.setCountries(null);
		countries.getIndStateses().remove(related_indstateses);

		indStatesDAO.remove(related_indstateses);
		indStatesDAO.flush();

		return countries;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public Countries saveCountriesVendorOrganizationses(Integer countryId, VendorOrganizations related_vendororganizationses) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryId, -1, -1);
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

		related_vendororganizationses.setCountries(countries);
		countries.getVendorOrganizationses().add(related_vendororganizationses);
		related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		countries = countriesDAO.store(countries);
		countriesDAO.flush();

		return countries;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public void deleteCountries(Countries countries) {
		countriesDAO.remove(countries);
		countriesDAO.flush();
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public Countries deleteCountriesVendorOrganizationses(Integer countries_countryId, Integer related_vendororganizationses_organizationId) {
		VendorOrganizations related_vendororganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId, -1, -1);

		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		related_vendororganizationses.setCountries(null);
		countries.getVendorOrganizationses().remove(related_vendororganizationses);

		vendorOrganizationsDAO.remove(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		return countries;
	}

	/**
	 * Return all Countries entity
	 * 
	 */
	@Transactional
	public List<Countries> findAllCountriess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Countries>(countriesDAO.findAllCountriess(startResult, maxRows));
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public Countries saveCountriesRecipientLocations(Integer countryId, RecipientLocation related_recipientlocations) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryId, -1, -1);
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

		related_recipientlocations.setCountries(countries);
		countries.getRecipientLocations().add(related_recipientlocations);
		related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
		recipientLocationDAO.flush();

		countries = countriesDAO.store(countries);
		countriesDAO.flush();

		return countries;
	}

	/**
	 * Load an existing Countries entity
	 * 
	 */
	@Transactional
	public Set<Countries> loadCountriess() {
		return countriesDAO.findAllCountriess();
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public Countries saveCountriesUsStateses(Integer countryId, UsStates related_usstateses) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryId, -1, -1);
		UsStates existingusStateses = usStatesDAO.findUsStatesByPrimaryKey(related_usstateses.getStateId());

		// copy into the existing record to preserve existing relationships
		if (existingusStateses != null) {
			existingusStateses.setStateId(related_usstateses.getStateId());
			existingusStateses.setStateName(related_usstateses.getStateName());
			existingusStateses.setStateAbbr(related_usstateses.getStateAbbr());
			existingusStateses.setCreatedBy(related_usstateses.getCreatedBy());
			existingusStateses.setCreatedOn(related_usstateses.getCreatedOn());
			existingusStateses.setModifiedOn(related_usstateses.getModifiedOn());
			existingusStateses.setModifiedBy(related_usstateses.getModifiedBy());
			related_usstateses = existingusStateses;
		} else {
			related_usstateses = usStatesDAO.store(related_usstateses);
			usStatesDAO.flush();
		}

		related_usstateses.setCountries(countries);
		countries.getUsStateses().add(related_usstateses);
		related_usstateses = usStatesDAO.store(related_usstateses);
		usStatesDAO.flush();

		countries = countriesDAO.store(countries);
		countriesDAO.flush();

		return countries;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public Countries deleteCountriesRecipientLocations(Integer countries_countryId, Integer related_recipientlocations_recipientLocationId) {
		RecipientLocation related_recipientlocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId, -1, -1);

		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		related_recipientlocations.setCountries(null);
		countries.getRecipientLocations().remove(related_recipientlocations);

		recipientLocationDAO.remove(related_recipientlocations);
		recipientLocationDAO.flush();

		return countries;
	}

	/**
	 * Return a count of all Countries entity
	 * 
	 */
	@Transactional
	public Integer countCountriess() {
		return ((Long) countriesDAO.createQuerySingleResult("select count(o) from Countries o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public Countries saveCountriesIndStateses(Integer countryId, IndStates related_indstateses) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryId, -1, -1);
		IndStates existingindStateses = indStatesDAO.findIndStatesByPrimaryKey(related_indstateses.getStateId());

		// copy into the existing record to preserve existing relationships
		if (existingindStateses != null) {
			existingindStateses.setStateId(related_indstateses.getStateId());
			existingindStateses.setStateName(related_indstateses.getStateName());
			existingindStateses.setStateAbbr(related_indstateses.getStateAbbr());
			existingindStateses.setCreatedBy(related_indstateses.getCreatedBy());
			existingindStateses.setCreatedOn(related_indstateses.getCreatedOn());
			existingindStateses.setModifiedOn(related_indstateses.getModifiedOn());
			existingindStateses.setModifiedBy(related_indstateses.getModifiedBy());
			related_indstateses = existingindStateses;
		} else {
			related_indstateses = indStatesDAO.store(related_indstateses);
			indStatesDAO.flush();
		}

		related_indstateses.setCountries(countries);
		countries.getIndStateses().add(related_indstateses);
		related_indstateses = indStatesDAO.store(related_indstateses);
		indStatesDAO.flush();

		countries = countriesDAO.store(countries);
		countriesDAO.flush();

		return countries;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public Countries deleteCountriesUsStateses(Integer countries_countryId, Integer related_usstateses_stateId) {
		UsStates related_usstateses = usStatesDAO.findUsStatesByPrimaryKey(related_usstateses_stateId, -1, -1);

		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		related_usstateses.setCountries(null);
		countries.getUsStateses().remove(related_usstateses);

		usStatesDAO.remove(related_usstateses);
		usStatesDAO.flush();

		return countries;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public Countries saveCountriesCustomerProfiles(Integer countryId, CustomerProfile related_customerprofiles) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryId, -1, -1);
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

		related_customerprofiles.setCountries(countries);
		countries.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		countries = countriesDAO.store(countries);
		countriesDAO.flush();

		return countries;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public Countries deleteCountriesCustomerProfiles(Integer countries_countryId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		related_customerprofiles.setCountries(null);
		countries.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return countries;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public void saveCountries(Countries countries) {
		Countries existingCountries = countriesDAO.findCountriesByPrimaryKey(countries.getCountryId());

		if (existingCountries != null) {
			if (existingCountries != countries) {
				existingCountries.setCountryId(countries.getCountryId());
				existingCountries.setCountryName(countries.getCountryName());
				existingCountries.setCountryCode(countries.getCountryCode());
				existingCountries.setCountryAbbr(countries.getCountryAbbr());
				existingCountries.setCreatedOn(countries.getCreatedOn());
				existingCountries.setCreatedBy(countries.getCreatedBy());
				existingCountries.setModifiedOn(countries.getModifiedOn());
				existingCountries.setModifiedBy(countries.getModifiedBy());
			}
			countries = countriesDAO.store(existingCountries);
		} else {
			countries = countriesDAO.store(countries);
		}
		countriesDAO.flush();
	}
}
