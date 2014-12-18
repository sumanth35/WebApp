package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CountriesDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for VendorOrganizations entities
 * 
 */

@Service("VendorOrganizationsService")
@Transactional
public class VendorOrganizationsServiceImpl implements
		VendorOrganizationsService {

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
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Instantiates a new VendorOrganizationsServiceImpl.
	 *
	 */
	public VendorOrganizationsServiceImpl() {
	}

	/**
	 * Load an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public Set<VendorOrganizations> loadVendorOrganizationss() {
		return vendorOrganizationsDAO.findAllVendorOrganizationss();
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsIndStates(Integer vendororganizations_organizationId, Integer related_indstates_stateId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		IndStates related_indstates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId, -1, -1);

		vendororganizations.setIndStates(null);
		related_indstates.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		indStatesDAO.remove(related_indstates);
		indStatesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsUsStates(Integer vendororganizations_organizationId, Integer related_usstates_stateId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		UsStates related_usstates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId, -1, -1);

		vendororganizations.setUsStates(null);
		related_usstates.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		usStatesDAO.remove(related_usstates);
		usStatesDAO.flush();

		return vendororganizations;
	}

	/**
	 */
	@Transactional
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId) {
		return vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId);
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsCountries(Integer vendororganizations_organizationId, Integer related_countries_countryId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		Countries related_countries = countriesDAO.findCountriesByPrimaryKey(related_countries_countryId, -1, -1);

		vendororganizations.setCountries(null);
		related_countries.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		countriesDAO.remove(related_countries);
		countriesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Return all VendorOrganizations entity
	 * 
	 */
	@Transactional
	public List<VendorOrganizations> findAllVendorOrganizationss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<VendorOrganizations>(vendorOrganizationsDAO.findAllVendorOrganizationss(startResult, maxRows));
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsCountries(Integer organizationId, Countries related_countries) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setCountries(related_countries);
		related_countries.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_countries = countriesDAO.store(related_countries);
		countriesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public void saveVendorOrganizations(VendorOrganizations vendororganizations) {
		VendorOrganizations existingVendorOrganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations.getOrganizationId());

		if (existingVendorOrganizations != null) {
			if (existingVendorOrganizations != vendororganizations) {
				existingVendorOrganizations.setOrganizationId(vendororganizations.getOrganizationId());
				existingVendorOrganizations.setOrganizationBusinessName(vendororganizations.getOrganizationBusinessName());
				existingVendorOrganizations.setOrganizationTypeId(vendororganizations.getOrganizationTypeId());
				existingVendorOrganizations.setContactPersonFirstName(vendororganizations.getContactPersonFirstName());
				existingVendorOrganizations.setContactPersonMiddleName(vendororganizations.getContactPersonMiddleName());
				existingVendorOrganizations.setContactPersonLastName(vendororganizations.getContactPersonLastName());
				existingVendorOrganizations.setContactPersonSuffix(vendororganizations.getContactPersonSuffix());
				existingVendorOrganizations.setPhone1(vendororganizations.getPhone1());
				existingVendorOrganizations.setPhone2(vendororganizations.getPhone2());
				existingVendorOrganizations.setFax(vendororganizations.getFax());
				existingVendorOrganizations.setEmail(vendororganizations.getEmail());
				existingVendorOrganizations.setAddressLine1(vendororganizations.getAddressLine1());
				existingVendorOrganizations.setAddressLine2(vendororganizations.getAddressLine2());
				existingVendorOrganizations.setAddressLine3(vendororganizations.getAddressLine3());
				existingVendorOrganizations.setStatus(vendororganizations.getStatus());
				existingVendorOrganizations.setZipCode5(vendororganizations.getZipCode5());
				existingVendorOrganizations.setCreatedOn(vendororganizations.getCreatedOn());
				existingVendorOrganizations.setCreatedBy(vendororganizations.getCreatedBy());
				existingVendorOrganizations.setModifiedOn(vendororganizations.getModifiedOn());
				existingVendorOrganizations.setModifiedBy(vendororganizations.getModifiedBy());
				existingVendorOrganizations.setZipCode4(vendororganizations.getZipCode4());
			}
			vendororganizations = vendorOrganizationsDAO.store(existingVendorOrganizations);
		} else {
			vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		}
		vendorOrganizationsDAO.flush();
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsIndCities(Integer vendororganizations_organizationId, Integer related_indcities_cityId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		IndCities related_indcities = indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId, -1, -1);

		vendororganizations.setIndCities(null);
		related_indcities.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		indCitiesDAO.remove(related_indcities);
		indCitiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsIndDistrict(Integer vendororganizations_organizationId, Integer related_inddistrict_districtId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		IndDistrict related_inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId, -1, -1);

		vendororganizations.setIndDistrict(null);
		related_inddistrict.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		indDistrictDAO.remove(related_inddistrict);
		indDistrictDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsIndStates(Integer organizationId, IndStates related_indstates) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setIndStates(related_indstates);
		related_indstates.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsUsCounties(Integer vendororganizations_organizationId, Integer related_uscounties_countyId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		UsCounties related_uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId, -1, -1);

		vendororganizations.setUsCounties(null);
		related_uscounties.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		usCountiesDAO.remove(related_uscounties);
		usCountiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public VendorOrganizations deleteVendorOrganizationsUsCities(Integer vendororganizations_organizationId, Integer related_uscities_cityId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizations_organizationId, -1, -1);
		UsCities related_uscities = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId, -1, -1);

		vendororganizations.setUsCities(null);
		related_uscities.getVendorOrganizationses().remove(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		usCitiesDAO.remove(related_uscities);
		usCitiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsIndCities(Integer organizationId, IndCities related_indcities) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setIndCities(related_indcities);
		related_indcities.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_indcities = indCitiesDAO.store(related_indcities);
		indCitiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsUsCities(Integer organizationId, UsCities related_uscities) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setUsCities(related_uscities);
		related_uscities.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_uscities = usCitiesDAO.store(related_uscities);
		usCitiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsUsCounties(Integer organizationId, UsCounties related_uscounties) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setUsCounties(related_uscounties);
		related_uscounties.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_uscounties = usCountiesDAO.store(related_uscounties);
		usCountiesDAO.flush();

		return vendororganizations;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public void deleteVendorOrganizations(VendorOrganizations vendororganizations) {
		vendorOrganizationsDAO.remove(vendororganizations);
		vendorOrganizationsDAO.flush();
	}

	/**
	 * Return a count of all VendorOrganizations entity
	 * 
	 */
	@Transactional
	public Integer countVendorOrganizationss() {
		return ((Long) vendorOrganizationsDAO.createQuerySingleResult("select count(o) from VendorOrganizations o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsIndDistrict(Integer organizationId, IndDistrict related_inddistrict) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setIndDistrict(related_inddistrict);
		related_inddistrict.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		return vendororganizations;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public VendorOrganizations saveVendorOrganizationsUsStates(Integer organizationId, UsStates related_usstates) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
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

		vendororganizations.setUsStates(related_usstates);
		related_usstates.getVendorOrganizationses().add(vendororganizations);
		vendororganizations = vendorOrganizationsDAO.store(vendororganizations);
		vendorOrganizationsDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		return vendororganizations;
	}
}
