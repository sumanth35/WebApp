package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

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
 * Spring service that handles CRUD requests for UsCounties entities
 * 
 */

@Service("UsCountiesService")
@Transactional
public class UsCountiesServiceImpl implements UsCountiesService {

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
	 * Instantiates a new UsCountiesServiceImpl.
	 *
	 */
	public UsCountiesServiceImpl() {
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesVendorLocationses(Integer countyId, VendorLocations related_vendorlocationses) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		related_vendorlocationses.setUsCounties(uscounties);
		uscounties.getVendorLocationses().add(related_vendorlocationses);
		related_vendorlocationses = vendorLocationsDAO.store(related_vendorlocationses);
		vendorLocationsDAO.flush();

		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		return uscounties;
	}

	/**
	 */
	@Transactional
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId) {
		return usCountiesDAO.findUsCountiesByPrimaryKey(countyId);
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesUsCitieses(Integer countyId, UsCities related_uscitieses) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		related_uscitieses.setUsCounties(uscounties);
		uscounties.getUsCitieses().add(related_uscitieses);
		related_uscitieses = usCitiesDAO.store(related_uscitieses);
		usCitiesDAO.flush();

		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		return uscounties;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesUsCitieses(Integer uscounties_countyId, Integer related_uscitieses_cityId) {
		UsCities related_uscitieses = usCitiesDAO.findUsCitiesByPrimaryKey(related_uscitieses_cityId, -1, -1);

		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		related_uscitieses.setUsCounties(null);
		uscounties.getUsCitieses().remove(related_uscitieses);

		usCitiesDAO.remove(related_uscitieses);
		usCitiesDAO.flush();

		return uscounties;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesVendorOrganizationses(Integer uscounties_countyId, Integer related_vendororganizationses_organizationId) {
		VendorOrganizations related_vendororganizationses = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId, -1, -1);

		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		related_vendororganizationses.setUsCounties(null);
		uscounties.getVendorOrganizationses().remove(related_vendororganizationses);

		vendorOrganizationsDAO.remove(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		return uscounties;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesVendorLocationses(Integer uscounties_countyId, Integer related_vendorlocationses_locationId) {
		VendorLocations related_vendorlocationses = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId, -1, -1);

		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		related_vendorlocationses.setUsCounties(null);
		uscounties.getVendorLocationses().remove(related_vendorlocationses);

		vendorLocationsDAO.remove(related_vendorlocationses);
		vendorLocationsDAO.flush();

		return uscounties;
	}

	/**
	 * Return all UsCounties entity
	 * 
	 */
	@Transactional
	public List<UsCounties> findAllUsCountiess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<UsCounties>(usCountiesDAO.findAllUsCountiess(startResult, maxRows));
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@Transactional
	public void saveUsCounties(UsCounties uscounties) {
		UsCounties existingUsCounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties.getCountyId());

		if (existingUsCounties != null) {
			if (existingUsCounties != uscounties) {
				existingUsCounties.setCountyId(uscounties.getCountyId());
				existingUsCounties.setCountyName(uscounties.getCountyName());
				existingUsCounties.setCountyAbbr(uscounties.getCountyAbbr());
				existingUsCounties.setCreatedOn(uscounties.getCreatedOn());
				existingUsCounties.setCreatedBy(uscounties.getCreatedBy());
				existingUsCounties.setModifiedOn(uscounties.getModifiedOn());
				existingUsCounties.setModifiedBy(uscounties.getModifiedBy());
			}
			uscounties = usCountiesDAO.store(existingUsCounties);
		} else {
			uscounties = usCountiesDAO.store(uscounties);
		}
		usCountiesDAO.flush();
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesUsStates(Integer uscounties_countyId, Integer related_usstates_stateId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);
		UsStates related_usstates = usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId, -1, -1);

		uscounties.setUsStates(null);
		related_usstates.getUsCountieses().remove(uscounties);
		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		usStatesDAO.remove(related_usstates);
		usStatesDAO.flush();

		return uscounties;
	}

	/**
	 * Return a count of all UsCounties entity
	 * 
	 */
	@Transactional
	public Integer countUsCountiess() {
		return ((Long) usCountiesDAO.createQuerySingleResult("select count(o) from UsCounties o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesRecipientLocations(Integer uscounties_countyId, Integer related_recipientlocations_recipientLocationId) {
		RecipientLocation related_recipientlocations = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId, -1, -1);

		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		related_recipientlocations.setUsCounties(null);
		uscounties.getRecipientLocations().remove(related_recipientlocations);

		recipientLocationDAO.remove(related_recipientlocations);
		recipientLocationDAO.flush();

		return uscounties;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesCustomerProfiles(Integer countyId, CustomerProfile related_customerprofiles) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		related_customerprofiles.setUsCounties(uscounties);
		uscounties.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		return uscounties;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UsCounties deleteUsCountiesCustomerProfiles(Integer uscounties_countyId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		related_customerprofiles.setUsCounties(null);
		uscounties.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return uscounties;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesVendorOrganizationses(Integer countyId, VendorOrganizations related_vendororganizationses) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		related_vendororganizationses.setUsCounties(uscounties);
		uscounties.getVendorOrganizationses().add(related_vendororganizationses);
		related_vendororganizationses = vendorOrganizationsDAO.store(related_vendororganizationses);
		vendorOrganizationsDAO.flush();

		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		return uscounties;
	}

	/**
	 * Load an existing UsCounties entity
	 * 
	 */
	@Transactional
	public Set<UsCounties> loadUsCountiess() {
		return usCountiesDAO.findAllUsCountiess();
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesUsStates(Integer countyId, UsStates related_usstates) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		uscounties.setUsStates(related_usstates);
		related_usstates.getUsCountieses().add(uscounties);
		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		related_usstates = usStatesDAO.store(related_usstates);
		usStatesDAO.flush();

		return uscounties;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Transactional
	public void deleteUsCounties(UsCounties uscounties) {
		usCountiesDAO.remove(uscounties);
		usCountiesDAO.flush();
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public UsCounties saveUsCountiesRecipientLocations(Integer countyId, RecipientLocation related_recipientlocations) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyId, -1, -1);
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

		related_recipientlocations.setUsCounties(uscounties);
		uscounties.getRecipientLocations().add(related_recipientlocations);
		related_recipientlocations = recipientLocationDAO.store(related_recipientlocations);
		recipientLocationDAO.flush();

		uscounties = usCountiesDAO.store(uscounties);
		usCountiesDAO.flush();

		return uscounties;
	}
}
