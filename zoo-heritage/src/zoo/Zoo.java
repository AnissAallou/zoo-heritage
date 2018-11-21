package zoo;

import java.util.Arrays;

public class Zoo {
	private String nom = "Le Zoo c'est de l'eau";

	public Zone [] zones = new Zone [5];
	
	public static final int ZONE_CARNIVORE = 0;
	public static final int ZONE_AFRICAINE = 1;
	public static final int ZONE_REPTILE = 2;
	public static final int ZONE_AQUARIUM = 3;
	public static final int ZONE_VOLATILE = 4;
	
	public Zoo() {
		zones[ZONE_CARNIVORE] = new Zone(nom, zones, "Zone Carnivore");
		zones[ZONE_AFRICAINE] = new Zone(nom, zones, "Zone Africaine");
		zones[ZONE_REPTILE] = new Zone(nom, zones, "Zone Reptile");
		zones[ZONE_AQUARIUM] = new Zone(nom, zones, "Zone Aquarium");
		zones[ZONE_VOLATILE] = new Zone(nom, zones, "Zone Volatile");
	}

	
	public Zoo(String nom, Zone [] zones) {
		this.nom = nom;
		this.zones = zones;
	}

	public void addPetToZone(Animal pet) {
		

	if(pet instanceof Mammifere) {
		if(pet.getRegimeAlimentaire().equals(Animal.ALIMENT_CARNIVORE)){
			zones[ZONE_CARNIVORE].addPet(pet);
		}
		else if(pet.getRegimeAlimentaire().equals(Animal.ALIMENT_HERBIVORE)){
			zones[ZONE_AFRICAINE].addPet(pet);
		}		
	}
	else if(pet instanceof Reptile) {
		zones[ZONE_REPTILE].addPet(pet);
	}
	else if(pet instanceof Poisson) {
		zones[ZONE_AQUARIUM].addPet(pet);
	}
		
}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zone) {
		this.zones = zone;
	}

	@Override
	public String toString() {
		return nom + ", zones=" + Arrays.toString(zones) ;
	}


	

}