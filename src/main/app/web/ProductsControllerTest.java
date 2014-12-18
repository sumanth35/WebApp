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
 * Unit test for the <code>ProductsController</code> controller.
 *
 * @see main.app.web.ProductsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class ProductsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsVendorProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsVendorProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsVendorProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsProductsCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsProductsCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsProductsCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsProductsFeedbacks()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsProductsFeedbacks() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsProductsFeedbacks");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsProductsRatings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsProductsRatings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsProductsRatings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsProductsDescriptions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsProductsDescriptions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsProductsDescriptions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsProductImageses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsProductImageses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsProductImageses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductsCartItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductsCartItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductsCartItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductsController controller = (ProductsController) context.getBean("ProductsController");

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