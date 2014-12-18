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
 * Unit test for the <code>ShipmentDetailsController</code> controller.
 *
 * @see main.app.web.ShipmentDetailsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ShipmentDetailsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listShipmentDetailsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistShipmentDetailsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listShipmentDetailsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listShipmentDetailsRecipientLocation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistShipmentDetailsRecipientLocation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listShipmentDetailsRecipientLocation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteShipmentDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteShipmentDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteShipmentDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>shipmentdetailsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetshipmentdetailsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/shipmentdetailsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ShipmentDetailsController controller = (ShipmentDetailsController) context.getBean("ShipmentDetailsController");

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