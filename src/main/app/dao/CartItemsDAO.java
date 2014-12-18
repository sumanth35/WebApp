package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.CartItems;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CartItems entities.
 * 
 */
public interface CartItemsDAO extends JpaDao<CartItems> {

	/**
	 * JPQL Query - findCartItemsByModifiedBy
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByModifiedBy
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedBy
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedBy
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedByContaining
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedByContaining
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductQuantity
	 *
	 */
	public Set<CartItems> findCartItemsByProductQuantity(java.math.BigDecimal productQuantity) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductQuantity
	 *
	 */
	public Set<CartItems> findCartItemsByProductQuantity(BigDecimal productQuantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductTitleContaining
	 *
	 */
	public Set<CartItems> findCartItemsByProductTitleContaining(String productTitle) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductTitleContaining
	 *
	 */
	public Set<CartItems> findCartItemsByProductTitleContaining(String productTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByStatus
	 *
	 */
	public Set<CartItems> findCartItemsByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByStatus
	 *
	 */
	public Set<CartItems> findCartItemsByStatus(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedOn
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCreatedOn
	 *
	 */
	public Set<CartItems> findCartItemsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCartItemId
	 *
	 */
	public CartItems findCartItemsByCartItemId(Integer cartItemId) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByCartItemId
	 *
	 */
	public CartItems findCartItemsByCartItemId(Integer cartItemId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByModifiedOn
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByModifiedOn
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCartItemss
	 *
	 */
	public Set<CartItems> findAllCartItemss() throws DataAccessException;

	/**
	 * JPQL Query - findAllCartItemss
	 *
	 */
	public Set<CartItems> findAllCartItemss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByModifiedByContaining
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByModifiedByContaining
	 *
	 */
	public Set<CartItems> findCartItemsByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByStatusContaining
	 *
	 */
	public Set<CartItems> findCartItemsByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByStatusContaining
	 *
	 */
	public Set<CartItems> findCartItemsByStatusContaining(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductCost
	 *
	 */
	public Set<CartItems> findCartItemsByProductCost(java.math.BigDecimal productCost) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductCost
	 *
	 */
	public Set<CartItems> findCartItemsByProductCost(BigDecimal productCost, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductTitle
	 *
	 */
	public Set<CartItems> findCartItemsByProductTitle(String productTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByProductTitle
	 *
	 */
	public Set<CartItems> findCartItemsByProductTitle(String productTitle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByPrimaryKey
	 *
	 */
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId_1) throws DataAccessException;

	/**
	 * JPQL Query - findCartItemsByPrimaryKey
	 *
	 */
	public CartItems findCartItemsByPrimaryKey(Integer cartItemId_1, int startResult, int maxRows) throws DataAccessException;

}