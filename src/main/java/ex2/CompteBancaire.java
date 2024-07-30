package ex2;

/**
 * Représente un compte bancaire de type
 * 
 * @author Théo DENIS
 */
public abstract class CompteBancaire
{
	/** solde actuel du compte */
	private double solde;
	
	/**
	 * Constructeur principal
	 * 
	 * @param solde	solde initial
	 */
	public CompteBancaire(double solde)
	{
		setSolde(solde);
	}
	
	/**
	 * Ajoute un montant au solde 
	 * 
	 * @param montant	montant àajouter
	 */
	public void ajouterMontant(double montant)
	{
		setSolde(getSolde()+montant);
	}
	
	/**
	 * Retire un montant au solde (si possible)
	 * 
	 * @param montant	montant à retirer
	 */
	public abstract void debiterMontant(double montant);
	
	/**
	 * Getter de solde
	 * 
	 * @return solde
	 */
	public double getSolde()
	{
		return solde;
	}
	
	/**
	 * Setter de Solde
	 * 
	 * @param solde	le nouveau solde
	 */
	public void setSolde(double solde)
	{
		this.solde = solde;
	}
}
