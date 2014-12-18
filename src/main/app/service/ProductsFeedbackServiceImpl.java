package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.ProductsDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;

import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductsFeedback entities
 * 
 */

@Service("ProductsFeedbackService")
@Transactional
public class ProductsFeedbackServiceImpl implements ProductsFeedbackService {

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
	 * Instantiates a new ProductsFeedbackServiceImpl.
	 *
	 */
	public ProductsFeedbackServiceImpl() {
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public ProductsFeedback deleteProductsFeedbackProductsRating(Integer productsfeedback_feedbackId, Integer related_productsrating_productRatingId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedback_feedbackId, -1, -1);
		ProductsRating related_productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsrating_productRatingId, -1, -1);

		productsfeedback.setProductsRating(null);
		related_productsrating.getProductsFeedbacks().remove(productsfeedback);
		productsfeedback = productsFeedbackDAO.store(productsfeedback);
		productsFeedbackDAO.flush();

		related_productsrating = productsRatingDAO.store(related_productsrating);
		productsRatingDAO.flush();

		productsRatingDAO.remove(related_productsrating);
		productsRatingDAO.flush();

		return productsfeedback;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsFeedback saveProductsFeedbackProducts(Integer feedbackId, Products related_products) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackId, -1, -1);
		Products existingproducts = productsDAO.findProductsByPrimaryKey(related_products.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingproducts != null) {
			existingproducts.setProductId(related_products.getProductId());
			existingproducts.setProductTitle(related_products.getProductTitle());
			existingproducts.setSalesPrice(related_products.getSalesPrice());
			existingproducts.setCostPrice(related_products.getCostPrice());
			existingproducts.setDiscountPrice(related_products.getDiscountPrice());
			existingproducts.setPercentageDiscount(related_products.getPercentageDiscount());
			existingproducts.setCreatedOn(related_products.getCreatedOn());
			existingproducts.setCreatedBy(related_products.getCreatedBy());
			existingproducts.setModifiedOn(related_products.getModifiedOn());
			existingproducts.setModifiedBy(related_products.getModifiedBy());
			existingproducts.setStatus(related_products.getStatus());
			existingproducts.setQuantity(related_products.getQuantity());
			related_products = existingproducts;
		} else {
			related_products = productsDAO.store(related_products);
			productsDAO.flush();
		}

		productsfeedback.setProducts(related_products);
		related_products.getProductsFeedbacks().add(productsfeedback);
		productsfeedback = productsFeedbackDAO.store(productsfeedback);
		productsFeedbackDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		return productsfeedback;
	}

	/**
	 */
	@Transactional
	public ProductsFeedback findProductsFeedbackByPrimaryKey(Integer feedbackId) {
		return productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackId);
	}

	/**
	 * Return a count of all ProductsFeedback entity
	 * 
	 */
	@Transactional
	public Integer countProductsFeedbacks() {
		return ((Long) productsFeedbackDAO.createQuerySingleResult("select count(o) from ProductsFeedback o").getSingleResult()).intValue();
	}

	/**
	 * Return all ProductsFeedback entity
	 * 
	 */
	@Transactional
	public List<ProductsFeedback> findAllProductsFeedbacks(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductsFeedback>(productsFeedbackDAO.findAllProductsFeedbacks(startResult, maxRows));
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public void deleteProductsFeedback(ProductsFeedback productsfeedback) {
		productsFeedbackDAO.remove(productsfeedback);
		productsFeedbackDAO.flush();
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public ProductsFeedback saveProductsFeedbackProductsRating(Integer feedbackId, ProductsRating related_productsrating) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(feedbackId, -1, -1);
		ProductsRating existingproductsRating = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsrating.getProductRatingId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsRating != null) {
			existingproductsRating.setProductRatingId(related_productsrating.getProductRatingId());
			existingproductsRating.setProductRating(related_productsrating.getProductRating());
			existingproductsRating.setCreatedOn(related_productsrating.getCreatedOn());
			existingproductsRating.setCreatedBy(related_productsrating.getCreatedBy());
			existingproductsRating.setModifiedOn(related_productsrating.getModifiedOn());
			existingproductsRating.setModifiedBy(related_productsrating.getModifiedBy());
			related_productsrating = existingproductsRating;
		} else {
			related_productsrating = productsRatingDAO.store(related_productsrating);
			productsRatingDAO.flush();
		}

		productsfeedback.setProductsRating(related_productsrating);
		related_productsrating.getProductsFeedbacks().add(productsfeedback);
		productsfeedback = productsFeedbackDAO.store(productsfeedback);
		productsFeedbackDAO.flush();

		related_productsrating = productsRatingDAO.store(related_productsrating);
		productsRatingDAO.flush();

		return productsfeedback;
	}

	/**
	 * Load an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public Set<ProductsFeedback> loadProductsFeedbacks() {
		return productsFeedbackDAO.findAllProductsFeedbacks();
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsFeedback deleteProductsFeedbackProducts(Integer productsfeedback_feedbackId, Integer related_products_productId) {
		ProductsFeedback productsfeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedback_feedbackId, -1, -1);
		Products related_products = productsDAO.findProductsByPrimaryKey(related_products_productId, -1, -1);

		productsfeedback.setProducts(null);
		related_products.getProductsFeedbacks().remove(productsfeedback);
		productsfeedback = productsFeedbackDAO.store(productsfeedback);
		productsFeedbackDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		productsDAO.remove(related_products);
		productsDAO.flush();

		return productsfeedback;
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public void saveProductsFeedback(ProductsFeedback productsfeedback) {
		ProductsFeedback existingProductsFeedback = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(productsfeedback.getFeedbackId());

		if (existingProductsFeedback != null) {
			if (existingProductsFeedback != productsfeedback) {
				existingProductsFeedback.setFeedbackId(productsfeedback.getFeedbackId());
				existingProductsFeedback.setFeedbackComments(productsfeedback.getFeedbackComments());
				existingProductsFeedback.setFeedbackImage(productsfeedback.getFeedbackImage());
				existingProductsFeedback.setCreatedOn(productsfeedback.getCreatedOn());
				existingProductsFeedback.setCreatedBy(productsfeedback.getCreatedBy());
				existingProductsFeedback.setModifiedOn(productsfeedback.getModifiedOn());
				existingProductsFeedback.setModifiedBy(productsfeedback.getModifiedBy());
			}
			productsfeedback = productsFeedbackDAO.store(existingProductsFeedback);
		} else {
			productsfeedback = productsFeedbackDAO.store(productsfeedback);
		}
		productsFeedbackDAO.flush();
	}
}
