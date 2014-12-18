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
 * Unit test for the <code>OrderRequestStatusesController</code> controller.
 *
 * @see main.app.web.OrderRequestStatusesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class OrderRequestStatusesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderRequestStatusesOrderRequests()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderRequestStatusesOrderRequests() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderRequestStatusesOrderRequests");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderrequeststatusesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderrequeststatusesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderrequeststatusesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestStatusesController controller = (OrderRequestStatusesController) context.getBean("OrderRequestStatusesController");

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