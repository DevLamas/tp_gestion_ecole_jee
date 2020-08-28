package com.project.controlleur;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.beans.Classe;
import com.project.repository.ClasseRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutClasse extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{
		request.setAttribute( "resultatPost", "" );
		this.getServletContext().getRequestDispatcher( "/WEB-INF/ListeClasse/AjoutClasse.jsp"
				).forward( request, response );
		
			}
	 public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
			

	    	String  NomClasse= request.getParameter("txtNomClasse");
			
			  
			  if(NomClasse!="")
			  {
				  System.out.println( "valeur: '"+NomClasse+"'");
				  ClasseRepository ObjetClasseRepository = new ClasseRepository();

				
				Classe ClasseObjet=new Classe();

				ClasseObjet.setDesignation(NomClasse);
				ObjetClasseRepository.addClasse(ClasseObjet);

		    	String  resultatPost ="<div class=\"alert alert-success\" role=\"alert\">\r\n" + 
		    			"  Classe ajoutée!\r\n" + 
		    			"</div>";
				request.setAttribute( "resultatPost", resultatPost );

			  }
			  else {
				  
				  
					String  resultatPost ="<div class=\"alert alert-danger\" role=\"alert\">\r\n" + 
					" Erreur!\r\n" + 
					"</div>";
					request.setAttribute( "resultatPost", resultatPost );

			  }

				this.getServletContext().getRequestDispatcher( "/WEB-INF/ListeClasse/AjoutClasse.jsp").forward( request, response );

	    }
}
