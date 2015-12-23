package formationservelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login2
 */
@WebServlet("/login")
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authentification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("user");
		String password = request.getParameter("password");

		if (validate(user, password)) {
			request.getSession().setAttribute("isLogged",true);
			// afficher list des utils
			response.sendRedirect("user/list");

		} else {
			// retour login (page)
			request.getRequestDispatcher("login1.jsp").forward(request, response);;

		}

	}

	private boolean validate(String user, String password) {

		boolean result = false;

		System.out.println("User :" + user);
		System.out.println("Password :" + password);

		if (user != null & password != null) {
			if (user.equals("samir")) {
				if (password.equals("samir")) {
					result = true;
				}
			}
		}
		return result;

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

}
