package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsCategory;
import main.app.domain.ProductsDescription;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;
import main.app.domain.VendorLocations;
import main.app.domain.VendorProfile;

/**
 * Spring service that handles CRUD requests for Products entities
 * 
 */
public interface ProductsService {

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	public Products deleteProductsVendorLocations(Integer products_productId, Integer related_vendorlocations_locationId);

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	public Products saveProductsVendorLocations(Integer productId, VendorLocations related_vendorlocations);

	/**
	 * Return a count of all Products entity
	 * 
	 */
	public Integer countProductss();

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	public Products saveProductsProductsRatings(Integer productId_1, ProductsRating related_productsratings);

	/**
	 * Load an existing Products entity
	 * 
	 */
	public Set<Products> loadProductss();

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	public Products saveProductsProductsCategory(Integer productId_2, ProductsCategory related_productscategory);

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	public Products saveProductsProductsDescriptions(Integer productId_3, ProductsDescription related_productsdescriptions);

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	public Products saveProductsVendorProfile(Integer productId_4, VendorProfile related_vendorprofile);

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	public Products saveProductsProductImageses(Integer productId_5, ProductImages related_productimageses);

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public Products deleteProductsCartItemses(Integer products_productId_1, Integer related_cartitemses_cartItemId);

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	public Products deleteProductsProductImageses(Integer products_productId_2, Integer related_productimageses_productImageId);

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	public Products deleteProductsProductsRatings(Integer products_productId_3, Integer related_productsratings_productRatingId);

	/**
	 * Save an existing Products entity
	 * 
	 */
	public void saveProducts(Products products);

	/**
	 * Return all Products entity
	 * 
	 */
	public List<Products> findAllProductss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	public Products saveProductsProductsFeedbacks(Integer productId_6, ProductsFeedback related_productsfeedbacks);

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	public Products deleteProductsProductsCategory(Integer products_productId_4, Integer related_productscategory_categoryId);

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	public Products deleteProductsProductsFeedbacks(Integer products_productId_5, Integer related_productsfeedbacks_feedbackId);

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	public Products deleteProductsProductsDescriptions(Integer products_productId_6, Integer related_productsdescriptions_productDescriptionId);

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public Products saveProductsCartItemses(Integer productId_7, CartItems related_cartitemses);

	/**
	 * Delete an existing Products entity
	 * 
	 */
	public void deleteProducts(Products products_1);

	/**
	 */
	public Products findProductsByPrimaryKey(Integer productId_8);

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	public Products deleteProductsVendorProfile(Integer products_productId_7, Integer related_vendorprofile_registrationId);
}