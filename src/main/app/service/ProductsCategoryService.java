package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Products;
import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

/**
 * Spring service that handles CRUD requests for ProductsCategory entities
 * 
 */
public interface ProductsCategoryService {

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	public void saveProductsCategory(ProductsCategory productscategory);

	/**
	 * Return all ProductsCategory entity
	 * 
	 */
	public List<ProductsCategory> findAllProductsCategorys(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	public ProductsCategory saveProductsCategoryProductsBrands(Integer categoryId, ProductsBrand related_productsbrands);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public ProductsCategory deleteProductsCategoryProductses(Integer productscategory_categoryId, Integer related_productses_productId);

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	public void deleteProductsCategory(ProductsCategory productscategory_1);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public ProductsCategory saveProductsCategoryProductses(Integer categoryId_1, Products related_productses);

	/**
	 * Return a count of all ProductsCategory entity
	 * 
	 */
	public Integer countProductsCategorys();

	/**
	 */
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId_2);

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	public ProductsCategory deleteProductsCategoryProductsBrands(Integer productscategory_categoryId_1, Integer related_productsbrands_brandId);

	/**
	 * Load an existing ProductsCategory entity
	 * 
	 */
	public Set<ProductsCategory> loadProductsCategorys();
}