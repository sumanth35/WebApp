package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.VendorLocationsDAO;

import main.app.domain.CartItems;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.Products;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;

import main.app.service.VendorLocationsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for VendorLocations entities
 * 
 */

@Controller("VendorLocationsController")
public class VendorLocationsController {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

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
	 * Service injected by Spring that provides CRUD operations for VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsService vendorLocationsService;

	/**
	 * Show all UsCounties entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsUsCounties")
	public ModelAndView listVendorLocationsUsCounties(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/uscounties/listUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsProductses")
	public ModelAndView listVendorLocationsProductses(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/productses/listProductses.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsProductses")
	public ModelAndView selectVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("products", products);
		mav.setViewName("vendorlocations/productses/viewProductses.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsIndStates")
	public ModelAndView saveVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId, @ModelAttribute IndStates indstates) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsIndStates(vendorlocations_locationId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/vendorlocationsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsUsCities")
	public ModelAndView selectVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("vendorlocations/uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsCartItemses")
	public ModelAndView confirmDeleteVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/cartitemses/deleteCartItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsUsCounties")
	public ModelAndView saveVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId, @ModelAttribute UsCounties uscounties) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsUsCounties(vendorlocations_locationId, uscounties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsIndStates")
	public ModelAndView confirmDeleteVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsCartItemses")
	public ModelAndView newVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsCartItemses")
	public ModelAndView saveVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId, @ModelAttribute CartItems cartitemses) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsCartItemses(vendorlocations_locationId, cartitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsIndDistrict")
	public ModelAndView deleteVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsIndDistrict(vendorlocations_locationId, related_inddistrict_districtId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsCartItemses")
	public ModelAndView editVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("vendorlocations/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsUsCities")
	public ModelAndView deleteVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsUsCities(vendorlocations_locationId, related_uscities_cityId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all VendorLocations entities
	 * 
	 */
	public String indexVendorLocations() {
		return "redirect:/indexVendorLocations";
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocations")
	public String deleteVendorLocations(@RequestParam Integer locationIdKey) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey);
		vendorLocationsService.deleteVendorLocations(vendorlocations);
		return "forward:/indexVendorLocations";
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsIndDistrict")
	public ModelAndView confirmDeleteVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/inddistrict/deleteIndDistrict.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsUsStates")
	public ModelAndView selectVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("vendorlocations/usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsUsStates")
	public ModelAndView confirmDeleteVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsUsStates")
	public ModelAndView saveVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId, @ModelAttribute UsStates usstates) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsUsStates(vendorlocations_locationId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsUsCities")
	public ModelAndView saveVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId, @ModelAttribute UsCities uscities) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsUsCities(vendorlocations_locationId, uscities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsUsStates")
	public ModelAndView editVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("usstates", usstates);
		mav.setViewName("vendorlocations/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsIndDistrict")
	public ModelAndView editVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("vendorlocations/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsIndCities")
	public ModelAndView editVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("vendorlocations/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsCartItemses")
	public ModelAndView deleteVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsCartItemses(vendorlocations_locationId, related_cartitemses_cartItemId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsProductses")
	public ModelAndView saveVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId, @ModelAttribute Products productses) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsProductses(vendorlocations_locationId, productses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsUsStates")
	public ModelAndView deleteVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsUsStates(vendorlocations_locationId, related_usstates_stateId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities
	 * 
	 */
	@RequestMapping("/indexVendorLocations")
	public ModelAndView listVendorLocationss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationss", vendorLocationsService.loadVendorLocationss());

		mav.setViewName("vendorlocations/listVendorLocationss.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsIndCities")
	public ModelAndView selectVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indcities", indcities);
		mav.setViewName("vendorlocations/indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsUsCounties")
	public ModelAndView confirmDeleteVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsIndStates")
	public ModelAndView selectVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("vendorlocations/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsIndCities")
	public ModelAndView confirmDeleteVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/indcities/deleteIndCities.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsCartItemses")
	public ModelAndView listVendorLocationsCartItemses(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/cartitemses/listCartItemses.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsIndDistrict")
	public ModelAndView newVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsIndCities")
	public ModelAndView saveVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId, @ModelAttribute IndCities indcities) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsIndCities(vendorlocations_locationId, indcities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsUsCounties")
	public ModelAndView newVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsIndCities")
	public ModelAndView listVendorLocationsIndCities(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/indcities/listIndCities.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsIndDistrict")
	public ModelAndView listVendorLocationsIndDistrict(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/inddistrict/listIndDistrict.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsUsCounties")
	public ModelAndView selectVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("vendorlocations/uscounties/viewUsCounties.jsp");

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
	 * Select an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectVendorLocations")
	public ModelAndView selectVendorLocations(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveVendorLocations")
	public String saveVendorLocations(@ModelAttribute VendorLocations vendorlocations) {
		vendorLocationsService.saveVendorLocations(vendorlocations);
		return "forward:/indexVendorLocations";
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsIndStates")
	public ModelAndView editVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indstates", indstates);
		mav.setViewName("vendorlocations/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Select the VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocations")
	public ModelAndView confirmDeleteVendorLocations(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/deleteVendorLocations.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsUsCities")
	public ModelAndView newVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editVendorLocations")
	public ModelAndView editVendorLocations(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsIndStates")
	public ModelAndView listVendorLocationsIndStates(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsUsCounties")
	public ModelAndView deleteVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsUsCounties(vendorlocations_locationId, related_uscounties_countyId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsIndStates")
	public ModelAndView deleteVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsIndStates(vendorlocations_locationId, related_indstates_stateId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsIndCities")
	public ModelAndView newVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsUsCounties")
	public ModelAndView editVendorLocationsUsCounties(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("vendorlocations/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsProductses")
	public ModelAndView editVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("products", products);
		mav.setViewName("vendorlocations/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editVendorLocationsUsCities")
	public ModelAndView editVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("uscities", uscities);
		mav.setViewName("vendorlocations/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsIndStates")
	public ModelAndView newVendorLocationsIndStates(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newVendorLocations")
	public ModelAndView newVendorLocations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsIndDistrict")
	public ModelAndView selectVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("vendorlocations/inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsProductses")
	public ModelAndView confirmDeleteVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_productses_productId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/productses/deleteProductses.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationsCartItemses")
	public ModelAndView selectVendorLocationsCartItemses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("vendorlocations/cartitemses/viewCartItemses.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsUsCities")
	public ModelAndView listVendorLocationsUsCities(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/uscities/listUsCities.jsp");

		return mav;
	}

	/**
	 * Show all UsStates entities by VendorLocations
	 * 
	 */
	@RequestMapping("/listVendorLocationsUsStates")
	public ModelAndView listVendorLocationsUsStates(@RequestParam Integer locationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(locationIdKey));
		mav.setViewName("vendorlocations/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsUsStates")
	public ModelAndView newVendorLocationsUsStates(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsIndCities")
	public ModelAndView deleteVendorLocationsIndCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsIndCities(vendorlocations_locationId, related_indcities_cityId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationsIndDistrict")
	public ModelAndView saveVendorLocationsIndDistrict(@RequestParam Integer vendorlocations_locationId, @ModelAttribute IndDistrict inddistrict) {
		VendorLocations parent_vendorlocations = vendorLocationsService.saveVendorLocationsIndDistrict(vendorlocations_locationId, inddistrict);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", parent_vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newVendorLocationsProductses")
	public ModelAndView newVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocations/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationsUsCities")
	public ModelAndView confirmDeleteVendorLocationsUsCities(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId));
		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.setViewName("vendorlocations/uscities/deleteUsCities.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationsProductses")
	public ModelAndView deleteVendorLocationsProductses(@RequestParam Integer vendorlocations_locationId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		VendorLocations vendorlocations = vendorLocationsService.deleteVendorLocationsProductses(vendorlocations_locationId, related_productses_productId);

		mav.addObject("vendorlocations_locationId", vendorlocations_locationId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("vendorlocations/viewVendorLocations.jsp");

		return mav;
	}
}