package com.m2i.formation.element.repositorys;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IoW {
	public abstract EntityManager getEntityManager();
	public abstract void setEntityManager(EntityManager em);
	public abstract EntityTransaction getTransaction();
	public abstract void setTransaction(EntityTransaction tr);
	public abstract void commit();
}
