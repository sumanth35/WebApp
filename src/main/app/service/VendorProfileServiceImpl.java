package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.ProductsDAO;
import main.app.dao.UserRoleDAO;
import main.app.dao.VendorLocationAssociationsDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.Products;
import main.app.domain.UserRole;
import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for VendorProfile entities
 * 
 */

@Service("VendorProfileService")
@Transactional
public class VendorProfileServiceImpl implements VendorProfileService {

	/**
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

	/**
	 * DAO injected by Spring that manages UserRole entities
	 * 
	 */
	@Autowired
	private UserRoleDAO userRoleDAO;

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
	 * Instantiates a new VendorProfileServiceImpl.
	 *
	 */
	public VendorProfileServiceImpl() {
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public VendorProfile deleteVendorProfileProductses(Integer vendorprofile_registrationId, Integer related_productses_productId) {
		Products related_productses = productsDAO.findProductsByPrimaryKey(related_productses_productId, -1, -1);

		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		related_productses.setVendorProfile(null);
		vendorprofile.getProductses().remove(related_productses);

		productsDAO.remove(related_productses);
		productsDAO.flush();

		return vendorprofile;
	}

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public VendorProfile saveVendorProfileVendorLocationAssociationses(Integer registrationId, VendorLocationAssociations related_vendorlocationassociationses) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(registrationId, -1, -1);
		VendorLocationAssociations existingvendorLocationAssociationses = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(related_vendorlocationassociationses.getVendorLocationAssociationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorLocationAssociationses != null) {
			existingvendorLocationAssociationses.setVendorLocationAssociationId(related_vendorlocationassociationses.getVendorLocationAssociationId());
			existingvendorLocationAssociationses.setLocationId(related_vendorlocationassociationses.getLocationId());
			existingvendorLocationAssociationses.setCreatedBy(related_vendorlocationassociationses.getCreatedBy());
			existingvendorLocationAssociationses.setCreatedOn(related_vendorlocationassociationses.getCreatedOn());
			existingvendorLocationAssociationses.setModifiedOn(related_vendorlocationassociationses.getModifiedOn());
			existingvendorLocationAssociationses.setModifiedBy(related_vendorlocationassociationses.getModifiedBy());
			related_vendorlocationassociationses = existingvendorLocationAssociationses;
		}

		related_vendorlocationassociationses.setVendorProfile(vendorprofile);
		vendorprofile.getVendorLocationAssociationses().add(related_vendorlocationassociationses);
		related_vendorlocationassociationses = vendorLocationAssociationsDAO.store(related_vendorlocationassociationses);
		vendorLocationAssociationsDAO.flush();

		vendorprofile = vendorProfileDAO.store(vendorprofile);
		vendorProfileDAO.flush();

		return vendorprofile;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public VendorProfile saveVendorProfileProductses(Integer registrationId, Products related_productses) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(registrationId, -1, -1);
		Products existingproductses = productsDAO.findProductsByPrimaryKey(related_productses.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingproductses != null) {
			existingproductses.setProductId(related_productses.getProductId());
			existingproductses.setProductTitle(related_productses.getProductTitle());
			existingproductses.setSalesPrice(related_productses.getSalesPrice());
			existingproductses.setCostPrice(related_productses.getCostPrice());
			existingproductses.setDiscountPrice(related_productses.getDiscountPrice());
			existingproductses.setPercentageDiscount(related_productses.getPercentageDiscount());
			existingproductses.setCreatedOn(related_productses.getCreatedOn());
			existingproductses.setCreatedBy(related_productses.getCreatedBy());
			existingproductses.setModifiedOn(related_productses.getModifiedOn());
			existingproductses.setModifiedBy(related_productses.getModifiedBy());
			existingproductses.setStatus(related_productses.getStatus());
			existingproductses.setQuantity(related_productses.getQuantity());
			related_productses = existingproductses;
		} else {
			related_productses = productsDAO.store(related_productses);
			productsDAO.flush();
		}

		related_productses.setVendorProfile(vendorprofile);
		vendorprofile.getProductses().add(related_productses);
		related_productses = productsDAO.store(related_productses);
		productsDAO.flush();

		vendorprofile = vendorProfileDAO.store(vendorprofile);
		vendorProfileDAO.flush();

		return vendorprofile;
	}

