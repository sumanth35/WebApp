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
 * Unit test for the <code>ProductsDescriptionController</code> controller.
 *
 * @see main.app.web.ProductsDescriptionController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsDescriptionControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsDescriptionProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsDescriptionProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsDescriptionProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsDescriptionCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsDescriptionCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsDescriptionCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productsdescriptionControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductsdescriptionControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productsdescriptionController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsDescriptionController controller = (ProductsDescriptionController) context.getBean("ProductsDescriptionController");

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