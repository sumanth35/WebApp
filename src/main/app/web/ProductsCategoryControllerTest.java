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
 * Unit test for the <code>ProductsCategoryController</code> controller.
 *
 * @see main.app.web.ProductsCategoryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsCategoryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsCategoryProductsBrands()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsCategoryProductsBrands() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsCategoryProductsBrands");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsCategoryProductses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsCategoryProductses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsCategoryProductses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productscategoryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductscategoryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productscategoryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsCategoryController controller = (ProductsCategoryController) context.getBean("ProductsCategoryController");

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