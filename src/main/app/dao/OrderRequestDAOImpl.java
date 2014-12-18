package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.OrderRequest;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage OrderRequest entities.
 * 
 */
@Repository("OrderRequestDAO")
@Transactional
public class OrderRequestDAOImpl extends AbstractJpaDao<OrderRequest> implements
		OrderRequestDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { OrderRequest.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderRequestDAOImpl
	 *
	 */
	public OrderRequestDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findOrderRequestByTax
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByTax(java.math.BigDecimal tax) throws DataAccessException {

		return findOrderRequestByTax(tax, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByTax
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByTax(java.math.BigDecimal tax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByTax", startResult, maxRows, tax);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findOrderRequestByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByOrderRequestId
	 *
	 */
	@Transactional
	public OrderRequest findOrderRequestByOrderRequestId(Integer orderRequestId) throws DataAccessException {

		return findOrderRequestByOrderRequestId(orderRequestId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByOrderRequestId
	 *
	 */

	@Transactional
	public OrderRequest findOrderRequestByOrderRequestId(Integer orderRequestId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderRequestByOrderRequestId", startResult, maxRows, orderRequestId);
			return (main.app.domain.OrderRequest) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumberContaining
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumberContaining(String orderConfirmationNumber) throws DataAccessException {

		return findOrderRequestByOrderConfirmationNumberContaining(orderConfirmationNumber, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumberContaining(String orderConfirmationNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByOrderConfirmationNumberContaining", startResult, maxRows, orderConfirmationNumber);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedBy
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedBy(String modifiedBy) throws DataAccessException {

		return findOrderRequestByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedOn
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findOrderRequestByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrderRequests
	 *
	 */
	@Transactional
	public Set<OrderRequest> findAllOrderRequests() throws DataAccessException {

		return findAllOrderRequests(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderRequests
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findAllOrderRequests(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderRequests", startResult, maxRows);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedByContaining(String createdBy) throws DataAccessException {

		return findOrderRequestByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByTotalCost
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByTotalCost(java.math.BigDecimal totalCost) throws DataAccessException {

		return findOrderRequestByTotalCost(totalCost, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByTotalCost
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByTotalCost(java.math.BigDecimal totalCost, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByTotalCost", startResult, maxRows, totalCost);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedBy
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedBy(String createdBy) throws DataAccessException {

		return findOrderRequestByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedOn
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findOrderRequestByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumber
	 *
	 */
	@Transactional
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumber(String orderConfirmationNumber) throws DataAccessException {

		return findOrderRequestByOrderConfirmationNumber(orderConfirmationNumber, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByOrderConfirmationNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequest> findOrderRequestByOrderConfirmationNumber(String orderConfirmationNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestByOrderConfirmationNumber", startResult, maxRows, orderConfirmationNumber);
		return new LinkedHashSet<OrderRequest>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestByPrimaryKey
	 *
	 */
	@Transactional
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId) throws DataAccessException {

		return findOrderRequestByPrimaryKey(orderRequestId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestByPrimaryKey
	 *
	 */

	@Transactional
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderRequestByPrimaryKey", startResult, maxRows, orderRequestId);
			return (main.app.domain.OrderRequest) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderRequest entity) {
		return true;
	}
}
