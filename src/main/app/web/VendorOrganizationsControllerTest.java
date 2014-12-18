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
 * Unit test for the <code>VendorOrganizationsController</code> controller.
 *
 * @see main.app.web.VendorOrganizationsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class VendorOrganizationsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorOrganizationsCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorOrganizationsCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorOrganizationsCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorOrganizations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorOrganizations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorOrganizations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>vendororganizationsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvendororganizationsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/vendororganizationsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorOrganizationsController controller = (VendorOrganizationsController) context.getBean("VendorOrganizationsController");

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