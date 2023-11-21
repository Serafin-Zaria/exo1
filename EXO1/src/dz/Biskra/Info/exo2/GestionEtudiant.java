package dz.Biskra.Info.exo2;
import java.time.*;

public class GestionEtudiant {
	
	public static void main(String[] args) {
		 LocalDate maDate = LocalDate.of(2001, Month.NOVEMBER, 6);
		 
		 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",maDate);
		 System.out.println("The student Info are: \n name="+e.getNom()+"  lastname="+e.getPrenom()+"  email="+e.getAdresse_mail()+"  adress="+e.getAdresse_postale()+"  birthdate="+e.getDate_de_naissance());
		 Etudiant toto = e;
		 	if(toto==e) {
		 		System.out.println("eqauls");
		 	}else System.out.println("not equal");
		 	e.setNom("toto");
		 	
		 	Departement d = new Departement("informatique","univ biskra");
			 Etudiant fifi = new Etudiant("fifi","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",maDate);
			 Etudiant riri = new Etudiant("riri","Tabbi Anneni","tabfiifn@gmail.com","Rue sovia 2534",maDate);
			 	
			 d.inscrire(e);
			 d.inscrire(fifi);
			 d.inscrire(toto);
			 d.inscrire(riri);
			 
			 d.dinscrire(toto);
			 
			 e.notes.add(new Note(new Material("sgbd",3),11));
			 e.notes.add(new Note(new Material("poo",3),13));
			 e.notes.add(new Note(new Material("prp",2),19));
			 e.notes.add(new Note(new Material("marketing",1),18));
			 
				double moyen =  e.calculerMoyenne();
				
				System.out.println("e student moyen is:"+moyen);

			 
			 
		 }

}
