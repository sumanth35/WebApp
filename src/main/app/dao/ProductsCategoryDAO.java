package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductsCategory;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductsCategory entities.
 * 
 */
public interface ProductsCategoryDAO extends JpaDao<ProductsCategory> {

	/**
	 * JPQL Query - findProductsCategoryByCreatedOn
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCreatedOn
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedByContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedByContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryCode
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryCode(String categoryCode) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryCode
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryCode(String categoryCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryName
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryName(String categoryName) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryName
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryName(String categoryName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryId
	 *
	 */
	public ProductsCategory findProductsCategoryByCategoryId(Integer categoryId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryId
	 *
	 */
	public ProductsCategory findProductsCategoryByCategoryId(Integer categoryId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCreatedBy
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCreatedBy
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryNameContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryNameContaining(String categoryName_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryNameContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryNameContaining(String categoryName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedBy
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedBy
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByPrimaryKey
	 *
	 */
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByPrimaryKey
	 *
	 */
	public ProductsCategory findProductsCategoryByPrimaryKey(Integer categoryId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCreatedByContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCreatedByContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsCategorys
	 *
	 */
	public Set<ProductsCategory> findAllProductsCategorys() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsCategorys
	 *
	 */
	public Set<ProductsCategory> findAllProductsCategorys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedOn
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByModifiedOn
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescriptionContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryDescriptionContaining(String categoryDescription) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescriptionContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryDescriptionContaining(String categoryDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescription
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryDescription(String categoryDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryDescription
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryDescription(String categoryDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryCodeContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryCodeContaining(String categoryCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsCategoryByCategoryCodeContaining
	 *
	 */
	public Set<ProductsCategory> findProductsCategoryByCategoryCodeContaining(String categoryCode_1, int startResult, int maxRows) throws DataAccessException;

}