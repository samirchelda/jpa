package com.formation.kess.server;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Expense implements java.io.Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;
	private double amount;
	private long expenseDate;	

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(long expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Expense(){}
	
	public Expense(String description, double amount, long date ){
		this.description = description;
		this.amount = amount;
		this.expenseDate = date;

	}	
	
}

