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
 * Unit test for the <code>VendorLocationAssociationsController</code> controller.
 *
 * @see main.app.web.VendorLocationAssociationsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class VendorLocationAssociationsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationAssociationsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationAssociationsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationAssociationsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationAssociations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationAssociations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationAssociations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>vendorlocationassociationsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvendorlocationassociationsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/vendorlocationassociationsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationAssociationsController controller = (VendorLocationAssociationsController) context.getBean("VendorLocationAssociationsController");

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