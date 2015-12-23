package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class TestConnection {

	public static void main(String[] args) {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/config.properties"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String drv = prop.getProperty("drv");
		String url = prop.getProperty("url");
		String strSQL = "SELECT * from elementchimi;";
		String login = prop.getProperty("login");
		String password = prop.getProperty("password");

		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(drv);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, login, password);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(strSQL);
			while (rs.next()) {

				System.out.println("\t  Element :" + rs.getInt("id"));
				System.out.println("\t  Semiconducteur : " + rs.getString("semiconducteur") + " Energie = " + rs.getDouble("eg(ev)") + " (ev)");
				System.out.println("\t Nombre Atomique : " + rs.getInt("nbrAtomique")  +   " Symbole  " + rs.getString("Symbol"));
				System.out.println();

			}
		} catch (Exception ex) {
			System.out.println("SQL exception: " + ex);
		}
		// il faut toujours finally pour lui dire des que tu finis traitement
		// tu ferme meme avec errreur
		finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
