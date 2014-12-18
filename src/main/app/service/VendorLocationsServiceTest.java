package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.Products;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;
import main.app.domain.VendorLocations;

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
public class VendorLocationsServiceTest {

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
	protected VendorLocationsService service;

	/**
	 * Instantiates a new VendorLocationsServiceTest.
	 *
	 */
	public VendorLocationsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveVendorLocationsProductses() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsProductses 
		Integer locationId = 0;
		Products related_productses = new main.app.domain.Products();
		VendorLocations response = null;
		response = service.saveVendorLocationsProductses(locationId, related_productses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsProductses
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveVendorLocationsIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsIndDistrict 
		Integer locationId_1 = 0;
		IndDistrict related_inddistrict = new main.app.domain.IndDistrict();
		VendorLocations response = null;
		response = service.saveVendorLocationsIndDistrict(locationId_1, related_inddistrict);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocations 
		VendorLocations vendorlocations = new main.app.domain.VendorLocations();
		service.deleteVendorLocations(vendorlocations);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all VendorLocations entity
	 * 
	 */
	@Test
	public void countVendorLocationss() {
		Integer response = null;
		response = service.countVendorLocationss();
		// TODO: JUnit - Add assertions to test outputs of operation: countVendorLocationss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsIndCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsIndCities 
		Integer vendorlocations_locationId = 0;
		Integer related_indcities_cityId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsIndCities(vendorlocations_locationId, related_indcities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsIndCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveVendorLocationsIndCities() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsIndCities 
		Integer locationId_2 = 0;
		IndCities related_indcities = new main.app.domain.IndCities();
		VendorLocations response = null;
		response = service.saveVendorLocationsIndCities(locationId_2, related_indcities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsIndCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveVendorLocationsIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsIndStates 
		Integer locationId_3 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		VendorLocations response = null;
		response = service.saveVendorLocationsIndStates(locationId_3, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsIndStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsIndDistrict 
		Integer vendorlocations_locationId_1 = 0;
		Integer related_inddistrict_districtId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsIndDistrict(vendorlocations_locationId_1, related_inddistrict_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsIndDistrict
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findVendorLocationsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findVendorLocationsByPrimaryKey 
		Integer locationId_4 = 0;
		VendorLocations response = null;
		response = service.findVendorLocationsByPrimaryKey(locationId_4);
		// TODO: JUnit - Add assertions to test outputs of operation: findVendorLocationsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsCartItemses 
		Integer vendorlocations_locationId_2 = 0;
		Integer related_cartitemses_cartItemId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsCartItemses(vendorlocations_locationId_2, related_cartitemses_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsCartItemses
	}

	/**
	 * Operation Unit Test
	 * Return all VendorLocations entity
	 * 
	 */
	@Test
	public void findAllVendorLocationss() {
		// TODO: JUnit - Populate test inputs for operation: findAllVendorLocationss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<VendorLocations> response = null;
		response = service.findAllVendorLocationss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllVendorLocationss
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveVendorLocationsUsCities() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsUsCities 
		Integer locationId_5 = 0;
		UsCities related_uscities = new main.app.domain.UsCities();
		VendorLocations response = null;
		response = service.saveVendorLocationsUsCities(locationId_5, related_uscities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsUsCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocations 
		VendorLocations vendorlocations_1 = new main.app.domain.VendorLocations();
		service.saveVendorLocations(vendorlocations_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsIndStates 
		Integer vendorlocations_locationId_3 = 0;
		Integer related_indstates_stateId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsIndStates(vendorlocations_locationId_3, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsIndStates
	}

	/**
	 * Operation Unit Test
	 * Load an existing VendorLocations entity
	 * 
	 */
	@Test
	public void loadVendorLocationss() {
		Set<VendorLocations> response = null;
		response = service.loadVendorLocationss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadVendorLocationss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsUsCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsUsCities 
		Integer vendorlocations_locationId_4 = 0;
		Integer related_uscities_cityId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsUsCities(vendorlocations_locationId_4, related_uscities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsUsCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsProductses() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsProductses 
		Integer vendorlocations_locationId_5 = 0;
		Integer related_productses_productId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsProductses(vendorlocations_locationId_5, related_productses_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsProductses
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveVendorLocationsUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsUsStates 
		Integer locationId_6 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		VendorLocations response = null;
		response = service.saveVendorLocationsUsStates(locationId_6, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsUsStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveVendorLocationsUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsUsCounties 
		Integer locationId_7 = 0;
		UsCounties related_uscounties = new main.app.domain.UsCounties();
		VendorLocations response = null;
		response = service.saveVendorLocationsUsCounties(locationId_7, related_uscounties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsUsCounties
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveVendorLocationsCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationsCartItemses 
		Integer locationId_8 = 0;
		CartItems related_cartitemses = new main.app.domain.CartItems();
		VendorLocations response = null;
		response = service.saveVendorLocationsCartItemses(locationId_8, related_cartitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationsCartItemses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsUsCounties 
		Integer vendorlocations_locationId_6 = 0;
		Integer related_uscounties_countyId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsUsCounties(vendorlocations_locationId_6, related_uscounties_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsUsCounties
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteVendorLocationsUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationsUsStates 
		Integer vendorlocations_locationId_7 = 0;
		Integer related_usstates_stateId = 0;
		VendorLocations response = null;
		response = service.deleteVendorLocationsUsStates(vendorlocations_locationId_7, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationsUsStates
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
