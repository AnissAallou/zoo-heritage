package appli;


import zoo.Animal;
import zoo.Mammifere;
import zoo.Poisson;
import zoo.Reptile;
import zoo.Volatile;
import zoo.Zoo;

public class Main {
	
	public static void main(String[] args) {
		
		// On instancie notre classe Zoo
		Zoo zoophilie = new Zoo(); 
        
		// implémentation de la méthode mise en place dans la classe Zoo
        zoophilie.addPetToZone(new Mammifere("Daktari", "Lion", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Mammifere("Clodette", "Lion", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Mammifere("Fifille", "Antilope", Animal.ALIMENT_HERBIVORE));
        zoophilie.addPetToZone(new Mammifere("Zebrin", "Zèbre", Animal.ALIMENT_HERBIVORE));
        zoophilie.addPetToZone(new Poisson("Mangetout", "Requin", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Poisson("Marinette", "Morue", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Reptile("Rapacien", "Anaconda", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Reptile("Boate", "Boa", Animal.ALIMENT_CARNIVORE));
        zoophilie.addPetToZone(new Volatile("Picorette", "Colibri", Animal.ALIMENT_OMNIVORE));
        zoophilie.addPetToZone(new Volatile("Panachou", "Héron", Animal.ALIMENT_OMNIVORE));


        
        System.out.println(zoophilie.toString());
	}

}
