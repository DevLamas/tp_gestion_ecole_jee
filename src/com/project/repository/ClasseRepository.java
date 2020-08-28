package com.project.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.beans.Classe;
import com.project.beans.Personne;
import com.project.beans.Status;
import com.project.beans.ConnexionBDD;

public class ClasseRepository {
	private Connection bdd;
	
	public Connection getBdd() {
		System.out.println("point 9");

		ConnexionBDD Cobdd = new ConnexionBDD();
		
		
	 Cobdd.connection();   
	 bdd=Cobdd.getBdd();
		System.out.println("point 8");

		return bdd;
	}
	
	
	public Classe find(int id) {
		
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from classe where id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			Classe classe = buildObjet(result);
			return classe;
			
		}catch(Exception e) {
			System.out.println("");
			e.printStackTrace();
			Classe classe = new Classe();
            return classe;
		}
	}
	
	public ArrayList<Classe> getListClasses() {
		System.out.println("point 2:");
		ArrayList<Classe> classes = new ArrayList();
		System.out.println("point 3:");

		try {
			System.out.println("point 4");

			PreparedStatement statement = this.getBdd().prepareStatement("Select * from classe");
			
			
			System.out.println("point 5");

			System.out.println("erreur:"+classes);
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Classe classe = buildObjet(rs);
				classes.add(classe);
			}
    	} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

		return classes;		
	}
	
	
	public boolean addClasse(Classe classe) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("insert into classe values(?,?)");
			statement.setInt(1,this.getNewId());
			statement.setString(1, classe.getDesignation());
			
			if(statement.executeUpdate() < 1)
				return false;
			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return true;
	}
	
	public boolean updateClasse(Classe classe) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("update personne set designation = ? where id = ?");
			statement.setString(1, classe.getDesignation());
			statement.setInt(2, classe.getId());
			
			if(statement.executeUpdate() < 1)
				return false;
			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return true;
	}
	
	
	public boolean deleteClasse(int classeId) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("delete from classe where id = ?");
			statement.setInt(1, classeId);
			if(statement.executeUpdate() < 1)
				return false;			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }		
		return true;
	}
	
	
	protected Classe buildObjet(ResultSet result) throws SQLException {
		Classe classe = new Classe();
		while (result.next()) {
			int id = result.getInt(1);
			classe.setId(id);
			String designation = result.getString(2);
			classe.setDesignation(designation);
		}
		return classe;
	}
	
	public int getNewId() {
		int newid = -1;
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(id)+1 as newid from classe");
			ResultSet rs = statement.executeQuery();
			if(rs.next()){
				newid = rs.getInt("newid");
			}
    	} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return newid;
	}
}
