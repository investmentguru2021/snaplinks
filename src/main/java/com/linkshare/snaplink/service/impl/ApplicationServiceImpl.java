package com.linkshare.snaplink.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.linkshare.snaplink.dao.ApplicationDao;
import com.linkshare.snaplink.entity.UserDetails;
import com.linkshare.snaplink.entity.UserLinks;
import com.linkshare.snaplink.service.ApplicationService;
import com.linkshare.snaplink.vo.UIObjectVO;


// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationServiceImpl.
 */
@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

	/** The application dao. */
	@Autowired
	ApplicationDao applicationDao;
	
	/** The log. */
	private static Logger LOG = LoggerFactory.getLogger(ApplicationServiceImpl.class);
	
	/**
	 * Gets the userby UID.
	 *
	 * @param soeId the soe id
	 * @return the userby UID
	 */
	@Override
	public UserDetails getUserbyUID(String soeId) {
		UserDetails userDetails = applicationDao.getUserbyUID(soeId);
		LOG.info(" We have fetched  the username from the DB");
		return userDetails;
	}
	
	
	/**
	 * Authenticate user.
	 *
	 * @param uiObject the ui object
	 */
	public void authenticateUser(UIObjectVO uiObject) {
		LOG.info(" We have fetched  the username from the DB");
		
		UserDetails userDetails = this.getUserbyUID(uiObject.getSoeId());
		if(userDetails!=null) {
			if(userDetails.getPassword().equals(uiObject.getPassword())) {
				uiObject.setAuthenticationStatus(true);
				uiObject.setMessage("Authenticated Successfully");
			}else {
				uiObject.setAuthenticationStatus(false);
				uiObject.setMessage("Authenticated failed");
			}
		}
		
		
	}
	
	
	/**
	 * Search for user links.
	 *
	 * @param uiObject the ui object
	 */
	public void searchForUserLinks(UIObjectVO uiObject) {
		LOG.info(" We have fetched  the username from the DB");
		List<UserLinks> userLinksList= null;
		
		if(uiObject.getSearchQuery()!=null && uiObject.getSearchQuery().length()>1) {
			if(uiObject.getSearchQuery().startsWith("#")) {
				userLinksList= applicationDao.searchForUserLinksWithTags(uiObject.getSearchQuery(), "shared");
			}else {
				userLinksList= applicationDao.searchForUserLinks(uiObject.getSearchQuery(), "shared");	
			}
			
		}
		else if(uiObject.getMyLinks().equalsIgnoreCase("Y")) {
			userLinksList= applicationDao.searchForMyLinks(uiObject.getSoeId());	
		}
		
		
		
			if(userLinksList!=null && !userLinksList.isEmpty()) {
				uiObject.setUserLinks(userLinksList);
			}else {
				userLinksList= new ArrayList<UserLinks>();  
				uiObject.setUserLinks(userLinksList);
				uiObject.setMessage("User Data is Empty");
			}
	}
	
	
	
	/**
	 * Search user.
	 *
	 * @param uiObject the ui object
	 */
	public void searchUser(UIObjectVO uiObject) {
		LOG.info(" We have fetched  the username from the DB");
		UserDetails userDetail= null;
		
		if(uiObject.getSoeId()!=null) {
			userDetail= applicationDao.getUserbyUID(uiObject.getSoeId());
			
		}else if(uiObject.getSearchUser()!=null) {
			userDetail= applicationDao.getUserbyUID(uiObject.getSearchUser());
		}
		
		if(userDetail!=null) {
			uiObject.setUserDetails(userDetail);
			uiObject.setSuccess("true");	
		}
		else {
			uiObject.setSuccess("false");
		}
	}
	
	
	
	/**
	 * Adds the new URL link.
	 *
	 * @param uiObject the ui object
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void addNewURLLink(UIObjectVO uiObject) {
		
		UserLinks userLinks= null;
		
		try {
			if(uiObject!=null) {
				userLinks = new UserLinks();
				userLinks.setSoeId(uiObject.getSoeId());
				userLinks.setUserLinkDescription(uiObject.getDescription());
				userLinks.setType(uiObject.getType());
				userLinks.setUrl(uiObject.getUrl());
				userLinks.setUserLinkTags(uiObject.getTags());
				userLinks.setCreateDate(new Date());
				userLinks.setLastAccessDate(new Date());
				applicationDao.saveUserLink(userLinks);
				uiObject.setSuccess("true");
			}
			
		}catch(Exception ex) {
			LOG.info("Exception while saving the object", ex);
			uiObject.setSuccess("false");
		}
	}
	

}
