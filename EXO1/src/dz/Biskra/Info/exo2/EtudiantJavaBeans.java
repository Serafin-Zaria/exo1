package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantJavaBeans {
private String  nom, prenom, adresse_mail, adresse_postale;
	
	private  LocalDate date_de_naissance;
	
	public ArrayList<Note> notes =  new ArrayList<>();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse_mail() {
		return adresse_mail;
	}

	public void setAdresse_mail(String adresse_mail) {
		this.adresse_mail = adresse_mail;
	}

	public String getAdresse_postale() {
		return adresse_postale;
	}

	public void setAdresse_postale(String adresse_postale) {
		this.adresse_postale = adresse_postale;
	}

	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
	
	
	
}
