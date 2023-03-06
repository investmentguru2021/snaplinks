package com.linkshare.snaplink.service;

import com.linkshare.snaplink.entity.UserDetails;
import com.linkshare.snaplink.vo.UIObjectVO;

public interface ApplicationService {
	
	
	public UserDetails getUserbyUID(String soeId) ;
	
	public void authenticateUser(UIObjectVO uiObject) ;
	
	public void searchForUserLinks(UIObjectVO uiObject) ;
	
	public void addNewURLLink(UIObjectVO uiObject) ;
	
	public void searchUser(UIObjectVO uiObject) ;

}
