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
public class IndDistrictServiceTest {

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
	protected IndDistrictService service;

	/**
	 * Instantiates a new IndDistrictServiceTest.
	 *
	 */
	public IndDistrictServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing IndDistrict entity
	 * 
	 */
	@Test
	public void loadIndDistricts() {
		Set<IndDistrict> response = null;
		response = service.loadIndDistricts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadIndDistricts
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveIndDistrictRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictRecipientLocations 
		Integer districtId = 0;
		RecipientLocation related_recipientlocations = new main.app.domain.RecipientLocation();
		IndDistrict response = null;
		response = service.saveIndDistrictRecipientLocations(districtId, related_recipientlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndDistrict entity
	 * 
	 */
	@Test
	public void saveIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrict 
		IndDistrict inddistrict = new main.app.domain.IndDistrict();
		service.saveIndDistrict(inddistrict);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findIndDistrictByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findIndDistrictByPrimaryKey 
		Integer districtId_1 = 0;
		IndDistrict response = null;
		response = service.findIndDistrictByPrimaryKey(districtId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findIndDistrictByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndStates entity
	 * 
	 */
	@Test
	public void saveIndDistrictIndStates() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictIndStates 
		Integer districtId_2 = 0;
		IndStates related_indstates = new main.app.domain.IndStates();
		IndDistrict response = null;
		response = service.saveIndDistrictIndStates(districtId_2, related_indstates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictIndStates
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void saveIndDistrictVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictVendorOrganizationses 
		Integer districtId_3 = 0;
		VendorOrganizations related_vendororganizationses = new main.app.domain.VendorOrganizations();
		IndDistrict response = null;
		response = service.saveIndDistrictVendorOrganizationses(districtId_3, related_vendororganizationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteIndDistrictRecipientLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictRecipientLocations 
		Integer inddistrict_districtId = 0;
		Integer related_recipientlocations_recipientLocationId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictRecipientLocations(inddistrict_districtId, related_recipientlocations_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictRecipientLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndStates entity
	 * 
	 */
	@Test
	public void deleteIndDistrictIndStates() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictIndStates 
		Integer inddistrict_districtId_1 = 0;
		Integer related_indstates_stateId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictIndStates(inddistrict_districtId_1, related_indstates_stateId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictIndStates
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteIndDistrictCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictCustomerProfiles 
		Integer inddistrict_districtId_2 = 0;
		Integer related_customerprofiles_customerId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictCustomerProfiles(inddistrict_districtId_2, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndDistrict entity
	 * 
	 */
	@Test
	public void deleteIndDistrict() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrict 
		IndDistrict inddistrict_1 = new main.app.domain.IndDistrict();
		service.deleteIndDistrict(inddistrict_1);
	}

	/**
	 * Operation Unit Test
	 * Return all IndDistrict entity
	 * 
	 */
	@Test
	public void findAllIndDistricts() {
		// TODO: JUnit - Populate test inputs for operation: findAllIndDistricts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<IndDistrict> response = null;
		response = service.findAllIndDistricts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllIndDistricts
	}

	/**
	 * Operation Unit Test
	 * Return a count of all IndDistrict entity
	 * 
	 */
	@Test
	public void countIndDistricts() {
		Integer response = null;
		response = service.countIndDistricts();
		// TODO: JUnit - Add assertions to test outputs of operation: countIndDistricts
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveIndDistrictVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictVendorLocationses 
		Integer districtId_4 = 0;
		VendorLocations related_vendorlocationses = new main.app.domain.VendorLocations();
		IndDistrict response = null;
		response = service.saveIndDistrictVendorLocationses(districtId_4, related_vendorlocationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing IndCities entity
	 * 
	 */
	@Test
	public void saveIndDistrictIndCitieses() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictIndCitieses 
		Integer districtId_5 = 0;
		IndCities related_indcitieses = new main.app.domain.IndCities();
		IndDistrict response = null;
		response = service.saveIndDistrictIndCitieses(districtId_5, related_indcitieses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictIndCitieses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorOrganizations entity
	 * 
	 */
	@Test
	public void deleteIndDistrictVendorOrganizationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictVendorOrganizationses 
		Integer inddistrict_districtId_3 = 0;
		Integer related_vendororganizationses_organizationId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictVendorOrganizationses(inddistrict_districtId_3, related_vendororganizationses_organizationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictVendorOrganizationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteIndDistrictVendorLocationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictVendorLocationses 
		Integer inddistrict_districtId_4 = 0;
		Integer related_vendorlocationses_locationId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictVendorLocationses(inddistrict_districtId_4, related_vendorlocationses_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictVendorLocationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveIndDistrictCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveIndDistrictCustomerProfiles 
		Integer districtId_6 = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		IndDistrict response = null;
		response = service.saveIndDistrictCustomerProfiles(districtId_6, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveIndDistrictCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing IndCities entity
	 * 
	 */
	@Test
	public void deleteIndDistrictIndCitieses() {
		// TODO: JUnit - Populate test inputs for operation: deleteIndDistrictIndCitieses 
		Integer inddistrict_districtId_5 = 0;
		Integer related_indcitieses_cityId = 0;
		IndDistrict response = null;
		response = service.deleteIndDistrictIndCitieses(inddistrict_districtId_5, related_indcitieses_cityId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteIndDistrictIndCitieses
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
