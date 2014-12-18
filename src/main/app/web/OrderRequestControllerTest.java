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
 * Unit test for the <code>OrderRequestController</code> controller.
 *
 * @see main.app.web.OrderRequestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class OrderRequestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderRequestOrderRequestStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderRequestOrderRequestStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderRequestOrderRequestStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderRequestShipmentDetailses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderRequestShipmentDetailses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderRequestShipmentDetailses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderRequestOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderRequestOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderRequestOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderrequestControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderrequestControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderrequestController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderRequestController controller = (OrderRequestController) context.getBean("OrderRequestController");

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