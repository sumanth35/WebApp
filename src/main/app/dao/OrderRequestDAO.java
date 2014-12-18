package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.OrderRequest;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderRequest entities.
 * 
 */
public interface OrderRequestDAO extends JpaDao<OrderRequest> {

	/**
	 * JPQL Query - findOrderRequestByTax
	 *
	 */
	public Set<OrderRequest> findOrderRequestByTax(java.math.BigDecimal tax) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByTax
	 *
	 */
	public Set<OrderRequest> findOrderRequestByTax(BigDecimal tax, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedByContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedByContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderRequestId
	 *
	 */
	public OrderRequest findOrderRequestByOrderRequestId(Integer orderRequestId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderRequestId
	 *
	 */
	public OrderRequest findOrderRequestByOrderRequestId(Integer orderRequestId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumberContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumberContaining(String orderConfirmationNumber) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumberContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumberContaining(String orderConfirmationNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedBy
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedBy
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedOn
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedOn
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderRequests
	 *
	 */
	public Set<OrderRequest> findAllOrderRequests() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderRequests
	 *
	 */
	public Set<OrderRequest> findAllOrderRequests(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedByContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedByContaining
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByTotalCost
	 *
	 */
	public Set<OrderRequest> findOrderRequestByTotalCost(java.math.BigDecimal totalCost) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByTotalCost
	 *
	 */
	public Set<OrderRequest> findOrderRequestByTotalCost(BigDecimal totalCost, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedBy
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByCreatedBy
	 *
	 */
	public Set<OrderRequest> findOrderRequestByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedOn
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByModifiedOn
	 *
	 */
	public Set<OrderRequest> findOrderRequestByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumber
	 *
	 */
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumber(String orderConfirmationNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumber
	 *
	 */
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumber(String orderConfirmationNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByPrimaryKey
	 *
	 */
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestByPrimaryKey
	 *
	 */
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId_1, int startResult, int maxRows) throws DataAccessException;

}