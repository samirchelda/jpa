package formationservelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class page2
 */
@WebServlet("/page2")
public class page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public page2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter  out= response.getWriter();
		//out.println("Hello Page2");
		//out.println("<a href=\"http://localhost:8080/formationJ2EE/page1\">lien</a>");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<titlepage><u>Page 1</br></u></titlepage>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Page2");
		out.println("</br>");
		out.println("<a href='Page1'>Valider</a>");
		out.println("<p>Bonjour "+ request.getParameter("Nom") + "!!</p>"); 
		out.println("<p>Bonjour "+ request.getParameter("Prenom") + "!!</p>"); 
		//out.println("<a href=\"http://localhost:8080/formationJ2EE/page1\">lien</a>");
		out.println("</body>");
		out.println("</html>");

		//response.getWriter().println("Hello word !!!");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
