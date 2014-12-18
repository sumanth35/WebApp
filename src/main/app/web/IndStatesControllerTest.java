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
 * Unit test for the <code>IndStatesController</code> controller.
 *
 * @see main.app.web.IndStatesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class IndStatesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesIndDistricts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesIndDistricts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesIndDistricts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndStatesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndStatesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndStatesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indstatesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindstatesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indstatesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndStatesController controller = (IndStatesController) context.getBean("IndStatesController");

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