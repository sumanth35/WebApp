package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.VendorProfile;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage VendorProfile entities.
 * 
 */
public interface VendorProfileDAO extends JpaDao<VendorProfile> {

	/**
	 * JPQL Query - findVendorProfileByPhone2
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone2(String phone2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone2
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmail
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationEmail(String registrationEmail) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmail
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationEmail(String registrationEmail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax1
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax1(String fax1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax1
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax1(String fax1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationId
	 *
	 */
	public VendorProfile findVendorProfileByRegistrationId(Integer registrationId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationId
	 *
	 */
	public VendorProfile findVendorProfileByRegistrationId(Integer registrationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFirstNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFirstNameContaining(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFirstNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameTitle
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameTitle(String nameTitle) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameTitle
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameTitle(String nameTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedByContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedByContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax2Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax2Containing(String fax2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax2Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax2Containing(String fax2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByMiddleName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByMiddleName(String middleName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByMiddleName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByMiddleName(String middleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedBy
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedBy
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone1
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone1(String phone1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone1
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationNameContaining(String registrationName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationNameContaining(String registrationName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmailContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationEmailContaining(String registrationEmail_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationEmailContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationEmailContaining(String registrationEmail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByProfileStatus
	 *
	 */
	public Set<VendorProfile> findVendorProfileByProfileStatus(String profileStatus) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByProfileStatus
	 *
	 */
	public Set<VendorProfile> findVendorProfileByProfileStatus(String profileStatus, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByVendorPasswordContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByVendorPasswordContaining(String vendorPassword) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByVendorPasswordContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByVendorPasswordContaining(String vendorPassword, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByEducationDegreeContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByEducationDegreeContaining(String educationDegree) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByEducationDegreeContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByEducationDegreeContaining(String educationDegree, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone1Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone1Containing(String phone1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone1Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone1Containing(String phone1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameSuffix
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameSuffix(String nameSuffix) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameSuffix
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameSuffix(String nameSuffix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByEducationDegree
	 *
	 */
	public Set<VendorProfile> findVendorProfileByEducationDegree(String educationDegree_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByEducationDegree
	 *
	 */
	public Set<VendorProfile> findVendorProfileByEducationDegree(String educationDegree_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedOn
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByCreatedOn
	 *
	 */
	public Set<VendorProfile> findVendorProfileByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedByContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedByContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByVendorPassword
	 *
	 */
	public Set<VendorProfile> findVendorProfileByVendorPassword(String vendorPassword_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByVendorPassword
	 *
	 */
	public Set<VendorProfile> findVendorProfileByVendorPassword(String vendorPassword_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedBy
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedBy
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFirstName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFirstName(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFirstName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFirstName(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameSuffixContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameSuffixContaining(String nameSuffix_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameSuffixContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameSuffixContaining(String nameSuffix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameTitleContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameTitleContaining(String nameTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByNameTitleContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByNameTitleContaining(String nameTitle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPrimaryKey
	 *
	 */
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPrimaryKey
	 *
	 */
	public VendorProfile findVendorProfileByPrimaryKey(Integer registrationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedOn
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByModifiedOn
	 *
	 */
	public Set<VendorProfile> findVendorProfileByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax2
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax2(String fax2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax2
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax2(String fax2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax1Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax1Containing(String fax1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByFax1Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByFax1Containing(String fax1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByMiddleNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByMiddleNameContaining(String middleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByMiddleNameContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByMiddleNameContaining(String middleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone2Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone2Containing(String phone2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByPhone2Containing
	 *
	 */
	public Set<VendorProfile> findVendorProfileByPhone2Containing(String phone2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastSucessLogin
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastSucessLogin(java.util.Calendar lastSucessLogin) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByLastSucessLogin
	 *
	 */
	public Set<VendorProfile> findVendorProfileByLastSucessLogin(Calendar lastSucessLogin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationName(String registrationName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByRegistrationName
	 *
	 */
	public Set<VendorProfile> findVendorProfileByRegistrationName(String registrationName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByProfileStatusContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByProfileStatusContaining(String profileStatus_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByProfileStatusContaining
	 *
	 */
	public Set<VendorProfile> findVendorProfileByProfileStatusContaining(String profileStatus_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByInactivityDuration
	 *
	 */
	public Set<VendorProfile> findVendorProfileByInactivityDuration(Integer inactivityDuration) throws DataAccessException;

	/**
	 * JPQL Query - findVendorProfileByInactivityDuration
	 *
	 */
	public Set<VendorProfile> findVendorProfileByInactivityDuration(Integer inactivityDuration, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorProfiles
	 *
	 */
	public Set<VendorProfile> findAllVendorProfiles() throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorProfiles
	 *
	 */
	public Set<VendorProfile> findAllVendorProfiles(int startResult, int maxRows) throws DataAccessException;

}