package ex1;

import java.util.Date;

/**
 * Représente certaines données légales liées à un Entreprise
 * 
 * @author Théo DENIS
 */
public class Entreprise
{
	/** numéro de Siret */
	public int siret;
	/** nom légal de l'entreprise */
	public String nom;
	/** adresse légale de l'entreprise */
	public String adresse;
	/** date de création de l'entreprise */
	public Date dateCreation;
	
	/** limite haute pour la valeur du capital */
	public static final int capitalMax = 3000000;
	
	/**
	 * Affiche le statut actuel (non implémenté)
	 */
	public void Afficher_statut()
	{
		// TODO: corps de méthode
	}
}
