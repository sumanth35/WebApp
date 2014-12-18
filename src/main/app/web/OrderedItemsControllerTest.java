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
 * Unit test for the <code>OrderedItemsController</code> controller.
 *
 * @see main.app.web.OrderedItemsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class OrderedItemsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderedItemsCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderedItemsCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderedItemsCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderedItemsOrderRequest()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderedItemsOrderRequest() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderedItemsOrderRequest");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderedItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderedItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderedItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ordereditemsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetordereditemsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ordereditemsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderedItemsController controller = (OrderedItemsController) context.getBean("OrderedItemsController");

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