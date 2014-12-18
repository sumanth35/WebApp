package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.UserRole;
import main.app.domain.VendorProfile;

/**
 * Spring service that handles CRUD requests for UserRole entities
 * 
 */
public interface UserRoleService {

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public UserRole deleteUserRoleCustomerProfiles(Integer userrole_userRoleId, Integer related_customerprofiles_customerId);

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	public UserRole deleteUserRoleVendorProfiles(Integer userrole_userRoleId_1, Integer related_vendorprofiles_registrationId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public UserRole saveUserRoleCustomerProfiles(Integer userRoleId, CustomerProfile related_customerprofiles);

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	public void saveUserRole(UserRole userrole);

	/**
	 * Load an existing UserRole entity
	 * 
	 */
	public Set<UserRole> loadUserRoles();

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	public void deleteUserRole(UserRole userrole_1);

	/**
	 * Return all UserRole entity
	 * 
	 */
	public List<UserRole> findAllUserRoles(Integer startResult, Integer maxRows);

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	public UserRole saveUserRoleVendorProfiles(Integer userRoleId_1, VendorProfile related_vendorprofiles);

	/**
	 * Return a count of all UserRole entity
	 * 
	 */
	public Integer countUserRoles();

	/**
	 */
	public UserRole findUserRoleByPrimaryKey(Integer userRoleId_2);
}