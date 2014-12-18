package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CustomerProfileDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsFeedbackDAO;
import main.app.dao.ProductsRatingDAO;

import main.app.domain.CustomerProfile;
import main.app.domain.Products;
import main.app.domain.ProductsFeedback;
import main.app.domain.ProductsRating;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductsRating entities
 * 
 */

@Service("ProductsRatingService")
@Transactional
public class ProductsRatingServiceImpl implements ProductsRatingService {

	/**
	 * DAO injected by Spring that manages CustomerProfile entities
	 * 
	 */
	@Autowired
	private CustomerProfileDAO customerProfileDAO;

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
	 * Instantiates a new ProductsRatingServiceImpl.
	 *
	 */
	public ProductsRatingServiceImpl() {
	}

	/**
	 * Return all ProductsRating entity
	 * 
	 */
	@Transactional
	public List<ProductsRating> findAllProductsRatings(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductsRating>(productsRatingDAO.findAllProductsRatings(startResult, maxRows));
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsRating deleteProductsRatingProducts(Integer productsrating_productRatingId, Integer related_products_productId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating_productRatingId, -1, -1);
		Products related_products = productsDAO.findProductsByPrimaryKey(related_products_productId, -1, -1);

		productsrating.setProducts(null);
		related_products.getProductsRatings().remove(productsrating);
		productsrating = productsRatingDAO.store(productsrating);
		productsRatingDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		productsDAO.remove(related_products);
		productsDAO.flush();

		return productsrating;
	}

