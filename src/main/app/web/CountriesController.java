package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

import main.app.service.CountriesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Countries entities
 * 
 */

@Controller("CountriesController")
public class CountriesController {

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
	 * DAO injected by Spring that manages UsStates entities
	 * 
	 */
	@Autowired
	private UsStatesDAO usStatesDAO;

	/**
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Countries entities
	 * 
	 */
	@Autowired
	private CountriesService countriesService;

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editCountriesUsStateses")
	public ModelAndView editCountriesUsStateses(@RequestParam Integer countries_countryId, @RequestParam Integer usstateses_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstateses_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("usstates", usstates);
		mav.setViewName("countries/usstateses/editUsStateses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/countriesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newCountriesIndStateses")
	public ModelAndView newCountriesIndStateses(@RequestParam Integer countries_countryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/indstateses/editIndStateses.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteCountriesVendorOrganizationses")
	public ModelAndView deleteCountriesVendorOrganizationses(@RequestParam Integer countries_countryId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		Countries countries = countriesService.deleteCountriesVendorOrganizationses(countries_countryId, related_vendororganizationses_organizationId);

		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editCountriesIndStateses")
	public ModelAndView editCountriesIndStateses(@RequestParam Integer countries_countryId, @RequestParam Integer indstateses_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstateses_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("indstates", indstates);
		mav.setViewName("countries/indstateses/editIndStateses.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectCountriesRecipientLocations")
	public ModelAndView selectCountriesRecipientLocations(@RequestParam Integer countries_countryId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("countries/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountriesVendorOrganizationses")
	public ModelAndView confirmDeleteCountriesVendorOrganizationses(@RequestParam Integer countries_countryId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("countries_countryId", countries_countryId);
		mav.setViewName("countries/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectCountriesVendorOrganizationses")
	public ModelAndView selectCountriesVendorOrganizationses(@RequestParam Integer countries_countryId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("countries/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteCountriesUsStateses")
	public ModelAndView deleteCountriesUsStateses(@RequestParam Integer countries_countryId, @RequestParam Integer related_usstateses_stateId) {
		ModelAndView mav = new ModelAndView();

		Countries countries = countriesService.deleteCountriesUsStateses(countries_countryId, related_usstateses_stateId);

		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveCountriesUsStateses")
	public ModelAndView saveCountriesUsStateses(@RequestParam Integer countries_countryId, @ModelAttribute UsStates usstateses) {
		Countries parent_countries = countriesService.saveCountriesUsStateses(countries_countryId, usstateses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", parent_countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities
	 * 
	 */
	@RequestMapping("/indexCountries")
	public ModelAndView listCountriess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countriess", countriesService.loadCountriess());

		mav.setViewName("countries/listCountriess.jsp");

		return mav;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveCountries")
	public String saveCountries(@ModelAttribute Countries countries) {
		countriesService.saveCountries(countries);
		return "forward:/indexCountries";
	}

	/**
	 * Select an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectCountries")
	public ModelAndView selectCountries(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by Countries
	 * 
	 */
	@RequestMapping("/listCountriesVendorOrganizationses")
	public ModelAndView listCountriesVendorOrganizationses(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveCountriesCustomerProfiles")
	public ModelAndView saveCountriesCustomerProfiles(@RequestParam Integer countries_countryId, @ModelAttribute CustomerProfile customerprofiles) {
		Countries parent_countries = countriesService.saveCountriesCustomerProfiles(countries_countryId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", parent_countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveCountriesRecipientLocations")
	public ModelAndView saveCountriesRecipientLocations(@RequestParam Integer countries_countryId, @ModelAttribute RecipientLocation recipientlocations) {
		Countries parent_countries = countriesService.saveCountriesRecipientLocations(countries_countryId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", parent_countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountriesCustomerProfiles")
	public ModelAndView confirmDeleteCountriesCustomerProfiles(@RequestParam Integer countries_countryId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("countries_countryId", countries_countryId);
		mav.setViewName("countries/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveCountriesIndStateses")
	public ModelAndView saveCountriesIndStateses(@RequestParam Integer countries_countryId, @ModelAttribute IndStates indstateses) {
		Countries parent_countries = countriesService.saveCountriesIndStateses(countries_countryId, indstateses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", parent_countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteCountriesRecipientLocations")
	public ModelAndView deleteCountriesRecipientLocations(@RequestParam Integer countries_countryId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		Countries countries = countriesService.deleteCountriesRecipientLocations(countries_countryId, related_recipientlocations_recipientLocationId);

		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newCountriesCustomerProfiles")
	public ModelAndView newCountriesCustomerProfiles(@RequestParam Integer countries_countryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountriesUsStateses")
	public ModelAndView confirmDeleteCountriesUsStateses(@RequestParam Integer countries_countryId, @RequestParam Integer related_usstateses_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstateses_stateId));
		mav.addObject("countries_countryId", countries_countryId);
		mav.setViewName("countries/usstateses/deleteUsStateses.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteCountriesIndStateses")
	public ModelAndView deleteCountriesIndStateses(@RequestParam Integer countries_countryId, @RequestParam Integer related_indstateses_stateId) {
		ModelAndView mav = new ModelAndView();

		Countries countries = countriesService.deleteCountriesIndStateses(countries_countryId, related_indstateses_stateId);

		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by Countries
	 * 
	 */
	@RequestMapping("/listCountriesRecipientLocations")
	public ModelAndView listCountriesRecipientLocations(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectCountriesUsStateses")
	public ModelAndView selectCountriesUsStateses(@RequestParam Integer countries_countryId, @RequestParam Integer usstateses_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstateses_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("usstates", usstates);
		mav.setViewName("countries/usstateses/viewUsStateses.jsp");

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
	@RequestMapping("/selectCountriesIndStateses")
	public ModelAndView selectCountriesIndStateses(@RequestParam Integer countries_countryId, @RequestParam Integer indstateses_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstateses_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("indstates", indstates);
		mav.setViewName("countries/indstateses/viewIndStateses.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountriesRecipientLocations")
	public ModelAndView confirmDeleteCountriesRecipientLocations(@RequestParam Integer countries_countryId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("countries_countryId", countries_countryId);
		mav.setViewName("countries/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by Countries
	 * 
	 */
	@RequestMapping("/listCountriesCustomerProfiles")
	public ModelAndView listCountriesCustomerProfiles(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountriesIndStateses")
	public ModelAndView confirmDeleteCountriesIndStateses(@RequestParam Integer countries_countryId, @RequestParam Integer related_indstateses_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstateses_stateId));
		mav.addObject("countries_countryId", countries_countryId);
		mav.setViewName("countries/indstateses/deleteIndStateses.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newCountriesUsStateses")
	public ModelAndView newCountriesUsStateses(@RequestParam Integer countries_countryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/usstateses/editUsStateses.jsp");

		return mav;
	}

	/**
	 * Select the Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCountries")
	public ModelAndView confirmDeleteCountries(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/deleteCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editCountriesRecipientLocations")
	public ModelAndView editCountriesRecipientLocations(@RequestParam Integer countries_countryId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("countries/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by Countries
	 * 
	 */
	@RequestMapping("/listCountriesIndStateses")
	public ModelAndView listCountriesIndStateses(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/indstateses/listIndStateses.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editCountriesCustomerProfiles")
	public ModelAndView editCountriesCustomerProfiles(@RequestParam Integer countries_countryId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("countries/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newCountries")
	public ModelAndView newCountries() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/editCountries.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectCountriesCustomerProfiles")
	public ModelAndView selectCountriesCustomerProfiles(@RequestParam Integer countries_countryId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("countries/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editCountriesVendorOrganizationses")
	public ModelAndView editCountriesVendorOrganizationses(@RequestParam Integer countries_countryId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("countries/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteCountriesCustomerProfiles")
	public ModelAndView deleteCountriesCustomerProfiles(@RequestParam Integer countries_countryId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		Countries countries = countriesService.deleteCountriesCustomerProfiles(countries_countryId, related_customerprofiles_customerId);

		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editCountries")
	public ModelAndView editCountries(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Countries entities
	 * 
	 */
	public String indexCountries() {
		return "redirect:/indexCountries";
	}

	/**
	 * Show all UsStates entities by Countries
	 * 
	 */
	@RequestMapping("/listCountriesUsStateses")
	public ModelAndView listCountriesUsStateses(@RequestParam Integer countryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(countryIdKey));
		mav.setViewName("countries/usstateses/listUsStateses.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newCountriesRecipientLocations")
	public ModelAndView newCountriesRecipientLocations(@RequestParam Integer countries_countryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteCountries")
	public String deleteCountries(@RequestParam Integer countryIdKey) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countryIdKey);
		countriesService.deleteCountries(countries);
		return "forward:/indexCountries";
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newCountriesVendorOrganizationses")
	public ModelAndView newCountriesVendorOrganizationses(@RequestParam Integer countries_countryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("countries/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveCountriesVendorOrganizationses")
	public ModelAndView saveCountriesVendorOrganizationses(@RequestParam Integer countries_countryId, @ModelAttribute VendorOrganizations vendororganizationses) {
		Countries parent_countries = countriesService.saveCountriesVendorOrganizationses(countries_countryId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("countries_countryId", countries_countryId);
		mav.addObject("countries", parent_countries);
		mav.setViewName("countries/viewCountries.jsp");

		return mav;
	}
}