package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.ProductsBrandDAO;
import main.app.dao.ProductsCategoryDAO;

import main.app.domain.ProductsBrand;
import main.app.domain.ProductsCategory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ProductsBrand entities
 * 
 */

@Service("ProductsBrandService")
@Transactional
public class ProductsBrandServiceImpl implements ProductsBrandService {

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
	 * Instantiates a new ProductsBrandServiceImpl.
	 *
	 */
	public ProductsBrandServiceImpl() {
	}

	/**
	 * Delete an existing ProductsBrand entity
	 * 
	 */
	@Transactional
	public void deleteProductsBrand(ProductsBrand productsbrand) {
		productsBrandDAO.remove(productsbrand);
		productsBrandDAO.flush();
	}

	/**
	 */
	@Transactional
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId) {
		return productsBrandDAO.findProductsBrandByPrimaryKey(brandId);
	}

	/**
	 * Save an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public ProductsBrand saveProductsBrandProductsCategory(Integer brandId, ProductsCategory related_productscategory) {
		ProductsBrand productsbrand = productsBrandDAO.findProductsBrandByPrimaryKey(brandId, -1, -1);
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

		productsbrand.setProductsCategory(related_productscategory);
		related_productscategory.getProductsBrands().add(productsbrand);
		productsbrand = productsBrandDAO.store(productsbrand);
		productsBrandDAO.flush();

		related_productscategory = productsCategoryDAO.store(related_productscategory);
		productsCategoryDAO.flush();

		return productsbrand;
	}

	/**
	 * Return a count of all ProductsBrand entity
	 * 
	 */
	@Transactional
	public Integer countProductsBrands() {
		return ((Long) productsBrandDAO.createQuerySingleResult("select count(o) from ProductsBrand o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ProductsBrand entity
	 * 
	 */
	@Transactional
	public void saveProductsBrand(ProductsBrand productsbrand) {
		ProductsBrand existingProductsBrand = productsBrandDAO.findProductsBrandByPrimaryKey(productsbrand.getBrandId());

		if (existingProductsBrand != null) {
			if (existingProductsBrand != productsbrand) {
				existingProductsBrand.setBrandId(productsbrand.getBrandId());
				existingProductsBrand.setBrandName(productsbrand.getBrandName());
				existingProductsBrand.setBrandDescription(productsbrand.getBrandDescription());
				existingProductsBrand.setBrandCode(productsbrand.getBrandCode());
				existingProductsBrand.setCreatedBy(productsbrand.getCreatedBy());
				existingProductsBrand.setCreatedOn(productsbrand.getCreatedOn());
				existingProductsBrand.setModifiedBy(productsbrand.getModifiedBy());
				existingProductsBrand.setModifiedOn(productsbrand.getModifiedOn());
			}
			productsbrand = productsBrandDAO.store(existingProductsBrand);
		} else {
			productsbrand = productsBrandDAO.store(productsbrand);
		}
		productsBrandDAO.flush();
	}

	/**
	 * Return all ProductsBrand entity
	 * 
	 */
	@Transactional
	public List<ProductsBrand> findAllProductsBrands(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProductsBrand>(productsBrandDAO.findAllProductsBrands(startResult, maxRows));
	}

	/**
	 * Load an existing ProductsBrand entity
	 * 
	 */
	@Transactional
	public Set<ProductsBrand> loadProductsBrands() {
		return productsBrandDAO.findAllProductsBrands();
	}

	/**
	 * Delete an existing ProductsCategory entity
	 * 
	 */
	@Transactional
	public ProductsBrand deleteProductsBrandProductsCategory(Integer productsbrand_brandId, Integer related_productscategory_categoryId) {
		ProductsBrand productsbrand = productsBrandDAO.findProductsBrandByPrimaryKey(productsbrand_brandId, -1, -1);
		ProductsCategory related_productscategory = productsCategoryDAO.findProductsCategoryByPrimaryKey(related_productscategory_categoryId, -1, -1);

		productsbrand.setProductsCategory(null);
		related_productscategory.getProductsBrands().remove(productsbrand);
		productsbrand = productsBrandDAO.store(productsbrand);
		productsBrandDAO.flush();

		related_productscategory = productsCategoryDAO.store(related_productscategory);
		productsCategoryDAO.flush();

		productsCategoryDAO.remove(related_productscategory);
		productsCategoryDAO.flush();

		return productsbrand;
	}
}
