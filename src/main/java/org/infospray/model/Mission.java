package org.infospray.model;

import java.util.Date;

public class Mission {
	
	private int idRessource;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	private String commentaire;
	
	private Client client = new Client();
	
	private Formation formation = new Formation();
	
	private int note;

	public int getIdRessource() {
		return idRessource;
	}

	public void setIdRessource(int idRessource) {
		this.idRessource = idRessource;
	}


	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

}
