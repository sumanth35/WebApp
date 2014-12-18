package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

import main.app.service.IndCitiesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for IndCities entities
 * 
 */

@Controller("IndCitiesController")
public class IndCitiesController {

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

	/**
	 * DAO injected by Spring that manages IndCities entities
	 * 
	 */
	@Autowired
	private IndCitiesDAO indCitiesDAO;

	/**
	 * DAO injected by Spring that manages IndDistrict entities
	 * 
	 */
	@Autowired
	private IndDistrictDAO indDistrictDAO;

	/**
	 * DAO injected by Spring that manages IndStates entities
	 * 
	 */
	@Autowired
	private IndStatesDAO indStatesDAO;

	/**
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

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
	 * Service injected by Spring that provides CRUD operations for IndCities entities
	 * 
	 */
	@Autowired
	private IndCitiesService indCitiesService;

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesCustomerProfiles")
	public ModelAndView deleteIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesCustomerProfiles(indcities_cityId, related_customerprofiles_customerId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesVendorOrganizationses")
	public ModelAndView selectIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("indcities/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteIndCities")
	public String deleteIndCities(@RequestParam Integer cityIdKey) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey);
		indCitiesService.deleteIndCities(indcities);
		return "forward:/indexIndCities";
	}

	/**
	 */
	@RequestMapping("/indcitiesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editIndCitiesIndDistrict")
	public ModelAndView editIndCitiesIndDistrict(@RequestParam Integer indcities_cityId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("indcities/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesIndDistrict")
	public ModelAndView saveIndCitiesIndDistrict(@RequestParam Integer indcities_cityId, @ModelAttribute IndDistrict inddistrict) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesIndDistrict(indcities_cityId, inddistrict);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesRecipientLocations")
	public ModelAndView deleteIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesRecipientLocations(indcities_cityId, related_recipientlocations_recipientLocationId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesRecipientLocations")
	public ModelAndView confirmDeleteIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesCustomerProfiles")
	public ModelAndView listIndCitiesCustomerProfiles(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesIndDistrict")
	public ModelAndView selectIndCitiesIndDistrict(@RequestParam Integer indcities_cityId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("indcities/inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectIndCities")
	public ModelAndView selectIndCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesIndStates")
	public ModelAndView listIndCitiesIndStates(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editIndCitiesCustomerProfiles")
	public ModelAndView editIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("indcities/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesVendorOrganizationses")
	public ModelAndView saveIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId, @ModelAttribute VendorOrganizations vendororganizationses) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesVendorOrganizationses(indcities_cityId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editIndCities")
	public ModelAndView editIndCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesVendorOrganizationses")
	public ModelAndView deleteIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesVendorOrganizationses(indcities_cityId, related_vendororganizationses_organizationId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Select the IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCities")
	public ModelAndView confirmDeleteIndCities(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/deleteIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesVendorLocationses")
	public ModelAndView deleteIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesVendorLocationses(indcities_cityId, related_vendorlocationses_locationId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editIndCitiesRecipientLocations")
	public ModelAndView editIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("indcities/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesIndDistrict")
	public ModelAndView confirmDeleteIndCitiesIndDistrict(@RequestParam Integer indcities_cityId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/inddistrict/deleteIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesVendorLocationses")
	public ModelAndView confirmDeleteIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newIndCitiesIndStates")
	public ModelAndView newIndCitiesIndStates(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newIndCitiesVendorLocationses")
	public ModelAndView newIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesIndStates")
	public ModelAndView saveIndCitiesIndStates(@RequestParam Integer indcities_cityId, @ModelAttribute IndStates indstates) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesIndStates(indcities_cityId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveIndCities")
	public String saveIndCities(@ModelAttribute IndCities indcities) {
		indCitiesService.saveIndCities(indcities);
		return "forward:/indexIndCities";
	}

	/**
	 * Show all VendorLocations entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesVendorLocationses")
	public ModelAndView listIndCitiesVendorLocationses(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editIndCitiesVendorLocationses")
	public ModelAndView editIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("indcities/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newIndCitiesRecipientLocations")
	public ModelAndView newIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/recipientlocations/editRecipientLocations.jsp");

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
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesVendorOrganizationses")
	public ModelAndView confirmDeleteIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities
	 * 
	 */
	@RequestMapping("/indexIndCities")
	public ModelAndView listIndCitiess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcitiess", indCitiesService.loadIndCitiess());

		mav.setViewName("indcities/listIndCitiess.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesIndStates")
	public ModelAndView confirmDeleteIndCitiesIndStates(@RequestParam Integer indcities_cityId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesCustomerProfiles")
	public ModelAndView selectIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("indcities/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editIndCitiesVendorOrganizationses")
	public ModelAndView editIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("indcities/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editIndCitiesIndStates")
	public ModelAndView editIndCitiesIndStates(@RequestParam Integer indcities_cityId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indcities/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesIndStates")
	public ModelAndView selectIndCitiesIndStates(@RequestParam Integer indcities_cityId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indcities/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesIndDistrict")
	public ModelAndView deleteIndCitiesIndDistrict(@RequestParam Integer indcities_cityId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesIndDistrict(indcities_cityId, related_inddistrict_districtId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesIndDistrict")
	public ModelAndView listIndCitiesIndDistrict(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/inddistrict/listIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesVendorOrganizationses")
	public ModelAndView listIndCitiesVendorOrganizationses(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newIndCitiesVendorOrganizationses")
	public ModelAndView newIndCitiesVendorOrganizationses(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteIndCitiesIndStates")
	public ModelAndView deleteIndCitiesIndStates(@RequestParam Integer indcities_cityId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		IndCities indcities = indCitiesService.deleteIndCitiesIndStates(indcities_cityId, related_indstates_stateId);

		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesVendorLocationses")
	public ModelAndView saveIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId, @ModelAttribute VendorLocations vendorlocationses) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesVendorLocationses(indcities_cityId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesRecipientLocations")
	public ModelAndView saveIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId, @ModelAttribute RecipientLocation recipientlocations) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesRecipientLocations(indcities_cityId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesVendorLocationses")
	public ModelAndView selectIndCitiesVendorLocationses(@RequestParam Integer indcities_cityId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("indcities/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newIndCitiesCustomerProfiles")
	public ModelAndView newIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newIndCities")
	public ModelAndView newIndCities() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by IndCities
	 * 
	 */
	@RequestMapping("/listIndCitiesRecipientLocations")
	public ModelAndView listIndCitiesRecipientLocations(@RequestParam Integer cityIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(cityIdKey));
		mav.setViewName("indcities/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveIndCitiesCustomerProfiles")
	public ModelAndView saveIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId, @ModelAttribute CustomerProfile customerprofiles) {
		IndCities parent_indcities = indCitiesService.saveIndCitiesCustomerProfiles(indcities_cityId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("indcities", parent_indcities);
		mav.setViewName("indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectIndCitiesRecipientLocations")
	public ModelAndView selectIndCitiesRecipientLocations(@RequestParam Integer indcities_cityId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("indcities/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newIndCitiesIndDistrict")
	public ModelAndView newIndCitiesIndDistrict(@RequestParam Integer indcities_cityId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("indcities/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Entry point to show all IndCities entities
	 * 
	 */
	public String indexIndCities() {
		return "redirect:/indexIndCities";
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndCitiesCustomerProfiles")
	public ModelAndView confirmDeleteIndCitiesCustomerProfiles(@RequestParam Integer indcities_cityId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("indcities_cityId", indcities_cityId);
		mav.setViewName("indcities/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}
}