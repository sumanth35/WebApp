package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsCategory;
import main.app.domain.ProductsDescription;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;
import main.app.domain.VendorLocations;
import main.app.domain.VendorProfile;

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
public class ProductsServiceTest {

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
	protected ProductsService service;

	/**
	 * Instantiates a new ProductsServiceTest.
	 *
	 */
	public ProductsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteProductsVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsVendorLocations 
		Integer products_productId = 0;
		Integer related_vendorlocations_locationId = 0;
		Products response = null;
		response = service.deleteProductsVendorLocations(products_productId, related_vendorlocations_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsVendorLocations
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveProductsVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsVendorLocations 
		Integer productId = 0;
		VendorLocations related_vendorlocations = new main.app.domain.VendorLocations();
		Products response = null;
		response = service.saveProductsVendorLocations(productId, related_vendorlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsVendorLocations
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Products entity
	 * 
	 */
	@Test
	public void countProductss() {
		Integer response = null;
		response = service.countProductss();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Test
	public void saveProductsProductsRatings() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsProductsRatings 
		Integer productId_1 = 0;
		ProductsRating related_productsratings = new main.app.domain.ProductsRating();
		Products response = null;
		response = service.saveProductsProductsRatings(productId_1, related_productsratings);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Load an existing Products entity
	 * 
	 */
	@Test
	public void loadProductss() {
		Set<Products> response = null;
		response = service.loadProductss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void saveProductsProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsProductsCategory 
		Integer productId_2 = 0;
		ProductsCategory related_productscategory = new main.app.domain.ProductsCategory();
		Products response = null;
		response = service.saveProductsProductsCategory(productId_2, related_productscategory);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsProductsCategory
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void saveProductsProductsDescriptions() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsProductsDescriptions 
		Integer productId_3 = 0;
		ProductsDescription related_productsdescriptions = new main.app.domain.ProductsDescription();
		Products response = null;
		response = service.saveProductsProductsDescriptions(productId_3, related_productsdescriptions);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsProductsDescriptions
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Test
	public void saveProductsVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsVendorProfile 
		Integer productId_4 = 0;
		VendorProfile related_vendorprofile = new main.app.domain.VendorProfile();
		Products response = null;
		response = service.saveProductsVendorProfile(productId_4, related_vendorprofile);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsVendorProfile
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductImages entity
	 * 
	 */
	@Test
	public void saveProductsProductImageses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsProductImageses 
		Integer productId_5 = 0;
		ProductImages related_productimageses = new main.app.domain.ProductImages();
		Products response = null;
		response = service.saveProductsProductImageses(productId_5, related_productimageses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsProductImageses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteProductsCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsCartItemses 
		Integer products_productId_1 = 0;
		Integer related_cartitemses_cartItemId = 0;
		Products response = null;
		response = service.deleteProductsCartItemses(products_productId_1, related_cartitemses_cartItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsCartItemses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Test
	public void deleteProductsProductImageses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsProductImageses 
		Integer products_productId_2 = 0;
		Integer related_productimageses_productImageId = 0;
		Products response = null;
		response = service.deleteProductsProductImageses(products_productId_2, related_productimageses_productImageId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsProductImageses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Test
	public void deleteProductsProductsRatings() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsProductsRatings 
		Integer products_productId_3 = 0;
		Integer related_productsratings_productRatingId = 0;
		Products response = null;
		response = service.deleteProductsProductsRatings(products_productId_3, related_productsratings_productRatingId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsProductsRatings
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProducts 
		Products products = new main.app.domain.Products();
		service.saveProducts(products);
	}

	/**
	 * Operation Unit Test
	 * Return all Products entity
	 * 
	 */
	@Test
	public void findAllProductss() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Products> response = null;
		response = service.findAllProductss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void saveProductsProductsFeedbacks() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsProductsFeedbacks 
		Integer productId_6 = 0;
		ProductsFeedback related_productsfeedbacks = new main.app.domain.ProductsFeedback();
		Products response = null;
		response = service.saveProductsProductsFeedbacks(productId_6, related_productsfeedbacks);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void deleteProductsProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsProductsCategory 
		Integer products_productId_4 = 0;
		Integer related_productscategory_categoryId = 0;
		Products response = null;
		response = service.deleteProductsProductsCategory(products_productId_4, related_productscategory_categoryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsProductsCategory
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Test
	public void deleteProductsProductsFeedbacks() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsProductsFeedbacks 
		Integer products_productId_5 = 0;
		Integer related_productsfeedbacks_feedbackId = 0;
		Products response = null;
		response = service.deleteProductsProductsFeedbacks(products_productId_5, related_productsfeedbacks_feedbackId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsProductsFeedbacks
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void deleteProductsProductsDescriptions() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsProductsDescriptions 
		Integer products_productId_6 = 0;
		Integer related_productsdescriptions_productDescriptionId = 0;
		Products response = null;
		response = service.deleteProductsProductsDescriptions(products_productId_6, related_productsdescriptions_productDescriptionId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsProductsDescriptions
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveProductsCartItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsCartItemses 
		Integer productId_7 = 0;
		CartItems related_cartitemses = new main.app.domain.CartItems();
		Products response = null;
		response = service.saveProductsCartItemses(productId_7, related_cartitemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsCartItemses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProducts 
		Products products_1 = new main.app.domain.Products();
		service.deleteProducts(products_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsByPrimaryKey 
		Integer productId_8 = 0;
		Products response = null;
		response = service.findProductsByPrimaryKey(productId_8);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Test
	public void deleteProductsVendorProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsVendorProfile 
		Integer products_productId_7 = 0;
		Integer related_vendorprofile_registrationId = 0;
		Products response = null;
		response = service.deleteProductsVendorProfile(products_productId_7, related_vendorprofile_registrationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsVendorProfile
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
