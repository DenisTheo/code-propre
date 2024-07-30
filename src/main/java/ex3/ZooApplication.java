package ex3;

public class ZooApplication
{
	/**
	 * Crée un Zoo et le rempli d'animaux
	 * 
	 * @param args	data passé en arguments
	 */
	public static void main(String[] args)
	{
		// Initialisation du Zoo
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addZone(new SavaneAfricaine("la zone Savane Africaine", 10));
		zoo.addZone(new ZoneCarnivore("la Zone Carnivore", 10));
		zoo.addZone(new FermeReptile("la Ferme aux Reptiles", 0.1));
		zoo.addZone(new Aquarium("l'Aquarium", 0.2));
		
		// Remplissage du zoo
		zoo.addAnimal(new Mammifere("Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Poisson("Truite dorée", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Panthère", Comportement.CARNIVORE));
		zoo.addAnimal(new Mammifere("Zèbre", Comportement.HERBIVORE));
		zoo.addAnimal(new Poisson("Requin blanc", Comportement.CARNIVORE));
		zoo.addAnimal(new Mammifere("Lion", Comportement.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor", Comportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Python", Comportement.CARNIVORE));

		zoo.afficherListeAnimaux();
		zoo.afficherConsomamtionNourriture();
	}
}
