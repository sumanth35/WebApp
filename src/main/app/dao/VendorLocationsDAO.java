package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.VendorLocations;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage VendorLocations entities.
 * 
 */
public interface VendorLocationsDAO extends JpaDao<VendorLocations> {

	/**
	 * JPQL Query - findVendorLocationsByLocationName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationName(String locationName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationName(String locationName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleName(String locationAdminMiddleName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleName(String locationAdminMiddleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstName(String locationAdminFirstName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstName(String locationAdminFirstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByStatus
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByStatus(String status) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByStatus
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByStatus(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByFax
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByFax(String fax) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByFax
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByFax(String fax, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPrimaryKey
	 *
	 */
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPrimaryKey
	 *
	 */
	public VendorLocations findVendorLocationsByPrimaryKey(Integer locationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByEmailContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByEmailContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByEmail
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByEmail
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedBy
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedBy
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode4
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode4(String zipCode4) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode4
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode4(String zipCode4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedOn
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedOn
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByStatusContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByStatusContaining(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByStatusContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByStatusContaining(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffixContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffixContaining(String locationAdminSuffix) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffixContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffixContaining(String locationAdminSuffix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone1
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone1(String phone1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone1
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone1(String phone1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine2(String addressLine2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine2(String addressLine2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone2
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone2(String phone2) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone2
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone2(String phone2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine3(String addressLine3) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine3(String addressLine3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedOn
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedOn
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastName(String locationAdminLastName) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastName
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastName(String locationAdminLastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationId
	 *
	 */
	public VendorLocations findVendorLocationsByLocationId(Integer locationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationId
	 *
	 */
	public VendorLocations findVendorLocationsByLocationId(Integer locationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone2Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone2Containing(String phone2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone2Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone2Containing(String phone2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode4Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode4Containing(String zipCode4_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode4Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode4Containing(String zipCode4_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine1(String addressLine1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine1(String addressLine1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationNameContaining(String locationName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationNameContaining(String locationName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffix
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffix(String locationAdminSuffix_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminSuffix
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminSuffix(String locationAdminSuffix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleNameContaining(String locationAdminMiddleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminMiddleNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminMiddleNameContaining(String locationAdminMiddleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedBy
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedBy
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode5Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode5Containing(String zipCode5) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode5Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode5Containing(String zipCode5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode5
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode5(String zipCode5_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByZipCode5
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByZipCode5(String zipCode5_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine1Containing(String addressLine1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine1Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine1Containing(String addressLine1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine3Containing(String addressLine3_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine3Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine3Containing(String addressLine3_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedByContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByCreatedByContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastNameContaining(String locationAdminLastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminLastNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminLastNameContaining(String locationAdminLastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstNameContaining(String locationAdminFirstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByLocationAdminFirstNameContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByLocationAdminFirstNameContaining(String locationAdminFirstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine2Containing(String addressLine2_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByAddressLine2Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByAddressLine2Containing(String addressLine2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedByContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByModifiedByContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByFaxContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByFaxContaining(String fax_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByFaxContaining
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByFaxContaining(String fax_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorLocationss
	 *
	 */
	public Set<VendorLocations> findAllVendorLocationss() throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorLocationss
	 *
	 */
	public Set<VendorLocations> findAllVendorLocationss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone1Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone1Containing(String phone1_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationsByPhone1Containing
	 *
	 */
	public Set<VendorLocations> findVendorLocationsByPhone1Containing(String phone1_1, int startResult, int maxRows) throws DataAccessException;

}