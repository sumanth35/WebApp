package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.RecipientLocation;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RecipientLocation entities.
 * 
 */
@Repository("RecipientLocationDAO")
@Transactional
public class RecipientLocationDAOImpl extends AbstractJpaDao<RecipientLocation>
		implements RecipientLocationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { RecipientLocation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RecipientLocationDAOImpl
	 *
	 */
	public RecipientLocationDAOImpl() {
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
	 * JPQL Query - findRecipientLocationByRecipientMiddleNameContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleNameContaining(String recipientMiddleName) throws DataAccessException {

		return findRecipientLocationByRecipientMiddleNameContaining(recipientMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleNameContaining(String recipientMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientMiddleNameContaining", startResult, maxRows, recipientMiddleName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleName
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleName(String recipientMiddleName) throws DataAccessException {

		return findRecipientLocationByRecipientMiddleName(recipientMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleName(String recipientMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientMiddleName", startResult, maxRows, recipientMiddleName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedOn
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findRecipientLocationByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffix
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffix(String recipientSuffix) throws DataAccessException {

		return findRecipientLocationByRecipientSuffix(recipientSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffix(String recipientSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientSuffix", startResult, maxRows, recipientSuffix);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine3(String addressLine3) throws DataAccessException {

		return findRecipientLocationByAddressLine3(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine3", startResult, maxRows, addressLine3);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByContactNumber
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByContactNumber(String contactNumber) throws DataAccessException {

		return findRecipientLocationByContactNumber(contactNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByContactNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByContactNumber(String contactNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByContactNumber", startResult, maxRows, contactNumber);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstNameContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstNameContaining(String recipientFirstName) throws DataAccessException {

		return findRecipientLocationByRecipientFirstNameContaining(recipientFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstNameContaining(String recipientFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientFirstNameContaining", startResult, maxRows, recipientFirstName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1Containing
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine1Containing(String addressLine1) throws DataAccessException {

		return findRecipientLocationByAddressLine1Containing(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine1Containing", startResult, maxRows, addressLine1);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode4
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode4(String zipCode4) throws DataAccessException {

		return findRecipientLocationByZipCode4(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode4
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByZipCode4", startResult, maxRows, zipCode4);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByContactNumberContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByContactNumberContaining(String contactNumber) throws DataAccessException {

		return findRecipientLocationByContactNumberContaining(contactNumber, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByContactNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByContactNumberContaining(String contactNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByContactNumberContaining", startResult, maxRows, contactNumber);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffixContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffixContaining(String recipientSuffix) throws DataAccessException {

		return findRecipientLocationByRecipientSuffixContaining(recipientSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffixContaining(String recipientSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientSuffixContaining", startResult, maxRows, recipientSuffix);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstName
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstName(String recipientFirstName) throws DataAccessException {

		return findRecipientLocationByRecipientFirstName(recipientFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstName(String recipientFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientFirstName", startResult, maxRows, recipientFirstName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByFaxContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByFaxContaining(String fax) throws DataAccessException {

		return findRecipientLocationByFaxContaining(fax, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByFaxContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByFaxContaining(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByFaxContaining", startResult, maxRows, fax);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2Containing
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine2Containing(String addressLine2) throws DataAccessException {

		return findRecipientLocationByAddressLine2Containing(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine2Containing", startResult, maxRows, addressLine2);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastNameContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientLastNameContaining(String recipientLastName) throws DataAccessException {

		return findRecipientLocationByRecipientLastNameContaining(recipientLastName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientLastNameContaining(String recipientLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientLastNameContaining", startResult, maxRows, recipientLastName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedByContaining(String createdBy) throws DataAccessException {

		return findRecipientLocationByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitleContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientTitleContaining(String recipientTitle) throws DataAccessException {

		return findRecipientLocationByRecipientTitleContaining(recipientTitle, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientTitleContaining(String recipientTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientTitleContaining", startResult, maxRows, recipientTitle);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine1(String addressLine1) throws DataAccessException {

		return findRecipientLocationByAddressLine1(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine1", startResult, maxRows, addressLine1);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastName
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientLastName(String recipientLastName) throws DataAccessException {

		return findRecipientLocationByRecipientLastName(recipientLastName, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientLastName(String recipientLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientLastName", startResult, maxRows, recipientLastName);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode5Containing
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode5Containing(String zipCode5) throws DataAccessException {

		return findRecipientLocationByZipCode5Containing(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode5Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode5Containing(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByZipCode5Containing", startResult, maxRows, zipCode5);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRecipientLocations
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findAllRecipientLocations() throws DataAccessException {

		return findAllRecipientLocations(-1, -1);
	}

	/**
	 * JPQL Query - findAllRecipientLocations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findAllRecipientLocations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRecipientLocations", startResult, maxRows);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3Containing
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine3Containing(String addressLine3) throws DataAccessException {

		return findRecipientLocationByAddressLine3Containing(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine3Containing", startResult, maxRows, addressLine3);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode5
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode5(String zipCode5) throws DataAccessException {

		return findRecipientLocationByZipCode5(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode5
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode5(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByZipCode5", startResult, maxRows, zipCode5);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedOn
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findRecipientLocationByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findRecipientLocationByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByPrimaryKey
	 *
	 */
	@Transactional
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId) throws DataAccessException {

		return findRecipientLocationByPrimaryKey(recipientLocationId, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByPrimaryKey
	 *
	 */

	@Transactional
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRecipientLocationByPrimaryKey", startResult, maxRows, recipientLocationId);
			return (main.app.domain.RecipientLocation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedBy
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedBy(String modifiedBy) throws DataAccessException {

		return findRecipientLocationByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode4Containing
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode4Containing(String zipCode4) throws DataAccessException {

		return findRecipientLocationByZipCode4Containing(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByZipCode4Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByZipCode4Containing(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByZipCode4Containing", startResult, maxRows, zipCode4);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByFax
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByFax(String fax) throws DataAccessException {

		return findRecipientLocationByFax(fax, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByFax
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByFax(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByFax", startResult, maxRows, fax);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitle
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientTitle(String recipientTitle) throws DataAccessException {

		return findRecipientLocationByRecipientTitle(recipientTitle, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByRecipientTitle(String recipientTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByRecipientTitle", startResult, maxRows, recipientTitle);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine2(String addressLine2) throws DataAccessException {

		return findRecipientLocationByAddressLine2(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByAddressLine2", startResult, maxRows, addressLine2);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByEmail
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByEmail(String email) throws DataAccessException {

		return findRecipientLocationByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByEmail", startResult, maxRows, email);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedBy
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedBy(String createdBy) throws DataAccessException {

		return findRecipientLocationByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByEmailContaining
	 *
	 */
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByEmailContaining(String email) throws DataAccessException {

		return findRecipientLocationByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RecipientLocation> findRecipientLocationByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRecipientLocationByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<RecipientLocation>(query.getResultList());
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLocationId
	 *
	 */
	@Transactional
	public RecipientLocation findRecipientLocationByRecipientLocationId(Integer recipientLocationId) throws DataAccessException {

		return findRecipientLocationByRecipientLocationId(recipientLocationId, -1, -1);
	}

	/**
	 * JPQL Query - findRecipientLocationByRecipientLocationId
	 *
	 */

	@Transactional
	public RecipientLocation findRecipientLocationByRecipientLocationId(Integer recipientLocationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRecipientLocationByRecipientLocationId", startResult, maxRows, recipientLocationId);
			return (main.app.domain.RecipientLocation) query.getSingleResult();
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
	public boolean canBeMerged(RecipientLocation entity) {
		return true;
	}
}
