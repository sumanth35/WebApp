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
 * Unit test for the <code>ProductsFeedbackController</code> controller.
 *
 * @see main.app.web.ProductsFeedbackController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsFeedbackControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsFeedbackProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsFeedbackProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsFeedbackProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsFeedbackProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsFeedbackProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsFeedbackProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsFeedback()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsFeedback() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsFeedback");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productsfeedbackControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductsfeedbackControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productsfeedbackController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsFeedbackController controller = (ProductsFeedbackController) context.getBean("ProductsFeedbackController");

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