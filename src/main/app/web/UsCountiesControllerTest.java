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
 * Unit test for the <code>UsCountiesController</code> controller.
 *
 * @see main.app.web.UsCountiesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class UsCountiesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesUsCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesUsCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesUsCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listUsCountiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistUsCountiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listUsCountiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>uscountiesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetuscountiesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/uscountiesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		UsCountiesController controller = (UsCountiesController) context.getBean("UsCountiesController");

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