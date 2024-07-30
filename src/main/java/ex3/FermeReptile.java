package ex3;

/**
 * Représente la zone Ferme de Reptiles d'un Zoo
 */
public class FermeReptile extends Zone
{
	/**
	 * Constructeur principal
	 * 
	 * @param nom	le nom de la zone
	 * @param consommationNourriture	la consommation de nourriture par animal dans la zone, en Kg
	 */
	public FermeReptile(String nom, double consommationNourriture)
	{
		super(nom, consommationNourriture);
		setConsommationNourriture(consommationNourriture);
	}

	@Override
	public boolean animalCorrespondZone(Animal animal)
	{
		if(animal instanceof Reptile)
			return true;
		
		return false;
	}
}
