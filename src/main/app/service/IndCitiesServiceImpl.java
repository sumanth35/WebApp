package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

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
 * Spring service that handles CRUD requests for IndCities entities
 * 
 */

@Service("IndCitiesService")
@Transactional
public class IndCitiesServiceImpl implements IndCitiesService {

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
	 * Instantiates a new IndCitiesServiceImpl.
	 *
	 */
	public IndCitiesServiceImpl() {
	}

	/**
	 * Return all IndCities entity
	 * 
	 */
	@Transactional
	public List<IndCities> findAllIndCitiess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<IndCities>(indCitiesDAO.findAllIndCitiess(startResult, maxRows));
	}

	/**
	 * Load an existing IndCities entity
	 * 
	 */
	@Transactional
	public Set<IndCities> loadIndCitiess() {
		return indCitiesDAO.findAllIndCitiess();
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesIndDistrict(Integer indcities_cityId, Integer related_inddistrict_districtId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);
		IndDistrict related_inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId, -1, -1);

		indcities.setIndDistrict(null);
		related_inddistrict.getIndCitieses().remove(indcities);
		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		indDistrictDAO.remove(related_inddistrict);
		indDistrictDAO.flush();

		return indcities;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesIndDistrict(Integer cityId, IndDistrict related_inddistrict) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		indcities.setIndDistrict(related_inddistrict);
		related_inddistrict.getIndCitieses().add(indcities);
		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		related_inddistrict = indDistrictDAO.store(related_inddistrict);
		indDistrictDAO.flush();

		return indcities;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesCustomerProfiles(Integer indcities_cityId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		related_customerprofiles.setIndCities(null);
		indcities.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return indcities;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesCustomerProfiles(Integer cityId, CustomerProfile related_customerprofiles) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		related_customerprofiles.setIndCities(indcities);
		indcities.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		return indcities;
	}

	/**
	 * Return a count of all IndCities entity
	 * 
	 */
	@Transactional
	public Integer countIndCitiess() {
		return ((Long) indCitiesDAO.createQuerySingleResult("select count(o) from IndCities o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesIndStates(Integer indcities_cityId, Integer related_indstates_stateId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);
		IndStates related_indstates = indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId, -1, -1);

		indcities.setIndStates(null);
		related_indstates.getIndCitieses().remove(indcities);
		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		indStatesDAO.remove(related_indstates);
		indStatesDAO.flush();

		return indcities;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesRecipientLocations(Integer indcities_cityId, Integer related_recipientlocations_recipientLocationId) {
		RecipientLocation related_recipientlocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId, -1, -1);

		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		related_recipientlocations.setIndCities(null);
		indcities.getRecipientLocations().remove(related_recipientlocations);

		recipientLocationDAO.remove(related_recipientlocations);
		recipientLocationDAO.flush();

		return indcities;
	}

	/**
	 */
	@Transactional
	public IndCities findIndCitiesByPrimaryKey(Integer cityId) {
		return indCitiesDAO.findIndCitiesByPrimaryKey(cityId);
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesVendorLocationses(Integer cityId, VendorLocations related_vendorlocationses) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		related_vendorlocationses.setIndCities(indcities);
		indcities.getVendorLocationses().add(related_vendorlocationses);
		related_vendorlocationses = vendorLocationsDAO.store(related_vendorlocationses);
		vendorLocationsDAO.flush();

		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		return indcities;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesVendorOrganizationses(Integer cityId, VendorOrganizations related_vendororganizationses) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		related_vendororganizationses.setIndCities(indcities);
		indcities.getVendorOrganizationses().add(related_vendororganizationses);
		related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		return indcities;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesIndStates(Integer cityId, IndStates related_indstates) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		indcities.setIndStates(related_indstates);
		related_indstates.getIndCitieses().add(indcities);
		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		related_indstates = indStatesDAO.store(related_indstates);
		indStatesDAO.flush();

		return indcities;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public IndCities saveIndCitiesRecipientLocations(Integer cityId, RecipientLocation related_recipientlocations) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityId, -1, -1);
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

		related_recipientlocations.setIndCities(indcities);
		indcities.getRecipientLocations().add(related_recipientlocations);
		related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
		recipientLocationDAO.flush();

		indcities = indCitiesDAO.store(indcities);
		indCitiesDAO.flush();

		return indcities;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesVendorLocationses(Integer indcities_cityId, Integer related_vendorlocationses_locationId) {
		VendorLocations related_vendorlocationses = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId, -1, -1);

		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		related_vendorlocationses.setIndCities(null);
		indcities.getVendorLocationses().remove(related_vendorlocationses);

		vendorLocationsDAO.remove(related_vendorlocationses);
		vendorLocationsDAO.flush();

		return indcities;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@Transactional
	public void deleteIndCities(IndCities indcities) {
		indCitiesDAO.remove(indcities);
		indCitiesDAO.flush();
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@Transactional
	public void saveIndCities(IndCities indcities) {
		IndCities existingIndCities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities.getCityId());

		if (existingIndCities != null) {
			if (existingIndCities != indcities) {
				existingIndCities.setCityId(indcities.getCityId());
				existingIndCities.setCityName(indcities.getCityName());
				existingIndCities.setCityAbbr(indcities.getCityAbbr());
				existingIndCities.setCreatedOn(indcities.getCreatedOn());
				existingIndCities.setCreatedBy(indcities.getCreatedBy());
				existingIndCities.setModifiedOn(indcities.getModifiedOn());
				existingIndCities.setModifiedBy(indcities.getModifiedBy());
			}
			indcities = indCitiesDAO.store(existingIndCities);
		} else {
			indcities = indCitiesDAO.store(indcities);
		}
		indCitiesDAO.flush();
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public IndCities deleteIndCitiesVendorOrganizationses(Integer indcities_cityId, Integer related_vendororganizationses_organizationId) {
		VendorOrganizations related_vendororganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId, -1, -1);

		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		related_vendororganizationses.setIndCities(null);
		indcities.getVendorOrganizationses().remove(related_vendororganizationses);

		vendorOrganizationsDAO.remove(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		return indcities;
	}
}
