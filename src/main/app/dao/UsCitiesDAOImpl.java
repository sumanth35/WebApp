package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.UsCities;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage UsCities entities.
 * 
 */
@Repository("UsCitiesDAO")
@Transactional
public class UsCitiesDAOImpl extends AbstractJpaDao<UsCities> implements
		UsCitiesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { UsCities.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsCitiesDAOImpl
	 *
	 */
	public UsCitiesDAOImpl() {
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
	 * JPQL Query - findUsCitiesByCreatedBy
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedBy(String createdBy) throws DataAccessException {

		return findUsCitiesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCityName
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCityName(String cityName) throws DataAccessException {

		return findUsCitiesByCityName(cityName, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCityName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCityName(String cityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCityName", startResult, maxRows, cityName);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCityAbbr
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCityAbbr(String cityAbbr) throws DataAccessException {

		return findUsCitiesByCityAbbr(cityAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCityAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCityAbbr(String cityAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCityAbbr", startResult, maxRows, cityAbbr);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCityNameContaining
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCityNameContaining(String cityName) throws DataAccessException {

		return findUsCitiesByCityNameContaining(cityName, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCityNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCityNameContaining(String cityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCityNameContaining", startResult, maxRows, cityName);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findUsCitiesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedBy
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findUsCitiesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCreatedOn
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findUsCitiesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedOn
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findUsCitiesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsCitiess
	 *
	 */
	@Transactional
	public Set<UsCities> findAllUsCitiess() throws DataAccessException {

		return findAllUsCitiess(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsCitiess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findAllUsCitiess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsCitiess", startResult, maxRows);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findUsCitiesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByCityId
	 *
	 */
	@Transactional
	public UsCities findUsCitiesByCityId(Integer cityId) throws DataAccessException {

		return findUsCitiesByCityId(cityId, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCityId
	 *
	 */

	@Transactional
	public UsCities findUsCitiesByCityId(Integer cityId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsCitiesByCityId", startResult, maxRows, cityId);
			return (main.app.domain.UsCities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsCitiesByCityAbbrContaining
	 *
	 */
	@Transactional
	public Set<UsCities> findUsCitiesByCityAbbrContaining(String cityAbbr) throws DataAccessException {

		return findUsCitiesByCityAbbrContaining(cityAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByCityAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCities> findUsCitiesByCityAbbrContaining(String cityAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCitiesByCityAbbrContaining", startResult, maxRows, cityAbbr);
		return new LinkedHashSet<UsCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCitiesByPrimaryKey
	 *
	 */
	@Transactional
	public UsCities findUsCitiesByPrimaryKey(Integer cityId) throws DataAccessException {

		return findUsCitiesByPrimaryKey(cityId, -1, -1);
	}

	/**
	 * JPQL Query - findUsCitiesByPrimaryKey
	 *
	 */

	@Transactional
	public UsCities findUsCitiesByPrimaryKey(Integer cityId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsCitiesByPrimaryKey", startResult, maxRows, cityId);
			return (main.app.domain.UsCities) query.getSingleResult();
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
	public boolean canBeMerged(UsCities entity) {
		return true;
	}
}
