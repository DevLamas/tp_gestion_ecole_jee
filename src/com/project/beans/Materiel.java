package com.project.beans;

public class Materiel {
	private int id;
	private String designation;
	private int quantite;
	
	public int getId() {
		return this.id;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	public int getQuantite() {
		return this.quantite;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
