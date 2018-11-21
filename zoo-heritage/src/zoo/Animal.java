package zoo;

public abstract class Animal {
	 
	public String nom;
	public String type; 
	String regimeAlimentaire;
	
	public static String ALIMENT_CARNIVORE = "Carnivore";
	public static String ALIMENT_HERBIVORE = "Herbivore";
	public static String ALIMENT_OMNIVORE = "Omnivore";
	
	public Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom; 
		this.type = type; 
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	
	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}
	
	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}
	
	
	protected String getNom() {
		return nom;
	}


	protected void setNom(String nom) {
		this.nom = nom;
	}


	protected String getType() {
		return type;
	}


	protected void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return nom + " sa race : " + type + ", son régime alimentaire : " + regimeAlimentaire ;
	}

	

}
