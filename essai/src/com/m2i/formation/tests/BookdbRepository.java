package com.m2i.formation.tests;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.w3c.dom.ls.LSInput;

import com.m2i.formation.media.entitys.Book;
import com.m2i.formation.media.repositorys.iRepository;

public class BookdbRepository implements iRepository<Book> {

	// Definition des champs
	private Properties prop;
	private String drv;
	private String url;
	private String strSQl;
	private String login;
	private String password;

	// Construteur

	public BookdbRepository() throws Exception {
		prop = new Properties();
		prop.load(new FileInputStream("src/config.properties"));
		drv = prop.getProperty("drv");
		url = prop.getProperty("url");
		strSQl = "SELECT * from media where type=0";
		login = prop.getProperty("login");
		password = prop.getProperty("password");

	}

	public String getDrv() {
		return drv;
	}

	public void setDrv(String drv) {
		this.drv = drv;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return url;
	}

	@Override
	public void SetUri(String uri) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	// faire valider le test BookbdResoporitorie------
	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(drv);
		Connection conn = getConnection();
		return conn = DriverManager.getConnection(url, login, password);

	}

	@Override

	public List<Book> getAll() throws IOException, Exception {
		return null;

	}
	/*
	 * Properties prop = new Properties(); prop.load(new
	 * FileInputStream("src/config.properties")); String drv =
	 * prop.getProperty("drv"); String url = prop.getProperty("url"); String
	 * strSQL = "SELECT * from media where type=0;"; String login =
	 * prop.getProperty("login"); String password =
	 * prop.getProperty("password");
	 */

	private List<Book> getByQuery() throws SQLException {

		List<Book> books = new ArrayList<Book>();
		Connection conn = null;
		Statement stmt = null;
		// Class.forName(drv);
		conn = DriverManager.getConnection(url, login, password);
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(strSQl);

		while (rs.next()) {
			Book bo = new Book();
			/*
			 * int id = rs.getInt("id"); Double price = rs.getDouble("price");
			 * String titre = rs.getString("titre"); int nbpage =
			 * rs.getInt("nbpage"); String lang = rs.getString("lang");
			 */

			bo.setId(rs.getInt("id"));
			bo.setPrice(rs.getDouble("price"));
			bo.setTitle(rs.getString("titre"));
			bo.setNbPage(rs.getInt("nbpage"));
			bo.setLang(rs.getString("lang"));
			books.add(bo);

		}

		stmt.close();
		conn.close();
		rs.close();

		return books;
	}

	@Override
	public Book getById(int id) throws IOException {
		List<Book> books = getByQuery("SELECT * from media where id= " + id);
		Book b = null;
		if (books.size() > 0) {
			b = books.get(0);
		}
		return b;
	}

	private List<Book> getByQuery(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
