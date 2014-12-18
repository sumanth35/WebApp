package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;

import main.app.domain.CustomerProfile;
import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

import main.app.service.ProductsRatingService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductsRating entities
 * 
 */

@Controller("ProductsRatingController")
public class ProductsRatingController {

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

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
	 * Service injected by Spring that provides CRUD operations for ProductsRating entities
	 * 
	 */
	@Autowired
	private ProductsRatingService productsRatingService;

	/**
	 * Edit an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/editProductsRatingProductsFeedbacks")
	public ModelAndView editProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer productsfeedbacks_feedbackId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedbacks_feedbackId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("productsrating/productsfeedbacks/editProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/saveProductsRating")
	public String saveProductsRating(@ModelAttribute ProductsRating productsrating) {
		productsRatingService.saveProductsRating(productsrating);
		return "forward:/indexProductsRating";
	}

	/**
	 * Create a new ProductsRating entity
	 * 
	 */
	@RequestMapping("/newProductsRating")
	public ModelAndView newProductsRating() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", new ProductsRating());
		mav.addObject("newFlag", true);
		mav.setViewName("productsrating/editProductsRating.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProductsRatingProducts")
	public ModelAndView newProductsRatingProducts(@RequestParam Integer productsrating_productRatingId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("productsrating/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by ProductsRating
	 * 
	 */
	@RequestMapping("/listProductsRatingProducts")
	public ModelAndView listProductsRatingProducts(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/products/listProducts.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/selectProductsRatingProductsFeedbacks")
	public ModelAndView selectProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer productsfeedbacks_feedbackId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedbacks_feedbackId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("productsrating/productsfeedbacks/viewProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Create a new CustomerProfile entity
	 * 
	 */
	@RequestMapping("/newProductsRatingCustomerProfile")
	public ModelAndView newProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("customerprofile", new CustomerProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("productsrating/customerprofile/editCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProductsRatingProducts")
	public ModelAndView editProductsRatingProducts(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("products", products);
		mav.setViewName("productsrating/products/editProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProductsRatingProducts")
	public ModelAndView deleteProductsRatingProducts(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		ProductsRating productsrating = productsRatingService.deleteProductsRatingProducts(productsrating_productRatingId, related_products_productId);

		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/selectProductsRating")
	public ModelAndView selectProductsRating(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/viewProductsRating.jsp");

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
	 * Edit an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/editProductsRating")
	public ModelAndView editProductsRating(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/editProductsRating.jsp");

		return mav;
	}

	/**
	 * Select the child CustomerProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsRatingCustomerProfile")
	public ModelAndView confirmDeleteProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customerprofile", customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile_customerId));
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.setViewName("productsrating/customerprofile/deleteCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/selectProductsRatingCustomerProfile")
	public ModelAndView selectProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer customerprofile_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("productsrating/customerprofile/viewCustomerProfile.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsFeedback entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsRatingProductsFeedbacks")
	public ModelAndView confirmDeleteProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_productsfeedbacks_feedbackId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(related_productsfeedbacks_feedbackId));
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.setViewName("productsrating/productsfeedbacks/deleteProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/deleteProductsRating")
	public String deleteProductsRating(@RequestParam Integer productRatingIdKey) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey);
		productsRatingService.deleteProductsRating(productsrating);
		return "forward:/indexProductsRating";
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsRatingProducts")
	public ModelAndView confirmDeleteProductsRatingProducts(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_products_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_products_productId));
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.setViewName("productsrating/products/deleteProducts.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productsratingController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/newProductsRatingProductsFeedbacks")
	public ModelAndView newProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsfeedback", new ProductsFeedback());
		mav.addObject("newFlag", true);
		mav.setViewName("productsrating/productsfeedbacks/editProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Edit an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/editProductsRatingCustomerProfile")
	public ModelAndView editProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer customerprofile_customerId) {
		CustomerProfile customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(customerprofile_customerId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("customerprofile", customerprofile);
		mav.setViewName("productsrating/customerprofile/editCustomerProfile.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProductsRatingProducts")
	public ModelAndView selectProductsRatingProducts(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer products_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("products", products);
		mav.setViewName("productsrating/products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/saveProductsRatingProductsFeedbacks")
	public ModelAndView saveProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId, @ModelAttribute ProductsFeedback productsfeedbacks) {
		ProductsRating parent_productsrating = productsRatingService.saveProductsRatingProductsFeedbacks(productsrating_productRatingId, productsfeedbacks);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", parent_productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/deleteProductsRatingCustomerProfile")
	public ModelAndView deleteProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_customerprofile_customerId) {
		ModelAndView mav = new ModelAndView();

		ProductsRating productsrating = productsRatingService.deleteProductsRatingCustomerProfile(productsrating_productRatingId, related_customerprofile_customerId);

		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductsRating entities
	 * 
	 */
	public String indexProductsRating() {
		return "redirect:/indexProductsRating";
	}

	/**
	 * Show all ProductsFeedback entities by ProductsRating
	 * 
	 */
	@RequestMapping("/listProductsRatingProductsFeedbacks")
	public ModelAndView listProductsRatingProductsFeedbacks(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/productsfeedbacks/listProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@RequestMapping("/saveProductsRatingCustomerProfile")
	public ModelAndView saveProductsRatingCustomerProfile(@RequestParam Integer productsrating_productRatingId, @ModelAttribute CustomerProfile customerprofile) {
		ProductsRating parent_productsrating = productsRatingService.saveProductsRatingCustomerProfile(productsrating_productRatingId, customerprofile);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", parent_productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/deleteProductsRatingProductsFeedbacks")
	public ModelAndView deleteProductsRatingProductsFeedbacks(@RequestParam Integer productsrating_productRatingId, @RequestParam Integer related_productsfeedbacks_feedbackId) {
		ModelAndView mav = new ModelAndView();

		ProductsRating productsrating = productsRatingService.deleteProductsRatingProductsFeedbacks(productsrating_productRatingId, related_productsfeedbacks_feedbackId);

		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProductsRatingProducts")
	public ModelAndView saveProductsRatingProducts(@RequestParam Integer productsrating_productRatingId, @ModelAttribute Products products) {
		ProductsRating parent_productsrating = productsRatingService.saveProductsRatingProducts(productsrating_productRatingId, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsrating_productRatingId", productsrating_productRatingId);
		mav.addObject("productsrating", parent_productsrating);
		mav.setViewName("productsrating/viewProductsRating.jsp");

		return mav;
	}

	/**
	 * Select the ProductsRating entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsRating")
	public ModelAndView confirmDeleteProductsRating(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/deleteProductsRating.jsp");

		return mav;
	}

	/**
	 * Show all ProductsRating entities
	 * 
	 */
	@RequestMapping("/indexProductsRating")
	public ModelAndView listProductsRatings() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsratings", productsRatingService.loadProductsRatings());

		mav.setViewName("productsrating/listProductsRatings.jsp");

		return mav;
	}

	/**
	 * Show all CustomerProfile entities by ProductsRating
	 * 
	 */
	@RequestMapping("/listProductsRatingCustomerProfile")
	public ModelAndView listProductsRatingCustomerProfile(@RequestParam Integer productRatingIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(productRatingIdKey));
		mav.setViewName("productsrating/customerprofile/listCustomerProfile.jsp");

		return mav;
	}
}