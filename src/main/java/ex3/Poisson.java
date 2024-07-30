package ex3;

public class Poisson extends Animal
{
	/**
     * Constructeur sans comportement
     * 
     * @param nom	nom de l'espèce
     */
    public Poisson(String nom)
    {
        super(nom);
    }
    
    /**
     * Constructeur avec comportement
     * 
     * @param nom	nom de l'espèce
     * @param comportement	comportement alimentaire
     */
    public Poisson(String nom, Comportement comportement)
    {
        super(nom, comportement);
    }
}
