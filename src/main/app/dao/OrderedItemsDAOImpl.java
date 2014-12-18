package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.OrderedItems;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage OrderedItems entities.
 * 
 */
@Repository("OrderedItemsDAO")
@Transactional
public class OrderedItemsDAOImpl extends AbstractJpaDao<OrderedItems> implements
		OrderedItemsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { OrderedItems.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderedItemsDAOImpl
	 *
	 */
	public OrderedItemsDAOImpl() {
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
	 * JPQL Query - findOrderedItemsByPrimaryKey
	 *
	 */
	@Transactional
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId) throws DataAccessException {

		return findOrderedItemsByPrimaryKey(orderItemId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByPrimaryKey
	 *
	 */

	@Transactional
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderedItemsByPrimaryKey", startResult, maxRows, orderItemId);
			return (main.app.domain.OrderedItems) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllOrderedItemss
	 *
	 */
	@Transactional
	public Set<OrderedItems> findAllOrderedItemss() throws DataAccessException {

		return findAllOrderedItemss(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderedItemss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findAllOrderedItemss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderedItemss", startResult, maxRows);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findOrderedItemsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findOrderedItemsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedBy
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedBy(String createdBy) throws DataAccessException {

		return findOrderedItemsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByOrderItemId
	 *
	 */
	@Transactional
	public OrderedItems findOrderedItemsByOrderItemId(Integer orderItemId) throws DataAccessException {

		return findOrderedItemsByOrderItemId(orderItemId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByOrderItemId
	 *
	 */

	@Transactional
	public OrderedItems findOrderedItemsByOrderItemId(Integer orderItemId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderedItemsByOrderItemId", startResult, maxRows, orderItemId);
			return (main.app.domain.OrderedItems) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedOn
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findOrderedItemsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedOn
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findOrderedItemsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByItemPrice
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByItemPrice(java.math.BigDecimal itemPrice) throws DataAccessException {

		return findOrderedItemsByItemPrice(itemPrice, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByItemPrice
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByItemPrice(java.math.BigDecimal itemPrice, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByItemPrice", startResult, maxRows, itemPrice);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedBy
	 *
	 */
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findOrderedItemsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderedItemsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderedItems> findOrderedItemsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderedItemsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderedItems>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderedItems entity) {
		return true;
	}
}
