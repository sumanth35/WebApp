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
 * Unit test for the <code>IndCitiesController</code> controller.
 *
 * @see main.app.web.IndCitiesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class IndCitiesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndCitiesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndCitiesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndCitiesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indcitiesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindcitiesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indcitiesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndCitiesController controller = (IndCitiesController) context.getBean("IndCitiesController");

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