package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ProductsRating;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProductsRating entities.
 * 
 */
public interface ProductsRatingDAO extends JpaDao<ProductsRating> {

	/**
	 * JPQL Query - findProductsRatingByPrimaryKey
	 *
	 */
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByPrimaryKey
	 *
	 */
	public ProductsRating findProductsRatingByPrimaryKey(Integer productRatingId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedBy
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedBy
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedOn
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedOn
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedBy
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedBy
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedByContaining
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByCreatedByContaining
	 *
	 */
	public Set<ProductsRating> findProductsRatingByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByProductRating
	 *
	 */
	public Set<ProductsRating> findProductsRatingByProductRating(java.math.BigDecimal productRating) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByProductRating
	 *
	 */
	public Set<ProductsRating> findProductsRatingByProductRating(BigDecimal productRating, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsRatings
	 *
	 */
	public Set<ProductsRating> findAllProductsRatings() throws DataAccessException;

	/**
	 * JPQL Query - findAllProductsRatings
	 *
	 */
	public Set<ProductsRating> findAllProductsRatings(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByProductRatingId
	 *
	 */
	public ProductsRating findProductsRatingByProductRatingId(Integer productRatingId_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByProductRatingId
	 *
	 */
	public ProductsRating findProductsRatingByProductRatingId(Integer productRatingId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedOn
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedOn
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedByContaining
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductsRatingByModifiedByContaining
	 *
	 */
	public Set<ProductsRating> findProductsRatingByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

}