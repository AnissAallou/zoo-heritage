package zoo;

public abstract class Animal {
	 
	public String nom = null;
	public String type = null; 
	String regimeAlimentaire = null;
	
	public static final String ALIMENT_CARNIVORE = "Carnivore";
	public static final String ALIMENT_HERBIVORE = "Herbivore";
	public static final String ALIMENT_OMNIVORE = "Omnivore";
	
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
		return nom + " est un animal de type=>" + type + ", et il est " + regimeAlimentaire ;
	}

	

}
