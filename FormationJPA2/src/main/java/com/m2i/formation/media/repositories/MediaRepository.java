package com.m2i.formation.media.repositories;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.m2i.formation.media.entities.Media;



public class MediaRepository implements IRepository<Media>, IUoW {

	private EntityManager entityManager;
	private EntityTransaction transaction;
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
		
	}

	@Override
	public EntityTransaction getTransaction() {
		return this.transaction;
	}

	@Override
	public void setTransaction(EntityTransaction tr) {
		this.transaction = tr;
	}

	
	@Override
	public void commit() {
		getTransaction().commit();
		
	}

	@Override
	public Media save(Media entity) {
		// TODO Auto-generated method stub
		getEntityManager().persist(entity);
		return entity; 
	}

	@Override
	public Media update(Media entity) {
		// TODO Auto-generated method stub
		getEntityManager().merge(entity);
		return entity;
	}

	@Override
	public void remove(Media entity) {
		getEntityManager().remove(entity);
		
	}

	@Override
	public Media getById(int id) {
		return getEntityManager().find(Media.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Media> getAll() {
		Query query = getEntityManager().createQuery("select e from Media e");
		List<Media> l = query.getResultList();
		
		return l;
	}

	@Override
	public List<Media> getByWhere(String where) {
		// TODO Auto-generated method stub
		return null;
	}


	
}