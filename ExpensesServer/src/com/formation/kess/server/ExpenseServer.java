package com.formation.kess.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A simple REST / JSON server which accepts a PUT containing an array of
 * Expenses and stores them on the local file system The URL to GET data is
 * expected to be
 * http://localhost:8080/ExpensesServer/rest/ExpenseServer/getExpenses The URL
 * for the PUT is expected to be
 * http://localhost:8080/ExpensesServer/rest/ExpenseServer/putExpenses The same
 * array can then be retrieved from
 * http://localhost:8080/ExpensesServer/rest/ExpenseServer/getExpenses using GET
 * 
 * The JSON Format should look like this:
 * {"expense":[{"description":"Description0","amount":"10.1","expenseDate":
 * "1303492691292"},{"description":"Description1"...
 * 
 * 
 * @author Student
 *
 */

@Path("/ExpenseServer")
public class ExpenseServer {

	private static List<Expense> expenseDb;

	public ExpenseServer() {
		if (expenseDb == null) {
			expenseDb = new ArrayList<Expense>();
			Expense e = new Expense("Restaurant", 25.0, 1);
			expenseDb.add(e);
			expenseDb.add(new Expense("Pizzeria", 24.0, 1));
		}
	}

	@Path("/")
	@GET
	/**
	 * Returns the array of saved expenses. Be warned that if there are zero
	 * saved entries then an array with an empty Expense will be returned This
	 * is necessary to prevent weird behaviour with the JAXB JSON
	 * implementation. The client needs to check for an array with one Expense
	 * which has it's description set to null
	 */
	public String getTest() {

		return "To test type : http://localhost:8080/ExpensesServer/rest/ExpenseServer/getExpenses";
	}

	@Path("/getExpense")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Returns the array of saved expenses. Be warned that if there are zero
	 * saved entries then an array with an empty Expense will be returned This
	 * is necessary to prevent weird behaviour with the JAXB JSON
	 * implementation. The client needs to check for an array with one Expense
	 * which has it's description set to null
	 */
	public Expense getExpense() {

		return expenseDb.get(0);
	}

	@Path("/getExpenses")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Returns the array of saved expenses. Be warned that if there are zero
	 * saved entries then an array with an empty Expense will be returned This
	 * is necessary to prevent weird behaviour with the JAXB JSON
	 * implementation. The client needs to check for an array with one Expense
	 * which has it's description set to null
	 */
	public List<Expense> getExpenses() {

		return expenseDb;
	}

	@POST
	@Path("/putExpenses")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * Saves the supplied array of expenses to local storage
	 */
	public List<Expense> putExpenses(List<Expense> expenses) {
		expenseDb = expenses;
		return expenses;
	}

}
