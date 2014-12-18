package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.OrderedItems;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderedItems entities.
 * 
 */
public interface OrderedItemsDAO extends JpaDao<OrderedItems> {

	/**
	 * JPQL Query - findOrderedItemsByPrimaryKey
	 *
	 */
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByPrimaryKey
	 *
	 */
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderedItemss
	 *
	 */
	public Set<OrderedItems> findAllOrderedItemss() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderedItemss
	 *
	 */
	public Set<OrderedItems> findAllOrderedItemss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedByContaining
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedByContaining
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedByContaining
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedByContaining
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedBy
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedBy
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByOrderItemId
	 *
	 */
	public OrderedItems findOrderedItemsByOrderItemId(Integer orderItemId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByOrderItemId
	 *
	 */
	public OrderedItems findOrderedItemsByOrderItemId(Integer orderItemId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedOn
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByCreatedOn
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedOn
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedOn
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByItemPrice
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByItemPrice(java.math.BigDecimal itemPrice) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByItemPrice
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByItemPrice(BigDecimal itemPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedBy
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderedItemsByModifiedBy
	 *
	 */
	public Set<OrderedItems> findOrderedItemsByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

}