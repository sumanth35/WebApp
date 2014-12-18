package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.OrderRequestStatuses;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderRequestStatuses entities.
 * 
 */
public interface OrderRequestStatusesDAO extends JpaDao<OrderRequestStatuses> {

	/**
	 * JPQL Query - findOrderRequestStatusesByDescription
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByDescription
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByOrderRequestStatusId
	 *
	 */
	public OrderRequestStatuses findOrderRequestStatusesByOrderRequestStatusId(Integer orderRequestStatusId) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByOrderRequestStatusId
	 *
	 */
	public OrderRequestStatuses findOrderRequestStatusesByOrderRequestStatusId(Integer orderRequestStatusId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByDescriptionContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByDescriptionContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedOn
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedOn
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviation
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviation(String abbreviation) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviation
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviation(String abbreviation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderRequestStatusess
	 *
	 */
	public Set<OrderRequestStatuses> findAllOrderRequestStatusess() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderRequestStatusess
	 *
	 */
	public Set<OrderRequestStatuses> findAllOrderRequestStatusess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedByContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedByContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviationContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviationContaining(String abbreviation_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviationContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviationContaining(String abbreviation_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedBy
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedBy
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedByContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedByContaining
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedBy
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedBy
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByPrimaryKey
	 *
	 */
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByPrimaryKey
	 *
	 */
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedOn
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedOn
	 *
	 */
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

}