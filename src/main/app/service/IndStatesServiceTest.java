package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.CustomerProfile;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
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
public class IndStatesServiceTest {

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
	protected IndStatesService service;

	/**
	 * Instantiates a new IndStatesServiceTest.
	 *
	 */
	public IndStatesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveIndStatesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesRecipientLocations 
		Integer stateId = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		IndStates response = null;
		response = service.saveIndStatesRecipientLocations(stateId, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveIndStatesCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesCountries 
		Integer stateId_1 = 0;
		Countries related_countries = new main.app.domain.Countries();
		IndStates response = null;
		response = service.saveIndStatesCountries(stateId_1, related_countries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesCountries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteIndStatesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesRecipientLocations 
		Integer indstates_stateId = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		IndStates response = null;
		response = service.deleteIndStatesRecipientLocations(indstates_stateId, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveIndStatesIndDistricts() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesIndDistricts 
		Integer stateId_2 = 0;
		IndDistrict related_inddistricts = new main.app.domain.IndDistrict();
		IndStates response = null;
		response = service.saveIndStatesIndDistricts(stateId_2, related_inddistricts);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesIndDistricts
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteIndStatesCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesCountries 
		Integer indstates_stateId_1 = 0;
		Integer related_countries_countryId = 0;
		IndStates response = null;
		response = service.deleteIndStatesCountries(indstates_stateId_1, related_countries_countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesCountries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStates 
		IndStates indstates = new main.app.domain.IndStates();
		service.deleteIndStates(indstates);
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveIndStatesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesCustomerProfiles 
		Integer stateId_3 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		IndStates response = null;
		response = service.saveIndStatesCustomerProfiles(stateId_3, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteIndStatesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesVendorOrganizationses 
		Integer indstates_stateId_2 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		IndStates response = null;
		response = service.deleteIndStatesVendorOrganizationses(indstates_stateId_2, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteIndStatesIndCitieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesIndCitieses 
		Integer indstates_stateId_3 = 0;
		Integer related_indcitieses_cityId = 0;
		IndStates response = null;
		response = service.deleteIndStatesIndCitieses(indstates_stateId_3, related_indcitieses_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesIndCitieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteIndStatesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesCustomerProfiles 
		Integer indstates_stateId_4 = 0;
		Integer related_customerprofiles_customerId = 0;
		IndStates response = null;
		response = service.deleteIndStatesCustomerProfiles(indstates_stateId_4, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Return a count of all IndStates entity
	 * 
	 */
	@Test
	public void countIndStatess() {
		Integer response = null;
		response = service.countIndStatess();
		// TODO: JUnit - Add assertions to test outputs of operation: countIndStatess
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStates 
		IndStates indstates_1 = new main.app.domain.IndStates();
		service.saveIndStates(indstates_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveIndStatesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesVendorLocationses 
		Integer stateId_4 = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		IndStates response = null;
		response = service.saveIndStatesVendorLocationses(stateId_4, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findIndStatesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findIndStatesByPrimaryKey 
		Integer stateId_5 = 0;
		IndStates response = null;
		response = service.findIndStatesByPrimaryKey(stateId_5);
		// TODO: JUnit - Add assertions to test outputs of operation: findIndStatesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteIndStatesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesVendorLocationses 
		Integer indstates_stateId_5 = 0;
		Integer related_vendorlocationses_locationId = 0;
		IndStates response = null;
		response = service.deleteIndStatesVendorLocationses(indstates_stateId_5, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveIndStatesIndCitieses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesIndCitieses 
		Integer stateId_6 = 0;
		IndCities related_indcitieses = new main.app.domain.IndCities();
		IndStates response = null;
		response = service.saveIndStatesIndCitieses(stateId_6, related_indcitieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesIndCitieses
	}

	/**
	 * Operation Unit Test
	 * Return all IndStates entity
	 * 
	 */
	@Test
	public void findAllIndStatess() {
		// TODO: JUnit - Populate test inputs for operation: findAllIndStatess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<IndStates> response = null;
		response = service.findAllIndStatess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllIndStatess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteIndStatesIndDistricts() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndStatesIndDistricts 
		Integer indstates_stateId_6 = 0;
		Integer related_inddistricts_districtId = 0;
		IndStates response = null;
		response = service.deleteIndStatesIndDistricts(indstates_stateId_6, related_inddistricts_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndStatesIndDistricts
	}

	/**
	 * Operation Unit Test
	 * Load an existing IndStates entity
	 * 
	 */
	@Test
	public void loadIndStatess() {
		Set<IndStates> response = null;
		response = service.loadIndStatess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadIndStatess
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveIndStatesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndStatesVendorOrganizationses 
		Integer stateId_7 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		IndStates response = null;
		response = service.saveIndStatesVendorOrganizationses(stateId_7, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndStatesVendorOrganizationses
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
