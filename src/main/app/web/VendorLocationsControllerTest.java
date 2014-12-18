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
 * Unit test for the <code>VendorLocationsController</code> controller.
 *
 * @see main.app.web.VendorLocationsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class VendorLocationsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVendorLocationsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVendorLocationsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVendorLocationsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>vendorlocationsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvendorlocationsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/vendorlocationsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VendorLocationsController controller = (VendorLocationsController) context.getBean("VendorLocationsController");

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