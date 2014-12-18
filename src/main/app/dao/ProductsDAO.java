package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.Products;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Products entities.
 * 
 */
public interface ProductsDAO extends JpaDao<Products> {

	/**
	 * JPQL Query - findProductsByModifiedOn
	 *
	 */
	public Set<Products> findProductsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByModifiedOn
	 *
	 */
	public Set<Products> findProductsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByModifiedByContaining
	 *
	 */
	public Set<Products> findProductsByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByModifiedByContaining
	 *
	 */
	public Set<Products> findProductsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedByContaining
	 *
	 */
	public Set<Products> findProductsByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedByContaining
	 *
	 */
	public Set<Products> findProductsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductTitleContaining
	 *
	 */
	public Set<Products> findProductsByProductTitleContaining(String productTitle) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductTitleContaining
	 *
	 */
	public Set<Products> findProductsByProductTitleContaining(String productTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductId
	 *
	 */
	public Products findProductsByProductId(Integer productId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductId
	 *
	 */
	public Products findProductsByProductId(Integer productId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductTitle
	 *
	 */
	public Set<Products> findProductsByProductTitle(String productTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByProductTitle
	 *
	 */
	public Set<Products> findProductsByProductTitle(String productTitle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByModifiedBy
	 *
	 */
	public Set<Products> findProductsByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByModifiedBy
	 *
	 */
	public Set<Products> findProductsByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedBy
	 *
	 */
	public Set<Products> findProductsByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedBy
	 *
	 */
	public Set<Products> findProductsByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedOn
	 *
	 */
	public Set<Products> findProductsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCreatedOn
	 *
	 */
	public Set<Products> findProductsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByPercentageDiscount
	 *
	 */
	public Set<Products> findProductsByPercentageDiscount(java.math.BigDecimal percentageDiscount) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByPercentageDiscount
	 *
	 */
	public Set<Products> findProductsByPercentageDiscount(BigDecimal percentageDiscount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByStatus
	 *
	 */
	public Set<Products> findProductsByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByStatus
	 *
	 */
	public Set<Products> findProductsByStatus(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByDiscountPrice
	 *
	 */
	public Set<Products> findProductsByDiscountPrice(java.math.BigDecimal discountPrice) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByDiscountPrice
	 *
	 */
	public Set<Products> findProductsByDiscountPrice(BigDecimal discountPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBySalesPrice
	 *
	 */
	public Set<Products> findProductsBySalesPrice(java.math.BigDecimal salesPrice) throws DataAccessException;

	/**
	 * JPQL Query - findProductsBySalesPrice
	 *
	 */
	public Set<Products> findProductsBySalesPrice(BigDecimal salesPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByPrimaryKey
	 *
	 */
	public Products findProductsByPrimaryKey(Integer productId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByPrimaryKey
	 *
	 */
	public Products findProductsByPrimaryKey(Integer productId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductss
	 *
	 */
	public Set<Products> findAllProductss() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductss
	 *
	 */
	public Set<Products> findAllProductss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByQuantity
	 *
	 */
	public Set<Products> findProductsByQuantity(java.math.BigDecimal quantity) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByQuantity
	 *
	 */
	public Set<Products> findProductsByQuantity(BigDecimal quantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByStatusContaining
	 *
	 */
	public Set<Products> findProductsByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByStatusContaining
	 *
	 */
	public Set<Products> findProductsByStatusContaining(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCostPrice
	 *
	 */
	public Set<Products> findProductsByCostPrice(java.math.BigDecimal costPrice) throws DataAccessException;

	/**
	 * JPQL Query - findProductsByCostPrice
	 *
	 */
	public Set<Products> findProductsByCostPrice(BigDecimal costPrice, int startResult, int maxRows) throws DataAccessException;

}