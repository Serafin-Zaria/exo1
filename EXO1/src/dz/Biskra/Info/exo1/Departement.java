package dz.Biskra.Info.exo1;

import java.util.ArrayList;

public class Departement {
	
	private String  specialty, adresse;
	ArrayList<Etudiant> studentList = null;
	public Departement(String specialty, String adresse) {
		super();
		this.specialty = specialty;
		this.adresse = adresse;
	}
	
	public String toString() {
		String studentsNames = null;
		
		for(int i=0;i<studentList.size();i++) {
			studentsNames.concat(" ,"+studentList.get(i).getNom());
			
		}
		
		return studentsNames ;
		
	}
	
	public void inscrire(Etudiant e) {
		studentList.add(e);
	}

	public void dinscrire(Etudiant e) {
		studentList.remove(e);
	}
}
