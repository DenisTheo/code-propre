package ex1;

/**
 * Classe servant à effectuer des calculs simples
 * 
 * @author Théo DENIS
 */
public class Calcul
{
	
	/**
	 * Calcul la somme de deux entiers
	 * 
	 * @param termeA	
	 * @param termeB	
	 * 
	 * @return	La somme des deux termes
	 */
	public int addition(int termeA, int termeB)
	{
		return termeA + termeB;
	}
	
	/**
	 * Calcul la différence entre deux entiers
	 * 
	 * @param termeA	
	 * @param termeB	
	 * 
	 * @return	La différence entre les deux termes (dans l'ordre B-A)
	 */
	public int soustraction(int termeA, int termeB)
	{
		return termeA - termeB;
	}
}
