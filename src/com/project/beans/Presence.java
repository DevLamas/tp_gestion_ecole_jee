package com.project.beans;

import java.sql.Date;

public class Presence {
	private int id;
	private Date datePresence;
	private Boolean present;
	private String designation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Date getDatePresence() {
		return datePresence;
	}
	public void setDatePresence(Date datePresence) {
		this.datePresence = datePresence;
	}
	
	
	public Boolean getPresent() {
		return present;
	}
	public void setPresent(Boolean present) {
		this.present = present;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
