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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletResponse;
import com.project.repository.ClasseRepository;
import java.util.ArrayList;

public class ListeClasse extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{
		
		//try{
		ClasseRepository ObjetClasseRepository = new ClasseRepository();
		System.out.println( "point 1 ");
		ArrayList<Classe> listeClasses = ObjetClasseRepository.getListClasses();
		System.out.println( " test : "+listeClasses);

		request.setAttribute( "listeClasses", listeClasses );
	/*}
	catch(Exception e)
	{
		System.out.println("erreur:"+e);
	}*/
		
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/ListeClasse/ListeClasse.jsp"
				).forward( request, response );
		
			}
	
}
