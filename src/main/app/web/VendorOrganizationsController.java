package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CountriesDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorOrganizationsDAO;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

import main.app.service.VendorOrganizationsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for VendorOrganizations entities
 * 
 */

@Controller("VendorOrganizationsController")
public class VendorOrganizationsController {

	/**
	 * DAO injected by Spring that manages Countries entities
	 * 
	 */
	@Autowired
	private CountriesDAO countriesDAO;

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
	 * DAO injected by Spring that manages VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsDAO vendorOrganizationsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for VendorOrganizations entities
	 * 
	 */
	@Autowired
	private VendorOrganizationsService vendorOrganizationsService;

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsIndCities")
	public ModelAndView newVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsIndStates")
	public ModelAndView newVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsCountries")
	public ModelAndView saveVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute Countries countries) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsCountries(vendororganizations_organizationId, countries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsIndDistrict")
	public ModelAndView saveVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute IndDistrict inddistrict) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsIndDistrict(vendororganizations_organizationId, inddistrict);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsCountries")
	public ModelAndView listVendorOrganizationsCountries(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/countries/listCountries.jsp");

		return mav;
	}

	/**
	 * Select the VendorOrganizations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizations")
	public ModelAndView confirmDeleteVendorOrganizations(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/deleteVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizations")
	public String deleteVendorOrganizations(@RequestParam Integer organizationIdKey) {
		VendorOrganizations vendororganizations = vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey);
		vendorOrganizationsService.deleteVendorOrganizations(vendororganizations);
		return "forward:/indexVendorOrganizations";
	}

	/**
	 * Show all IndStates entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsIndStates")
	public ModelAndView listVendorOrganizationsIndStates(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsUsCounties")
	public ModelAndView selectVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("vendororganizations/uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsUsCounties")
	public ModelAndView listVendorOrganizationsUsCounties(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/uscounties/listUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all UsStates entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsUsStates")
	public ModelAndView listVendorOrganizationsUsStates(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsUsCities")
	public ModelAndView newVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsIndCities")
	public ModelAndView selectVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("vendororganizations/indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsIndDistrict")
	public ModelAndView newVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsUsCities")
	public ModelAndView selectVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("vendororganizations/uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsUsCities")
	public ModelAndView editVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("vendororganizations/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsIndCities")
	public ModelAndView saveVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute IndCities indcities) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsIndCities(vendororganizations_organizationId, indcities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Select an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizations")
	public ModelAndView selectVendorOrganizations(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsUsCities")
	public ModelAndView listVendorOrganizationsUsCities(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/uscities/listUsCities.jsp");

		return mav;
	}

	/**
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsIndStates")
	public ModelAndView selectVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("vendororganizations/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsCountries")
	public ModelAndView deleteVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsCountries(vendororganizations_organizationId, related_countries_countryId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsCountries")
	public ModelAndView newVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsUsCities")
	public ModelAndView saveVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute UsCities uscities) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsUsCities(vendororganizations_organizationId, uscities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsUsStates")
	public ModelAndView editVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("vendororganizations/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsUsCounties")
	public ModelAndView newVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * View an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsCountries")
	public ModelAndView selectVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("countries", countries);
		mav.setViewName("vendororganizations/countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsUsCounties")
	public ModelAndView confirmDeleteVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsIndStates")
	public ModelAndView confirmDeleteVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Show all VendorOrganizations entities
	 * 
	 */
	@RequestMapping("/indexVendorOrganizations")
	public ModelAndView listVendorOrganizationss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizationss", vendorOrganizationsService.loadVendorOrganizationss());

		mav.setViewName("vendororganizations/listVendorOrganizationss.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizations")
	public ModelAndView editVendorOrganizations(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/editVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsUsCounties")
	public ModelAndView saveVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute UsCounties uscounties) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsUsCounties(vendororganizations_organizationId, uscounties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsIndDistrict")
	public ModelAndView listVendorOrganizationsIndDistrict(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/inddistrict/listIndDistrict.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsIndStates")
	public ModelAndView editVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("vendororganizations/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsUsStates")
	public ModelAndView confirmDeleteVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsIndDistrict")
	public ModelAndView selectVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("vendororganizations/inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsIndCities")
	public ModelAndView confirmDeleteVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/indcities/deleteIndCities.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizations")
	public String saveVendorOrganizations(@ModelAttribute VendorOrganizations vendororganizations) {
		vendorOrganizationsService.saveVendorOrganizations(vendororganizations);
		return "forward:/indexVendorOrganizations";
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsCountries")
	public ModelAndView editVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("countries", countries);
		mav.setViewName("vendororganizations/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsIndCities")
	public ModelAndView deleteVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsIndCities(vendororganizations_organizationId, related_indcities_cityId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsIndStates")
	public ModelAndView saveVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute IndStates indstates) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsIndStates(vendororganizations_organizationId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsUsCounties")
	public ModelAndView editVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("vendororganizations/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsUsCities")
	public ModelAndView deleteVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsUsCities(vendororganizations_organizationId, related_uscities_cityId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsIndDistrict")
	public ModelAndView deleteVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsIndDistrict(vendororganizations_organizationId, related_inddistrict_districtId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsIndStates")
	public ModelAndView deleteVendorOrganizationsIndStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsIndStates(vendororganizations_organizationId, related_indstates_stateId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsUsCities")
	public ModelAndView confirmDeleteVendorOrganizationsUsCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/uscities/deleteUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsIndDistrict")
	public ModelAndView confirmDeleteVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/inddistrict/deleteIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by VendorOrganizations
	 * 
	 */
	@RequestMapping("/listVendorOrganizationsIndCities")
	public ModelAndView listVendorOrganizationsIndCities(@RequestParam Integer organizationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", vendorOrganizationsDAO.findVendorOrganizationsByPrimaryKey(organizationIdKey));
		mav.setViewName("vendororganizations/indcities/listIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsUsCounties")
	public ModelAndView deleteVendorOrganizationsUsCounties(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsUsCounties(vendororganizations_organizationId, related_uscounties_countyId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all VendorOrganizations entities
	 * 
	 */
	public String indexVendorOrganizations() {
		return "redirect:/indexVendorOrganizations";
	}

	/**
	 */
	@RequestMapping("/vendororganizationsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveVendorOrganizationsUsStates")
	public ModelAndView saveVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId, @ModelAttribute UsStates usstates) {
		VendorOrganizations parent_vendororganizations = vendorOrganizationsService.saveVendorOrganizationsUsStates(vendororganizations_organizationId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", parent_vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteVendorOrganizationsUsStates")
	public ModelAndView deleteVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		VendorOrganizations vendororganizations = vendorOrganizationsService.deleteVendorOrganizationsUsStates(vendororganizations_organizationId, related_usstates_stateId);

		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("vendororganizations", vendororganizations);
		mav.setViewName("vendororganizations/viewVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizationsUsStates")
	public ModelAndView newVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsIndCities")
	public ModelAndView editVendorOrganizationsIndCities(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("vendororganizations/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Select the child Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorOrganizationsCountries")
	public ModelAndView confirmDeleteVendorOrganizationsCountries(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(related_countries_countryId));
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.setViewName("vendororganizations/countries/deleteCountries.jsp");

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
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectVendorOrganizationsUsStates")
	public ModelAndView selectVendorOrganizationsUsStates(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("vendororganizations/usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorOrganizations entity
	 * 
	 */
	@RequestMapping("/newVendorOrganizations")
	public ModelAndView newVendorOrganizations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendororganizations", new VendorOrganizations());
		mav.addObject("newFlag", true);
		mav.setViewName("vendororganizations/editVendorOrganizations.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editVendorOrganizationsIndDistrict")
	public ModelAndView editVendorOrganizationsIndDistrict(@RequestParam Integer vendororganizations_organizationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendororganizations_organizationId", vendororganizations_organizationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("vendororganizations/inddistrict/editIndDistrict.jsp");

		return mav;
	}
}