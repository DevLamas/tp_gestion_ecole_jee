package com.project.controlleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/* Transmission de la paire d'objets request/response � notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
		
		// R�cup�ration des donn�es du formulaire
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
	}
}
