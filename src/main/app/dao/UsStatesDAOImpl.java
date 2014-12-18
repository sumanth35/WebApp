package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.UsStates;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage UsStates entities.
 * 
 */
@Repository("UsStatesDAO")
@Transactional
public class UsStatesDAOImpl extends AbstractJpaDao<UsStates> implements
		UsStatesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { UsStates.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsStatesDAOImpl
	 *
	 */
	public UsStatesDAOImpl() {
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
	 * JPQL Query - findUsStatesByStateNameContaining
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByStateNameContaining(String stateName) throws DataAccessException {

		return findUsStatesByStateNameContaining(stateName, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByStateNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByStateNameContaining(String stateName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByStateNameContaining", startResult, maxRows, stateName);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByPrimaryKey
	 *
	 */
	@Transactional
	public UsStates findUsStatesByPrimaryKey(Integer stateId) throws DataAccessException {

		return findUsStatesByPrimaryKey(stateId, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByPrimaryKey
	 *
	 */

	@Transactional
	public UsStates findUsStatesByPrimaryKey(Integer stateId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsStatesByPrimaryKey", startResult, maxRows, stateId);
			return (main.app.domain.UsStates) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsStatesByModifiedBy
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findUsStatesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByStateId
	 *
	 */
	@Transactional
	public UsStates findUsStatesByStateId(Integer stateId) throws DataAccessException {

		return findUsStatesByStateId(stateId, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByStateId
	 *
	 */

	@Transactional
	public UsStates findUsStatesByStateId(Integer stateId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsStatesByStateId", startResult, maxRows, stateId);
			return (main.app.domain.UsStates) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsStatesByModifiedOn
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findUsStatesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByStateAbbrContaining
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByStateAbbrContaining(String stateAbbr) throws DataAccessException {

		return findUsStatesByStateAbbrContaining(stateAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByStateAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByStateAbbrContaining(String stateAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByStateAbbrContaining", startResult, maxRows, stateAbbr);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByCreatedOn
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findUsStatesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findUsStatesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsStatess
	 *
	 */
	@Transactional
	public Set<UsStates> findAllUsStatess() throws DataAccessException {

		return findAllUsStatess(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsStatess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findAllUsStatess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsStatess", startResult, maxRows);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByCreatedBy
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByCreatedBy(String createdBy) throws DataAccessException {

		return findUsStatesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findUsStatesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByStateName
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByStateName(String stateName) throws DataAccessException {

		return findUsStatesByStateName(stateName, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByStateName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByStateName(String stateName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByStateName", startResult, maxRows, stateName);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsStatesByStateAbbr
	 *
	 */
	@Transactional
	public Set<UsStates> findUsStatesByStateAbbr(String stateAbbr) throws DataAccessException {

		return findUsStatesByStateAbbr(stateAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsStatesByStateAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsStates> findUsStatesByStateAbbr(String stateAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsStatesByStateAbbr", startResult, maxRows, stateAbbr);
		return new LinkedHashSet<UsStates>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(UsStates entity) {
		return true;
	}
}
