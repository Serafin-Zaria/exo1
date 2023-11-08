package dz.Biskra.Info.exo1;
import java.time.*;

public class Etudiant {
	
	private String  nom, prenom, adresse_mail, adresse_postale;
	
	private  LocalDate date_de_naissance;

	public Etudiant(String nom, String prenom, String adresse_mail, String adresse_postale,
			LocalDate date_de_naissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse_mail = adresse_mail;
		this.adresse_postale = adresse_postale;
		this.date_de_naissance = date_de_naissance;
	}
	
	public String toString() {
		
		
		return "Etudiant nom:"+nom+" prenom="+prenom+"address_mail="+adresse_mail+" adresse postal="+adresse_postale;
		
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

	public String getNom() {
		return nom;
	}
	
	
	

}
