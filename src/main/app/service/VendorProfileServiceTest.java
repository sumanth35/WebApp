package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Products;
import main.app.domain.UserRole;
import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

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
public class VendorProfileServiceTest {

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
	protected VendorProfileService service;

	/**
	 * Instantiates a new VendorProfileServiceTest.
	 *
	 */
	public VendorProfileServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteVendorProfileProductses() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorProfileProductses 
		Integer vendorprofile_registrationId = 0;
		Integer related_productses_productId = 0;
		VendorProfile response = null;
		response = service.deleteVendorProfileProductses(vendorprofile_registrationId, related_productses_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorProfileProductses
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void saveVendorProfileVendorLocationAssociationses() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorProfileVendorLocationAssociationses 
		Integer registrationId = 0;
		VendorLocationAssociations related_vendorlocationassociationses = new main.app.domain.VendorLocationAssociations();
		VendorProfile response = null;
		response = service.saveVendorProfileVendorLocationAssociationses(registrationId, related_vendorlocationassociationses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorProfileVendorLocationAssociationses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveVendorProfileProductses() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorProfileProductses 
		Integer registrationId_1 = 0;
		Products related_productses = new main.app.domain.Products();
		VendorProfile response = null;
		response = service.saveVendorProfileProductses(registrationId_1, related_productses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorProfileProductses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findVendorProfileByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findVendorProfileByPrimaryKey 
		Integer registrationId_2 = 0;
		VendorProfile response = null;
		response = service.findVendorProfileByPrimaryKey(registrationId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findVendorProfileByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Test
	public void deleteVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorProfile 
		VendorProfile vendorprofile = new main.app.domain.VendorProfile();
		service.deleteVendorProfile(vendorprofile);
	}

	/**
	 * Operation Unit Test
	 * Load an existing VendorProfile entity
	 * 
	 */
	@Test
	public void loadVendorProfiles() {
		Set<VendorProfile> response = null;
		response = service.loadVendorProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadVendorProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserRole entity
	 * 
	 */
	@Test
	public void saveVendorProfileUserRole() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorProfileUserRole 
		Integer registrationId_3 = 0;
		UserRole related_userrole = new main.app.domain.UserRole();
		VendorProfile response = null;
		response = service.saveVendorProfileUserRole(registrationId_3, related_userrole);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorProfileUserRole
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void deleteVendorProfileVendorLocationAssociationses() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorProfileVendorLocationAssociationses 
		Integer vendorprofile_registrationId_1 = 0;
		Integer related_vendorlocationassociationses_vendorLocationAssociationId = 0;
		VendorProfile response = null;
		response = service.deleteVendorProfileVendorLocationAssociationses(vendorprofile_registrationId_1, related_vendorlocationassociationses_vendorLocationAssociationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorProfileVendorLocationAssociationses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserRole entity
	 * 
	 */
	@Test
	public void deleteVendorProfileUserRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorProfileUserRole 
		Integer vendorprofile_registrationId_2 = 0;
		Integer related_userrole_userRoleId = 0;
		VendorProfile response = null;
		response = service.deleteVendorProfileUserRole(vendorprofile_registrationId_2, related_userrole_userRoleId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorProfileUserRole
	}

	/**
	 * Operation Unit Test
	 * Return all VendorProfile entity
	 * 
	 */
	@Test
	public void findAllVendorProfiles() {
		// TODO: JUnit - Populate test inputs for operation: findAllVendorProfiles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<VendorProfile> response = null;
		response = service.findAllVendorProfiles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllVendorProfiles
	}

	/**
	 * Operation Unit Test
	 * Return a count of all VendorProfile entity
	 * 
	 */
	@Test
	public void countVendorProfiles() {
		Integer response = null;
		response = service.countVendorProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: countVendorProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Test
	public void saveVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorProfile 
		VendorProfile vendorprofile_1 = new main.app.domain.VendorProfile();
		service.saveVendorProfile(vendorprofile_1);
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
