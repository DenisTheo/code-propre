package ex3;

public class Reptile extends Animal
{
	/**
     * Constructeur sans comportement
     * 
     * @param nom	nom de l'espèce
     */
    public Reptile(String nom)
    {
        super(nom);
    }
    
    /**
     * Constructeur avec comportement
     * 
     * @param nom	nom de l'espèce
     * @param comportement	comportement alimentaire
     */
    public Reptile(String nom, Comportement comportement)
    {
        super(nom, comportement);
    }
}
