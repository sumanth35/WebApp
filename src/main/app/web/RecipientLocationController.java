package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CountriesDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.ShipmentDetailsDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;

import main.app.service.RecipientLocationService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for RecipientLocation entities
 * 
 */

@Controller("RecipientLocationController")
public class RecipientLocationController {

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
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

	/**
	 * DAO injected by Spring that manages ShipmentDetails entities
	 * 
	 */
	@Autowired
	private ShipmentDetailsDAO shipmentDetailsDAO;

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
	 * Service injected by Spring that provides CRUD operations for RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationService recipientLocationService;

	/**
	 * Entry point to show all RecipientLocation entities
	 * 
	 */
	public String indexRecipientLocation() {
		return "redirect:/indexRecipientLocation";
	}

	/**
	 * View an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationShipmentDetailses")
	public ModelAndView selectRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer shipmentdetailses_shipmentId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetailses_shipmentId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("recipientlocation/shipmentdetailses/viewShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationCountries")
	public ModelAndView deleteRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationCountries(recipientlocation_recipientLocationId, related_countries_countryId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationIndDistrict")
	public ModelAndView saveRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute IndDistrict inddistrict) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationIndDistrict(recipientlocation_recipientLocationId, inddistrict);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationIndDistrict")
	public ModelAndView selectRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("recipientlocation/inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationUsCounties")
	public ModelAndView newRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationShipmentDetailses")
	public ModelAndView deleteRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_shipmentdetailses_shipmentId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationShipmentDetailses(recipientlocation_recipientLocationId, related_shipmentdetailses_shipmentId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationUsCounties")
	public ModelAndView saveRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute UsCounties uscounties) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationUsCounties(recipientlocation_recipientLocationId, uscounties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationIndStates")
	public ModelAndView confirmDeleteRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationCountries")
	public ModelAndView newRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationCountries")
	public ModelAndView saveRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute Countries countries) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationCountries(recipientlocation_recipientLocationId, countries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Select the RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocation")
	public ModelAndView confirmDeleteRecipientLocation(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/deleteRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocation")
	public String deleteRecipientLocation(@RequestParam Integer recipientLocationIdKey) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey);
		recipientLocationService.deleteRecipientLocation(recipientlocation);
		return "forward:/indexRecipientLocation";
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationIndStates")
	public ModelAndView editRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("recipientlocation/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationIndDistrict")
	public ModelAndView confirmDeleteRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/inddistrict/deleteIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationUsCounties")
	public ModelAndView listRecipientLocationUsCounties(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/uscounties/listUsCounties.jsp");

		return mav;
	}

	/**
	 * Create a new ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationShipmentDetailses")
	public ModelAndView newRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("shipmentdetails", new ShipmentDetails());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/shipmentdetailses/editShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationUsCities")
	public ModelAndView editRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("recipientlocation/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationUsStates")
	public ModelAndView deleteRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationUsStates(recipientlocation_recipientLocationId, related_usstates_stateId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationUsCities")
	public ModelAndView saveRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute UsCities uscities) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationUsCities(recipientlocation_recipientLocationId, uscities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationUsCities")
	public ModelAndView newRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * View an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationCountries")
	public ModelAndView selectRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("countries", countries);
		mav.setViewName("recipientlocation/countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationIndCities")
	public ModelAndView listRecipientLocationIndCities(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/indcities/listIndCities.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationUsCounties")
	public ModelAndView selectRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("recipientlocation/uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationUsCounties")
	public ModelAndView deleteRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationUsCounties(recipientlocation_recipientLocationId, related_uscounties_countyId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationIndCities")
	public ModelAndView saveRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute IndCities indcities) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationIndCities(recipientlocation_recipientLocationId, indcities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationIndCities")
	public ModelAndView selectRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("recipientlocation/indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationIndCities")
	public ModelAndView deleteRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationIndCities(recipientlocation_recipientLocationId, related_indcities_cityId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationUsCounties")
	public ModelAndView confirmDeleteRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationIndStates")
	public ModelAndView selectRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("recipientlocation/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationIndDistrict")
	public ModelAndView deleteRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationIndDistrict(recipientlocation_recipientLocationId, related_inddistrict_districtId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationIndStates")
	public ModelAndView deleteRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationIndStates(recipientlocation_recipientLocationId, related_indstates_stateId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationIndCities")
	public ModelAndView editRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("recipientlocation/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/recipientlocationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all UsStates entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationUsStates")
	public ModelAndView listRecipientLocationUsStates(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocation")
	public String saveRecipientLocation(@ModelAttribute RecipientLocation recipientlocation) {
		recipientLocationService.saveRecipientLocation(recipientlocation);
		return "forward:/indexRecipientLocation";
	}

	/**
	 * Edit an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationShipmentDetailses")
	public ModelAndView editRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer shipmentdetailses_shipmentId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetailses_shipmentId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("recipientlocation/shipmentdetailses/editShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationUsCities")
	public ModelAndView confirmDeleteRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/uscities/deleteUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child ShipmentDetails entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationShipmentDetailses")
	public ModelAndView confirmDeleteRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_shipmentdetailses_shipmentId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses_shipmentId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/shipmentdetailses/deleteShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Select an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocation")
	public ModelAndView selectRecipientLocation(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editRecipientLocation")
	public ModelAndView editRecipientLocation(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/editRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newRecipientLocation")
	public ModelAndView newRecipientLocation() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/editRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Show all RecipientLocation entities
	 * 
	 */
	@RequestMapping("/indexRecipientLocation")
	public ModelAndView listRecipientLocations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocations", recipientLocationService.loadRecipientLocations());

