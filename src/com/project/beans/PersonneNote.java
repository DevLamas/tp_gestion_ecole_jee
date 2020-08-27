package com.project.beans;

public class PersonneNote {
	private int id;
	private Personne personne;
	private Cour cour;
	private Note note;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
	public Cour getCour() {
		return cour;
	}
	public void setCour(Cour cour) {
		this.cour = cour;
	}
	
	
	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	}
	

}
