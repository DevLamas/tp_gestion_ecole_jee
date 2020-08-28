package com.project.controlleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.beans.Personne;
import com.project.repository.PersonneRepository;

public class ListePersonne extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{

    this.getServletContext().getRequestDispatcher( "/WEB-INF/ListeEleve/ListePersonne.jsp"
				).forward( request, response );
		
			}
}
