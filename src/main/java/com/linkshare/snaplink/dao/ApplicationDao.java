package com.linkshare.snaplink.dao;

import java.util.List;

import com.linkshare.snaplink.entity.UserDetails;
import com.linkshare.snaplink.entity.UserLinks;

// TODO: Auto-generated Javadoc
/**
 * The Interface ApplicationDao.
 */
public interface ApplicationDao {
	
	
	/**
	 * Gets the userby UID.
	 *
	 * @param soeId the soe id
	 * @return the userby UID
	 */
	public UserDetails getUserbyUID(String soeId) ;
	
	
	/**
	 * Search for user links.
	 *
	 * @param soeId the soe id
	 * @param type the type
	 * @return the list
	 */
	public List<UserLinks> searchForUserLinks(String soeId, String type) ;
	
	/**
	 * Search for my links.
	 *
	 * @param soeId the soe id
	 * @return the list
	 */
	public List<UserLinks> searchForMyLinks(String soeId) ;
	
	
	/**
	 * Search for user links with tags.
	 *
	 * @param tags the tags
	 * @param type the type
	 * @return the list
	 */
	public List<UserLinks> searchForUserLinksWithTags(String tags, String type) ;
	
	
	/**
	 * Save user link.
	 *
	 * @param userLink the user link
	 * @return the user links
	 */
	public UserLinks saveUserLink(UserLinks userLink) ;
	
	
	/**
	 * Search for user links basedon type.
	 *
	 * @param type the type
	 * @return the list
	 */
	public List<UserLinks> searchForUserLinksBasedonType(String type) ;
	
	
}
