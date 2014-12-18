package main.app.service;

import java.util.List;
import java.util.Set;

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
public class VendorLocationAssociationsServiceTest {

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
	protected VendorLocationAssociationsService service;

	/**
	 * Instantiates a new VendorLocationAssociationsServiceTest.
	 *
	 */
	public VendorLocationAssociationsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void saveVendorLocationAssociations() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationAssociations 
		VendorLocationAssociations vendorlocationassociations = new main.app.domain.VendorLocationAssociations();
		service.saveVendorLocationAssociations(vendorlocationassociations);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void countVendorLocationAssociationss() {
		Integer response = null;
		response = service.countVendorLocationAssociationss();
		// TODO: JUnit - Add assertions to test outputs of operation: countVendorLocationAssociationss
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Test
	public void saveVendorLocationAssociationsVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveVendorLocationAssociationsVendorProfile 
		Integer vendorLocationAssociationId = 0;
		VendorProfile related_vendorprofile = new main.app.domain.VendorProfile();
		VendorLocationAssociations response = null;
		response = service.saveVendorLocationAssociationsVendorProfile(vendorLocationAssociationId, related_vendorprofile);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVendorLocationAssociationsVendorProfile
	}

	/**
	 * Operation Unit Test
	 * Load an existing VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void loadVendorLocationAssociationss() {
		Set<VendorLocationAssociations> response = null;
		response = service.loadVendorLocationAssociationss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadVendorLocationAssociationss
	}

	/**
	 * Operation Unit Test
	 * Return all VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void findAllVendorLocationAssociationss() {
		// TODO: JUnit - Populate test inputs for operation: findAllVendorLocationAssociationss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<VendorLocationAssociations> response = null;
		response = service.findAllVendorLocationAssociationss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllVendorLocationAssociationss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Test
	public void deleteVendorLocationAssociationsVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationAssociationsVendorProfile 
		Integer vendorlocationassociations_vendorLocationAssociationId = 0;
		Integer related_vendorprofile_registrationId = 0;
		VendorLocationAssociations response = null;
		response = service.deleteVendorLocationAssociationsVendorProfile(vendorlocationassociations_vendorLocationAssociationId, related_vendorprofile_registrationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVendorLocationAssociationsVendorProfile
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@Test
	public void deleteVendorLocationAssociations() {
		// TODO: JUnit - Populate test inputs for operation: deleteVendorLocationAssociations 
		VendorLocationAssociations vendorlocationassociations_1 = new main.app.domain.VendorLocationAssociations();
		service.deleteVendorLocationAssociations(vendorlocationassociations_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findVendorLocationAssociationsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findVendorLocationAssociationsByPrimaryKey 
		Integer vendorLocationAssociationId_1 = 0;
		VendorLocationAssociations response = null;
		response = service.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findVendorLocationAssociationsByPrimaryKey
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
