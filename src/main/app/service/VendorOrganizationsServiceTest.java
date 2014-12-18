package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Countries;
import main.app.domain.IndCities;
import main.app.domain.IndDistrict;
import main.app.domain.IndStates;
import main.app.domain.UsCities;
import main.app.domain.UsCounties;
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
public class VendorOrganizationsServiceTest {

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
	protected VendorOrganizationsService service;

	/**
	 * Instantiates a new VendorOrganizationsServiceTest.
	 *
	 */
	public VendorOrganizationsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void loadVendorOrganizationss() {
		Set<VendorOrganizations> response = null;
		response = service.loadVendorOrganizationss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadVendorOrganizationss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsIndStates 
		Integer vendororganizations_organizationId = 0;
		Integer related_indstates_stateId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsIndStates(vendororganizations_organizationId, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsIndStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsStates entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsUsStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsUsStates 
		Integer vendororganizations_organizationId_1 = 0;
		Integer related_usstates_stateId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsUsStates(vendororganizations_organizationId_1, related_usstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsUsStates
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findVendorOrganizationsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findVendorOrganizationsByPrimaryKey 
		Integer organizationId = 0;
		VendorOrganizations response = null;
		response = service.findVendorOrganizationsByPrimaryKey(organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: findVendorOrganizationsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Countries entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsCountries() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsCountries 
		Integer vendororganizations_organizationId_2 = 0;
		Integer related_countries_countryId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsCountries(vendororganizations_organizationId_2, related_countries_countryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsCountries
	}

	/**
	 * Operation Unit Test
	 * Return all VendorOrganizations entity
	 * 
	 */
	@Test
	public void findAllVendorOrganizationss() {
		// TODO: JUnit - Populate test inputs for operation: findAllVendorOrganizationss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<VendorOrganizations> response = null;
		response = service.findAllVendorOrganizationss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllVendorOrganizationss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Countries entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsCountries() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsCountries 
		Integer organizationId_1 = 0;
		Countries related_countries = new main.app.domain.Countries();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsCountries(organizationId_1, related_countries);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsCountries
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveVendorOrganizations() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizations 
		VendorOrganizations vendororganizations = new main.app.domain.VendorOrganizations();
		service.saveVendorOrganizations(vendororganizations);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsIndCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsIndCities 
		Integer vendororganizations_organizationId_3 = 0;
		Integer related_indcities_cityId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsIndCities(vendororganizations_organizationId_3, related_indcities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsIndCities
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsIndDistrict 
		Integer vendororganizations_organizationId_4 = 0;
		Integer related_inddistrict_districtId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsIndDistrict(vendororganizations_organizationId_4, related_inddistrict_districtId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsIndStates 
		Integer organizationId_2 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsIndStates(organizationId_2, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsIndStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCounties entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsUsCounties 
		Integer vendororganizations_organizationId_5 = 0;
		Integer related_uscounties_countyId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsUsCounties(vendororganizations_organizationId_5, related_uscounties_countyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsUsCounties
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UsCities entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizationsUsCities() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizationsUsCities 
		Integer vendororganizations_organizationId_6 = 0;
		Integer related_uscities_cityId = 0;
		VendorOrganizations response = null;
		response = service.deleteVendorOrganizationsUsCities(vendororganizations_organizationId_6, related_uscities_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorOrganizationsUsCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsIndCities() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsIndCities 
		Integer organizationId_3 = 0;
		IndCities related_indcities = new main.app.domain.IndCities();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsIndCities(organizationId_3, related_indcities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsIndCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCities entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsUsCities() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsUsCities 
		Integer organizationId_4 = 0;
		UsCities related_uscities = new main.app.domain.UsCities();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsUsCities(organizationId_4, related_uscities);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsUsCities
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsCounties entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsUsCounties() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsUsCounties 
		Integer organizationId_5 = 0;
		UsCounties related_uscounties = new main.app.domain.UsCounties();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsUsCounties(organizationId_5, related_uscounties);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsUsCounties
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteVendorOrganizations() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorOrganizations 
		VendorOrganizations vendororganizations_1 = new main.app.domain.VendorOrganizations();
		service.deleteVendorOrganizations(vendororganizations_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all VendorOrganizations entity
	 * 
	 */
	@Test
	public void countVendorOrganizationss() {
		Integer response = null;
		response = service.countVendorOrganizationss();
		// TODO: JUnit - Add assertions to test outputs of operation: countVendorOrganizationss
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsIndDistrict 
		Integer organizationId_6 = 0;
		IndDistrict related_inddistrict = new main.app.domain.IndDistrict();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsIndDistrict(organizationId_6, related_inddistrict);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsIndDistrict
	}

	/**
	 * Operation Unit Test
	 * Save an existing UsStates entity
	 * 
	 */
	@Test
	public void saveVendorOrganizationsUsStates() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorOrganizationsUsStates 
		Integer organizationId_7 = 0;
		UsStates related_usstates = new main.app.domain.UsStates();
		VendorOrganizations response = null;
		response = service.saveVendorOrganizationsUsStates(organizationId_7, related_usstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorOrganizationsUsStates
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
