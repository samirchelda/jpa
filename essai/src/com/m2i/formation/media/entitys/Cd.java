package com.m2i.formation.media.entitys;

public class Cd extends Media implements IEntity{

	private int nbTrack;

	public int getNbTrack() {
		return nbTrack;
	}

	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}

	@Override
	public double getVATPrice() {
		// TODO Auto-generated method stub
		return getPrice()*1.2;
	}
	


}
