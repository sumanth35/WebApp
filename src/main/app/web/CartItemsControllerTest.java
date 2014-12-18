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
 * Unit test for the <code>CartItemsController</code> controller.
 *
 * @see main.app.web.CartItemsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/WebApp-security-context.xml",
		"file:./resources/WebApp-service-context.xml",
		"file:./resources/WebApp-dao-context.xml",
		"file:./resources/WebApp-web-context.xml" })
public class CartItemsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsProductImages()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsProductImages() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsProductImages");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsCustomerProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsCustomerProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsCustomerProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsVendorLocations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsVendorLocations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsVendorLocations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsProductsDescription()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsProductsDescription() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsProductsDescription");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCartItemsOrderedItemses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCartItemsOrderedItemses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCartItemsOrderedItemses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCartItems()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCartItems() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCartItems");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>cartitemsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcartitemsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/cartitemsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CartItemsController controller = (CartItemsController) context.getBean("CartItemsController");

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