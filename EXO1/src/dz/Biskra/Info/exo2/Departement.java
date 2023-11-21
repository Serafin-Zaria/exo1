package dz.Biskra.Info.exo2;

import java.util.ArrayList;

public class Departement {
	
	private String  specialty, adresse;
	ArrayList<Etudiant> studentList = new ArrayList<>();
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
	
	public double getMoyennePromo() {
		double sum = 0;
		for(int i=0;i<studentList.size();i++) {
			sum =sum + studentList.get(i).calculerMoyenne();
		}
		
		if(studentList.isEmpty()) {
			return 0;
		}
		
		return (sum/studentList.size());
	}
}
















