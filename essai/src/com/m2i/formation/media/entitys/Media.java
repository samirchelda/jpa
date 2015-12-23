package com.m2i.formation.media.entitys;

public abstract  class Media extends Item implements IEntity{
	
	//************************
	private int id;
	private double price;
	private String titre ;
	private Author[] authors = new Author[10];
	
	
    public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	//*************************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
//****************************Polymorphisme**********
	public abstract double getVATPrice();
		
	

}
