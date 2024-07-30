package ex3;

/**
 * Représente la zone Savane Africaine d'un Zoo
 */
public class SavaneAfricaine extends Zone
{
	/**
	 * Constructeur principal
	 * 
	 * @param nom	le nom de la zone
	 * @param consommationNourriture	la consommation de nourriture par animal dans la zone, en Kg
	 */
	public SavaneAfricaine(String nom, double consommationNourriture)
	{
		super(nom, consommationNourriture);
		setConsommationNourriture(consommationNourriture);
	}

	@Override
	public boolean animalCorrespondZone(Animal animal)
	{
		if(animal instanceof Mammifere && animal.getComportement() == Comportement.HERBIVORE)
			return true;
		
		return false;
	}
}
