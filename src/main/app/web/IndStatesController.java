package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

import main.app.service.IndStatesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for IndStates entities
 * 
 */

@Controller("IndStatesController")
public class IndStatesController {

	/**
	 * DAO injected by Spring that manages Countries entities
	 * 
	 */
	@Autowired
	private CountriesDAO countriesDAO;

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
	 * Service injected by Spring that provides CRUD operations for IndStates entities
	 * 
	 */
	@Autowired
	private IndStatesService indStatesService;

	/**
	 * Select an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectIndStates")
	public ModelAndView selectIndStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesCountries")
	public ModelAndView listIndStatesCountries(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/countries/listCountries.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesVendorLocationses")
	public ModelAndView deleteIndStatesVendorLocationses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesVendorLocationses(indstates_stateId, related_vendorlocationses_locationId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectIndStatesCustomerProfiles")
	public ModelAndView selectIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("indstates/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectIndStatesIndCitieses")
	public ModelAndView selectIndStatesIndCitieses(@RequestParam Integer indstates_stateId, @RequestParam Integer indcitieses_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indstates/indcitieses/viewIndCitieses.jsp");

		return mav;
	}

	/**
	 * Select the child Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesCountries")
	public ModelAndView confirmDeleteIndStatesCountries(@RequestParam Integer indstates_stateId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(related_countries_countryId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/countries/deleteCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editIndStatesCountries")
	public ModelAndView editIndStatesCountries(@RequestParam Integer indstates_stateId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("countries", countries);
		mav.setViewName("indstates/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveIndStatesIndDistricts")
	public ModelAndView saveIndStatesIndDistricts(@RequestParam Integer indstates_stateId, @ModelAttribute IndDistrict inddistricts) {
		IndStates parent_indstates = indStatesService.saveIndStatesIndDistricts(indstates_stateId, inddistricts);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesCustomerProfiles")
	public ModelAndView confirmDeleteIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newIndStates")
	public ModelAndView newIndStates() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editIndStatesIndDistricts")
	public ModelAndView editIndStatesIndDistricts(@RequestParam Integer indstates_stateId, @RequestParam Integer inddistricts_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistricts_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("indstates/inddistricts/editIndDistricts.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editIndStatesIndCitieses")
	public ModelAndView editIndStatesIndCitieses(@RequestParam Integer indstates_stateId, @RequestParam Integer indcitieses_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indcities", indcities);
		mav.setViewName("indstates/indcitieses/editIndCitieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesCountries")
	public ModelAndView deleteIndStatesCountries(@RequestParam Integer indstates_stateId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesCountries(indstates_stateId, related_countries_countryId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectIndStatesCountries")
	public ModelAndView selectIndStatesCountries(@RequestParam Integer indstates_stateId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("countries", countries);
		mav.setViewName("indstates/countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editIndStatesRecipientLocations")
	public ModelAndView editIndStatesRecipientLocations(@RequestParam Integer indstates_stateId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("indstates/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveIndStatesRecipientLocations")
	public ModelAndView saveIndStatesRecipientLocations(@RequestParam Integer indstates_stateId, @ModelAttribute RecipientLocation recipientlocations) {
		IndStates parent_indstates = indStatesService.saveIndStatesRecipientLocations(indstates_stateId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesIndDistricts")
	public ModelAndView confirmDeleteIndStatesIndDistricts(@RequestParam Integer indstates_stateId, @RequestParam Integer related_inddistricts_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistricts_districtId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/inddistricts/deleteIndDistricts.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectIndStatesVendorLocationses")
	public ModelAndView selectIndStatesVendorLocationses(@RequestParam Integer indstates_stateId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("indstates/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editIndStates")
	public ModelAndView editIndStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesVendorOrganizationses")
	public ModelAndView deleteIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesVendorOrganizationses(indstates_stateId, related_vendororganizationses_organizationId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesCustomerProfiles")
	public ModelAndView deleteIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesCustomerProfiles(indstates_stateId, related_customerprofiles_customerId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newIndStatesRecipientLocations")
	public ModelAndView newIndStatesRecipientLocations(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newIndStatesIndDistricts")
	public ModelAndView newIndStatesIndDistricts(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/inddistricts/editIndDistricts.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newIndStatesIndCitieses")
	public ModelAndView newIndStatesIndCitieses(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/indcitieses/editIndCitieses.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editIndStatesVendorOrganizationses")
	public ModelAndView editIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("indstates/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newIndStatesVendorLocationses")
	public ModelAndView newIndStatesVendorLocationses(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveIndStatesVendorLocationses")
	public ModelAndView saveIndStatesVendorLocationses(@RequestParam Integer indstates_stateId, @ModelAttribute VendorLocations vendorlocationses) {
		IndStates parent_indstates = indStatesService.saveIndStatesVendorLocationses(indstates_stateId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/indstatesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectIndStatesVendorOrganizationses")
	public ModelAndView selectIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("indstates/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesVendorLocationses")
	public ModelAndView confirmDeleteIndStatesVendorLocationses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newIndStatesCountries")
	public ModelAndView newIndStatesCountries(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesIndCitieses")
	public ModelAndView deleteIndStatesIndCitieses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_indcitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesIndCitieses(indstates_stateId, related_indcitieses_cityId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesVendorLocationses")
	public ModelAndView listIndStatesVendorLocationses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesRecipientLocations")
	public ModelAndView listIndStatesRecipientLocations(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveIndStatesVendorOrganizationses")
	public ModelAndView saveIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId, @ModelAttribute VendorOrganizations vendororganizationses) {
		IndStates parent_indstates = indStatesService.saveIndStatesVendorOrganizationses(indstates_stateId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

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
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesIndCitieses")
	public ModelAndView confirmDeleteIndStatesIndCitieses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_indcitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcitieses_cityId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/indcitieses/deleteIndCitieses.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesCustomerProfiles")
	public ModelAndView listIndStatesCustomerProfiles(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesIndDistricts")
	public ModelAndView deleteIndStatesIndDistricts(@RequestParam Integer indstates_stateId, @RequestParam Integer related_inddistricts_districtId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesIndDistricts(indstates_stateId, related_inddistricts_districtId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities
	 * 
	 */
	@RequestMapping("/indexIndStates")
	public ModelAndView listIndStatess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstatess", indStatesService.loadIndStatess());

