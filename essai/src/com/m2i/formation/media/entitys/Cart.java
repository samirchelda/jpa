package com.m2i.formation.media.entitys;

import java.util.ArrayList;
import java.util.List;
/**
 * Calsse qui gére le panier cart
 * @author adminlocal
 *
 */

public class Cart implements IEntity{

	private List<Media> medias = new ArrayList<Media>();
	private int id;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Media> getMedias() {
		return medias;
	}
	
	/**
	 * Retourne le prix TTC du panier par polymorphisme
	 * @return
	 */
	
	public double getVatPrice(){
	double price = 0;
	for (Media m:medias){
		price+=m.getVATPrice();
	}
	
return price;
}
	
}
		
