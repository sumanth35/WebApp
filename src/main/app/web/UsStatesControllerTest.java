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
 * Unit test for the <code>UsStatesController</code> controller.
 *
 * @see main.app.web.UsStatesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class UsStatesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesUsCountieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesUsCountieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesUsCountieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>usstatesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetusstatesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/usstatesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsStatesController controller = (UsStatesController) context.getBean("UsStatesController");

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