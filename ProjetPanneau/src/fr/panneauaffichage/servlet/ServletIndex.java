package fr.panneauaffichage.servlet;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.panneauaffichage.bo.Panneau;
import fr.panneauaffichage.dal.DALException;
import fr.panneauaffichage.dal.PanneauDAO;
import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet(description = "affiche le site", urlPatterns = { "/ServletIndex" })
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIndex() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String titre = request.getParameter("titre");
		Integer nbhabitants =Integer.parseInt(request.getParameter("nbhabitants"));
		String texte = request.getParameter("texte");
		
		String dateConseil = request.getParameter("date");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(dateConseil);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		
		
		Panneau p = new Panneau(titre,nbhabitants,texte,date);
		
		try {
			PanneauDAO.enregistrer(p);
		} catch (DALException e) {
			
			e.printStackTrace();
		}
//		request.setAttribute("ok", "ok");
		request.getRequestDispatcher("/WEB-INF/editer.jsp").forward(request, response);

	}



}
