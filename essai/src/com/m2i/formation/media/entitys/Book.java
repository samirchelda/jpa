package com.m2i.formation.media.entitys;

import java.util.Date;

public class Book extends Media implements IEntity{

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Date date;
	private int nbPage;
	private String isbn;
	// private double price;
	// private String lang;

	// private Author[] authors = new Author[10];
	// private int nbAuthor = 0;
	private String title;
	// -----------attention pour traduire au UML--------
	private PublisherBook PublisherBook;
	// --------------------------------------------------

	private BookCaterory cat;

	public BookCaterory getCat() {
		return cat;
	}

	public void setCat(BookCaterory cat) {
		this.cat = cat;
	}

	public PublisherBook getPublisherBook() {
		return PublisherBook;
	}

	public void setPublisherBook(PublisherBook publisherBook) {
		PublisherBook = publisherBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNbPage() {
		return nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/*
	 * public double getPrice() { return price; }
	 * 
	 * public void setPrice(double price) { this.price = price; }
	 */

	/*
	 * public String getLang() { return lang; }
	 * 
	 * public void setLang(String lang) { this.lang = lang; }
	 */
	/// ************POLY TVA moin ******
	@Override
	public double getVATPrice() {
		return getPrice() * 1.05;
	}
	/*
	 * public void addAuthor(Author a) { authors[nbAuthor++] = a;
	 * 
	 * }
	 */

	public int getEvalution() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setLang(String string) {
		// TODO Auto-generated method stub
		
	}

}
