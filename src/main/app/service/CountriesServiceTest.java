package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.UsStates;
import main.app.domain.VendorOrganizations;

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
public class CountriesServiceTest {

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
	protected CountriesService service;

	/**
	 * Instantiates a new CountriesServiceTest.
	 *
	 */
	public CountriesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCountriesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCountriesByPrimaryKey 
		Integer countryId = 0;
		Countries response = null;
		response = service.findCountriesByPrimaryKey(countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: findCountriesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteCountriesIndStateses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountriesIndStateses 
		Integer countries_countryId = 0;
		Integer related_indstateses_stateId = 0;
		Countries response = null;
		response = service.deleteCountriesIndStateses(countries_countryId, related_indstateses_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCountriesIndStateses
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveCountriesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveCountriesVendorOrganizationses 
		Integer countryId_1 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		Countries response = null;
		response = service.saveCountriesVendorOrganizationses(countryId_1, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCountriesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountries 
		Countries countries = new main.app.domain.Countries();
		service.deleteCountries(countries);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteCountriesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountriesVendorOrganizationses 
		Integer countries_countryId_1 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		Countries response = null;
		response = service.deleteCountriesVendorOrganizationses(countries_countryId_1, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCountriesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Return all Countries entity
	 * 
	 */
	@Test
	public void findAllCountriess() {
		// TODO: JUnit - Populate test inputs for operation: findAllCountriess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Countries> response = null;
		response = service.findAllCountriess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCountriess
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveCountriesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveCountriesRecipientLocations 
		Integer countryId_2 = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		Countries response = null;
		response = service.saveCountriesRecipientLocations(countryId_2, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCountriesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Load an existing Countries entity
	 * 
	 */
	@Test
	public void loadCountriess() {
		Set<Countries> response = null;
		response = service.loadCountriess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCountriess
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveCountriesUsStateses() {
		// TODO: JUnit - Populate test inputs for operation: saveCountriesUsStateses 
		Integer countryId_3 = 0;
		UsStates related_usstateses = new main.app.domain.UsStates();
		Countries response = null;
		response = service.saveCountriesUsStateses(countryId_3, related_usstateses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCountriesUsStateses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteCountriesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountriesRecipientLocations 
		Integer countries_countryId_2 = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		Countries response = null;
		response = service.deleteCountriesRecipientLocations(countries_countryId_2, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCountriesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Countries entity
	 * 
	 */
	@Test
	public void countCountriess() {
		Integer response = null;
		response = service.countCountriess();
		// TODO: JUnit - Add assertions to test outputs of operation: countCountriess
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveCountriesIndStateses() {
		// TODO: JUnit - Populate test inputs for operation: saveCountriesIndStateses 
		Integer countryId_4 = 0;
		IndStates related_indstateses = new main.app.domain.IndStates();
		Countries response = null;
		response = service.saveCountriesIndStateses(countryId_4, related_indstateses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCountriesIndStateses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteCountriesUsStateses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountriesUsStateses 
		Integer countries_countryId_3 = 0;
		Integer related_usstateses_stateId = 0;
		Countries response = null;
		response = service.deleteCountriesUsStateses(countries_countryId_3, related_usstateses_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCountriesUsStateses
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveCountriesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveCountriesCustomerProfiles 
		Integer countryId_5 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		Countries response = null;
		response = service.saveCountriesCustomerProfiles(countryId_5, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCountriesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteCountriesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteCountriesCustomerProfiles 
		Integer countries_countryId_4 = 0;
		Integer related_customerprofiles_customerId = 0;
		Countries response = null;
		response = service.deleteCountriesCustomerProfiles(countries_countryId_4, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCountriesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveCountries 
		Countries countries_1 = new main.app.domain.Countries();
		service.saveCountries(countries_1);
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
