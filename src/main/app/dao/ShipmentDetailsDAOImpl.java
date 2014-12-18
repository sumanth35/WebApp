package main.app.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import main.app.domain.ShipmentDetails;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage ShipmentDetails entities.
 * 
 */
@Repository("ShipmentDetailsDAO")
@Transactional
public class ShipmentDetailsDAOImpl extends AbstractJpaDao<ShipmentDetails>
		implements ShipmentDetailsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ShipmentDetails.class }));

	/**
	 * EntityManager injected by Spring for persistence unit Oracle
	 *
	 */
	@PersistenceContext(unitName = "Oracle")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ShipmentDetailsDAOImpl
	 *
	 */
	public ShipmentDetailsDAOImpl() {
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
	 * JPQL Query - findShipmentDetailsByCreatedOn
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedOn(java.util.Calendar createdOn) throws DataAccessException {

		return findShipmentDetailsByCreatedOn(createdOn, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByCreatedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedOn(java.util.Calendar createdOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByCreatedOn", startResult, maxRows, createdOn);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedByContaining
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedByContaining(String modifiedBy) throws DataAccessException {

		return findShipmentDetailsByModifiedByContaining(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedByContaining(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByModifiedByContaining", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumberContaining
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumberContaining(String trackingNumber) throws DataAccessException {

		return findShipmentDetailsByTrackingNumberContaining(trackingNumber, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumberContaining(String trackingNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByTrackingNumberContaining", startResult, maxRows, trackingNumber);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByStatusContaining
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByStatusContaining(String status) throws DataAccessException {

		return findShipmentDetailsByStatusContaining(status, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByStatusContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByStatusContaining(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByStatusContaining", startResult, maxRows, status);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedBy
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedBy(String modifiedBy) throws DataAccessException {

		return findShipmentDetailsByModifiedBy(modifiedBy, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedBy(String modifiedBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByModifiedBy", startResult, maxRows, modifiedBy);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByPrimaryKey
	 *
	 */
	@Transactional
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId) throws DataAccessException {

		return findShipmentDetailsByPrimaryKey(shipmentId, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByPrimaryKey
	 *
	 */

	@Transactional
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findShipmentDetailsByPrimaryKey", startResult, maxRows, shipmentId);
			return (main.app.domain.ShipmentDetails) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findShipmentDetailsByCreatedBy
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedBy(String createdBy) throws DataAccessException {

		return findShipmentDetailsByCreatedBy(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByCreatedBy
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedBy(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByCreatedBy", startResult, maxRows, createdBy);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentId
	 *
	 */
	@Transactional
	public ShipmentDetails findShipmentDetailsByShipmentId(Integer shipmentId) throws DataAccessException {

		return findShipmentDetailsByShipmentId(shipmentId, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentId
	 *
	 */

	@Transactional
	public ShipmentDetails findShipmentDetailsByShipmentId(Integer shipmentId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findShipmentDetailsByShipmentId", startResult, maxRows, shipmentId);
			return (main.app.domain.ShipmentDetails) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findShipmentDetailsByCreatedByContaining
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedByContaining(String createdBy) throws DataAccessException {

		return findShipmentDetailsByCreatedByContaining(createdBy, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByCreatedByContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByCreatedByContaining(String createdBy, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByCreatedByContaining", startResult, maxRows, createdBy);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByExpectedDelivery
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByExpectedDelivery(java.util.Calendar expectedDelivery) throws DataAccessException {

		return findShipmentDetailsByExpectedDelivery(expectedDelivery, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByExpectedDelivery
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByExpectedDelivery(java.util.Calendar expectedDelivery, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByExpectedDelivery", startResult, maxRows, expectedDelivery);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllShipmentDetailss
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findAllShipmentDetailss() throws DataAccessException {

		return findAllShipmentDetailss(-1, -1);
	}

	/**
	 * JPQL Query - findAllShipmentDetailss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findAllShipmentDetailss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllShipmentDetailss", startResult, maxRows);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByStatus
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByStatus(String status) throws DataAccessException {

		return findShipmentDetailsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByStatus(String status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrier
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrier(String shipmentCarrier) throws DataAccessException {

		return findShipmentDetailsByShipmentCarrier(shipmentCarrier, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrier
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrier(String shipmentCarrier, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByShipmentCarrier", startResult, maxRows, shipmentCarrier);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrierContaining
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrierContaining(String shipmentCarrier) throws DataAccessException {

		return findShipmentDetailsByShipmentCarrierContaining(shipmentCarrier, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByShipmentCarrierContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByShipmentCarrierContaining(String shipmentCarrier, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByShipmentCarrierContaining", startResult, maxRows, shipmentCarrier);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedOn
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedOn(java.util.Calendar modifiedOn) throws DataAccessException {

		return findShipmentDetailsByModifiedOn(modifiedOn, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByModifiedOn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByModifiedOn(java.util.Calendar modifiedOn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByModifiedOn", startResult, maxRows, modifiedOn);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumber
	 *
	 */
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumber(String trackingNumber) throws DataAccessException {

		return findShipmentDetailsByTrackingNumber(trackingNumber, -1, -1);
	}

	/**
	 * JPQL Query - findShipmentDetailsByTrackingNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ShipmentDetails> findShipmentDetailsByTrackingNumber(String trackingNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findShipmentDetailsByTrackingNumber", startResult, maxRows, trackingNumber);
		return new LinkedHashSet<ShipmentDetails>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ShipmentDetails entity) {
		return true;
	}
}
