package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.VendorProfile;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage VendorProfile entities.
 * 
 */
@Repository("VendorProfileDAO")
@Transactional
public class VendorProfileDAOImpl extends AbstractJpaDao<VendorProfile>
		implements VendorProfileDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { VendorProfile.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new VendorProfileDAOImpl
	 *
	 */
	public VendorProfileDAOImpl() {
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
	 * JPQL Query - findVendorProfileByPhone2
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone2(String phone2) throws DataAccessException {

		return findVendorProfileByPhone2(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByPhone2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByPhone2", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmail
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationEmail(String registrationEmail) throws DataAccessException {

		return findVendorProfileByRegistrationEmail(registrationEmail, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationEmail(String registrationEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByRegistrationEmail", startResult, maxRows, registrationEmail);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByFax1
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax1(String fax1) throws DataAccessException {

		return findVendorProfileByFax1(fax1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFax1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax1(String fax1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFax1", startResult, maxRows, fax1);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByLastNameContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastNameContaining(String lastName) throws DataAccessException {

		return findVendorProfileByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationId
	 *
	 */
	@Transactional
	public VendorProfile findVendorProfileByRegistrationId(Integer registrationId) throws DataAccessException {

		return findVendorProfileByRegistrationId(registrationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationId
	 *
	 */

	@Transactional
	public VendorProfile findVendorProfileByRegistrationId(Integer registrationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorProfileByRegistrationId", startResult, maxRows, registrationId);
			return (main.app.domain.VendorProfile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorProfileByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFirstNameContaining(String firstName) throws DataAccessException {

		return findVendorProfileByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByNameTitle
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameTitle(String nameTitle) throws DataAccessException {

		return findVendorProfileByNameTitle(nameTitle, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByNameTitle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameTitle(String nameTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByNameTitle", startResult, maxRows, nameTitle);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedByContaining(String createdBy) throws DataAccessException {

		return findVendorProfileByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByFax2Containing
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax2Containing(String fax2) throws DataAccessException {

		return findVendorProfileByFax2Containing(fax2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFax2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax2Containing(String fax2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFax2Containing", startResult, maxRows, fax2);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByMiddleName
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByMiddleName(String middleName) throws DataAccessException {

		return findVendorProfileByMiddleName(middleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByMiddleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByMiddleName(String middleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByMiddleName", startResult, maxRows, middleName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedBy
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedBy(String createdBy) throws DataAccessException {

		return findVendorProfileByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByPhone1
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone1(String phone1) throws DataAccessException {

		return findVendorProfileByPhone1(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByPhone1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByPhone1", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationNameContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationNameContaining(String registrationName) throws DataAccessException {

		return findVendorProfileByRegistrationNameContaining(registrationName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationNameContaining(String registrationName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByRegistrationNameContaining", startResult, maxRows, registrationName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmailContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationEmailContaining(String registrationEmail) throws DataAccessException {

		return findVendorProfileByRegistrationEmailContaining(registrationEmail, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationEmailContaining(String registrationEmail, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByRegistrationEmailContaining", startResult, maxRows, registrationEmail);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByProfileStatus
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByProfileStatus(String profileStatus) throws DataAccessException {

		return findVendorProfileByProfileStatus(profileStatus, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByProfileStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByProfileStatus(String profileStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByProfileStatus", startResult, maxRows, profileStatus);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByVendorPasswordContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByVendorPasswordContaining(String vendorPassword) throws DataAccessException {

		return findVendorProfileByVendorPasswordContaining(vendorPassword, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByVendorPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByVendorPasswordContaining(String vendorPassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByVendorPasswordContaining", startResult, maxRows, vendorPassword);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByEducationDegreeContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByEducationDegreeContaining(String educationDegree) throws DataAccessException {

		return findVendorProfileByEducationDegreeContaining(educationDegree, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByEducationDegreeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByEducationDegreeContaining(String educationDegree, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByEducationDegreeContaining", startResult, maxRows, educationDegree);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByPhone1Containing
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone1Containing(String phone1) throws DataAccessException {

		return findVendorProfileByPhone1Containing(phone1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByPhone1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByPhone1Containing", startResult, maxRows, phone1);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByNameSuffix
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameSuffix(String nameSuffix) throws DataAccessException {

		return findVendorProfileByNameSuffix(nameSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByNameSuffix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameSuffix(String nameSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByNameSuffix", startResult, maxRows, nameSuffix);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByEducationDegree
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByEducationDegree(String educationDegree) throws DataAccessException {

		return findVendorProfileByEducationDegree(educationDegree, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByEducationDegree
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByEducationDegree(String educationDegree, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByEducationDegree", startResult, maxRows, educationDegree);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedOn
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findVendorProfileByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findVendorProfileByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByVendorPassword
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByVendorPassword(String vendorPassword) throws DataAccessException {

		return findVendorProfileByVendorPassword(vendorPassword, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByVendorPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByVendorPassword(String vendorPassword, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByVendorPassword", startResult, maxRows, vendorPassword);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedBy
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedBy(String modifiedBy) throws DataAccessException {

		return findVendorProfileByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByFirstName
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFirstName(String firstName) throws DataAccessException {

		return findVendorProfileByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByNameSuffixContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameSuffixContaining(String nameSuffix) throws DataAccessException {

		return findVendorProfileByNameSuffixContaining(nameSuffix, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByNameSuffixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameSuffixContaining(String nameSuffix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByNameSuffixContaining", startResult, maxRows, nameSuffix);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByNameTitleContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameTitleContaining(String nameTitle) throws DataAccessException {

		return findVendorProfileByNameTitleContaining(nameTitle, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByNameTitleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByNameTitleContaining(String nameTitle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByNameTitleContaining", startResult, maxRows, nameTitle);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByPrimaryKey
	 *
	 */
	@Transactional
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId) throws DataAccessException {

		return findVendorProfileByPrimaryKey(registrationId, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByPrimaryKey
	 *
	 */

	@Transactional
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVendorProfileByPrimaryKey", startResult, maxRows, registrationId);
			return (main.app.domain.VendorProfile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedOn
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findVendorProfileByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByLastName
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastName(String lastName) throws DataAccessException {

		return findVendorProfileByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByFax2
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax2(String fax2) throws DataAccessException {

		return findVendorProfileByFax2(fax2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFax2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax2(String fax2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFax2", startResult, maxRows, fax2);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByFax1Containing
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax1Containing(String fax1) throws DataAccessException {

		return findVendorProfileByFax1Containing(fax1, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByFax1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByFax1Containing(String fax1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByFax1Containing", startResult, maxRows, fax1);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByMiddleNameContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByMiddleNameContaining(String middleName) throws DataAccessException {

		return findVendorProfileByMiddleNameContaining(middleName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByMiddleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByMiddleNameContaining(String middleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByMiddleNameContaining", startResult, maxRows, middleName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByPhone2Containing
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone2Containing(String phone2) throws DataAccessException {

		return findVendorProfileByPhone2Containing(phone2, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByPhone2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByPhone2Containing", startResult, maxRows, phone2);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByLastSucessLogin
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastSucessLogin(java.util.Calendar lastSucessLogin) throws DataAccessException {

		return findVendorProfileByLastSucessLogin(lastSucessLogin, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByLastSucessLogin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByLastSucessLogin(java.util.Calendar lastSucessLogin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByLastSucessLogin", startResult, maxRows, lastSucessLogin);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationName
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationName(String registrationName) throws DataAccessException {

		return findVendorProfileByRegistrationName(registrationName, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByRegistrationName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByRegistrationName(String registrationName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByRegistrationName", startResult, maxRows, registrationName);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByProfileStatusContaining
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByProfileStatusContaining(String profileStatus) throws DataAccessException {

		return findVendorProfileByProfileStatusContaining(profileStatus, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByProfileStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByProfileStatusContaining(String profileStatus, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByProfileStatusContaining", startResult, maxRows, profileStatus);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findVendorProfileByInactivityDuration
	 *
	 */
	@Transactional
	public Set<VendorProfile> findVendorProfileByInactivityDuration(Integer inactivityDuration) throws DataAccessException {

		return findVendorProfileByInactivityDuration(inactivityDuration, -1, -1);
	}

	/**
	 * JPQL Query - findVendorProfileByInactivityDuration
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findVendorProfileByInactivityDuration(Integer inactivityDuration, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVendorProfileByInactivityDuration", startResult, maxRows, inactivityDuration);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllVendorProfiles
	 *
	 */
	@Transactional
	public Set<VendorProfile> findAllVendorProfiles() throws DataAccessException {

		return findAllVendorProfiles(-1, -1);
	}

	/**
	 * JPQL Query - findAllVendorProfiles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<VendorProfile> findAllVendorProfiles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllVendorProfiles", startResult, maxRows);
		return new LinkedHashSet<VendorProfile>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(VendorProfile entity) {
		return true;
	}
}
