package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.OrderRequestDAO;
import main.app.dao.OrderRequestStatusesDAO;

import main.app.domain.OrderRequest;
import main.app.domain.OrderRequestStatuses;

import main.app.service.OrderRequestStatusesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for OrderRequestStatuses entities
 * 
 */

@Controller("OrderRequestStatusesController")
public class OrderRequestStatusesController {

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
	 * Service injected by Spring that provides CRUD operations for OrderRequestStatuses entities
	 * 
	 */
	@Autowired
	private OrderRequestStatusesService orderRequestStatusesService;

	/**
	 * Create a new OrderRequest entity
	 * 
	 */
	@RequestMapping("/newOrderRequestStatusesOrderRequests")
	public ModelAndView newOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.addObject("orderrequest", new OrderRequest());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequeststatuses/orderrequests/editOrderRequests.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/editOrderRequestStatusesOrderRequests")
	public ModelAndView editOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId, @RequestParam Integer orderrequests_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequests_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("orderrequeststatuses/orderrequests/editOrderRequests.jsp");

		return mav;
	}

	/**
	 * Select an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/selectOrderRequestStatuses")
	public ModelAndView selectOrderRequestStatuses(@RequestParam Integer orderRequestStatusIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusIdKey));
		mav.setViewName("orderrequeststatuses/viewOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all OrderRequestStatuses entities
	 * 
	 */
	public String indexOrderRequestStatuses() {
		return "redirect:/indexOrderRequestStatuses";
	}

	/**
	 */
	@RequestMapping("/orderrequeststatusesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	 * Show all OrderRequest entities by OrderRequestStatuses
	 * 
	 */
	@RequestMapping("/listOrderRequestStatusesOrderRequests")
	public ModelAndView listOrderRequestStatusesOrderRequests(@RequestParam Integer orderRequestStatusIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusIdKey));
		mav.setViewName("orderrequeststatuses/orderrequests/listOrderRequests.jsp");

		return mav;
	}

	/**
	 * Create a new OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/newOrderRequestStatuses")
	public ModelAndView newOrderRequestStatuses() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", new OrderRequestStatuses());
		mav.addObject("newFlag", true);
		mav.setViewName("orderrequeststatuses/editOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/saveOrderRequestStatuses")
	public String saveOrderRequestStatuses(@ModelAttribute OrderRequestStatuses orderrequeststatuses) {
		orderRequestStatusesService.saveOrderRequestStatuses(orderrequeststatuses);
		return "forward:/indexOrderRequestStatuses";
	}

	/**
	 * Delete an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequestStatuses")
	public String deleteOrderRequestStatuses(@RequestParam Integer orderRequestStatusIdKey) {
		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusIdKey);
		orderRequestStatusesService.deleteOrderRequestStatuses(orderrequeststatuses);
		return "forward:/indexOrderRequestStatuses";
	}

	/**
	 * Select the OrderRequestStatuses entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequestStatuses")
	public ModelAndView confirmDeleteOrderRequestStatuses(@RequestParam Integer orderRequestStatusIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusIdKey));
		mav.setViewName("orderrequeststatuses/deleteOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/deleteOrderRequestStatusesOrderRequests")
	public ModelAndView deleteOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId, @RequestParam Integer related_orderrequests_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		OrderRequestStatuses orderrequeststatuses = orderRequestStatusesService.deleteOrderRequestStatusesOrderRequests(orderrequeststatuses_orderRequestStatusId, related_orderrequests_orderRequestId);

		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.addObject("orderrequeststatuses", orderrequeststatuses);
		mav.setViewName("orderrequeststatuses/viewOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Select the child OrderRequest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderRequestStatusesOrderRequests")
	public ModelAndView confirmDeleteOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId, @RequestParam Integer related_orderrequests_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequests_orderRequestId));
		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.setViewName("orderrequeststatuses/orderrequests/deleteOrderRequests.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/saveOrderRequestStatusesOrderRequests")
	public ModelAndView saveOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId, @ModelAttribute OrderRequest orderrequests) {
		OrderRequestStatuses parent_orderrequeststatuses = orderRequestStatusesService.saveOrderRequestStatusesOrderRequests(orderrequeststatuses_orderRequestStatusId, orderrequests);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.addObject("orderrequeststatuses", parent_orderrequeststatuses);
		mav.setViewName("orderrequeststatuses/viewOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * Show all OrderRequestStatuses entities
	 * 
	 */
	@RequestMapping("/indexOrderRequestStatuses")
	public ModelAndView listOrderRequestStatusess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatusess", orderRequestStatusesService.loadOrderRequestStatusess());

		mav.setViewName("orderrequeststatuses/listOrderRequestStatusess.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderRequestStatuses entity
	 * 
	 */
	@RequestMapping("/editOrderRequestStatuses")
	public ModelAndView editOrderRequestStatuses(@RequestParam Integer orderRequestStatusIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequeststatuses", orderRequestStatusesDAO.findOrderRequestStatusesByPrimaryKey(orderRequestStatusIdKey));
		mav.setViewName("orderrequeststatuses/editOrderRequestStatuses.jsp");

		return mav;
	}

	/**
	 * View an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/selectOrderRequestStatusesOrderRequests")
	public ModelAndView selectOrderRequestStatusesOrderRequests(@RequestParam Integer orderrequeststatuses_orderRequestStatusId, @RequestParam Integer orderrequests_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequests_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderrequeststatuses_orderRequestStatusId", orderrequeststatuses_orderRequestStatusId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("orderrequeststatuses/orderrequests/viewOrderRequests.jsp");

		return mav;
	}
}