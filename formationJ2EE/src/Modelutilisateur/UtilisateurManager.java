package Modelutilisateur;

import java.sql.*;
import java.util.*;

public class UtilisateurManager {

	private static final UtilisateurManager instance = new UtilisateurManager();

	public static final UtilisateurManager getInstance() {
		return UtilisateurManager.instance;

	}

	private Map<Integer, Utilisateur> cache = new HashMap<Integer, Utilisateur>();

	private UtilisateurManager() {
		Utilisateur u1 = new Utilisateur();
		u1.setId(1);
		u1.setLastName("sam1");
		u1.setFirstName("chel1");
		u1.setAdress("SMH1");
		this.add(u1);

		Utilisateur u2 = new Utilisateur();
		u2.setId(2);
		u2.setLastName("sam2");
		u2.setFirstName("chel2");
		u2.setAdress("SMH2");
		this.add(u2);

		Utilisateur u3 = new Utilisateur();
		u3.setId(3);
		u3.setLastName("sam3");
		u3.setFirstName("chel3");
		u3.setAdress("SMH3");
		this.add(u3);
	}

	// private List<Utilisateur> utilisateur = new ArrayList<Utilisateur>();

	public void add(Utilisateur uti) {
		this.cache.put(uti.getId(), uti);

	}

	public void del(Utilisateur uti) {
		this.cache.remove(uti.getId());
	}

	public void update(Utilisateur uti) {
		this.cache.replace(uti.getId(), uti);
	}

	public Utilisateur getbyid(int id) {

		return this.cache.get(id);
	}

	public List<Utilisateur> getAll() {
		ConnectManager u = ConnectManager.getInstance();
		Statement stmt = null;
		ResultSet rs = null;
		List<Utilisateur> utilis = new ArrayList<Utilisateur>();

		try {
			stmt = u.getConn().createStatement();
			rs = stmt.executeQuery("select * from user;");
			// conn=JDBCSingleton.getInstance().getconnection();
			// stmt = conn.prepareStatement("select*from user where id?;");

			while (rs.next()) {

				Utilisateur utili = new Utilisateur();

				int id = rs.getInt("iduser");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String adress = rs.getString("adress");

				utili.setId(id);
				utili.setFirstName(firstname);
				utili.setLastName(lastname);
				utili.setAdress(adress);
				
				utilis.add(utili);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt == null) {
					stmt.close();
				}
				if (rs == null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		List<Utilisateur> utils = new ArrayList<Utilisateur>(this.cache.values());
		return utils;

	}

}
