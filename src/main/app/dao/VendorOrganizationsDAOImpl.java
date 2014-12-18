package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.VendorOrganizations;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage VendorOrganizations entities.
 * 
 */
@Repository("VendorOrganizationsDAO")
@Transactional
public class VendorOrganizationsDAOImpl extends AbstractJpaDao<VendorOrganizations>
		implements VendorOrganizationsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { VendorOrganizations.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new VendorOrganizationsDAOImpl
	 *
	 */
	public VendorOrganizationsDAOImpl() {
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
	 * JPQL Query - findVendorOrganizationsByEmailContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByEmailContaining(String email) throws DataAccessException {

		return findVendorOrganizationsByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleNameContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleNameContaining(String contactPersonMiddleName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonMiddleNameContaining(contactPersonMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleNameContaining(String contactPersonMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonMiddleNameContaining", startResult, maxRows, contactPersonMiddleName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1Containing(String addressLine1) throws DataAccessException {

		return findVendorOrganizationsByAddressLine1Containing(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine1Containing", startResult, maxRows, addressLine1);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1(String phone1) throws DataAccessException {

		return findVendorOrganizationsByPhone1(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByPhone1", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffixContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffixContaining(String contactPersonSuffix) throws DataAccessException {

		return findVendorOrganizationsByContactPersonSuffixContaining(contactPersonSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffixContaining(String contactPersonSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonSuffixContaining", startResult, maxRows, contactPersonSuffix);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4(String zipCode4) throws DataAccessException {

		return findVendorOrganizationsByZipCode4(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByZipCode4", startResult, maxRows, zipCode4);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2(String phone2) throws DataAccessException {

		return findVendorOrganizationsByPhone2(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByPhone2", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1Containing(String phone1) throws DataAccessException {

		return findVendorOrganizationsByPhone1Containing(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByPhone1Containing", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByEmail
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByEmail(String email) throws DataAccessException {

		return findVendorOrganizationsByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByEmail", startResult, maxRows, email);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastNameContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastNameContaining(String contactPersonLastName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonLastNameContaining(contactPersonLastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastNameContaining(String contactPersonLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonLastNameContaining", startResult, maxRows, contactPersonLastName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationTypeId
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationTypeId(Integer organizationTypeId) throws DataAccessException {

		return findVendorOrganizationsByOrganizationTypeId(organizationTypeId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationTypeId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationTypeId(Integer organizationTypeId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByOrganizationTypeId", startResult, maxRows, organizationTypeId);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstNameContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstNameContaining(String contactPersonFirstName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonFirstNameContaining(contactPersonFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstNameContaining(String contactPersonFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonFirstNameContaining", startResult, maxRows, contactPersonFirstName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2(String addressLine2) throws DataAccessException {

		return findVendorOrganizationsByAddressLine2(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine2", startResult, maxRows, addressLine2);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationId
	 *
	 */
	@Transactional
	public VendorOrganizations findVendorOrganizationsByOrganizationId(Integer organizationId) throws DataAccessException {

		return findVendorOrganizationsByOrganizationId(organizationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationId
	 *
	 */

	@Transactional
	public VendorOrganizations findVendorOrganizationsByOrganizationId(Integer organizationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorOrganizationsByOrganizationId", startResult, maxRows, organizationId);
			return (main.app.domain.VendorOrganizations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedBy
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findVendorOrganizationsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPrimaryKey
	 *
	 */
	@Transactional
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId) throws DataAccessException {

		return findVendorOrganizationsByPrimaryKey(organizationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPrimaryKey
	 *
	 */

	@Transactional
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorOrganizationsByPrimaryKey", startResult, maxRows, organizationId);
			return (main.app.domain.VendorOrganizations) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstName
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstName(String contactPersonFirstName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonFirstName(contactPersonFirstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstName(String contactPersonFirstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonFirstName", startResult, maxRows, contactPersonFirstName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByStatus
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByStatus(String status) throws DataAccessException {

		return findVendorOrganizationsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedBy
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedBy(String createdBy) throws DataAccessException {

		return findVendorOrganizationsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode5
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode5(java.math.BigDecimal zipCode5) throws DataAccessException {

		return findVendorOrganizationsByZipCode5(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode5
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode5(java.math.BigDecimal zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByZipCode5", startResult, maxRows, zipCode5);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedOn
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findVendorOrganizationsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleName
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleName(String contactPersonMiddleName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonMiddleName(contactPersonMiddleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleName(String contactPersonMiddleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonMiddleName", startResult, maxRows, contactPersonMiddleName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessName
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessName(String organizationBusinessName) throws DataAccessException {

		return findVendorOrganizationsByOrganizationBusinessName(organizationBusinessName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessName(String organizationBusinessName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByOrganizationBusinessName", startResult, maxRows, organizationBusinessName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findVendorOrganizationsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1(String addressLine1) throws DataAccessException {

		return findVendorOrganizationsByAddressLine1(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine1", startResult, maxRows, addressLine1);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3Containing(String addressLine3) throws DataAccessException {

		return findVendorOrganizationsByAddressLine3Containing(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine3Containing", startResult, maxRows, addressLine3);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4Containing(String zipCode4) throws DataAccessException {

		return findVendorOrganizationsByZipCode4Containing(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4Containing(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByZipCode4Containing", startResult, maxRows, zipCode4);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByFaxContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByFaxContaining(String fax) throws DataAccessException {

		return findVendorOrganizationsByFaxContaining(fax, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByFaxContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByFaxContaining(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByFaxContaining", startResult, maxRows, fax);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2Containing(String addressLine2) throws DataAccessException {

		return findVendorOrganizationsByAddressLine2Containing(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine2Containing", startResult, maxRows, addressLine2);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllVendorOrganizationss
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findAllVendorOrganizationss() throws DataAccessException {

		return findAllVendorOrganizationss(-1, -1);
	}

	/**
	 * JPQL Query - findAllVendorOrganizationss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findAllVendorOrganizationss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllVendorOrganizationss", startResult, maxRows);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByFax
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByFax(String fax) throws DataAccessException {

		return findVendorOrganizationsByFax(fax, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByFax
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByFax(String fax, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByFax", startResult, maxRows, fax);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByStatusContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByStatusContaining(String status) throws DataAccessException {

		return findVendorOrganizationsByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedOn
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findVendorOrganizationsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findVendorOrganizationsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2Containing
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2Containing(String phone2) throws DataAccessException {

		return findVendorOrganizationsByPhone2Containing(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByPhone2Containing", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3(String addressLine3) throws DataAccessException {

		return findVendorOrganizationsByAddressLine3(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByAddressLine3", startResult, maxRows, addressLine3);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffix
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffix(String contactPersonSuffix) throws DataAccessException {

		return findVendorOrganizationsByContactPersonSuffix(contactPersonSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffix(String contactPersonSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonSuffix", startResult, maxRows, contactPersonSuffix);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessNameContaining
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessNameContaining(String organizationBusinessName) throws DataAccessException {

		return findVendorOrganizationsByOrganizationBusinessNameContaining(organizationBusinessName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessNameContaining(String organizationBusinessName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByOrganizationBusinessNameContaining", startResult, maxRows, organizationBusinessName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastName
	 *
	 */
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastName(String contactPersonLastName) throws DataAccessException {

		return findVendorOrganizationsByContactPersonLastName(contactPersonLastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastName(String contactPersonLastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorOrganizationsByContactPersonLastName", startResult, maxRows, contactPersonLastName);
		return new LinkedHashSet<VendorOrganizations>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(VendorOrganizations entity) {
		return true;
	}
}
