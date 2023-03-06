package com.linkshare.snaplink.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Flush session.
	 */
	public void flushSession() {
		Session session = getSession();
		session.flush();
		session.clear();

	}

	public <T> void evict(final T entity) {
		sessionFactory.getCurrentSession().evict(entity);
	}

	public <T> Serializable create(final T entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}

	public <T> T update(final T entity) {
		sessionFactory.getCurrentSession().update(entity);
		return entity;
	}

	public <T> T saveOrupdate(final T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
		return entity;
	}

	public <T> void delete(final T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	public <T> void delete(Serializable id, Class<T> entityClass) {
		T entity = fetchById(id, entityClass);
		delete(entity);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> fetchAll(Class<T> entityClass) {
		return sessionFactory.getCurrentSession().createCriteria(entityClass)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

	@SuppressWarnings("rawtypes")
	public <T> List fetchAll(String query) {
		return sessionFactory.getCurrentSession().createSQLQuery(query).list();
	}

	@SuppressWarnings("unchecked")
	public <T> T fetchById(Serializable id, Class<T> entityClass) {
		return (T) sessionFactory.getCurrentSession().get(entityClass, id);
	}

}
