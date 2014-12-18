package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CustomerProfile;
import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

/**
 * Spring service that handles CRUD requests for ProductsRating entities
 * 
 */
public interface ProductsRatingService {

	/**
	 * Return all ProductsRating entity
	 * 
	 */
	public List<ProductsRating> findAllProductsRatings(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public ProductsRating deleteProductsRatingProducts(Integer productsrating_productRatingId, Integer related_products_productId);

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	public ProductsRating deleteProductsRatingCustomerProfile(Integer productsrating_productRatingId_1, Integer related_customerprofile_customerId);

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	public ProductsRating saveProductsRatingCustomerProfile(Integer productRatingId, CustomerProfile related_customerprofile);

	/**
	 * Return a count of all ProductsRating entity
	 * 
	 */
	public Integer countProductsRatings();

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	public ProductsRating saveProductsRatingProductsFeedbacks(Integer productRatingId_1, ProductsFeedback related_productsfeedbacks);

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	public void deleteProductsRating(ProductsRating productsrating);

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	public void saveProductsRating(ProductsRating productsrating_1);

	/**
	 * Load an existing ProductsRating entity
	 * 
	 */
	public Set<ProductsRating> loadProductsRatings();

	/**
	 */
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId_2);

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	public ProductsRating deleteProductsRatingProductsFeedbacks(Integer productsrating_productRatingId_2, Integer related_productsfeedbacks_feedbackId);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public ProductsRating saveProductsRatingProducts(Integer productRatingId_3, Products related_products);
}