package com.project.controlleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjoutStatus extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException{
		
    this.getServletContext().getRequestDispatcher( "/WEB-INF/AjoutStatus.jsp"
				).forward( request, response );
		
			}
}
