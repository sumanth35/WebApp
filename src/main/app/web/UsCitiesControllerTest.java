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
 * Unit test for the <code>UsCitiesController</code> controller.
 *
 * @see main.app.web.UsCitiesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class UsCitiesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>uscitiesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetuscitiesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/uscitiesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCitiesController controller = (UsCitiesController) context.getBean("UsCitiesController");

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