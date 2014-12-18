package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.VendorLocationAssociations;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage VendorLocationAssociations entities.
 * 
 */
@Repository("VendorLocationAssociationsDAO")
@Transactional
public class VendorLocationAssociationsDAOImpl extends AbstractJpaDao<VendorLocationAssociations>
		implements VendorLocationAssociationsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { VendorLocationAssociations.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new VendorLocationAssociationsDAOImpl
	 *
	 */
	public VendorLocationAssociationsDAOImpl() {
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
	 * JPQL Query - findVendorLocationAssociationsByCreatedBy
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedBy(String createdBy) throws DataAccessException {

		return findVendorLocationAssociationsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedOn
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findVendorLocationAssociationsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByLocationId
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByLocationId(Integer locationId) throws DataAccessException {

		return findVendorLocationAssociationsByLocationId(locationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByLocationId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByLocationId(Integer locationId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByLocationId", startResult, maxRows, locationId);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByVendorLocationAssociationId
	 *
	 */
	@Transactional
	public VendorLocationAssociations findVendorLocationAssociationsByVendorLocationAssociationId(Integer vendorLocationAssociationId) throws DataAccessException {

		return findVendorLocationAssociationsByVendorLocationAssociationId(vendorLocationAssociationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByVendorLocationAssociationId
	 *
	 */

	@Transactional
	public VendorLocationAssociations findVendorLocationAssociationsByVendorLocationAssociationId(Integer vendorLocationAssociationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorLocationAssociationsByVendorLocationAssociationId", startResult, maxRows, vendorLocationAssociationId);
			return (main.app.domain.VendorLocationAssociations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedBy
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findVendorLocationAssociationsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllVendorLocationAssociationss
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findAllVendorLocationAssociationss() throws DataAccessException {

		return findAllVendorLocationAssociationss(-1, -1);
	}

	/**
	 * JPQL Query - findAllVendorLocationAssociationss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findAllVendorLocationAssociationss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllVendorLocationAssociationss", startResult, maxRows);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByPrimaryKey
	 *
	 */
	@Transactional
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId) throws DataAccessException {

		return findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByPrimaryKey
	 *
	 */

	@Transactional
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorLocationAssociationsByPrimaryKey", startResult, maxRows, vendorLocationAssociationId);
			return (main.app.domain.VendorLocationAssociations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findVendorLocationAssociationsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findVendorLocationAssociationsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedOn
	 *
	 */
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findVendorLocationAssociationsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationAssociationsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<VendorLocationAssociations>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(VendorLocationAssociations entity) {
		return true;
	}
}
