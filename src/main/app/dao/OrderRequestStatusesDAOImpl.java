package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.OrderRequestStatuses;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage OrderRequestStatuses entities.
 * 
 */
@Repository("OrderRequestStatusesDAO")
@Transactional
public class OrderRequestStatusesDAOImpl extends AbstractJpaDao<OrderRequestStatuses>
		implements OrderRequestStatusesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { OrderRequestStatuses.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderRequestStatusesDAOImpl
	 *
	 */
	public OrderRequestStatusesDAOImpl() {
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
	 * JPQL Query - findOrderRequestStatusesByDescription
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescription(String description) throws DataAccessException {

		return findOrderRequestStatusesByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByDescription", startResult, maxRows, description);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByOrderRequestStatusId
	 *
	 */
	@Transactional
	public OrderRequestStatuses findOrderRequestStatusesByOrderRequestStatusId(Integer orderRequestStatusId) throws DataAccessException {

		return findOrderRequestStatusesByOrderRequestStatusId(orderRequestStatusId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByOrderRequestStatusId
	 *
	 */

	@Transactional
	public OrderRequestStatuses findOrderRequestStatusesByOrderRequestStatusId(Integer orderRequestStatusId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderRequestStatusesByOrderRequestStatusId", startResult, maxRows, orderRequestStatusId);
			return (main.app.domain.OrderRequestStatuses) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescriptionContaining(String description) throws DataAccessException {

		return findOrderRequestStatusesByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedOn
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findOrderRequestStatusesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviation
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviation(String abbreviation) throws DataAccessException {

		return findOrderRequestStatusesByAbbreviation(abbreviation, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviation(String abbreviation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByAbbreviation", startResult, maxRows, abbreviation);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrderRequestStatusess
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findAllOrderRequestStatusess() throws DataAccessException {

		return findAllOrderRequestStatusess(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderRequestStatusess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findAllOrderRequestStatusess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderRequestStatusess", startResult, maxRows);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findOrderRequestStatusesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviationContaining
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviationContaining(String abbreviation) throws DataAccessException {

		return findOrderRequestStatusesByAbbreviationContaining(abbreviation, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByAbbreviationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByAbbreviationContaining(String abbreviation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByAbbreviationContaining", startResult, maxRows, abbreviation);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedBy
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedBy(String createdBy) throws DataAccessException {

		return findOrderRequestStatusesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findOrderRequestStatusesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedBy
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findOrderRequestStatusesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByPrimaryKey
	 *
	 */
	@Transactional
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId) throws DataAccessException {

		return findOrderRequestStatusesByPrimaryKey(orderRequestStatusId, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByPrimaryKey
	 *
	 */

	@Transactional
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderRequestStatusesByPrimaryKey", startResult, maxRows, orderRequestStatusId);
			return (main.app.domain.OrderRequestStatuses) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedOn
	 *
	 */
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findOrderRequestStatusesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findOrderRequestStatusesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderRequestStatuses> findOrderRequestStatusesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderRequestStatusesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<OrderRequestStatuses>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderRequestStatuses entity) {
		return true;
	}
}
