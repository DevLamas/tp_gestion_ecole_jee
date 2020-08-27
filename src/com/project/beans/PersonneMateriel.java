package com.project.beans;

import java.sql.Date;

public class PersonneMateriel {

	private int id;
	private Personne personne;
	private Materiel materiel;
	private Date dateEmprunt;
	private int quantitePrise;
	private Date dateRendu;
	private int quantiteRendu;
	private String commentaire;
	
	
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
	
	
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	
	public int getQuantitePrise() {
		return quantitePrise;
	}
	public void setQuantitePrise(int quantitePrise) {
		this.quantitePrise = quantitePrise;
	}
	
	
	public Date getDateRendu() {
		return dateRendu;
	}
	public void setDateRendu(Date dateRendu) {
		this.dateRendu = dateRendu;
	}
	
	
	public int getQuantiteRendu() {
		return quantiteRendu;
	}
	public void setQuantiteRendu(int quantiteRendu) {
		this.quantiteRendu = quantiteRendu;
	}
	
	
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
}
