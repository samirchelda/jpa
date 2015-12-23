package tests;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.m2i.formation.element.entities.Semiconductor;
import com.m2i.formation.element.repositorys.IRepository;

public class SemiconducteurBDRepositories implements IRepository<Semiconductor> {

	private Properties prop;
	private String drv;
	private String url;
	private String strSQl;
	private String login;
	private String password;
	
	

	public SemiconducteurBDRepositories() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("src/config.properties"));
		drv = prop.getProperty("drv");
		url = prop.getProperty("url");
		strSQl = "SELECT * from elements";
		login = prop.getProperty("login");
		password = prop.getProperty("password");

	}

	@Override
	public List<Semiconductor> getAll() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/config.properties"));
		String drv =prop.getProperty("drv"); 
		String url = prop.getProperty("url"); 
		String strSQL = "SELECT * from elements;"; 
		String login =prop.getProperty("login"); 
		String password = prop.getProperty("password");
		return getAll() ;
	}

	@Override
	public Semiconductor getById(int id) throws SQLException {
		List<Semiconductor> semis = getByQuery("SELECT * from elements where id= " + id);
		Semiconductor sc = null;
		if (semis.size() > 0) {
			sc = semis.get(0);
		}
		return (Semiconductor) sc;

	}

	private List<Semiconductor> getByQuery(String string) throws SQLException {
		List<Semiconductor> semis = new ArrayList<Semiconductor>();
		Connection conn = null;
		Statement stmt = null;
		conn = DriverManager.getConnection(url, login, password);
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(strSQl);
		while (rs.next())
		{
			Semiconductor sc = new Semiconductor();
			sc.setId(rs.getInt("id"));
			sc.setGroupeSC(rs.getString("groupeSC"));
			sc.setNom(rs.getString("nom"));
			sc.setNbrAtomique(rs.getInt("nbrAtomique"));
			semis.add(sc);
		}
		stmt.close();
		conn.close();
		rs.close();
		return semis;
	}

	@SuppressWarnings("unused")
	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(drv);
		Connection conn = getConnection();
		return conn = DriverManager.getConnection(url, login, password);
	}

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetUri(String uri) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Semiconductor> getBySymbol(String symb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Semiconductor> getByElement(int numElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Semiconductor save(Semiconductor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Semiconductor update(Semiconductor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Semiconductor entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Semiconductor> getByWhere(String where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

}
