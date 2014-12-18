package main.app.web;

import main.app.domain.VendorProfile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VendorLoginController {

	@RequestMapping("/login.action")
	public ModelAndView doLogin()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("vendorprofile", new VendorProfile());		
		
		mav.setViewName("/login.jsp");
		return mav;
	}
}
