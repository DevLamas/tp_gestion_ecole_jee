package com.project.beans;

public class PersonnePresence {
	private int id;
	private Personne personne;
	private Cour cour;
	private Presence presence;
	
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
	
	
	public Presence getPresence() {
		return presence;
	}
	public void setPresence(Presence presence) {
		this.presence = presence;
	}

}
