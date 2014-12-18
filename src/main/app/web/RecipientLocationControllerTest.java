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
 * Unit test for the <code>RecipientLocationController</code> controller.
 *
 * @see main.app.web.RecipientLocationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class RecipientLocationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationUsCounties()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationUsCounties() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationUsCounties");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationUsStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationUsStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationUsStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationUsCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationUsCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationUsCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationIndCities()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationIndCities() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationIndCities");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationCountries()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationCountries() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationCountries");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRecipientLocationShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRecipientLocationShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRecipientLocationShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>recipientlocationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrecipientlocationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/recipientlocationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RecipientLocationController controller = (RecipientLocationController) context.getBean("RecipientLocationController");

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