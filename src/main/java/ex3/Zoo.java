package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un Zoo avec des animaux triés par zone
 */
public class Zoo
{
	/** le nom du Zoo */
	private String nom;
	/** la liste des zones du zoo */
	private List<Zone> zones;
	
	/**
	 * Constructeur principal
	 * 
	 * @param nom	le nom du Zoo
	 */
	public Zoo(String nom)
	{
		setNom(nom);
		zones = new ArrayList<Zone>();
	}
	
	/**
	 * Ajoute l'animal à la première zone de la liste l'acceptant. Si aucune ne l'accepte, il n'est pas ajouté
	 * 
	 * @param animal	l'animal à ajouter
	 */
	public void addAnimal(Animal animal)
	{
		boolean valide = false;
		int index = 0;
		
		do
		{
			valide = zones.get(index).addAnimal(animal);
			index++;
		}while(valide == false && index < zones.size());
		
		if(valide)
			System.out.println("L'animal a été ajouté à " + zones.get(--index).getNom());
		else
			System.out.println("L'animal n'a pu être ajouté à aucune zone");
	}
	
	/**
	 * Affiche la liste des animaux de chaque zone
	 */
	public void afficherListeAnimaux()
	{
		for(Zone zone: zones)
		{
			System.out.println(zone.getNom() + ':');
			zone.afficherListeAnimaux();
		}
	}
	
	/**
	 * Affiche la consommation de nourriture par jour pour chaque zone du Zoo
	 */
	public void afficherConsomamtionNourriture()
	{
		for(Zone zone: zones)
			System.out.println("Consommation de " + zone.getNom() + ": " + zone.calculerKgsNourritureParJour() + "Kg de nourriture par jour.");
	}
	
	/**
	 * Ajoute la zone spécifiée à la liste des zones du Zoo
	 * 
	 * @param zone	la zone à ajouter
	 */
	public void addZone(Zone zone)
	{
		zones.add(zone);
	}

	/**
	 * Getter de nom
	 * 
	 * @return le nom du zoo nom
	 */
	public String getNom()
	{
		return nom;
	}

	/** 
	 * Setter de nom
	 * 
	 * @param nom	le nom à assigner au zoo
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	/**
	 * Getter de zones
	 * 
	 * @return la liste des zones du zoo
	 */
	public List<Zone> getZones()
	{
		return zones;
	}
}
