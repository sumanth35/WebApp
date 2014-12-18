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
 * Unit test for the <code>CustomerProfileController</code> controller.
 *
 * @see main.app.web.CustomerProfileController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class CustomerProfileControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileUserRole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileUserRole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileUserRole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCustomerProfileCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCustomerProfileCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCustomerProfileCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>customerprofileControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcustomerprofileControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/customerprofileController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerProfileController controller = (CustomerProfileController) context.getBean("CustomerProfileController");

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