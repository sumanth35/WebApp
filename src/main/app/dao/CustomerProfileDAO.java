package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.CustomerProfile;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage CustomerProfile entities.
 * 
 */
public interface CustomerProfileDAO extends JpaDao<CustomerProfile> {

	/**
	 * JPQL Query - findCustomerProfileByZipCode5
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode5(String zipCode5) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode5
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode5(String zipCode5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameSuffix
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameSuffix(String nameSuffix) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameSuffix
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameSuffix(String nameSuffix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone1Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone1Containing(String phone1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone1Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone1Containing(String phone1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone2Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone2Containing(String phone2) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone2Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone2Containing(String phone2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIpContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastLoginIpContaining(String lastLoginIp) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIpContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastLoginIpContaining(String lastLoginIp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastSuccessLogin
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastSuccessLogin(java.util.Calendar lastSuccessLogin) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastSuccessLogin
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastSuccessLogin(Calendar lastSuccessLogin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode4
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode4(String zipCode4) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode4
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPrimaryKey
	 *
	 */
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPrimaryKey
	 *
	 */
	public CustomerProfile findCustomerProfileByPrimaryKey(Integer customerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerId
	 *
	 */
	public CustomerProfile findCustomerProfileByCustomerId(Integer customerId_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerId
	 *
	 */
	public CustomerProfile findCustomerProfileByCustomerId(Integer customerId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByFirstName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByFirstName(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByFirstName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedBy
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedBy
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerNameContaining(String customerName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerNameContaining(String customerName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine3Containing(String addressLine3) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedOn
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedOn
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedIp
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedIp(String createdIp) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedIp
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedIp(String createdIp, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmail
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerEmail(String customerEmail) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmail
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerEmail(String customerEmail, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmailContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerEmailContaining(String customerEmail_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerEmailContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerEmailContaining(String customerEmail_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone1
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone1(String phone1_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone1
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone1(String phone1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByVisits
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByVisits(java.math.BigDecimal visits) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByVisits
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByVisits(BigDecimal visits, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIp
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastLoginIp(String lastLoginIp_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByLastLoginIp
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByLastLoginIp(String lastLoginIp_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerProfiles
	 *
	 */
	public Set<CustomerProfile> findAllCustomerProfiles() throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomerProfiles
	 *
	 */
	public Set<CustomerProfile> findAllCustomerProfiles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByMiddleName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByMiddleName(String middleName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByMiddleName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByMiddleName(String middleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByProfileStatus
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByProfileStatus(String profileStatus) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByProfileStatus
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByProfileStatus(String profileStatus, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByMiddleNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByMiddleNameContaining(String middleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByMiddleNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByMiddleNameContaining(String middleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedOn
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedOn
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedIpContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedIpContaining(String createdIp_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedIpContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedIpContaining(String createdIp_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerPasswordContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerPasswordContaining(String customerPassword) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerPasswordContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerPasswordContaining(String customerPassword, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedByContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedByContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedBy
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCreatedBy
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine1(String addressLine1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine1Containing(String addressLine1_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine1Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine1Containing(String addressLine1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByProfileStatusContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByProfileStatusContaining(String profileStatus_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByProfileStatusContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByProfileStatusContaining(String profileStatus_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine2(String addressLine2) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByFirstNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByFirstNameContaining(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByFirstNameContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByFirstNameContaining(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedByContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByModifiedByContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameTitleContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameTitleContaining(String nameTitle) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameTitleContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameTitleContaining(String nameTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameSuffixContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameSuffixContaining(String nameSuffix_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameSuffixContaining
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameSuffixContaining(String nameSuffix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameTitle
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameTitle(String nameTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByNameTitle
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByNameTitle(String nameTitle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine3(String addressLine3_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine3
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine3(String addressLine3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerPassword
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerPassword(String customerPassword_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerPassword
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerPassword(String customerPassword_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode5Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode5Containing(String zipCode5_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode5Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode5Containing(String zipCode5_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine2Containing(String addressLine2_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByAddressLine2Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByAddressLine2Containing(String addressLine2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode4Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode4Containing(String zipCode4_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByZipCode4Containing
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByZipCode4Containing(String zipCode4_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone2
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone2(String phone2_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByPhone2
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByPhone2(String phone2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerName(String customerName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerProfileByCustomerName
	 *
	 */
	public Set<CustomerProfile> findCustomerProfileByCustomerName(String customerName_1, int startResult, int maxRows) throws DataAccessException;

}