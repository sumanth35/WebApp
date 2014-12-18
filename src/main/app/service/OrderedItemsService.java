package main.app.service;

import java.util.List;
import java.util.Set;

import main.app.domain.CartItems;
import main.app.domain.OrderRequest;
import main.app.domain.OrderedItems;

/**
 * Spring service that handles CRUD requests for OrderedItems entities
 * 
 */
public interface OrderedItemsService {

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	public OrderedItems saveOrderedItemsOrderRequest(Integer orderItemId, OrderRequest related_orderrequest);

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	public OrderedItems saveOrderedItemsCartItems(Integer orderItemId_1, CartItems related_cartitems);

	/**
	 * Load an existing OrderedItems entity
	 * 
	 */
	public Set<OrderedItems> loadOrderedItemss();

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	public OrderedItems deleteOrderedItemsOrderRequest(Integer ordereditems_orderItemId, Integer related_orderrequest_orderRequestId);

	/**
	 */
	public OrderedItems findOrderedItemsByPrimaryKey(Integer orderItemId_2);

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	public void saveOrderedItems(OrderedItems ordereditems);

	/**
	 * Return all OrderedItems entity
	 * 
	 */
	public List<OrderedItems> findAllOrderedItemss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	public void deleteOrderedItems(OrderedItems ordereditems_1);

	/**
	 * Return a count of all OrderedItems entity
	 * 
	 */
	public Integer countOrderedItemss();

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	public OrderedItems deleteOrderedItemsCartItems(Integer ordereditems_orderItemId_1, Integer related_cartitems_cartItemId);
}