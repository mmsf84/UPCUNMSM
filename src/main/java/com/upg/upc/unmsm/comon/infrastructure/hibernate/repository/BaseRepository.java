package com.upg.upc.unmsm.comon.infrastructure.hibernate.repository;

public interface BaseRepository<T> {
	public T persist(T entity);
	public T save(T entity);
	public T update(T entity);
	public T merge(T entity);
	public T saveOrUpdate(T entity);

}
