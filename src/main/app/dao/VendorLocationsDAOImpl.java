package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.VendorLocations;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage VendorLocations entities.
 * 
 */
@Repository("VendorLocationsDAO")
@Transactional
public class VendorLocationsDAOImpl extends AbstractJpaDao<VendorLocations>
		implements VendorLocationsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { VendorLocations.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new VendorLocationsDAOImpl
	 *
	 */
	public VendorLocationsDAOImpl() {
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
	 * JPQL Query - findVendorLocationsByLocationName
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationName(String locationName) throws DataAccessException {

		return findVendorLocationsByLocationName(locationName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationName(String locationName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationName", startResult, maxRows, locationName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleName
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleName(String locationAdminMiddleName) throws DataAccessException {

		return findVendorLocationsByLocationAdminMiddleName(locationAdminMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleName(String locationAdminMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminMiddleName", startResult, maxRows, locationAdminMiddleName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstName
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstName(String locationAdminFirstName) throws DataAccessException {

		return findVendorLocationsByLocationAdminFirstName(locationAdminFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstName(String locationAdminFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminFirstName", startResult, maxRows, locationAdminFirstName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByStatus
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByStatus(String status) throws DataAccessException {

		return findVendorLocationsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByFax
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByFax(String fax) throws DataAccessException {

		return findVendorLocationsByFax(fax, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByFax
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByFax(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByFax", startResult, maxRows, fax);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByPrimaryKey
	 *
	 */
	@Transactional
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId) throws DataAccessException {

		return findVendorLocationsByPrimaryKey(locationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByPrimaryKey
	 *
	 */

	@Transactional
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorLocationsByPrimaryKey", startResult, maxRows, locationId);
			return (main.app.domain.VendorLocations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorLocationsByEmailContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByEmailContaining(String email) throws DataAccessException {

		return findVendorLocationsByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByEmail
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByEmail(String email) throws DataAccessException {

		return findVendorLocationsByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByEmail", startResult, maxRows, email);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedBy
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedBy(String createdBy) throws DataAccessException {

		return findVendorLocationsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode4
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode4(String zipCode4) throws DataAccessException {

		return findVendorLocationsByZipCode4(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode4
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByZipCode4", startResult, maxRows, zipCode4);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedOn
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findVendorLocationsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByStatusContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByStatusContaining(String status) throws DataAccessException {

		return findVendorLocationsByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffixContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffixContaining(String locationAdminSuffix) throws DataAccessException {

		return findVendorLocationsByLocationAdminSuffixContaining(locationAdminSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffixContaining(String locationAdminSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminSuffixContaining", startResult, maxRows, locationAdminSuffix);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone1
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone1(String phone1) throws DataAccessException {

		return findVendorLocationsByPhone1(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByPhone1", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine2(String addressLine2) throws DataAccessException {

		return findVendorLocationsByAddressLine2(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine2", startResult, maxRows, addressLine2);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone2
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone2(String phone2) throws DataAccessException {

		return findVendorLocationsByPhone2(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByPhone2", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine3(String addressLine3) throws DataAccessException {

		return findVendorLocationsByAddressLine3(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine3", startResult, maxRows, addressLine3);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedOn
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findVendorLocationsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastName
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastName(String locationAdminLastName) throws DataAccessException {

		return findVendorLocationsByLocationAdminLastName(locationAdminLastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastName(String locationAdminLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminLastName", startResult, maxRows, locationAdminLastName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationId
	 *
	 */
	@Transactional
	public VendorLocations findVendorLocationsByLocationId(Integer locationId) throws DataAccessException {

		return findVendorLocationsByLocationId(locationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationId
	 *
	 */

	@Transactional
	public VendorLocations findVendorLocationsByLocationId(Integer locationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorLocationsByLocationId", startResult, maxRows, locationId);
			return (main.app.domain.VendorLocations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone2Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone2Containing(String phone2) throws DataAccessException {

		return findVendorLocationsByPhone2Containing(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByPhone2Containing", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode4Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode4Containing(String zipCode4) throws DataAccessException {

		return findVendorLocationsByZipCode4Containing(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode4Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode4Containing(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByZipCode4Containing", startResult, maxRows, zipCode4);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine1(String addressLine1) throws DataAccessException {

		return findVendorLocationsByAddressLine1(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine1", startResult, maxRows, addressLine1);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationNameContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationNameContaining(String locationName) throws DataAccessException {

		return findVendorLocationsByLocationNameContaining(locationName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationNameContaining(String locationName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationNameContaining", startResult, maxRows, locationName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffix
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffix(String locationAdminSuffix) throws DataAccessException {

		return findVendorLocationsByLocationAdminSuffix(locationAdminSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffix(String locationAdminSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminSuffix", startResult, maxRows, locationAdminSuffix);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleNameContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleNameContaining(String locationAdminMiddleName) throws DataAccessException {

		return findVendorLocationsByLocationAdminMiddleNameContaining(locationAdminMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleNameContaining(String locationAdminMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminMiddleNameContaining", startResult, maxRows, locationAdminMiddleName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedBy
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findVendorLocationsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode5Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode5Containing(String zipCode5) throws DataAccessException {

		return findVendorLocationsByZipCode5Containing(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode5Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode5Containing(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByZipCode5Containing", startResult, maxRows, zipCode5);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode5
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode5(String zipCode5) throws DataAccessException {

		return findVendorLocationsByZipCode5(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByZipCode5
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByZipCode5(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByZipCode5", startResult, maxRows, zipCode5);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine1Containing(String addressLine1) throws DataAccessException {

		return findVendorLocationsByAddressLine1Containing(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine1Containing", startResult, maxRows, addressLine1);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine3Containing(String addressLine3) throws DataAccessException {

		return findVendorLocationsByAddressLine3Containing(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine3Containing", startResult, maxRows, addressLine3);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findVendorLocationsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastNameContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastNameContaining(String locationAdminLastName) throws DataAccessException {

		return findVendorLocationsByLocationAdminLastNameContaining(locationAdminLastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastNameContaining(String locationAdminLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminLastNameContaining", startResult, maxRows, locationAdminLastName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstNameContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstNameContaining(String locationAdminFirstName) throws DataAccessException {

		return findVendorLocationsByLocationAdminFirstNameContaining(locationAdminFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstNameContaining(String locationAdminFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByLocationAdminFirstNameContaining", startResult, maxRows, locationAdminFirstName);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine2Containing(String addressLine2) throws DataAccessException {

		return findVendorLocationsByAddressLine2Containing(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByAddressLine2Containing", startResult, maxRows, addressLine2);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findVendorLocationsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByFaxContaining
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByFaxContaining(String fax) throws DataAccessException {

		return findVendorLocationsByFaxContaining(fax, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByFaxContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByFaxContaining(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByFaxContaining", startResult, maxRows, fax);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllVendorLocationss
	 *
	 */
	@Transactional
	public Set<VendorLocations> findAllVendorLocationss() throws DataAccessException {

		return findAllVendorLocationss(-1, -1);
	}

	/**
	 * JPQL Query - findAllVendorLocationss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findAllVendorLocationss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllVendorLocationss", startResult, maxRows);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone1Containing
	 *
	 */
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone1Containing(String phone1) throws DataAccessException {

		return findVendorLocationsByPhone1Containing(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorLocationsByPhone1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorLocations> findVendorLocationsByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorLocationsByPhone1Containing", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorLocations>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(VendorLocations entity) {
		return true;
	}
}
