package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.Countries;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Countries entities.
 * 
 */
@Repository("CountriesDAO")
@Transactional
public class CountriesDAOImpl extends AbstractJpaDao<Countries> implements
		CountriesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Countries.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CountriesDAOImpl
	 *
	 */
	public CountriesDAOImpl() {
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
	 * JPQL Query - findCountriesByCountryName
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCountryName(String countryName) throws DataAccessException {

		return findCountriesByCountryName(countryName, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCountryName(String countryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCountryName", startResult, maxRows, countryName);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCreatedBy
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCreatedBy(String createdBy) throws DataAccessException {

		return findCountriesByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCreatedOn
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findCountriesByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCountriess
	 *
	 */
	@Transactional
	public Set<Countries> findAllCountriess() throws DataAccessException {

		return findAllCountriess(-1, -1);
	}

	/**
	 * JPQL Query - findAllCountriess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findAllCountriess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCountriess", startResult, maxRows);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCountryId
	 *
	 */
	@Transactional
	public Countries findCountriesByCountryId(Integer countryId) throws DataAccessException {

		return findCountriesByCountryId(countryId, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryId
	 *
	 */

	@Transactional
	public Countries findCountriesByCountryId(Integer countryId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCountriesByCountryId", startResult, maxRows, countryId);
			return (main.app.domain.Countries) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCountriesByModifiedOn
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findCountriesByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCountryAbbr
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCountryAbbr(String countryAbbr) throws DataAccessException {

		return findCountriesByCountryAbbr(countryAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCountryAbbr(String countryAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCountryAbbr", startResult, maxRows, countryAbbr);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCountryAbbrContaining
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCountryAbbrContaining(String countryAbbr) throws DataAccessException {

		return findCountriesByCountryAbbrContaining(countryAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCountryAbbrContaining(String countryAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCountryAbbrContaining", startResult, maxRows, countryAbbr);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCreatedByContaining(String createdBy) throws DataAccessException {

		return findCountriesByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByPrimaryKey
	 *
	 */
	@Transactional
	public Countries findCountriesByPrimaryKey(Integer countryId) throws DataAccessException {

		return findCountriesByPrimaryKey(countryId, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByPrimaryKey
	 *
	 */

	@Transactional
	public Countries findCountriesByPrimaryKey(Integer countryId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCountriesByPrimaryKey", startResult, maxRows, countryId);
			return (main.app.domain.Countries) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCountriesByModifiedBy
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByModifiedBy(String modifiedBy) throws DataAccessException {

		return findCountriesByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCountryNameContaining
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCountryNameContaining(String countryName) throws DataAccessException {

		return findCountriesByCountryNameContaining(countryName, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCountryNameContaining(String countryName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCountryNameContaining", startResult, maxRows, countryName);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findCountriesByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * JPQL Query - findCountriesByCountryCode
	 *
	 */
	@Transactional
	public Set<Countries> findCountriesByCountryCode(java.math.BigDecimal countryCode) throws DataAccessException {

		return findCountriesByCountryCode(countryCode, -1, -1);
	}

	/**
	 * JPQL Query - findCountriesByCountryCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Countries> findCountriesByCountryCode(java.math.BigDecimal countryCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCountriesByCountryCode", startResult, maxRows, countryCode);
		return new LinkedHashSet<Countries>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Countries entity) {
		return true;
	}
}
