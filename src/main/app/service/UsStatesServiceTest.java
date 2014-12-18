package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.RecipientLocation;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;
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
public class UsStatesServiceTest {

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
	protected UsStatesService service;

	/**
	 * Instantiates a new UsStatesServiceTest.
	 *
	 */
	public UsStatesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteUsStatesCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesCountries 
		Integer usstates_stateId = 0;
		Integer related_countries_countryId = 0;
		UsStates response = null;
		response = service.deleteUsStatesCountries(usstates_stateId, related_countries_countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesCountries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteUsStatesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesCustomerProfiles 
		Integer usstates_stateId_1 = 0;
		Integer related_customerprofiles_customerId = 0;
		UsStates response = null;
		response = service.deleteUsStatesCustomerProfiles(usstates_stateId_1, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveUsStatesUsCitieses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesUsCitieses 
		Integer stateId = 0;
		UsCities related_uscitieses = new main.app.domain.UsCities();
		UsStates response = null;
		response = service.saveUsStatesUsCitieses(stateId, related_uscitieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesUsCitieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteUsStatesUsCitieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesUsCitieses 
		Integer usstates_stateId_2 = 0;
		Integer related_uscitieses_cityId = 0;
		UsStates response = null;
		response = service.deleteUsStatesUsCitieses(usstates_stateId_2, related_uscitieses_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesUsCitieses
	}

	/**
	 * Operation Unit Test
	 * Load an existing UsStates entity
	 * 
	 */
	@Test
	public void loadUsStatess() {
		Set<UsStates> response = null;
		response = service.loadUsStatess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsStatess
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsStatesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsStatesByPrimaryKey 
		Integer stateId_1 = 0;
		UsStates response = null;
		response = service.findUsStatesByPrimaryKey(stateId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsStatesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveUsStatesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesVendorLocationses 
		Integer stateId_2 = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		UsStates response = null;
		response = service.saveUsStatesVendorLocationses(stateId_2, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveUsStatesCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesCountries 
		Integer stateId_3 = 0;
		Countries related_countries = new main.app.domain.Countries();
		UsStates response = null;
		response = service.saveUsStatesCountries(stateId_3, related_countries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesCountries
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveUsStatesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesCustomerProfiles 
		Integer stateId_4 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		UsStates response = null;
		response = service.saveUsStatesCustomerProfiles(stateId_4, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteUsStatesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesVendorOrganizationses 
		Integer usstates_stateId_3 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		UsStates response = null;
		response = service.deleteUsStatesVendorOrganizationses(usstates_stateId_3, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Return all UsStates entity
	 * 
	 */
	@Test
	public void findAllUsStatess() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsStatess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<UsStates> response = null;
		response = service.findAllUsStatess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsStatess
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveUsStatesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesVendorOrganizationses 
		Integer stateId_5 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		UsStates response = null;
		response = service.saveUsStatesVendorOrganizationses(stateId_5, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteUsStatesUsCountieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesUsCountieses 
		Integer usstates_stateId_4 = 0;
		Integer related_uscountieses_countyId = 0;
		UsStates response = null;
		response = service.deleteUsStatesUsCountieses(usstates_stateId_4, related_uscountieses_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesUsCountieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStates 
		UsStates usstates = new main.app.domain.UsStates();
		service.deleteUsStates(usstates);
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveUsStatesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesRecipientLocations 
		Integer stateId_6 = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		UsStates response = null;
		response = service.saveUsStatesRecipientLocations(stateId_6, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteUsStatesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesVendorLocationses 
		Integer usstates_stateId_5 = 0;
		Integer related_vendorlocationses_locationId = 0;
		UsStates response = null;
		response = service.deleteUsStatesVendorLocationses(usstates_stateId_5, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all UsStates entity
	 * 
	 */
	@Test
	public void countUsStatess() {
		Integer response = null;
		response = service.countUsStatess();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsStatess
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStates 
		UsStates usstates_1 = new main.app.domain.UsStates();
		service.saveUsStates(usstates_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteUsStatesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsStatesRecipientLocations 
		Integer usstates_stateId_6 = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		UsStates response = null;
		response = service.deleteUsStatesRecipientLocations(usstates_stateId_6, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsStatesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveUsStatesUsCountieses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsStatesUsCountieses 
		Integer stateId_7 = 0;
		UsCounties related_uscountieses = new main.app.domain.UsCounties();
		UsStates response = null;
		response = service.saveUsStatesUsCountieses(stateId_7, related_uscountieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsStatesUsCountieses
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
