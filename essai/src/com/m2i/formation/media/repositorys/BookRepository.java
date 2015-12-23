package com.m2i.formation.media.repositorys;

import java.io.*;
import java.util.*;

import com.m2i.formation.media.entitys.Book;

public class BookRepository implements iRepository<Book> {

	private String uri;
	private String id;
	private String Price;
	private String Titre;
	private String line;
	private List<Book> cache = null;// singleton
	private List<Book> getCache = null;

	private List<Book> getCache() throws IOException {

		if (cache == null) {
			cache = cacheFactory();
		}

		return cache;
	}

	public List<Book> cacheFactory() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(uri));
		br.readLine();// saute la premiere
		String line = br.readLine();
		List<Book> result1 = new ArrayList<Book>();

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String titre = st.nextToken();
			String author = st.nextToken();
			double price = Double.parseDouble(st.nextToken());
			int id = Integer.parseInt(st.nextToken());

			Book b = new Book();
			b.setId(id);
			b.setTitre(titre);
			b.setPrice(price);
			line = br.readLine();

		}
		br.close();
		return result1;
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
	public List<Book> getAll() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(uri));
		br.readLine();// saute la premiere
		String line = br.readLine();
		List<Book> result1 = new ArrayList<Book>();
		

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String titre = st.nextToken();
			String author = st.nextToken();
			double price = Double.parseDouble(st.nextToken());
			int id = Integer.parseInt(st.nextToken());

			Book b = new Book();
			b.setId(id);
			b.setTitre(titre);
			b.setPrice(price);
			line = br.readLine();

		}
		br.close();
		return result1;
	}

	@Override
	public Book getById(int id) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for (Book b : getCache()) {
			if (b.getId() == id) {
				return b;
			}

		}
		return null;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for (Book b : getCache()) {
			if (b.getPrice() <= price) {
				l.add(b);
			}

		}
		return l;

	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for (Book b : getCache()) {
			if (b.getTitle().toUpperCase().contains(word.toUpperCase())) {
				l.add(b);
			}

		}
		return l;
	}

	public void insert(Book b) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * private List<Book> getByAll() throws IOException {
	 * 
	 * List<Book> result = new ArrayList<Book>(); BufferedReader br = new
	 * BufferedReader(new FileReader(uri)); br.readLine();// saute la premiere
	 * String line = br.readLine();
	 * 
	 * /* FileReader filereader = new FileReader(uri); FileWriter fileWrite =new
	 * FileWriter(uri);
	 */
	/*
	 * while (line != null) { StringTokenizer st = new StringTokenizer(line,
	 * ";"); String titre = st.nextToken(); String author = st.nextToken();
	 * double price = Double.parseDouble(st.nextToken()); int id =
	 * Integer.parseInt(st.nextToken()); // TODO Faire un livre avec les infos
	 * précédentes List<Book> book = new ArrayList<Book>(); // TODO Add le livre
	 * à ta liste book.add()
	 * 
	 * line = br.readLine();
	 * 
	 * // fileWrite.close();
	 * 
	 * } br.close(); return result; }
	 */

}
