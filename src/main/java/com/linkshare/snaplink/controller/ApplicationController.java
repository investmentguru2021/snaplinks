package com.linkshare.snaplink.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linkshare.snaplink.service.ApplicationService;
import com.linkshare.snaplink.vo.UIObjectVO;


// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationController.
 */
@RestController
@RequestMapping(value = "/api")
public class ApplicationController {
	
	
	/** The application service. */
	@Autowired
	ApplicationService applicationService;
	
	
	/**
	 * Login user.
	 *
	 * @param uiObject the ui object
	 * @param response the response
	 * @param request the request
	 * @param model the model
	 * @return the UI object VO
	 */
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public @ResponseBody UIObjectVO loginUser(@RequestBody UIObjectVO uiObject, HttpServletResponse response,HttpServletRequest request, Model model) {
		
		try {
			applicationService.authenticateUser(uiObject);
			return uiObject;
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return uiObject;
	}
	
	
	
	/**
	 * Search for user links.
	 *
	 * @param uiObject the ui object
	 * @param response the response
	 * @param request the request
	 * @param model the model
	 * @return the UI object VO
	 */
	@RequestMapping(value = "/searchForUserLinks", method = RequestMethod.POST)
	public @ResponseBody UIObjectVO searchForUserLinks(@RequestBody UIObjectVO uiObject, HttpServletResponse response,HttpServletRequest request, Model model) {
			
		try {
			applicationService.searchForUserLinks(uiObject);
				
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return uiObject;
	}
	
	
	
	@RequestMapping(value = "/searchUser", method = RequestMethod.POST)
	public @ResponseBody UIObjectVO searchUser(@RequestBody UIObjectVO uiObject, HttpServletResponse response,HttpServletRequest request, Model model) {
			
		try {
			applicationService.searchUser(uiObject);
				
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return uiObject;
	}
	
	
	
	/**
	 * Adds the new link.
	 *
	 * @param uiObject the ui object
	 * @param response the response
	 * @param request the request
	 * @param model the model
	 * @return the UI object VO
	 */
	@RequestMapping(value = "/addUrl", method = RequestMethod.POST)
	public @ResponseBody UIObjectVO addNewLink(@RequestBody UIObjectVO uiObject, HttpServletResponse response,HttpServletRequest request, Model model) {
			
		try {
			applicationService.addNewURLLink(uiObject);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return uiObject;
	}

}
