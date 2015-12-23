package com.m2i.formation.media.entitys;

public  class Dvd extends Media implements IEntity{
	
	//--------------------
	private int region;
	//--------------------

	
	

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	@Override
	public double getVATPrice() {
		// TODO Auto-generated method stub
		return getPrice()*1.2;
	}

	

}
