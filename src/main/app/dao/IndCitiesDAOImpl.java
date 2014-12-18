package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.IndCities;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage IndCities entities.
 * 
 */
@Repository("IndCitiesDAO")
@Transactional
public class IndCitiesDAOImpl extends AbstractJpaDao<IndCities> implements
		IndCitiesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { IndCities.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new IndCitiesDAOImpl
	 *
	 */
	public IndCitiesDAOImpl() {
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
	 * JPQL Query - findIndCitiesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findIndCitiesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findIndCitiesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByCityId
	 *
	 */
	@Transactional
	public IndCities findIndCitiesByCityId(Integer cityId) throws DataAccessException {

		return findIndCitiesByCityId(cityId, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCityId
	 *
	 */

	@Transactional
	public IndCities findIndCitiesByCityId(Integer cityId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndCitiesByCityId", startResult, maxRows, cityId);
			return (main.app.domain.IndCities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndCitiesByCityNameContaining
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCityNameContaining(String cityName) throws DataAccessException {

		return findIndCitiesByCityNameContaining(cityName, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCityNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCityNameContaining(String cityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCityNameContaining", startResult, maxRows, cityName);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedBy
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findIndCitiesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByCityAbbrContaining
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCityAbbrContaining(String cityAbbr) throws DataAccessException {

		return findIndCitiesByCityAbbrContaining(cityAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCityAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCityAbbrContaining(String cityAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCityAbbrContaining", startResult, maxRows, cityAbbr);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByCityName
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCityName(String cityName) throws DataAccessException {

		return findIndCitiesByCityName(cityName, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCityName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCityName(String cityName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCityName", startResult, maxRows, cityName);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByCityAbbr
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCityAbbr(String cityAbbr) throws DataAccessException {

		return findIndCitiesByCityAbbr(cityAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCityAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCityAbbr(String cityAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCityAbbr", startResult, maxRows, cityAbbr);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedOn
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findIndCitiesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByPrimaryKey
	 *
	 */
	@Transactional
	public IndCities findIndCitiesByPrimaryKey(Integer cityId) throws DataAccessException {

		return findIndCitiesByPrimaryKey(cityId, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByPrimaryKey
	 *
	 */

	@Transactional
	public IndCities findIndCitiesByPrimaryKey(Integer cityId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndCitiesByPrimaryKey", startResult, maxRows, cityId);
			return (main.app.domain.IndCities) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndCitiesByCreatedBy
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedBy(String createdBy) throws DataAccessException {

		return findIndCitiesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndCitiesByCreatedOn
	 *
	 */
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findIndCitiesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndCitiesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findIndCitiesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndCitiesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllIndCitiess
	 *
	 */
	@Transactional
	public Set<IndCities> findAllIndCitiess() throws DataAccessException {

		return findAllIndCitiess(-1, -1);
	}

	/**
	 * JPQL Query - findAllIndCitiess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndCities> findAllIndCitiess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllIndCitiess", startResult, maxRows);
		return new LinkedHashSet<IndCities>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(IndCities entity) {
		return true;
	}
}
