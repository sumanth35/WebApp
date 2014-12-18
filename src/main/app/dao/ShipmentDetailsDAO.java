package main.app.dao;

import java.util.Calendar;
import java.util.Set;

import main.app.domain.ShipmentDetails;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ShipmentDetails entities.
 * 
 */
public interface ShipmentDetailsDAO extends JpaDao<ShipmentDetails> {

	/**
	 * JPQL Query - findShipmentDetailsByCreatedOn
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByCreatedOn
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedOn(Calendar createdOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedByContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedByContaining(String modifiedBy) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedByContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumberContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumberContaining(String trackingNumber) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumberContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumberContaining(String trackingNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByStatusContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByStatusContaining(String status) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByStatusContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedBy
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedBy(String modifiedBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedBy
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedBy(String modifiedBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByPrimaryKey
	 *
	 */
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByPrimaryKey
	 *
	 */
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByCreatedBy
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedBy(String createdBy) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByCreatedBy
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentId
	 *
	 */
	public ShipmentDetails findShipmentDetailsByShipmentId(Integer shipmentId_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentId
	 *
	 */
	public ShipmentDetails findShipmentDetailsByShipmentId(Integer shipmentId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByCreatedByContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedByContaining(String createdBy_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByCreatedByContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByCreatedByContaining(String createdBy_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByExpectedDelivery
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByExpectedDelivery(java.util.Calendar expectedDelivery) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByExpectedDelivery
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByExpectedDelivery(Calendar expectedDelivery, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllShipmentDetailss
	 *
	 */
	public Set<ShipmentDetails> findAllShipmentDetailss() throws DataAccessException;

	/**
	 * JPQL Query - findAllShipmentDetailss
	 *
	 */
	public Set<ShipmentDetails> findAllShipmentDetailss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByStatus
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByStatus(String status_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByStatus
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByStatus(String status_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrier
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrier(String shipmentCarrier) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrier
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrier(String shipmentCarrier, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrierContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrierContaining(String shipmentCarrier_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrierContaining
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrierContaining(String shipmentCarrier_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedOn
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByModifiedOn
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByModifiedOn(Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumber
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumber(String trackingNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumber
	 *
	 */
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumber(String trackingNumber_1, int startResult, int maxRows) throws DataAccessException;

}