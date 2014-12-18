package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;

/**
 * Spring service that handles CRUD requests for OrderRequestStatuses entities
 * 
 */
public interface OrderRequestStatusesService {

	/**
	 * Return all OrderRequestStatuses entity
	 * 
	 */
	public List<OrderRequestStatuses> findAllOrderRequestStatusess(Integer startResult, Integer maxRows);

	/**
	 * Load an existing OrderRequestStatuses entity
	 * 
	 */
	public Set<OrderRequestStatuses> loadOrderRequestStatusess();

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	public void deleteOrderRequestStatuses(OrderRequestStatuses orderrequeststatuses);

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	public OrderRequestStatuses deleteOrderRequestStatusesOrderRequests(Integer orderrequeststatuses_orderRequestStatusId, Integer related_orderrequests_orderRequestId);

	/**
	 * Return a count of all OrderRequestStatuses entity
	 * 
	 */
	public Integer countOrderRequestStatusess();

	/**
	 */
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId);

	/**
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	public void saveOrderRequestStatuses(OrderRequestStatuses orderrequeststatuses_1);

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	public OrderRequestStatuses saveOrderRequestStatusesOrderRequests(Integer orderRequestStatusId_1, OrderRequest related_orderrequests);
}