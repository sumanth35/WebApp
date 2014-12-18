package main.app.service;

import java.util.List;
import java.util.Set;

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
public class ProductsBrandServiceTest {

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
	protected ProductsBrandService service;

	/**
	 * Instantiates a new ProductsBrandServiceTest.
	 *
	 */
	public ProductsBrandServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@Test
	public void deleteProductsBrand() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsBrand 
		ProductsBrand productsbrand = new main.app.domain.ProductsBrand();
		service.deleteProductsBrand(productsbrand);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductsBrandByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductsBrandByPrimaryKey 
		Integer brandId = 0;
		ProductsBrand response = null;
		response = service.findProductsBrandByPrimaryKey(brandId);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductsBrandByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void saveProductsBrandProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsBrandProductsCategory 
		Integer brandId_1 = 0;
		ProductsCategory related_productscategory = new main.app.domain.ProductsCategory();
		ProductsBrand response = null;
		response = service.saveProductsBrandProductsCategory(brandId_1, related_productscategory);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductsBrandProductsCategory
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ProductsBrand entity
	 * 
	 */
	@Test
	public void countProductsBrands() {
		Integer response = null;
		response = service.countProductsBrands();
		// TODO: JUnit - Add assertions to test outputs of operation: countProductsBrands
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@Test
	public void saveProductsBrand() {
		// TODO: JUnit - Populate test inputs for operation: saveProductsBrand 
		ProductsBrand productsbrand_1 = new main.app.domain.ProductsBrand();
		service.saveProductsBrand(productsbrand_1);
	}

	/**
	 * Operation Unit Test
	 * Return all ProductsBrand entity
	 * 
	 */
	@Test
	public void findAllProductsBrands() {
		// TODO: JUnit - Populate test inputs for operation: findAllProductsBrands 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProductsBrand> response = null;
		response = service.findAllProductsBrands(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProductsBrands
	}

	/**
	 * Operation Unit Test
	 * Load an existing ProductsBrand entity
	 * 
	 */
	@Test
	public void loadProductsBrands() {
		Set<ProductsBrand> response = null;
		response = service.loadProductsBrands();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProductsBrands
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Test
	public void deleteProductsBrandProductsCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductsBrandProductsCategory 
		Integer productsbrand_brandId = 0;
		Integer related_productscategory_categoryId = 0;
		ProductsBrand response = null;
		response = service.deleteProductsBrandProductsCategory(productsbrand_brandId, related_productscategory_categoryId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductsBrandProductsCategory
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
