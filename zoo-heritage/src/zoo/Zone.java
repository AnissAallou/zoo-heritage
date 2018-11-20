package zoo;
import java.util.Arrays;

public class Zone {
	
	private String nom = null; 
	private Animal[] animaux = null;
	
	public Zone(String nom) {
		super();
		this.nom = nom;
		this.animaux = null;	
	}
	
	public void ajouteNouvelAnimal(Animal nouvelAnimal) {

		
		if (animaux == null) {
			animaux = new Animal[1];
			animaux[0] = nouvelAnimal;
		} else {
			Animal[] nouveauxAnimaux = new Animal[animaux.length-1];
			int i = 0;
			for (Animal animal : animaux) {
				nouveauxAnimaux[i] = animal;
				i++;
			}
			nouveauxAnimaux[animaux.length] = nouvelAnimal;
			this.animaux = nouveauxAnimaux;
		}
	}
		
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override 
	public String toString() {
		return "Zone " + nom + ", " + Arrays.toString(animaux) + "\n\r";
	}
	
	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}



}
