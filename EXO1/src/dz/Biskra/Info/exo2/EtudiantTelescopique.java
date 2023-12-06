package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantTelescopique {

	
private String  nom, prenom, adresse_mail, adresse_postale;
	
	private  LocalDate date_de_naissance;
	
	public ArrayList<Note> notes =  new ArrayList<>();

	public EtudiantTelescopique(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public EtudiantTelescopique(String nom, String prenom, LocalDate date_de_naissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_de_naissance = date_de_naissance;
	}

	public EtudiantTelescopique(String nom, String prenom, String adresse_mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse_mail = adresse_mail;
	}
	
public String toString() {
		
		return "Etudiant nom:"+nom+" prenom="+prenom;
		
	}
	
	
	
}
