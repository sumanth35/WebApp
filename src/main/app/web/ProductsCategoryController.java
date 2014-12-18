package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.ProductsBrandDAO;
import main.app.dao.ProductsCategoryDAO;
import main.app.dao.ProductsDAO;

import main.app.domain.Products;
import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

import main.app.service.ProductsCategoryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductsCategory entities
 * 
 */

@Controller("ProductsCategoryController")
public class ProductsCategoryController {

	/**
	 * DAO injected by Spring that manages ProductsBrand entities
	 * 
	 */
	@Autowired
	private ProductsBrandDAO productsBrandDAO;

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
	 * Service injected by Spring that provides CRUD operations for ProductsCategory entities
	 * 
	 */
	@Autowired
	private ProductsCategoryService productsCategoryService;

	/**
	 * Create a new Products entity
	 * 
	 */
	@RequestMapping("/newProductsCategoryProductses")
	public ModelAndView newProductsCategoryProductses(@RequestParam Integer productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("products", new Products());
		mav.addObject("newFlag", true);
		mav.setViewName("productscategory/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * Show all ProductsCategory entities
	 * 
	 */
	@RequestMapping("/indexProductsCategory")
	public ModelAndView listProductsCategorys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategorys", productsCategoryService.loadProductsCategorys());

		mav.setViewName("productscategory/listProductsCategorys.jsp");

		return mav;
	}

	/**
	 * Select the child Products entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsCategoryProductses")
	public ModelAndView confirmDeleteProductsCategoryProductses(@RequestParam Integer productscategory_categoryId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productsDAO.findProductsByPrimaryKey(related_productses_productId));
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.setViewName("productscategory/productses/deleteProductses.jsp");

		return mav;
	}

	/**
	 * Show all ProductsBrand entities by ProductsCategory
	 * 
	 */
	@RequestMapping("/listProductsCategoryProductsBrands")
	public ModelAndView listProductsCategoryProductsBrands(@RequestParam Integer categoryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey));
		mav.setViewName("productscategory/productsbrands/listProductsBrands.jsp");

		return mav;
	}

	/**
	 * View an existing Products entity
	 * 
	 */
	@RequestMapping("/selectProductsCategoryProductses")
	public ModelAndView selectProductsCategoryProductses(@RequestParam Integer productscategory_categoryId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("products", products);
		mav.setViewName("productscategory/productses/viewProductses.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/selectProductsCategory")
	public ModelAndView selectProductsCategory(@RequestParam Integer categoryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey));
		mav.setViewName("productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 * Show all Products entities by ProductsCategory
	 * 
	 */
	@RequestMapping("/listProductsCategoryProductses")
	public ModelAndView listProductsCategoryProductses(@RequestParam Integer categoryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey));
		mav.setViewName("productscategory/productses/listProductses.jsp");

		return mav;
	}

	/**
	 * View an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/selectProductsCategoryProductsBrands")
	public ModelAndView selectProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId, @RequestParam Integer productsbrands_brandId) {
		ProductsBrand productsbrand = productsBrandDAO.findProductsBrandByPrimaryKey(productsbrands_brandId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productsbrand", productsbrand);
		mav.setViewName("productscategory/productsbrands/viewProductsBrands.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/editProductsCategory")
	public ModelAndView editProductsCategory(@RequestParam Integer categoryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey));
		mav.setViewName("productscategory/editProductsCategory.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsBrand entity
	 * 
	 */
	@RequestMapping("/newProductsCategoryProductsBrands")
	public ModelAndView newProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productsbrand", new ProductsBrand());
		mav.addObject("newFlag", true);
		mav.setViewName("productscategory/productsbrands/editProductsBrands.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/deleteProductsCategoryProductsBrands")
	public ModelAndView deleteProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId, @RequestParam Integer related_productsbrands_brandId) {
		ModelAndView mav = new ModelAndView();

		ProductsCategory productscategory = productsCategoryService.deleteProductsCategoryProductsBrands(productscategory_categoryId, related_productsbrands_brandId);

		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 * Select the child ProductsBrand entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsCategoryProductsBrands")
	public ModelAndView confirmDeleteProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId, @RequestParam Integer related_productsbrands_brandId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", productsBrandDAO.findProductsBrandByPrimaryKey(related_productsbrands_brandId));
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.setViewName("productscategory/productsbrands/deleteProductsBrands.jsp");

		return mav;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@RequestMapping("/saveProductsCategoryProductses")
	public ModelAndView saveProductsCategoryProductses(@RequestParam Integer productscategory_categoryId, @ModelAttribute Products productses) {
		ProductsCategory parent_productscategory = productsCategoryService.saveProductsCategoryProductses(productscategory_categoryId, productses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productscategory", parent_productscategory);
		mav.setViewName("productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing Products entity
	 * 
	 */
	@RequestMapping("/editProductsCategoryProductses")
	public ModelAndView editProductsCategoryProductses(@RequestParam Integer productscategory_categoryId, @RequestParam Integer productses_productId) {
		Products products = productsDAO.findProductsByPrimaryKey(productses_productId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("products", products);
		mav.setViewName("productscategory/productses/editProductses.jsp");

		return mav;
	}

	/**
	 * Select the ProductsCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsCategory")
	public ModelAndView confirmDeleteProductsCategory(@RequestParam Integer categoryIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey));
		mav.setViewName("productscategory/deleteProductsCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/editProductsCategoryProductsBrands")
	public ModelAndView editProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId, @RequestParam Integer productsbrands_brandId) {
		ProductsBrand productsbrand = productsBrandDAO.findProductsBrandByPrimaryKey(productsbrands_brandId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productsbrand", productsbrand);
		mav.setViewName("productscategory/productsbrands/editProductsBrands.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductsCategory entities
	 * 
	 */
	public String indexProductsCategory() {
		return "redirect:/indexProductsCategory";
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/saveProductsCategory")
	public String saveProductsCategory(@ModelAttribute ProductsCategory productscategory) {
		productsCategoryService.saveProductsCategory(productscategory);
		return "forward:/indexProductsCategory";
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/deleteProductsCategory")
	public String deleteProductsCategory(@RequestParam Integer categoryIdKey) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryIdKey);
		productsCategoryService.deleteProductsCategory(productscategory);
		return "forward:/indexProductsCategory";
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@RequestMapping("/deleteProductsCategoryProductses")
	public ModelAndView deleteProductsCategoryProductses(@RequestParam Integer productscategory_categoryId, @RequestParam Integer related_productses_productId) {
		ModelAndView mav = new ModelAndView();

		ProductsCategory productscategory = productsCategoryService.deleteProductsCategoryProductses(productscategory_categoryId, related_productses_productId);

		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/productscategoryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new ProductsCategory entity
	 * 
	 */
	@RequestMapping("/newProductsCategory")
	public ModelAndView newProductsCategory() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", new ProductsCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("productscategory/editProductsCategory.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/saveProductsCategoryProductsBrands")
	public ModelAndView saveProductsCategoryProductsBrands(@RequestParam Integer productscategory_categoryId, @ModelAttribute ProductsBrand productsbrands) {
		ProductsCategory parent_productscategory = productsCategoryService.saveProductsCategoryProductsBrands(productscategory_categoryId, productsbrands);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productscategory_categoryId", productscategory_categoryId);
		mav.addObject("productscategory", parent_productscategory);
		mav.setViewName("productscategory/viewProductsCategory.jsp");

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
}