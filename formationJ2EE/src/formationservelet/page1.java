package formationservelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class page1
 */
@WebServlet("/page1")

public class page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public page1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre = "Titreee";
		request.setAttribute("titre",titre );
		
		request.getRequestDispatcher("formulaire.jsp").forward(request, response);
	
		
		// TODO Auto-generated method stub
		//response.getWriter().println("Hello page1 !!!");
		/*response.setContentType("text/html");
		/*PrintWriter  out= response.getWriter();
		//out.println("Hello Page1");
		//out.println("<a href=\"http://localhost:8080/formationJ2EE/page2\">lien</a>");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<titlepage><u>Page 1</br></u></titlepage>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Page1");
		out.println("</br>");
		out.println("<form action='page2' methode='POST'>");
		out.println("<p>Nom</p>");
		out.println("<input type='text' name='Nom'/><br>");
		out.println("<br>");
		out.println("<p>Prenom</p>");
		out.println("<input type='text' name='Prenom'/>");
		out.println("<br>");
		out.println("<button> valider</button>");
		out.println("</form>");
		//out.println("<a href='Page2'>Valider</a>");
		//out.println("<a href=\"http://lpage2\">lien</a>");
		out.println("</body>");
		out.println("</html>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
