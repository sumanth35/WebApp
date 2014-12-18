package main.app.dao;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.VendorOrganizations;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage VendorOrganizations entities.
 * 
 */
public interface VendorOrganizationsDAO extends JpaDao<VendorOrganizations> {

	/**
	 * JPQL Query - findVendorOrganizationsByEmailContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByEmailContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleNameContaining(String contactPersonMiddleName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleNameContaining(String contactPersonMiddleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1Containing(String addressLine1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1Containing(String addressLine1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1(String phone1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffixContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffixContaining(String contactPersonSuffix) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffixContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffixContaining(String contactPersonSuffix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4(String zipCode4) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2(String phone2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1Containing(String phone1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone1Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone1Containing(String phone1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByEmail
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByEmail
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastNameContaining(String contactPersonLastName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastNameContaining(String contactPersonLastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationTypeId
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationTypeId(Integer organizationTypeId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationTypeId
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationTypeId(Integer organizationTypeId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstNameContaining(String contactPersonFirstName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstNameContaining(String contactPersonFirstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2(String addressLine2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationId
	 *
	 */
	public VendorOrganizations findVendorOrganizationsByOrganizationId(Integer organizationId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationId
	 *
	 */
	public VendorOrganizations findVendorOrganizationsByOrganizationId(Integer organizationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedBy
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedBy
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPrimaryKey
	 *
	 */
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPrimaryKey
	 *
	 */
	public VendorOrganizations findVendorOrganizationsByPrimaryKey(Integer organizationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstName(String contactPersonFirstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonFirstName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonFirstName(String contactPersonFirstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByStatus
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByStatus
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByStatus(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedBy
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedBy
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode5
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode5(java.math.BigDecimal zipCode5) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode5
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode5(BigDecimal zipCode5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedOn
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedOn
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleName(String contactPersonMiddleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonMiddleName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonMiddleName(String contactPersonMiddleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessName(String organizationBusinessName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessName(String organizationBusinessName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedByContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByModifiedByContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1(String addressLine1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine1
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine1(String addressLine1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3Containing(String addressLine3) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3Containing(String addressLine3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4Containing(String zipCode4_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByZipCode4Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByZipCode4Containing(String zipCode4_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByFaxContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByFaxContaining(String fax) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByFaxContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByFaxContaining(String fax, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2Containing(String addressLine2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine2Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine2Containing(String addressLine2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorOrganizationss
	 *
	 */
	public Set<VendorOrganizations> findAllVendorOrganizationss() throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorOrganizationss
	 *
	 */
	public Set<VendorOrganizations> findAllVendorOrganizationss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByFax
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByFax(String fax_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByFax
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByFax(String fax_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByStatusContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByStatusContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByStatusContaining(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedOn
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedOn
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedByContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByCreatedByContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2Containing(String phone2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByPhone2Containing
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByPhone2Containing(String phone2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3(String addressLine3_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByAddressLine3
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByAddressLine3(String addressLine3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffix
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffix(String contactPersonSuffix_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonSuffix
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonSuffix(String contactPersonSuffix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessNameContaining(String organizationBusinessName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByOrganizationBusinessNameContaining
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByOrganizationBusinessNameContaining(String organizationBusinessName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastName(String contactPersonLastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorOrganizationsByContactPersonLastName
	 *
	 */
	public Set<VendorOrganizations> findVendorOrganizationsByContactPersonLastName(String contactPersonLastName_1, int startResult, int maxRows) throws DataAccessException;

}