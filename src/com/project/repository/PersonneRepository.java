package com.project.repository;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.beans.Personne;
import com.project.beans.Status;

public class PersonneRepository {
	
	private Connection bdd;
	
	public Connection getBdd() {
		return bdd;
	}
	
	/*
	 * Recherche d'une personne via son identifiant
	 * Parameter int id
	 * retourne objet Personne
	 */
	public Personne find(int id) {
			
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from personne p INNER JOIN status s ON p.Id_status = s.Id_status where id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			Personne personne = buildObjet(result);
			return personne;
			
		}catch(Exception e) {
			System.out.println("");
			e.printStackTrace();
			Personne personne = new Personne();
            return personne;
		}
	}
	
	
	public ArrayList<Personne> getListEleves() {
		ArrayList<Personne> personnes = new ArrayList();
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from personne p INNER JOIN status s ON p.Id_status = s.Id_status where s.Id_status = 3");
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Personne personne = buildObjet(rs);
				personnes.add(personne);
			}
    	} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return personnes;		
	}
	
	
	
	public ArrayList<Personne> getListProfs() {
		ArrayList<Personne> personnes = new ArrayList();
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from personne p INNER JOIN status s ON p.Id_status = s.Id_status where s.Id_status = 2");
			ResultSet rs = statement.executeQuery();
			while(rs.next()){
				Personne personne = buildObjet(rs);
				personnes.add(personne);
			}
    	} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return personnes;		
	}
	
	
	
	/*
	 * Fonction ajout d'une personne
	 * Parameter Personne personne
	 * retourne boolean
	 */
	public boolean addEleve(Personne personne) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("insert into personne values(?,?,?,?,?,?,?)");
			statement.setInt(1,this.getNewId());
			statement.setString(1, personne.getNom());
			statement.setString(2, personne.getPrenom());
			statement.setString(3, personne.getEmail());
			statement.setInt(4, personne.getStatus().getId());
			
			if(statement.executeUpdate() < 1)
				return false;
			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return true;
	}
	
	
	/*
	 * Fonction de modification d'une personne ciblé
	 * Parameter Personne personne
	 * retourne un boolean (true or false)
	 */
	public boolean updateEleve(Personne personne) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("update personne set nom = ?, prenom = ?, email = ?, mdp = ?, Id_status = ? where id = ?");
			statement.setString(1, personne.getNom());
			statement.setString(2, personne.getPrenom());
			statement.setString(3, personne.getEmail());
			statement.setInt(4, personne.getStatus().getId());
			statement.setInt(7,personne.getId());
			
			if(statement.executeUpdate() < 1)
				return false;
			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
		return true;
	}
	
	
	
	/*
	 * Fonction supprimant une personne sélectionner
	 * Parameter int peronneId
	 * retourne un booléan (true or false)
	 */
	public boolean deleteEleve(int personneId) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("delete from personne where id = ?");
			statement.setInt(1, personneId);
			if(statement.executeUpdate() < 1)
				return false;			
		} catch (SQLException ex) {
        	System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }		
		return true;
	}
	
	
	/*
	 * Fonction permettant le calcul auto des identifiants des objets personnes
	 */
	public int getNewId() {
		int newid = -1;
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("SELECT max(id)+1 as newid from personne");
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
	
	
	
	public Personne authentification(String email, String password) {
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from personne p INNER JOIN status s ON p.Id_status = s.Id_status where email = ? AND mdp = ?");
			statement.setString(1, email);
			statement.setString(2, password);
			ResultSet result = statement.executeQuery();
			Personne personne = buildObjet(result);
			return personne;
			
		}catch(Exception e) {
			System.out.println("");
			e.printStackTrace();
			Personne personne = new Personne();
            return personne;
		}
	}
	
	
	
	/*
	 * Fonction permettant la création des objets Personnes
	 * Parameter ResultSet result
	 * retourne un objet Personne
	 */
	protected Personne buildObjet(ResultSet result) throws SQLException {
		Personne personne = new Personne();
		Status status = new Status();
		while (result.next()) {
			int id = result.getInt(1);
			personne.setId(id);
			String nom = result.getString(2);
			personne.setNom(nom);
			String prenom = result.getString(3);
			personne.setNom(prenom);
			String email = result.getString(4);
			personne.setEmail(email);
			String password = result.getString(5);
			personne.setPassword(password);
			
			int idStatus = result.getInt(7);
			status.setId(idStatus);
			String designation = result.getString(8);
			status.setDesignation(designation);
			personne.setStatus(status);
		}
		return personne;
	}

}
