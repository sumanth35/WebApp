package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import main.app.service.UsCountiesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for UsCounties entities
 * 
 */

@Controller("UsCountiesController")
public class UsCountiesController {

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
	 * Service injected by Spring that provides CRUD operations for UsCounties entities
	 * 
	 */
	@Autowired
	private UsCountiesService usCountiesService;

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editUsCountiesVendorLocationses")
	public ModelAndView editUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("uscounties/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesUsStates")
	public ModelAndView deleteUsCountiesUsStates(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesUsStates(uscounties_countyId, related_usstates_stateId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Entry point to show all UsCounties entities
	 * 
	 */
	public String indexUsCounties() {
		return "redirect:/indexUsCounties";
	}

	/**
	 * Select the UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCounties")
	public ModelAndView confirmDeleteUsCounties(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/uscountiesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesVendorOrganizationses")
	public ModelAndView deleteUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesVendorOrganizationses(uscounties_countyId, related_vendororganizationses_organizationId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesCustomerProfiles")
	public ModelAndView saveUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId, @ModelAttribute CustomerProfile customerprofiles) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesCustomerProfiles(uscounties_countyId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveUsCounties")
	public String saveUsCounties(@ModelAttribute UsCounties uscounties) {
		usCountiesService.saveUsCounties(uscounties);
		return "forward:/indexUsCounties";
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteUsCounties")
	public String deleteUsCounties(@RequestParam Integer countyIdKey) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey);
		usCountiesService.deleteUsCounties(uscounties);
		return "forward:/indexUsCounties";
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editUsCountiesCustomerProfiles")
	public ModelAndView editUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("uscounties/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesVendorOrganizationses")
	public ModelAndView listUsCountiesVendorOrganizationses(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesCustomerProfiles")
	public ModelAndView deleteUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesCustomerProfiles(uscounties_countyId, related_customerprofiles_customerId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newUsCounties")
	public ModelAndView newUsCounties() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesUsCitieses")
	public ModelAndView selectUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId, @RequestParam Integer uscitieses_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscounties/uscitieses/viewUsCitieses.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities
	 * 
	 */
	@RequestMapping("/indexUsCounties")
	public ModelAndView listUsCountiess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscountiess", usCountiesService.loadUsCountiess());

		mav.setViewName("uscounties/listUsCountiess.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesUsCitieses")
	public ModelAndView listUsCountiesUsCitieses(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/uscitieses/listUsCitieses.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesUsStates")
	public ModelAndView confirmDeleteUsCountiesUsStates(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/usstates/deleteUsStates.jsp");

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
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesVendorLocationses")
	public ModelAndView deleteUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesVendorLocationses(uscounties_countyId, related_vendorlocationses_locationId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesVendorOrganizationses")
	public ModelAndView confirmDeleteUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesVendorOrganizationses")
	public ModelAndView selectUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("uscounties/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newUsCountiesUsCitieses")
	public ModelAndView newUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/uscitieses/editUsCitieses.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesCustomerProfiles")
	public ModelAndView selectUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("uscounties/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesUsStates")
	public ModelAndView saveUsCountiesUsStates(@RequestParam Integer uscounties_countyId, @ModelAttribute UsStates usstates) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesUsStates(uscounties_countyId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newUsCountiesRecipientLocations")
	public ModelAndView newUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesVendorOrganizationses")
	public ModelAndView saveUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId, @ModelAttribute VendorOrganizations vendororganizationses) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesVendorOrganizationses(uscounties_countyId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all UsStates entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesUsStates")
	public ModelAndView listUsCountiesUsStates(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesVendorLocationses")
	public ModelAndView saveUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId, @ModelAttribute VendorLocations vendorlocationses) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesVendorLocationses(uscounties_countyId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editUsCountiesUsCitieses")
	public ModelAndView editUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId, @RequestParam Integer uscitieses_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscounties/uscitieses/editUsCitieses.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesRecipientLocations")
	public ModelAndView selectUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("uscounties/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesVendorLocationses")
	public ModelAndView confirmDeleteUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesRecipientLocations")
	public ModelAndView saveUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId, @ModelAttribute RecipientLocation recipientlocations) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesRecipientLocations(uscounties_countyId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesCustomerProfiles")
	public ModelAndView listUsCountiesCustomerProfiles(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveUsCountiesUsCitieses")
	public ModelAndView saveUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId, @ModelAttribute UsCities uscitieses) {
		UsCounties parent_uscounties = usCountiesService.saveUsCountiesUsCitieses(uscounties_countyId, uscitieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", parent_uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newUsCountiesVendorOrganizationses")
	public ModelAndView newUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesUsCitieses")
	public ModelAndView confirmDeleteUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_uscitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscitieses_cityId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/uscitieses/deleteUsCitieses.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesCustomerProfiles")
	public ModelAndView confirmDeleteUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newUsCountiesCustomerProfiles")
	public ModelAndView newUsCountiesCustomerProfiles(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesUsStates")
	public ModelAndView selectUsCountiesUsStates(@RequestParam Integer uscounties_countyId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("usstates", usstates);
		mav.setViewName("uscounties/usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newUsCountiesUsStates")
	public ModelAndView newUsCountiesUsStates(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesUsCitieses")
	public ModelAndView deleteUsCountiesUsCitieses(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_uscitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesUsCitieses(uscounties_countyId, related_uscitieses_cityId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesVendorLocationses")
	public ModelAndView listUsCountiesVendorLocationses(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCountiesRecipientLocations")
	public ModelAndView confirmDeleteUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.setViewName("uscounties/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newUsCountiesVendorLocationses")
	public ModelAndView newUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("uscounties/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editUsCountiesUsStates")
	public ModelAndView editUsCountiesUsStates(@RequestParam Integer uscounties_countyId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("usstates", usstates);
		mav.setViewName("uscounties/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editUsCountiesRecipientLocations")
	public ModelAndView editUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("uscounties/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editUsCountiesVendorOrganizationses")
	public ModelAndView editUsCountiesVendorOrganizationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("uscounties/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by UsCounties
	 * 
	 */
	@RequestMapping("/listUsCountiesRecipientLocations")
	public ModelAndView listUsCountiesRecipientLocations(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectUsCountiesVendorLocationses")
	public ModelAndView selectUsCountiesVendorLocationses(@RequestParam Integer uscounties_countyId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("uscounties/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteUsCountiesRecipientLocations")
	public ModelAndView deleteUsCountiesRecipientLocations(@RequestParam Integer uscounties_countyId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		UsCounties uscounties = usCountiesService.deleteUsCountiesRecipientLocations(uscounties_countyId, related_recipientlocations_recipientLocationId);

		mav.addObject("uscounties_countyId", uscounties_countyId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Select an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectUsCounties")
	public ModelAndView selectUsCounties(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editUsCounties")
	public ModelAndView editUsCounties(@RequestParam Integer countyIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(countyIdKey));
		mav.setViewName("uscounties/editUsCounties.jsp");

		return mav;
	}
}