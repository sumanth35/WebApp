package main.app.service;

import java.util.List;
import java.util.Set;

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
public class ProductsFeedbackServiceTest {

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
	protected ProductsFeedbackService service;

	/**
	 * Instantiates a new ProductsFeedbackServiceTest.
	 *
	 */
	public ProductsFeedbackServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Test
	public void deleteProductsFeedbackProductsRating() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsFeedbackProductsRating 
		Integer productsfeedback_feedbackId = 0;
		Integer related_productsrating_productRatingId = 0;
		ProductsFeedback response = null;
		response = service.deleteProductsFeedbackProductsRating(productsfeedback_feedbackId, related_productsrating_productRatingId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsFeedbackProductsRating
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProductsFeedbackProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsFeedbackProducts 
		Integer feedbackId = 0;
		Products related_products = new main.app.domain.Products();
		ProductsFeedback response = null;
		response = service.saveProductsFeedbackProducts(feedbackId, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsFeedbackProducts
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsFeedbackByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsFeedbackByPrimaryKey 
		Integer feedbackId_1 = 0;
		ProductsFeedback response = null;
		response = service.findProductsFeedbackByPrimaryKey(feedbackId_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsFeedbackByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductsFeedback entity
	 * 
	 */
	@Test
	public void countProductsFeedbacks() {
		Integer response = null;
		response = service.countProductsFeedbacks();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Return all ProductsFeedback entity
	 * 
	 */
	@Test
	public void findAllProductsFeedbacks() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductsFeedbacks 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductsFeedback> response = null;
		response = service.findAllProductsFeedbacks(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void deleteProductsFeedback() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsFeedback 
		ProductsFeedback productsfeedback = new main.app.domain.ProductsFeedback();
		service.deleteProductsFeedback(productsfeedback);
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Test
	public void saveProductsFeedbackProductsRating() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsFeedbackProductsRating 
		Integer feedbackId_2 = 0;
		ProductsRating related_productsrating = new main.app.domain.ProductsRating();
		ProductsFeedback response = null;
		response = service.saveProductsFeedbackProductsRating(feedbackId_2, related_productsrating);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsFeedbackProductsRating
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void loadProductsFeedbacks() {
		Set<ProductsFeedback> response = null;
		response = service.loadProductsFeedbacks();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProductsFeedbackProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsFeedbackProducts 
		Integer productsfeedback_feedbackId_1 = 0;
		Integer related_products_productId = 0;
		ProductsFeedback response = null;
		response = service.deleteProductsFeedbackProducts(productsfeedback_feedbackId_1, related_products_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsFeedbackProducts
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void saveProductsFeedback() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsFeedback 
		ProductsFeedback productsfeedback_1 = new main.app.domain.ProductsFeedback();
		service.saveProductsFeedback(productsfeedback_1);
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
