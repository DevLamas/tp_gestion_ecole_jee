package com.project.beans;

import java.sql.Date;

public class Note {
	private int id;
	private float note;
	private Date dateNote;
	private String designation;
	private Date dateControle;
	
	public int getId() {
		return this.id;
	}
	
	public float getNote() {
		return this.note;
	}
	
	public Date getDateNote() {
		return this.dateNote;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	public Date getDateControle() {
		return this.dateControle;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNote(float note) {
		this.note = note;
	}
	
	public void setDateNote(Date dateNote) {
		this.dateNote = dateNote;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setDateControl(Date dateControle) {
		this.dateControle = dateControle;
	}
	
}
