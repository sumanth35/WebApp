package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.UserRoleDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.CustomerProfile;
import main.app.domain.UserRole;
import main.app.domain.VendorProfile;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for UserRole entities
 * 
 */

@Service("UserRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

	/**
	 * DAO injected by Spring that manages UserRole entities
	 * 
	 */
	@Autowired
	private UserRoleDAO userRoleDAO;

	/**
	 * DAO injected by Spring that manages VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileDAO vendorProfileDAO;

	/**
	 * Instantiates a new UserRoleServiceImpl.
	 *
	 */
	public UserRoleServiceImpl() {
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UserRole deleteUserRoleCustomerProfiles(Integer userrole_userRoleId, Integer related_customerprofiles_customerId) {
		CustomerProfile related_customerprofiles = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId, -1, -1);

		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		related_customerprofiles.setUserRole(null);
		userrole.getCustomerProfiles().remove(related_customerprofiles);

		customerProfileDAO.remove(related_customerprofiles);
		customerProfileDAO.flush();

		return userrole;
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public UserRole deleteUserRoleVendorProfiles(Integer userrole_userRoleId, Integer related_vendorprofiles_registrationId) {
		VendorProfile related_vendorprofiles = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofiles_registrationId, -1, -1);

		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		related_vendorprofiles.setUserRole(null);
		userrole.getVendorProfiles().remove(related_vendorprofiles);

		vendorProfileDAO.remove(related_vendorprofiles);
		vendorProfileDAO.flush();

		return userrole;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public UserRole saveUserRoleCustomerProfiles(Integer userRoleId, CustomerProfile related_customerprofiles) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userRoleId, -1, -1);
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

		related_customerprofiles.setUserRole(userrole);
		userrole.getCustomerProfiles().add(related_customerprofiles);
		related_customerprofiles = customerProfileDAO.store(related_customerprofiles);
		customerProfileDAO.flush();

		userrole = userRoleDAO.store(userrole);
		userRoleDAO.flush();

		return userrole;
	}

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@Transactional
	public void saveUserRole(UserRole userrole) {
		UserRole existingUserRole = userRoleDAO.findUserRoleByPrimaryKey(userrole.getUserRoleId());

		if (existingUserRole != null) {
			if (existingUserRole != userrole) {
				existingUserRole.setUserRoleId(userrole.getUserRoleId());
				existingUserRole.setUserRoleName(userrole.getUserRoleName());
				existingUserRole.setUserRoleDescription(userrole.getUserRoleDescription());
				existingUserRole.setCreatedOn(userrole.getCreatedOn());
				existingUserRole.setCreatedBy(userrole.getCreatedBy());
				existingUserRole.setModifiedOn(userrole.getModifiedOn());
				existingUserRole.setModifiedBy(userrole.getModifiedBy());
			}
			userrole = userRoleDAO.store(existingUserRole);
		} else {
			userrole = userRoleDAO.store(userrole);
		}
		userRoleDAO.flush();
	}

	/**
	 * Load an existing UserRole entity
	 * 
	 */
	@Transactional
	public Set<UserRole> loadUserRoles() {
		return userRoleDAO.findAllUserRoles();
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@Transactional
	public void deleteUserRole(UserRole userrole) {
		userRoleDAO.remove(userrole);
		userRoleDAO.flush();
	}

	/**
	 * Return all UserRole entity
	 * 
	 */
	@Transactional
	public List<UserRole> findAllUserRoles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<UserRole>(userRoleDAO.findAllUserRoles(startResult, maxRows));
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public UserRole saveUserRoleVendorProfiles(Integer userRoleId, VendorProfile related_vendorprofiles) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userRoleId, -1, -1);
		VendorProfile existingvendorProfiles = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofiles.getRegistrationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorProfiles != null) {
			existingvendorProfiles.setRegistrationId(related_vendorprofiles.getRegistrationId());
			existingvendorProfiles.setRegistrationName(related_vendorprofiles.getRegistrationName());
			existingvendorProfiles.setRegistrationEmail(related_vendorprofiles.getRegistrationEmail());
			existingvendorProfiles.setFirstName(related_vendorprofiles.getFirstName());
			existingvendorProfiles.setMiddleName(related_vendorprofiles.getMiddleName());
			existingvendorProfiles.setLastName(related_vendorprofiles.getLastName());
			existingvendorProfiles.setNameSuffix(related_vendorprofiles.getNameSuffix());
			existingvendorProfiles.setNameTitle(related_vendorprofiles.getNameTitle());
			existingvendorProfiles.setPhone1(related_vendorprofiles.getPhone1());
			existingvendorProfiles.setPhone2(related_vendorprofiles.getPhone2());
			existingvendorProfiles.setFax1(related_vendorprofiles.getFax1());
			existingvendorProfiles.setFax2(related_vendorprofiles.getFax2());
			existingvendorProfiles.setProfileStatus(related_vendorprofiles.getProfileStatus());
			existingvendorProfiles.setInactivityDuration(related_vendorprofiles.getInactivityDuration());
			existingvendorProfiles.setLastSucessLogin(related_vendorprofiles.getLastSucessLogin());
			existingvendorProfiles.setEducationDegree(related_vendorprofiles.getEducationDegree());
			existingvendorProfiles.setCreatedBy(related_vendorprofiles.getCreatedBy());
			existingvendorProfiles.setCreatedOn(related_vendorprofiles.getCreatedOn());
			existingvendorProfiles.setModifiedBy(related_vendorprofiles.getModifiedBy());
			existingvendorProfiles.setModifiedOn(related_vendorprofiles.getModifiedOn());
			existingvendorProfiles.setVendorPassword(related_vendorprofiles.getVendorPassword());
			related_vendorprofiles = existingvendorProfiles;
		} else {
			related_vendorprofiles = vendorProfileDAO.store(related_vendorprofiles);
			vendorProfileDAO.flush();
		}

		related_vendorprofiles.setUserRole(userrole);
		userrole.getVendorProfiles().add(related_vendorprofiles);
		related_vendorprofiles = vendorProfileDAO.store(related_vendorprofiles);
		vendorProfileDAO.flush();

		userrole = userRoleDAO.store(userrole);
		userRoleDAO.flush();

		return userrole;
	}

	/**
	 * Return a count of all UserRole entity
	 * 
	 */
	@Transactional
	public Integer countUserRoles() {
		return ((Long) userRoleDAO.createQuerySingleResult("select count(o) from UserRole o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId) {
		return userRoleDAO.findUserRoleByPrimaryKey(userRoleId);
	}
}
