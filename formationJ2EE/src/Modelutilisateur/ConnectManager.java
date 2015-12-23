package Modelutilisateur;

import java.sql.*;

import java.util.*;

public class ConnectManager {

	// -----------constants-----------------------
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // Driver
	private static final String JDBC_URl = "jdbc:mysql://localhost/jee"; // connection
	private static final String JDBC_USER = "root"; // statment
	private static final String JDBC_PASS = "root"; // mot pass
	// variables-------------------------------------
	private Connection conn = null;
	
	public Connection getConn() {
		return conn;
	}

	// ----------------------------------------------------------------------
	private static final  ConnectManager instance = new ConnectManager();

	public static final  ConnectManager getInstance() {
		return instance;

	}
	
	private ConnectManager(){
		try {
			Class.forName(JDBC_DRIVER);// permet de ramener la librairie dans Driver management-
			conn = DriverManager.getConnection(JDBC_URl, JDBC_USER, JDBC_PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
