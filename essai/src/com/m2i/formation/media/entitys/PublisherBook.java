package com.m2i.formation.media.entitys;

public class PublisherBook implements IEntity{

	private String nom;
	private String date;
    private int id;

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
