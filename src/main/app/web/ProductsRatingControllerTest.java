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
 * Unit test for the <code>ProductsRatingController</code> controller.
 *
 * @see main.app.web.ProductsRatingController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsRatingControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsRatingProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsRatingProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsRatingProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsRatingCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsRatingCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsRatingCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsRatingProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsRatingProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsRatingProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsRating()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsRating() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsRating");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productsratingControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductsratingControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productsratingController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsRatingController controller = (ProductsRatingController) context.getBean("ProductsRatingController");

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