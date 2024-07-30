package ex3;

/**
 * Représente la zone Aquarium d'un Zoo
 */
public class Aquarium extends Zone
{
	/**
	 * Constructeur principal
	 * 
	 * @param nom	le nom de la zone
	 * @param consommationNourriture	la consommation de nourriture par animal dans la zone, en Kg
	 */
	public Aquarium(String nom, double consommationNourriture)
	{
		super(nom, consommationNourriture);
		setConsommationNourriture(consommationNourriture);
	}

	@Override
	public boolean animalCorrespondZone(Animal animal)
	{
		if(animal instanceof Poisson)
			return true;
		
		return false;
	}
}
