package main.app.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>ProductImagesController</code> controller.
 *
 * @see main.app.web.ProductImagesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductImagesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductImagesProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductImagesProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductImagesProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductImagesCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductImagesCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductImagesCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productimagesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductimagesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productimagesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductImagesController controller = (ProductImagesController) context.getBean("ProductImagesController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}