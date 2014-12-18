package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;

/**
 * Spring service that handles CRUD requests for ProductsDescription entities
 * 
 */
public interface ProductsDescriptionService {

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	public void saveProductsDescription(ProductsDescription productsdescription);

	/**
	 * Load an existing ProductsDescription entity
	 * 
	 */
	public Set<ProductsDescription> loadProductsDescriptions();

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public ProductsDescription saveProductsDescriptionCartItemses(Integer productDescriptionId, CartItems related_cartitemses);

	/**
	 * Return a count of all ProductsDescription entity
	 * 
	 */
	public Integer countProductsDescriptions();

	/**
	 */
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId_1);

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	public void deleteProductsDescription(ProductsDescription productsdescription_1);

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public ProductsDescription deleteProductsDescriptionCartItemses(Integer productsdescription_productDescriptionId, Integer related_cartitemses_cartItemId);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public ProductsDescription saveProductsDescriptionProducts(Integer productDescriptionId_2, Products related_products);

	/**
	 * Return all ProductsDescription entity
	 * 
	 */
	public List<ProductsDescription> findAllProductsDescriptions(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public ProductsDescription deleteProductsDescriptionProducts(Integer productsdescription_productDescriptionId_1, Integer related_products_productId);
}