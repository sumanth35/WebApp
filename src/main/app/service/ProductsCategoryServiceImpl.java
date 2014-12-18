package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.ProductsBrandDAO;
import main.app.dao.ProductsCategoryDAO;
import main.app.dao.ProductsDAO;

import main.app.domain.Products;
import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductsCategory entities
 * 
 */

@Service("ProductsCategoryService")
@Transactional
public class ProductsCategoryServiceImpl implements ProductsCategoryService {

	/**
	 * DAO injected by Spring that manages ProductsBrand entities
	 * 
	 */
	@Autowired
	private ProductsBrandDAO productsBrandDAO;

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
	 * Instantiates a new ProductsCategoryServiceImpl.
	 *
	 */
	public ProductsCategoryServiceImpl() {
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public void saveProductsCategory(ProductsCategory productscategory) {
		ProductsCategory existingProductsCategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory.getCategoryId());

		if (existingProductsCategory != null) {
			if (existingProductsCategory != productscategory) {
				existingProductsCategory.setCategoryId(productscategory.getCategoryId());
				existingProductsCategory.setCategoryName(productscategory.getCategoryName());
				existingProductsCategory.setCategoryDescription(productscategory.getCategoryDescription());
				existingProductsCategory.setCategoryCode(productscategory.getCategoryCode());
				existingProductsCategory.setCreatedBy(productscategory.getCreatedBy());
				existingProductsCategory.setCreatedOn(productscategory.getCreatedOn());
				existingProductsCategory.setModifiedBy(productscategory.getModifiedBy());
				existingProductsCategory.setModifiedOn(productscategory.getModifiedOn());
			}
			productscategory = productsCategoryDAO.store(existingProductsCategory);
		} else {
			productscategory = productsCategoryDAO.store(productscategory);
		}
		productsCategoryDAO.flush();
	}

	/**
	 * Return all ProductsCategory entity
	 * 
	 */
	@Transactional
	public List<ProductsCategory> findAllProductsCategorys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductsCategory>(productsCategoryDAO.findAllProductsCategorys(startResult, maxRows));
	}

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@Transactional
	public ProductsCategory saveProductsCategoryProductsBrands(Integer categoryId, ProductsBrand related_productsbrands) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryId, -1, -1);
		ProductsBrand existingproductsBrands = productsBrandDAO.findProductsBrandByPrimaryKey(related_productsbrands.getBrandId());

		// copy into the existing record to preserve existing relationships
		if (existingproductsBrands != null) {
			existingproductsBrands.setBrandId(related_productsbrands.getBrandId());
			existingproductsBrands.setBrandName(related_productsbrands.getBrandName());
			existingproductsBrands.setBrandDescription(related_productsbrands.getBrandDescription());
			existingproductsBrands.setBrandCode(related_productsbrands.getBrandCode());
			existingproductsBrands.setCreatedBy(related_productsbrands.getCreatedBy());
			existingproductsBrands.setCreatedOn(related_productsbrands.getCreatedOn());
			existingproductsBrands.setModifiedBy(related_productsbrands.getModifiedBy());
			existingproductsBrands.setModifiedOn(related_productsbrands.getModifiedOn());
			related_productsbrands = existingproductsBrands;
		}

		related_productsbrands.setProductsCategory(productscategory);
		productscategory.getProductsBrands().add(related_productsbrands);
		related_productsbrands = productsBrandDAO.store(related_productsbrands);
		productsBrandDAO.flush();

		productscategory = productsCategoryDAO.store(productscategory);
		productsCategoryDAO.flush();

		return productscategory;
	}

	/**
	 * Delete an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsCategory deleteProductsCategoryProductses(Integer productscategory_categoryId, Integer related_productses_productId) {
		Products related_productses = productsDAO.findProductsByPrimaryKey(related_productses_productId, -1, -1);

		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		related_productses.setProductsCategory(null);
		productscategory.getProductses().remove(related_productses);

		productsDAO.remove(related_productses);
		productsDAO.flush();

		return productscategory;
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public void deleteProductsCategory(ProductsCategory productscategory) {
		productsCategoryDAO.remove(productscategory);
		productsCategoryDAO.flush();
	}

	/**
	 * Save an existing Products entity
	 * 
	 */
	@Transactional
	public ProductsCategory saveProductsCategoryProductses(Integer categoryId, Products related_productses) {
		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryId, -1, -1);
		Products existingproductses = productsDAO.findProductsByPrimaryKey(related_productses.getProductId());

		// copy into the existing record to preserve existing relationships
		if (existingproductses != null) {
			existingproductses.setProductId(related_productses.getProductId());
			existingproductses.setProductTitle(related_productses.getProductTitle());
			existingproductses.setSalesPrice(related_productses.getSalesPrice());
			existingproductses.setCostPrice(related_productses.getCostPrice());
			existingproductses.setDiscountPrice(related_productses.getDiscountPrice());
			existingproductses.setPercentageDiscount(related_productses.getPercentageDiscount());
			existingproductses.setCreatedOn(related_productses.getCreatedOn());
			existingproductses.setCreatedBy(related_productses.getCreatedBy());
			existingproductses.setModifiedOn(related_productses.getModifiedOn());
			existingproductses.setModifiedBy(related_productses.getModifiedBy());
			existingproductses.setStatus(related_productses.getStatus());
			existingproductses.setQuantity(related_productses.getQuantity());
			related_productses = existingproductses;
		}

		related_productses.setProductsCategory(productscategory);
		productscategory.getProductses().add(related_productses);
		related_productses = productsDAO.store(related_productses);
		productsDAO.flush();

		productscategory = productsCategoryDAO.store(productscategory);
		productsCategoryDAO.flush();

		return productscategory;
	}

	/**
	 * Return a count of all ProductsCategory entity
	 * 
	 */
	@Transactional
	public Integer countProductsCategorys() {
		return ((Long) productsCategoryDAO.createQuerySingleResult("select count(o) from ProductsCategory o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId) {
		return productsCategoryDAO.findProductsCategoryByPrimaryKey(categoryId);
	}

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@Transactional
	public ProductsCategory deleteProductsCategoryProductsBrands(Integer productscategory_categoryId, Integer related_productsbrands_brandId) {
		ProductsBrand related_productsbrands = productsBrandDAO.findProductsBrandByPrimaryKey(related_productsbrands_brandId, -1, -1);

		ProductsCategory productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(productscategory_categoryId, -1, -1);

		related_productsbrands.setProductsCategory(null);
		productscategory.getProductsBrands().remove(related_productsbrands);

		productsBrandDAO.remove(related_productsbrands);
		productsBrandDAO.flush();

		return productscategory;
	}

	/**
	 * Load an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public Set<ProductsCategory> loadProductsCategorys() {
		return productsCategoryDAO.findAllProductsCategorys();
	}
}
