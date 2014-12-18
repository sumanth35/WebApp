package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.ProductsDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;

import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

import main.app.service.ProductsFeedbackService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductsFeedback entities
 * 
 */

@Controller("ProductsFeedbackController")
public class ProductsFeedbackController {

	/**
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

	/**
	 * DAO injected by Spring that manages ProductsFeedback entities
	 * 
	 */
	@Autowired
	private ProductsFeedbackDAO productsFeedbackDAO;

	/**
	 * DAO injected by Spring that manages ProductsRating entities
	 * 
	 */
	@Autowired
	private ProductsRatingDAO productsRatingDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ProductsFeedback entities
	 * 
	 */
	@Autowired
	private ProductsFeedbackService productsFeedbackService;

	/**
	 */
	@RequestMapping("/productsfeedbackController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	 * Save an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/saveProductsFeedbackProductsRating")
	public ModelAndView saveProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId, @ModelAttribute ProductsRating productsrating) {
		ProductsFeedback parent_productsfeedback = productsFeedbackService.saveProductsFeedbackProductsRating(productsfeedback_feedbackId, productsrating);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsfeedback", parent_productsfeedback);
		mav.setViewName("productsfeedback/viewProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/deleteProductsFeedback")
	public String deleteProductsFeedback(@RequestParam Integer feedbackIdKey) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey);
		productsFeedbackService.deleteProductsFeedback(productsfeedback);
		return "forward:/indexProductsFeedback";
	}

	/**
	 * View an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/selectProductsFeedbackProductsRating")
	public ModelAndView selectProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer productsrating_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("productsfeedback/productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by ProductsFeedback
	 * 
	 */
	@RequestMapping("/listProductsFeedbackProducts")
	public ModelAndView listProductsFeedbackProducts(@RequestParam Integer feedbackIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey));
		mav.setViewName("productsfeedback/products/listProducts.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsRating entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsFeedbackProductsRating")
	public ModelAndView confirmDeleteProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer related_productsrating_productRatingId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(related_productsrating_productRatingId));
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.setViewName("productsfeedback/productsrating/deleteProductsRating.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/editProductsFeedbackProductsRating")
	public ModelAndView editProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer productsrating_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("productsfeedback/productsrating/editProductsRating.jsp");

		return mav;
	}

	/**
	 * Select the ProductsFeedback entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsFeedback")
	public ModelAndView confirmDeleteProductsFeedback(@RequestParam Integer feedbackIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey));
		mav.setViewName("productsfeedback/deleteProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProductsFeedbackProducts")
	public ModelAndView saveProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId, @ModelAttribute Products products) {
		ProductsFeedback parent_productsfeedback = productsFeedbackService.saveProductsFeedbackProducts(productsfeedback_feedbackId, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsfeedback", parent_productsfeedback);
		mav.setViewName("productsfeedback/viewProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProductsFeedbackProducts")
	public ModelAndView newProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("productsfeedback/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProductsFeedbackProducts")
	public ModelAndView deleteProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		ProductsFeedback productsfeedback = productsFeedbackService.deleteProductsFeedbackProducts(productsfeedback_feedbackId, related_products_productId);

		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("productsfeedback/viewProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/deleteProductsFeedbackProductsRating")
	public ModelAndView deleteProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer related_productsrating_productRatingId) {
		ModelAndView mav = new ModelAndView();

		ProductsFeedback productsfeedback = productsFeedbackService.deleteProductsFeedbackProductsRating(productsfeedback_feedbackId, related_productsrating_productRatingId);

		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("productsfeedback/viewProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsRating entity
	 * 
	 */
	@RequestMapping("/newProductsFeedbackProductsRating")
	public ModelAndView newProductsFeedbackProductsRating(@RequestParam Integer productsfeedback_feedbackId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("productsrating", new ProductsRating());
		mav.addObject("newFlag", true);
		mav.setViewName("productsfeedback/productsrating/editProductsRating.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/newProductsFeedback")
	public ModelAndView newProductsFeedback() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", new ProductsFeedback());
		mav.addObject("newFlag", true);
		mav.setViewName("productsfeedback/editProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Show all ProductsFeedback entities
	 * 
	 */
	@RequestMapping("/indexProductsFeedback")
	public ModelAndView listProductsFeedbacks() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedbacks", productsFeedbackService.loadProductsFeedbacks());

		mav.setViewName("productsfeedback/listProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/selectProductsFeedback")
	public ModelAndView selectProductsFeedback(@RequestParam Integer feedbackIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey));
		mav.setViewName("productsfeedback/viewProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Show all ProductsRating entities by ProductsFeedback
	 * 
	 */
	@RequestMapping("/listProductsFeedbackProductsRating")
	public ModelAndView listProductsFeedbackProductsRating(@RequestParam Integer feedbackIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey));
		mav.setViewName("productsfeedback/productsrating/listProductsRating.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/editProductsFeedback")
	public ModelAndView editProductsFeedback(@RequestParam Integer feedbackIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackIdKey));
		mav.setViewName("productsfeedback/editProductsFeedback.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProductsFeedbackProducts")
	public ModelAndView editProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("products", products);
		mav.setViewName("productsfeedback/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductsFeedback entities
	 * 
	 */
	public String indexProductsFeedback() {
		return "redirect:/indexProductsFeedback";
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsFeedbackProducts")
	public ModelAndView confirmDeleteProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_products_productId));
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.setViewName("productsfeedback/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/saveProductsFeedback")
	public String saveProductsFeedback(@ModelAttribute ProductsFeedback productsfeedback) {
		productsFeedbackService.saveProductsFeedback(productsfeedback);
		return "forward:/indexProductsFeedback";
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProductsFeedbackProducts")
	public ModelAndView selectProductsFeedbackProducts(@RequestParam Integer productsfeedback_feedbackId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsfeedback_feedbackId", productsfeedback_feedbackId);
		mav.addObject("products", products);
		mav.setViewName("productsfeedback/products/viewProducts.jsp");

		return mav;
	}
}