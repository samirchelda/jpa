package com.m2i.formation.element.repositorys;

import java.sql.SQLException;
import java.util.List;

import com.m2i.formation.element.entities.Semiconductor;

public class ElementChimiRepository2 extends AbstractRepository<Semiconductor> {
	public List<Semiconductor> getBynbrAtomiquer(int nbrAtomique) {
		return getByJPQL("Select * from elements e where e.nbrAtomique <=" + nbrAtomique);
	}


	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

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
	public Semiconductor getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Semiconductor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Semiconductor> getBySymbol(String symb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Semiconductor> getByElement(int numElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Semiconductor save(Semiconductor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Semiconductor update(Semiconductor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Semiconductor entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Semiconductor> getByWhere(String where) {
		// TODO Auto-generated method stub
		return null;
	}

}
