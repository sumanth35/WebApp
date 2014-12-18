package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.dao.CartItemsDAO;
import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderedItemsDAO;

import main.app.domain.CartItems;
import main.app.domain.OrderRequest;
import main.app.domain.OrderedItems;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for OrderedItems entities
 * 
 */

@Service("OrderedItemsService")
@Transactional
public class OrderedItemsServiceImpl implements OrderedItemsService {

	/**
	 * DAO injected by Spring that manages CartItems entities
	 * 
	 */
	@Autowired
	private CartItemsDAO cartItemsDAO;

	/**
	 * DAO injected by Spring that manages OrderRequest entities
	 * 
	 */
	@Autowired
	private OrderRequestDAO orderRequestDAO;

	/**
	 * DAO injected by Spring that manages OrderedItems entities
	 * 
	 */
	@Autowired
	private OrderedItemsDAO orderedItemsDAO;

	/**
	 * Instantiates a new OrderedItemsServiceImpl.
	 *
	 */
	public OrderedItemsServiceImpl() {
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public OrderedItems saveOrderedItemsOrderRequest(Integer orderItemId, OrderRequest related_orderrequest) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemId, -1, -1);
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

		ordereditems.setOrderRequest(related_orderrequest);
		related_orderrequest.getOrderedItemses().add(ordereditems);
		ordereditems = orderedItemsDAO.store(ordereditems);
		orderedItemsDAO.flush();

		related_orderrequest = orderRequestDAO.store(related_orderrequest);
		orderRequestDAO.flush();

		return ordereditems;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@Transactional
	public OrderedItems saveOrderedItemsCartItems(Integer orderItemId, CartItems related_cartitems) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemId, -1, -1);
		CartItems existingcartItems = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitems.getCartItemId());

		// copy into the existing record to preserve existing relationships
		if (existingcartItems != null) {
			existingcartItems.setCartItemId(related_cartitems.getCartItemId());
			existingcartItems.setProductTitle(related_cartitems.getProductTitle());
			existingcartItems.setProductCost(related_cartitems.getProductCost());
			existingcartItems.setProductQuantity(related_cartitems.getProductQuantity());
			existingcartItems.setStatus(related_cartitems.getStatus());
			existingcartItems.setCreatedOn(related_cartitems.getCreatedOn());
			existingcartItems.setCreatedBy(related_cartitems.getCreatedBy());
			existingcartItems.setModifiedOn(related_cartitems.getModifiedOn());
			existingcartItems.setModifiedBy(related_cartitems.getModifiedBy());
			related_cartitems = existingcartItems;
		} else {
			related_cartitems = cartItemsDAO.store(related_cartitems);
			cartItemsDAO.flush();
		}

		ordereditems.setCartItems(related_cartitems);
		related_cartitems.getOrderedItemses().add(ordereditems);
		ordereditems = orderedItemsDAO.store(ordereditems);
		orderedItemsDAO.flush();

		related_cartitems = cartItemsDAO.store(related_cartitems);
		cartItemsDAO.flush();

		return ordereditems;
	}

	/**
	 * Load an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public Set<OrderedItems> loadOrderedItemss() {
		return orderedItemsDAO.findAllOrderedItemss();
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@Transactional
	public OrderedItems deleteOrderedItemsOrderRequest(Integer ordereditems_orderItemId, Integer related_orderrequest_orderRequestId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditems_orderItemId, -1, -1);
		OrderRequest related_orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequest_orderRequestId, -1, -1);

		ordereditems.setOrderRequest(null);
		related_orderrequest.getOrderedItemses().remove(ordereditems);
		ordereditems = orderedItemsDAO.store(ordereditems);
		orderedItemsDAO.flush();

		related_orderrequest = orderRequestDAO.store(related_orderrequest);
		orderRequestDAO.flush();

		orderRequestDAO.remove(related_orderrequest);
		orderRequestDAO.flush();

		return ordereditems;
	}

	/**
	 */
	@Transactional
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId) {
		return orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemId);
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public void saveOrderedItems(OrderedItems ordereditems) {
		OrderedItems existingOrderedItems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditems.getOrderItemId());

		if (existingOrderedItems != null) {
			if (existingOrderedItems != ordereditems) {
				existingOrderedItems.setOrderItemId(ordereditems.getOrderItemId());
				existingOrderedItems.setItemPrice(ordereditems.getItemPrice());
				existingOrderedItems.setCreatedOn(ordereditems.getCreatedOn());
				existingOrderedItems.setCreatedBy(ordereditems.getCreatedBy());
				existingOrderedItems.setModifiedOn(ordereditems.getModifiedOn());
				existingOrderedItems.setModifiedBy(ordereditems.getModifiedBy());
			}
			ordereditems = orderedItemsDAO.store(existingOrderedItems);
		} else {
			ordereditems = orderedItemsDAO.store(ordereditems);
		}
		orderedItemsDAO.flush();
	}

	/**
	 * Return all OrderedItems entity
	 * 
	 */
	@Transactional
	public List<OrderedItems> findAllOrderedItemss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<OrderedItems>(orderedItemsDAO.findAllOrderedItemss(startResult, maxRows));
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@Transactional
	public void deleteOrderedItems(OrderedItems ordereditems) {
		orderedItemsDAO.remove(ordereditems);
		orderedItemsDAO.flush();
	}

	/**
	 * Return a count of all OrderedItems entity
	 * 
	 */
	@Transactional
	public Integer countOrderedItemss() {
		return ((Long) orderedItemsDAO.createQuerySingleResult("select count(o) from OrderedItems o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@Transactional
	public OrderedItems deleteOrderedItemsCartItems(Integer ordereditems_orderItemId, Integer related_cartitems_cartItemId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditems_orderItemId, -1, -1);
		CartItems related_cartitems = cartItemsDAO.findCartItemsByPrimaryKey(related_cartitems_cartItemId, -1, -1);

		ordereditems.setCartItems(null);
		related_cartitems.getOrderedItemses().remove(ordereditems);
		ordereditems = orderedItemsDAO.store(ordereditems);
		orderedItemsDAO.flush();

		related_cartitems = cartItemsDAO.store(related_cartitems);
		cartItemsDAO.flush();

		cartItemsDAO.remove(related_cartitems);
		cartItemsDAO.flush();

		return ordereditems;
	}
}
