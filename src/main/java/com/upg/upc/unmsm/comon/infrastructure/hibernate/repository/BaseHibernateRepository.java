package com.upg.upc.unmsm.comon.infrastructure.hibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseHibernateRepository<T> implements BaseRepository<T>{
	
	protected SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public T persist(T entity) {
		getSession().persist(entity);
		return entity;
	}

	@Override
	public T save(T entity) {
		getSession().save(entity);
		return entity;
	}

	@Override
	public T update(T entity) {
		getSession().update(entity);
		return entity;
	}

	@Override
	public T merge(T entity) {
		getSession().merge(entity);
		return entity;
	}

	@Override
	public T saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		return entity;
	}
	
}
