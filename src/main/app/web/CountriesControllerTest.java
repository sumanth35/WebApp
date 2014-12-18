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
 * Unit test for the <code>CountriesController</code> controller.
 *
 * @see main.app.web.CountriesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class CountriesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCountriesRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCountriesRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCountriesRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCountriesUsStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCountriesUsStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCountriesUsStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCountriesVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCountriesVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCountriesVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCountriesIndStateses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCountriesIndStateses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCountriesIndStateses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCountriesCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCountriesCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCountriesCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>countriesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcountriesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/countriesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CountriesController controller = (CountriesController) context.getBean("CountriesController");

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