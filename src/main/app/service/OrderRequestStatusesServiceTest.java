package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;

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
public class OrderRequestStatusesServiceTest {

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
	protected OrderRequestStatusesService service;

	/**
	 * Instantiates a new OrderRequestStatusesServiceTest.
	 *
	 */
	public OrderRequestStatusesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void findAllOrderRequestStatusess() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrderRequestStatusess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<OrderRequestStatuses> response = null;
		response = service.findAllOrderRequestStatusess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrderRequestStatusess
	}

	/**
	 * Operation Unit Test
	 * Load an existing OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void loadOrderRequestStatusess() {
		Set<OrderRequestStatuses> response = null;
		response = service.loadOrderRequestStatusess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrderRequestStatusess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void deleteOrderRequestStatuses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequestStatuses 
		OrderRequestStatuses orderrequeststatuses = new main.app.domain.OrderRequestStatuses();
		service.deleteOrderRequestStatuses(orderrequeststatuses);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Test
	public void deleteOrderRequestStatusesOrderRequests() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderRequestStatusesOrderRequests 
		Integer orderrequeststatuses_orderRequestStatusId = 0;
		Integer related_orderrequests_orderRequestId = 0;
		OrderRequestStatuses response = null;
		response = service.deleteOrderRequestStatusesOrderRequests(orderrequeststatuses_orderRequestStatusId, related_orderrequests_orderRequestId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderRequestStatusesOrderRequests
	}

	/**
	 * Operation Unit Test
	 * Return a count of all OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void countOrderRequestStatusess() {
		Integer response = null;
		response = service.countOrderRequestStatusess();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrderRequestStatusess
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderRequestStatusesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderRequestStatusesByPrimaryKey 
		Integer orderRequestStatusId = 0;
		OrderRequestStatuses response = null;
		response = service.findOrderRequestStatusesByPrimaryKey(orderRequestStatusId);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderRequestStatusesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@Test
	public void saveOrderRequestStatuses() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequestStatuses 
		OrderRequestStatuses orderrequeststatuses_1 = new main.app.domain.OrderRequestStatuses();
		service.saveOrderRequestStatuses(orderrequeststatuses_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Test
	public void saveOrderRequestStatusesOrderRequests() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderRequestStatusesOrderRequests 
		Integer orderRequestStatusId_1 = 0;
		OrderRequest related_orderrequests = new main.app.domain.OrderRequest();
		OrderRequestStatuses response = null;
		response = service.saveOrderRequestStatusesOrderRequests(orderRequestStatusId_1, related_orderrequests);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderRequestStatusesOrderRequests
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