	/**
	 */
	@Transactional
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId) {
		return vendorProfileDAO.findVendorProfileByPrimaryKey(registrationId);
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public void deleteVendorProfile(VendorProfile vendorprofile) {
		vendorProfileDAO.remove(vendorprofile);
		vendorProfileDAO.flush();
	}

	/**
	 * Load an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public Set<VendorProfile> loadVendorProfiles() {
		return vendorProfileDAO.findAllVendorProfiles();
	}

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@Transactional
	public VendorProfile saveVendorProfileUserRole(Integer registrationId, UserRole related_userrole) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(registrationId, -1, -1);
		UserRole existinguserRole = userRoleDAO.findUserRoleByPrimaryKey(related_userrole.getUserRoleId());

		// copy into the existing record to preserve existing relationships
		if (existinguserRole != null) {
			existinguserRole.setUserRoleId(related_userrole.getUserRoleId());
			existinguserRole.setUserRoleName(related_userrole.getUserRoleName());
			existinguserRole.setUserRoleDescription(related_userrole.getUserRoleDescription());
			existinguserRole.setCreatedOn(related_userrole.getCreatedOn());
			existinguserRole.setCreatedBy(related_userrole.getCreatedBy());
			existinguserRole.setModifiedOn(related_userrole.getModifiedOn());
			existinguserRole.setModifiedBy(related_userrole.getModifiedBy());
			related_userrole = existinguserRole;
		} else {
			related_userrole = userRoleDAO.store(related_userrole);
			userRoleDAO.flush();
		}

		vendorprofile.setUserRole(related_userrole);
		related_userrole.getVendorProfiles().add(vendorprofile);
		vendorprofile = vendorProfileDAO.store(vendorprofile);
		vendorProfileDAO.flush();

		related_userrole = userRoleDAO.store(related_userrole);
		userRoleDAO.flush();

		return vendorprofile;
	}

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@Transactional
	public VendorProfile deleteVendorProfileVendorLocationAssociationses(Integer vendorprofile_registrationId, Integer related_vendorlocationassociationses_vendorLocationAssociationId) {
		VendorLocationAssociations related_vendorlocationassociationses = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(related_vendorlocationassociationses_vendorLocationAssociationId, -1, -1);

		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		related_vendorlocationassociationses.setVendorProfile(null);
		vendorprofile.getVendorLocationAssociationses().remove(related_vendorlocationassociationses);

		vendorLocationAssociationsDAO.remove(related_vendorlocationassociationses);
		vendorLocationAssociationsDAO.flush();

		return vendorprofile;
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@Transactional
	public VendorProfile deleteVendorProfileUserRole(Integer vendorprofile_registrationId, Integer related_userrole_userRoleId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);
		UserRole related_userrole = userRoleDAO.findUserRoleByPrimaryKey(related_userrole_userRoleId, -1, -1);

		vendorprofile.setUserRole(null);
		related_userrole.getVendorProfiles().remove(vendorprofile);
		vendorprofile = vendorProfileDAO.store(vendorprofile);
		vendorProfileDAO.flush();

		related_userrole = userRoleDAO.store(related_userrole);
		userRoleDAO.flush();

		userRoleDAO.remove(related_userrole);
		userRoleDAO.flush();

		return vendorprofile;
	}

	/**
	 * Return all VendorProfile entity
	 * 
	 */
	@Transactional
	public List<VendorProfile> findAllVendorProfiles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<VendorProfile>(vendorProfileDAO.findAllVendorProfiles(startResult, maxRows));
	}

	/**
	 * Return a count of all VendorProfile entity
	 * 
	 */
	@Transactional
	public Integer countVendorProfiles() {
		return ((Long) vendorProfileDAO.createQuerySingleResult("select count(o) from VendorProfile o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public void saveVendorProfile(VendorProfile vendorprofile) {
		VendorProfile existingVendorProfile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile.getRegistrationId());

		if (existingVendorProfile != null) {
			if (existingVendorProfile != vendorprofile) {
				existingVendorProfile.setRegistrationId(vendorprofile.getRegistrationId());
				existingVendorProfile.setRegistrationName(vendorprofile.getRegistrationName());
				existingVendorProfile.setRegistrationEmail(vendorprofile.getRegistrationEmail());
				existingVendorProfile.setFirstName(vendorprofile.getFirstName());
				existingVendorProfile.setMiddleName(vendorprofile.getMiddleName());
				existingVendorProfile.setLastName(vendorprofile.getLastName());
				existingVendorProfile.setNameSuffix(vendorprofile.getNameSuffix());
				existingVendorProfile.setNameTitle(vendorprofile.getNameTitle());
				existingVendorProfile.setPhone1(vendorprofile.getPhone1());
				existingVendorProfile.setPhone2(vendorprofile.getPhone2());
				existingVendorProfile.setFax1(vendorprofile.getFax1());
				existingVendorProfile.setFax2(vendorprofile.getFax2());
				existingVendorProfile.setProfileStatus(vendorprofile.getProfileStatus());
				existingVendorProfile.setInactivityDuration(vendorprofile.getInactivityDuration());
				existingVendorProfile.setLastSucessLogin(vendorprofile.getLastSucessLogin());
				existingVendorProfile.setEducationDegree(vendorprofile.getEducationDegree());
				existingVendorProfile.setCreatedBy(vendorprofile.getCreatedBy());
				existingVendorProfile.setCreatedOn(vendorprofile.getCreatedOn());
				existingVendorProfile.setModifiedBy(vendorprofile.getModifiedBy());
				existingVendorProfile.setModifiedOn(vendorprofile.getModifiedOn());
				existingVendorProfile.setVendorPassword(vendorprofile.getVendorPassword());
			}
			vendorprofile = vendorProfileDAO.store(existingVendorProfile);
		} else {
			vendorprofile = vendorProfileDAO.store(vendorprofile);
		}
		vendorProfileDAO.flush();
	}
}
