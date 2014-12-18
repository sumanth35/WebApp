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
public class UsCountiesServiceTest {

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
	protected UsCountiesService service;

	/**
	 * Instantiates a new UsCountiesServiceTest.
	 *
	 */
	public UsCountiesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveUsCountiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesVendorLocationses 
		Integer countyId = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		UsCounties response = null;
		response = service.saveUsCountiesVendorLocationses(countyId, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUsCountiesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUsCountiesByPrimaryKey 
		Integer countyId_1 = 0;
		UsCounties response = null;
		response = service.findUsCountiesByPrimaryKey(countyId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findUsCountiesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveUsCountiesUsCitieses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesUsCitieses 
		Integer countyId_2 = 0;
		UsCities related_uscitieses = new main.app.domain.UsCities();
		UsCounties response = null;
		response = service.saveUsCountiesUsCitieses(countyId_2, related_uscitieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesUsCitieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteUsCountiesUsCitieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesUsCitieses 
		Integer uscounties_countyId = 0;
		Integer related_uscitieses_cityId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesUsCitieses(uscounties_countyId, related_uscitieses_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesUsCitieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteUsCountiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesVendorOrganizationses 
		Integer uscounties_countyId_1 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesVendorOrganizationses(uscounties_countyId_1, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteUsCountiesVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesVendorLocationses 
		Integer uscounties_countyId_2 = 0;
		Integer related_vendorlocationses_locationId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesVendorLocationses(uscounties_countyId_2, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Return all UsCounties entity
	 * 
	 */
	@Test
	public void findAllUsCountiess() {
		// TODO: JUnit - Populate test inputs for operation: findAllUsCountiess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<UsCounties> response = null;
		response = service.findAllUsCountiess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUsCountiess
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCounties 
		UsCounties uscounties = new main.app.domain.UsCounties();
		service.saveUsCounties(uscounties);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteUsCountiesUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesUsStates 
		Integer uscounties_countyId_3 = 0;
		Integer related_usstates_stateId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesUsStates(uscounties_countyId_3, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesUsStates
	}

	/**
	 * Operation Unit Test
	 * Return a count of all UsCounties entity
	 * 
	 */
	@Test
	public void countUsCountiess() {
		Integer response = null;
		response = service.countUsCountiess();
		// TODO: JUnit - Add assertions to test outputs of operation: countUsCountiess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteUsCountiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesRecipientLocations 
		Integer uscounties_countyId_4 = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesRecipientLocations(uscounties_countyId_4, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveUsCountiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesCustomerProfiles 
		Integer countyId_3 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		UsCounties response = null;
		response = service.saveUsCountiesCustomerProfiles(countyId_3, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteUsCountiesCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCountiesCustomerProfiles 
		Integer uscounties_countyId_5 = 0;
		Integer related_customerprofiles_customerId = 0;
		UsCounties response = null;
		response = service.deleteUsCountiesCustomerProfiles(uscounties_countyId_5, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUsCountiesCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveUsCountiesVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesVendorOrganizationses 
		Integer countyId_4 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		UsCounties response = null;
		response = service.saveUsCountiesVendorOrganizationses(countyId_4, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Load an existing UsCounties entity
	 * 
	 */
	@Test
	public void loadUsCountiess() {
		Set<UsCounties> response = null;
		response = service.loadUsCountiess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUsCountiess
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveUsCountiesUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesUsStates 
		Integer countyId_5 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		UsCounties response = null;
		response = service.saveUsCountiesUsStates(countyId_5, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesUsStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteUsCounties 
		UsCounties uscounties_1 = new main.app.domain.UsCounties();
		service.deleteUsCounties(uscounties_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveUsCountiesRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveUsCountiesRecipientLocations 
		Integer countyId_6 = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		UsCounties response = null;
		response = service.saveUsCountiesRecipientLocations(countyId_6, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUsCountiesRecipientLocations
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
