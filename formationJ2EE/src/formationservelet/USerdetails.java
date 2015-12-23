package formationservelet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelutilisateur.Utilisateur;
import Modelutilisateur.UtilisateurManager;

/**
 * Servlet implementation class Utilisateurdetails
 */
@WebServlet("/user/detail")
public class USerdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public USerdetails() {
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();

		// Recupere l'attribut de la session : formatDisplay
        String format = (String)request.getSession().getAttribute("format");
        // Recupere le parametre de la requete : id de l'utisateur selectionne
        String id = request.getParameter("id");
        
       // format = format.toUpperCase();
        // Recupere les donnees du user selectionne en fonction de son id
		Utilisateur user= UtilisateurManager.getInstance().getbyid(Integer.parseInt(id));
        
        PrintWriter out = response.getWriter();
        
        // Si le format d'affichage demande est JSON ou XML
        if(format !=null && (format.equals("JSON") || format.equals("XML")) )
        {
            // On indique que le format d'affichage de la reponse
            response.setContentType(format);
            
            if(format.equals("JSON") )
            {
            	System.out.println("lolololololo");
            	out.println(user.toJSON());
            }
            else
            {
                out.println(user.toXML());
            }            
        }
        
        // Sino je redispatche vers la JSP
        else
        {        
        	request.getSession().setAttribute("user",user);
			request.getRequestDispatcher("/userdetail.jsp").forward(request, response);
        }
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

	/*private String displayView(Utilisateur u) {
		
		
		
		
		String s;

		s = "<html><body><h1> Details de l'utilisateur </h1>";
		s += "<form action='Utilisateur' methode='POST'>";
		s += "<p>Id</p>";
		s += "<input type='text' name='Id' value=" + u.getId() + "/>";
		s += "</br>";
		s += "<p>Lastname</p>";
		s += "<input type='text' name='Lastname' value=" + u.getLastName() + "/>";
		s += "</br>";
		s += "<p>Firstname</p>";
		s += "<input type='text' name='Firsttname' value=" + u.getFirstName() + "/>";
		s += "</br>";
		s += "<p>Adress</p>";
		s += "<input type='text' name='Adress' value=" + u.getAdress() + "/>";
		s += "</body></html>";
		return s;

	}*/

}
