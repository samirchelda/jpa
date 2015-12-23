package essai;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class TestConnection {

	public static void main(String[] args) {

		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream("src/config.properties"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String drv = prop.getProperty("drv");
		String url = prop.getProperty("url");
		String strSQL = "SELECT * from media where type=0;";
		String login = prop.getProperty("login");
		String password = prop.getProperty("password");

		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(drv);
		} catch (Exception ex) {
			System.out.println("erreur: driver jdbc-odbc:" + ex);
			return;
		}
		try {
			conn = DriverManager.getConnection(url, login, password);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(strSQL);
			while (rs.next()) {

				System.out.println("\t  Livre :" + rs.getInt("id"));// System.out.println();
				System.out.println(
						"\t Titre de livre : " + rs.getString("titre") + " coûte = " + rs.getDouble("price") + " €");
				System.out.println();
				System.out.println("\t Nombre de page : " + rs.getInt("nbpage") + "La langue " + rs.getString("lang"));
				System.out.println();
				// System.out.println(rs.getString("titre") + " " +
				// rs.getDouble("price"));

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
