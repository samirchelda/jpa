package com.m2i.formation.element.repositorys;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ElementChimiRepository implements IoW,IRepository<SemiconducorRepository>{

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetUri(String uri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SemiconducorRepository getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SemiconducorRepository> getAll() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SemiconducorRepository> getBySymbol(String symb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SemiconducorRepository> getByElement(int numElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SemiconducorRepository save(SemiconducorRepository entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SemiconducorRepository update(SemiconducorRepository entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(SemiconducorRepository entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SemiconducorRepository> getByWhere(String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntityManager(EntityManager em) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityTransaction getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTransaction(EntityTransaction tr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}



}