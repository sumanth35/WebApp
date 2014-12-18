package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.CustomerProfileDAO;
import main.app.dao.OrderedItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;
import main.app.dao.VendorLocationsDAO;

import main.app.domain.CartItems;
import main.app.domain.CustomerProfile;
import main.app.domain.OrderedItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;
import main.app.domain.VendorLocations;

import main.app.service.CartItemsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for CartItems entities
 * 
 */

@Controller("CartItemsController")
public class CartItemsController {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

	/**
	 * DAO injected by Spring that manages OrderedItems entities
	 * 
	 */
	@Autowired
	private OrderedItemsDAO orderedItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductImages entities
	 * 
	 */
	@Autowired
	private ProductImagesDAO productImagesDAO;

	/**
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

	/**
	 * DAO injected by Spring that manages ProductsDescription entities
	 * 
	 */
	@Autowired
	private ProductsDescriptionDAO productsDescriptionDAO;

	/**
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsService cartItemsService;

	/**
	 * Create a new ProductImages entity
	 * 
	 */
	@RequestMapping("/newCartItemsProductImages")
	public ModelAndView newCartItemsProductImages(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productimages", new ProductImages());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/productimages/editProductImages.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectCartItemsCustomerProfile")
	public ModelAndView selectCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer customerprofile_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("cartitems/customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectCartItemsVendorLocations")
	public ModelAndView selectCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer vendorlocations_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("cartitems/vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/saveCartItemsProductImages")
	public ModelAndView saveCartItemsProductImages(@RequestParam Integer cartitems_cartItemId, @ModelAttribute ProductImages productimages) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsProductImages(cartitems_cartItemId, productimages);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsProducts")
	public ModelAndView deleteCartItemsProducts(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsProducts(cartitems_cartItemId, related_products_productId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsDescription entity
	 * 
	 */
	@RequestMapping("/newCartItemsProductsDescription")
	public ModelAndView newCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productsdescription", new ProductsDescription());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/productsdescription/editProductsDescription.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsDescription entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsProductsDescription")
	public ModelAndView confirmDeleteCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_productsdescription_productDescriptionId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescription_productDescriptionId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/productsdescription/deleteProductsDescription.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveCartItems")
	public String saveCartItems(@ModelAttribute CartItems cartitems) {
		cartItemsService.saveCartItems(cartitems);
		return "forward:/indexCartItems";
	}

	/**
	 * Select the child ProductImages entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsProductImages")
	public ModelAndView confirmDeleteCartItemsProductImages(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_productimages_productImageId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(related_productimages_productImageId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/productimages/deleteProductImages.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/cartitemsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newCartItems")
	public ModelAndView newCartItems() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/editCartItems.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsCustomerProfile")
	public ModelAndView confirmDeleteCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile_customerId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/customerprofile/deleteCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteCartItems")
	public String deleteCartItems(@RequestParam Integer cartItemIdKey) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey);
		cartItemsService.deleteCartItems(cartitems);
		return "forward:/indexCartItems";
	}

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsProductImages")
	public ModelAndView deleteCartItemsProductImages(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_productimages_productImageId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsProductImages(cartitems_cartItemId, related_productimages_productImageId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Show all OrderedItems entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsOrderedItemses")
	public ModelAndView listCartItemsOrderedItemses(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/ordereditemses/listOrderedItemses.jsp");

		return mav;
	}

	/**
	 * View an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/selectCartItemsOrderedItemses")
	public ModelAndView selectCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer ordereditemses_orderItemId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditemses_orderItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("cartitems/ordereditemses/viewOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsVendorLocations")
	public ModelAndView confirmDeleteCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations_locationId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/vendorlocations/deleteVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveCartItemsVendorLocations")
	public ModelAndView saveCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId, @ModelAttribute VendorLocations vendorlocations) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsVendorLocations(cartitems_cartItemId, vendorlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Select an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectCartItems")
	public ModelAndView selectCartItems(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsCustomerProfile")
	public ModelAndView deleteCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsCustomerProfile(cartitems_cartItemId, related_customerprofile_customerId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveCartItemsCustomerProfile")
	public ModelAndView saveCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId, @ModelAttribute CustomerProfile customerprofile) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsCustomerProfile(cartitems_cartItemId, customerprofile);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveCartItemsProducts")
	public ModelAndView saveCartItemsProducts(@RequestParam Integer cartitems_cartItemId, @ModelAttribute Products products) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsProducts(cartitems_cartItemId, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newCartItemsCustomerProfile")
	public ModelAndView newCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/customerprofile/editCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsProductsDescription")
	public ModelAndView deleteCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_productsdescription_productDescriptionId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsProductsDescription(cartitems_cartItemId, related_productsdescription_productDescriptionId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/selectCartItemsProductsDescription")
	public ModelAndView selectCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer productsdescription_productDescriptionId) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescription_productDescriptionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("cartitems/productsdescription/viewProductsDescription.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editCartItems")
	public ModelAndView editCartItems(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/editCartItems.jsp");

		return mav;
	}

	/**
	 * Select the CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItems")
	public ModelAndView confirmDeleteCartItems(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/deleteCartItems.jsp");

		return mav;
	}

	/**
	 * Create a new OrderedItems entity
	 * 
	 */
	@RequestMapping("/newCartItemsOrderedItemses")
	public ModelAndView newCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("ordereditems", new OrderedItems());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/ordereditemses/editOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsVendorLocations")
	public ModelAndView listCartItemsVendorLocations(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/vendorlocations/listVendorLocations.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsOrderedItemses")
	public ModelAndView deleteCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_ordereditemses_orderItemId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsOrderedItemses(cartitems_cartItemId, related_ordereditemses_orderItemId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/saveCartItemsProductsDescription")
	public ModelAndView saveCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId, @ModelAttribute ProductsDescription productsdescription) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsProductsDescription(cartitems_cartItemId, productsdescription);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newCartItemsVendorLocations")
	public ModelAndView newCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * Entry point to show all CartItems entities
	 * 
	 */
	public String indexCartItems() {
		return "redirect:/indexCartItems";
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newCartItemsProducts")
	public ModelAndView newCartItemsProducts(@RequestParam Integer cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("cartitems/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Show all ProductsDescription entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsProductsDescription")
	public ModelAndView listCartItemsProductsDescription(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/productsdescription/listProductsDescription.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsCustomerProfile")
	public ModelAndView listCartItemsCustomerProfile(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/customerprofile/listCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectCartItemsProducts")
	public ModelAndView selectCartItemsProducts(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("products", products);
		mav.setViewName("cartitems/products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteCartItemsVendorLocations")
	public ModelAndView deleteCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();

		CartItems cartitems = cartItemsService.deleteCartItemsVendorLocations(cartitems_cartItemId, related_vendorlocations_locationId);

		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/editCartItemsProductsDescription")
	public ModelAndView editCartItemsProductsDescription(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer productsdescription_productDescriptionId) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescription_productDescriptionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("cartitems/productsdescription/editProductsDescription.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Edit an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/editCartItemsOrderedItemses")
	public ModelAndView editCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer ordereditemses_orderItemId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditemses_orderItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("cartitems/ordereditemses/editOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/saveCartItemsOrderedItemses")
	public ModelAndView saveCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId, @ModelAttribute OrderedItems ordereditemses) {
		CartItems parent_cartitems = cartItemsService.saveCartItemsOrderedItemses(cartitems_cartItemId, ordereditemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("cartitems", parent_cartitems);
		mav.setViewName("cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsProducts")
	public ModelAndView confirmDeleteCartItemsProducts(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_products_productId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities
	 * 
	 */
	@RequestMapping("/indexCartItems")
	public ModelAndView listCartItemss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitemss", cartItemsService.loadCartItemss());

		mav.setViewName("cartitems/listCartItemss.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/editCartItemsProductImages")
	public ModelAndView editCartItemsProductImages(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer productimages_productImageId) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimages_productImageId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productimages", productimages);
		mav.setViewName("cartitems/productimages/editProductImages.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editCartItemsProducts")
	public ModelAndView editCartItemsProducts(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("products", products);
		mav.setViewName("cartitems/products/editProducts.jsp");

		return mav;
	}

	/**
	 * View an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/selectCartItemsProductImages")
	public ModelAndView selectCartItemsProductImages(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer productimages_productImageId) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimages_productImageId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("productimages", productimages);
		mav.setViewName("cartitems/productimages/viewProductImages.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsProducts")
	public ModelAndView listCartItemsProducts(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/products/listProducts.jsp");

		return mav;
	}

	/**
	 * Select the child OrderedItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCartItemsOrderedItemses")
	public ModelAndView confirmDeleteCartItemsOrderedItemses(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer related_ordereditemses_orderItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses_orderItemId));
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.setViewName("cartitems/ordereditemses/deleteOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Show all ProductImages entities by CartItems
	 * 
	 */
	@RequestMapping("/listCartItemsProductImages")
	public ModelAndView listCartItemsProductImages(@RequestParam Integer cartItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(cartItemIdKey));
		mav.setViewName("cartitems/productimages/listProductImages.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editCartItemsVendorLocations")
	public ModelAndView editCartItemsVendorLocations(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer vendorlocations_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("cartitems/vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editCartItemsCustomerProfile")
	public ModelAndView editCartItemsCustomerProfile(@RequestParam Integer cartitems_cartItemId, @RequestParam Integer customerprofile_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("cartitems_cartItemId", cartitems_cartItemId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("cartitems/customerprofile/editCustomerProfile.jsp");

		return mav;
	}
}