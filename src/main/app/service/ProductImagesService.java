package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;

/**
 * Spring service that handles CRUD requests for ProductImages entities
 * 
 */
public interface ProductImagesService {

	/**
	 * Load an existing ProductImages entity
	 * 
	 */
	public Set<ProductImages> loadProductImagess();

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	public void deleteProductImages(ProductImages productimages);

	/**
	 * Return all ProductImages entity
	 * 
	 */
	public List<ProductImages> findAllProductImagess(Integer startResult, Integer maxRows);

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public ProductImages saveProductImagesCartItemses(Integer productImageId, CartItems related_cartitemses);

	/**
	 */
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId_1);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public ProductImages deleteProductImagesProducts(Integer productimages_productImageId, Integer related_products_productId);

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	public void saveProductImages(ProductImages productimages_1);

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public ProductImages deleteProductImagesCartItemses(Integer productimages_productImageId_1, Integer related_cartitemses_cartItemId);

	/**
	 * Return a count of all ProductImages entity
	 * 
	 */
	public Integer countProductImagess();

	/**
	 * Save an existing Products entity
	 * 
	 */
	public ProductImages saveProductImagesProducts(Integer productImageId_2, Products related_products);
}