package com.linkshare.snaplink.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.linkshare.snaplink.dao.ApplicationDao;
import com.linkshare.snaplink.entity.UserDetails;
import com.linkshare.snaplink.entity.UserLinks;
import com.linkshare.snaplink.vo.UIObjectVO;



// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationDaoImpl.
 */
@Repository
public class ApplicationDaoImpl extends AbstractDao implements ApplicationDao{
	
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationDaoImpl.class);

	
	
	/**
	 * Gets the userby UID.
	 *
	 * @param soeId the soe id
	 * @return the userby UID
	 */
	@Override
	public UserDetails getUserbyUID(String soeId) {
		UserDetails user = null;
		try {
				// Create CriteriaBuilder
				CriteriaBuilder builder = getSession().getCriteriaBuilder();
				CriteriaQuery<UserDetails> criteria = builder.createQuery(UserDetails.class);
				Root<UserDetails> myObjectRoot = criteria.from(UserDetails.class);
				Predicate[] predicates = new Predicate[1];
				predicates[0] = builder.equal(myObjectRoot.get("soeId"),soeId);
			     criteria.select(myObjectRoot).where(predicates);
			    Query<UserDetails> query = getSession().createQuery(criteria);
			    user=query.uniqueResult();
			}catch(Exception ex) {
				LOG.error("Exception while getting user from table based on soeid",ex);
			}
		return user;
	}
	
	
	/**
	 * Search for user links.
	 *
	 * @param soeId the soe id
	 * @param type the type
	 * @return the list
	 */
	public List<UserLinks> searchForUserLinks(String soeId, String type) {
		List<UserLinks> userLinksList = null;
		try {
				// Create CriteriaBuilder
				CriteriaBuilder builder = getSession().getCriteriaBuilder();
				CriteriaQuery<UserLinks> criteria = builder.createQuery(UserLinks.class);
				Root<UserLinks> myObjectRoot = criteria.from(UserLinks.class);
				Predicate[] predicates = new Predicate[2];
				predicates[0] = builder.equal(myObjectRoot.get("soeId"),soeId);
				predicates[1] = builder.equal(myObjectRoot.get("type"),type);
			     criteria.select(myObjectRoot).where(predicates);
			    Query<UserLinks> query = getSession().createQuery(criteria);
			    userLinksList=query.getResultList();
			}catch(Exception ex) {
				LOG.error("Exception while getting user links table based on soeid",ex);
			}
		return userLinksList;
	}
	
	/**
	 * Search for user links with tags.
	 *
	 * @param tags the tags
	 * @param type the type
	 * @return the list
	 */
	public List<UserLinks> searchForUserLinksWithTags(String tags, String type) {
		List<UserLinks> userLinksList = null;
		try {
				// Create CriteriaBuilder
				CriteriaBuilder builder = getSession().getCriteriaBuilder();
				CriteriaQuery<UserLinks> criteria = builder.createQuery(UserLinks.class);
				Root<UserLinks> myObjectRoot = criteria.from(UserLinks.class);
				Predicate[] predicates = new Predicate[2];
				predicates[0] = builder.like(myObjectRoot.get("userLinkTags"),"%"+tags);
				predicates[1] = builder.equal(myObjectRoot.get("type"),type);
			     criteria.select(myObjectRoot).where(predicates);
			    Query<UserLinks> query = getSession().createQuery(criteria);
			    userLinksList=query.getResultList();
			}catch(Exception ex) {
				LOG.error("Exception while getting user links table based on soeid",ex);
			}
		return userLinksList;
	}
	
	
	/**
	 * Search for my links.
	 *
	 * @param soeId the soe id
	 * @return the list
	 */
	public List<UserLinks> searchForMyLinks(String soeId) {
		List<UserLinks> userLinksList = null;
		try {
				// Create CriteriaBuilder
				CriteriaBuilder builder = getSession().getCriteriaBuilder();
				CriteriaQuery<UserLinks> criteria = builder.createQuery(UserLinks.class);
				Root<UserLinks> myObjectRoot = criteria.from(UserLinks.class);
				Predicate[] predicates = new Predicate[1];
				predicates[0] = builder.equal(myObjectRoot.get("soeId"),soeId);
				criteria.select(myObjectRoot).where(predicates);
			    Query<UserLinks> query = getSession().createQuery(criteria);
			    userLinksList=query.getResultList();
			}catch(Exception ex) {
				LOG.error("Exception while getting user links table based on soeid",ex);
			}
		return userLinksList;
	}
	
	
	
	/**
	 * Save user link.
	 *
	 * @param userLink the user link
	 * @return the user links
	 */
	public UserLinks saveUserLink(UserLinks userLink) {
		try {
			
			saveOrupdate(userLink);
		}catch(Exception ex) {
			LOG.error("Exception while saving userLink", ex);
		}
		return userLink;
	}
}