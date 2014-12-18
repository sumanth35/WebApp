package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

/**
 * Spring service that handles CRUD requests for ProductsBrand entities
 * 
 */
public interface ProductsBrandService {

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	public void deleteProductsBrand(ProductsBrand productsbrand);

	/**
	 */
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId);

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	public ProductsBrand saveProductsBrandProductsCategory(Integer brandId_1, ProductsCategory related_productscategory);

	/**
	 * Return a count of all ProductsBrand entity
	 * 
	 */
	public Integer countProductsBrands();

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	public void saveProductsBrand(ProductsBrand productsbrand_1);

	/**
	 * Return all ProductsBrand entity
	 * 
	 */
	public List<ProductsBrand> findAllProductsBrands(Integer startResult, Integer maxRows);

	/**
	 * Load an existing ProductsBrand entity
	 * 
	 */
	public Set<ProductsBrand> loadProductsBrands();

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	public ProductsBrand deleteProductsBrandProductsCategory(Integer productsbrand_brandId, Integer related_productscategory_categoryId);
}