package dz.Biskra.Info.exo2;

public class Material {
	private String intitule;
	private float coef;
	public Material(String intitule, float coef) {
		super();
		this.intitule = intitule;
		this.coef = coef;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public float getCoef() {
		return coef;
	}
	public void setCoef(float coef) {
		this.coef = coef;
	}
	
	
}
