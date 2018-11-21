package zoo;

public abstract class Animal {
	 
	public String nom;
	public String type; 
	String regimeAlimentaire;
	
	
	// On déclare des variables de classe
	
	public static String ALIMENT_CARNIVORE = "Carnivore";
	public static String ALIMENT_HERBIVORE = "Herbivore";
	public static String ALIMENT_OMNIVORE = "Omnivore";
	
	// Constructeur Portugais 
	
	public Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom; 
		this.type = type; 
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	// getters
	
	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}
	
	protected String getNom() {
		return nom;
	}
	
	protected String getType() {
		return type;
	}
	
	// setters
	
	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	protected void setNom(String nom) {
		this.nom = nom;
	}
	
	protected void setType(String type) {
		this.type = type;
	}
	

	// méthode de surcharge pour retourner le nom, le type ainsi que le régime alimentaire
	
	@Override
	public String toString() {
		return nom + " sa race : " + type + ", son régime alimentaire : " + regimeAlimentaire ;
	}

	

}
