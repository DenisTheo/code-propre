package ex2;

/**
 * Représente la gestion des finances d'un LivretA
 * 
 * @author Théo DENIS
 */
public final class LivretA extends CompteBancaire
{
	/** taux de rémunération du livret (en pourcents) */
	private double tauxRemuneration;
	
	/**
	 * Constructeur principal
	 * 
	 * @param solde	solde initial
	 * @param tauxRemuneration	taux de rémunération du livret
	 */
	public LivretA(double solde, double tauxRemuneration)
	{
		super(solde);
		setTauxRemuneration(tauxRemuneration);
	}

	/** 
	 * Retire un montant au solde (si possible)
	 * 
	 * @param montant	montant à débier
	 */
	public void debiterMontant(double montant)
	{
		if (getSolde()-montant > 0)
			setSolde(getSolde()-montant);
	}
	
	/**
	 * Applique la rémunération annuelle et l'ajoute au solde
	 */
	protected void appliquerRemuAnnuelle()
	{
		setSolde(getSolde()*tauxRemuneration/100);
	}

	/**
	 * Getter de tauxRemuneration
	 * 
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration()
	{
		return tauxRemuneration;
	}
	
	/**
	 * Setter de tauxRemuneration
	 * 
	 * @param tauxRemuneration	nouveau taux
	 */
	public void setTauxRemuneration(double tauxRemuneration)
	{
		this.tauxRemuneration = tauxRemuneration;
	}
}
