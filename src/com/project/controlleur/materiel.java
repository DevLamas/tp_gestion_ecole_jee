package com.project.controlleur;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class materiel extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{
		
		
		
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/materiel/materiel.jsp"
				).forward( request, response );
		
			}
}
