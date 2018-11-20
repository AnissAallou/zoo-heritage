package appli;

import java.util.Scanner;
import zoo.Mammifere;
import zoo.Poisson;
import zoo.Reptile;
import zoo.Volatile;
import zoo.Zoo;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zoo zoo = new Zoo("Zoophilie"); 
		
		zoo.ajouteAnimal(new Mammifere("Daktari", "Lion", Mammifere.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Mammifere("Clodette", "Lion", Mammifere.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Mammifere("Fifille", "Antilope", Mammifere.ALIMENT_HERBIVORE));
		zoo.ajouteAnimal(new Mammifere("Zebrin", "Zèbre", Mammifere.ALIMENT_HERBIVORE));
		zoo.ajouteAnimal(new Poisson("Mangetout", "Requin", Poisson.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Poisson("Marinette", "Morue", Poisson.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Reptile("Rapacien", "Anaconda", Reptile.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Reptile("Boate", "Boa", Reptile.ALIMENT_CARNIVORE));
		zoo.ajouteAnimal(new Volatile("Picorette", "Colibri", Volatile.ALIMENT_OMNIVORE));
		zoo.ajouteAnimal(new Volatile("Panachou", "Héron", Volatile.ALIMENT_OMNIVORE));

		System.out.println(zoo.toString());
	}

}
