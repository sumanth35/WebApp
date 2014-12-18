package main.app.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>UserRoleController</code> controller.
 *
 * @see main.app.web.UserRoleController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class UserRoleControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserRoleCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserRoleCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserRoleCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUserRoleVendorProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUserRoleVendorProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUserRoleVendorProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>userroleControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetuserroleControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/userroleController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UserRoleController controller = (UserRoleController) context.getBean("UserRoleController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}