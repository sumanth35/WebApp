package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderRequestStatusesDAO;
import main.app.dao.OrderedItemsDAO;
import main.app.dao.ShipmentDetailsDAO;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;
import main.app.domain.OrderedItems;
import main.app.domain.ShipmentDetails;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for OrderRequest entities
 * 
 */

@Service("OrderRequestService")
@Transactional
public class OrderRequestServiceImpl implements OrderRequestService {

	/**
	 * DAO injected by Spring that manages OrderRequest entities
	 * 
	 */
	@Autowired
	private OrderRequestDAO orderRequestDAO;

	/**
	 * DAO injected by Spring that manages OrderRequestStatuses entities
	 * 
	 */
	@Autowired
	private OrderRequestStatusesDAO orderRequestStatusesDAO;

	/**
	 * DAO injected by Spring that manages OrderedItems entities
	 * 
	 */
	@Autowired
	private OrderedItemsDAO orderedItemsDAO;

	/**
	 * DAO injected by Spring that manages ShipmentDetails entities
	 * 
	 */
	@Autowired
	private ShipmentDetailsDAO shipmentDetailsDAO;

	/**
	 * Instantiates a new OrderRequestServiceImpl.
	 *
	 */
	public OrderRequestServiceImpl() {
	}

	/**
	 */
	@Transactional
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId) {
		return orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestId);
	}

	/**
	 * Return all OrderRequest entity
	 * 
	 */
	@Transactional
	public List<OrderRequest> findAllOrderRequests(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<OrderRequest>(orderRequestDAO.findAllOrderRequests(startResult, maxRows));
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public void saveOrderRequest(OrderRequest orderrequest) {
		OrderRequest existingOrderRequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest.getOrderRequestId());

		if (existingOrderRequest != null) {
			if (existingOrderRequest != orderrequest) {
				existingOrderRequest.setOrderRequestId(orderrequest.getOrderRequestId());
				existingOrderRequest.setOrderConfirmationNumber(orderrequest.getOrderConfirmationNumber());
				existingOrderRequest.setCreatedOn(orderrequest.getCreatedOn());
				existingOrderRequest.setCreatedBy(orderrequest.getCreatedBy());
				existingOrderRequest.setModifiedOn(orderrequest.getModifiedOn());
				existingOrderRequest.setModifiedBy(orderrequest.getModifiedBy());
				existingOrderRequest.setTotalCost(orderrequest.getTotalCost());
				existingOrderRequest.setTax(orderrequest.getTax());
			}
			orderrequest = orderRequestDAO.store(existingOrderRequest);
		} else {
			orderrequest = orderRequestDAO.store(orderrequest);
		}
		orderRequestDAO.flush();
	}

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public OrderRequest deleteOrderRequestOrderRequestStatuses(Integer orderrequest_orderRequestId, Integer related_orderrequeststatuses_orderRequestStatusId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);
		OrderRequestStatuses related_orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(related_orderrequeststatuses_orderRequestStatusId, -1, -1);

		orderrequest.setOrderRequestStatuses(null);
		related_orderrequeststatuses.getOrderRequests().remove(orderrequest);
		orderrequest = orderRequestDAO.store(orderrequest);
		orderRequestDAO.flush();

		related_orderrequeststatuses = orderRequestStatusesDAO.store(related_orderrequeststatuses);
		orderRequestStatusesDAO.flush();

		orderRequestStatusesDAO.remove(related_orderrequeststatuses);
		orderRequestStatusesDAO.flush();

		return orderrequest;
	}

	/**
	 * Load an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public Set<OrderRequest> loadOrderRequests() {
		return orderRequestDAO.findAllOrderRequests();
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public OrderRequest saveOrderRequestOrderedItemses(Integer orderRequestId, OrderedItems related_ordereditemses) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestId, -1, -1);
		OrderedItems existingorderedItemses = orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses.getOrderItemId());

		// copy into the existing record to preserve existing relationships
		if (existingorderedItemses != null) {
			existingorderedItemses.setOrderItemId(related_ordereditemses.getOrderItemId());
			existingorderedItemses.setItemPrice(related_ordereditemses.getItemPrice());
			existingorderedItemses.setCreatedOn(related_ordereditemses.getCreatedOn());
			existingorderedItemses.setCreatedBy(related_ordereditemses.getCreatedBy());
			existingorderedItemses.setModifiedOn(related_ordereditemses.getModifiedOn());
			existingorderedItemses.setModifiedBy(related_ordereditemses.getModifiedBy());
			related_ordereditemses = existingorderedItemses;
		} else {
			related_ordereditemses = orderedItemsDAO.store(related_ordereditemses);
			orderedItemsDAO.flush();
		}

		related_ordereditemses.setOrderRequest(orderrequest);
		orderrequest.getOrderedItemses().add(related_ordereditemses);
		related_ordereditemses = orderedItemsDAO.store(related_ordereditemses);
		orderedItemsDAO.flush();

		orderrequest = orderRequestDAO.store(orderrequest);
		orderRequestDAO.flush();

		return orderrequest;
	}

	/**
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public OrderRequest saveOrderRequestOrderRequestStatuses(Integer orderRequestId, OrderRequestStatuses related_orderrequeststatuses) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestId, -1, -1);
		OrderRequestStatuses existingorderRequestStatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(related_orderrequeststatuses.getOrderRequestStatusId());

		// copy into the existing record to preserve existing relationships
		if (existingorderRequestStatuses != null) {
			existingorderRequestStatuses.setOrderRequestStatusId(related_orderrequeststatuses.getOrderRequestStatusId());
			existingorderRequestStatuses.setAbbreviation(related_orderrequeststatuses.getAbbreviation());
			existingorderRequestStatuses.setDescription(related_orderrequeststatuses.getDescription());
			existingorderRequestStatuses.setCreatedOn(related_orderrequeststatuses.getCreatedOn());
			existingorderRequestStatuses.setCreatedBy(related_orderrequeststatuses.getCreatedBy());
			existingorderRequestStatuses.setModifiedOn(related_orderrequeststatuses.getModifiedOn());
			existingorderRequestStatuses.setModifiedBy(related_orderrequeststatuses.getModifiedBy());
			related_orderrequeststatuses = existingorderRequestStatuses;
		} else {
			related_orderrequeststatuses = orderRequestStatusesDAO.store(related_orderrequeststatuses);
			orderRequestStatusesDAO.flush();
		}

		orderrequest.setOrderRequestStatuses(related_orderrequeststatuses);
		related_orderrequeststatuses.getOrderRequests().add(orderrequest);
		orderrequest = orderRequestDAO.store(orderrequest);
		orderRequestDAO.flush();

		related_orderrequeststatuses = orderRequestStatusesDAO.store(related_orderrequeststatuses);
		orderRequestStatusesDAO.flush();

		return orderrequest;
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public OrderRequest saveOrderRequestShipmentDetailses(Integer orderRequestId, ShipmentDetails related_shipmentdetailses) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestId, -1, -1);
		ShipmentDetails existingshipmentDetailses = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses.getShipmentId());

		// copy into the existing record to preserve existing relationships
		if (existingshipmentDetailses != null) {
			existingshipmentDetailses.setShipmentId(related_shipmentdetailses.getShipmentId());
			existingshipmentDetailses.setShipmentCarrier(related_shipmentdetailses.getShipmentCarrier());
			existingshipmentDetailses.setTrackingNumber(related_shipmentdetailses.getTrackingNumber());
			existingshipmentDetailses.setExpectedDelivery(related_shipmentdetailses.getExpectedDelivery());
			existingshipmentDetailses.setCreatedOn(related_shipmentdetailses.getCreatedOn());
			existingshipmentDetailses.setCreatedBy(related_shipmentdetailses.getCreatedBy());
			existingshipmentDetailses.setModifiedOn(related_shipmentdetailses.getModifiedOn());
			existingshipmentDetailses.setModifiedBy(related_shipmentdetailses.getModifiedBy());
			existingshipmentDetailses.setStatus(related_shipmentdetailses.getStatus());
			related_shipmentdetailses = existingshipmentDetailses;
		} else {
			related_shipmentdetailses = shipmentDetailsDAO.store(related_shipmentdetailses);
			shipmentDetailsDAO.flush();
		}

		related_shipmentdetailses.setOrderRequest(orderrequest);
		orderrequest.getShipmentDetailses().add(related_shipmentdetailses);
		related_shipmentdetailses = shipmentDetailsDAO.store(related_shipmentdetailses);
		shipmentDetailsDAO.flush();

		orderrequest = orderRequestDAO.store(orderrequest);
		orderRequestDAO.flush();

		return orderrequest;
	}

	/**
	 * Return a count of all OrderRequest entity
	 * 
	 */
	@Transactional
	public Integer countOrderRequests() {
		return ((Long) orderRequestDAO.createQuerySingleResult("select count(o) from OrderRequest o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public void deleteOrderRequest(OrderRequest orderrequest) {
		orderRequestDAO.remove(orderrequest);
		orderRequestDAO.flush();
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@Transactional
	public OrderRequest deleteOrderRequestShipmentDetailses(Integer orderrequest_orderRequestId, Integer related_shipmentdetailses_shipmentId) {
		ShipmentDetails related_shipmentdetailses = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses_shipmentId, -1, -1);

		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		related_shipmentdetailses.setOrderRequest(null);
		orderrequest.getShipmentDetailses().remove(related_shipmentdetailses);

		shipmentDetailsDAO.remove(related_shipmentdetailses);
		shipmentDetailsDAO.flush();

		return orderrequest;
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public OrderRequest deleteOrderRequestOrderedItemses(Integer orderrequest_orderRequestId, Integer related_ordereditemses_orderItemId) {
		OrderedItems related_ordereditemses = orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses_orderItemId, -1, -1);

		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		related_ordereditemses.setOrderRequest(null);
		orderrequest.getOrderedItemses().remove(related_ordereditemses);

		orderedItemsDAO.remove(related_ordereditemses);
		orderedItemsDAO.flush();

		return orderrequest;
	}
}
