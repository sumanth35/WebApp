package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsDAO;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;

import main.app.service.ProductImagesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductImages entities
 * 
 */

@Controller("ProductImagesController")
public class ProductImagesController {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * Service injected by Spring that provides CRUD operations for ProductImages entities
	 * 
	 */
	@Autowired
	private ProductImagesService productImagesService;

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/deleteProductImages")
	public String deleteProductImages(@RequestParam Integer productImageIdKey) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey);
		productImagesService.deleteProductImages(productimages);
		return "forward:/indexProductImages";
	}

	/**
	 * Select the ProductImages entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductImages")
	public ModelAndView confirmDeleteProductImages(@RequestParam Integer productImageIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey));
		mav.setViewName("productimages/deleteProductImages.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/saveProductImages")
	public String saveProductImages(@ModelAttribute ProductImages productimages) {
		productImagesService.saveProductImages(productimages);
		return "forward:/indexProductImages";
	}

	/**
	 */
	@RequestMapping("/productimagesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveProductImagesCartItemses")
	public ModelAndView saveProductImagesCartItemses(@RequestParam Integer productimages_productImageId, @ModelAttribute CartItems cartitemses) {
		ProductImages parent_productimages = productImagesService.saveProductImagesCartItemses(productimages_productImageId, cartitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("productimages", parent_productimages);
		mav.setViewName("productimages/viewProductImages.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/selectProductImages")
	public ModelAndView selectProductImages(@RequestParam Integer productImageIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey));
		mav.setViewName("productimages/viewProductImages.jsp");

		return mav;
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductImagesProducts")
	public ModelAndView confirmDeleteProductImagesProducts(@RequestParam Integer productimages_productImageId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_products_productId));
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.setViewName("productimages/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteProductImagesCartItemses")
	public ModelAndView deleteProductImagesCartItemses(@RequestParam Integer productimages_productImageId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		ProductImages productimages = productImagesService.deleteProductImagesCartItemses(productimages_productImageId, related_cartitemses_cartItemId);

		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("productimages", productimages);
		mav.setViewName("productimages/viewProductImages.jsp");

		return mav;
	}

	/**
	 * Create a new ProductImages entity
	 * 
	 */
	@RequestMapping("/newProductImages")
	public ModelAndView newProductImages() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", new ProductImages());
		mav.addObject("newFlag", true);
		mav.setViewName("productimages/editProductImages.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by ProductImages
	 * 
	 */
	@RequestMapping("/listProductImagesProducts")
	public ModelAndView listProductImagesProducts(@RequestParam Integer productImageIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey));
		mav.setViewName("productimages/products/listProducts.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProductImagesProducts")
	public ModelAndView selectProductImagesProducts(@RequestParam Integer productimages_productImageId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("products", products);
		mav.setViewName("productimages/products/viewProducts.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectProductImagesCartItemses")
	public ModelAndView selectProductImagesCartItemses(@RequestParam Integer productimages_productImageId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("productimages/cartitemses/viewCartItemses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProductImagesProducts")
	public ModelAndView editProductImagesProducts(@RequestParam Integer productimages_productImageId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("products", products);
		mav.setViewName("productimages/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProductImagesProducts")
	public ModelAndView deleteProductImagesProducts(@RequestParam Integer productimages_productImageId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		ProductImages productimages = productImagesService.deleteProductImagesProducts(productimages_productImageId, related_products_productId);

		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("productimages", productimages);
		mav.setViewName("productimages/viewProductImages.jsp");

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
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductImagesCartItemses")
	public ModelAndView confirmDeleteProductImagesCartItemses(@RequestParam Integer productimages_productImageId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId));
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.setViewName("productimages/cartitemses/deleteCartItemses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductImages entities
	 * 
	 */
	public String indexProductImages() {
		return "redirect:/indexProductImages";
	}

	/**
	 * Edit an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/editProductImages")
	public ModelAndView editProductImages(@RequestParam Integer productImageIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey));
		mav.setViewName("productimages/editProductImages.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities by ProductImages
	 * 
	 */
	@RequestMapping("/listProductImagesCartItemses")
	public ModelAndView listProductImagesCartItemses(@RequestParam Integer productImageIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(productImageIdKey));
		mav.setViewName("productimages/cartitemses/listCartItemses.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProductImagesProducts")
	public ModelAndView newProductImagesProducts(@RequestParam Integer productimages_productImageId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("productimages/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editProductImagesCartItemses")
	public ModelAndView editProductImagesCartItemses(@RequestParam Integer productimages_productImageId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("productimages/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newProductImagesCartItemses")
	public ModelAndView newProductImagesCartItemses(@RequestParam Integer productimages_productImageId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("productimages/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProductImagesProducts")
	public ModelAndView saveProductImagesProducts(@RequestParam Integer productimages_productImageId, @ModelAttribute Products products) {
		ProductImages parent_productimages = productImagesService.saveProductImagesProducts(productimages_productImageId, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productimages_productImageId", productimages_productImageId);
		mav.addObject("productimages", parent_productimages);
		mav.setViewName("productimages/viewProductImages.jsp");

		return mav;
	}

	/**
	 * Show all ProductImages entities
	 * 
	 */
	@RequestMapping("/indexProductImages")
	public ModelAndView listProductImagess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimagess", productImagesService.loadProductImagess());

		mav.setViewName("productimages/listProductImagess.jsp");

		return mav;
	}
}