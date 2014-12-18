package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.IndStates;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage IndStates entities.
 * 
 */
@Repository("IndStatesDAO")
@Transactional
public class IndStatesDAOImpl extends AbstractJpaDao<IndStates> implements
		IndStatesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { IndStates.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new IndStatesDAOImpl
	 *
	 */
	public IndStatesDAOImpl() {
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
	 * JPQL Query - findIndStatesByStateId
	 *
	 */
	@Transactional
	public IndStates findIndStatesByStateId(Integer stateId) throws DataAccessException {

		return findIndStatesByStateId(stateId, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByStateId
	 *
	 */

	@Transactional
	public IndStates findIndStatesByStateId(Integer stateId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndStatesByStateId", startResult, maxRows, stateId);
			return (main.app.domain.IndStates) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndStatesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findIndStatesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByPrimaryKey
	 *
	 */
	@Transactional
	public IndStates findIndStatesByPrimaryKey(Integer stateId) throws DataAccessException {

		return findIndStatesByPrimaryKey(stateId, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByPrimaryKey
	 *
	 */

	@Transactional
	public IndStates findIndStatesByPrimaryKey(Integer stateId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndStatesByPrimaryKey", startResult, maxRows, stateId);
			return (main.app.domain.IndStates) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndStatesByModifiedBy
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findIndStatesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByCreatedBy
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByCreatedBy(String createdBy) throws DataAccessException {

		return findIndStatesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByCreatedOn
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findIndStatesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByStateNameContaining
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByStateNameContaining(String stateName) throws DataAccessException {

		return findIndStatesByStateNameContaining(stateName, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByStateNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByStateNameContaining(String stateName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByStateNameContaining", startResult, maxRows, stateName);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllIndStatess
	 *
	 */
	@Transactional
	public Set<IndStates> findAllIndStatess() throws DataAccessException {

		return findAllIndStatess(-1, -1);
	}

	/**
	 * JPQL Query - findAllIndStatess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findAllIndStatess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllIndStatess", startResult, maxRows);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByModifiedOn
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findIndStatesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByStateAbbr
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByStateAbbr(String stateAbbr) throws DataAccessException {

		return findIndStatesByStateAbbr(stateAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByStateAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByStateAbbr(String stateAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByStateAbbr", startResult, maxRows, stateAbbr);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByStateName
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByStateName(String stateName) throws DataAccessException {

		return findIndStatesByStateName(stateName, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByStateName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByStateName(String stateName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByStateName", startResult, maxRows, stateName);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findIndStatesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndStatesByStateAbbrContaining
	 *
	 */
	@Transactional
	public Set<IndStates> findIndStatesByStateAbbrContaining(String stateAbbr) throws DataAccessException {

		return findIndStatesByStateAbbrContaining(stateAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndStatesByStateAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndStates> findIndStatesByStateAbbrContaining(String stateAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndStatesByStateAbbrContaining", startResult, maxRows, stateAbbr);
		return new LinkedHashSet<IndStates>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(IndStates entity) {
		return true;
	}
}
