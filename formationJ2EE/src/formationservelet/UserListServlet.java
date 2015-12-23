package formationservelet;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelutilisateur.Utilisateur;
import Modelutilisateur.UtilisateurManager;

/**
 * Servlet implementation class UserListServlet
 */
//@WebServlet("/user/list")
@WebServlet(urlPatterns={"/user/list","/index"})
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		displayView(request, response, UtilisateurManager.getInstance().getAll());
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void displayView(HttpServletRequest request, HttpServletResponse response,List<Utilisateur> utils)
			throws ServletException, IOException {
		
		
		request.getSession().setAttribute("listUtilisateur",utils);
		request.getRequestDispatcher("/listUser.jsp").forward(request, response);
		
		
		
		/*PrintWriter out = response.getWriter();
		out.println("<html><body><h1> Utilisateur details</h1>");
	
		for (Utilisateur u:utils) {
		
			
			out.println("<tr>");
  
			
			out.println("<td> #" + u.getId() + "</td>");
			out.println("<td> #" + u.getFirstname() + "</td>");
			out.println("<td> #" + u.getLastname() + "</td>");
			out.println("<td> #" + u.getAdress() + "</td>");
			out.println("<td><a href='detail?id="+ u.getId() + "'>detail</a>"+ "</td>");
			out.println("</tr>");*/
		
			
		/*
		  	
		  	out.println("<form action='Utilisateur' methode='POST'>");
			out.println("<a href='Utilisateur'>Valider</a>");
			out.println("<p>Id</p>");
			out.println("<input type='text' name='Id' value=" +u.getId()+">");
			out.println("</br>");
			out.println("<p>Lastname</p>");
			out.println("<input type='text' name='Lastname' value=" +u.getLastname()+">");
			out.println("</br>");
			out.println("<p>Firstname</p>");
			out.println("<input type='text' name='Firsttname' value=" +u.getFirstname()+">");
			out.println("</br>");
			out.println("<p>Adress</p>");
			out.println("<input type='text' name='Adress' value=" +u.getAdress()+">");
			out.println("</br>");	
		 

		}
		out.println("</table></body></html>");*/
	}
}
