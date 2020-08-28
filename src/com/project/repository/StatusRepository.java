package com.project.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.beans.Personne;
import com.project.beans.Status;

public class StatusRepository {
	private Connection bdd;
	
	public Connection getBdd() {
		return bdd;
	}
	
	
	public Status find(int id) {
		
		try {
			PreparedStatement statement = this.getBdd().prepareStatement("Select * from status where id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			Status status = buildObjet(result);
			return status;
			
		}catch(Exception e) {
			System.out.println("");
			e.printStackTrace();
			Status status = new Status();
            return status;
		}
	}
	
	protected Status buildObjet(ResultSet result) throws SQLException {
		Status status = new Status();
		while (result.next()) {
			int id = result.getInt(1);
			status.setId(id);
			String designation = result.getString(2);
			status.setDesignation(designation);
		}
		return status;
	}
	
}
