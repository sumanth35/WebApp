package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.CountriesDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.IndCitiesDAO;
import main.app.dao.IndDistrictDAO;
import main.app.dao.IndStatesDAO;
import main.app.dao.ProductsRatingDAO;
import main.app.dao.UsCitiesDAO;
import main.app.dao.UsCountiesDAO;
import main.app.dao.UsStatesDAO;
import main.app.dao.UserRoleDAO;

import main.app.domain.CartItems;
import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.ProductsRating;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.UserRole;

import main.app.service.CustomerProfileService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for CustomerProfile entities
 * 
 */

@Controller("CustomerProfileController")
public class CustomerProfileController {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * DAO injected by Spring that manages ProductsRating entities
	 * 
	 */
	@Autowired
	private ProductsRatingDAO productsRatingDAO;

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
	 * DAO injected by Spring that manages UserRole entities
	 * 
	 */
	@Autowired
	private UserRoleDAO userRoleDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileService customerProfileService;

	/**
	 * Show all UsStates entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileUsStates")
	public ModelAndView listCustomerProfileUsStates(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/usstates/listUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileCartItemses")
	public ModelAndView newCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing Countries entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileCountries")
	public ModelAndView saveCustomerProfileCountries(@RequestParam Integer customerprofile_customerId, @ModelAttribute Countries countries) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileCountries(customerprofile_customerId, countries);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsStates entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileUsStates")
	public ModelAndView editCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("usstates", usstates);
		mav.setViewName("customerprofile/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileUsCounties")
	public ModelAndView deleteCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileUsCounties(customerprofile_customerId, related_uscounties_countyId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfile")
	public ModelAndView confirmDeleteCustomerProfile(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/deleteCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfile")
	public String saveCustomerProfile(@ModelAttribute CustomerProfile customerprofile) {
		customerProfileService.saveCustomerProfile(customerprofile);
		return "forward:/indexCustomerProfile";
	}

	/**
	 * Edit an existing IndCities entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileIndCities")
	public ModelAndView editCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indcities", indcities);
		mav.setViewName("customerprofile/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Show all ProductsRating entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileProductsRatings")
	public ModelAndView listCustomerProfileProductsRatings(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/productsratings/listProductsRatings.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileCartItemses")
	public ModelAndView listCustomerProfileCartItemses(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/cartitemses/listCartItemses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/customerprofileController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing UserRole entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileUserRole")
	public ModelAndView selectCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId, @RequestParam Integer userrole_userRoleId) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("userrole", userrole);
		mav.setViewName("customerprofile/userrole/viewUserRole.jsp");

		return mav;
	}

	/**
	 * View an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileIndDistrict")
	public ModelAndView selectCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("customerprofile/inddistrict/viewIndDistrict.jsp");

		return mav;
	}

	/**
	 * View an existing Countries entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileCountries")
	public ModelAndView selectCustomerProfileCountries(@RequestParam Integer customerprofile_customerId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("countries", countries);
		mav.setViewName("customerprofile/countries/viewCountries.jsp");

		return mav;
	}

	/**
	 * Entry point to show all CustomerProfile entities
	 * 
	 */
	public String indexCustomerProfile() {
		return "redirect:/indexCustomerProfile";
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newCustomerProfile")
	public ModelAndView newCustomerProfile() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/editCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileProductsRatings")
	public ModelAndView deleteCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_productsratings_productRatingId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileProductsRatings(customerprofile_customerId, related_productsratings_productRatingId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Show all IndCities entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileIndCities")
	public ModelAndView listCustomerProfileIndCities(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/indcities/listIndCities.jsp");

		return mav;
	}

	/**
	 * Show all Countries entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileCountries")
	public ModelAndView listCustomerProfileCountries(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/countries/listCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing IndStates entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileIndStates")
	public ModelAndView saveCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId, @ModelAttribute IndStates indstates) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileIndStates(customerprofile_customerId, indstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Create a new UsCounties entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileUsCounties")
	public ModelAndView newCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscounties", new UsCounties());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Create a new Countries entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileCountries")
	public ModelAndView newCustomerProfileCountries(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("countries", new Countries());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Select the child UsCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileUsCities")
	public ModelAndView confirmDeleteCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscities", usCitiesDAO.findUsCitiesByPrimaryKey(related_uscities_cityId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/uscities/deleteUsCities.jsp");

		return mav;
	}

	/**
	 * View an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileUsCounties")
	public ModelAndView selectCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("customerprofile/uscounties/viewUsCounties.jsp");

		return mav;
	}

	/**
	 * Save an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileIndDistrict")
	public ModelAndView saveCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId, @ModelAttribute IndDistrict inddistrict) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileIndDistrict(customerprofile_customerId, inddistrict);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsRating entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileProductsRatings")
	public ModelAndView newCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("productsrating", new ProductsRating());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/productsratings/editProductsRatings.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileIndDistrict")
	public ModelAndView deleteCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileIndDistrict(customerprofile_customerId, related_inddistrict_districtId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the child UserRole entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileUserRole")
	public ModelAndView confirmDeleteCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("userrole", userRoleDAO.findUserRoleByPrimaryKey(related_userrole_userRoleId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/userrole/deleteUserRole.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCities entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileUsCities")
	public ModelAndView saveCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId, @ModelAttribute UsCities uscities) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileUsCities(customerprofile_customerId, uscities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing UsStates entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileUsStates")
	public ModelAndView saveCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId, @ModelAttribute UsStates usstates) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileUsStates(customerprofile_customerId, usstates);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileCartItemses")
	public ModelAndView selectCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("customerprofile/cartitemses/viewCartItemses.jsp");

		return mav;
	}

	/**
	 * Show all IndStates entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileIndStates")
	public ModelAndView listCustomerProfileIndStates(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/indstates/listIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfile")
	public String deleteCustomerProfile(@RequestParam Integer customerIdKey) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey);
		customerProfileService.deleteCustomerProfile(customerprofile);
		return "forward:/indexCustomerProfile";
	}

	/**
	 * Select the child IndCities entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileIndCities")
	public ModelAndView confirmDeleteCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indcities", indCitiesDAO.findIndCitiesByPrimaryKey(related_indcities_cityId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/indcities/deleteIndCities.jsp");

		return mav;
	}

	/**
	 * Select the child UsStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileUsStates")
	public ModelAndView confirmDeleteCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("usstates", usStatesDAO.findUsStatesByPrimaryKey(related_usstates_stateId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/usstates/deleteUsStates.jsp");

		return mav;
	}

	/**
	 * Create a new UsStates entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileUsStates")
	public ModelAndView newCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("usstates", new UsStates());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/usstates/editUsStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileCartItemses")
	public ModelAndView deleteCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileCartItemses(customerprofile_customerId, related_cartitemses_cartItemId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileProductsRatings")
	public ModelAndView selectCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId, @RequestParam Integer productsratings_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsratings_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("customerprofile/productsratings/viewProductsRatings.jsp");

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
	@RequestMapping("/editCustomerProfileUsCounties")
	public ModelAndView editCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId, @RequestParam Integer uscounties_countyId) {
		UsCounties uscounties = usCountiesDAO.findUsCountiesByPrimaryKey(uscounties_countyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscounties", uscounties);
		mav.setViewName("customerprofile/uscounties/editUsCounties.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsStates entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileUsStates")
	public ModelAndView deleteCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_usstates_stateId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileUsStates(customerprofile_customerId, related_usstates_stateId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing Countries entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileCountries")
	public ModelAndView editCustomerProfileCountries(@RequestParam Integer customerprofile_customerId, @RequestParam Integer countries_countryId) {
		Countries countries = countriesDAO.findCountriesByPrimaryKey(countries_countryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("countries", countries);
		mav.setViewName("customerprofile/countries/editCountries.jsp");

		return mav;
	}

	/**
	 * Save an existing UserRole entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileUserRole")
	public ModelAndView saveCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId, @ModelAttribute UserRole userrole) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileUserRole(customerprofile_customerId, userrole);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing IndCities entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileIndCities")
	public ModelAndView saveCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId, @ModelAttribute IndCities indcities) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileIndCities(customerprofile_customerId, indcities);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileCartItemses")
	public ModelAndView saveCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId, @ModelAttribute CartItems cartitemses) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileCartItemses(customerprofile_customerId, cartitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing UsCities entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileUsCities")
	public ModelAndView deleteCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_uscities_cityId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileUsCities(customerprofile_customerId, related_uscities_cityId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing UsCities entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileUsCities")
	public ModelAndView selectCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscities", uscities);
		mav.setViewName("customerprofile/uscities/viewUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editCustomerProfile")
	public ModelAndView editCustomerProfile(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/editCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the child IndDistrict entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileIndDistrict")
	public ModelAndView confirmDeleteCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_inddistrict_districtId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("inddistrict", indDistrictDAO.findIndDistrictByPrimaryKey(related_inddistrict_districtId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/inddistrict/deleteIndDistrict.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndStates entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileIndStates")
	public ModelAndView deleteCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileIndStates(customerprofile_customerId, related_indstates_stateId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing IndCities entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileIndCities")
	public ModelAndView selectCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer indcities_cityId) {
		IndCities indcities = indCitiesDAO.findIndCitiesByPrimaryKey(indcities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indcities", indcities);
		mav.setViewName("customerprofile/indcities/viewIndCities.jsp");

		return mav;
	}

	/**
	 * Create a new UserRole entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileUserRole")
	public ModelAndView newCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("userrole", new UserRole());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileProductsRatings")
	public ModelAndView saveCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId, @ModelAttribute ProductsRating productsratings) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileProductsRatings(customerprofile_customerId, productsratings);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing UsCounties entity
	 * 
	 */
	@RequestMapping("/saveCustomerProfileUsCounties")
	public ModelAndView saveCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId, @ModelAttribute UsCounties uscounties) {
		CustomerProfile parent_customerprofile = customerProfileService.saveCustomerProfileUsCounties(customerprofile_customerId, uscounties);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", parent_customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Create a new IndCities entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileIndCities")
	public ModelAndView newCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indcities", new IndCities());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/indcities/editIndCities.jsp");

