package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

/**
 * Spring service that handles CRUD requests for VendorLocationAssociations entities
 * 
 */
public interface VendorLocationAssociationsService {

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	public void saveVendorLocationAssociations(VendorLocationAssociations vendorlocationassociations);

	/**
	 * Return a count of all VendorLocationAssociations entity
	 * 
	 */
	public Integer countVendorLocationAssociationss();

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	public VendorLocationAssociations saveVendorLocationAssociationsVendorProfile(Integer vendorLocationAssociationId, VendorProfile related_vendorprofile);

	/**
	 * Load an existing VendorLocationAssociations entity
	 * 
	 */
	public Set<VendorLocationAssociations> loadVendorLocationAssociationss();

	/**
	 * Return all VendorLocationAssociations entity
	 * 
	 */
	public List<VendorLocationAssociations> findAllVendorLocationAssociationss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	public VendorLocationAssociations deleteVendorLocationAssociationsVendorProfile(Integer vendorlocationassociations_vendorLocationAssociationId, Integer related_vendorprofile_registrationId);

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	public void deleteVendorLocationAssociations(VendorLocationAssociations vendorlocationassociations_1);

	/**
	 */
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId_1);
}