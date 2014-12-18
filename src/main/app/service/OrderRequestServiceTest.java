package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;
import main.app.domain.OrderedItems;
import main.app.domain.ShipmentDetails;

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
public class OrderRequestServiceTest {

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
	protected OrderRequestService service;

	/**
	 * Instantiates a new OrderRequestServiceTest.
	 *
	 */
	public OrderRequestServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderRequestByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderRequestByPrimaryKey 
		Integer orderRequestId = 0;
		OrderRequest response = null;
		response = service.findOrderRequestByPrimaryKey(orderRequestId);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderRequestByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all OrderRequest entity
	 * 
	 */
	@Test
	public void findAllOrderRequests() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrderRequests 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<OrderRequest> response = null;
		response = service.findAllOrderRequests(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrderRequests
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Test
	public void saveOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequest 
		OrderRequest orderrequest = new main.app.domain.OrderRequest();
		service.saveOrderRequest(orderrequest);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void deleteOrderRequestOrderRequestStatuses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequestOrderRequestStatuses 
		Integer orderrequest_orderRequestId = 0;
		Integer related_orderrequeststatuses_orderRequestStatusId = 0;
		OrderRequest response = null;
		response = service.deleteOrderRequestOrderRequestStatuses(orderrequest_orderRequestId, related_orderrequeststatuses_orderRequestStatusId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderRequestOrderRequestStatuses
	}

	/**
	 * Operation Unit Test
	 * Load an existing OrderRequest entity
	 * 
	 */
	@Test
	public void loadOrderRequests() {
		Set<OrderRequest> response = null;
		response = service.loadOrderRequests();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrderRequests
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Test
	public void saveOrderRequestOrderedItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequestOrderedItemses 
		Integer orderRequestId_1 = 0;
		OrderedItems related_ordereditemses = new main.app.domain.OrderedItems();
		OrderRequest response = null;
		response = service.saveOrderRequestOrderedItemses(orderRequestId_1, related_ordereditemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderRequestOrderedItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void saveOrderRequestOrderRequestStatuses() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequestOrderRequestStatuses 
		Integer orderRequestId_2 = 0;
		OrderRequestStatuses related_orderrequeststatuses = new main.app.domain.OrderRequestStatuses();
		OrderRequest response = null;
		response = service.saveOrderRequestOrderRequestStatuses(orderRequestId_2, related_orderrequeststatuses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderRequestOrderRequestStatuses
	}

	/**
	 * Operation Unit Test
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void saveOrderRequestShipmentDetailses() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequestShipmentDetailses 
		Integer orderRequestId_3 = 0;
		ShipmentDetails related_shipmentdetailses = new main.app.domain.ShipmentDetails();
		OrderRequest response = null;
		response = service.saveOrderRequestShipmentDetailses(orderRequestId_3, related_shipmentdetailses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderRequestShipmentDetailses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all OrderRequest entity
	 * 
	 */
	@Test
	public void countOrderRequests() {
		Integer response = null;
		response = service.countOrderRequests();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrderRequests
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Test
	public void deleteOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequest 
		OrderRequest orderrequest_1 = new main.app.domain.OrderRequest();
		service.deleteOrderRequest(orderrequest_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void deleteOrderRequestShipmentDetailses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequestShipmentDetailses 
		Integer orderrequest_orderRequestId_1 = 0;
		Integer related_shipmentdetailses_shipmentId = 0;
		OrderRequest response = null;
		response = service.deleteOrderRequestShipmentDetailses(orderrequest_orderRequestId_1, related_shipmentdetailses_shipmentId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderRequestShipmentDetailses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Test
	public void deleteOrderRequestOrderedItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequestOrderedItemses 
		Integer orderrequest_orderRequestId_2 = 0;
		Integer related_ordereditemses_orderItemId = 0;
		OrderRequest response = null;
		response = service.deleteOrderRequestOrderedItemses(orderrequest_orderRequestId_2, related_ordereditemses_orderItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderRequestOrderedItemses
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
