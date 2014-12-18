package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Products;
import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

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
public class ProductsCategoryServiceTest {

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
	protected ProductsCategoryService service;

	/**
	 * Instantiates a new ProductsCategoryServiceTest.
	 *
	 */
	public ProductsCategoryServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void saveProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsCategory 
		ProductsCategory productscategory = new main.app.domain.ProductsCategory();
		service.saveProductsCategory(productscategory);
	}

	/**
	 * Operation Unit Test
	 * Return all ProductsCategory entity
	 * 
	 */
	@Test
	public void findAllProductsCategorys() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductsCategorys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductsCategory> response = null;
		response = service.findAllProductsCategorys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductsCategorys
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@Test
	public void saveProductsCategoryProductsBrands() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsCategoryProductsBrands 
		Integer categoryId = 0;
		ProductsBrand related_productsbrands = new main.app.domain.ProductsBrand();
		ProductsCategory response = null;
		response = service.saveProductsCategoryProductsBrands(categoryId, related_productsbrands);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsCategoryProductsBrands
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteProductsCategoryProductses() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsCategoryProductses 
		Integer productscategory_categoryId = 0;
		Integer related_productses_productId = 0;
		ProductsCategory response = null;
		response = service.deleteProductsCategoryProductses(productscategory_categoryId, related_productses_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsCategoryProductses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void deleteProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsCategory 
		ProductsCategory productscategory_1 = new main.app.domain.ProductsCategory();
		service.deleteProductsCategory(productscategory_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveProductsCategoryProductses() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsCategoryProductses 
		Integer categoryId_1 = 0;
		Products related_productses = new main.app.domain.Products();
		ProductsCategory response = null;
		response = service.saveProductsCategoryProductses(categoryId_1, related_productses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsCategoryProductses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductsCategory entity
	 * 
	 */
	@Test
	public void countProductsCategorys() {
		Integer response = null;
		response = service.countProductsCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductsCategorys
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsCategoryByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsCategoryByPrimaryKey 
		Integer categoryId_2 = 0;
		ProductsCategory response = null;
		response = service.findProductsCategoryByPrimaryKey(categoryId_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsCategoryByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@Test
	public void deleteProductsCategoryProductsBrands() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsCategoryProductsBrands 
		Integer productscategory_categoryId_1 = 0;
		Integer related_productsbrands_brandId = 0;
		ProductsCategory response = null;
		response = service.deleteProductsCategoryProductsBrands(productscategory_categoryId_1, related_productsbrands_brandId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsCategoryProductsBrands
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void loadProductsCategorys() {
		Set<ProductsCategory> response = null;
		response = service.loadProductsCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductsCategorys
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
