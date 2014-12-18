package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;

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
public class ProductsDescriptionServiceTest {

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
	protected ProductsDescriptionService service;

	/**
	 * Instantiates a new ProductsDescriptionServiceTest.
	 *
	 */
	public ProductsDescriptionServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void saveProductsDescription() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsDescription 
		ProductsDescription productsdescription = new main.app.domain.ProductsDescription();
		service.saveProductsDescription(productsdescription);
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void loadProductsDescriptions() {
		Set<ProductsDescription> response = null;
		response = service.loadProductsDescriptions();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductsDescriptions
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveProductsDescriptionCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsDescriptionCartItemses 
		Integer productDescriptionId = 0;
		CartItems related_cartitemses = new main.app.domain.CartItems();
		ProductsDescription response = null;
		response = service.saveProductsDescriptionCartItemses(productDescriptionId, related_cartitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsDescriptionCartItemses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductsDescription entity
	 * 
	 */
	@Test
	public void countProductsDescriptions() {
		Integer response = null;
		response = service.countProductsDescriptions();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductsDescriptions
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsDescriptionByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsDescriptionByPrimaryKey 
		Integer productDescriptionId_1 = 0;
		ProductsDescription response = null;
		response = service.findProductsDescriptionByPrimaryKey(productDescriptionId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsDescriptionByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void deleteProductsDescription() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsDescription 
		ProductsDescription productsdescription_1 = new main.app.domain.ProductsDescription();
		service.deleteProductsDescription(productsdescription_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteProductsDescriptionCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsDescriptionCartItemses 
		Integer productsdescription_productDescriptionId = 0;
		Integer related_cartitemses_cartItemId = 0;
		ProductsDescription response = null;
		response = service.deleteProductsDescriptionCartItemses(productsdescription_productDescriptionId, related_cartitemses_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsDescriptionCartItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProductsDescriptionProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsDescriptionProducts 
		Integer productDescriptionId_2 = 0;
		Products related_products = new main.app.domain.Products();
		ProductsDescription response = null;
		response = service.saveProductsDescriptionProducts(productDescriptionId_2, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsDescriptionProducts
	}

	/**
	 * Operation Unit Test
	 * Return all ProductsDescription entity
	 * 
	 */
	@Test
	public void findAllProductsDescriptions() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductsDescriptions 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductsDescription> response = null;
		response = service.findAllProductsDescriptions(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductsDescriptions
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProductsDescriptionProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsDescriptionProducts 
		Integer productsdescription_productDescriptionId_1 = 0;
		Integer related_products_productId = 0;
		ProductsDescription response = null;
		response = service.deleteProductsDescriptionProducts(productsdescription_productDescriptionId_1, related_products_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsDescriptionProducts
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
