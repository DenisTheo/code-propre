package ex3;

/**
 * Représente la zone Carnivore d'un Zoo
 */
public class ZoneCarnivore extends Zone
{
	/**
	 * Constructeur principal
	 * 
	 * @param nom	le nom de la zone
	 * @param consommationNourriture	la consommation de nourriture par animal dans la zone, en Kg
	 */
	public ZoneCarnivore(String nom, double consommationNourriture)
	{
		super(nom, consommationNourriture);
		setConsommationNourriture(consommationNourriture);
	}

	@Override
	public boolean animalCorrespondZone(Animal animal)
	{
		if(animal instanceof Mammifere && animal.getComportement() == Comportement.CARNIVORE)
			return true;
		
		return false;
	}
}
