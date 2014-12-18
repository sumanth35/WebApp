package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.UserRoleDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.CustomerProfile;
import main.app.domain.UserRole;
import main.app.domain.VendorProfile;

import main.app.service.UserRoleService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for UserRole entities
 * 
 */

@Controller("UserRoleController")
public class UserRoleController {

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
	 * Service injected by Spring that provides CRUD operations for UserRole entities
	 * 
	 */
	@Autowired
	private UserRoleService userRoleService;

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@RequestMapping("/saveUserRole")
	public String saveUserRole(@ModelAttribute UserRole userrole) {
		userRoleService.saveUserRole(userrole);
		return "forward:/indexUserRole";
	}

	/**
	 * Select the UserRole entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserRole")
	public ModelAndView confirmDeleteUserRole(@RequestParam Integer userRoleIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey));
		mav.setViewName("userrole/deleteUserRole.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/userroleController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveUserRoleCustomerProfiles")
	public ModelAndView saveUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId, @ModelAttribute CustomerProfile customerprofiles) {
		UserRole parent_userrole = userRoleService.saveUserRoleCustomerProfiles(userrole_userRoleId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("userrole", parent_userrole);
		mav.setViewName("userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/editUserRoleVendorProfiles")
	public ModelAndView editUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer vendorprofiles_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofiles_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("userrole/vendorprofiles/editVendorProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/saveUserRoleVendorProfiles")
	public ModelAndView saveUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId, @ModelAttribute VendorProfile vendorprofiles) {
		UserRole parent_userrole = userRoleService.saveUserRoleVendorProfiles(userrole_userRoleId, vendorprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("userrole", parent_userrole);
		mav.setViewName("userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * Select the child VendorProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserRoleVendorProfiles")
	public ModelAndView confirmDeleteUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer related_vendorprofiles_registrationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofiles_registrationId));
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.setViewName("userrole/vendorprofiles/deleteVendorProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editUserRoleCustomerProfiles")
	public ModelAndView editUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("userrole/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newUserRoleCustomerProfiles")
	public ModelAndView newUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("userrole/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new VendorProfile entity
	 * 
	 */
	@RequestMapping("/newUserRoleVendorProfiles")
	public ModelAndView newUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("vendorprofile", new VendorProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("userrole/vendorprofiles/editVendorProfiles.jsp");

		return mav;
	}

	/**
	 * Entry point to show all UserRole entities
	 * 
	 */
	public String indexUserRole() {
		return "redirect:/indexUserRole";
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@RequestMapping("/deleteUserRole")
	public String deleteUserRole(@RequestParam Integer userRoleIdKey) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey);
		userRoleService.deleteUserRole(userrole);
		return "forward:/indexUserRole";
	}

	/**
	 * Edit an existing UserRole entity
	 * 
	 */
	@RequestMapping("/editUserRole")
	public ModelAndView editUserRole(@RequestParam Integer userRoleIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey));
		mav.setViewName("userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by UserRole
	 * 
	 */
	@RequestMapping("/listUserRoleCustomerProfiles")
	public ModelAndView listUserRoleCustomerProfiles(@RequestParam Integer userRoleIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey));
		mav.setViewName("userrole/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Show all VendorProfile entities by UserRole
	 * 
	 */
	@RequestMapping("/listUserRoleVendorProfiles")
	public ModelAndView listUserRoleVendorProfiles(@RequestParam Integer userRoleIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey));
		mav.setViewName("userrole/vendorprofiles/listVendorProfiles.jsp");

		return mav;
	}

	/**
	 * Show all UserRole entities
	 * 
	 */
	@RequestMapping("/indexUserRole")
	public ModelAndView listUserRoles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userroles", userRoleService.loadUserRoles());

		mav.setViewName("userrole/listUserRoles.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/deleteUserRoleVendorProfiles")
	public ModelAndView deleteUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer related_vendorprofiles_registrationId) {
		ModelAndView mav = new ModelAndView();

		UserRole userrole = userRoleService.deleteUserRoleVendorProfiles(userrole_userRoleId, related_vendorprofiles_registrationId);

		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("userrole", userrole);
		mav.setViewName("userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUserRoleCustomerProfiles")
	public ModelAndView confirmDeleteUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.setViewName("userrole/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new UserRole entity
	 * 
	 */
	@RequestMapping("/newUserRole")
	public ModelAndView newUserRole() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", new UserRole());
		mav.addObject("newFlag", true);
		mav.setViewName("userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteUserRoleCustomerProfiles")
	public ModelAndView deleteUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		UserRole userrole = userRoleService.deleteUserRoleCustomerProfiles(userrole_userRoleId, related_customerprofiles_customerId);

		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("userrole", userrole);
		mav.setViewName("userrole/viewUserRole.jsp");

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
	 * View an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/selectUserRoleVendorProfiles")
	public ModelAndView selectUserRoleVendorProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer vendorprofiles_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofiles_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("userrole/vendorprofiles/viewVendorProfiles.jsp");

		return mav;
	}

	/**
	 * Select an existing UserRole entity
	 * 
	 */
	@RequestMapping("/selectUserRole")
	public ModelAndView selectUserRole(@RequestParam Integer userRoleIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(userRoleIdKey));
		mav.setViewName("userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectUserRoleCustomerProfiles")
	public ModelAndView selectUserRoleCustomerProfiles(@RequestParam Integer userrole_userRoleId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("userrole_userRoleId", userrole_userRoleId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("userrole/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}
}