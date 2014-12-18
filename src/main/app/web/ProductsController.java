package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsCategoryDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsCategory;
import main.app.domain.ProductsDescription;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;
import main.app.domain.VendorLocations;
import main.app.domain.VendorProfile;

import main.app.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Products entities
 * 
 */

@Controller("ProductsController")
public class ProductsController {

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
	 * DAO injected by Spring that manages ProductsCategory entities
	 * 
	 */
	@Autowired
	private ProductsCategoryDAO productsCategoryDAO;

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
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * DAO injected by Spring that manages VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileDAO vendorProfileDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Products entities
	 * 
	 */
	@Autowired
	private ProductsService productsService;

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteProductsCartItemses")
	public ModelAndView deleteProductsCartItemses(@RequestParam Integer products_productId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsCartItemses(products_productId, related_cartitemses_cartItemId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/deleteProductsProductsDescriptions")
	public ModelAndView deleteProductsProductsDescriptions(@RequestParam Integer products_productId, @RequestParam Integer related_productsdescriptions_productDescriptionId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsProductsDescriptions(products_productId, related_productsdescriptions_productDescriptionId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/newProductsProductsFeedbacks")
	public ModelAndView newProductsProductsFeedbacks(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsfeedback", new ProductsFeedback());
		mav.addObject("newFlag", true);
		mav.setViewName("products/productsfeedbacks/editProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/editProductsVendorLocations")
	public ModelAndView editProductsVendorLocations(@RequestParam Integer products_productId, @RequestParam Integer vendorlocations_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("products/vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/saveProductsProductImageses")
	public ModelAndView saveProductsProductImageses(@RequestParam Integer products_productId, @ModelAttribute ProductImages productimageses) {
		Products parent_products = productsService.saveProductsProductImageses(products_productId, productimageses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Show all ProductsDescription entities by Products
	 * 
	 */
	@RequestMapping("/listProductsProductsDescriptions")
	public ModelAndView listProductsProductsDescriptions(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/productsdescriptions/listProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * View an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/selectProductsVendorLocations")
	public ModelAndView selectProductsVendorLocations(@RequestParam Integer products_productId, @RequestParam Integer vendorlocations_locationId) {
		VendorLocations vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(vendorlocations_locationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorlocations", vendorlocations);
		mav.setViewName("products/vendorlocations/viewVendorLocations.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProducts")
	public String saveProducts(@ModelAttribute Products products) {
		productsService.saveProducts(products);
		return "forward:/indexProducts";
	}

	/**
	 * Edit an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/editProductsProductsRatings")
	public ModelAndView editProductsProductsRatings(@RequestParam Integer products_productId, @RequestParam Integer productsratings_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsratings_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("products/productsratings/editProductsRatings.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/saveProductsProductsCategory")
	public ModelAndView saveProductsProductsCategory(@RequestParam Integer products_productId, @ModelAttribute ProductsCategory productscategory) {
		Products parent_products = productsService.saveProductsProductsCategory(products_productId, productscategory);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/deleteProductsProductsFeedbacks")
	public ModelAndView deleteProductsProductsFeedbacks(@RequestParam Integer products_productId, @RequestParam Integer related_productsfeedbacks_feedbackId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsProductsFeedbacks(products_productId, related_productsfeedbacks_feedbackId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/deleteProductsProductsRatings")
	public ModelAndView deleteProductsProductsRatings(@RequestParam Integer products_productId, @RequestParam Integer related_productsratings_productRatingId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsProductsRatings(products_productId, related_productsratings_productRatingId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/saveProductsProductsDescriptions")
	public ModelAndView saveProductsProductsDescriptions(@RequestParam Integer products_productId, @ModelAttribute ProductsDescription productsdescriptions) {
		Products parent_products = productsService.saveProductsProductsDescriptions(products_productId, productsdescriptions);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/saveProductsProductsFeedbacks")
	public ModelAndView saveProductsProductsFeedbacks(@RequestParam Integer products_productId, @ModelAttribute ProductsFeedback productsfeedbacks) {
		Products parent_products = productsService.saveProductsProductsFeedbacks(products_productId, productsfeedbacks);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsCartItemses")
	public ModelAndView confirmDeleteProductsCartItemses(@RequestParam Integer products_productId, @RequestParam Integer related_cartitemses_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/cartitemses/deleteCartItemses.jsp");

		return mav;
	}

	/**
	 * Select the Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProducts")
	public ModelAndView confirmDeleteProducts(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/deleteProducts.jsp");

		return mav;
	}

	/**
	 * View an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/selectProductsVendorProfile")
	public ModelAndView selectProductsVendorProfile(@RequestParam Integer products_productId, @RequestParam Integer vendorprofile_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("products/vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/editProductsVendorProfile")
	public ModelAndView editProductsVendorProfile(@RequestParam Integer products_productId, @RequestParam Integer vendorprofile_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("products/vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/saveProductsVendorProfile")
	public ModelAndView saveProductsVendorProfile(@RequestParam Integer products_productId, @ModelAttribute VendorProfile vendorprofile) {
		Products parent_products = productsService.saveProductsVendorProfile(products_productId, vendorprofile);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/deleteProductsVendorLocations")
	public ModelAndView deleteProductsVendorLocations(@RequestParam Integer products_productId, @RequestParam Integer related_vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsVendorLocations(products_productId, related_vendorlocations_locationId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Select an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProducts")
	public ModelAndView selectProducts(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProducts")
	public ModelAndView editProducts(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/editProducts.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocations entity
	 * 
	 */
	@RequestMapping("/newProductsVendorLocations")
	public ModelAndView newProductsVendorLocations(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorlocations", new VendorLocations());
		mav.addObject("newFlag", true);
		mav.setViewName("products/vendorlocations/editVendorLocations.jsp");

		return mav;
	}

	/**
	 * Show all ProductsFeedback entities by Products
	 * 
	 */
	@RequestMapping("/listProductsProductsFeedbacks")
	public ModelAndView listProductsProductsFeedbacks(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/productsfeedbacks/listProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsDescription entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsProductsDescriptions")
	public ModelAndView confirmDeleteProductsProductsDescriptions(@RequestParam Integer products_productId, @RequestParam Integer related_productsdescriptions_productDescriptionId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsdescription", productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescriptions_productDescriptionId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/productsdescriptions/deleteProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/selectProductsProductsRatings")
	public ModelAndView selectProductsProductsRatings(@RequestParam Integer products_productId, @RequestParam Integer productsratings_productRatingId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsratings_productRatingId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsrating", productsrating);
		mav.setViewName("products/productsratings/viewProductsRatings.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newProductsCartItemses")
	public ModelAndView newProductsCartItemses(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("products/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/selectProductsProductsCategory")
	public ModelAndView selectProductsProductsCategory(@RequestParam Integer products_productId, @RequestParam Integer productscategory_categoryId) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("products/productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 * Show all VendorLocations entities by Products
	 * 
	 */
	@RequestMapping("/listProductsVendorLocations")
	public ModelAndView listProductsVendorLocations(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/vendorlocations/listVendorLocations.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editProductsCartItemses")
	public ModelAndView editProductsCartItemses(@RequestParam Integer products_productId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("products/cartitemses/editCartItemses.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectProductsCartItemses")
	public ModelAndView selectProductsCartItemses(@RequestParam Integer products_productId, @RequestParam Integer cartitemses_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitemses_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("products/cartitemses/viewCartItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProducts")
	public String deleteProducts(@RequestParam Integer productIdKey) {
		Products products = productsDAO.findProductsByPrimaryKey(productIdKey);
		productsService.deleteProducts(products);
		return "forward:/indexProducts";
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@RequestMapping("/saveProductsVendorLocations")
	public ModelAndView saveProductsVendorLocations(@RequestParam Integer products_productId, @ModelAttribute VendorLocations vendorlocations) {
		Products parent_products = productsService.saveProductsVendorLocations(products_productId, vendorlocations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/deleteProductsVendorProfile")
	public ModelAndView deleteProductsVendorProfile(@RequestParam Integer products_productId, @RequestParam Integer related_vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsVendorProfile(products_productId, related_vendorprofile_registrationId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProducts")
	public ModelAndView newProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("products/editProducts.jsp");

		return mav;
	}

	/**
	 * Select the child ProductImages entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsProductImageses")
	public ModelAndView confirmDeleteProductsProductImageses(@RequestParam Integer products_productId, @RequestParam Integer related_productimageses_productImageId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productimages", productImagesDAO.findProductImagesByPrimaryKey(related_productimageses_productImageId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/productimageses/deleteProductImageses.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsRating entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsProductsRatings")
	public ModelAndView confirmDeleteProductsProductsRatings(@RequestParam Integer products_productId, @RequestParam Integer related_productsratings_productRatingId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsrating", productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings_productRatingId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/productsratings/deleteProductsRatings.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/editProductsProductsCategory")
	public ModelAndView editProductsProductsCategory(@RequestParam Integer products_productId, @RequestParam Integer productscategory_categoryId) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("products/productscategory/editProductsCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/editProductsProductsDescriptions")
	public ModelAndView editProductsProductsDescriptions(@RequestParam Integer products_productId, @RequestParam Integer productsdescriptions_productDescriptionId) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescriptions_productDescriptionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("products/productsdescriptions/editProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsDescription entity
	 * 
	 */
	@RequestMapping("/selectProductsProductsDescriptions")
	public ModelAndView selectProductsProductsDescriptions(@RequestParam Integer products_productId, @RequestParam Integer productsdescriptions_productDescriptionId) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescriptions_productDescriptionId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsdescription", productsdescription);
		mav.setViewName("products/productsdescriptions/viewProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/deleteProductsProductsCategory")
	public ModelAndView deleteProductsProductsCategory(@RequestParam Integer products_productId, @RequestParam Integer related_productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsProductsCategory(products_productId, related_productscategory_categoryId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Select the child VendorProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsVendorProfile")
	public ModelAndView confirmDeleteProductsVendorProfile(@RequestParam Integer products_productId, @RequestParam Integer related_vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile_registrationId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/vendorprofile/deleteVendorProfile.jsp");

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
	 * Show all Products entities
	 * 
	 */
	@RequestMapping("/indexProducts")
	public ModelAndView listProductss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productss", productsService.loadProductss());

		mav.setViewName("products/listProductss.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/selectProductsProductsFeedbacks")
	public ModelAndView selectProductsProductsFeedbacks(@RequestParam Integer products_productId, @RequestParam Integer productsfeedbacks_feedbackId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedbacks_feedbackId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("products/productsfeedbacks/viewProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsCategory entity
	 * 
	 */
	@RequestMapping("/newProductsProductsCategory")
	public ModelAndView newProductsProductsCategory(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productscategory", new ProductsCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("products/productscategory/editProductsCategory.jsp");

		return mav;
	}

	/**
	 * Select the child VendorLocations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsVendorLocations")
	public ModelAndView confirmDeleteProductsVendorLocations(@RequestParam Integer products_productId, @RequestParam Integer related_vendorlocations_locationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocations", vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations_locationId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/vendorlocations/deleteVendorLocations.jsp");

		return mav;
	}

	/**
	 * Show all ProductsCategory entities by Products
	 * 
	 */
	@RequestMapping("/listProductsProductsCategory")
	public ModelAndView listProductsProductsCategory(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/productscategory/listProductsCategory.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsProductsCategory")
	public ModelAndView confirmDeleteProductsProductsCategory(@RequestParam Integer products_productId, @RequestParam Integer related_productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(related_productscategory_categoryId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/productscategory/deleteProductsCategory.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Products entities
	 * 
	 */
	public String indexProducts() {
		return "redirect:/indexProducts";
	}

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/deleteProductsProductImageses")
	public ModelAndView deleteProductsProductImageses(@RequestParam Integer products_productId, @RequestParam Integer related_productimageses_productImageId) {
		ModelAndView mav = new ModelAndView();

		Products products = productsService.deleteProductsProductImageses(products_productId, related_productimageses_productImageId);

		mav.addObject("products_productId", products_productId);
		mav.addObject("products", products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Show all VendorProfile entities by Products
	 * 
	 */
	@RequestMapping("/listProductsVendorProfile")
	public ModelAndView listProductsVendorProfile(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/vendorprofile/listVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@RequestMapping("/saveProductsProductsRatings")
	public ModelAndView saveProductsProductsRatings(@RequestParam Integer products_productId, @ModelAttribute ProductsRating productsratings) {
		Products parent_products = productsService.saveProductsProductsRatings(products_productId, productsratings);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsFeedback entity
	 * 
	 */
	@RequestMapping("/editProductsProductsFeedbacks")
	public ModelAndView editProductsProductsFeedbacks(@RequestParam Integer products_productId, @RequestParam Integer productsfeedbacks_feedbackId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedbacks_feedbackId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsfeedback", productsfeedback);
		mav.setViewName("products/productsfeedbacks/editProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsRating entity
	 * 
	 */
	@RequestMapping("/newProductsProductsRatings")
	public ModelAndView newProductsProductsRatings(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsrating", new ProductsRating());
		mav.addObject("newFlag", true);
		mav.setViewName("products/productsratings/editProductsRatings.jsp");

		return mav;
	}

	/**
	 * Create a new ProductImages entity
	 * 
	 */
	@RequestMapping("/newProductsProductImageses")
	public ModelAndView newProductsProductImageses(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productimages", new ProductImages());
		mav.addObject("newFlag", true);
		mav.setViewName("products/productimageses/editProductImageses.jsp");

		return mav;
	}

	/**
	 * Show all ProductImages entities by Products
	 * 
	 */
	@RequestMapping("/listProductsProductImageses")
	public ModelAndView listProductsProductImageses(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/productimageses/listProductImageses.jsp");

		return mav;
	}

	/**
	 * Show all CartItems entities by Products
	 * 
	 */
	@RequestMapping("/listProductsCartItemses")
	public ModelAndView listProductsCartItemses(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/cartitemses/listCartItemses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new ProductsDescription entity
	 * 
	 */
	@RequestMapping("/newProductsProductsDescriptions")
	public ModelAndView newProductsProductsDescriptions(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productsdescription", new ProductsDescription());
		mav.addObject("newFlag", true);
		mav.setViewName("products/productsdescriptions/editProductsDescriptions.jsp");

		return mav;
	}

	/**
	 * Show all ProductsRating entities by Products
	 * 
	 */
	@RequestMapping("/listProductsProductsRatings")
	public ModelAndView listProductsProductsRatings(@RequestParam Integer productIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(productIdKey));
		mav.setViewName("products/productsratings/listProductsRatings.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsFeedback entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsProductsFeedbacks")
	public ModelAndView confirmDeleteProductsProductsFeedbacks(@RequestParam Integer products_productId, @RequestParam Integer related_productsfeedbacks_feedbackId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsfeedback", productsFeedbackDAO.findProductsFeedbackByPrimaryKey(related_productsfeedbacks_feedbackId));
		mav.addObject("products_productId", products_productId);
		mav.setViewName("products/productsfeedbacks/deleteProductsFeedbacks.jsp");

		return mav;
	}

	/**
	 * Create a new VendorProfile entity
	 * 
	 */
	@RequestMapping("/newProductsVendorProfile")
	public ModelAndView newProductsVendorProfile(@RequestParam Integer products_productId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("vendorprofile", new VendorProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("products/vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/editProductsProductImageses")
	public ModelAndView editProductsProductImageses(@RequestParam Integer products_productId, @RequestParam Integer productimageses_productImageId) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimageses_productImageId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productimages", productimages);
		mav.setViewName("products/productimageses/editProductImageses.jsp");

		return mav;
	}

	/**
	 * View an existing ProductImages entity
	 * 
	 */
	@RequestMapping("/selectProductsProductImageses")
	public ModelAndView selectProductsProductImageses(@RequestParam Integer products_productId, @RequestParam Integer productimageses_productImageId) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimageses_productImageId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("productimages", productimages);
		mav.setViewName("products/productimageses/viewProductImageses.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveProductsCartItemses")
	public ModelAndView saveProductsCartItemses(@RequestParam Integer products_productId, @ModelAttribute CartItems cartitemses) {
		Products parent_products = productsService.saveProductsCartItemses(products_productId, cartitemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("products_productId", products_productId);
		mav.addObject("products", parent_products);
		mav.setViewName("products/viewProducts.jsp");

		return mav;
	}
}