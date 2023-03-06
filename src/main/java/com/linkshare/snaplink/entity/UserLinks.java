package com.linkshare.snaplink.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.linkshare.snaplink.vo.Views;

// TODO: Auto-generated Javadoc
/**
 * The Class UserLinks.
 */
@Entity
@Table(name = "user_links")
public class UserLinks  implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7333438340169642139L;
	
	
	
	
	/** The app user id. */
	@JsonView(Views.Public.class)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_LINKS_ID")
	private int id;
	
	/** The user link description. */
	@JsonView(Views.Public.class)
	@Column(name = "LINK_DESCRIPTION")
	private String userLinkDescription;
	
	/** The user link tags. */
	@JsonView(Views.Public.class)
	@Column(name = "LINK_TAGS")
	private String userLinkTags;
	
	/** The url. */
	@JsonView(Views.Public.class)
	@Column(name = "URL")
	private String url;
	
	/** The type. */
	@JsonView(Views.Public.class)
	@Column(name = "TYPE")
	private String type;
	
	/** The soe id. */
	@JsonView(Views.Public.class)
	@Column(name = "SOEID")
	private String soeId;
	
	/** The create date. */
	@JsonView(Views.Public.class)
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	/** The last access date. */
	@JsonView(Views.Public.class)
	@Column(name = "LAST_ACCESS_DATE")
	private Date lastAccessDate;

	/**
	 * Gets the user link description.
	 *
	 * @return the user link description
	 */
	public String getUserLinkDescription() {
		return userLinkDescription;
	}

	/**
	 * Sets the user link description.
	 *
	 * @param userLinkDescription the new user link description
	 */
	public void setUserLinkDescription(String userLinkDescription) {
		this.userLinkDescription = userLinkDescription;
	}

	/**
	 * Gets the user link tags.
	 *
	 * @return the user link tags
	 */
	public String getUserLinkTags() {
		return userLinkTags;
	}

	/**
	 * Sets the user link tags.
	 *
	 * @param userLinkTags the new user link tags
	 */
	public void setUserLinkTags(String userLinkTags) {
		this.userLinkTags = userLinkTags;
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
	 * Gets the creates the date.
	 *
	 * @return the creates the date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 *
	 * @param createDate the new creates the date
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the last access date.
	 *
	 * @return the last access date
	 */
	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	/**
	 * Sets the last access date.
	 *
	 * @param lastAccessDate the new last access date
	 */
	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

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

	
}
