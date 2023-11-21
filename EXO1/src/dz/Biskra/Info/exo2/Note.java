package dz.Biskra.Info.exo2;

public class Note {
    private Material material;
	private float note;
	public Note(Material material, float note) {
		super();
		this.material = material;
		this.note = note;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	
	
	
}
