package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.RecipientLocation;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;
import main.app.domain.VendorOrganizations;

import main.app.service.UsStatesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for UsStates entities
 * 
 */

@Controller("UsStatesController")
public class UsStatesController {

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
	 * Service injected by Spring that provides CRUD operations for UsStates entities
	 * 
	 */
	@Autowired
	private UsStatesService usStatesService;

	/**
	 * Entry point to show all UsStates entities
	 * 
	 */
	public String indexUsStates() {
		return "redirect:/indexUsStates";
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteUsStates")
	public String deleteUsStates(@RequestParam Integer stateIdKey) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(stateIdKey);
		usStatesService.deleteUsStates(usstates);
		return "forward:/indexUsStates";
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newUsStatesUsCountieses")
	public ModelAndView newUsStatesUsCountieses(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/uscountieses/editUsCountieses.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newUsStatesCountries")
	public ModelAndView newUsStatesCountries(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveUsStates")
	public String saveUsStates(@ModelAttribute UsStates usstates) {
		usStatesService.saveUsStates(usstates);
		return "forward:/indexUsStates";
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesUsCountieses")
	public ModelAndView confirmDeleteUsStatesUsCountieses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_uscountieses_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscountieses_countyId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/uscountieses/deleteUsCountieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesUsCitieses")
	public ModelAndView deleteUsStatesUsCitieses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_uscitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesUsCitieses(usstates_stateId, related_uscitieses_cityId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesCustomerProfiles")
	public ModelAndView deleteUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesCustomerProfiles(usstates_stateId, related_customerprofiles_customerId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Select the UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStates")
	public ModelAndView confirmDeleteUsStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectUsStatesVendorLocationses")
	public ModelAndView selectUsStatesVendorLocationses(@RequestParam Integer usstates_stateId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("usstates/vendorlocationses/viewVendorLocationses.jsp");

		return mav;
	}

	/**
	 * View an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectUsStatesVendorOrganizationses")
	public ModelAndView selectUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("usstates/vendororganizationses/viewVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectUsStatesUsCitieses")
	public ModelAndView selectUsStatesUsCitieses(@RequestParam Integer usstates_stateId, @RequestParam Integer uscitieses_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscities", uscities);
		mav.setViewName("usstates/uscitieses/viewUsCitieses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editUsStatesCountries")
	public ModelAndView editUsStatesCountries(@RequestParam Integer usstates_stateId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("countries", countries);
		mav.setViewName("usstates/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newUsStatesVendorOrganizationses")
	public ModelAndView newUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesVendorLocationses")
	public ModelAndView confirmDeleteUsStatesVendorLocationses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocationses_locationId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/vendorlocationses/deleteVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveUsStatesVendorLocationses")
	public ModelAndView saveUsStatesVendorLocationses(@RequestParam Integer usstates_stateId, @ModelAttribute VendorLocations vendorlocationses) {
		UsStates parent_usstates = usStatesService.saveUsStatesVendorLocationses(usstates_stateId, vendorlocationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Show all UsStates entities
	 * 
	 */
	@RequestMapping("/indexUsStates")
	public ModelAndView listUsStatess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstatess", usStatesService.loadUsStatess());

		mav.setViewName("usstates/listUsStatess.jsp");

		return mav;
	}

	/**
	 * View an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectUsStatesCountries")
	public ModelAndView selectUsStatesCountries(@RequestParam Integer usstates_stateId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("countries", countries);
		mav.setViewName("usstates/countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveUsStatesCountries")
	public ModelAndView saveUsStatesCountries(@RequestParam Integer usstates_stateId, @ModelAttribute Countries countries) {
		UsStates parent_usstates = usStatesService.saveUsStatesCountries(usstates_stateId, countries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editUsStatesCustomerProfiles")
	public ModelAndView editUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("usstates/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveUsStatesVendorOrganizationses")
	public ModelAndView saveUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId, @ModelAttribute VendorOrganizations vendororganizationses) {
		UsStates parent_usstates = usStatesService.saveUsStatesVendorOrganizationses(usstates_stateId, vendororganizationses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectUsStatesUsCountieses")
	public ModelAndView selectUsStatesUsCountieses(@RequestParam Integer usstates_stateId, @RequestParam Integer uscountieses_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscountieses_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("usstates/uscountieses/viewUsCountieses.jsp");

		return mav;
	}

	/**
	 * Select the child Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesCountries")
	public ModelAndView confirmDeleteUsStatesCountries(@RequestParam Integer usstates_stateId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(related_countries_countryId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/countries/deleteCountries.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesRecipientLocations")
	public ModelAndView listUsStatesRecipientLocations(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/recipientlocations/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesVendorOrganizationses")
	public ModelAndView confirmDeleteUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(related_vendororganizationses_organizationId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/vendororganizationses/deleteVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveUsStatesCustomerProfiles")
	public ModelAndView saveUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId, @ModelAttribute CustomerProfile customerprofiles) {
		UsStates parent_usstates = usStatesService.saveUsStatesCustomerProfiles(usstates_stateId, customerprofiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesUsCitieses")
	public ModelAndView listUsStatesUsCitieses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/uscitieses/listUsCitieses.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editUsStatesVendorLocationses")
	public ModelAndView editUsStatesVendorLocationses(@RequestParam Integer usstates_stateId, @RequestParam Integer vendorlocationses_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocationses_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("usstates/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesUsCitieses")
	public ModelAndView confirmDeleteUsStatesUsCitieses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_uscitieses_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscitieses_cityId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/uscitieses/deleteUsCitieses.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesVendorLocationses")
	public ModelAndView listUsStatesVendorLocationses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/vendorlocationses/listVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectUsStates")
	public ModelAndView selectUsStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editUsStates")
	public ModelAndView editUsStates(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectUsStatesRecipientLocations")
	public ModelAndView selectUsStatesRecipientLocations(@RequestParam Integer usstates_stateId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("usstates/recipientlocations/viewRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newUsStatesUsCitieses")
	public ModelAndView newUsStatesUsCitieses(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/uscitieses/editUsCitieses.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesUsCountieses")
	public ModelAndView listUsStatesUsCountieses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/uscountieses/listUsCountieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesCountries")
	public ModelAndView deleteUsStatesCountries(@RequestParam Integer usstates_stateId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesCountries(usstates_stateId, related_countries_countryId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesVendorLocationses")
	public ModelAndView deleteUsStatesVendorLocationses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_vendorlocationses_locationId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesVendorLocationses(usstates_stateId, related_vendorlocationses_locationId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newUsStatesRecipientLocations")
	public ModelAndView newUsStatesRecipientLocations(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesCustomerProfiles")
	public ModelAndView listUsStatesCustomerProfiles(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/customerprofiles/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesRecipientLocations")
	public ModelAndView deleteUsStatesRecipientLocations(@RequestParam Integer usstates_stateId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesRecipientLocations(usstates_stateId, related_recipientlocations_recipientLocationId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editUsStatesRecipientLocations")
	public ModelAndView editUsStatesRecipientLocations(@RequestParam Integer usstates_stateId, @RequestParam Integer recipientlocations_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocations_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("usstates/recipientlocations/editRecipientLocations.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectUsStatesCustomerProfiles")
	public ModelAndView selectUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId, @RequestParam Integer customerprofiles_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofiles_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("usstates/customerprofiles/viewCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editUsStatesUsCitieses")
	public ModelAndView editUsStatesUsCitieses(@RequestParam Integer usstates_stateId, @RequestParam Integer uscitieses_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscitieses_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscities", uscities);
		mav.setViewName("usstates/uscitieses/editUsCitieses.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesVendorOrganizationses")
	public ModelAndView deleteUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_vendororganizationses_organizationId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesVendorOrganizationses(usstates_stateId, related_vendororganizationses_organizationId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editUsStatesUsCountieses")
	public ModelAndView editUsStatesUsCountieses(@RequestParam Integer usstates_stateId, @RequestParam Integer uscountieses_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscountieses_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("usstates/uscountieses/editUsCountieses.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesCountries")
	public ModelAndView listUsStatesCountries(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/countries/listCountries.jsp");

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
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveUsStatesUsCitieses")
	public ModelAndView saveUsStatesUsCitieses(@RequestParam Integer usstates_stateId, @ModelAttribute UsCities uscitieses) {
		UsStates parent_usstates = usStatesService.saveUsStatesUsCitieses(usstates_stateId, uscitieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newUsStates")
	public ModelAndView newUsStates() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newUsStatesVendorLocationses")
	public ModelAndView newUsStatesVendorLocationses(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/vendorlocationses/editVendorLocationses.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesRecipientLocations")
	public ModelAndView confirmDeleteUsStatesRecipientLocations(@RequestParam Integer usstates_stateId, @RequestParam Integer related_recipientlocations_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocations_recipientLocationId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/recipientlocations/deleteRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveUsStatesUsCountieses")
	public ModelAndView saveUsStatesUsCountieses(@RequestParam Integer usstates_stateId, @ModelAttribute UsCounties uscountieses) {
		UsStates parent_usstates = usStatesService.saveUsStatesUsCountieses(usstates_stateId, uscountieses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveUsStatesRecipientLocations")
	public ModelAndView saveUsStatesRecipientLocations(@RequestParam Integer usstates_stateId, @ModelAttribute RecipientLocation recipientlocations) {
		UsStates parent_usstates = usStatesService.saveUsStatesRecipientLocations(usstates_stateId, recipientlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", parent_usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/usstatesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteUsStatesUsCountieses")
	public ModelAndView deleteUsStatesUsCountieses(@RequestParam Integer usstates_stateId, @RequestParam Integer related_uscountieses_countyId) {
		ModelAndView mav = new ModelAndView();

		UsStates usstates = usStatesService.deleteUsStatesUsCountieses(usstates_stateId, related_uscountieses_countyId);

		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("usstates", usstates);
		mav.setViewName("usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities by UsStates
	 * 
	 */
	@RequestMapping("/listUsStatesVendorOrganizationses")
	public ModelAndView listUsStatesVendorOrganizationses(@RequestParam Integer stateIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(stateIdKey));
		mav.setViewName("usstates/vendororganizationses/listVendorOrganizationses.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteUsStatesCustomerProfiles")
	public ModelAndView confirmDeleteUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId, @RequestParam Integer related_customerprofiles_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofiles_customerId));
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.setViewName("usstates/customerprofiles/deleteCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newUsStatesCustomerProfiles")
	public ModelAndView newUsStatesCustomerProfiles(@RequestParam Integer usstates_stateId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("usstates/customerprofiles/editCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editUsStatesVendorOrganizationses")
	public ModelAndView editUsStatesVendorOrganizationses(@RequestParam Integer usstates_stateId, @RequestParam Integer vendororganizationses_organizationId) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(vendororganizationses_organizationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("usstates_stateId", usstates_stateId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("usstates/vendororganizationses/editVendorOrganizationses.jsp");

		return mav;
	}
}