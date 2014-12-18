package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.RecipientLocation;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage RecipientLocation entities.
 * 
 */
public interface RecipientLocationDAO extends JpaDao<RecipientLocation> {

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleNameContaining(String recipientMiddleName) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleNameContaining(String recipientMiddleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleName(String recipientMiddleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientMiddleName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientMiddleName(String recipientMiddleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedOn
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedOn
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffix
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffix(String recipientSuffix) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffix
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffix(String recipientSuffix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine3(String addressLine3) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByContactNumber
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByContactNumber(String contactNumber) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByContactNumber
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByContactNumber(String contactNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstNameContaining(String recipientFirstName) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstNameContaining(String recipientFirstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine1Containing(String addressLine1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode4
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode4(String zipCode4) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode4
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByContactNumberContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByContactNumberContaining(String contactNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByContactNumberContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByContactNumberContaining(String contactNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffixContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffixContaining(String recipientSuffix_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientSuffixContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientSuffixContaining(String recipientSuffix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstName(String recipientFirstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientFirstName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientFirstName(String recipientFirstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByFaxContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByFaxContaining(String fax) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByFaxContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByFaxContaining(String fax, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine2Containing(String addressLine2) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine2Containing(String addressLine2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientLastNameContaining(String recipientLastName) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastNameContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientLastNameContaining(String recipientLastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedByContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedByContaining(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedByContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitleContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientTitleContaining(String recipientTitle) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitleContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientTitleContaining(String recipientTitle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine1(String addressLine1_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine1
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine1(String addressLine1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientLastName(String recipientLastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLastName
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientLastName(String recipientLastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode5Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode5Containing(String zipCode5) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode5Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode5Containing(String zipCode5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRecipientLocations
	 *
	 */
	public Set<RecipientLocation> findAllRecipientLocations() throws DataAccessException;

	/**
	 * JPQL Query - findAllRecipientLocations
	 *
	 */
	public Set<RecipientLocation> findAllRecipientLocations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine3Containing(String addressLine3_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine3Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine3Containing(String addressLine3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode5
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode5(String zipCode5_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode5
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode5(String zipCode5_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedOn
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedOn
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedByContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedByContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByPrimaryKey
	 *
	 */
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByPrimaryKey
	 *
	 */
	public RecipientLocation findRecipientLocationByPrimaryKey(Integer recipientLocationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedBy
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByModifiedBy
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode4Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode4Containing(String zipCode4_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByZipCode4Containing
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByZipCode4Containing(String zipCode4_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByFax
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByFax(String fax_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByFax
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByFax(String fax_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitle
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientTitle(String recipientTitle_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientTitle
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByRecipientTitle(String recipientTitle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine2(String addressLine2_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByAddressLine2
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByAddressLine2(String addressLine2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByEmail
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByEmail
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedBy
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedBy(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByCreatedBy
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByCreatedBy(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByEmailContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByEmailContaining
	 *
	 */
	public Set<RecipientLocation> findRecipientLocationByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLocationId
	 *
	 */
	public RecipientLocation findRecipientLocationByRecipientLocationId(Integer recipientLocationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findRecipientLocationByRecipientLocationId
	 *
	 */
	public RecipientLocation findRecipientLocationByRecipientLocationId(Integer recipientLocationId_1, int startResult, int maxRows) throws DataAccessException;

}