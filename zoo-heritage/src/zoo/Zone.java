package zoo;
import java.util.Arrays;

public class Zone {
	
	private String nom = null; 
	private Animal[] pets = null;
	
	public Zone(String nom) {

		this.nom = nom;

	}
	
	public Zone(String nomZoo, Zone[] zones, String nom) {
		super();
		this.nom = nom;

	}
	
	public void addPet(Animal animal) {	
		if( pets != null ) {
			Animal [] petsProvisoire = new Animal [pets.length+1];
			
			for(int i = 0 ; i<pets.length; i++) {
				petsProvisoire[i]=pets[i];
			}
			petsProvisoire[petsProvisoire.length-1] = animal;
			
			pets = petsProvisoire;
			
		} else {
			pets = new Animal[1];
			pets[0] = animal;
		}
	}
		
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Animal[] getAnimaux() {
		return pets;
	}


	public void setAnimaux(Animal[] pets) {
		this.pets = pets;
	}
	
	@Override 
	public String toString() {
		return "Zone " + nom + ", " + Arrays.toString(pets) + "\n\r";
	}
	




}
