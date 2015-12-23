package com.m2i.formation.element.repositorys;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.m2i.formation.element.entities.Semiconductor;

@SuppressWarnings("unused")
public class SeConductorRepository implements IRepository<Semiconductor> {

	private int id;
	private String symb;
	private String numElement;
	private List<Semiconductor> cache = null;// singleton
	private List<Semiconductor> getCache = null;

	@SuppressWarnings("unused")
	private List<Semiconductor> getCache() {

		if (cache == null) {
			cache = cacheFactory();
		}

		return cache;
	}

	private List<Semiconductor> cacheFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Semiconductor> cacheFactory1(String groupeSC) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(getUri()));

		br.readLine();// saute la premiere
		String line = br.readLine();
		List<Semiconductor> remi = new ArrayList<Semiconductor>();
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String symb = st.nextToken();
			String numElement = st.nextToken();
			double nbrAtomique = Double.parseDouble(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			Semiconductor semi = new Semiconductor();
			semi.setId(id);
			semi.setNbrAtomique(nbrAtomique);
			semi.setGroupeSC(groupeSC);
			line = br.readLine();

		}
		br.close();
		return remi;
	}

	@Override
	public List<Semiconductor> getAll() {

		return null;
	}

	@Override
	public Semiconductor getById(int id) {

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

	public String getNumElement() {
		return numElement;
	}

	public void setNumElement(String numElement) {
		this.numElement = numElement;
	}

	public String getSymb() {
		return symb;
	}

	public void setSymb(String symb) {
		this.symb = symb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Semiconductor> getGetCache() {
		return getCache;
	}

	public void setGetCache(List<Semiconductor> getCache) {
		this.getCache = getCache;
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

	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

}
