package com.m2i.formation.element.entities;

import java.io.Serializable;

/**
 * The persistent class for the Elementchimi  database table.
 * 
 */
/*@Entity
@NamedQuery(name="Elementchimi.findAll", query="SELECT m FROM Elementchimi m")*/
public abstract class Elementchimi implements IEntity{

	private int id;
	private double Eg;
	private String nom;
	private String symbol;
	private double nbrAtomique;	
	private String groupeSC;
	private String semiconducteur;
	private Semiconductor[] sc = new Semiconductor[5];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupeSC() {
		return groupeSC;
	}
	public void setGroupeSC(String groupeSC) {
		this.groupeSC = groupeSC;
	}
	public String getSemiconducteur() {
		return semiconducteur;
	}
	public void setSemiconducteur(String semiconducteur) {
		this.semiconducteur = semiconducteur;
	}
	public double getEg() {
		return Eg;
	}
	public void setEg(double eg) {
		Eg = eg;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getNbrAtomique() {
		return nbrAtomique;
	}
	public void setNbrAtomique(double nbrAtomique) {
		this.nbrAtomique = nbrAtomique;
	}
	public Semiconductor[] getSc() {
		return sc;
	}
	public void setSc(Semiconductor[] sc) {
		this.sc = sc;
	}


}
