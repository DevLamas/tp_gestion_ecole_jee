package com.project.controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.beans.Personne;
import com.project.repository.PersonneRepository;

public class Login extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
		
		// Récupération des données du formulaire
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		PersonneRepository personneR = new PersonneRepository();
		Personne personne = personneR.authentification(login, password);
		
		if (personne.equals(null)) {
			
			
			this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("nom", personne.getNom());
			session.setAttribute("prenom", personne.getPrenom());
			session.setAttribute("status", personne.getStatus().getDesignation());
			
			
			this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request,response );
		}
	}
	
	
}
