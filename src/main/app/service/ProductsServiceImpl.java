package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsCategoryDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;
import main.app.dao.VendorLocationsDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;
import main.app.domain.ProductsCategory;
import main.app.domain.ProductsDescription;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;
import main.app.domain.VendorLocations;
import main.app.domain.VendorProfile;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Products entities
 * 
 */

@Service("ProductsService")
@Transactional
public class ProductsServiceImpl implements ProductsService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

	/**
	 * DAO injected by Spring that manages ProductImages entities
	 * 
	 */
	@Autowired
	private ProductImagesDAO productImagesDAO;

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
	 * DAO injected by Spring that manages ProductsDescription entities
	 * 
	 */
	@Autowired
	private ProductsDescriptionDAO productsDescriptionDAO;

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
	 * DAO injected by Spring that manages VendorLocations entities
	 * 
	 */
	@Autowired
	private VendorLocationsDAO vendorLocationsDAO;

	/**
	 * DAO injected by Spring that manages VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileDAO vendorProfileDAO;

	/**
	 * Instantiates a new ProductsServiceImpl.
	 *
	 */
	public ProductsServiceImpl() {
	}

	/**
	 * Delete an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public Products deleteProductsVendorLocations(Integer products_productId, Integer related_vendorlocations_locationId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);
		VendorLocations related_vendorlocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations_locationId, -1, -1);

		products.setVendorLocations(null);
		related_vendorlocations.getProductses().remove(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
		vendorLocationsDAO.flush();

		vendorLocationsDAO.remove(related_vendorlocations);
		vendorLocationsDAO.flush();

		return products;
	}

	/**
	 * Save an existing VendorLocations entity
	 * 
	 */
	@Transactional
	public Products saveProductsVendorLocations(Integer productId, VendorLocations related_vendorlocations) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		VendorLocations existingvendorLocations = vendorLocationsDAO.findVendorLocationsByPrimaryKey(related_vendorlocations.getLocationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorLocations != null) {
			existingvendorLocations.setLocationId(related_vendorlocations.getLocationId());
			existingvendorLocations.setLocationName(related_vendorlocations.getLocationName());
			existingvendorLocations.setLocationAdminFirstName(related_vendorlocations.getLocationAdminFirstName());
			existingvendorLocations.setLocationAdminMiddleName(related_vendorlocations.getLocationAdminMiddleName());
			existingvendorLocations.setLocationAdminLastName(related_vendorlocations.getLocationAdminLastName());
			existingvendorLocations.setLocationAdminSuffix(related_vendorlocations.getLocationAdminSuffix());
			existingvendorLocations.setStatus(related_vendorlocations.getStatus());
			existingvendorLocations.setPhone1(related_vendorlocations.getPhone1());
			existingvendorLocations.setPhone2(related_vendorlocations.getPhone2());
			existingvendorLocations.setFax(related_vendorlocations.getFax());
			existingvendorLocations.setEmail(related_vendorlocations.getEmail());
			existingvendorLocations.setAddressLine1(related_vendorlocations.getAddressLine1());
			existingvendorLocations.setAddressLine2(related_vendorlocations.getAddressLine2());
			existingvendorLocations.setAddressLine3(related_vendorlocations.getAddressLine3());
			existingvendorLocations.setZipCode5(related_vendorlocations.getZipCode5());
			existingvendorLocations.setCreatedBy(related_vendorlocations.getCreatedBy());
			existingvendorLocations.setCreatedOn(related_vendorlocations.getCreatedOn());
			existingvendorLocations.setModifiedBy(related_vendorlocations.getModifiedBy());
			existingvendorLocations.setModifiedOn(related_vendorlocations.getModifiedOn());
			existingvendorLocations.setZipCode4(related_vendorlocations.getZipCode4());
			related_vendorlocations = existingvendorLocations;
		} else {
			related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
			vendorLocationsDAO.flush();
		}

		products.setVendorLocations(related_vendorlocations);
		related_vendorlocations.getProductses().add(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_vendorlocations = vendorLocationsDAO.store(related_vendorlocations);
		vendorLocationsDAO.flush();

		return products;
	}

	/**
	 * Return a count of all Products entity
	 * 
	 */
	@Transactional
	public Integer countProductss() {
		return ((Long) productsDAO.createQuerySingleResult("select count(o) from Products o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public Products saveProductsProductsRatings(Integer productId, ProductsRating related_productsratings) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		ProductsRating existingproductsRatings = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings.getProductRatingId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsRatings != null) {
			existingproductsRatings.setProductRatingId(related_productsratings.getProductRatingId());
			existingproductsRatings.setProductRating(related_productsratings.getProductRating());
			existingproductsRatings.setCreatedOn(related_productsratings.getCreatedOn());
			existingproductsRatings.setCreatedBy(related_productsratings.getCreatedBy());
			existingproductsRatings.setModifiedOn(related_productsratings.getModifiedOn());
			existingproductsRatings.setModifiedBy(related_productsratings.getModifiedBy());
			related_productsratings = existingproductsRatings;
		} else {
			related_productsratings = productsRatingDAO.store(related_productsratings);
			productsRatingDAO.flush();
		}

		related_productsratings.setProducts(products);
		products.getProductsRatings().add(related_productsratings);
		related_productsratings = productsRatingDAO.store(related_productsratings);
		productsRatingDAO.flush();

		products = productsDAO.store(products);
		productsDAO.flush();

		return products;
	}

	/**
	 * Load an existing Products entity
	 * 
	 */
	@Transactional
	public Set<Products> loadProductss() {
		return productsDAO.findAllProductss();
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public Products saveProductsProductsCategory(Integer productId, ProductsCategory related_productscategory) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		ProductsCategory existingproductsCategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(related_productscategory.getCategoryId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsCategory != null) {
			existingproductsCategory.setCategoryId(related_productscategory.getCategoryId());
			existingproductsCategory.setCategoryName(related_productscategory.getCategoryName());
			existingproductsCategory.setCategoryDescription(related_productscategory.getCategoryDescription());
			existingproductsCategory.setCategoryCode(related_productscategory.getCategoryCode());
			existingproductsCategory.setCreatedBy(related_productscategory.getCreatedBy());
			existingproductsCategory.setCreatedOn(related_productscategory.getCreatedOn());
			existingproductsCategory.setModifiedBy(related_productscategory.getModifiedBy());
			existingproductsCategory.setModifiedOn(related_productscategory.getModifiedOn());
			related_productscategory = existingproductsCategory;
		}

		products.setProductsCategory(related_productscategory);
		related_productscategory.getProductses().add(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_productscategory = productsCategoryDAO.store(related_productscategory);
		productsCategoryDAO.flush();

		return products;
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public Products saveProductsProductsDescriptions(Integer productId, ProductsDescription related_productsdescriptions) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		ProductsDescription existingproductsDescriptions = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescriptions.getProductDescriptionId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsDescriptions != null) {
			existingproductsDescriptions.setProductDescriptionId(related_productsdescriptions.getProductDescriptionId());
			existingproductsDescriptions.setProductPrimaryDescription(related_productsdescriptions.getProductPrimaryDescription());
			existingproductsDescriptions.setProductSecondaryDescription1(related_productsdescriptions.getProductSecondaryDescription1());
			existingproductsDescriptions.setProductSecondaryDescription2(related_productsdescriptions.getProductSecondaryDescription2());
			existingproductsDescriptions.setProductSecondaryDescription3(related_productsdescriptions.getProductSecondaryDescription3());
			existingproductsDescriptions.setProductSecondaryDescription4(related_productsdescriptions.getProductSecondaryDescription4());
			existingproductsDescriptions.setProductSecondaryDescription5(related_productsdescriptions.getProductSecondaryDescription5());
			existingproductsDescriptions.setProductColor(related_productsdescriptions.getProductColor());
			existingproductsDescriptions.setProductDimensionLength(related_productsdescriptions.getProductDimensionLength());
			existingproductsDescriptions.setProductDimensionBreadth(related_productsdescriptions.getProductDimensionBreadth());
			existingproductsDescriptions.setProductDimensionHeight(related_productsdescriptions.getProductDimensionHeight());
			existingproductsDescriptions.setProductWeight(related_productsdescriptions.getProductWeight());
			existingproductsDescriptions.setProductNumber(related_productsdescriptions.getProductNumber());
			existingproductsDescriptions.setProductModelNumber(related_productsdescriptions.getProductModelNumber());
			existingproductsDescriptions.setProductOrigin(related_productsdescriptions.getProductOrigin());
			existingproductsDescriptions.setCreatedBy(related_productsdescriptions.getCreatedBy());
			existingproductsDescriptions.setCreatedOn(related_productsdescriptions.getCreatedOn());
			existingproductsDescriptions.setModifiedBy(related_productsdescriptions.getModifiedBy());
			existingproductsDescriptions.setModifiedOn(related_productsdescriptions.getModifiedOn());
			related_productsdescriptions = existingproductsDescriptions;
		}

		related_productsdescriptions.setProducts(products);
		products.getProductsDescriptions().add(related_productsdescriptions);
		related_productsdescriptions = productsDescriptionDAO.store(related_productsdescriptions);
		productsDescriptionDAO.flush();

		products = productsDAO.store(products);
		productsDAO.flush();

		return products;
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public Products saveProductsVendorProfile(Integer productId, VendorProfile related_vendorprofile) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		VendorProfile existingvendorProfile = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile.getRegistrationId());

		// copy into the existing record to preserve existing relationships
		if (existingvendorProfile != null) {
			existingvendorProfile.setRegistrationId(related_vendorprofile.getRegistrationId());
			existingvendorProfile.setRegistrationName(related_vendorprofile.getRegistrationName());
			existingvendorProfile.setRegistrationEmail(related_vendorprofile.getRegistrationEmail());
			existingvendorProfile.setFirstName(related_vendorprofile.getFirstName());
			existingvendorProfile.setMiddleName(related_vendorprofile.getMiddleName());
			existingvendorProfile.setLastName(related_vendorprofile.getLastName());
			existingvendorProfile.setNameSuffix(related_vendorprofile.getNameSuffix());
			existingvendorProfile.setNameTitle(related_vendorprofile.getNameTitle());
			existingvendorProfile.setPhone1(related_vendorprofile.getPhone1());
			existingvendorProfile.setPhone2(related_vendorprofile.getPhone2());
			existingvendorProfile.setFax1(related_vendorprofile.getFax1());
			existingvendorProfile.setFax2(related_vendorprofile.getFax2());
			existingvendorProfile.setProfileStatus(related_vendorprofile.getProfileStatus());
			existingvendorProfile.setInactivityDuration(related_vendorprofile.getInactivityDuration());
			existingvendorProfile.setLastSucessLogin(related_vendorprofile.getLastSucessLogin());
			existingvendorProfile.setEducationDegree(related_vendorprofile.getEducationDegree());
			existingvendorProfile.setCreatedBy(related_vendorprofile.getCreatedBy());
			existingvendorProfile.setCreatedOn(related_vendorprofile.getCreatedOn());
			existingvendorProfile.setModifiedBy(related_vendorprofile.getModifiedBy());
			existingvendorProfile.setModifiedOn(related_vendorprofile.getModifiedOn());
			existingvendorProfile.setVendorPassword(related_vendorprofile.getVendorPassword());
			related_vendorprofile = existingvendorProfile;
		} else {
			related_vendorprofile = vendorProfileDAO.store(related_vendorprofile);
			vendorProfileDAO.flush();
		}

		products.setVendorProfile(related_vendorprofile);
		related_vendorprofile.getProductses().add(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_vendorprofile = vendorProfileDAO.store(related_vendorprofile);
		vendorProfileDAO.flush();

		return products;
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@Transactional
	public Products saveProductsProductImageses(Integer productId, ProductImages related_productimageses) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		ProductImages existingproductImageses = productImagesDAO.findProductImagesByPrimaryKey(related_productimageses.getProductImageId());

		// copy into the existing record to preserve existing relationships
		if (existingproductImageses != null) {
			existingproductImageses.setProductImageId(related_productimageses.getProductImageId());
			existingproductImageses.setProductPrimaryImage(related_productimageses.getProductPrimaryImage());
			existingproductImageses.setProductSecondaryImage1(related_productimageses.getProductSecondaryImage1());
			existingproductImageses.setProductSecondaryImage2(related_productimageses.getProductSecondaryImage2());
			existingproductImageses.setProductSecondaryImage3(related_productimageses.getProductSecondaryImage3());
			existingproductImageses.setProductSecondaryImage4(related_productimageses.getProductSecondaryImage4());
			existingproductImageses.setProductSecondaryImage5(related_productimageses.getProductSecondaryImage5());
			existingproductImageses.setProductVideo(related_productimageses.getProductVideo());
			existingproductImageses.setCreatedOn(related_productimageses.getCreatedOn());
			existingproductImageses.setCreatedBy(related_productimageses.getCreatedBy());
			existingproductImageses.setModifiedOn(related_productimageses.getModifiedOn());
			existingproductImageses.setModifiedBy(related_productimageses.getModifiedBy());
			related_productimageses = existingproductImageses;
		}

		related_productimageses.setProducts(products);
		products.getProductImageses().add(related_productimageses);
		related_productimageses = productImagesDAO.store(related_productimageses);
		productImagesDAO.flush();

		products = productsDAO.store(products);
		productsDAO.flush();

		return products;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public Products deleteProductsCartItemses(Integer products_productId, Integer related_cartitemses_cartItemId) {
		CartItems related_cartitemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId, -1, -1);

		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		related_cartitemses.setProducts(null);
		products.getCartItemses().remove(related_cartitemses);

		cartItemsDAO.remove(related_cartitemses);
		cartItemsDAO.flush();

		return products;
	}

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Transactional
	public Products deleteProductsProductImageses(Integer products_productId, Integer related_productimageses_productImageId) {
		ProductImages related_productimageses = productImagesDAO.findProductImagesByPrimaryKey(related_productimageses_productImageId, -1, -1);

		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		related_productimageses.setProducts(null);
		products.getProductImageses().remove(related_productimageses);

		productImagesDAO.remove(related_productimageses);
		productImagesDAO.flush();

		return products;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public Products deleteProductsProductsRatings(Integer products_productId, Integer related_productsratings_productRatingId) {
		ProductsRating related_productsratings = productsRatingDAO.findProductsRatingByPrimaryKey(related_productsratings_productRatingId, -1, -1);

		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		related_productsratings.setProducts(null);
		products.getProductsRatings().remove(related_productsratings);

		productsRatingDAO.remove(related_productsratings);
		productsRatingDAO.flush();

		return products;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public void saveProducts(Products products) {
		Products existingProducts = productsDAO.findProductsByPrimaryKey(products.getProductId());

		if (existingProducts != null) {
			if (existingProducts != products) {
				existingProducts.setProductId(products.getProductId());
				existingProducts.setProductTitle(products.getProductTitle());
				existingProducts.setSalesPrice(products.getSalesPrice());
				existingProducts.setCostPrice(products.getCostPrice());
				existingProducts.setDiscountPrice(products.getDiscountPrice());
				existingProducts.setPercentageDiscount(products.getPercentageDiscount());
				existingProducts.setCreatedOn(products.getCreatedOn());
				existingProducts.setCreatedBy(products.getCreatedBy());
				existingProducts.setModifiedOn(products.getModifiedOn());
				existingProducts.setModifiedBy(products.getModifiedBy());
				existingProducts.setStatus(products.getStatus());
				existingProducts.setQuantity(products.getQuantity());
			}
			products = productsDAO.store(existingProducts);
		} else {
			products = productsDAO.store(products);
		}
		productsDAO.flush();
	}

	/**
	 * Return all Products entity
	 * 
	 */
	@Transactional
	public List<Products> findAllProductss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Products>(productsDAO.findAllProductss(startResult, maxRows));
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public Products saveProductsProductsFeedbacks(Integer productId, ProductsFeedback related_productsfeedbacks) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		ProductsFeedback existingproductsFeedbacks = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(related_productsfeedbacks.getFeedbackId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsFeedbacks != null) {
			existingproductsFeedbacks.setFeedbackId(related_productsfeedbacks.getFeedbackId());
			existingproductsFeedbacks.setFeedbackComments(related_productsfeedbacks.getFeedbackComments());
			existingproductsFeedbacks.setFeedbackImage(related_productsfeedbacks.getFeedbackImage());
			existingproductsFeedbacks.setCreatedOn(related_productsfeedbacks.getCreatedOn());
			existingproductsFeedbacks.setCreatedBy(related_productsfeedbacks.getCreatedBy());
			existingproductsFeedbacks.setModifiedOn(related_productsfeedbacks.getModifiedOn());
			existingproductsFeedbacks.setModifiedBy(related_productsfeedbacks.getModifiedBy());
			related_productsfeedbacks = existingproductsFeedbacks;
		} else {
			related_productsfeedbacks = productsFeedbackDAO.store(related_productsfeedbacks);
			productsFeedbackDAO.flush();
		}

		related_productsfeedbacks.setProducts(products);
		products.getProductsFeedbacks().add(related_productsfeedbacks);
		related_productsfeedbacks = productsFeedbackDAO.store(related_productsfeedbacks);
		productsFeedbackDAO.flush();

		products = productsDAO.store(products);
		productsDAO.flush();

		return products;
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public Products deleteProductsProductsCategory(Integer products_productId, Integer related_productscategory_categoryId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);
		ProductsCategory related_productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(related_productscategory_categoryId, -1, -1);

		products.setProductsCategory(null);
		related_productscategory.getProductses().remove(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_productscategory = productsCategoryDAO.store(related_productscategory);
		productsCategoryDAO.flush();

		productsCategoryDAO.remove(related_productscategory);
		productsCategoryDAO.flush();

		return products;
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public Products deleteProductsProductsFeedbacks(Integer products_productId, Integer related_productsfeedbacks_feedbackId) {
		ProductsFeedback related_productsfeedbacks = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(related_productsfeedbacks_feedbackId, -1, -1);

		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		related_productsfeedbacks.setProducts(null);
		products.getProductsFeedbacks().remove(related_productsfeedbacks);

		productsFeedbackDAO.remove(related_productsfeedbacks);
		productsFeedbackDAO.flush();

		return products;
	}

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public Products deleteProductsProductsDescriptions(Integer products_productId, Integer related_productsdescriptions_productDescriptionId) {
		ProductsDescription related_productsdescriptions = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(related_productsdescriptions_productDescriptionId, -1, -1);

		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);

		related_productsdescriptions.setProducts(null);
		products.getProductsDescriptions().remove(related_productsdescriptions);

		productsDescriptionDAO.remove(related_productsdescriptions);
		productsDescriptionDAO.flush();

		return products;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public Products saveProductsCartItemses(Integer productId, CartItems related_cartitemses) {
		Products products = productsDAO.findProductsByPrimaryKey(productId, -1, -1);
		CartItems existingcartItemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses.getCartItemId());

		// copy into the existing record to preserve existing relationships
		if (existingcartItemses != null) {
			existingcartItemses.setCartItemId(related_cartitemses.getCartItemId());
			existingcartItemses.setProductTitle(related_cartitemses.getProductTitle());
			existingcartItemses.setProductCost(related_cartitemses.getProductCost());
			existingcartItemses.setProductQuantity(related_cartitemses.getProductQuantity());
			existingcartItemses.setStatus(related_cartitemses.getStatus());
			existingcartItemses.setCreatedOn(related_cartitemses.getCreatedOn());
			existingcartItemses.setCreatedBy(related_cartitemses.getCreatedBy());
			existingcartItemses.setModifiedOn(related_cartitemses.getModifiedOn());
			existingcartItemses.setModifiedBy(related_cartitemses.getModifiedBy());
			related_cartitemses = existingcartItemses;
		} else {
			related_cartitemses = cartItemsDAO.store(related_cartitemses);
			cartItemsDAO.flush();
		}

		related_cartitemses.setProducts(products);
		products.getCartItemses().add(related_cartitemses);
		related_cartitemses = cartItemsDAO.store(related_cartitemses);
		cartItemsDAO.flush();

		products = productsDAO.store(products);
		productsDAO.flush();

		return products;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public void deleteProducts(Products products) {
		productsDAO.remove(products);
		productsDAO.flush();
	}

	/**
	 */
	@Transactional
	public Products findProductsByPrimaryKey(Integer productId) {
		return productsDAO.findProductsByPrimaryKey(productId);
	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@Transactional
	public Products deleteProductsVendorProfile(Integer products_productId, Integer related_vendorprofile_registrationId) {
		Products products = productsDAO.findProductsByPrimaryKey(products_productId, -1, -1);
		VendorProfile related_vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile_registrationId, -1, -1);

		products.setVendorProfile(null);
		related_vendorprofile.getProductses().remove(products);
		products = productsDAO.store(products);
		productsDAO.flush();

		related_vendorprofile = vendorProfileDAO.store(related_vendorprofile);
		vendorProfileDAO.flush();

		vendorProfileDAO.remove(related_vendorprofile);
		vendorProfileDAO.flush();

		return products;
	}
}
