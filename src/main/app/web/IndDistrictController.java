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

import main.app.service.IndDistrictService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for IndDistrict entities
 * 
 */

@Controller("IndDistrictController")
public class IndDistrictController {

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
	 * Service injected by Spring that provides CRUD operations for IndDistrict entities
	 * 
	 */
	@Autowired
	private IndDistrictService indDistrictService;

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newIndDistrictCustomerProfiles")
	public ModelAndView newIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictVendorLocationses")
	public ModelAndView confirmDeleteIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictVendorLocationses")
	public ModelAndView listIndDistrictVendorLocationses(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictRecipientLocations")
	public ModelAndView selectIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("inddistrict/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editIndDistrictRecipientLocations")
	public ModelAndView editIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("inddistrict/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictIndCitieses")
	public ModelAndView selectIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer indcitieses_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indcities", indcities);
		mav.setViewName("inddistrict/indcitieses/viewIndCitieses.jsp");

		return mav;
	}

	/**
	 * Select an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectIndDistrict")
	public ModelAndView selectIndDistrict(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newIndDistrictVendorLocationses")
	public ModelAndView newIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictCustomerProfiles")
	public ModelAndView deleteIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictCustomerProfiles(inddistrict_districtId, related_customerprofiles_customerId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictIndStates")
	public ModelAndView confirmDeleteIndDistrictIndStates(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrict")
	public String deleteIndDistrict(@RequestParam Integer districtIdKey) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey);
		indDistrictService.deleteIndDistrict(inddistrict);
		return "forward:/indexIndDistrict";
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictIndStates")
	public ModelAndView deleteIndDistrictIndStates(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictIndStates(inddistrict_districtId, related_indstates_stateId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictVendorLocationses")
	public ModelAndView selectIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("inddistrict/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all IndDistrict entities
	 * 
	 */
	public String indexIndDistrict() {
		return "redirect:/indexIndDistrict";
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictIndCitieses")
	public ModelAndView saveIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId, @ModelAttribute IndCities indcitieses) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictIndCitieses(inddistrict_districtId, indcitieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictIndStates")
	public ModelAndView listIndDistrictIndStates(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictCustomerProfiles")
	public ModelAndView saveIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId, @ModelAttribute CustomerProfile customerprofiles) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictCustomerProfiles(inddistrict_districtId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editIndDistrictCustomerProfiles")
	public ModelAndView editIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("inddistrict/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictRecipientLocations")
	public ModelAndView deleteIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictRecipientLocations(inddistrict_districtId, related_recipientlocations_recipientLocationId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictVendorOrganizationses")
	public ModelAndView listIndDistrictVendorOrganizationses(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newIndDistrict")
	public ModelAndView newIndDistrict() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newIndDistrictIndStates")
	public ModelAndView newIndDistrictIndStates(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newIndDistrictVendorOrganizationses")
	public ModelAndView newIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities
	 * 
	 */
	@RequestMapping("/indexIndDistrict")
	public ModelAndView listIndDistricts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistricts", indDistrictService.loadIndDistricts());

		mav.setViewName("inddistrict/listIndDistricts.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictIndStates")
	public ModelAndView saveIndDistrictIndStates(@RequestParam Integer inddistrict_districtId, @ModelAttribute IndStates indstates) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictIndStates(inddistrict_districtId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictVendorOrganizationses")
	public ModelAndView confirmDeleteIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newIndDistrictIndCitieses")
	public ModelAndView newIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/indcitieses/editIndCitieses.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictRecipientLocations")
	public ModelAndView listIndDistrictRecipientLocations(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editIndDistrictIndStates")
	public ModelAndView editIndDistrictIndStates(@RequestParam Integer inddistrict_districtId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indstates", indstates);
		mav.setViewName("inddistrict/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictVendorOrganizationses")
	public ModelAndView selectIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("inddistrict/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictVendorLocationses")
	public ModelAndView deleteIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictVendorLocationses(inddistrict_districtId, related_vendorlocationses_locationId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictIndCitieses")
	public ModelAndView listIndDistrictIndCitieses(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/indcitieses/listIndCitieses.jsp");

		return mav;
	}

	/**
	 * Select the IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrict")
	public ModelAndView confirmDeleteIndDistrict(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/deleteIndDistrict.jsp");

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
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictIndStates")
	public ModelAndView selectIndDistrictIndStates(@RequestParam Integer inddistrict_districtId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indstates", indstates);
		mav.setViewName("inddistrict/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectIndDistrictCustomerProfiles")
	public ModelAndView selectIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("inddistrict/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editIndDistrictVendorOrganizationses")
	public ModelAndView editIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("inddistrict/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictRecipientLocations")
	public ModelAndView saveIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId, @ModelAttribute RecipientLocation recipientlocations) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictRecipientLocations(inddistrict_districtId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictRecipientLocations")
	public ModelAndView confirmDeleteIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictIndCitieses")
	public ModelAndView deleteIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_indcitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictIndCitieses(inddistrict_districtId, related_indcitieses_cityId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newIndDistrictRecipientLocations")
	public ModelAndView newIndDistrictRecipientLocations(@RequestParam Integer inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("inddistrict/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveIndDistrict")
	public String saveIndDistrict(@ModelAttribute IndDistrict inddistrict) {
		indDistrictService.saveIndDistrict(inddistrict);
		return "forward:/indexIndDistrict";
	}

	/**
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictIndCitieses")
	public ModelAndView confirmDeleteIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_indcitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcitieses_cityId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/indcitieses/deleteIndCitieses.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictVendorLocationses")
	public ModelAndView saveIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId, @ModelAttribute VendorLocations vendorlocationses) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictVendorLocationses(inddistrict_districtId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndDistrictCustomerProfiles")
	public ModelAndView confirmDeleteIndDistrictCustomerProfiles(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.setViewName("inddistrict/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editIndDistrict")
	public ModelAndView editIndDistrict(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/inddistrictController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editIndDistrictVendorLocationses")
	public ModelAndView editIndDistrictVendorLocationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("inddistrict/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by IndDistrict
	 * 
	 */
	@RequestMapping("/listIndDistrictCustomerProfiles")
	public ModelAndView listIndDistrictCustomerProfiles(@RequestParam Integer districtIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(districtIdKey));
		mav.setViewName("inddistrict/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveIndDistrictVendorOrganizationses")
	public ModelAndView saveIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId, @ModelAttribute VendorOrganizations vendororganizationses) {
		IndDistrict parent_inddistrict = indDistrictService.saveIndDistrictVendorOrganizationses(inddistrict_districtId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", parent_inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteIndDistrictVendorOrganizationses")
	public ModelAndView deleteIndDistrictVendorOrganizationses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		IndDistrict inddistrict = indDistrictService.deleteIndDistrictVendorOrganizationses(inddistrict_districtId, related_vendororganizationses_organizationId);

		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editIndDistrictIndCitieses")
	public ModelAndView editIndDistrictIndCitieses(@RequestParam Integer inddistrict_districtId, @RequestParam Integer indcitieses_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("inddistrict_districtId", inddistrict_districtId);
		mav.addObject("indcities", indcities);
		mav.setViewName("inddistrict/indcitieses/editIndCitieses.jsp");

		return mav;
	}
}