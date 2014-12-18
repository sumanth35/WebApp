package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.ProductsBrandDAO;
import main.app.dao.ProductsCategoryDAO;

import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

import main.app.service.ProductsBrandService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ProductsBrand entities
 * 
 */

@Controller("ProductsBrandController")
public class ProductsBrandController {

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
	 * Service injected by Spring that provides CRUD operations for ProductsBrand entities
	 * 
	 */
	@Autowired
	private ProductsBrandService productsBrandService;

	/**
	 * Select the child ProductsCategory entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsBrandProductsCategory")
	public ModelAndView confirmDeleteProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId, @RequestParam Integer related_productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productscategory", productsCategoryDAO.findProductsCategoryByPrimaryKey(related_productscategory_categoryId));
		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.setViewName("productsbrand/productscategory/deleteProductsCategory.jsp");

		return mav;
	}

	/**
	 * Create a new ProductsCategory entity
	 * 
	 */
	@RequestMapping("/newProductsBrandProductsCategory")
	public ModelAndView newProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.addObject("productscategory", new ProductsCategory());
		mav.addObject("newFlag", true);
		mav.setViewName("productsbrand/productscategory/editProductsCategory.jsp");

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
	 * Create a new ProductsBrand entity
	 * 
	 */
	@RequestMapping("/newProductsBrand")
	public ModelAndView newProductsBrand() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", new ProductsBrand());
		mav.addObject("newFlag", true);
		mav.setViewName("productsbrand/editProductsBrand.jsp");

		return mav;
	}

	/**
	 * Show all ProductsCategory entities by ProductsBrand
	 * 
	 */
	@RequestMapping("/listProductsBrandProductsCategory")
	public ModelAndView listProductsBrandProductsCategory(@RequestParam Integer brandIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", productsBrandDAO.findProductsBrandByPrimaryKey(brandIdKey));
		mav.setViewName("productsbrand/productscategory/listProductsCategory.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/deleteProductsBrandProductsCategory")
	public ModelAndView deleteProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId, @RequestParam Integer related_productscategory_categoryId) {
		ModelAndView mav = new ModelAndView();

		ProductsBrand productsbrand = productsBrandService.deleteProductsBrandProductsCategory(productsbrand_brandId, related_productscategory_categoryId);

		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.addObject("productsbrand", productsbrand);
		mav.setViewName("productsbrand/viewProductsBrand.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/saveProductsBrand")
	public String saveProductsBrand(@ModelAttribute ProductsBrand productsbrand) {
		productsBrandService.saveProductsBrand(productsbrand);
		return "forward:/indexProductsBrand";
	}

	/**
	 * Edit an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/editProductsBrand")
	public ModelAndView editProductsBrand(@RequestParam Integer brandIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", productsBrandDAO.findProductsBrandByPrimaryKey(brandIdKey));
		mav.setViewName("productsbrand/editProductsBrand.jsp");

		return mav;
	}

	/**
	 * Select the ProductsBrand entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProductsBrand")
	public ModelAndView confirmDeleteProductsBrand(@RequestParam Integer brandIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", productsBrandDAO.findProductsBrandByPrimaryKey(brandIdKey));
		mav.setViewName("productsbrand/deleteProductsBrand.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ProductsBrand entities
	 * 
	 */
	public String indexProductsBrand() {
		return "redirect:/indexProductsBrand";
	}

	/**
	 */
	@RequestMapping("/productsbrandController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/selectProductsBrandProductsCategory")
	public ModelAndView selectProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId, @RequestParam Integer productscategory_categoryId) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("productsbrand/productscategory/viewProductsCategory.jsp");

		return mav;
	}

	/**
	 * Edit an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/editProductsBrandProductsCategory")
	public ModelAndView editProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId, @RequestParam Integer productscategory_categoryId) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.addObject("productscategory", productscategory);
		mav.setViewName("productsbrand/productscategory/editProductsCategory.jsp");

		return mav;
	}

	/**
	 * Show all ProductsBrand entities
	 * 
	 */
	@RequestMapping("/indexProductsBrand")
	public ModelAndView listProductsBrands() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrands", productsBrandService.loadProductsBrands());

		mav.setViewName("productsbrand/listProductsBrands.jsp");

		return mav;
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@RequestMapping("/saveProductsBrandProductsCategory")
	public ModelAndView saveProductsBrandProductsCategory(@RequestParam Integer productsbrand_brandId, @ModelAttribute ProductsCategory productscategory) {
		ProductsBrand parent_productsbrand = productsBrandService.saveProductsBrandProductsCategory(productsbrand_brandId, productscategory);

		ModelAndView mav = new ModelAndView();
		mav.addObject("productsbrand_brandId", productsbrand_brandId);
		mav.addObject("productsbrand", parent_productsbrand);
		mav.setViewName("productsbrand/viewProductsBrand.jsp");

		return mav;
	}

	/**
	 * Select an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/selectProductsBrand")
	public ModelAndView selectProductsBrand(@RequestParam Integer brandIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("productsbrand", productsBrandDAO.findProductsBrandByPrimaryKey(brandIdKey));
		mav.setViewName("productsbrand/viewProductsBrand.jsp");

		return mav;
	}

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@RequestMapping("/deleteProductsBrand")
	public String deleteProductsBrand(@RequestParam Integer brandIdKey) {
		ProductsBrand productsbrand = productsBrandDAO.findProductsBrandByPrimaryKey(brandIdKey);
		productsBrandService.deleteProductsBrand(productsbrand);
		return "forward:/indexProductsBrand";
	}
}