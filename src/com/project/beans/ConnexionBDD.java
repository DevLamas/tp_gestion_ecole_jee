package com.project.beans;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

import java.io.FileInputStream;
//import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.util.Properties;

public class ConnexionBDD {
	private Connection bdd;
	public Connection getBdd() {
		this.connection();
		return bdd;
	}

/*	public static Connection connexion() {
		try {
			final Properties prop = new Properties();
			 InputStream input = null;
				
			    String file = "build/config.properties";
			   

			    input = new FileInputStream("build/config.properties");

	             prop.load(input);
			    
			    
				
				
				String url = prop.getProperty("db.url");
	            String user = prop.getProperty("db.user");
	            String passwd = prop.getProperty("db.password");
	            
				System.out.println("point 7");
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_jee","root","");
				 return con;
		
			
        } catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        }catch (final IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	*/
public void connection() {

	        Connection conntemp = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	        } catch (Exception ex) {
	        }
	        try {
	           

	            conntemp = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_jee","root","");


	        } catch (SQLException ex) {
	            // handle any errors
	            System.out.println("SQLException: " + ex.getMessage());
	            System.out.println("SQLState: " + ex.getSQLState());
	            System.out.println("VendorError: " + ex.getErrorCode());
	        } 


	        this.bdd = conntemp;
	    }
	
	
	
}
