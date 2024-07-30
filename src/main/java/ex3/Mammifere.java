package ex3;

public class Mammifere extends Animal
{
	/**
     * Constructeur sans comportement
     * 
     * @param nom	nom de l'espèce
     */
    public Mammifere(String nom)
    {
        super(nom);
    }
    
    /**
     * Constructeur avec comportement
     * 
     * @param nom	nom de l'espèce
     * @param comportement	comportement alimentaire
     */
    public Mammifere(String nom, Comportement comportement)
    {
        super(nom, comportement);
    }
}
