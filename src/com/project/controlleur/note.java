package com.project.controlleur;

import java.io.IOException;

import javax.servlet.http.HttpServlet;

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


public class note extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{
		
		
		
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Note/note.jsp"
				).forward( request, response );
		
			}
}
