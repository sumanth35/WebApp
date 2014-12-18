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

import main.app.service.UsCitiesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for UsCities entities
 * 
 */

@Controller("UsCitiesController")
public class UsCitiesController {

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
	 * Service injected by Spring that provides CRUD operations for UsCities entities
	 * 
	 */
	@Autowired
	private UsCitiesService usCitiesService;

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
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newUsCitiesRecipientLocations")
	public ModelAndView newUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesVendorOrganizationses")
	public ModelAndView confirmDeleteUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newUsCities")
	public ModelAndView newUsCities() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveUsCities")
	public String saveUsCities(@ModelAttribute UsCities uscities) {
		usCitiesService.saveUsCities(uscities);
		return "forward:/indexUsCities";
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesVendorOrganizationses")
	public ModelAndView selectUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("uscities/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesVendorOrganizationses")
	public ModelAndView deleteUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesVendorOrganizationses(uscities_cityId, related_vendororganizationses_organizationId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesCustomerProfiles")
	public ModelAndView deleteUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesCustomerProfiles(uscities_cityId, related_customerprofiles_customerId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editUsCitiesVendorOrganizationses")
	public ModelAndView editUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("uscities/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesUsCounties")
	public ModelAndView saveUsCitiesUsCounties(@RequestParam Integer uscities_cityId, @ModelAttribute UsCounties uscounties) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesUsCounties(uscities_cityId, uscounties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newUsCitiesCustomerProfiles")
	public ModelAndView newUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesCustomerProfiles")
	public ModelAndView listUsCitiesCustomerProfiles(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesUsStates")
	public ModelAndView selectUsCitiesUsStates(@RequestParam Integer uscities_cityId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("usstates", usstates);
		mav.setViewName("uscities/usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editUsCitiesUsStates")
	public ModelAndView editUsCitiesUsStates(@RequestParam Integer uscities_cityId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("usstates", usstates);
		mav.setViewName("uscities/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesRecipientLocations")
	public ModelAndView selectUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("uscities/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editUsCitiesRecipientLocations")
	public ModelAndView editUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("uscities/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesVendorLocationses")
	public ModelAndView confirmDeleteUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesUsCounties")
	public ModelAndView listUsCitiesUsCounties(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/uscounties/listUsCounties.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesCustomerProfiles")
	public ModelAndView saveUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId, @ModelAttribute CustomerProfile customerprofiles) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesCustomerProfiles(uscities_cityId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteUsCities")
	public String deleteUsCities(@RequestParam Integer cityIdKey) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey);
		usCitiesService.deleteUsCities(uscities);
		return "forward:/indexUsCities";
	}

	/**
	 * Show all RecipientLocation entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesRecipientLocations")
	public ModelAndView listUsCitiesRecipientLocations(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesVendorLocationses")
	public ModelAndView selectUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("uscities/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all UsCities entities
	 * 
	 */
	public String indexUsCities() {
		return "redirect:/indexUsCities";
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesVendorOrganizationses")
	public ModelAndView saveUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId, @ModelAttribute VendorOrganizations vendororganizationses) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesVendorOrganizationses(uscities_cityId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Select the UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCities")
	public ModelAndView confirmDeleteUsCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/deleteUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesCustomerProfiles")
	public ModelAndView confirmDeleteUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newUsCitiesUsStates")
	public ModelAndView newUsCitiesUsStates(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Show all UsStates entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesUsStates")
	public ModelAndView listUsCitiesUsStates(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newUsCitiesVendorOrganizationses")
	public ModelAndView newUsCitiesVendorOrganizationses(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesUsCounties")
	public ModelAndView selectUsCitiesUsCounties(@RequestParam Integer uscities_cityId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscities/uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesUsStates")
	public ModelAndView saveUsCitiesUsStates(@RequestParam Integer uscities_cityId, @ModelAttribute UsStates usstates) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesUsStates(uscities_cityId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newUsCitiesUsCounties")
	public ModelAndView newUsCitiesUsCounties(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities
	 * 
	 */
	@RequestMapping("/indexUsCities")
	public ModelAndView listUsCitiess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscitiess", usCitiesService.loadUsCitiess());

		mav.setViewName("uscities/listUsCitiess.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editUsCitiesUsCounties")
	public ModelAndView editUsCitiesUsCounties(@RequestParam Integer uscities_cityId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("uscities/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Select an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectUsCities")
	public ModelAndView selectUsCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/uscitiesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all VendorLocations entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesVendorLocationses")
	public ModelAndView listUsCitiesVendorLocationses(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesUsStates")
	public ModelAndView confirmDeleteUsCitiesUsStates(@RequestParam Integer uscities_cityId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editUsCitiesVendorLocationses")
	public ModelAndView editUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("uscities/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesUsCounties")
	public ModelAndView confirmDeleteUsCitiesUsCounties(@RequestParam Integer uscities_cityId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editUsCities")
	public ModelAndView editUsCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editUsCitiesCustomerProfiles")
	public ModelAndView editUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("uscities/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesUsCounties")
	public ModelAndView deleteUsCitiesUsCounties(@RequestParam Integer uscities_cityId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesUsCounties(uscities_cityId, related_uscounties_countyId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesVendorLocationses")
	public ModelAndView deleteUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesVendorLocationses(uscities_cityId, related_vendorlocationses_locationId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesRecipientLocations")
	public ModelAndView deleteUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesRecipientLocations(uscities_cityId, related_recipientlocations_recipientLocationId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by UsCities
	 * 
	 */
	@RequestMapping("/listUsCitiesVendorOrganizationses")
	public ModelAndView listUsCitiesVendorOrganizationses(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("uscities/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectUsCitiesCustomerProfiles")
	public ModelAndView selectUsCitiesCustomerProfiles(@RequestParam Integer uscities_cityId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("uscities/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesVendorLocationses")
	public ModelAndView saveUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId, @ModelAttribute VendorLocations vendorlocationses) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesVendorLocationses(uscities_cityId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveUsCitiesRecipientLocations")
	public ModelAndView saveUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId, @ModelAttribute RecipientLocation recipientlocations) {
		UsCities parent_uscities = usCitiesService.saveUsCitiesRecipientLocations(uscities_cityId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", parent_uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsCitiesRecipientLocations")
	public ModelAndView confirmDeleteUsCitiesRecipientLocations(@RequestParam Integer uscities_cityId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.setViewName("uscities/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newUsCitiesVendorLocationses")
	public ModelAndView newUsCitiesVendorLocationses(@RequestParam Integer uscities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("uscities/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteUsCitiesUsStates")
	public ModelAndView deleteUsCitiesUsStates(@RequestParam Integer uscities_cityId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		UsCities uscities = usCitiesService.deleteUsCitiesUsStates(uscities_cityId, related_usstates_stateId);

		mav.addObject("uscities_cityId", uscities_cityId);
		mav.addObject("uscities", uscities);
		mav.setViewName("uscities/viewUsCities.jsp");

		return mav;
	}
}