package dz.Biskra.Info.exo2;
import java.time.*;
import java.util.ArrayList;

public class Etudiant1 {
	
	private final String  nom, prenom, adresse_mail, adresse_postale;
	
	private final LocalDate date_de_naissance;
	
	public  ArrayList<Note> notes =  new ArrayList<>();

	private Etudiant1(EtudiantBuilder builder) {
		super();
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.adresse_mail = builder.adresse_mail;
		this.adresse_postale = builder.adresse_postale;
		this.date_de_naissance = builder.date_de_naissance;
	}
	
	public String toString() {
		
		return "Etudiant nom:"+nom+" prenom="+prenom+"address_mail="+adresse_mail+" adresse postal="+adresse_postale;
		
	}

	
	
	public void noter(Material material, float valeur) {
		 Note note = new Note(material,valeur);
		 notes.add(note);

	}
	
	public  double calculerMoyenne() {
		
		float sum=0;
		float coefSum = 0;
		for(int i=0;i<notes.size();i++) {
			sum =sum + (notes.get(i).getNote()*notes.get(i).getMaterial().getCoef() );
			coefSum = coefSum + notes.get(i).getMaterial().getCoef();
		}
		
		if(notes.isEmpty()) {
			return 0;
		}
		
		return (sum/coefSum);
		
	}
	
		public static class EtudiantBuilder{
		
			private  String  nom, prenom;
			private  LocalDate date_de_naissance;
			private String adresse_mail, adresse_postale;
			
			public EtudiantBuilder(String firstName, String lastName, LocalDate age) {
				this.nom = firstName;
				this.prenom = lastName;
				this.date_de_naissance = age;
				}

				public EtudiantBuilder adresse_mail(String adresse_mail) {
				this.adresse_mail = adresse_mail;
				return this;
				}
				public EtudiantBuilder adresse_postale(String address) {
				this.adresse_postale = address;
				return this;
				}
				
				public Etudiant1 build() {
					Etudiant1 e = new Etudiant1(this);
					return e;
				}
			
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
