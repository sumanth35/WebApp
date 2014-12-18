package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;

import main.app.domain.CartItems;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;

import main.app.service.ProductsDescriptionService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductsDescription entities
 * 
 */

@Controller("ProductsDescriptionController")
public class ProductsDescriptionController {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * Service injected by Spring that provides CRUD operations for ProductsDescription entities
	 * 
	 */
	@Autowired
	private ProductsDescriptionService productsDescriptionService;

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/deleteProductsDescription")
	public String deleteProductsDescription(@RequestParam Integer productDescriptionIdKey) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey);
		productsDescriptionService.deleteProductsDescription(productsdescription);
		return "forward:/indexProductsDescription";
	}

	/**
	 * Show all Products entities by ProductsDescription
	 * 
	 */
	@RequestMapping("/listProductsDescriptionProducts")
	public ModelAndView listProductsDescriptionProducts(@RequestParam Integer productDescriptionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey));
		mav.setViewName("productsdescription/products/listProducts.jsp");

		return mav;
	}

	/**
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsDescriptionCartItemses")
	public ModelAndView confirmDeleteProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId));
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.setViewName("productsdescription/cartitemses/deleteCartItemses.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editProductsDescriptionCartItemses")
	public ModelAndView editProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("productsdescription/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProductsDescriptionProducts")
	public ModelAndView newProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("productsdescription/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProductsDescriptionProducts")
	public ModelAndView saveProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId, @ModelAttribute Products products) {
		ProductsDescription parent_productsdescription = productsDescriptionService.saveProductsDescriptionProducts(productsdescription_productDescriptionId, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("productsdescription", parent_productsdescription);
		mav.setViewName("productsdescription/viewProductsDescription.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/saveProductsDescription")
	public String saveProductsDescription(@ModelAttribute ProductsDescription productsdescription) {
		productsDescriptionService.saveProductsDescription(productsdescription);
		return "forward:/indexProductsDescription";
	}

	/**
	 */
	@RequestMapping("/productsdescriptionController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsDescriptionProducts")
	public ModelAndView confirmDeleteProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_products_productId));
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.setViewName("productsdescription/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectProductsDescriptionCartItemses")
	public ModelAndView selectProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("productsdescription/cartitemses/viewCartItemses.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProductsDescriptionProducts")
	public ModelAndView selectProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("products", products);
		mav.setViewName("productsdescription/products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/editProductsDescription")
	public ModelAndView editProductsDescription(@RequestParam Integer productDescriptionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey));
		mav.setViewName("productsdescription/editProductsDescription.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProductsDescriptionProducts")
	public ModelAndView deleteProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		ProductsDescription productsdescription = productsDescriptionService.deleteProductsDescriptionProducts(productsdescription_productDescriptionId, related_products_productId);

		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("productsdescription/viewProductsDescription.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newProductsDescriptionCartItemses")
	public ModelAndView newProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("productsdescription/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteProductsDescriptionCartItemses")
	public ModelAndView deleteProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		ProductsDescription productsdescription = productsDescriptionService.deleteProductsDescriptionCartItemses(productsdescription_productDescriptionId, related_cartitemses_cartItemId);

		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("productsdescription/viewProductsDescription.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductsDescription entities
	 * 
	 */
	public String indexProductsDescription() {
		return "redirect:/indexProductsDescription";
	}

	/**
	 * Create a new ProductsDescription entity
	 * 
	 */
	@RequestMapping("/newProductsDescription")
	public ModelAndView newProductsDescription() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", new ProductsDescription());
		mav.addObject("newFlag", true);
		mav.setViewName("productsdescription/editProductsDescription.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities by ProductsDescription
	 * 
	 */
	@RequestMapping("/listProductsDescriptionCartItemses")
	public ModelAndView listProductsDescriptionCartItemses(@RequestParam Integer productDescriptionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey));
		mav.setViewName("productsdescription/cartitemses/listCartItemses.jsp");

		return mav;
	}

	/**
	 * Show all ProductsDescription entities
	 * 
	 */
	@RequestMapping("/indexProductsDescription")
	public ModelAndView listProductsDescriptions() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescriptions", productsDescriptionService.loadProductsDescriptions());

		mav.setViewName("productsdescription/listProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveProductsDescriptionCartItemses")
	public ModelAndView saveProductsDescriptionCartItemses(@RequestParam Integer productsdescription_productDescriptionId, @ModelAttribute CartItems cartitemses) {
		ProductsDescription parent_productsdescription = productsDescriptionService.saveProductsDescriptionCartItemses(productsdescription_productDescriptionId, cartitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("productsdescription", parent_productsdescription);
		mav.setViewName("productsdescription/viewProductsDescription.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProductsDescriptionProducts")
	public ModelAndView editProductsDescriptionProducts(@RequestParam Integer productsdescription_productDescriptionId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsdescription_productDescriptionId", productsdescription_productDescriptionId);
		mav.addObject("products", products);
		mav.setViewName("productsdescription/products/editProducts.jsp");

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
	 * Select the ProductsDescription entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsDescription")
	public ModelAndView confirmDeleteProductsDescription(@RequestParam Integer productDescriptionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey));
		mav.setViewName("productsdescription/deleteProductsDescription.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/selectProductsDescription")
	public ModelAndView selectProductsDescription(@RequestParam Integer productDescriptionIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionIdKey));
		mav.setViewName("productsdescription/viewProductsDescription.jsp");

		return mav;
	}
}