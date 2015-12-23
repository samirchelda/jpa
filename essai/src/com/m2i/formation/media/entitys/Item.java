package com.m2i.formation.media.entitys;

public abstract class Item implements IItem {
	private int id;
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getTitre()
	 */
	@Override
	public String getTitre() {
		return titre;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#setTitre(java.lang.String)
	 */
	@Override
	public void setTitre(String titre) {
		this.titre = titre;
	}
	private String titre;
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.IItem#getVATPrice()
	 */
	@Override
	public abstract double getVATPrice();
	

}
