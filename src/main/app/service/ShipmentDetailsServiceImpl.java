package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.OrderRequestDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.ShipmentDetailsDAO;

import main.app.domain.OrderRequest;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ShipmentDetails entities
 * 
 */

@Service("ShipmentDetailsService")
@Transactional
public class ShipmentDetailsServiceImpl implements ShipmentDetailsService {

	/**
	 * DAO injected by Spring that manages OrderRequest entities
	 * 
	 */
	@Autowired
	private OrderRequestDAO orderRequestDAO;

	/**
	 * DAO injected by Spring that manages RecipientLocation entities
	 * 
	 */
	@Autowired
	private RecipientLocationDAO recipientLocationDAO;

	/**
	 * DAO injected by Spring that manages ShipmentDetails entities
	 * 
	 */
	@Autowired
	private ShipmentDetailsDAO shipmentDetailsDAO;

	/**
	 * Instantiates a new ShipmentDetailsServiceImpl.
	 *
	 */
	public ShipmentDetailsServiceImpl() {
	}

	/**
	 * Load an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public Set<ShipmentDetails> loadShipmentDetailss() {
		return shipmentDetailsDAO.findAllShipmentDetailss();
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public ShipmentDetails deleteShipmentDetailsRecipientLocation(Integer shipmentdetails_shipmentId, Integer related_recipientlocation_recipientLocationId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetails_shipmentId, -1, -1);
		RecipientLocation related_recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocation_recipientLocationId, -1, -1);

		shipmentdetails.setRecipientLocation(null);
		related_recipientlocation.getShipmentDetailses().remove(shipmentdetails);
		shipmentdetails = shipmentDetailsDAO.store(shipmentdetails);
		shipmentDetailsDAO.flush();

		related_recipientlocation = recipientLocationDAO.store(related_recipientlocation);
		recipientLocationDAO.flush();

		recipientLocationDAO.remove(related_recipientlocation);
		recipientLocationDAO.flush();

		return shipmentdetails;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@Transactional
	public ShipmentDetails saveShipmentDetailsRecipientLocation(Integer shipmentId, RecipientLocation related_recipientlocation) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentId, -1, -1);
		RecipientLocation existingrecipientLocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocation.getRecipientLocationId());

		// copy into the existing record to preserve existing relationships
		if (existingrecipientLocation != null) {
			existingrecipientLocation.setRecipientLocationId(related_recipientlocation.getRecipientLocationId());
			existingrecipientLocation.setRecipientFirstName(related_recipientlocation.getRecipientFirstName());
			existingrecipientLocation.setRecipientMiddleName(related_recipientlocation.getRecipientMiddleName());
			existingrecipientLocation.setRecipientLastName(related_recipientlocation.getRecipientLastName());
			existingrecipientLocation.setRecipientSuffix(related_recipientlocation.getRecipientSuffix());
			existingrecipientLocation.setRecipientTitle(related_recipientlocation.getRecipientTitle());
			existingrecipientLocation.setAddressLine1(related_recipientlocation.getAddressLine1());
			existingrecipientLocation.setAddressLine2(related_recipientlocation.getAddressLine2());
			existingrecipientLocation.setAddressLine3(related_recipientlocation.getAddressLine3());
			existingrecipientLocation.setEmail(related_recipientlocation.getEmail());
			existingrecipientLocation.setContactNumber(related_recipientlocation.getContactNumber());
			existingrecipientLocation.setFax(related_recipientlocation.getFax());
			existingrecipientLocation.setZipCode5(related_recipientlocation.getZipCode5());
			existingrecipientLocation.setZipCode4(related_recipientlocation.getZipCode4());
			existingrecipientLocation.setCreatedOn(related_recipientlocation.getCreatedOn());
			existingrecipientLocation.setCreatedBy(related_recipientlocation.getCreatedBy());
			existingrecipientLocation.setModifiedOn(related_recipientlocation.getModifiedOn());
			existingrecipientLocation.setModifiedBy(related_recipientlocation.getModifiedBy());
			related_recipientlocation = existingrecipientLocation;
		} else {
			related_recipientlocation = recipientLocationDAO.store(related_recipientlocation);
			recipientLocationDAO.flush();
		}

		shipmentdetails.setRecipientLocation(related_recipientlocation);
		related_recipientlocation.getShipmentDetailses().add(shipmentdetails);
		shipmentdetails = shipmentDetailsDAO.store(shipmentdetails);
		shipmentDetailsDAO.flush();

		related_recipientlocation = recipientLocationDAO.store(related_recipientlocation);
		recipientLocationDAO.flush();

		return shipmentdetails;
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public ShipmentDetails saveShipmentDetailsOrderRequest(Integer shipmentId, OrderRequest related_orderrequest) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentId, -1, -1);
		OrderRequest existingorderRequest = orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequest.getOrderRequestId());

		// copy into the existing record to preserve existing relationships
		if (existingorderRequest != null) {
			existingorderRequest.setOrderRequestId(related_orderrequest.getOrderRequestId());
			existingorderRequest.setOrderConfirmationNumber(related_orderrequest.getOrderConfirmationNumber());
			existingorderRequest.setCreatedOn(related_orderrequest.getCreatedOn());
			existingorderRequest.setCreatedBy(related_orderrequest.getCreatedBy());
			existingorderRequest.setModifiedOn(related_orderrequest.getModifiedOn());
			existingorderRequest.setModifiedBy(related_orderrequest.getModifiedBy());
			existingorderRequest.setTotalCost(related_orderrequest.getTotalCost());
			existingorderRequest.setTax(related_orderrequest.getTax());
			related_orderrequest = existingorderRequest;
		} else {
			related_orderrequest = orderRequestDAO.store(related_orderrequest);
			orderRequestDAO.flush();
		}

		shipmentdetails.setOrderRequest(related_orderrequest);
		related_orderrequest.getShipmentDetailses().add(shipmentdetails);
		shipmentdetails = shipmentDetailsDAO.store(shipmentdetails);
		shipmentDetailsDAO.flush();

		related_orderrequest = orderRequestDAO.store(related_orderrequest);
		orderRequestDAO.flush();

		return shipmentdetails;
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public void deleteShipmentDetails(ShipmentDetails shipmentdetails) {
		shipmentDetailsDAO.remove(shipmentdetails);
		shipmentDetailsDAO.flush();
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public ShipmentDetails deleteShipmentDetailsOrderRequest(Integer shipmentdetails_shipmentId, Integer related_orderrequest_orderRequestId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetails_shipmentId, -1, -1);
		OrderRequest related_orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequest_orderRequestId, -1, -1);

		shipmentdetails.setOrderRequest(null);
		related_orderrequest.getShipmentDetailses().remove(shipmentdetails);
		shipmentdetails = shipmentDetailsDAO.store(shipmentdetails);
		shipmentDetailsDAO.flush();

		related_orderrequest = orderRequestDAO.store(related_orderrequest);
		orderRequestDAO.flush();

		orderRequestDAO.remove(related_orderrequest);
		orderRequestDAO.flush();

		return shipmentdetails;
	}

	/**
	 * Return all ShipmentDetails entity
	 * 
	 */
	@Transactional
	public List<ShipmentDetails> findAllShipmentDetailss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ShipmentDetails>(shipmentDetailsDAO.findAllShipmentDetailss(startResult, maxRows));
	}

	/**
	 * Return a count of all ShipmentDetails entity
	 * 
	 */
	@Transactional
	public Integer countShipmentDetailss() {
		return ((Long) shipmentDetailsDAO.createQuerySingleResult("select count(o) from ShipmentDetails o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public void saveShipmentDetails(ShipmentDetails shipmentdetails) {
		ShipmentDetails existingShipmentDetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetails.getShipmentId());

		if (existingShipmentDetails != null) {
			if (existingShipmentDetails != shipmentdetails) {
				existingShipmentDetails.setShipmentId(shipmentdetails.getShipmentId());
				existingShipmentDetails.setShipmentCarrier(shipmentdetails.getShipmentCarrier());
				existingShipmentDetails.setTrackingNumber(shipmentdetails.getTrackingNumber());
				existingShipmentDetails.setExpectedDelivery(shipmentdetails.getExpectedDelivery());
				existingShipmentDetails.setCreatedOn(shipmentdetails.getCreatedOn());
				existingShipmentDetails.setCreatedBy(shipmentdetails.getCreatedBy());
				existingShipmentDetails.setModifiedOn(shipmentdetails.getModifiedOn());
				existingShipmentDetails.setModifiedBy(shipmentdetails.getModifiedBy());
				existingShipmentDetails.setStatus(shipmentdetails.getStatus());
			}
			shipmentdetails = shipmentDetailsDAO.store(existingShipmentDetails);
		} else {
			shipmentdetails = shipmentDetailsDAO.store(shipmentdetails);
		}
		shipmentDetailsDAO.flush();
	}

	/**
	 */
	@Transactional
	public ShipmentDetails findShipmentDetailsByPrimaryKey(Integer shipmentId) {
		return shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentId);
	}
}