		mav.setViewName("recipientlocation/listRecipientLocations.jsp");

		return mav;
	}

	/**
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationIndCities")
	public ModelAndView confirmDeleteRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/indcities/deleteIndCities.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationUsStates")
	public ModelAndView saveRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute UsStates usstates) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationUsStates(recipientlocation_recipientLocationId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationIndStates")
	public ModelAndView listRecipientLocationIndStates(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationIndDistrict")
	public ModelAndView listRecipientLocationIndDistrict(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/inddistrict/listIndDistrict.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteRecipientLocationUsCities")
	public ModelAndView deleteRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		RecipientLocation recipientlocation = recipientLocationService.deleteRecipientLocationUsCities(recipientlocation_recipientLocationId, related_uscities_cityId);

		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationUsStates")
	public ModelAndView editRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("recipientlocation/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationIndStates")
	public ModelAndView newRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationUsStates")
	public ModelAndView newRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationIndDistrict")
	public ModelAndView newRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationUsCities")
	public ModelAndView listRecipientLocationUsCities(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/uscities/listUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationCountries")
	public ModelAndView confirmDeleteRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(related_countries_countryId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/countries/deleteCountries.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteRecipientLocationUsStates")
	public ModelAndView confirmDeleteRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.setViewName("recipientlocation/usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationShipmentDetailses")
	public ModelAndView saveRecipientLocationShipmentDetailses(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute ShipmentDetails shipmentdetailses) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationShipmentDetailses(recipientlocation_recipientLocationId, shipmentdetailses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationUsStates")
	public ModelAndView selectRecipientLocationUsStates(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("recipientlocation/usstates/viewUsStates.jsp");

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
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationUsCounties")
	public ModelAndView editRecipientLocationUsCounties(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("recipientlocation/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationCountries")
	public ModelAndView listRecipientLocationCountries(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/countries/listCountries.jsp");

		return mav;
	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectRecipientLocationUsCities")
	public ModelAndView selectRecipientLocationUsCities(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("recipientlocation/uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationIndDistrict")
	public ModelAndView editRecipientLocationIndDistrict(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("recipientlocation/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveRecipientLocationIndStates")
	public ModelAndView saveRecipientLocationIndStates(@RequestParam Integer recipientlocation_recipientLocationId, @ModelAttribute IndStates indstates) {
		RecipientLocation parent_recipientlocation = recipientLocationService.saveRecipientLocationIndStates(recipientlocation_recipientLocationId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("recipientlocation", parent_recipientlocation);
		mav.setViewName("recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newRecipientLocationIndCities")
	public ModelAndView newRecipientLocationIndCities(@RequestParam Integer recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("recipientlocation/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editRecipientLocationCountries")
	public ModelAndView editRecipientLocationCountries(@RequestParam Integer recipientlocation_recipientLocationId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("recipientlocation_recipientLocationId", recipientlocation_recipientLocationId);
		mav.addObject("countries", countries);
		mav.setViewName("recipientlocation/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Show all ShipmentDetails entities by RecipientLocation
	 * 
	 */
	@RequestMapping("/listRecipientLocationShipmentDetailses")
	public ModelAndView listRecipientLocationShipmentDetailses(@RequestParam Integer recipientLocationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientLocationIdKey));
		mav.setViewName("recipientlocation/shipmentdetailses/listShipmentDetailses.jsp");

		return mav;
	}
}