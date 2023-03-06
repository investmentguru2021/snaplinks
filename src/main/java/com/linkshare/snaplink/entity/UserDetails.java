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
 * The Class AppUser.
 *
 * @author MukulRaizada
 */
@Entity
@Table(name = "user_detail")
public class UserDetails implements Serializable{
	
		/** The Constant serialVersionUID. */
		private static final long serialVersionUID = 1L;
		
		/** The app user id. */
		@JsonView(Views.Public.class)
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "USER_DETAIL_ID")
		private int userDetailId;
		
		/** The uid. */
		@JsonView(Views.Public.class)
		@Column(name = "SOEID")
		private String soeId;
		
		/** The email id. */
		@JsonView(Views.Public.class)
		@Column(name = "EMAILID")
		private String emailId;
		
		/** The display name. */
		@JsonView(Views.Public.class)
		@Column(name = "EMPNAME")
		private String empName;
		
		/** The user password. */
		@JsonView(Views.Public.class)
		@Column(name = "PASSWORD")
		private String Password;
		
		
		/** The create date. */
		@JsonView(Views.Public.class)
		@Column(name = "CREATE_DATE")
		private Date createDate;
		
		/**
		 * Gets the user detail id.
		 *
		 * @return the user detail id
		 */
		public int getUserDetailId() {
			return userDetailId;
		}

		/**
		 * Sets the user detail id.
		 *
		 * @param userDetailId the new user detail id
		 */
		public void setUserDetailId(int userDetailId) {
			this.userDetailId = userDetailId;
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
		 * Gets the email id.
		 *
		 * @return the email id
		 */
		public String getEmailId() {
			return emailId;
		}

		/**
		 * Sets the email id.
		 *
		 * @param emailId the new email id
		 */
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		/**
		 * Gets the emp name.
		 *
		 * @return the emp name
		 */
		public String getEmpName() {
			return empName;
		}

		/**
		 * Sets the emp name.
		 *
		 * @param empName the new emp name
		 */
		public void setEmpName(String empName) {
			this.empName = empName;
		}

		/**
		 * Gets the password.
		 *
		 * @return the password
		 */
		public String getPassword() {
			return Password;
		}

		/**
		 * Sets the password.
		 *
		 * @param password the new password
		 */
		public void setPassword(String password) {
			Password = password;
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
		 * Gets the update date.
		 *
		 * @return the update date
		 */
		public Date getUpdateDate() {
			return updateDate;
		}

		/**
		 * Sets the update date.
		 *
		 * @param updateDate the new update date
		 */
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}

		/** The update date. */
		@JsonView(Views.Public.class)
		@Column(name = "UPDATE_DATE")
		private Date updateDate;
		
		
		}
