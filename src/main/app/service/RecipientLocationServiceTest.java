package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
import main.app.domain.UsStates;

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
public class RecipientLocationServiceTest {

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
	protected RecipientLocationService service;

	/**
	 * Instantiates a new RecipientLocationServiceTest.
	 *
	 */
	public RecipientLocationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all RecipientLocation entity
	 * 
	 */
	@Test
	public void countRecipientLocations() {
		Integer response = null;
		response = service.countRecipientLocations();
		// TODO: JUnit - Add assertions to test outputs of operation: countRecipientLocations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRecipientLocationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRecipientLocationByPrimaryKey 
		Integer recipientLocationId = 0;
		RecipientLocation response = null;
		response = service.findRecipientLocationByPrimaryKey(recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: findRecipientLocationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationIndCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationIndCities 
		Integer recipientlocation_recipientLocationId = 0;
		Integer related_indcities_cityId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationIndCities(recipientlocation_recipientLocationId, related_indcities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationIndCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveRecipientLocationIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationIndDistrict 
		Integer recipientLocationId_1 = 0;
		IndDistrict related_inddistrict = new main.app.domain.IndDistrict();
		RecipientLocation response = null;
		response = service.saveRecipientLocationIndDistrict(recipientLocationId_1, related_inddistrict);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationUsStates 
		Integer recipientlocation_recipientLocationId_1 = 0;
		Integer related_usstates_stateId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationUsStates(recipientlocation_recipientLocationId_1, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationUsStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveRecipientLocationUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationUsCounties 
		Integer recipientLocationId_2 = 0;
		UsCounties related_uscounties = new main.app.domain.UsCounties();
		RecipientLocation response = null;
		response = service.saveRecipientLocationUsCounties(recipientLocationId_2, related_uscounties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationUsCounties
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveRecipientLocationCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationCountries 
		Integer recipientLocationId_3 = 0;
		Countries related_countries = new main.app.domain.Countries();
		RecipientLocation response = null;
		response = service.saveRecipientLocationCountries(recipientLocationId_3, related_countries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationCountries
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationUsCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationUsCities 
		Integer recipientlocation_recipientLocationId_2 = 0;
		Integer related_uscities_cityId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationUsCities(recipientlocation_recipientLocationId_2, related_uscities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationUsCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveRecipientLocationUsCities() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationUsCities 
		Integer recipientLocationId_4 = 0;
		UsCities related_uscities = new main.app.domain.UsCities();
		RecipientLocation response = null;
		response = service.saveRecipientLocationUsCities(recipientLocationId_4, related_uscities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationUsCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationIndDistrict 
		Integer recipientlocation_recipientLocationId_3 = 0;
		Integer related_inddistrict_districtId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationIndDistrict(recipientlocation_recipientLocationId_3, related_inddistrict_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationIndStates 
		Integer recipientlocation_recipientLocationId_4 = 0;
		Integer related_indstates_stateId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationIndStates(recipientlocation_recipientLocationId_4, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationIndStates
	}

	/**
	 * Operation Unit Test
	 * Return all RecipientLocation entity
	 * 
	 */
	@Test
	public void findAllRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: findAllRecipientLocations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RecipientLocation> response = null;
		response = service.findAllRecipientLocations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationUsCounties 
		Integer recipientlocation_recipientLocationId_5 = 0;
		Integer related_uscounties_countyId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationUsCounties(recipientlocation_recipientLocationId_5, related_uscounties_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationUsCounties
	}

	/**
	 * Operation Unit Test
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void saveRecipientLocationShipmentDetailses() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationShipmentDetailses 
		Integer recipientLocationId_5 = 0;
		ShipmentDetails related_shipmentdetailses = new main.app.domain.ShipmentDetails();
		RecipientLocation response = null;
		response = service.saveRecipientLocationShipmentDetailses(recipientLocationId_5, related_shipmentdetailses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationShipmentDetailses
	}

	/**
	 * Operation Unit Test
	 * Load an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void loadRecipientLocations() {
		Set<RecipientLocation> response = null;
		response = service.loadRecipientLocations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveRecipientLocationIndCities() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationIndCities 
		Integer recipientLocationId_6 = 0;
		IndCities related_indcities = new main.app.domain.IndCities();
		RecipientLocation response = null;
		response = service.saveRecipientLocationIndCities(recipientLocationId_6, related_indcities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationIndCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationCountries 
		Integer recipientlocation_recipientLocationId_6 = 0;
		Integer related_countries_countryId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationCountries(recipientlocation_recipientLocationId_6, related_countries_countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationCountries
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveRecipientLocationIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationIndStates 
		Integer recipientLocationId_7 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		RecipientLocation response = null;
		response = service.saveRecipientLocationIndStates(recipientLocationId_7, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationIndStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveRecipientLocation() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocation 
		RecipientLocation recipientlocation = new main.app.domain.RecipientLocation();
		service.saveRecipientLocation(recipientlocation);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void deleteRecipientLocationShipmentDetailses() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocationShipmentDetailses 
		Integer recipientlocation_recipientLocationId_7 = 0;
		Integer related_shipmentdetailses_shipmentId = 0;
		RecipientLocation response = null;
		response = service.deleteRecipientLocationShipmentDetailses(recipientlocation_recipientLocationId_7, related_shipmentdetailses_shipmentId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRecipientLocationShipmentDetailses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteRecipientLocation() {
		// TODO: JUnit - Populate test inputs for operation: deleteRecipientLocation 
		RecipientLocation recipientlocation_1 = new main.app.domain.RecipientLocation();
		service.deleteRecipientLocation(recipientlocation_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveRecipientLocationUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveRecipientLocationUsStates 
		Integer recipientLocationId_8 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		RecipientLocation response = null;
		response = service.saveRecipientLocationUsStates(recipientLocationId_8, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRecipientLocationUsStates
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
