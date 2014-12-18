package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;

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
public class ProductImagesServiceTest {

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
	protected ProductImagesService service;

	/**
	 * Instantiates a new ProductImagesServiceTest.
	 *
	 */
	public ProductImagesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductImages entity
	 * 
	 */
	@Test
	public void loadProductImagess() {
		Set<ProductImages> response = null;
		response = service.loadProductImagess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductImagess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Test
	public void deleteProductImages() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductImages 
		ProductImages productimages = new main.app.domain.ProductImages();
		service.deleteProductImages(productimages);
	}

	/**
	 * Operation Unit Test
	 * Return all ProductImages entity
	 * 
	 */
	@Test
	public void findAllProductImagess() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductImagess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductImages> response = null;
		response = service.findAllProductImagess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductImagess
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveProductImagesCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductImagesCartItemses 
		Integer productImageId = 0;
		CartItems related_cartitemses = new main.app.domain.CartItems();
		ProductImages response = null;
		response = service.saveProductImagesCartItemses(productImageId, related_cartitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductImagesCartItemses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductImagesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductImagesByPrimaryKey 
		Integer productImageId_1 = 0;
		ProductImages response = null;
		response = service.findProductImagesByPrimaryKey(productImageId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductImagesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProductImagesProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductImagesProducts 
		Integer productimages_productImageId = 0;
		Integer related_products_productId = 0;
		ProductImages response = null;
		response = service.deleteProductImagesProducts(productimages_productImageId, related_products_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductImagesProducts
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductImages entity
	 * 
	 */
	@Test
	public void saveProductImages() {
		// TODO: JUnit - Populate test inputs for operation: saveProductImages 
		ProductImages productimages_1 = new main.app.domain.ProductImages();
		service.saveProductImages(productimages_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteProductImagesCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductImagesCartItemses 
		Integer productimages_productImageId_1 = 0;
		Integer related_cartitemses_cartItemId = 0;
		ProductImages response = null;
		response = service.deleteProductImagesCartItemses(productimages_productImageId_1, related_cartitemses_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductImagesCartItemses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductImages entity
	 * 
	 */
	@Test
	public void countProductImagess() {
		Integer response = null;
		response = service.countProductImagess();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductImagess
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProductImagesProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProductImagesProducts 
		Integer productImageId_2 = 0;
		Products related_products = new main.app.domain.Products();
		ProductImages response = null;
		response = service.saveProductImagesProducts(productImageId_2, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductImagesProducts
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
