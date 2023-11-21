package dz.Biskra.Info.exo2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DepartementTest {

	@Test
	public void test_calculeMoyenPromo_return_0_if_noStudents() {
			 
			Departement d = new Departement("Informatique","university Mohamed Khider Biskra");
			assertEquals(0,d.getMoyennePromo(),0.01);
	}
	
	@Test
	public void test_calculeMoyenPromo_return_valeur_moyen_if_onlyOneStudent() {
			 
			Departement d = new Departement("Informatique","university Mohamed Khider Biskra");
			 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",LocalDate.of(2001, Month.NOVEMBER, 6));		 
			 e.notes.add(new Note(new Material("sgbd",3),11));
			 e.notes.add(new Note(new Material("poo",3),13));
			 e.notes.add(new Note(new Material("prp",2),19));
			 e.notes.add(new Note(new Material("marketing",1),18));
			 d.inscrire(e);
			assertEquals(14.2222,d.getMoyennePromo(),0.01);
	}
	
	@Test
	public void test_calculeMoyenPromo_return_moyen_allStudents() {
			 
			Departement d = new Departement("Informatique","university Mohamed Khider Biskra");
			 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",LocalDate.of(2001, Month.NOVEMBER, 6));		 
			 e.notes.add(new Note(new Material("sgbd",3),11));
			 e.notes.add(new Note(new Material("poo",3),13));
			 e.notes.add(new Note(new Material("prp",2),19));
			 e.notes.add(new Note(new Material("marketing",1),18));
			 d.inscrire(e);
			 Etudiant e1 = new Etudiant("Ilham","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",LocalDate.of(2001, Month.NOVEMBER, 6));		 
			 e1.notes.add(new Note(new Material("sgbd",3),10));
			 e1.notes.add(new Note(new Material("poo",3),9));
			 e1.notes.add(new Note(new Material("prp",2),14));
			 e1.notes.add(new Note(new Material("marketing",1),11));
			 d.inscrire(e1);
			 double expectedDepartementMoyen = (14.2222+10.6666667)/2.0;
			assertEquals(expectedDepartementMoyen,d.getMoyennePromo(),0.01);
	}

}
