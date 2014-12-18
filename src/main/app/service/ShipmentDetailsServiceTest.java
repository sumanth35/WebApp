package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.RecipientLocation;
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
public class ShipmentDetailsServiceTest {

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
	protected ShipmentDetailsService service;

	/**
	 * Instantiates a new ShipmentDetailsServiceTest.
	 *
	 */
	public ShipmentDetailsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void loadShipmentDetailss() {
		Set<ShipmentDetails> response = null;
		response = service.loadShipmentDetailss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadShipmentDetailss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void deleteShipmentDetailsRecipientLocation() {
		// TODO: JUnit - Populate test inputs for operation: deleteShipmentDetailsRecipientLocation 
		Integer shipmentdetails_shipmentId = 0;
		Integer related_recipientlocation_recipientLocationId = 0;
		ShipmentDetails response = null;
		response = service.deleteShipmentDetailsRecipientLocation(shipmentdetails_shipmentId, related_recipientlocation_recipientLocationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteShipmentDetailsRecipientLocation
	}

	/**
	 * Operation Unit Test
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Test
	public void saveShipmentDetailsRecipientLocation() {
		// TODO: JUnit - Populate test inputs for operation: saveShipmentDetailsRecipientLocation 
		Integer shipmentId = 0;
		RecipientLocation related_recipientlocation = new main.app.domain.RecipientLocation();
		ShipmentDetails response = null;
		response = service.saveShipmentDetailsRecipientLocation(shipmentId, related_recipientlocation);
		// TODO: JUnit - Add assertions to test outputs of operation: saveShipmentDetailsRecipientLocation
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Test
	public void saveShipmentDetailsOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: saveShipmentDetailsOrderRequest 
		Integer shipmentId_1 = 0;
		OrderRequest related_orderrequest = new main.app.domain.OrderRequest();
		ShipmentDetails response = null;
		response = service.saveShipmentDetailsOrderRequest(shipmentId_1, related_orderrequest);
		// TODO: JUnit - Add assertions to test outputs of operation: saveShipmentDetailsOrderRequest
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void deleteShipmentDetails() {
		// TODO: JUnit - Populate test inputs for operation: deleteShipmentDetails 
		ShipmentDetails shipmentdetails = new main.app.domain.ShipmentDetails();
		service.deleteShipmentDetails(shipmentdetails);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Test
	public void deleteShipmentDetailsOrderRequest() {
		// TODO: JUnit - Populate test inputs for operation: deleteShipmentDetailsOrderRequest 
		Integer shipmentdetails_shipmentId_1 = 0;
		Integer related_orderrequest_orderRequestId = 0;
		ShipmentDetails response = null;
		response = service.deleteShipmentDetailsOrderRequest(shipmentdetails_shipmentId_1, related_orderrequest_orderRequestId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteShipmentDetailsOrderRequest
	}

	/**
	 * Operation Unit Test
	 * Return all ShipmentDetails entity
	 * 
	 */
	@Test
	public void findAllShipmentDetailss() {
		// TODO: JUnit - Populate test inputs for operation: findAllShipmentDetailss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ShipmentDetails> response = null;
		response = service.findAllShipmentDetailss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllShipmentDetailss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ShipmentDetails entity
	 * 
	 */
	@Test
	public void countShipmentDetailss() {
		Integer response = null;
		response = service.countShipmentDetailss();
		// TODO: JUnit - Add assertions to test outputs of operation: countShipmentDetailss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Test
	public void saveShipmentDetails() {
		// TODO: JUnit - Populate test inputs for operation: saveShipmentDetails 
		ShipmentDetails shipmentdetails_1 = new main.app.domain.ShipmentDetails();
		service.saveShipmentDetails(shipmentdetails_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findShipmentDetailsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findShipmentDetailsByPrimaryKey 
		Integer shipmentId_2 = 0;
		ShipmentDetails response = null;
		response = service.findShipmentDetailsByPrimaryKey(shipmentId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findShipmentDetailsByPrimaryKey
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
