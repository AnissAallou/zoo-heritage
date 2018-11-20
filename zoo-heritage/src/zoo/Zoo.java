package zoo;

import java.util.Arrays;


public class Zoo {
	private String nom;
	private static Zone[] zones = new Zone[5];
	
	//public static final int INDICE_SAVANE_AFRICAINE = 0;
	// public static final int INDICE_CARNIVORE = 0;
	// public static final int INDICE_AQUARIUM = 0;
	// public static final int INDICE_FERME_REPTILE = 0;
	// public static final int INDICE_VOLIERE = 0;

	{
		zones[0] = new Zone("savane africaine");
		zones[1] = new Zone("carnivore");
		zones[2] = new Zone("ferme reptile");
		zones[3] = new Zone("aquarium");
		zones[4] = new Zone("voliere");
		
	}
	
	public Zoo(String nom) {
		super(); 
		this.nom = nom;
		
		// zones[INDICE_SAVANE_AFRICAINE] = new Zone("Savane africaine");
		// zones[INDICE_CARNIVORE] = new Zone("Carnivore");
		// zones[INDICE_AQUARIUM] = new Zone("Aquarium");
		// zones[INDICE_FERME_REPTILE] = new Zone("Ferme aux reptiles");
		// zones[INDICE_VOLIERE] = new Zone("Volière");
	}
	//• La classe Zoo doit disposer d’une méthode addAnimal permettant d’ajouter un animal au Zoo.
	// o Si l’animal est un carnivore et un mammifère alors il est ajouté à la zone carnivore
	// o Si l’animal est un herbivore et un mammifère alors il est ajouté à la savane africaine
	// o Si l’animal est un reptile il est ajouté à la ferme aux reptiles
	// o Enfin si c’est un poisson il est ajouté à l’aquarium
	// • Ajoutez une méthode listerAnimaux à la classe Zoo qui pemet de lister les animaux du Zoo

	
	public void ajouteAnimal(Animal nouvelAnimal) { 
		if(nouvelAnimal instanceof Mammifere && nouvelAnimal.getRegimeAlimentaire().equals("carnivore") ) {
			
			zones[1].ajouteNouvelAnimal(nouvelAnimal);
		} else if(nouvelAnimal instanceof Mammifere && nouvelAnimal.getRegimeAlimentaire().equals("herbivore") ) {
			zones[0].ajouteNouvelAnimal(nouvelAnimal);
			
		} else if(nouvelAnimal instanceof Reptile) {
			zones[2].ajouteNouvelAnimal(nouvelAnimal);
			
		} else if(nouvelAnimal instanceof Poisson) {
			zones[3].ajouteNouvelAnimal(nouvelAnimal);
			
		} else if(nouvelAnimal instanceof Volatile) {
			zones[4].ajouteNouvelAnimal(nouvelAnimal);
			
		}
	}
	


}