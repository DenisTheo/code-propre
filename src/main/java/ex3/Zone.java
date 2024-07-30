package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente la zone réservée aux animaux carnivores d'un Zoo
 */
public abstract class Zone
{
	/** nom de la zone */
	private String nom;
	/** liste des animaux de la zone */
	private List<Animal> animaux;
	/** nourriture consommée par animal en Kg */
	private double consommationNourriture = 0;
	
	/**
	 * Constructeur sans taux de consommation de nourriture (initialisé à 0)
	 * 
	 * @param nom nom de la zone
	 */
	public Zone(String nom)
	{
		setNom(nom);
		animaux = new ArrayList<Animal>();
	}
	
	/**
	 * Constructeur avec taux de consommation de nourriture
	 * 
	 * @param nom	nom de la zone
	 * @param comsommationNourriture	nourriture consommée par animal en Kg
	 */
	public Zone(String nom, double comsommationNourriture)
	{
		this(nom);
		
	}
	
	/**
	 * Adds an animal to an area
	 * 
	 * @param animal	l'animal à ajouter à la zone
	 * @return vrai si l'animal a pu être ajouté, faux sinon
	 */
	public boolean addAnimal(Animal animal)
	{
		boolean correspond = animalCorrespondZone(animal);
		
		if(correspond)
			animaux.add(animal);
		
		return correspond;
	}
	
	/**
	 * Dit si un animal correspond aux critères de la Zone
	 * 
	 * @param animal	animal à tester
	 * @return	vrai si l'animal peut vivre dans la zone, faux sinon
	 */
	public abstract boolean animalCorrespondZone(Animal animal);
	
	/**
	 * Affiche la liste des animaux de la zone
	 */
	public void afficherListeAnimaux()
	{
		for (Animal animal: animaux)
			System.out.println(animal.toString());
	}
	
	/**
	 * Calcul la consommation journalière de nourriture par les animaux de la zone
	 * 
	 * @return la quantité de nourriture nécessaire au fonctionnement de la zone en Kg
	 */
	public double calculerKgsNourritureParJour()
	{
		return animaux.size() * consommationNourriture;
	}
	
	/**
	 * Getter de nom
	 * 
	 * @return le nom de la zone
	 */
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Setter de nom
	 * 
	 * @param nom	le nom de la zone
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Getter de consommationNourriture
	 * 
	 * @return la quantité de nourriture consommée par animal en Kg
	 */
	public double getConsommationNourriture()
	{
		return consommationNourriture;
	}
	
	/**
	 * Setter de consommationNourriture
	 * 
	 * @param consommationNourriture	la quantité de nourriture consommée par animal en Kg
	 */
	public void setConsommationNourriture(double consommationNourriture)
	{
		this.consommationNourriture = consommationNourriture;
	}
}
