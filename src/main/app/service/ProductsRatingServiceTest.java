package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

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
public class ProductsRatingServiceTest {

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
	protected ProductsRatingService service;

	/**
	 * Instantiates a new ProductsRatingServiceTest.
	 *
	 */
	public ProductsRatingServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all ProductsRating entity
	 * 
	 */
	@Test
	public void findAllProductsRatings() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductsRatings 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductsRating> response = null;
		response = service.findAllProductsRatings(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProductsRatingProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsRatingProducts 
		Integer productsrating_productRatingId = 0;
		Integer related_products_productId = 0;
		ProductsRating response = null;
		response = service.deleteProductsRatingProducts(productsrating_productRatingId, related_products_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsRatingProducts
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteProductsRatingCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsRatingCustomerProfile 
		Integer productsrating_productRatingId_1 = 0;
		Integer related_customerprofile_customerId = 0;
		ProductsRating response = null;
		response = service.deleteProductsRatingCustomerProfile(productsrating_productRatingId_1, related_customerprofile_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsRatingCustomerProfile
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveProductsRatingCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsRatingCustomerProfile 
		Integer productRatingId = 0;
		CustomerProfile related_customerprofile = new main.app.domain.CustomerProfile();
		ProductsRating response = null;
		response = service.saveProductsRatingCustomerProfile(productRatingId, related_customerprofile);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsRatingCustomerProfile
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductsRating entity
	 * 
	 */
	@Test
	public void countProductsRatings() {
		Integer response = null;
		response = service.countProductsRatings();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void saveProductsRatingProductsFeedbacks() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsRatingProductsFeedbacks 
		Integer productRatingId_1 = 0;
		ProductsFeedback related_productsfeedbacks = new main.app.domain.ProductsFeedback();
		ProductsRating response = null;
		response = service.saveProductsRatingProductsFeedbacks(productRatingId_1, related_productsfeedbacks);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsRatingProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Test
	public void deleteProductsRating() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsRating 
		ProductsRating productsrating = new main.app.domain.ProductsRating();
		service.deleteProductsRating(productsrating);
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Test
	public void saveProductsRating() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsRating 
		ProductsRating productsrating_1 = new main.app.domain.ProductsRating();
		service.saveProductsRating(productsrating_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductsRating entity
	 * 
	 */
	@Test
	public void loadProductsRatings() {
		Set<ProductsRating> response = null;
		response = service.loadProductsRatings();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductsRatings
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsRatingByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsRatingByPrimaryKey 
		Integer productRatingId_2 = 0;
		ProductsRating response = null;
		response = service.findProductsRatingByPrimaryKey(productRatingId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsRatingByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void deleteProductsRatingProductsFeedbacks() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsRatingProductsFeedbacks 
		Integer productsrating_productRatingId_2 = 0;
		Integer related_productsfeedbacks_feedbackId = 0;
		ProductsRating response = null;
		response = service.deleteProductsRatingProductsFeedbacks(productsrating_productRatingId_2, related_productsfeedbacks_feedbackId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsRatingProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProductsRatingProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsRatingProducts 
		Integer productRatingId_3 = 0;
		Products related_products = new main.app.domain.Products();
		ProductsRating response = null;
		response = service.saveProductsRatingProducts(productRatingId_3, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsRatingProducts
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
