package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.ProductImagesDAO;
import main.app.dao.ProductsDAO;

import main.app.domain.CartItems;
import main.app.domain.ProductImages;
import main.app.domain.Products;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductImages entities
 * 
 */

@Service("ProductImagesService")
@Transactional
public class ProductImagesServiceImpl implements ProductImagesService {

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
	 * DAO injected by Spring that manages Products entities
	 * 
	 */
	@Autowired
	private ProductsDAO productsDAO;

	/**
	 * Instantiates a new ProductImagesServiceImpl.
	 *
	 */
	public ProductImagesServiceImpl() {
	}

	/**
	 * Load an existing ProductImages entity
	 * 
	 */
	@Transactional
	public Set<ProductImages> loadProductImagess() {
		return productImagesDAO.findAllProductImagess();
	}

	/**
	 * Delete an existing ProductImages entity
	 * 
	 */
	@Transactional
	public void deleteProductImages(ProductImages productimages) {
		productImagesDAO.remove(productimages);
		productImagesDAO.flush();
	}

	/**
	 * Return all ProductImages entity
	 * 
	 */
	@Transactional
	public List<ProductImages> findAllProductImagess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductImages>(productImagesDAO.findAllProductImagess(startResult, maxRows));
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public ProductImages saveProductImagesCartItemses(Integer productImageId, CartItems related_cartitemses) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productImageId, -1, -1);
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

		related_cartitemses.setProductImages(productimages);
		productimages.getCartItemses().add(related_cartitemses);
		related_cartitemses = cartItemsDAO.store(related_cartitemses);
		cartItemsDAO.flush();

		productimages = productImagesDAO.store(productimages);
		productImagesDAO.flush();

		return productimages;
	}

	/**
	 */
	@Transactional
	public ProductImages findProductImagesByPrimaryKey(Integer productImageId) {
		return productImagesDAO.findProductImagesByPrimaryKey(productImageId);
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public ProductImages deleteProductImagesProducts(Integer productimages_productImageId, Integer related_products_productId) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimages_productImageId, -1, -1);
		Products related_products = productsDAO.findProductsByPrimaryKey(related_products_productId, -1, -1);

		productimages.setProducts(null);
		related_products.getProductImageses().remove(productimages);
		productimages = productImagesDAO.store(productimages);
		productImagesDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		productsDAO.remove(related_products);
		productsDAO.flush();

		return productimages;
	}

	/**
	 * Save an existing ProductImages entity
	 * 
	 */
	@Transactional
	public void saveProductImages(ProductImages productimages) {
		ProductImages existingProductImages = productImagesDAO.findProductImagesByPrimaryKey(productimages.getProductImageId());

		if (existingProductImages != null) {
			if (existingProductImages != productimages) {
				existingProductImages.setProductImageId(productimages.getProductImageId());
				existingProductImages.setProductPrimaryImage(productimages.getProductPrimaryImage());
				existingProductImages.setProductSecondaryImage1(productimages.getProductSecondaryImage1());
				existingProductImages.setProductSecondaryImage2(productimages.getProductSecondaryImage2());
				existingProductImages.setProductSecondaryImage3(productimages.getProductSecondaryImage3());
				existingProductImages.setProductSecondaryImage4(productimages.getProductSecondaryImage4());
				existingProductImages.setProductSecondaryImage5(productimages.getProductSecondaryImage5());
				existingProductImages.setProductVideo(productimages.getProductVideo());
				existingProductImages.setCreatedOn(productimages.getCreatedOn());
				existingProductImages.setCreatedBy(productimages.getCreatedBy());
				existingProductImages.setModifiedOn(productimages.getModifiedOn());
				existingProductImages.setModifiedBy(productimages.getModifiedBy());
			}
			productimages = productImagesDAO.store(existingProductImages);
		} else {
			productimages = productImagesDAO.store(productimages);
		}
		productImagesDAO.flush();
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public ProductImages deleteProductImagesCartItemses(Integer productimages_productImageId, Integer related_cartitemses_cartItemId) {
		CartItems related_cartitemses = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitemses_cartItemId, -1, -1);

		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productimages_productImageId, -1, -1);

		related_cartitemses.setProductImages(null);
		productimages.getCartItemses().remove(related_cartitemses);

		cartItemsDAO.remove(related_cartitemses);
		cartItemsDAO.flush();

		return productimages;
	}

	/**
	 * Return a count of all ProductImages entity
	 * 
	 */
	@Transactional
	public Integer countProductImagess() {
		return ((Long) productImagesDAO.createQuerySingleResult("select count(o) from ProductImages o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public ProductImages saveProductImagesProducts(Integer productImageId, Products related_products) {
		ProductImages productimages = productImagesDAO.findProductImagesByPrimaryKey(productImageId, -1, -1);
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

		productimages.setProducts(related_products);
		related_products.getProductImageses().add(productimages);
		productimages = productImagesDAO.store(productimages);
		productImagesDAO.flush();

		related_products = productsDAO.store(related_products);
		productsDAO.flush();

		return productimages;
	}
}
