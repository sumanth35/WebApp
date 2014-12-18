package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.OrderRequest;
import main.app.domain.OrderedItems;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
@Transactional
public class OrderedItemsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected OrderedItemsService service;

	/**
	 * Instantiates a new OrderedItemsServiceTest.
	 *
	 */
	public OrderedItemsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Test
	public void saveOrderedItemsOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderedItemsOrderRequest 
		Integer orderItemId = 0;
		OrderRequest related_orderrequest = new main.app.domain.OrderRequest();
		OrderedItems response = null;
		response = service.saveOrderedItemsOrderRequest(orderItemId, related_orderrequest);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderedItemsOrderRequest
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveOrderedItemsCartItems() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderedItemsCartItems 
		Integer orderItemId_1 = 0;
		CartItems related_cartitems = new main.app.domain.CartItems();
		OrderedItems response = null;
		response = service.saveOrderedItemsCartItems(orderItemId_1, related_cartitems);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderedItemsCartItems
	}

	/**
	 * Operation Unit Test
	 * Load an existing OrderedItems entity
	 * 
	 */
	@Test
	public void loadOrderedItemss() {
		Set<OrderedItems> response = null;
		response = service.loadOrderedItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrderedItemss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Test
	public void deleteOrderedItemsOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderedItemsOrderRequest 
		Integer ordereditems_orderItemId = 0;
		Integer related_orderrequest_orderRequestId = 0;
		OrderedItems response = null;
		response = service.deleteOrderedItemsOrderRequest(ordereditems_orderItemId, related_orderrequest_orderRequestId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderedItemsOrderRequest
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderedItemsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderedItemsByPrimaryKey 
		Integer orderItemId_2 = 0;
		OrderedItems response = null;
		response = service.findOrderedItemsByPrimaryKey(orderItemId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderedItemsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Test
	public void saveOrderedItems() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderedItems 
		OrderedItems ordereditems = new main.app.domain.OrderedItems();
		service.saveOrderedItems(ordereditems);
	}

	/**
	 * Operation Unit Test
	 * Return all OrderedItems entity
	 * 
	 */
	@Test
	public void findAllOrderedItemss() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrderedItemss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<OrderedItems> response = null;
		response = service.findAllOrderedItemss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrderedItemss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Test
	public void deleteOrderedItems() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderedItems 
		OrderedItems ordereditems_1 = new main.app.domain.OrderedItems();
		service.deleteOrderedItems(ordereditems_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all OrderedItems entity
	 * 
	 */
	@Test
	public void countOrderedItemss() {
		Integer response = null;
		response = service.countOrderedItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrderedItemss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteOrderedItemsCartItems() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderedItemsCartItems 
		Integer ordereditems_orderItemId_1 = 0;
		Integer related_cartitems_cartItemId = 0;
		OrderedItems response = null;
		response = service.deleteOrderedItemsCartItems(ordereditems_orderItemId_1, related_cartitems_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderedItemsCartItems
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
