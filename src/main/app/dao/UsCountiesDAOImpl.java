package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.UsCounties;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage UsCounties entities.
 * 
 */
@Repository("UsCountiesDAO")
@Transactional
public class UsCountiesDAOImpl extends AbstractJpaDao<UsCounties> implements
		UsCountiesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { UsCounties.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsCountiesDAOImpl
	 *
	 */
	public UsCountiesDAOImpl() {
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
	 * JPQL Query - findUsCountiesByCountyNameContaining
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyNameContaining(String countyName) throws DataAccessException {

		return findUsCountiesByCountyNameContaining(countyName, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCountyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyNameContaining(String countyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCountyNameContaining", startResult, maxRows, countyName);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedBy
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedBy(String createdBy) throws DataAccessException {

		return findUsCountiesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findUsCountiesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedOn
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findUsCountiesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByCountyAbbrContaining
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyAbbrContaining(String countyAbbr) throws DataAccessException {

		return findUsCountiesByCountyAbbrContaining(countyAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCountyAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyAbbrContaining(String countyAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCountyAbbrContaining", startResult, maxRows, countyAbbr);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedBy
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findUsCountiesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedOn
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findUsCountiesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllUsCountiess
	 *
	 */
	@Transactional
	public Set<UsCounties> findAllUsCountiess() throws DataAccessException {

		return findAllUsCountiess(-1, -1);
	}

	/**
	 * JPQL Query - findAllUsCountiess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findAllUsCountiess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUsCountiess", startResult, maxRows);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByCountyId
	 *
	 */
	@Transactional
	public UsCounties findUsCountiesByCountyId(Integer countyId) throws DataAccessException {

		return findUsCountiesByCountyId(countyId, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCountyId
	 *
	 */

	@Transactional
	public UsCounties findUsCountiesByCountyId(Integer countyId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsCountiesByCountyId", startResult, maxRows, countyId);
			return (main.app.domain.UsCounties) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findUsCountiesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByCountyName
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyName(String countyName) throws DataAccessException {

		return findUsCountiesByCountyName(countyName, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCountyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyName(String countyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCountyName", startResult, maxRows, countyName);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsCountiesByPrimaryKey
	 *
	 */
	@Transactional
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId) throws DataAccessException {

		return findUsCountiesByPrimaryKey(countyId, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByPrimaryKey
	 *
	 */

	@Transactional
	public UsCounties findUsCountiesByPrimaryKey(Integer countyId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsCountiesByPrimaryKey", startResult, maxRows, countyId);
			return (main.app.domain.UsCounties) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsCountiesByCountyAbbr
	 *
	 */
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyAbbr(String countyAbbr) throws DataAccessException {

		return findUsCountiesByCountyAbbr(countyAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findUsCountiesByCountyAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<UsCounties> findUsCountiesByCountyAbbr(String countyAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsCountiesByCountyAbbr", startResult, maxRows, countyAbbr);
		return new LinkedHashSet<UsCounties>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(UsCounties entity) {
		return true;
	}
}
