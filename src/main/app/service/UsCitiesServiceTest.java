package main.app.service;

import java.util.List;
import java.util.Set;

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
public class UsCitiesServiceTest {

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
	protected UsCitiesService service;

	/**
	 * Instantiates a new UsCitiesServiceTest.
	 *
	 */
	public UsCitiesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveUsCitiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesVendorLocationses 
		Integer cityId = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		UsCities response = null;
		response = service.saveUsCitiesVendorLocationses(cityId, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveUsCitiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesRecipientLocations 
		Integer cityId_1 = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		UsCities response = null;
		response = service.saveUsCitiesRecipientLocations(cityId_1, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteUsCitiesUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesUsStates 
		Integer uscities_cityId = 0;
		Integer related_usstates_stateId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesUsStates(uscities_cityId, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesUsStates
	}

	/**
	 * Operation Unit Test
	 * Return a count of all UsCities entity
	 * 
	 */
	@Test
	public void countUsCitiess() {
		Integer response = null;
		response = service.countUsCitiess();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsCitiess
	}

	/**
	 * Operation Unit Test
	 * Load an existing UsCities entity
	 * 
	 */
	@Test
	public void loadUsCitiess() {
		Set<UsCities> response = null;
		response = service.loadUsCitiess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsCitiess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteUsCitiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesVendorLocationses 
		Integer uscities_cityId_1 = 0;
		Integer related_vendorlocationses_locationId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesVendorLocationses(uscities_cityId_1, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteUsCitiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesVendorOrganizationses 
		Integer uscities_cityId_2 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesVendorOrganizationses(uscities_cityId_2, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveUsCities() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCities 
		UsCities uscities = new main.app.domain.UsCities();
		service.saveUsCities(uscities);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteUsCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCities 
		UsCities uscities_1 = new main.app.domain.UsCities();
		service.deleteUsCities(uscities_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteUsCitiesUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesUsCounties 
		Integer uscities_cityId_3 = 0;
		Integer related_uscounties_countyId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesUsCounties(uscities_cityId_3, related_uscounties_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesUsCounties
	}

	/**
	 * Operation Unit Test
	 * Return all UsCities entity
	 * 
	 */
	@Test
	public void findAllUsCitiess() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsCitiess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<UsCities> response = null;
		response = service.findAllUsCitiess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsCitiess
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveUsCitiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesVendorOrganizationses 
		Integer cityId_2 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		UsCities response = null;
		response = service.saveUsCitiesVendorOrganizationses(cityId_2, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteUsCitiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesRecipientLocations 
		Integer uscities_cityId_4 = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesRecipientLocations(uscities_cityId_4, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveUsCitiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesCustomerProfiles 
		Integer cityId_3 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		UsCities response = null;
		response = service.saveUsCitiesCustomerProfiles(cityId_3, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsCitiesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsCitiesByPrimaryKey 
		Integer cityId_4 = 0;
		UsCities response = null;
		response = service.findUsCitiesByPrimaryKey(cityId_4);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsCitiesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteUsCitiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCitiesCustomerProfiles 
		Integer uscities_cityId_5 = 0;
		Integer related_customerprofiles_customerId = 0;
		UsCities response = null;
		response = service.deleteUsCitiesCustomerProfiles(uscities_cityId_5, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCitiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveUsCitiesUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesUsCounties 
		Integer cityId_5 = 0;
		UsCounties related_uscounties = new main.app.domain.UsCounties();
		UsCities response = null;
		response = service.saveUsCitiesUsCounties(cityId_5, related_uscounties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesUsCounties
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveUsCitiesUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCitiesUsStates 
		Integer cityId_6 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		UsCities response = null;
		response = service.saveUsCitiesUsStates(cityId_6, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCitiesUsStates
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