		return mav;
	}

	/**
	 * Create a new IndDistrict entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileIndDistrict")
	public ModelAndView newCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("inddistrict", new IndDistrict());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/inddistrict/editIndDistrict.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities
	 * 
	 */
	@RequestMapping("/indexCustomerProfile")
	public ModelAndView listCustomerProfiles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofiles", customerProfileService.loadCustomerProfiles());

		mav.setViewName("customerprofile/listCustomerProfiles.jsp");

		return mav;
	}

	/**
	 * Create a new UsCities entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileUsCities")
	public ModelAndView newCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscities", new UsCities());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Show all IndDistrict entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileIndDistrict")
	public ModelAndView listCustomerProfileIndDistrict(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/inddistrict/listIndDistrict.jsp");

		return mav;
	}

	/**
	 * Delete an existing Countries entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileCountries")
	public ModelAndView deleteCustomerProfileCountries(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileCountries(customerprofile_customerId, related_countries_countryId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileCartItemses")
	public ModelAndView confirmDeleteCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/cartitemses/deleteCartItemses.jsp");

		return mav;
	}

	/**
	 * Show all UsCities entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileUsCities")
	public ModelAndView listCustomerProfileUsCities(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/uscities/listUsCities.jsp");

		return mav;
	}

	/**
	 * Show all UserRole entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileUserRole")
	public ModelAndView listCustomerProfileUserRole(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/userrole/listUserRole.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsRating entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileProductsRatings")
	public ModelAndView confirmDeleteCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_productsratings_productRatingId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings_productRatingId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/productsratings/deleteProductsRatings.jsp");

		return mav;
	}

	/**
	 * Select the child IndStates entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileIndStates")
	public ModelAndView confirmDeleteCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_indstates_stateId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("indstates", indStatesDAO.findIndStatesByPrimaryKey(related_indstates_stateId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/indstates/deleteIndStates.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileCartItemses")
	public ModelAndView editCustomerProfileCartItemses(@RequestParam Integer customerprofile_customerId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("customerprofile/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Show all UsCounties entities by CustomerProfile
	 * 
	 */
	@RequestMapping("/listCustomerProfileUsCounties")
	public ModelAndView listCustomerProfileUsCounties(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/uscounties/listUsCounties.jsp");

		return mav;
	}

	/**
	 * Edit an existing UserRole entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileUserRole")
	public ModelAndView editCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId, @RequestParam Integer userrole_userRoleId) {
		UserRole userrole = userRoleDAO.findUserRoleByPrimaryKey(userrole_userRoleId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("userrole", userrole);
		mav.setViewName("customerprofile/userrole/editUserRole.jsp");

		return mav;
	}

	/**
	 * Create a new IndStates entity
	 * 
	 */
	@RequestMapping("/newCustomerProfileIndStates")
	public ModelAndView newCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indstates", new IndStates());
		mav.addObject("newFlag", true);
		mav.setViewName("customerprofile/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * Select an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfile")
	public ModelAndView selectCustomerProfile(@RequestParam Integer customerIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(customerIdKey));
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the child Countries entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileCountries")
	public ModelAndView confirmDeleteCustomerProfileCountries(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_countries_countryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("countries", countriesDAO.findCountriesByPrimaryKey(related_countries_countryId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/countries/deleteCountries.jsp");

		return mav;
	}

	/**
	 * Edit an existing UsCities entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileUsCities")
	public ModelAndView editCustomerProfileUsCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer uscities_cityId) {
		UsCities uscities = usCitiesDAO.findUsCitiesByPrimaryKey(uscities_cityId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("uscities", uscities);
		mav.setViewName("customerprofile/uscities/editUsCities.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndStates entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileIndStates")
	public ModelAndView editCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indstates", indstates);
		mav.setViewName("customerprofile/indstates/editIndStates.jsp");

		return mav;
	}

	/**
	 * View an existing IndStates entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileIndStates")
	public ModelAndView selectCustomerProfileIndStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer indstates_stateId) {
		IndStates indstates = indStatesDAO.findIndStatesByPrimaryKey(indstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("indstates", indstates);
		mav.setViewName("customerprofile/indstates/viewIndStates.jsp");

		return mav;
	}

	/**
	 * Delete an existing UserRole entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileUserRole")
	public ModelAndView deleteCustomerProfileUserRole(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_userrole_userRoleId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileUserRole(customerprofile_customerId, related_userrole_userRoleId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing UsStates entity
	 * 
	 */
	@RequestMapping("/selectCustomerProfileUsStates")
	public ModelAndView selectCustomerProfileUsStates(@RequestParam Integer customerprofile_customerId, @RequestParam Integer usstates_stateId) {
		UsStates usstates = usStatesDAO.findUsStatesByPrimaryKey(usstates_stateId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("usstates", usstates);
		mav.setViewName("customerprofile/usstates/viewUsStates.jsp");

		return mav;
	}

	/**
	 * Select the child UsCounties entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomerProfileUsCounties")
	public ModelAndView confirmDeleteCustomerProfileUsCounties(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_uscounties_countyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uscounties", usCountiesDAO.findUsCountiesByPrimaryKey(related_uscounties_countyId));
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.setViewName("customerprofile/uscounties/deleteUsCounties.jsp");

		return mav;
	}

	/**
	 * Delete an existing IndCities entity
	 * 
	 */
	@RequestMapping("/deleteCustomerProfileIndCities")
	public ModelAndView deleteCustomerProfileIndCities(@RequestParam Integer customerprofile_customerId, @RequestParam Integer related_indcities_cityId) {
		ModelAndView mav = new ModelAndView();

		CustomerProfile customerprofile = customerProfileService.deleteCustomerProfileIndCities(customerprofile_customerId, related_indcities_cityId);

		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileProductsRatings")
	public ModelAndView editCustomerProfileProductsRatings(@RequestParam Integer customerprofile_customerId, @RequestParam Integer productsratings_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsratings_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("customerprofile/productsratings/editProductsRatings.jsp");

		return mav;
	}

	/**
	 * Edit an existing IndDistrict entity
	 * 
	 */
	@RequestMapping("/editCustomerProfileIndDistrict")
	public ModelAndView editCustomerProfileIndDistrict(@RequestParam Integer customerprofile_customerId, @RequestParam Integer inddistrict_districtId) {
		IndDistrict inddistrict = indDistrictDAO.findIndDistrictByPrimaryKey(inddistrict_districtId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("customerprofile_customerId", customerprofile_customerId);
		mav.addObject("inddistrict", inddistrict);
		mav.setViewName("customerprofile/inddistrict/editIndDistrict.jsp");

		return mav;
	}
}