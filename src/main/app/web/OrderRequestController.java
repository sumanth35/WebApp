package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderRequestStatusesDAO;
import main.app.dao.OrderedItemsDAO;
import main.app.dao.ShipmentDetailsDAO;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;
import main.app.domain.OrderedItems;
import main.app.domain.ShipmentDetails;

import main.app.service.OrderRequestService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for OrderRequest entities
 * 
 */

@Controller("OrderRequestController")
public class OrderRequestController {

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
	 * Service injected by Spring that provides CRUD operations for OrderRequest entities
	 * 
	 */
	@Autowired
	private OrderRequestService orderRequestService;

	/**
	 * Select an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/selectOrderRequest")
	public ModelAndView selectOrderRequest(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequestOrderedItemses")
	public ModelAndView deleteOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_ordereditemses_orderItemId) {
		ModelAndView mav = new ModelAndView();

		OrderRequest orderrequest = orderRequestService.deleteOrderRequestOrderedItemses(orderrequest_orderRequestId, related_ordereditemses_orderItemId);

		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * View an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/selectOrderRequestOrderRequestStatuses")
	public ModelAndView selectOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer orderrequeststatuses_orderRequestStatusId) {
		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderrequeststatuses_orderRequestStatusId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequeststatuses", orderrequeststatuses);
		mav.setViewName("orderrequest/orderrequeststatuses/viewOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Show all OrderRequestStatuses entities by OrderRequest
	 * 
	 */
	@RequestMapping("/listOrderRequestOrderRequestStatuses")
	public ModelAndView listOrderRequestOrderRequestStatuses(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/orderrequeststatuses/listOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Edit an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/editOrderRequestShipmentDetailses")
	public ModelAndView editOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer shipmentdetailses_shipmentId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetailses_shipmentId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("orderrequest/shipmentdetailses/editShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Show all ShipmentDetails entities by OrderRequest
	 * 
	 */
	@RequestMapping("/listOrderRequestShipmentDetailses")
	public ModelAndView listOrderRequestShipmentDetailses(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/shipmentdetailses/listShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/saveOrderRequest")
	public String saveOrderRequest(@ModelAttribute OrderRequest orderrequest) {
		orderRequestService.saveOrderRequest(orderrequest);
		return "forward:/indexOrderRequest";
	}

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequestOrderRequestStatuses")
	public ModelAndView deleteOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_orderrequeststatuses_orderRequestStatusId) {
		ModelAndView mav = new ModelAndView();

		OrderRequest orderrequest = orderRequestService.deleteOrderRequestOrderRequestStatuses(orderrequest_orderRequestId, related_orderrequeststatuses_orderRequestStatusId);

		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Select the child OrderedItems entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequestOrderedItemses")
	public ModelAndView confirmDeleteOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_ordereditemses_orderItemId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordereditems", orderedItemsDAO.findOrderedItemsByPrimaryKey(related_ordereditemses_orderItemId));
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.setViewName("orderrequest/ordereditemses/deleteOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Create a new ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/newOrderRequestShipmentDetailses")
	public ModelAndView newOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("shipmentdetails", new ShipmentDetails());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequest/shipmentdetailses/editShipmentDetailses.jsp");

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
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/saveOrderRequestOrderRequestStatuses")
	public ModelAndView saveOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId, @ModelAttribute OrderRequestStatuses orderrequeststatuses) {
		OrderRequest parent_orderrequest = orderRequestService.saveOrderRequestOrderRequestStatuses(orderrequest_orderRequestId, orderrequeststatuses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", parent_orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/saveOrderRequestOrderedItemses")
	public ModelAndView saveOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId, @ModelAttribute OrderedItems ordereditemses) {
		OrderRequest parent_orderrequest = orderRequestService.saveOrderRequestOrderedItemses(orderrequest_orderRequestId, ordereditemses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", parent_orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/editOrderRequestOrderedItemses")
	public ModelAndView editOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer ordereditemses_orderItemId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditemses_orderItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("orderrequest/ordereditemses/editOrderedItemses.jsp");

		return mav;
	}

	/**
	 * View an existing OrderedItems entity
	 * 
	 */
	@RequestMapping("/selectOrderRequestOrderedItemses")
	public ModelAndView selectOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer ordereditemses_orderItemId) {
		OrderedItems ordereditems = orderedItemsDAO.findOrderedItemsByPrimaryKey(ordereditemses_orderItemId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("ordereditems", ordereditems);
		mav.setViewName("orderrequest/ordereditemses/viewOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Create a new OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/newOrderRequestOrderRequestStatuses")
	public ModelAndView newOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequeststatuses", new OrderRequestStatuses());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequest/orderrequeststatuses/editOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all OrderRequest entities
	 * 
	 */
	public String indexOrderRequest() {
		return "redirect:/indexOrderRequest";
	}

	/**
	 * Edit an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/editOrderRequest")
	public ModelAndView editOrderRequest(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/editOrderRequest.jsp");

		return mav;
	}

	/**
	 * Select the child OrderRequestStatuses entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequestOrderRequestStatuses")
	public ModelAndView confirmDeleteOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_orderrequeststatuses_orderRequestStatusId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(related_orderrequeststatuses_orderRequestStatusId));
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.setViewName("orderrequest/orderrequeststatuses/deleteOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Create a new OrderRequest entity
	 * 
	 */
	@RequestMapping("/newOrderRequest")
	public ModelAndView newOrderRequest() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", new OrderRequest());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequest/editOrderRequest.jsp");

		return mav;
	}

	/**
	 * Select the OrderRequest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequest")
	public ModelAndView confirmDeleteOrderRequest(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/deleteOrderRequest.jsp");

		return mav;
	}

	/**
	 * Show all OrderedItems entities by OrderRequest
	 * 
	 */
	@RequestMapping("/listOrderRequestOrderedItemses")
	public ModelAndView listOrderRequestOrderedItemses(@RequestParam Integer orderRequestIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey));
		mav.setViewName("orderrequest/ordereditemses/listOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Show all OrderRequest entities
	 * 
	 */
	@RequestMapping("/indexOrderRequest")
	public ModelAndView listOrderRequests() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequests", orderRequestService.loadOrderRequests());

		mav.setViewName("orderrequest/listOrderRequests.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orderrequestController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/selectOrderRequestShipmentDetailses")
	public ModelAndView selectOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer shipmentdetailses_shipmentId) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentdetailses_shipmentId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("orderrequest/shipmentdetailses/viewShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/saveOrderRequestShipmentDetailses")
	public ModelAndView saveOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId, @ModelAttribute ShipmentDetails shipmentdetailses) {
		OrderRequest parent_orderrequest = orderRequestService.saveOrderRequestShipmentDetailses(orderrequest_orderRequestId, shipmentdetailses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", parent_orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/editOrderRequestOrderRequestStatuses")
	public ModelAndView editOrderRequestOrderRequestStatuses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer orderrequeststatuses_orderRequestStatusId) {
		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderrequeststatuses_orderRequestStatusId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequeststatuses", orderrequeststatuses);
		mav.setViewName("orderrequest/orderrequeststatuses/editOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Select the child ShipmentDetails entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequestShipmentDetailses")
	public ModelAndView confirmDeleteOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_shipmentdetailses_shipmentId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(related_shipmentdetailses_shipmentId));
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.setViewName("orderrequest/shipmentdetailses/deleteShipmentDetailses.jsp");

		return mav;
	}

	/**
	 * Create a new OrderedItems entity
	 * 
	 */
	@RequestMapping("/newOrderRequestOrderedItemses")
	public ModelAndView newOrderRequestOrderedItemses(@RequestParam Integer orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("ordereditems", new OrderedItems());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequest/ordereditemses/editOrderedItemses.jsp");

		return mav;
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequestShipmentDetailses")
	public ModelAndView deleteOrderRequestShipmentDetailses(@RequestParam Integer orderrequest_orderRequestId, @RequestParam Integer related_shipmentdetailses_shipmentId) {
		ModelAndView mav = new ModelAndView();

		OrderRequest orderrequest = orderRequestService.deleteOrderRequestShipmentDetailses(orderrequest_orderRequestId, related_shipmentdetailses_shipmentId);

		mav.addObject("orderrequest_orderRequestId", orderrequest_orderRequestId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequest")
	public String deleteOrderRequest(@RequestParam Integer orderRequestIdKey) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderRequestIdKey);
		orderRequestService.deleteOrderRequest(orderrequest);
		return "forward:/indexOrderRequest";
	}
}