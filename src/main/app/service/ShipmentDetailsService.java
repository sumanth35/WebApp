package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;

/**
 * Spring service that handles CRUD requests for ShipmentDetails entities
 * 
 */
public interface ShipmentDetailsService {

	/**
	 * Load an existing ShipmentDetails entity
	 * 
	 */
	public Set<ShipmentDetails> loadShipmentDetailss();

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	public ShipmentDetails deleteShipmentDetailsRecipientLocation(Integer shipmentdetails_shipmentId, Integer related_recipientlocation_recipientLocationId);

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	public ShipmentDetails saveShipmentDetailsRecipientLocation(Integer shipmentId, RecipientLocation related_recipientlocation);

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	public ShipmentDetails saveShipmentDetailsOrderRequest(Integer shipmentId_1, OrderRequest related_orderrequest);

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	public void deleteShipmentDetails(ShipmentDetails shipmentdetails);

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	public ShipmentDetails deleteShipmentDetailsOrderRequest(Integer shipmentdetails_shipmentId_1, Integer related_orderrequest_orderRequestId);

	/**
	 * Return all ShipmentDetails entity
	 * 
	 */
	public List<ShipmentDetails> findAllShipmentDetailss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all ShipmentDetails entity
	 * 
	 */
	public Integer countShipmentDetailss();

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	public void saveShipmentDetails(ShipmentDetails shipmentdetails_1);

	/**
	 */
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId_2);
}