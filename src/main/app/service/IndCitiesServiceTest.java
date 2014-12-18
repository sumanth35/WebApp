package main.app.service;

import java.util.List;
import java.util.Set;

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
public class IndCitiesServiceTest {

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
	protected IndCitiesService service;

	/**
	 * Instantiates a new IndCitiesServiceTest.
	 *
	 */
	public IndCitiesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all IndCities entity
	 * 
	 */
	@Test
	public void findAllIndCitiess() {
		// TODO: JUnit - Populate test inputs for operation: findAllIndCitiess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<IndCities> response = null;
		response = service.findAllIndCitiess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllIndCitiess
	}

	/**
	 * Operation Unit Test
	 * Load an existing IndCities entity
	 * 
	 */
	@Test
	public void loadIndCitiess() {
		Set<IndCities> response = null;
		response = service.loadIndCitiess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadIndCitiess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteIndCitiesIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesIndDistrict 
		Integer indcities_cityId = 0;
		Integer related_inddistrict_districtId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesIndDistrict(indcities_cityId, related_inddistrict_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveIndCitiesIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesIndDistrict 
		Integer cityId = 0;
		IndDistrict related_inddistrict = new main.app.domain.IndDistrict();
		IndCities response = null;
		response = service.saveIndCitiesIndDistrict(cityId, related_inddistrict);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteIndCitiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesCustomerProfiles 
		Integer indcities_cityId_1 = 0;
		Integer related_customerprofiles_customerId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesCustomerProfiles(indcities_cityId_1, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveIndCitiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesCustomerProfiles 
		Integer cityId_1 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		IndCities response = null;
		response = service.saveIndCitiesCustomerProfiles(cityId_1, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Return a count of all IndCities entity
	 * 
	 */
	@Test
	public void countIndCitiess() {
		Integer response = null;
		response = service.countIndCitiess();
		// TODO: JUnit - Add assertions to test outputs of operation: countIndCitiess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteIndCitiesIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesIndStates 
		Integer indcities_cityId_2 = 0;
		Integer related_indstates_stateId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesIndStates(indcities_cityId_2, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesIndStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteIndCitiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesRecipientLocations 
		Integer indcities_cityId_3 = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesRecipientLocations(indcities_cityId_3, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findIndCitiesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findIndCitiesByPrimaryKey 
		Integer cityId_2 = 0;
		IndCities response = null;
		response = service.findIndCitiesByPrimaryKey(cityId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findIndCitiesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveIndCitiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesVendorLocationses 
		Integer cityId_3 = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		IndCities response = null;
		response = service.saveIndCitiesVendorLocationses(cityId_3, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveIndCitiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesVendorOrganizationses 
		Integer cityId_4 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		IndCities response = null;
		response = service.saveIndCitiesVendorOrganizationses(cityId_4, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveIndCitiesIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesIndStates 
		Integer cityId_5 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		IndCities response = null;
		response = service.saveIndCitiesIndStates(cityId_5, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesIndStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveIndCitiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCitiesRecipientLocations 
		Integer cityId_6 = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		IndCities response = null;
		response = service.saveIndCitiesRecipientLocations(cityId_6, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndCitiesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteIndCitiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesVendorLocationses 
		Integer indcities_cityId_4 = 0;
		Integer related_vendorlocationses_locationId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesVendorLocationses(indcities_cityId_4, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteIndCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCities 
		IndCities indcities = new main.app.domain.IndCities();
		service.deleteIndCities(indcities);
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveIndCities() {
		// TODO: JUnit - Populate test inputs for operation: saveIndCities 
		IndCities indcities_1 = new main.app.domain.IndCities();
		service.saveIndCities(indcities_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteIndCitiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndCitiesVendorOrganizationses 
		Integer indcities_cityId_5 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		IndCities response = null;
		response = service.deleteIndCitiesVendorOrganizationses(indcities_cityId_5, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndCitiesVendorOrganizationses
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
