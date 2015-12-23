package com.m2i.formation.element.repositorys;

import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import com.m2i.formation.element.*;
import com.m2i.formation.element.entities.IEntity;
import com.m2i.formation.element.entities.Semiconductor;

public abstract class AbstractRepository<semiconductor extends IEntity> implements IoW, IRepository<semiconductor> {

	@PersistenceContext
	private EntityManager entityManager;
	private EntityTransaction transaction;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityTransaction getTransaction() {

		if (transaction == null) {
			transaction = getEntityManager().getTransaction();
		}
		if (!transaction.isActive()) {
			transaction.begin();
		}
		return transaction;
	}

	public void setTransaction(EntityTransaction transaction) {
		this.transaction = transaction;
	}

	public void commit() {
		getTransaction().commit();
	}

	public semiconductor save(semiconductor entity) {
		entityManager.persist(entity);
		return entity;
	}

	public semiconductor update(semiconductor entity) {
		return entityManager.merge(entity);
	}

	public void remove(semiconductor entity) {
		entityManager.remove(entityManager.merge(entity));
	}

	private Class<semiconductor> entityClass;

	@SuppressWarnings("unchecked")
	public AbstractRepository() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<semiconductor>) genericSuperclass.getActualTypeArguments()[0];
	}

	@SuppressWarnings("unchecked")
	public List<semiconductor> getAll() {
		return entityManager.createQuery("Select e from " + entityClass.getSimpleName() + " e").getResultList();

	}

	public semiconductor getById(int id) throws SQLException {
		return entityManager.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	protected List<Semiconductor> getByJPQL(String jpql) {
		return getEntityManager().createQuery(jpql).getResultList();

	}

}