	/**
	 * Delete an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public ProductsRating deleteProductsRatingCustomerProfile(Integer productsrating_productRatingId, Integer related_customerprofile_customerId) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating_productRatingId, -1, -1);
		CustomerProfile related_customerprofile = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile_customerId, -1, -1);

		productsrating.setCustomerProfile(null);
		related_customerprofile.getProductsRatings().remove(productsrating);
		productsrating = productsRatingDAO.store(productsrating);
		productsRatingDAO.flush();

		related_customerprofile = customerProfileDAO.store(related_customerprofile);
		customerProfileDAO.flush();

		customerProfileDAO.remove(related_customerprofile);
		customerProfileDAO.flush();

		return productsrating;
	}

	/**
	 * Save an existing CustomerProfile entity
	 * 
	 */
	@Transactional
	public ProductsRating saveProductsRatingCustomerProfile(Integer productRatingId, CustomerProfile related_customerprofile) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productRatingId, -1, -1);
		CustomerProfile existingcustomerProfile = customerProfileDAO.findCustomerProfileByPrimaryKey(related_customerprofile.getCustomerId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomerProfile != null) {
			existingcustomerProfile.setCustomerId(related_customerprofile.getCustomerId());
			existingcustomerProfile.setCustomerName(related_customerprofile.getCustomerName());
			existingcustomerProfile.setCustomerPassword(related_customerprofile.getCustomerPassword());
			existingcustomerProfile.setCustomerEmail(related_customerprofile.getCustomerEmail());
			existingcustomerProfile.setProfileStatus(related_customerprofile.getProfileStatus());
			existingcustomerProfile.setPhone1(related_customerprofile.getPhone1());
			existingcustomerProfile.setPhone2(related_customerprofile.getPhone2());
			existingcustomerProfile.setFirstName(related_customerprofile.getFirstName());
			existingcustomerProfile.setLastName(related_customerprofile.getLastName());
			existingcustomerProfile.setMiddleName(related_customerprofile.getMiddleName());
			existingcustomerProfile.setNameSuffix(related_customerprofile.getNameSuffix());
			existingcustomerProfile.setNameTitle(related_customerprofile.getNameTitle());
			existingcustomerProfile.setLastSuccessLogin(related_customerprofile.getLastSuccessLogin());
			existingcustomerProfile.setVisits(related_customerprofile.getVisits());
			existingcustomerProfile.setCreatedIp(related_customerprofile.getCreatedIp());
			existingcustomerProfile.setAddressLine1(related_customerprofile.getAddressLine1());
			existingcustomerProfile.setAddressLine2(related_customerprofile.getAddressLine2());
			existingcustomerProfile.setAddressLine3(related_customerprofile.getAddressLine3());
			existingcustomerProfile.setZipCode5(related_customerprofile.getZipCode5());
			existingcustomerProfile.setZipCode4(related_customerprofile.getZipCode4());
			existingcustomerProfile.setLastLoginIp(related_customerprofile.getLastLoginIp());
			existingcustomerProfile.setCreatedOn(related_customerprofile.getCreatedOn());
			existingcustomerProfile.setCreatedBy(related_customerprofile.getCreatedBy());
			existingcustomerProfile.setModifiedOn(related_customerprofile.getModifiedOn());
			existingcustomerProfile.setModifiedBy(related_customerprofile.getModifiedBy());
			related_customerprofile = existingcustomerProfile;
		} else {
			related_customerprofile = customerProfileDAO.store(related_customerprofile);
			customerProfileDAO.flush();
		}

		productsrating.setCustomerProfile(related_customerprofile);
		related_customerprofile.getProductsRatings().add(productsrating);
		productsrating = productsRatingDAO.store(productsrating);
		productsRatingDAO.flush();

		related_customerprofile = customerProfileDAO.store(related_customerprofile);
		customerProfileDAO.flush();

		return productsrating;
	}

	/**
	 * Return a count of all ProductsRating entity
	 * 
	 */
	@Transactional
	public Integer countProductsRatings() {
		return ((Long) productsRatingDAO.createQuerySingleResult("select count(o) from ProductsRating o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public ProductsRating saveProductsRatingProductsFeedbacks(Integer productRatingId, ProductsFeedback related_productsfeedbacks) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productRatingId, -1, -1);
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

		related_productsfeedbacks.setProductsRating(productsrating);
		productsrating.getProductsFeedbacks().add(related_productsfeedbacks);
		related_productsfeedbacks = productsFeedbackDAO.store(related_productsfeedbacks);
		productsFeedbackDAO.flush();

		productsrating = productsRatingDAO.store(productsrating);
		productsRatingDAO.flush();

		return productsrating;
	}

	/**
	 * Delete an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public void deleteProductsRating(ProductsRating productsrating) {
		productsRatingDAO.remove(productsrating);
		productsRatingDAO.flush();
	}

	/**
	 * Save an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public void saveProductsRating(ProductsRating productsrating) {
		ProductsRating existingProductsRating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating.getProductRatingId());

		if (existingProductsRating != null) {
			if (existingProductsRating != productsrating) {
				existingProductsRating.setProductRatingId(productsrating.getProductRatingId());
				existingProductsRating.setProductRating(productsrating.getProductRating());
				existingProductsRating.setCreatedOn(productsrating.getCreatedOn());
				existingProductsRating.setCreatedBy(productsrating.getCreatedBy());
				existingProductsRating.setModifiedOn(productsrating.getModifiedOn());
				existingProductsRating.setModifiedBy(productsrating.getModifiedBy());
			}
			productsrating = productsRatingDAO.store(existingProductsRating);
		} else {
			productsrating = productsRatingDAO.store(productsrating);
		}
		productsRatingDAO.flush();
	}

	/**
	 * Load an existing ProductsRating entity
	 * 
	 */
	@Transactional
	public Set<ProductsRating> loadProductsRatings() {
		return productsRatingDAO.findAllProductsRatings();
	}

	/**
	 */
	@Transactional
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId) {
		return productsRatingDAO.findProductsRatingByPrimaryKey(productRatingId);
	}

	/**
	 * Delete an existing ProductsFeedback entity
	 * 
	 */
	@Transactional
	public ProductsRating deleteProductsRatingProductsFeedbacks(Integer productsrating_productRatingId, Integer related_productsfeedbacks_feedbackId) {
		ProductsFeedback related_productsfeedbacks = productsFeedbackDAO.findProductsFeedbackByPrimaryKey(related_productsfeedbacks_feedbackId, -1, -1);

		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productsrating_productRatingId, -1, -1);

		related_productsfeedbacks.setProductsRating(null);
		productsrating.getProductsFeedbacks().remove(related_productsfeedbacks);

		productsFeedbackDAO.remove(related_productsfeedbacks);
		productsFeedbackDAO.flush();

		return productsrating;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsRating saveProductsRatingProducts(Integer productRatingId, Products related_products) {
		ProductsRating productsrating = productsRatingDAO.findProductsRatingByPrimaryKey(productRatingId, -1, -1);
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

		productsrating.setProducts(related_products);
		related_products.getProductsRatings().add(productsrating);
		productsrating = productsRatingDAO.store(productsrating);
		productsRatingDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		return productsrating;
	}
}
