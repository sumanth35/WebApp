package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductsDAO;
import main.app.dao.ProductsDescriptionDAO;

import main.app.domain.CartItems;
import main.app.domain.Products;
import main.app.domain.ProductsDescription;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductsDescription entities
 * 
 */

@Service("ProductsDescriptionService")
@Transactional
public class ProductsDescriptionServiceImpl implements
		ProductsDescriptionService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

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
	 * Instantiates a new ProductsDescriptionServiceImpl.
	 *
	 */
	public ProductsDescriptionServiceImpl() {
	}

	/**
	 * Save an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public void saveProductsDescription(ProductsDescription productsdescription) {
		ProductsDescription existingProductsDescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescription.getProductDescriptionId());

		if (existingProductsDescription != null) {
			if (existingProductsDescription != productsdescription) {
				existingProductsDescription.setProductDescriptionId(productsdescription.getProductDescriptionId());
				existingProductsDescription.setProductPrimaryDescription(productsdescription.getProductPrimaryDescription());
				existingProductsDescription.setProductSecondaryDescription1(productsdescription.getProductSecondaryDescription1());
				existingProductsDescription.setProductSecondaryDescription2(productsdescription.getProductSecondaryDescription2());
				existingProductsDescription.setProductSecondaryDescription3(productsdescription.getProductSecondaryDescription3());
				existingProductsDescription.setProductSecondaryDescription4(productsdescription.getProductSecondaryDescription4());
				existingProductsDescription.setProductSecondaryDescription5(productsdescription.getProductSecondaryDescription5());
				existingProductsDescription.setProductColor(productsdescription.getProductColor());
				existingProductsDescription.setProductDimensionLength(productsdescription.getProductDimensionLength());
				existingProductsDescription.setProductDimensionBreadth(productsdescription.getProductDimensionBreadth());
				existingProductsDescription.setProductDimensionHeight(productsdescription.getProductDimensionHeight());
				existingProductsDescription.setProductWeight(productsdescription.getProductWeight());
				existingProductsDescription.setProductNumber(productsdescription.getProductNumber());
				existingProductsDescription.setProductModelNumber(productsdescription.getProductModelNumber());
				existingProductsDescription.setProductOrigin(productsdescription.getProductOrigin());
				existingProductsDescription.setCreatedBy(productsdescription.getCreatedBy());
				existingProductsDescription.setCreatedOn(productsdescription.getCreatedOn());
				existingProductsDescription.setModifiedBy(productsdescription.getModifiedBy());
				existingProductsDescription.setModifiedOn(productsdescription.getModifiedOn());
			}
			productsdescription = productsDescriptionDAO.store(existingProductsDescription);
		} else {
			productsdescription = productsDescriptionDAO.store(productsdescription);
		}
		productsDescriptionDAO.flush();
	}

	/**
	 * Load an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public Set<ProductsDescription> loadProductsDescriptions() {
		return productsDescriptionDAO.findAllProductsDescriptions();
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public ProductsDescription saveProductsDescriptionCartItemses(Integer productDescriptionId, CartItems related_cartitemses) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionId, -1, -1);
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

		related_cartitemses.setProductsDescription(productsdescription);
		productsdescription.getCartItemses().add(related_cartitemses);
		related_cartitemses = cartItemsDAO.store(related_cartitemses);
		cartItemsDAO.flush();

		productsdescription = productsDescriptionDAO.store(productsdescription);
		productsDescriptionDAO.flush();

		return productsdescription;
	}

	/**
	 * Return a count of all ProductsDescription entity
	 * 
	 */
	@Transactional
	public Integer countProductsDescriptions() {
		return ((Long) productsDescriptionDAO.createQuerySingleResult("select count(o) from ProductsDescription o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public ProductsDescription findProductsDescriptionByPrimaryKey(Integer productDescriptionId) {
		return productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionId);
	}

	/**
	 * Delete an existing ProductsDescription entity
	 * 
	 */
	@Transactional
	public void deleteProductsDescription(ProductsDescription productsdescription) {
		productsDescriptionDAO.remove(productsdescription);
		productsDescriptionDAO.flush();
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public ProductsDescription deleteProductsDescriptionCartItemses(Integer productsdescription_productDescriptionId, Integer related_cartitemses_cartItemId) {
		CartItems related_cartitemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId, -1, -1);

		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescription_productDescriptionId, -1, -1);

		related_cartitemses.setProductsDescription(null);
		productsdescription.getCartItemses().remove(related_cartitemses);

		cartItemsDAO.remove(related_cartitemses);
		cartItemsDAO.flush();

		return productsdescription;
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsDescription saveProductsDescriptionProducts(Integer productDescriptionId, Products related_products) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productDescriptionId, -1, -1);
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
		}

		productsdescription.setProducts(related_products);
		related_products.getProductsDescriptions().add(productsdescription);
		productsdescription = productsDescriptionDAO.store(productsdescription);
		productsDescriptionDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		return productsdescription;
	}

	/**
	 * Return all ProductsDescription entity
	 * 
	 */
	@Transactional
	public List<ProductsDescription> findAllProductsDescriptions(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductsDescription>(productsDescriptionDAO.findAllProductsDescriptions(startResult, maxRows));
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsDescription deleteProductsDescriptionProducts(Integer productsdescription_productDescriptionId, Integer related_products_productId) {
		ProductsDescription productsdescription = productsDescriptionDAO.findProductsDescriptionByPrimaryKey(productsdescription_productDescriptionId, -1, -1);
		Products related_products = productsDAO.findProductsByPrimaryKey(related_products_productId, -1, -1);

		productsdescription.setProducts(null);
		related_products.getProductsDescriptions().remove(productsdescription);
		productsdescription = productsDescriptionDAO.store(productsdescription);
		productsDescriptionDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		productsDAO.remove(related_products);
		productsDAO.flush();

		return productsdescription;
	}
}
