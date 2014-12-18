package main.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.app.dao.VendorLocationAssociationsDAO;
import main.app.dao.VendorProfileDAO;

import main.app.domain.VendorLocationAssociations;
import main.app.domain.VendorProfile;

import main.app.service.VendorLocationAssociationsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for VendorLocationAssociations entities
 * 
 */

@Controller("VendorLocationAssociationsController")
public class VendorLocationAssociationsController {

	/**
	 * DAO injected by Spring that manages VendorLocationAssociations entities
	 * 
	 */
	@Autowired
	private VendorLocationAssociationsDAO vendorLocationAssociationsDAO;

	/**
	 * DAO injected by Spring that manages VendorProfile entities
	 * 
	 */
	@Autowired
	private VendorProfileDAO vendorProfileDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for VendorLocationAssociations entities
	 * 
	 */
	@Autowired
	private VendorLocationAssociationsService vendorLocationAssociationsService;

	/**
	 * Show all VendorLocationAssociations entities
	 * 
	 */
	@RequestMapping("/indexVendorLocationAssociations")
	public ModelAndView listVendorLocationAssociationss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociationss", vendorLocationAssociationsService.loadVendorLocationAssociationss());

		mav.setViewName("vendorlocationassociations/listVendorLocationAssociationss.jsp");

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
	 * Select an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationAssociations")
	public ModelAndView selectVendorLocationAssociations(@RequestParam Integer vendorLocationAssociationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationIdKey));
		mav.setViewName("vendorlocationassociations/viewVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 * Select the child VendorProfile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationAssociationsVendorProfile")
	public ModelAndView confirmDeleteVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId, @RequestParam Integer related_vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorprofile", vendorProfileDAO.findVendorProfileByPrimaryKey(related_vendorprofile_registrationId));
		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.setViewName("vendorlocationassociations/vendorprofile/deleteVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationAssociationsVendorProfile")
	public ModelAndView saveVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId, @ModelAttribute VendorProfile vendorprofile) {
		VendorLocationAssociations parent_vendorlocationassociations = vendorLocationAssociationsService.saveVendorLocationAssociationsVendorProfile(vendorlocationassociations_vendorLocationAssociationId, vendorprofile);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.addObject("vendorlocationassociations", parent_vendorlocationassociations);
		mav.setViewName("vendorlocationassociations/viewVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 * Select the VendorLocationAssociations entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVendorLocationAssociations")
	public ModelAndView confirmDeleteVendorLocationAssociations(@RequestParam Integer vendorLocationAssociationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationIdKey));
		mav.setViewName("vendorlocationassociations/deleteVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 * Show all VendorProfile entities by VendorLocationAssociations
	 * 
	 */
	@RequestMapping("/listVendorLocationAssociationsVendorProfile")
	public ModelAndView listVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorLocationAssociationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationIdKey));
		mav.setViewName("vendorlocationassociations/vendorprofile/listVendorProfile.jsp");

		return mav;
	}

	/**
	 * Entry point to show all VendorLocationAssociations entities
	 * 
	 */
	public String indexVendorLocationAssociations() {
		return "redirect:/indexVendorLocationAssociations";
	}

	/**
	 * Create a new VendorProfile entity
	 * 
	 */
	@RequestMapping("/newVendorLocationAssociationsVendorProfile")
	public ModelAndView newVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.addObject("vendorprofile", new VendorProfile());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocationassociations/vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/saveVendorLocationAssociations")
	public String saveVendorLocationAssociations(@ModelAttribute VendorLocationAssociations vendorlocationassociations) {
		vendorLocationAssociationsService.saveVendorLocationAssociations(vendorlocationassociations);
		return "forward:/indexVendorLocationAssociations";
	}

	/**
	 * Edit an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/editVendorLocationAssociationsVendorProfile")
	public ModelAndView editVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId, @RequestParam Integer vendorprofile_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("vendorlocationassociations/vendorprofile/editVendorProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/editVendorLocationAssociations")
	public ModelAndView editVendorLocationAssociations(@RequestParam Integer vendorLocationAssociationIdKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationIdKey));
		mav.setViewName("vendorlocationassociations/editVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 * Create a new VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/newVendorLocationAssociations")
	public ModelAndView newVendorLocationAssociations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("vendorlocationassociations", new VendorLocationAssociations());
		mav.addObject("newFlag", true);
		mav.setViewName("vendorlocationassociations/editVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/vendorlocationassociationsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationAssociationsVendorProfile")
	public ModelAndView deleteVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId, @RequestParam Integer related_vendorprofile_registrationId) {
		ModelAndView mav = new ModelAndView();

		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsService.deleteVendorLocationAssociationsVendorProfile(vendorlocationassociations_vendorLocationAssociationId, related_vendorprofile_registrationId);

		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.addObject("vendorlocationassociations", vendorlocationassociations);
		mav.setViewName("vendorlocationassociations/viewVendorLocationAssociations.jsp");

		return mav;
	}

	/**
	 * View an existing VendorProfile entity
	 * 
	 */
	@RequestMapping("/selectVendorLocationAssociationsVendorProfile")
	public ModelAndView selectVendorLocationAssociationsVendorProfile(@RequestParam Integer vendorlocationassociations_vendorLocationAssociationId, @RequestParam Integer vendorprofile_registrationId) {
		VendorProfile vendorprofile = vendorProfileDAO.findVendorProfileByPrimaryKey(vendorprofile_registrationId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorlocationassociations_vendorLocationAssociationId", vendorlocationassociations_vendorLocationAssociationId);
		mav.addObject("vendorprofile", vendorprofile);
		mav.setViewName("vendorlocationassociations/vendorprofile/viewVendorProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing VendorLocationAssociations entity
	 * 
	 */
	@RequestMapping("/deleteVendorLocationAssociations")
	public String deleteVendorLocationAssociations(@RequestParam Integer vendorLocationAssociationIdKey) {
		VendorLocationAssociations vendorlocationassociations = vendorLocationAssociationsDAO.findVendorLocationAssociationsByPrimaryKey(vendorLocationAssociationIdKey);
		vendorLocationAssociationsService.deleteVendorLocationAssociations(vendorlocationassociations);
		return "forward:/indexVendorLocationAssociations";
	}
}