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
 * Unit test for the <code>IndDistrictController</code> controller.
 *
 * @see main.app.web.IndDistrictController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class IndDistrictControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictIndStates()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictIndStates() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictIndStates");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictIndCitieses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictIndCitieses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictIndCitieses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictRecipientLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictRecipientLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictRecipientLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictVendorOrganizationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictVendorOrganizationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictVendorOrganizationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictVendorLocationses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictVendorLocationses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictVendorLocationses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listIndDistrictCustomerProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistIndDistrictCustomerProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listIndDistrictCustomerProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteIndDistrict()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteIndDistrict() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteIndDistrict");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>inddistrictControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetinddistrictControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/inddistrictController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		IndDistrictController controller = (IndDistrictController) context.getBean("IndDistrictController");

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