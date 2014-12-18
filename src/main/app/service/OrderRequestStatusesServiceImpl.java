package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderRequestStatusesDAO;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for OrderRequestStatuses entities
 * 
 */

@Service("OrderRequestStatusesService")
@Transactional
public class OrderRequestStatusesServiceImpl implements
		OrderRequestStatusesService {

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
	 * Instantiates a new OrderRequestStatusesServiceImpl.
	 *
	 */
	public OrderRequestStatusesServiceImpl() {
	}

	/**
	 * Return all OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public List<OrderRequestStatuses> findAllOrderRequestStatusess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<OrderRequestStatuses>(orderRequestStatusesDAO.findAllOrderRequestStatusess(startResult, maxRows));
	}

	/**
	 * Load an existing OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public Set<OrderRequestStatuses> loadOrderRequestStatusess() {
		return orderRequestStatusesDAO.findAllOrderRequestStatusess();
	}

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public void deleteOrderRequestStatuses(OrderRequestStatuses orderrequeststatuses) {
		orderRequestStatusesDAO.remove(orderrequeststatuses);
		orderRequestStatusesDAO.flush();
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public OrderRequestStatuses deleteOrderRequestStatusesOrderRequests(Integer orderrequeststatuses_orderRequestStatusId, Integer related_orderrequests_orderRequestId) {
		OrderRequest related_orderrequests = orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequests_orderRequestId, -1, -1);

		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderrequeststatuses_orderRequestStatusId, -1, -1);

		related_orderrequests.setOrderRequestStatuses(null);
		orderrequeststatuses.getOrderRequests().remove(related_orderrequests);

		orderRequestDAO.remove(related_orderrequests);
		orderRequestDAO.flush();

		return orderrequeststatuses;
	}

	/**
	 * Return a count of all OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public Integer countOrderRequestStatusess() {
		return ((Long) orderRequestStatusesDAO.createQuerySingleResult("select count(o) from OrderRequestStatuses o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public OrderRequestStatuses findOrderRequestStatusesByPrimaryKey(Integer orderRequestStatusId) {
		return orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusId);
	}

	/**
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@Transactional
	public void saveOrderRequestStatuses(OrderRequestStatuses orderrequeststatuses) {
		OrderRequestStatuses existingOrderRequestStatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderrequeststatuses.getOrderRequestStatusId());

		if (existingOrderRequestStatuses != null) {
			if (existingOrderRequestStatuses != orderrequeststatuses) {
				existingOrderRequestStatuses.setOrderRequestStatusId(orderrequeststatuses.getOrderRequestStatusId());
				existingOrderRequestStatuses.setAbbreviation(orderrequeststatuses.getAbbreviation());
				existingOrderRequestStatuses.setDescription(orderrequeststatuses.getDescription());
				existingOrderRequestStatuses.setCreatedOn(orderrequeststatuses.getCreatedOn());
				existingOrderRequestStatuses.setCreatedBy(orderrequeststatuses.getCreatedBy());
				existingOrderRequestStatuses.setModifiedOn(orderrequeststatuses.getModifiedOn());
				existingOrderRequestStatuses.setModifiedBy(orderrequeststatuses.getModifiedBy());
			}
			orderrequeststatuses = orderRequestStatusesDAO.store(existingOrderRequestStatuses);
		} else {
			orderrequeststatuses = orderRequestStatusesDAO.store(orderrequeststatuses);
		}
		orderRequestStatusesDAO.flush();
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public OrderRequestStatuses saveOrderRequestStatusesOrderRequests(Integer orderRequestStatusId, OrderRequest related_orderrequests) {
		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusId, -1, -1);
		OrderRequest existingorderRequests = orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequests.getOrderRequestId());

		// copy into the existing record to preserve existing relationships
		if (existingorderRequests != null) {
			existingorderRequests.setOrderRequestId(related_orderrequests.getOrderRequestId());
			existingorderRequests.setOrderConfirmationNumber(related_orderrequests.getOrderConfirmationNumber());
			existingorderRequests.setCreatedOn(related_orderrequests.getCreatedOn());
			existingorderRequests.setCreatedBy(related_orderrequests.getCreatedBy());
			existingorderRequests.setModifiedOn(related_orderrequests.getModifiedOn());
			existingorderRequests.setModifiedBy(related_orderrequests.getModifiedBy());
			existingorderRequests.setTotalCost(related_orderrequests.getTotalCost());
			existingorderRequests.setTax(related_orderrequests.getTax());
			related_orderrequests = existingorderRequests;
		} else {
			related_orderrequests = orderRequestDAO.store(related_orderrequests);
			orderRequestDAO.flush();
		}

		related_orderrequests.setOrderRequestStatuses(orderrequeststatuses);
		orderrequeststatuses.getOrderRequests().add(related_orderrequests);
		related_orderrequests = orderRequestDAO.store(related_orderrequests);
		orderRequestDAO.flush();

		orderrequeststatuses = orderRequestStatusesDAO.store(orderrequeststatuses);
		orderRequestStatusesDAO.flush();

		return orderrequeststatuses;
	}
}
