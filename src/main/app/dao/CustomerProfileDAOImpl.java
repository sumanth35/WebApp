package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.CustomerProfile;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage CustomerProfile entities.
 * 
 */
@Repository("CustomerProfileDAO")
@Transactional
public class CustomerProfileDAOImpl extends AbstractJpaDao<CustomerProfile>
		implements CustomerProfileDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { CustomerProfile.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CustomerProfileDAOImpl
	 *
	 */
	public CustomerProfileDAOImpl() {
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
	 * JPQL Query - findCustomerProfileByZipCode5
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode5(String zipCode5) throws DataAccessException {

		return findCustomerProfileByZipCode5(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode5
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode5(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByZipCode5", startResult, maxRows, zipCode5);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByNameSuffix
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameSuffix(String nameSuffix) throws DataAccessException {

		return findCustomerProfileByNameSuffix(nameSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByNameSuffix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameSuffix(String nameSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByNameSuffix", startResult, maxRows, nameSuffix);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone1Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone1Containing(String phone1) throws DataAccessException {

		return findCustomerProfileByPhone1Containing(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByPhone1Containing", startResult, maxRows, phone1);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone2Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone2Containing(String phone2) throws DataAccessException {

		return findCustomerProfileByPhone2Containing(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByPhone2Containing", startResult, maxRows, phone2);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByLastNameContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastNameContaining(String lastName) throws DataAccessException {

		return findCustomerProfileByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIpContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastLoginIpContaining(String lastLoginIp) throws DataAccessException {

		return findCustomerProfileByLastLoginIpContaining(lastLoginIp, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastLoginIpContaining(String lastLoginIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByLastLoginIpContaining", startResult, maxRows, lastLoginIp);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByLastSuccessLogin
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastSuccessLogin(java.util.Calendar lastSuccessLogin) throws DataAccessException {

		return findCustomerProfileByLastSuccessLogin(lastSuccessLogin, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByLastSuccessLogin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastSuccessLogin(java.util.Calendar lastSuccessLogin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByLastSuccessLogin", startResult, maxRows, lastSuccessLogin);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode4
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode4(String zipCode4) throws DataAccessException {

		return findCustomerProfileByZipCode4(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode4
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByZipCode4", startResult, maxRows, zipCode4);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByPrimaryKey
	 *
	 */
	@Transactional
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId) throws DataAccessException {

		return findCustomerProfileByPrimaryKey(customerId, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByPrimaryKey
	 *
	 */

	@Transactional
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerProfileByPrimaryKey", startResult, maxRows, customerId);
			return (main.app.domain.CustomerProfile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerId
	 *
	 */
	@Transactional
	public CustomerProfile findCustomerProfileByCustomerId(Integer customerId) throws DataAccessException {

		return findCustomerProfileByCustomerId(customerId, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerId
	 *
	 */

	@Transactional
	public CustomerProfile findCustomerProfileByCustomerId(Integer customerId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerProfileByCustomerId", startResult, maxRows, customerId);
			return (main.app.domain.CustomerProfile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerProfileByFirstName
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByFirstName(String firstName) throws DataAccessException {

		return findCustomerProfileByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByLastName
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastName(String lastName) throws DataAccessException {

		return findCustomerProfileByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedBy
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedBy(String modifiedBy) throws DataAccessException {

		return findCustomerProfileByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerNameContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerNameContaining(String customerName) throws DataAccessException {

		return findCustomerProfileByCustomerNameContaining(customerName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerNameContaining(String customerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerNameContaining", startResult, maxRows, customerName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine3Containing(String addressLine3) throws DataAccessException {

		return findCustomerProfileByAddressLine3Containing(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine3Containing", startResult, maxRows, addressLine3);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedOn
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findCustomerProfileByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedIp
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedIp(String createdIp) throws DataAccessException {

		return findCustomerProfileByCreatedIp(createdIp, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedIp(String createdIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCreatedIp", startResult, maxRows, createdIp);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmail
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerEmail(String customerEmail) throws DataAccessException {

		return findCustomerProfileByCustomerEmail(customerEmail, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerEmail(String customerEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerEmail", startResult, maxRows, customerEmail);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmailContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerEmailContaining(String customerEmail) throws DataAccessException {

		return findCustomerProfileByCustomerEmailContaining(customerEmail, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerEmailContaining(String customerEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerEmailContaining", startResult, maxRows, customerEmail);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone1
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone1(String phone1) throws DataAccessException {

		return findCustomerProfileByPhone1(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByPhone1", startResult, maxRows, phone1);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByVisits
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByVisits(java.math.BigDecimal visits) throws DataAccessException {

		return findCustomerProfileByVisits(visits, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByVisits
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByVisits(java.math.BigDecimal visits, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByVisits", startResult, maxRows, visits);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIp
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastLoginIp(String lastLoginIp) throws DataAccessException {

		return findCustomerProfileByLastLoginIp(lastLoginIp, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIp
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByLastLoginIp(String lastLoginIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByLastLoginIp", startResult, maxRows, lastLoginIp);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCustomerProfiles
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findAllCustomerProfiles() throws DataAccessException {

		return findAllCustomerProfiles(-1, -1);
	}

	/**
	 * JPQL Query - findAllCustomerProfiles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findAllCustomerProfiles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCustomerProfiles", startResult, maxRows);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByMiddleName
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByMiddleName(String middleName) throws DataAccessException {

		return findCustomerProfileByMiddleName(middleName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByMiddleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByMiddleName(String middleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByMiddleName", startResult, maxRows, middleName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByProfileStatus
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByProfileStatus(String profileStatus) throws DataAccessException {

		return findCustomerProfileByProfileStatus(profileStatus, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByProfileStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByProfileStatus(String profileStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByProfileStatus", startResult, maxRows, profileStatus);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByMiddleNameContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByMiddleNameContaining(String middleName) throws DataAccessException {

		return findCustomerProfileByMiddleNameContaining(middleName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByMiddleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByMiddleNameContaining(String middleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByMiddleNameContaining", startResult, maxRows, middleName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedOn
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findCustomerProfileByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedIpContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedIpContaining(String createdIp) throws DataAccessException {

		return findCustomerProfileByCreatedIpContaining(createdIp, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedIpContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedIpContaining(String createdIp, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCreatedIpContaining", startResult, maxRows, createdIp);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerPasswordContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerPasswordContaining(String customerPassword) throws DataAccessException {

		return findCustomerProfileByCustomerPasswordContaining(customerPassword, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerPasswordContaining(String customerPassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerPasswordContaining", startResult, maxRows, customerPassword);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedByContaining(String createdBy) throws DataAccessException {

		return findCustomerProfileByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedBy
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedBy(String createdBy) throws DataAccessException {

		return findCustomerProfileByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine1(String addressLine1) throws DataAccessException {

		return findCustomerProfileByAddressLine1(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine1", startResult, maxRows, addressLine1);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine1Containing(String addressLine1) throws DataAccessException {

		return findCustomerProfileByAddressLine1Containing(addressLine1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine1Containing", startResult, maxRows, addressLine1);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByProfileStatusContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByProfileStatusContaining(String profileStatus) throws DataAccessException {

		return findCustomerProfileByProfileStatusContaining(profileStatus, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByProfileStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByProfileStatusContaining(String profileStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByProfileStatusContaining", startResult, maxRows, profileStatus);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine2(String addressLine2) throws DataAccessException {

		return findCustomerProfileByAddressLine2(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine2", startResult, maxRows, addressLine2);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByFirstNameContaining(String firstName) throws DataAccessException {

		return findCustomerProfileByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findCustomerProfileByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByNameTitleContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameTitleContaining(String nameTitle) throws DataAccessException {

		return findCustomerProfileByNameTitleContaining(nameTitle, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByNameTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameTitleContaining(String nameTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByNameTitleContaining", startResult, maxRows, nameTitle);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByNameSuffixContaining
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameSuffixContaining(String nameSuffix) throws DataAccessException {

		return findCustomerProfileByNameSuffixContaining(nameSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByNameSuffixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameSuffixContaining(String nameSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByNameSuffixContaining", startResult, maxRows, nameSuffix);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByNameTitle
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameTitle(String nameTitle) throws DataAccessException {

		return findCustomerProfileByNameTitle(nameTitle, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByNameTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByNameTitle(String nameTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByNameTitle", startResult, maxRows, nameTitle);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine3(String addressLine3) throws DataAccessException {

		return findCustomerProfileByAddressLine3(addressLine3, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine3", startResult, maxRows, addressLine3);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerPassword
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerPassword(String customerPassword) throws DataAccessException {

		return findCustomerProfileByCustomerPassword(customerPassword, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerPassword(String customerPassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerPassword", startResult, maxRows, customerPassword);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode5Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode5Containing(String zipCode5) throws DataAccessException {

		return findCustomerProfileByZipCode5Containing(zipCode5, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode5Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode5Containing(String zipCode5, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByZipCode5Containing", startResult, maxRows, zipCode5);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine2Containing(String addressLine2) throws DataAccessException {

		return findCustomerProfileByAddressLine2Containing(addressLine2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByAddressLine2Containing", startResult, maxRows, addressLine2);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode4Containing
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode4Containing(String zipCode4) throws DataAccessException {

		return findCustomerProfileByZipCode4Containing(zipCode4, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByZipCode4Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByZipCode4Containing(String zipCode4, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByZipCode4Containing", startResult, maxRows, zipCode4);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone2
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone2(String phone2) throws DataAccessException {

		return findCustomerProfileByPhone2(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByPhone2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByPhone2", startResult, maxRows, phone2);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerName
	 *
	 */
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerName(String customerName) throws DataAccessException {

		return findCustomerProfileByCustomerName(customerName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerProfileByCustomerName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<CustomerProfile> findCustomerProfileByCustomerName(String customerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerProfileByCustomerName", startResult, maxRows, customerName);
		return new LinkedHashSet<CustomerProfile>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(CustomerProfile entity) {
		return true;
	}
}
