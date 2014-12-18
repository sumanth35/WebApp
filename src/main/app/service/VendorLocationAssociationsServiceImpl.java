package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.VendorLocationAssociationsDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for VendorLocationAssociations entities
 * 
 */

@Service("VendorLocationAssociationsService")
@Transactional
public class VendorLocationAssociationsServiceImpl implements
		VendorLocationAssociationsService {

	/**
	 * DAO injected by Spring that manages VendorLocationAssociations entities
	 * 
	 */
	@Autowired
	private VendorLocationAssociationsDAO vendorLocationAssociationsDAO;

	/**
	 * DAO injected by Spring that manages VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileDAO vendorProfileDAO;

	/**
	 * Instantiates a new VendorLocationAssociationsServiceImpl.
	 *
	 */
	public VendorLocationAssociationsServiceImpl() {
	}

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public void saveVendorLocationAssociations(VendorLocationAssociations vendorlocationassociations) {
		VendorLocationAssociations existingVendorLocationAssociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorlocationassociations.getVendorLocationAssociationId());

		if (existingVendorLocationAssociations != null) {
			if (existingVendorLocationAssociations != vendorlocationassociations) {
				existingVendorLocationAssociations.setVendorLocationAssociationId(vendorlocationassociations.getVendorLocationAssociationId());
				existingVendorLocationAssociations.setLocationId(vendorlocationassociations.getLocationId());
				existingVendorLocationAssociations.setCreatedBy(vendorlocationassociations.getCreatedBy());
				existingVendorLocationAssociations.setCreatedOn(vendorlocationassociations.getCreatedOn());
				existingVendorLocationAssociations.setModifiedOn(vendorlocationassociations.getModifiedOn());
				existingVendorLocationAssociations.setModifiedBy(vendorlocationassociations.getModifiedBy());
			}
			vendorlocationassociations = vendorLocationAssociationsDAO.store(existingVendorLocationAssociations);
		} else {
			vendorlocationassociations = vendorLocationAssociationsDAO.store(vendorlocationassociations);
		}
		vendorLocationAssociationsDAO.flush();
	}

	/**
	 * Return a count of all VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public Integer countVendorLocationAssociationss() {
		return ((Long) vendorLocationAssociationsDAO.createQuerySingleResult("select count(o) from VendorLocationAssociations o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public VendorLocationAssociations saveVendorLocationAssociationsVendorProfile(Integer vendorLocationAssociationId, VendorProfile related_vendorprofile) {
		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationId, -1, -1);
		VendorProfile existingvendorProfile = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile.getRegistrationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorProfile != null) {
			existingvendorProfile.setRegistrationId(related_vendorprofile.getRegistrationId());
			existingvendorProfile.setRegistrationName(related_vendorprofile.getRegistrationName());
			existingvendorProfile.setRegistrationEmail(related_vendorprofile.getRegistrationEmail());
			existingvendorProfile.setFirstName(related_vendorprofile.getFirstName());
			existingvendorProfile.setMiddleName(related_vendorprofile.getMiddleName());
			existingvendorProfile.setLastName(related_vendorprofile.getLastName());
			existingvendorProfile.setNameSuffix(related_vendorprofile.getNameSuffix());
			existingvendorProfile.setNameTitle(related_vendorprofile.getNameTitle());
			existingvendorProfile.setPhone1(related_vendorprofile.getPhone1());
			existingvendorProfile.setPhone2(related_vendorprofile.getPhone2());
			existingvendorProfile.setFax1(related_vendorprofile.getFax1());
			existingvendorProfile.setFax2(related_vendorprofile.getFax2());
			existingvendorProfile.setProfileStatus(related_vendorprofile.getProfileStatus());
			existingvendorProfile.setInactivityDuration(related_vendorprofile.getInactivityDuration());
			existingvendorProfile.setLastSucessLogin(related_vendorprofile.getLastSucessLogin());
			existingvendorProfile.setEducationDegree(related_vendorprofile.getEducationDegree());
			existingvendorProfile.setCreatedBy(related_vendorprofile.getCreatedBy());
			existingvendorProfile.setCreatedOn(related_vendorprofile.getCreatedOn());
			existingvendorProfile.setModifiedBy(related_vendorprofile.getModifiedBy());
			existingvendorProfile.setModifiedOn(related_vendorprofile.getModifiedOn());
			existingvendorProfile.setVendorPassword(related_vendorprofile.getVendorPassword());
			related_vendorprofile = existingvendorProfile;
		}

		vendorlocationassociations.setVendorProfile(related_vendorprofile);
		related_vendorprofile.getVendorLocationAssociationses().add(vendorlocationassociations);
		vendorlocationassociations = vendorLocationAssociationsDAO.store(vendorlocationassociations);
		vendorLocationAssociationsDAO.flush();

		related_vendorprofile = vendorProfileDAO.store(related_vendorprofile);
		vendorProfileDAO.flush();

		return vendorlocationassociations;
	}

	/**
	 * Load an existing VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public Set<VendorLocationAssociations> loadVendorLocationAssociationss() {
		return vendorLocationAssociationsDAO.findAllVendorLocationAssociationss();
	}

	/**
	 * Return all VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public List<VendorLocationAssociations> findAllVendorLocationAssociationss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<VendorLocationAssociations>(vendorLocationAssociationsDAO.findAllVendorLocationAssociationss(startResult, maxRows));
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public VendorLocationAssociations deleteVendorLocationAssociationsVendorProfile(Integer vendorlocationassociations_vendorLocationAssociationId, Integer related_vendorprofile_registrationId) {
		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorlocationassociations_vendorLocationAssociationId, -1, -1);
		VendorProfile related_vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile_registrationId, -1, -1);

		vendorlocationassociations.setVendorProfile(null);
		related_vendorprofile.getVendorLocationAssociationses().remove(vendorlocationassociations);
		vendorlocationassociations = vendorLocationAssociationsDAO.store(vendorlocationassociations);
		vendorLocationAssociationsDAO.flush();

		related_vendorprofile = vendorProfileDAO.store(related_vendorprofile);
		vendorProfileDAO.flush();

		vendorProfileDAO.remove(related_vendorprofile);
		vendorProfileDAO.flush();

		return vendorlocationassociations;
	}

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public void deleteVendorLocationAssociations(VendorLocationAssociations vendorlocationassociations) {
		vendorLocationAssociationsDAO.remove(vendorlocationassociations);
		vendorLocationAssociationsDAO.flush();
	}

	/**
	 */
	@Transactional
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId) {
		return vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationId);
	}
}
