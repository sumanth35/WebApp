package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.VendorLocationAssociations;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage VendorLocationAssociations entities.
 * 
 */
public interface VendorLocationAssociationsDAO extends
		JpaDao<VendorLocationAssociations> {

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedBy
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedBy
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedOn
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedOn
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByLocationId
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByLocationId(Integer locationId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByLocationId
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByLocationId(Integer locationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByVendorLocationAssociationId
	 *
	 */
	public VendorLocationAssociations findVendorLocationAssociationsByVendorLocationAssociationId(Integer vendorLocationAssociationId) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByVendorLocationAssociationId
	 *
	 */
	public VendorLocationAssociations findVendorLocationAssociationsByVendorLocationAssociationId(Integer vendorLocationAssociationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedBy
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedBy(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedBy
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorLocationAssociationss
	 *
	 */
	public Set<VendorLocationAssociations> findAllVendorLocationAssociationss() throws DataAccessException;

	/**
	 * JPQL Query - findAllVendorLocationAssociationss
	 *
	 */
	public Set<VendorLocationAssociations> findAllVendorLocationAssociationss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByPrimaryKey
	 *
	 */
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByPrimaryKey
	 *
	 */
	public VendorLocationAssociations findVendorLocationAssociationsByPrimaryKey(Integer vendorLocationAssociationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedByContaining
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedByContaining(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByModifiedByContaining
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByModifiedByContaining(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedByContaining
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedByContaining
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedOn
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findVendorLocationAssociationsByCreatedOn
	 *
	 */
	public Set<VendorLocationAssociations> findVendorLocationAssociationsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

}