package main.app.service;

import java.util.List;
import java.util.Set;

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

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
@Transactional
public class CustomerProfileServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected CustomerProfileService service;

	/**
	 * Instantiates a new CustomerProfileServiceTest.
	 *
	 */
	public CustomerProfileServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveCustomerProfileCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileCartItemses 
		Integer customerId = 0;
		CartItems related_cartitemses = new main.app.domain.CartItems();
		CustomerProfile response = null;
		response = service.saveCustomerProfileCartItemses(customerId, related_cartitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileCartItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveCustomerProfileIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileIndDistrict 
		Integer customerId_1 = 0;
		IndDistrict related_inddistrict = new main.app.domain.IndDistrict();
		CustomerProfile response = null;
		response = service.saveCustomerProfileIndDistrict(customerId_1, related_inddistrict);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveCustomerProfileCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileCountries 
		Integer customerId_2 = 0;
		Countries related_countries = new main.app.domain.Countries();
		CustomerProfile response = null;
		response = service.saveCustomerProfileCountries(customerId_2, related_countries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileCountries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileIndDistrict 
		Integer customerprofile_customerId = 0;
		Integer related_inddistrict_districtId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileIndDistrict(customerprofile_customerId, related_inddistrict_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveCustomerProfileUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileUsStates 
		Integer customerId_3 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		CustomerProfile response = null;
		response = service.saveCustomerProfileUsStates(customerId_3, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileUsStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Test
	public void saveCustomerProfileProductsRatings() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileProductsRatings 
		Integer customerId_4 = 0;
		ProductsRating related_productsratings = new main.app.domain.ProductsRating();
		CustomerProfile response = null;
		response = service.saveCustomerProfileProductsRatings(customerId_4, related_productsratings);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileIndStates 
		Integer customerprofile_customerId_1 = 0;
		Integer related_indstates_stateId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileIndStates(customerprofile_customerId_1, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileIndStates
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCustomerProfileByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCustomerProfileByPrimaryKey 
		Integer customerId_5 = 0;
		CustomerProfile response = null;
		response = service.findCustomerProfileByPrimaryKey(customerId_5);
		// TODO: JUnit - Add assertions to test outputs of operation: findCustomerProfileByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveCustomerProfileIndCities() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileIndCities 
		Integer customerId_6 = 0;
		IndCities related_indcities = new main.app.domain.IndCities();
		CustomerProfile response = null;
		response = service.saveCustomerProfileIndCities(customerId_6, related_indcities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileIndCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfile 
		CustomerProfile customerprofile = new main.app.domain.CustomerProfile();
		service.saveCustomerProfile(customerprofile);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserRole entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileUserRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileUserRole 
		Integer customerprofile_customerId_2 = 0;
		Integer related_userrole_userRoleId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileUserRole(customerprofile_customerId_2, related_userrole_userRoleId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileUserRole
	}

	/**
	 * Operation Unit Test
	 * Return a count of all CustomerProfile entity
	 * 
	 */
	@Test
	public void countCustomerProfiles() {
		Integer response = null;
		response = service.countCustomerProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: countCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileProductsRatings() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileProductsRatings 
		Integer customerprofile_customerId_3 = 0;
		Integer related_productsratings_productRatingId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileProductsRatings(customerprofile_customerId_3, related_productsratings_productRatingId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserRole entity
	 * 
	 */
	@Test
	public void saveCustomerProfileUserRole() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileUserRole 
		Integer customerId_7 = 0;
		UserRole related_userrole = new main.app.domain.UserRole();
		CustomerProfile response = null;
		response = service.saveCustomerProfileUserRole(customerId_7, related_userrole);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileUserRole
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileUsStates 
		Integer customerprofile_customerId_4 = 0;
		Integer related_usstates_stateId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileUsStates(customerprofile_customerId_4, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileUsStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveCustomerProfileIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileIndStates 
		Integer customerId_8 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		CustomerProfile response = null;
		response = service.saveCustomerProfileIndStates(customerId_8, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileIndStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveCustomerProfileUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileUsCounties 
		Integer customerId_9 = 0;
		UsCounties related_uscounties = new main.app.domain.UsCounties();
		CustomerProfile response = null;
		response = service.saveCustomerProfileUsCounties(customerId_9, related_uscounties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileUsCounties
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfile 
		CustomerProfile customerprofile_1 = new main.app.domain.CustomerProfile();
		service.deleteCustomerProfile(customerprofile_1);
	}

	/**
	 * Operation Unit Test
	 * Return all CustomerProfile entity
	 * 
	 */
	@Test
	public void findAllCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: findAllCustomerProfiles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CustomerProfile> response = null;
		response = service.findAllCustomerProfiles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileUsCounties 
		Integer customerprofile_customerId_5 = 0;
		Integer related_uscounties_countyId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileUsCounties(customerprofile_customerId_5, related_uscounties_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileUsCounties
	}

	/**
	 * Operation Unit Test
	 * Load an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void loadCustomerProfiles() {
		Set<CustomerProfile> response = null;
		response = service.loadCustomerProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileCartItemses 
		Integer customerprofile_customerId_6 = 0;
		Integer related_cartitemses_cartItemId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileCartItemses(customerprofile_customerId_6, related_cartitemses_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileCartItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveCustomerProfileUsCities() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerProfileUsCities 
		Integer customerId_10 = 0;
		UsCities related_uscities = new main.app.domain.UsCities();
		CustomerProfile response = null;
		response = service.saveCustomerProfileUsCities(customerId_10, related_uscities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerProfileUsCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileIndCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileIndCities 
		Integer customerprofile_customerId_7 = 0;
		Integer related_indcities_cityId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileIndCities(customerprofile_customerId_7, related_indcities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileIndCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileUsCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileUsCities 
		Integer customerprofile_customerId_8 = 0;
		Integer related_uscities_cityId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileUsCities(customerprofile_customerId_8, related_uscities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileUsCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteCustomerProfileCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerProfileCountries 
		Integer customerprofile_customerId_9 = 0;
		Integer related_countries_countryId = 0;
		CustomerProfile response = null;
		response = service.deleteCustomerProfileCountries(customerprofile_customerId_9, related_countries_countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerProfileCountries
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
