package com.m2i.formation.media.repositories;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.*;
import com.m2i.formation.media.entities.IEntity;

public abstract class AbstractRepository<T extends IEntity> implements IUoW, IRepository<T> {

	@PersistenceContext
	private EntityManager entityManager;
	private EntityTransaction transaction;

	public EntityManager getEntityManager() {

		return entityManager;
	}

	public void setEntityManager(EntityManager em) {
		this.entityManager = em;

	}

	public EntityTransaction getTransaction()
	{
		if (transaction == null) {
			transaction = getEntityManager().getTransaction();
		}
		if (!transaction.isActive()) {
			transaction.begin();
		}
		return transaction;
	}

	
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public AbstractRepository() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}
	

	public T save(T entity) {
		entityManager.persist(entity);

		return entity;
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public void remove(T entity) {
		entityManager.remove(entityManager.merge(entity));
	}
	// lecture Abstract Repository

	public T getById(int id) {
		return entityManager.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return entityManager.createQuery("Select e from " + entityClass.getSimpleName() + " e").getResultList();
	
	}

	public void commit() {
		getTransaction().commit();
	}
 
	@SuppressWarnings("unchecked")
	protected List<T> getByJPQL (String jpql){
		return getEntityManager().createQuery(jpql).getResultList();
		
	}
	@Override
	public void setTransaction(EntityTransaction tr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> getByWhere(String where) {
		// TODO Auto-generated method stub
		return null;
	}
}
