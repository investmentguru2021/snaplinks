package com.linkshare.snaplink.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.linkshare.snaplink.entity.UserDetails;
import com.linkshare.snaplink.entity.UserLinks;

// TODO: Auto-generated Javadoc
/**
 * The Class UIObjectVO.
 */
public class UIObjectVO implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2129372151024603769L;
	
	/** The id. */
	@JsonView(Views.Public.class)
	private int id;
	
	/** The uid. */
	@JsonView(Views.Public.class)
	private String soeId;
	
	/** The id. */
	@JsonView(Views.Public.class)
	private String password;
	
	/** The authentication status. */
	@JsonView(Views.Public.class)
	private boolean authenticationStatus;
	
	/** The message. */
	@JsonView(Views.Public.class)
	private String message;
	
	/** The user details. */
	@JsonView(Views.Public.class)
	private UserDetails userDetails;
	
	/** The user links. */
	@JsonView(Views.Public.class)
	private List<UserLinks>  userLinks;
	
	/** The public links. */
	@JsonView(Views.Public.class)
	private String publicLinks;
	
	/** The following links. */
	@JsonView(Views.Public.class)
	private String followingLinks;
	
	/** The my links. */
	@JsonView(Views.Public.class)
	private String myLinks;
	
	/** The search query. */
	@JsonView(Views.Public.class)
	private String searchQuery;
	
	/** The search user. */
	@JsonView(Views.Public.class)
	private String searchUser;
	
	/** The url. */
	@JsonView(Views.Public.class)
	private String url;
	
	/** The description. */
	@JsonView(Views.Public.class)
	private String description;
	
	/** The tags. */
	@JsonView(Views.Public.class)
	private String tags;
	
	/** The type. */
	@JsonView(Views.Public.class)
	private String type;
	
	/** The keywords. */
	@JsonView(Views.Public.class)
	private String keywords;
	
	/** The success. */
	@JsonView(Views.Public.class)
	private String success;
	
	/** The follow status. */
	@JsonView(Views.Public.class)
	private String followStatus = "N";
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the soe id.
	 *
	 * @return the soe id
	 */
	public String getSoeId() {
		return soeId;
	}

	/**
	 * Sets the soe id.
	 *
	 * @param soeId the new soe id
	 */
	public void setSoeId(String soeId) {
		this.soeId = soeId;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Checks if is authentication status.
	 *
	 * @return true, if is authentication status
	 */
	public boolean isAuthenticationStatus() {
		return authenticationStatus;
	}

	/**
	 * Sets the authentication status.
	 *
	 * @param authenticationStatus the new authentication status
	 */
	public void setAuthenticationStatus(boolean authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	/**
	 * Gets the user details.
	 *
	 * @return the user details
	 */
	public UserDetails getUserDetails() {
		return userDetails;
	}

	/**
	 * Sets the user details.
	 *
	 * @param userDetails the new user details
	 */
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the user links.
	 *
	 * @return the user links
	 */
	public List<UserLinks> getUserLinks() {
		return userLinks;
	}

	/**
	 * Sets the user links.
	 *
	 * @param userLinks the new user links
	 */
	public void setUserLinks(List<UserLinks> userLinks) {
		this.userLinks = userLinks;
	}

	/**
	 * Gets the public links.
	 *
	 * @return the public links
	 */
	public String getPublicLinks() {
		return publicLinks;
	}

	/**
	 * Sets the public links.
	 *
	 * @param publicLinks the new public links
	 */
	public void setPublicLinks(String publicLinks) {
		this.publicLinks = publicLinks;
	}

	/**
	 * Gets the following links.
	 *
	 * @return the following links
	 */
	public String getFollowingLinks() {
		return followingLinks;
	}

	/**
	 * Sets the following links.
	 *
	 * @param followingLinks the new following links
	 */
	public void setFollowingLinks(String followingLinks) {
		this.followingLinks = followingLinks;
	}

	/**
	 * Gets the my links.
	 *
	 * @return the my links
	 */
	public String getMyLinks() {
		return myLinks;
	}

	/**
	 * Sets the my links.
	 *
	 * @param myLinks the new my links
	 */
	public void setMyLinks(String myLinks) {
		this.myLinks = myLinks;
	}

	/**
	 * Gets the search query.
	 *
	 * @return the search query
	 */
	public String getSearchQuery() {
		return searchQuery;
	}

	/**
	 * Sets the search query.
	 *
	 * @param searchQuery the new search query
	 */
	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the tags.
	 *
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * Sets the tags.
	 *
	 * @param tags the new tags
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the keywords.
	 *
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * Sets the keywords.
	 *
	 * @param keywords the new keywords
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * Gets the success.
	 *
	 * @return the success
	 */
	public String getSuccess() {
		return success;
	}

	/**
	 * Sets the success.
	 *
	 * @param success the new success
	 */
	public void setSuccess(String success) {
		this.success = success;
	}

	/**
	 * Gets the follow status.
	 *
	 * @return the follow status
	 */
	public String getFollowStatus() {
		return followStatus;
	}

	/**
	 * Sets the follow status.
	 *
	 * @param followStatus the new follow status
	 */
	public void setFollowStatus(String followStatus) {
		this.followStatus = followStatus;
	}

	/**
	 * Gets the search user.
	 *
	 * @return the search user
	 */
	public String getSearchUser() {
		return searchUser;
	}

	/**
	 * Sets the search user.
	 *
	 * @param searchUser the new search user
	 */
	public void setSearchUser(String searchUser) {
		this.searchUser = searchUser;
	}

	
}
