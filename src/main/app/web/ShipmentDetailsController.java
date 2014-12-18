package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.OrderRequestDAO;
import main.app.dao.RecipientLocationDAO;
import main.app.dao.ShipmentDetailsDAO;

import main.app.domain.OrderRequest;
import main.app.domain.RecipientLocation;
import main.app.domain.ShipmentDetails;

import main.app.service.ShipmentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for ShipmentDetails entities
 * 
 */

@Controller("ShipmentDetailsController")
public class ShipmentDetailsController {

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
	 * Service injected by Spring that provides CRUD operations for ShipmentDetails entities
	 * 
	 */
	@Autowired
	private ShipmentDetailsService shipmentDetailsService;

	/**
	 * Show all ShipmentDetails entities
	 * 
	 */
	@RequestMapping("/indexShipmentDetails")
	public ModelAndView listShipmentDetailss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetailss", shipmentDetailsService.loadShipmentDetailss());

		mav.setViewName("shipmentdetails/listShipmentDetailss.jsp");

		return mav;
	}

	/**
	 * Delete an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/deleteShipmentDetails")
	public String deleteShipmentDetails(@RequestParam Integer shipmentIdKey) {
		ShipmentDetails shipmentdetails = shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey);
		shipmentDetailsService.deleteShipmentDetails(shipmentdetails);
		return "forward:/indexShipmentDetails";
	}

	/**
	 * Select an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/selectShipmentDetails")
	public ModelAndView selectShipmentDetails(@RequestParam Integer shipmentIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey));
		mav.setViewName("shipmentdetails/viewShipmentDetails.jsp");

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
	 * Show all RecipientLocation entities by ShipmentDetails
	 * 
	 */
	@RequestMapping("/listShipmentDetailsRecipientLocation")
	public ModelAndView listShipmentDetailsRecipientLocation(@RequestParam Integer shipmentIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey));
		mav.setViewName("shipmentdetails/recipientlocation/listRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Edit an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/editShipmentDetailsRecipientLocation")
	public ModelAndView editShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer recipientlocation_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("shipmentdetails/recipientlocation/editRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Save an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/saveShipmentDetailsRecipientLocation")
	public ModelAndView saveShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId, @ModelAttribute RecipientLocation recipientlocation) {
		ShipmentDetails parent_shipmentdetails = shipmentDetailsService.saveShipmentDetailsRecipientLocation(shipmentdetails_shipmentId, recipientlocation);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("shipmentdetails", parent_shipmentdetails);
		mav.setViewName("shipmentdetails/viewShipmentDetails.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/deleteShipmentDetailsOrderRequest")
	public ModelAndView deleteShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer related_orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		ShipmentDetails shipmentdetails = shipmentDetailsService.deleteShipmentDetailsOrderRequest(shipmentdetails_shipmentId, related_orderrequest_orderRequestId);

		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("shipmentdetails/viewShipmentDetails.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/saveShipmentDetailsOrderRequest")
	public ModelAndView saveShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId, @ModelAttribute OrderRequest orderrequest) {
		ShipmentDetails parent_shipmentdetails = shipmentDetailsService.saveShipmentDetailsOrderRequest(shipmentdetails_shipmentId, orderrequest);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("shipmentdetails", parent_shipmentdetails);
		mav.setViewName("shipmentdetails/viewShipmentDetails.jsp");

		return mav;
	}

	/**
	 * Create a new ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/newShipmentDetails")
	public ModelAndView newShipmentDetails() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", new ShipmentDetails());
		mav.addObject("newFlag", true);
		mav.setViewName("shipmentdetails/editShipmentDetails.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/shipmentdetailsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the ShipmentDetails entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteShipmentDetails")
	public ModelAndView confirmDeleteShipmentDetails(@RequestParam Integer shipmentIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey));
		mav.setViewName("shipmentdetails/deleteShipmentDetails.jsp");

		return mav;
	}

	/**
	 * Show all OrderRequest entities by ShipmentDetails
	 * 
	 */
	@RequestMapping("/listShipmentDetailsOrderRequest")
	public ModelAndView listShipmentDetailsOrderRequest(@RequestParam Integer shipmentIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey));
		mav.setViewName("shipmentdetails/orderrequest/listOrderRequest.jsp");

		return mav;
	}

	/**
	 * Delete an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/deleteShipmentDetailsRecipientLocation")
	public ModelAndView deleteShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer related_recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		ShipmentDetails shipmentdetails = shipmentDetailsService.deleteShipmentDetailsRecipientLocation(shipmentdetails_shipmentId, related_recipientlocation_recipientLocationId);

		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("shipmentdetails", shipmentdetails);
		mav.setViewName("shipmentdetails/viewShipmentDetails.jsp");

		return mav;
	}

	/**
	 * View an existing RecipientLocation entity
	 * 
	 */
	@RequestMapping("/selectShipmentDetailsRecipientLocation")
	public ModelAndView selectShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer recipientlocation_recipientLocationId) {
		RecipientLocation recipientlocation = recipientLocationDAO.findRecipientLocationByPrimaryKey(recipientlocation_recipientLocationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("recipientlocation", recipientlocation);
		mav.setViewName("shipmentdetails/recipientlocation/viewRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ShipmentDetails entities
	 * 
	 */
	public String indexShipmentDetails() {
		return "redirect:/indexShipmentDetails";
	}

	/**
	 * View an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/selectShipmentDetailsOrderRequest")
	public ModelAndView selectShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer orderrequest_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("shipmentdetails/orderrequest/viewOrderRequest.jsp");

		return mav;
	}

	/**
	 * Edit an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/editShipmentDetails")
	public ModelAndView editShipmentDetails(@RequestParam Integer shipmentIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("shipmentdetails", shipmentDetailsDAO.findShipmentDetailsByPrimaryKey(shipmentIdKey));
		mav.setViewName("shipmentdetails/editShipmentDetails.jsp");

		return mav;
	}

	/**
	 * Save an existing ShipmentDetails entity
	 * 
	 */
	@RequestMapping("/saveShipmentDetails")
	public String saveShipmentDetails(@ModelAttribute ShipmentDetails shipmentdetails) {
		shipmentDetailsService.saveShipmentDetails(shipmentdetails);
		return "forward:/indexShipmentDetails";
	}

	/**
	 * Create a new OrderRequest entity
	 * 
	 */
	@RequestMapping("/newShipmentDetailsOrderRequest")
	public ModelAndView newShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("orderrequest", new OrderRequest());
		mav.addObject("newFlag", true);
		mav.setViewName("shipmentdetails/orderrequest/editOrderRequest.jsp");

		return mav;
	}

	/**
	 * Create a new RecipientLocation entity
	 * 
	 */
	@RequestMapping("/newShipmentDetailsRecipientLocation")
	public ModelAndView newShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("recipientlocation", new RecipientLocation());
		mav.addObject("newFlag", true);
		mav.setViewName("shipmentdetails/recipientlocation/editRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Select the child RecipientLocation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteShipmentDetailsRecipientLocation")
	public ModelAndView confirmDeleteShipmentDetailsRecipientLocation(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer related_recipientlocation_recipientLocationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("recipientlocation", recipientLocationDAO.findRecipientLocationByPrimaryKey(related_recipientlocation_recipientLocationId));
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.setViewName("shipmentdetails/recipientlocation/deleteRecipientLocation.jsp");

		return mav;
	}

	/**
	 * Select the child OrderRequest entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteShipmentDetailsOrderRequest")
	public ModelAndView confirmDeleteShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer related_orderrequest_orderRequestId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderrequest", orderRequestDAO.findOrderRequestByPrimaryKey(related_orderrequest_orderRequestId));
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.setViewName("shipmentdetails/orderrequest/deleteOrderRequest.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderRequest entity
	 * 
	 */
	@RequestMapping("/editShipmentDetailsOrderRequest")
	public ModelAndView editShipmentDetailsOrderRequest(@RequestParam Integer shipmentdetails_shipmentId, @RequestParam Integer orderrequest_orderRequestId) {
		OrderRequest orderrequest = orderRequestDAO.findOrderRequestByPrimaryKey(orderrequest_orderRequestId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("shipmentdetails_shipmentId", shipmentdetails_shipmentId);
		mav.addObject("orderrequest", orderrequest);
		mav.setViewName("shipmentdetails/orderrequest/editOrderRequest.jsp");

		return mav;
	}
}