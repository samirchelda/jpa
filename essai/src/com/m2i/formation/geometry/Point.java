package com.m2i.formation.geometry;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	public void deplacer(int newx, int newy) {
		x = newx;
		y = newy;
	}

	public void afficher() {
		System.out.println("(" + x + ";" + y + ")");

	}
	
	

}
