package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.CustomerProfile;
import main.app.domain.OrderedItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;
import main.app.domain.VendorLocations;

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
public class CartItemsServiceTest {

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
	protected CartItemsService service;

	/**
	 * Instantiates a new CartItemsServiceTest.
	 *
	 */
	public CartItemsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void saveCartItemsCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsCustomerProfile 
		Integer cartItemId = 0;
		CustomerProfile related_customerprofile = new main.app.domain.CustomerProfile();
		CartItems response = null;
		response = service.saveCartItemsCustomerProfile(cartItemId, related_customerprofile);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsCustomerProfile
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CartItems entity
	 * 
	 */
	@Test
	public void deleteCartItems() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItems 
		CartItems cartitems = new main.app.domain.CartItems();
		service.deleteCartItems(cartitems);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Test
	public void deleteCartItemsVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsVendorLocations 
		Integer cartitems_cartItemId = 0;
		Integer related_vendorlocations_locationId = 0;
		CartItems response = null;
		response = service.deleteCartItemsVendorLocations(cartitems_cartItemId, related_vendorlocations_locationId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsVendorLocations
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Test
	public void deleteCartItemsOrderedItemses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsOrderedItemses 
		Integer cartitems_cartItemId_1 = 0;
		Integer related_ordereditemses_orderItemId = 0;
		CartItems response = null;
		response = service.deleteCartItemsOrderedItemses(cartitems_cartItemId_1, related_ordereditemses_orderItemId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsOrderedItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Test
	public void saveCartItemsOrderedItemses() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsOrderedItemses 
		Integer cartItemId_1 = 0;
		OrderedItems related_ordereditemses = new main.app.domain.OrderedItems();
		CartItems response = null;
		response = service.saveCartItemsOrderedItemses(cartItemId_1, related_ordereditemses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsOrderedItemses
	}

	/**
	 * Operation Unit Test
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Test
	public void saveCartItemsVendorLocations() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsVendorLocations 
		Integer cartItemId_2 = 0;
		VendorLocations related_vendorlocations = new main.app.domain.VendorLocations();
		CartItems response = null;
		response = service.saveCartItemsVendorLocations(cartItemId_2, related_vendorlocations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsVendorLocations
	}

	/**
	 * Operation Unit Test
	 * Return all CartItems entity
	 * 
	 */
	@Test
	public void findAllCartItemss() {
		// TODO: JUnit - Populate test inputs for operation: findAllCartItemss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<CartItems> response = null;
		response = service.findAllCartItemss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCartItemss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void saveCartItemsProductsDescription() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsProductsDescription 
		Integer cartItemId_3 = 0;
		ProductsDescription related_productsdescription = new main.app.domain.ProductsDescription();
		CartItems response = null;
		response = service.saveCartItemsProductsDescription(cartItemId_3, related_productsdescription);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsProductsDescription
	}

	/**
	 * Operation Unit Test
	 * Return a count of all CartItems entity
	 * 
	 */
	@Test
	public void countCartItemss() {
		Integer response = null;
		response = service.countCartItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: countCartItemss
	}

	/**
	 * Operation Unit Test
	 * Save an existing ProductImages entity
	 * 
	 */
	@Test
	public void saveCartItemsProductImages() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsProductImages 
		Integer cartItemId_4 = 0;
		ProductImages related_productimages = new main.app.domain.ProductImages();
		CartItems response = null;
		response = service.saveCartItemsProductImages(cartItemId_4, related_productimages);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsProductImages
	}

	/**
	 * Operation Unit Test
	 * Save an existing Products entity
	 * 
	 */
	@Test
	public void saveCartItemsProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItemsProducts 
		Integer cartItemId_5 = 0;
		Products related_products = new main.app.domain.Products();
		CartItems response = null;
		response = service.saveCartItemsProducts(cartItemId_5, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCartItemsProducts
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Test
	public void deleteCartItemsProductsDescription() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsProductsDescription 
		Integer cartitems_cartItemId_2 = 0;
		Integer related_productsdescription_productDescriptionId = 0;
		CartItems response = null;
		response = service.deleteCartItemsProductsDescription(cartitems_cartItemId_2, related_productsdescription_productDescriptionId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsProductsDescription
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCartItemsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCartItemsByPrimaryKey 
		Integer cartItemId_6 = 0;
		CartItems response = null;
		response = service.findCartItemsByPrimaryKey(cartItemId_6);
		// TODO: JUnit - Add assertions to test outputs of operation: findCartItemsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Products entity
	 * 
	 */
	@Test
	public void deleteCartItemsProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsProducts 
		Integer cartitems_cartItemId_3 = 0;
		Integer related_products_productId = 0;
		CartItems response = null;
		response = service.deleteCartItemsProducts(cartitems_cartItemId_3, related_products_productId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsProducts
	}

	/**
	 * Operation Unit Test
	 * Load an existing CartItems entity
	 * 
	 */
	@Test
	public void loadCartItemss() {
		Set<CartItems> response = null;
		response = service.loadCartItemss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCartItemss
	}

	/**
	 * Operation Unit Test
	 * Save an existing CartItems entity
	 * 
	 */
	@Test
	public void saveCartItems() {
		// TODO: JUnit - Populate test inputs for operation: saveCartItems 
		CartItems cartitems_1 = new main.app.domain.CartItems();
		service.saveCartItems(cartitems_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Test
	public void deleteCartItemsProductImages() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsProductImages 
		Integer cartitems_cartItemId_4 = 0;
		Integer related_productimages_productImageId = 0;
		CartItems response = null;
		response = service.deleteCartItemsProductImages(cartitems_cartItemId_4, related_productimages_productImageId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsProductImages
	}

	/**
	 * Operation Unit Test
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Test
	public void deleteCartItemsCustomerProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteCartItemsCustomerProfile 
		Integer cartitems_cartItemId_5 = 0;
		Integer related_customerprofile_customerId = 0;
		CartItems response = null;
		response = service.deleteCartItemsCustomerProfile(cartitems_cartItemId_5, related_customerprofile_customerId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCartItemsCustomerProfile
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
