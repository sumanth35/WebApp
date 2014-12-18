package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Products;
import main.app.domain.UserRole;
import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

/**
 * Spring service that handles CRUD requests for VendorProfile entities
 * 
 */
public interface VendorProfileService {

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public VendorProfile deleteVendorProfileProductses(Integer vendorprofile_registrationId, Integer related_productses_productId);

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	public VendorProfile saveVendorProfileVendorLocationAssociationses(Integer registrationId, VendorLocationAssociations related_vendorlocationassociationses);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public VendorProfile saveVendorProfileProductses(Integer registrationId_1, Products related_productses);

	/**
	 */
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId_2);

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	public void deleteVendorProfile(VendorProfile vendorprofile);

	/**
	 * Load an existing VendorProfile entity
	 * 
	 */
	public Set<VendorProfile> loadVendorProfiles();

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	public VendorProfile saveVendorProfileUserRole(Integer registrationId_3, UserRole related_userrole);

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	public VendorProfile deleteVendorProfileVendorLocationAssociationses(Integer vendorprofile_registrationId_1, Integer related_vendorlocationassociationses_vendorLocationAssociationId);

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	public VendorProfile deleteVendorProfileUserRole(Integer vendorprofile_registrationId_2, Integer related_userrole_userRoleId);

	/**
	 * Return all VendorProfile entity
	 * 
	 */
	public List<VendorProfile> findAllVendorProfiles(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all VendorProfile entity
	 * 
	 */
	public Integer countVendorProfiles();

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	public void saveVendorProfile(VendorProfile vendorprofile_1);
}