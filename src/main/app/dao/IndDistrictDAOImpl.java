package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.IndDistrict;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage IndDistrict entities.
 * 
 */
@Repository("IndDistrictDAO")
@Transactional
public class IndDistrictDAOImpl extends AbstractJpaDao<IndDistrict> implements
		IndDistrictDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { IndDistrict.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new IndDistrictDAOImpl
	 *
	 */
	public IndDistrictDAOImpl() {
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
	 * JPQL Query - findIndDistrictByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findIndDistrictByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictId
	 *
	 */
	@Transactional
	public IndDistrict findIndDistrictByDistrictId(Integer districtId) throws DataAccessException {

		return findIndDistrictByDistrictId(districtId, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictId
	 *
	 */

	@Transactional
	public IndDistrict findIndDistrictByDistrictId(Integer districtId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndDistrictByDistrictId", startResult, maxRows, districtId);
			return (main.app.domain.IndDistrict) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndDistrictByModifiedBy
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedBy(String modifiedBy) throws DataAccessException {

		return findIndDistrictByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbrContaining
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictAbbrContaining(String districtAbbr) throws DataAccessException {

		return findIndDistrictByDistrictAbbrContaining(districtAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictAbbrContaining(String districtAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByDistrictAbbrContaining", startResult, maxRows, districtAbbr);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbr
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictAbbr(String districtAbbr) throws DataAccessException {

		return findIndDistrictByDistrictAbbr(districtAbbr, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictAbbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictAbbr(String districtAbbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByDistrictAbbr", startResult, maxRows, districtAbbr);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByModifiedOn
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findIndDistrictByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictNameContaining
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictNameContaining(String districtName) throws DataAccessException {

		return findIndDistrictByDistrictNameContaining(districtName, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictNameContaining(String districtName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByDistrictNameContaining", startResult, maxRows, districtName);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedOn
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findIndDistrictByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByPrimaryKey
	 *
	 */
	@Transactional
	public IndDistrict findIndDistrictByPrimaryKey(Integer districtId) throws DataAccessException {

		return findIndDistrictByPrimaryKey(districtId, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByPrimaryKey
	 *
	 */

	@Transactional
	public IndDistrict findIndDistrictByPrimaryKey(Integer districtId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findIndDistrictByPrimaryKey", startResult, maxRows, districtId);
			return (main.app.domain.IndDistrict) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictName
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictName(String districtName) throws DataAccessException {

		return findIndDistrictByDistrictName(districtName, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByDistrictName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByDistrictName(String districtName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByDistrictName", startResult, maxRows, districtName);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedBy
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedBy(String createdBy) throws DataAccessException {

		return findIndDistrictByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllIndDistricts
	 *
	 */
	@Transactional
	public Set<IndDistrict> findAllIndDistricts() throws DataAccessException {

		return findAllIndDistricts(-1, -1);
	}

	/**
	 * JPQL Query - findAllIndDistricts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findAllIndDistricts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllIndDistricts", startResult, maxRows);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedByContaining(String createdBy) throws DataAccessException {

		return findIndDistrictByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findIndDistrictByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<IndDistrict> findIndDistrictByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findIndDistrictByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<IndDistrict>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(IndDistrict entity) {
		return true;
	}
}
