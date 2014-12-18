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
 * Unit test for the <code>VendorProfileController</code> controller.
 *
 * @see main.app.web.VendorProfileController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class VendorProfileControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorProfileVendorLocationAssociationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorProfileVendorLocationAssociationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorProfileVendorLocationAssociationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorProfileProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorProfileProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorProfileProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>vendorprofileControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvendorprofileControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/vendorprofileController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorProfileController controller = (VendorProfileController) context.getBean("VendorProfileController");

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