package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

/**
 * Spring service that handles CRUD requests for ProductsFeedback entities
 * 
 */
public interface ProductsFeedbackService {

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	public ProductsFeedback deleteProductsFeedbackProductsRating(Integer productsfeedback_feedbackId, Integer related_productsrating_productRatingId);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public ProductsFeedback saveProductsFeedbackProducts(Integer feedbackId, Products related_products);

	/**
	 */
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId_1);

	/**
	 * Return a count of all ProductsFeedback entity
	 * 
	 */
	public Integer countProductsFeedbacks();

	/**
	 * Return all ProductsFeedback entity
	 * 
	 */
	public List<ProductsFeedback> findAllProductsFeedbacks(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	public void deleteProductsFeedback(ProductsFeedback productsfeedback);

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	public ProductsFeedback saveProductsFeedbackProductsRating(Integer feedbackId_2, ProductsRating related_productsrating);

	/**
	 * Load an existing ProductsFeedback entity
	 * 
	 */
	public Set<ProductsFeedback> loadProductsFeedbacks();

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public ProductsFeedback deleteProductsFeedbackProducts(Integer productsfeedback_feedbackId_1, Integer related_products_productId);

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	public void saveProductsFeedback(ProductsFeedback productsfeedback_1);
}