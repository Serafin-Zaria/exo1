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
				
				
				
				EtudiantTelescopique e1nomPrenom = new EtudiantTelescopique("Nesrine","tabbi anneni");
				EtudiantTelescopique e2nomPrenomDateNais  = new EtudiantTelescopique("Nesrine","tabbi anneni",maDate);
				EtudiantTelescopique e3nomPrenomMail = new EtudiantTelescopique("Nesrine","tabbi anneni","tabbinisrin@gmail.com");

				System.out.println(e1nomPrenom.toString());
				
			 
				Etudiant1 etudiant1 = new Etudiant1.EtudiantBuilder("Lokesh", "Gupta",maDate)
						.adresse_mail("nesrine@gmail.com")
						.adresse_postale("Fake address 1234")
						.build();
						System.out.println(etudiant1);
				
		 }

}

//q3 , no it is not possible because there is already a constructor with same parameters number and types
// q4 the advantage of the new solution is that we only need to create one constructor where,
//and the cons are, we have to set the attributes after creating an object of student.meaning
//if we want to create an object with specific attributes set while creating with one constructor 
//only we can't do that.










