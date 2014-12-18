package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.UserRole;
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
public class UserRoleServiceTest {

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
	protected UserRoleService service;

	/**
	 * Instantiates a new UserRoleServiceTest.
	 *
	 */
	public UserRoleServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteUserRoleCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserRoleCustomerProfiles 
		Integer userrole_userRoleId = 0;
		Integer related_customerprofiles_customerId = 0;
		UserRole response = null;
		response = service.deleteUserRoleCustomerProfiles(userrole_userRoleId, related_customerprofiles_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserRoleCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Test
	public void deleteUserRoleVendorProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserRoleVendorProfiles 
		Integer userrole_userRoleId_1 = 0;
		Integer related_vendorprofiles_registrationId = 0;
		UserRole response = null;
		response = service.deleteUserRoleVendorProfiles(userrole_userRoleId_1, related_vendorprofiles_registrationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteUserRoleVendorProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveUserRoleCustomerProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveUserRoleCustomerProfiles 
		Integer userRoleId = 0;
		CustomerProfile related_customerprofiles = new main.app.domain.CustomerProfile();
		UserRole response = null;
		response = service.saveUserRoleCustomerProfiles(userRoleId, related_customerprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserRoleCustomerProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing UserRole entity
	 * 
	 */
	@Test
	public void saveUserRole() {
		// TODO: JUnit - Populate test inputs for operation: saveUserRole 
		UserRole userrole = new main.app.domain.UserRole();
		service.saveUserRole(userrole);
	}

	/**
	 * Operation Unit Test
	 * Load an existing UserRole entity
	 * 
	 */
	@Test
	public void loadUserRoles() {
		Set<UserRole> response = null;
		response = service.loadUserRoles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadUserRoles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing UserRole entity
	 * 
	 */
	@Test
	public void deleteUserRole() {
		// TODO: JUnit - Populate test inputs for operation: deleteUserRole 
		UserRole userrole_1 = new main.app.domain.UserRole();
		service.deleteUserRole(userrole_1);
	}

	/**
	 * Operation Unit Test
	 * Return all UserRole entity
	 * 
	 */
	@Test
	public void findAllUserRoles() {
		// TODO: JUnit - Populate test inputs for operation: findAllUserRoles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<UserRole> response = null;
		response = service.findAllUserRoles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllUserRoles
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Test
	public void saveUserRoleVendorProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveUserRoleVendorProfiles 
		Integer userRoleId_1 = 0;
		VendorProfile related_vendorprofiles = new main.app.domain.VendorProfile();
		UserRole response = null;
		response = service.saveUserRoleVendorProfiles(userRoleId_1, related_vendorprofiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveUserRoleVendorProfiles
	}

	/**
	 * Operation Unit Test
	 * Return a count of all UserRole entity
	 * 
	 */
	@Test
	public void countUserRoles() {
		Integer response = null;
		response = service.countUserRoles();
		// TODO: JUnit - Add assertions to test outputs of operation: countUserRoles
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findUserRoleByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findUserRoleByPrimaryKey 
		Integer userRoleId_2 = 0;
		UserRole response = null;
		response = service.findUserRoleByPrimaryKey(userRoleId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findUserRoleByPrimaryKey
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
