package com.m2i.formation.element.repositorys;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IRepository<semiconductor> {
	
	String getUri();
	void SetUri(String uri);
	public semiconductor getById(int id) throws SQLException;
	public List<semiconductor> getAll() throws FileNotFoundException, IOException;
	public List<semiconductor> getBySymbol(String symb);
	public List<semiconductor> getByElement(int numElement);
	
	//*****************************************************
    public semiconductor save(semiconductor entity);
	public abstract semiconductor update (semiconductor entity);
	public abstract void  remove (semiconductor entity);
	public abstract List<semiconductor> getByWhere(String where);
	void commit();

}
