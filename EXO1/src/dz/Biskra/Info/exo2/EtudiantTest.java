package dz.Biskra.Info.exo2;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import dz.Biskra.Info.exo2.Etudiant;

public class EtudiantTest {

	
	@Test
	public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
		 LocalDate maDate = LocalDate.of(2001, Month.NOVEMBER, 6);

		 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",maDate);		 
		double moyen =  e.calculerMoyenne();
		assertEquals(0,moyen,0.001); 		
		
	}
	
	@Test
	public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note() {
		 LocalDate maDate = LocalDate.of(2001, Month.NOVEMBER, 6);
		 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",maDate);		 
		 e.notes.add(new Note(new Material("poo",3),13));

		 double moyen =  e.calculerMoyenne();
		assertEquals(13,moyen,0.001); 		
	}
	
	
	@Test
	public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
		 LocalDate maDate = LocalDate.of(2001, Month.NOVEMBER, 6);
		 Etudiant e = new Etudiant("nesrine","Tabbi Anneni","tabbinisrin@gmail.com","Rue sovia 2534",maDate);		 
		 e.notes.add(new Note(new Material("sgbd",3),11));
		 e.notes.add(new Note(new Material("poo",3),13));
		 e.notes.add(new Note(new Material("prp",2),19));
		 e.notes.add(new Note(new Material("marketing",1),18));
		 double moyen =  e.calculerMoyenne();
		assertEquals(14.22,moyen,0.01); 		
	}
		


}
