package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;
import main.app.domain.OrderedItems;
import main.app.domain.ShipmentDetails;

/**
 * Spring service that handles CRUD requests for OrderRequest entities
 * 
 */
public interface OrderRequestService {

	/**
	 */
	public OrderRequest findOrderRequestByPrimaryKey(Integer orderRequestId);

	/**
	 * Return all OrderRequest entity
	 * 
	 */
	public List<OrderRequest> findAllOrderRequests(Integer startResult, Integer maxRows);

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	public void saveOrderRequest(OrderRequest orderrequest);

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	public OrderRequest deleteOrderRequestOrderRequestStatuses(Integer orderrequest_orderRequestId, Integer related_orderrequeststatuses_orderRequestStatusId);

	/**
	 * Load an existing OrderRequest entity
	 * 
	 */
	public Set<OrderRequest> loadOrderRequests();

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	public OrderRequest saveOrderRequestOrderedItemses(Integer orderRequestId_1, OrderedItems related_ordereditemses);

	/**
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	public OrderRequest saveOrderRequestOrderRequestStatuses(Integer orderRequestId_2, OrderRequestStatuses related_orderrequeststatuses);

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	public OrderRequest saveOrderRequestShipmentDetailses(Integer orderRequestId_3, ShipmentDetails related_shipmentdetailses);

	/**
	 * Return a count of all OrderRequest entity
	 * 
	 */
	public Integer countOrderRequests();

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	public void deleteOrderRequest(OrderRequest orderrequest_1);

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	public OrderRequest deleteOrderRequestShipmentDetailses(Integer orderrequest_orderRequestId_1, Integer related_shipmentdetailses_shipmentId);

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	public OrderRequest deleteOrderRequestOrderedItemses(Integer orderrequest_orderRequestId_2, Integer related_ordereditemses_orderItemId);
}