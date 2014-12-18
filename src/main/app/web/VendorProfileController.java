package main.app.web;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.ProductsDAO;
import main.app.dao.UserRoleDAO;
import main.app.dao.VendorLocationAssociationsDAO;
import main.app.dao.VendorProfileDAO;
import main.app.domain.Products;
import main.app.domain.UserRole;
import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;
import main.app.service.VendorProfileService;
import main.app.util.AppConstants;
import main.app.util.DateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for VendorProfile entities
 * 
 */

@Controller("VendorProfileController")
public class VendorProfileController {

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
	 * Service injected by Spring that provides CRUD operations for VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileService vendorProfileService;

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/deleteVendorProfileVendorLocationAssociationses")
	public ModelAndView deleteVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_vendorlocationassociationses_vendorLocationAssociationId) {
		ModelAndView mav = new ModelAndView();

		VendorProfile vendorprofile = vendorProfileService.deleteVendorProfileVendorLocationAssociationses(vendorprofile_registrationId, related_vendorlocationassociationses_vendorLocationAssociationId);

		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Entry point to show all VendorProfile entities
	 * 
	 */
	public String indexVendorProfile() {
		return "redirect:/indexVendorProfile";
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteVendorProfileProductses")
	public ModelAndView deleteVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		VendorProfile vendorprofile = vendorProfileService.deleteVendorProfileProductses(vendorprofile_registrationId, related_productses_productId);

		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editVendorProfileProductses")
	public ModelAndView editVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("products", products);
		mav.setViewName("vendorprofile/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/selectVendorProfileVendorLocationAssociationses")
	public ModelAndView selectVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer vendorlocationassociationses_vendorLocationAssociationId) {
		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorlocationassociationses_vendorLocationAssociationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorlocationassociations", vendorlocationassociations);
		mav.setViewName("vendorprofile/vendorlocationassociationses/viewVendorLocationAssociationses.jsp");

		return mav;
	}

	/**
	 * Create a new VendorProfile entity
	 * 
	 */
	@RequestMapping("/newVendorProfile")
	public ModelAndView newVendorProfile() {
		ModelAndView mav = new ModelAndView();

		Map<String, String> userRoleMap = null;

		
		mav.addObject("vendorprofile", new VendorProfile());
		mav.addObject("newFlag", true);
		
		/*Set<UserRole> userRoleList = userRoleDAO.findAllUserRoles();
		for(UserRole userRole: userRoleList)
			userRoleMap.put(userRole.getUserRoleId().toString(),userRole.getUserRoleName());
		
		mav.addObject("userRoleList",userRoleMap);*/
		
		
		mav.setViewName("vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocationAssociations entities by VendorProfile
	 * 
	 */
	@RequestMapping("/listVendorProfileVendorLocationAssociationses")
	public ModelAndView listVendorProfileVendorLocationAssociationses(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/vendorlocationassociationses/listVendorLocationAssociationses.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newVendorProfileProductses")
	public ModelAndView newVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorprofile/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@RequestMapping("/deleteVendorProfileUserRole")
	public ModelAndView deleteVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();

		VendorProfile vendorprofile = vendorProfileService.deleteVendorProfileUserRole(vendorprofile_registrationId, related_userrole_userRoleId);

		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Create a new UserRole entity
	 * 
	 */
	@RequestMapping("/newVendorProfileUserRole")
	public ModelAndView newVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("userrole", new UserRole());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorprofile/userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 * View an existing UserRole entity
	 * 
	 */
	@RequestMapping("/selectVendorProfileUserRole")
	public ModelAndView selectVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer userrole_userRoleId) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("userrole", userrole);
		mav.setViewName("vendorprofile/userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/saveVendorProfile")
	public String saveVendorProfile(@ModelAttribute VendorProfile vendorprofile) {
		
		UserRole userRole = userRoleDAO.findUserRoleByPrimaryKey(Integer.valueOf(AppConstants.USER_VENDOR_ROLE), -1, -1);

		vendorprofile.setCreatedOn(DateUtil.getCurrentDateTime());
		vendorprofile.setProfileStatus(AppConstants.USER_PROFILE_STATUS_ACTIVE);		
		vendorprofile.setUserRole(userRole);
		
		vendorProfileService.saveVendorProfile(vendorprofile);
		return "forward:/indexVendorProfile";
	}

	/**
	 * Show all UserRole entities by VendorProfile
	 * 
	 */
	@RequestMapping("/listVendorProfileUserRole")
	public ModelAndView listVendorProfileUserRole(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/userrole/listUserRole.jsp");

		return mav;
	}

	/**
	 * Select an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/selectVendorProfile")
	public ModelAndView selectVendorProfile(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@RequestMapping("/saveVendorProfileUserRole")
	public ModelAndView saveVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId, @ModelAttribute UserRole userrole) {
		VendorProfile parent_vendorprofile = vendorProfileService.saveVendorProfileUserRole(vendorprofile_registrationId, userrole);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", parent_vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveVendorProfileProductses")
	public ModelAndView saveVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId, @ModelAttribute Products productses) {
		VendorProfile parent_vendorprofile = vendorProfileService.saveVendorProfileProductses(vendorprofile_registrationId, productses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", parent_vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/saveVendorProfileVendorLocationAssociationses")
	public ModelAndView saveVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId, @ModelAttribute VendorLocationAssociations vendorlocationassociationses) {
		VendorProfile parent_vendorprofile = vendorProfileService.saveVendorProfileVendorLocationAssociationses(vendorprofile_registrationId, vendorlocationassociationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorprofile", parent_vendorprofile);
		mav.setViewName("vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocationAssociations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorProfileVendorLocationAssociationses")
	public ModelAndView confirmDeleteVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_vendorlocationassociationses_vendorLocationAssociationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(related_vendorlocationassociationses_vendorLocationAssociationId));
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.setViewName("vendorprofile/vendorlocationassociationses/deleteVendorLocationAssociationses.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by VendorProfile
	 * 
	 */
	@RequestMapping("/listVendorProfileProductses")
	public ModelAndView listVendorProfileProductses(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/productses/listProductses.jsp");

		return mav;
	}

	/**
	 * Show all VendorProfile entities
	 * 
	 */
	@RequestMapping("/indexVendorProfile")
	public ModelAndView listVendorProfiles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofiles", vendorProfileService.loadVendorProfiles());

		mav.setViewName("vendorprofile/listVendorProfiles.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectVendorProfileProductses")
	public ModelAndView selectVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("products", products);
		mav.setViewName("vendorprofile/productses/viewProductses.jsp");

		return mav;
	}

	/**
	 * Select the VendorProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorProfile")
	public ModelAndView confirmDeleteVendorProfile(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/deleteVendorProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing UserRole entity
	 * 
	 */
	@RequestMapping("/editVendorProfileUserRole")
	public ModelAndView editVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer userrole_userRoleId) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("userrole", userrole);
		mav.setViewName("vendorprofile/userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/vendorprofileController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/editVendorProfile")
	public ModelAndView editVendorProfile(@RequestParam Integer registrationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey));
		mav.setViewName("vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorProfileProductses")
	public ModelAndView confirmDeleteVendorProfileProductses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_productses_productId));
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.setViewName("vendorprofile/productses/deleteProductses.jsp");

		return mav;
	}

	/**
	 * Select the child UserRole entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorProfileUserRole")
	public ModelAndView confirmDeleteVendorProfileUserRole(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer related_userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(related_userrole_userRoleId));
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.setViewName("vendorprofile/userrole/deleteUserRole.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/deleteVendorProfile")
	public String deleteVendorProfile(@RequestParam Integer registrationIdKey) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(registrationIdKey);
		vendorProfileService.deleteVendorProfile(vendorprofile);
		return "forward:/indexVendorProfile";
	}

	/**
	 * Edit an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/editVendorProfileVendorLocationAssociationses")
	public ModelAndView editVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId, @RequestParam Integer vendorlocationassociationses_vendorLocationAssociationId) {
		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorlocationassociationses_vendorLocationAssociationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorlocationassociations", vendorlocationassociations);
		mav.setViewName("vendorprofile/vendorlocationassociationses/editVendorLocationAssociationses.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/newVendorProfileVendorLocationAssociationses")
	public ModelAndView newVendorProfileVendorLocationAssociationses(@RequestParam Integer vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile_registrationId", vendorprofile_registrationId);
		mav.addObject("vendorlocationassociations", new VendorLocationAssociations());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorprofile/vendorlocationassociationses/editVendorLocationAssociationses.jsp");

		return mav;
	}
}