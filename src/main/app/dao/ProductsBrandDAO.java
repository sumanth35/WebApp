package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductsBrand;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductsBrand entities.
 * 
 */
public interface ProductsBrandDAO extends JpaDao<ProductsBrand> {

	/**
	 * JPQL Query - findProductsBrandByBrandDescription
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandDescription(String brandDescription) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandDescription
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandDescription(String brandDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandCodeContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandCodeContaining(String brandCode) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandCodeContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandCodeContaining(String brandCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedBy
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedBy
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandNameContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandNameContaining(String brandName) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandNameContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandNameContaining(String brandName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByPrimaryKey
	 *
	 */
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByPrimaryKey
	 *
	 */
	public ProductsBrand findProductsBrandByPrimaryKey(Integer brandId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedBy
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedBy
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandDescriptionContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandDescriptionContaining(String brandDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandDescriptionContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandDescriptionContaining(String brandDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedOn
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedOn
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedByContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedByContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandId
	 *
	 */
	public ProductsBrand findProductsBrandByBrandId(Integer brandId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandId
	 *
	 */
	public ProductsBrand findProductsBrandByBrandId(Integer brandId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsBrands
	 *
	 */
	public Set<ProductsBrand> findAllProductsBrands() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsBrands
	 *
	 */
	public Set<ProductsBrand> findAllProductsBrands(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandName
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandName(String brandName_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandName
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandName(String brandName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandCode
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandCode(String brandCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByBrandCode
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByBrandCode(String brandCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedOn
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByCreatedOn
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedByContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBrandByModifiedByContaining
	 *
	 */
	public Set<ProductsBrand> findProductsBrandByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

}