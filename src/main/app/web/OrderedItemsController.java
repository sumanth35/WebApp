package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.CartItemsDAO;
import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderedItemsDAO;

import main.app.domain.CartItems;
import main.app.domain.OrderRequest;
import main.app.domain.OrderedItems;

import main.app.service.OrderedItemsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for OrderedItems entities
 * 
 */

@Controller("OrderedItemsController")
public class OrderedItemsController {

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
	 * Service injected by Spring that provides CRUD operations for OrderedItems entities
	 * 
	 */
	@Autowired
	private OrderedItemsService orderedItemsService;

	/**
	 * Show all OrderRequest entities by OrderedItems
	 * 
	 */
	@RequestMapping("/listOrderedItemsOrderRequest")
	public ModelAndView listOrderedItemsOrderRequest(@RequestParam Integer orderItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey));
		mav.setViewName("ordereditems/orderrequest/listOrderRequest.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/saveOrderedItems")
	public String saveOrderedItems(@ModelAttribute OrderedItems ordereditems) {
		orderedItemsService.saveOrderedItems(ordereditems);
		return "forward:/indexOrderedItems";
	}

	/**
	 * Select an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/selectOrderedItems")
	public ModelAndView selectOrderedItems(@RequestParam Integer orderItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey));
		mav.setViewName("ordereditems/viewOrderedItems.jsp");

		return mav;
	}

	/**
	 * Edit an existing CartItems entity
	 * 
	 */
	@RequestMapping("/editOrderedItemsCartItems")
	public ModelAndView editOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer cartitems_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("ordereditems/cartitems/editCartItems.jsp");

		return mav;
	}

	/**
	 * Create a new OrderRequest entity
	 * 
	 */
	@RequestMapping("/newOrderedItemsOrderRequest")
	public ModelAndView newOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("orderrequest", new OrderRequest());
		mav.addObject("newFlag", true);
		mav.setViewName("ordereditems/orderrequest/editOrderRequest.jsp");

		return mav;
	}

	/**
	 * Entry point to show all OrderedItems entities
	 * 
	 */
	public String indexOrderedItems() {
		return "redirect:/indexOrderedItems";
	}

	/**
	 * View an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/selectOrderedItemsOrderRequest")
	public ModelAndView selectOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer orderrequest_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("ordereditems/orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/deleteOrderedItemsOrderRequest")
	public ModelAndView deleteOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer related_orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		OrderedItems ordereditems = orderedItemsService.deleteOrderedItemsOrderRequest(ordereditems_orderItemId, related_orderrequest_orderRequestId);

		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("ordereditems/viewOrderedItems.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/saveOrderedItemsOrderRequest")
	public ModelAndView saveOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId, @ModelAttribute OrderRequest orderrequest) {
		OrderedItems parent_ordereditems = orderedItemsService.saveOrderedItemsOrderRequest(ordereditems_orderItemId, orderrequest);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("ordereditems", parent_ordereditems);
		mav.setViewName("ordereditems/viewOrderedItems.jsp");

		return mav;
	}

	/**
	 * Create a new OrderedItems entity
	 * 
	 */
	@RequestMapping("/newOrderedItems")
	public ModelAndView newOrderedItems() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", new OrderedItems());
		mav.addObject("newFlag", true);
		mav.setViewName("ordereditems/editOrderedItems.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/editOrderedItemsOrderRequest")
	public ModelAndView editOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer orderrequest_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("ordereditems/orderrequest/editOrderRequest.jsp");

		return mav;
	}

	/**
	 * Delete an existing CartItems entity
	 * 
	 */
	@RequestMapping("/deleteOrderedItemsCartItems")
	public ModelAndView deleteOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer related_cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();

		OrderedItems ordereditems = orderedItemsService.deleteOrderedItemsCartItems(ordereditems_orderItemId, related_cartitems_cartItemId);

		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("ordereditems/viewOrderedItems.jsp");

		return mav;
	}

	/**
	 * Save an existing CartItems entity
	 * 
	 */
	@RequestMapping("/saveOrderedItemsCartItems")
	public ModelAndView saveOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId, @ModelAttribute CartItems cartitems) {
		OrderedItems parent_ordereditems = orderedItemsService.saveOrderedItemsCartItems(ordereditems_orderItemId, cartitems);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("ordereditems", parent_ordereditems);
		mav.setViewName("ordereditems/viewOrderedItems.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/ordereditemsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the child OrderRequest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderedItemsOrderRequest")
	public ModelAndView confirmDeleteOrderedItemsOrderRequest(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer related_orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequest_orderRequestId));
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.setViewName("ordereditems/orderrequest/deleteOrderRequest.jsp");

		return mav;
	}

	/**
	 * Create a new CartItems entity
	 * 
	 */
	@RequestMapping("/newOrderedItemsCartItems")
	public ModelAndView newOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("cartitems", new CartItems());
		mav.addObject("newFlag", true);
		mav.setViewName("ordereditems/cartitems/editCartItems.jsp");

		return mav;
	}

	/**
	 * Select the child CartItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderedItemsCartItems")
	public ModelAndView confirmDeleteOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer related_cartitems_cartItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("cartitems", cartItemsDAO.findCartItemsByPrimaryKey(related_cartitems_cartItemId));
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.setViewName("ordereditems/cartitems/deleteCartItems.jsp");

		return mav;
	}

	/**
	 * View an existing CartItems entity
	 * 
	 */
	@RequestMapping("/selectOrderedItemsCartItems")
	public ModelAndView selectOrderedItemsCartItems(@RequestParam Integer ordereditems_orderItemId, @RequestParam Integer cartitems_cartItemId) {
		CartItems cartitems = cartItemsDAO.findCartItemsByPrimaryKey(cartitems_cartItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordereditems_orderItemId", ordereditems_orderItemId);
		mav.addObject("cartitems", cartitems);
		mav.setViewName("ordereditems/cartitems/viewCartItems.jsp");

		return mav;
	}

	/**
	 * Show all OrderedItems entities
	 * 
	 */
	@RequestMapping("/indexOrderedItems")
	public ModelAndView listOrderedItemss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditemss", orderedItemsService.loadOrderedItemss());

		mav.setViewName("ordereditems/listOrderedItemss.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/deleteOrderedItems")
	public String deleteOrderedItems(@RequestParam Integer orderItemIdKey) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey);
		orderedItemsService.deleteOrderedItems(ordereditems);
		return "forward:/indexOrderedItems";
	}

	/**
	 * Select the OrderedItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderedItems")
	public ModelAndView confirmDeleteOrderedItems(@RequestParam Integer orderItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey));
		mav.setViewName("ordereditems/deleteOrderedItems.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/editOrderedItems")
	public ModelAndView editOrderedItems(@RequestParam Integer orderItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey));
		mav.setViewName("ordereditems/editOrderedItems.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Show all CartItems entities by OrderedItems
	 * 
	 */
	@RequestMapping("/listOrderedItemsCartItems")
	public ModelAndView listOrderedItemsCartItems(@RequestParam Integer orderItemIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(orderItemIdKey));
		mav.setViewName("ordereditems/cartitems/listCartItems.jsp");

		return mav;
	}
}