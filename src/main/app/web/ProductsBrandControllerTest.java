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
 * Unit test for the <code>ProductsBrandController</code> controller.
 *
 * @see main.app.web.ProductsBrandController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsBrandControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsBrandProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsBrandProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsBrandProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsBrand()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsBrand() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsBrand");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productsbrandControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductsbrandControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productsbrandController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsBrandController controller = (ProductsBrandController) context.getBean("ProductsBrandController");

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