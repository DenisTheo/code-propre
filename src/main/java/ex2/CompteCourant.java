package ex2;

/**
 * Représente un compte bancaire
 * 
 * @author Théo DENIS
 */
public final class CompteCourant extends CompteBancaire
{
	/** solde du compte */
	private double solde;
	
	/** un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * Constructeur principal
	 * 
	 * @param solde	solde initial
	 * @param decouvert	découvert autorisé
	 */
	public CompteCourant(double solde, double decouvert)
	{
		super(solde);
		setDecouvert(decouvert);
	}
	
	/**
	 * Retire un montant au solde (si possible)
	 * 
	 * @param montant	montant à débiter
	 */
	public void debiterMontant(double montant)
	{
		if (this.solde - montant > decouvert)
			this.solde = solde - montant;
	}
	
	/**
	 * Getter de decouvert
	 * 
	 * @return decouvert
	 */
	public double getDecouvert()
	{
		return decouvert;
	}
	
	/**
	 * Setter de découvert
	 * 
	 * @param decouvert	nouvelle limite de découvert
	 */
	public void setDecouvert(double decouvert)
	{
		this.decouvert = decouvert;
	}
}