		mav.setViewName("indstates/listIndStatess.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectIndStatesRecipientLocations")
	public ModelAndView selectIndStatesRecipientLocations(@RequestParam Integer indstates_stateId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("indstates/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStates")
	public ModelAndView confirmDeleteIndStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editIndStatesVendorLocationses")
	public ModelAndView editIndStatesVendorLocationses(@RequestParam Integer indstates_stateId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("indstates/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveIndStatesCustomerProfiles")
	public ModelAndView saveIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId, @ModelAttribute CustomerProfile customerprofiles) {
		IndStates parent_indstates = indStatesService.saveIndStatesCustomerProfiles(indstates_stateId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesVendorOrganizationses")
	public ModelAndView listIndStatesVendorOrganizationses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newIndStatesVendorOrganizationses")
	public ModelAndView newIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveIndStates")
	public String saveIndStates(@ModelAttribute IndStates indstates) {
		indStatesService.saveIndStates(indstates);
		return "forward:/indexIndStates";
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newIndStatesCustomerProfiles")
	public ModelAndView newIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("indstates/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesIndCitieses")
	public ModelAndView listIndStatesIndCitieses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/indcitieses/listIndCitieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteIndStatesRecipientLocations")
	public ModelAndView deleteIndStatesRecipientLocations(@RequestParam Integer indstates_stateId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		IndStates indstates = indStatesService.deleteIndStatesRecipientLocations(indstates_stateId, related_recipientlocations_recipientLocationId);

		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by IndStates
	 * 
	 */
	@RequestMapping("/listIndStatesIndDistricts")
	public ModelAndView listIndStatesIndDistricts(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(stateIdKey));
		mav.setViewName("indstates/inddistricts/listIndDistricts.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesRecipientLocations")
	public ModelAndView confirmDeleteIndStatesRecipientLocations(@RequestParam Integer indstates_stateId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all IndStates entities
	 * 
	 */
	public String indexIndStates() {
		return "redirect:/indexIndStates";
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveIndStatesCountries")
	public ModelAndView saveIndStatesCountries(@RequestParam Integer indstates_stateId, @ModelAttribute Countries countries) {
		IndStates parent_indstates = indStatesService.saveIndStatesCountries(indstates_stateId, countries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveIndStatesIndCitieses")
	public ModelAndView saveIndStatesIndCitieses(@RequestParam Integer indstates_stateId, @ModelAttribute IndCities indcitieses) {
		IndStates parent_indstates = indStatesService.saveIndStatesIndCitieses(indstates_stateId, indcitieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("indstates", parent_indstates);
		mav.setViewName("indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectIndStatesIndDistricts")
	public ModelAndView selectIndStatesIndDistricts(@RequestParam Integer indstates_stateId, @RequestParam Integer inddistricts_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistricts_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("indstates/inddistricts/viewIndDistricts.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteIndStatesVendorOrganizationses")
	public ModelAndView confirmDeleteIndStatesVendorOrganizationses(@RequestParam Integer indstates_stateId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.setViewName("indstates/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteIndStates")
	public String deleteIndStates(@RequestParam Integer stateIdKey) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(stateIdKey);
		indStatesService.deleteIndStates(indstates);
		return "forward:/indexIndStates";
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editIndStatesCustomerProfiles")
	public ModelAndView editIndStatesCustomerProfiles(@RequestParam Integer indstates_stateId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("indstates_stateId", indstates_stateId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("indstates/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}
}